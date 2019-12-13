package com.beyene.manifestmaker;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public class App extends JFrame implements ActionListener
{
    private ImageIcon img;
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;
    private JScrollPane startPane;
    private JPanel startPanel;
    private JScrollPane rosterPane;
    private JScrollPane vehiclePane;
    private JPanel contactPanel;
    private JScrollPane contactPane;
    private JTable contactTable;
    private JPanel alertPanel;
    private ManifestPane [] manifestPanes;
    private JTable rosterTable;
    private JTable vehicleTable;
    private JButton loadCompanyManifestButton;
    private JButton loadVehicleListButton;
    private JButton loadContactsButton;
    private JButton manifestButton;
    private JButton defaultsButton;
    private JFileChooser fc;
    private File file;
    private File contactsFile;
    private JButton getOpenButton;
    private JPanel buttonPanel;

    private static int manifestTabs = 11;
    private int manifestTabsCount;
    private boolean xls = false;
    private boolean xlsx = false;
    private boolean rosterLoaded = false;
    private boolean vehiclesLoaded = false;

    private ArrayList<String> colArray;
    private static ArrayList<ArrayList> allArray;
    private static ArrayList<Record> allRecords;
    private static ArrayList<Record> usedRecords;
    private static ArrayList<Record> crwbRecords;
    private static ArrayList<Record> fft1Records;
    private static ArrayList<Record> fft2Records;
    private static ArrayList<Record> driverRecords;
    private ArrayList<String> colArrayVehicles;
    private static ArrayList<ArrayList> allVehicles;
    private static ArrayList<Vehicle> vehicleRecords;
    private ArrayList<String> colArrayContacts;
    private static ArrayList<ArrayList> allContacts;
    private ArrayList<String> selectedContacts;

    private static int selectedCall = -1;
    private ArrayList<String> URIStrings;
    private ArrayList<String> URINames;


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == loadCompanyManifestButton)
        {
            int retVal = fc.showOpenDialog(App.this);

            if (retVal == JFileChooser.APPROVE_OPTION)
            {
                file = fc.getSelectedFile();
                if(file.toString().endsWith(".xls"))
                    xls = true;
                else if(file.toString().endsWith(".xlsx"))
                    xlsx = true;
                else
                    JOptionPane.showMessageDialog(App.this, "Final Company Manifest Required\n Format must follow instructions on sheet 1", "Bad File", JOptionPane.INFORMATION_MESSAGE);

                if(xls || xlsx)
                {
                    if(rosterView(file))
                    {
                        rosterLoaded = true;
                        loadCompanyManifestButton.setEnabled(false);
                        manifestButton.setEnabled(true);
                    }
                    else
                        JOptionPane.showMessageDialog(App.this, "Final Company Manifest Required\nFound at www.oregon.gov/ODF/Fire/Pages/Contract.aspx... Format must follow instructions on sheet 1", "Bad File", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            xls = xlsx = false;
        }
        if(e.getSource() == loadVehicleListButton)
        {
            int retVal = fc.showOpenDialog(App.this);

            if (retVal == JFileChooser.APPROVE_OPTION)
            {
                file = fc.getSelectedFile();
                if(file.toString().endsWith(".xlsx") && loadVehicles(allVehicles))
                {
                    vehiclesLoaded = true;
                    loadVehicleListButton.setEnabled(false);
                }
                else
                    JOptionPane.showMessageDialog(App.this, "Vehicle List Required\nFound at www.oregon.gov/ODF/Fire/Pages/Contract.aspx", "Bad File", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if(e.getSource() == manifestButton)
        {
            if(rosterLoaded && vehiclesLoaded)
            {
                if(manifestTabsCount == 0)
                {
                    manifestButton.setText("Add Manifest Form");
                    manifestView();
                }
                else
                {
                    anotherManifestView();
                    if(manifestTabsCount == 10)
                        manifestButton.setEnabled(false);
                }
            }
            else
            {
                int sureInt = 0;
                sureInt = JOptionPane.showConfirmDialog(App.this,  "Manifest forms that are started before vehicles are loaded will require manual entry\nContinue without vehicles?", "Vehicles not Loaded", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(sureInt == 0)
                {
                    if(manifestTabsCount == 0)
                    {
                        manifestButton.setText("Add Manifest Form");
                        manifestView();
                    }
                    else
                    {
                        anotherManifestView();
                        if(manifestTabsCount == 10)
                            manifestButton.setEnabled(false);
                    }
                }
            }
        }

        if(e.getSource() == defaultsButton)
        {
            String contractor = "";
            String agreementNum = "";
            String contractorRep = "";
            String contactPhone = "";
            try(InputStream is = new FileInputStream("res\\config.properties")) {
                Properties prop = new Properties();
                prop.load(is);
                contractor = prop.getProperty("contractor");
                agreementNum = prop.getProperty("agreementNum");
                contractorRep = prop.getProperty("contractorRep");
                contactPhone = prop.getProperty("contactPhone");
            } catch (IOException ex) { ex.printStackTrace(); }

            try(OutputStream os = new FileOutputStream("res\\config.properties")) {
                Properties prop = new Properties();
                prop.setProperty("contractor", JOptionPane.showInputDialog(this, "Contractor: ", contractor));
                prop.setProperty("agreementNum", JOptionPane.showInputDialog(this, "Agreement Number: ", agreementNum));
                prop.setProperty("contractorRep", JOptionPane.showInputDialog(this, "Contractor Representative: ", contractorRep));
                prop.setProperty("contactPhone", JOptionPane.showInputDialog(this, "Contact Phone: ", contactPhone));
                prop.store(os, null);
            } catch (IOException io) { io.printStackTrace(); }
        }

        if(e.getSource() == loadContactsButton)
        {
            int retVal = fc.showOpenDialog(App.this);

            if (retVal == JFileChooser.APPROVE_OPTION)
            {
                contactsFile = fc.getSelectedFile();
                if(contactsFile.toString().endsWith(".xlsx") && loadContacts(allContacts))
                    loadContactsButton.setEnabled(false);
                else
                    JOptionPane.showMessageDialog(App.this, "Excel (.xlsx extension) \ncolumn 1: \"Name\" column 2: \"Phone\" Required", "Bad File", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void startView()
    {
        fc = new JFileChooser();
        loadVehicleListButton = new JButton("Load Vehicle List");
        loadVehicleListButton.setEnabled(true);
        loadVehicleListButton.addActionListener(this);
        loadCompanyManifestButton= new JButton("Load Company Manifest");
        loadCompanyManifestButton.addActionListener(this);
        manifestButton = new JButton("Start Manifest Form");
        manifestButton.addActionListener(this);
        manifestButton.setEnabled(false);
        defaultsButton = new JButton("Defaults");
        defaultsButton.addActionListener(this);
        loadContactsButton = new JButton("Load Contacts");
        loadContactsButton.addActionListener(this);
        buttonPanel = new JPanel();
        buttonPanel.add(loadContactsButton);
        buttonPanel.add(loadVehicleListButton);
        buttonPanel.add(loadCompanyManifestButton);
        buttonPanel.add(manifestButton);
        buttonPanel.add(defaultsButton);

        mainPanel = new JPanel(new BorderLayout());
        tabbedPane = new JTabbedPane();
        //tabbedPane.setPreferredSize(new Dimension(1400, 1000));
        startPanel = new JPanel();
        startPanel.setLayout(new GridLayout(4,1));
        img = new ImageIcon("res\\appIcon.jpg");
        JEditorPane editor = new JEditorPane();
        editor.setSize(1000, 10);
        editor.setText("\n1. Load contacts (an Excel spreadsheet where column two is phone numbers)\n\n\tClick and drag or hold 'ctrl' to select/deselect multiple rows\n\n" +
                "2. Load vehicles list (official Excel spreadsheet found on oregon.gov/odf)\n\n\tManifest forms that are started before vehicles are loaded will require manual entry\n\n" +
                "3. Load company manifest (official Excel spreadsheet which follows instructions on sheet 1)\n\n\tAdd up to 10 manifests - available records will update across all manifests\n\n" +
                "4. Fill a manifest form\n\n\tCompany information is saved in 'Defaults'\n\n" +
                "5. 'Finish' to export and open a fillable PDF\n\n\n\n" +
                "(THIS VERSION EXPIRES NOV-01-2019)\n\n\n" +
                "Copyright 2019 Bruh Beyene\n" +
                "bbeyene@gmail.com | github.com/bbeyene\n" +
                "\nUsing Apache POI and PDFBox\n\n" +
                "Licensed under the Apache License, Version 2.0 (the \"License\") you may not use this file except in compliance with the License. You may obtain a copy of the License at\n" +
                "\n" +
                "    http://www.apache.org/licenses/LICENSE-2.0\n" +
                "\n" +
                "Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, " +
                "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, " +
                "\neither expressed or implied. See the License for the specific language governing permissions and limitations under the License.");
        editor.setEditable(false);
        startPanel.setBackground(Color.WHITE);
        startPanel.add(editor );
        try
        {
            BufferedImage contactsSamplePic = ImageIO.read(new File("res\\contactsDemo.jpg"));
            BufferedImage vehiclesSamplePic = ImageIO.read(new File("res\\vehiclesDemo.jpg"));
            BufferedImage manifestSamplePic = ImageIO.read(new File("res\\manifestDemo.jpg"));

            Graphics2D g1 = (Graphics2D) contactsSamplePic.getGraphics();
            g1.setStroke(new BasicStroke(3));
            g1.setColor(Color.ORANGE);
            g1.drawRect(0,0,contactsSamplePic.getWidth(), contactsSamplePic.getHeight());
            Graphics2D g2 = (Graphics2D) vehiclesSamplePic.getGraphics();
            g2.setStroke(new BasicStroke(3));
            g2.setColor(Color.ORANGE);
            g2.drawRect(0,0,vehiclesSamplePic.getWidth(), vehiclesSamplePic.getHeight());
            Graphics2D g3 = (Graphics2D) manifestSamplePic.getGraphics();
            g3.setStroke(new BasicStroke(3));
            g3.setColor(Color.ORANGE);
            g3.drawRect(0,0,manifestSamplePic.getWidth(), manifestSamplePic.getHeight());

            JLabel contactsSampleLabel = new JLabel(new ImageIcon(contactsSamplePic));
            startPanel.add(contactsSampleLabel);
            JLabel vehiclesSampleLabel = new JLabel(new ImageIcon(vehiclesSamplePic));
            startPanel.add(vehiclesSampleLabel);
            JLabel manifestSampleLabel = new JLabel(new ImageIcon(manifestSamplePic));
            startPanel.add(manifestSampleLabel);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        startPane = new JScrollPane(startPanel);
        tabbedPane.add("START", startPane);

        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
    }
    public boolean rosterView(File file)
    {
        boolean retval = false;
        String filename;
        HSSFRead hReader;
        XSSFRead xReader;

        try
        {
            filename = file.getCanonicalPath();
            if(xls)
            {
                hReader = new HSSFRead(filename);
                colArray = new ArrayList<String>();
                allArray = hReader.populate(colArray);
            }
            else if(xlsx)
            {
                xReader = new XSSFRead(filename);
                colArray = new ArrayList<String>();
                allArray = xReader.populate(colArray, 1, 3);
            }
        } catch (Exception e) {e.printStackTrace();}

        if(allArray != null)
        {
            int i, j;

            String [][] rowStrings = new String[allArray.get(0).size()][allArray.size()];
            for(i = 0; i < allArray.get(0).size(); ++i)
            {
                for(j = 0; j < allArray.size(); ++j)
                {
                    rowStrings[i][j] = new String(allArray.get(j).get(i).toString());
                }
            }

            DefaultTableModel tableModel = new DefaultTableModel(rowStrings, colArray.toArray());
            rosterTable = new JTable(tableModel);

            rosterTable.setFont(new Font("consolas", Font.PLAIN, 14));
            rosterTable.setBackground(Color.decode("#78c9ff"));
            rosterTable.setDragEnabled(true);
            rosterTable.setRowHeight(30);
            rosterPane = new JScrollPane(rosterTable);
            rosterPane.setWheelScrollingEnabled(true);
            tabbedPane.add("ROSTER", rosterPane);
            return true;
        }
        else return false;
    }
    public void listToMaps()
    {
        int tempRecordNo;
        String tempName;
        String tempIdNo;
        String tempQual;
        String tempCertDate;
        String tempLsa;
        String tempSawyer;
        String tempMspaDate;
        Record tempRecord;
        int m = allArray.size();
        int n = allArray.get(0).size();
        allRecords = new ArrayList<Record>();
        usedRecords = new ArrayList<Record>();
        crwbRecords = new ArrayList<Record>();
        fft1Records = new ArrayList<Record>();
        fft2Records = new ArrayList<Record>();
        driverRecords = new ArrayList<Record>();
        for(int j = 0; j < n; ++j)
        {
            tempRecordNo = j;
            tempName = allArray.get(0).get(j).toString().strip();
            if(!allArray.get(1).get(j).toString().strip().equals(""))
                tempName += " " + allArray.get(1).get(j).toString().strip();
            tempName += " " + allArray.get(2).get(j).toString().strip();
            tempIdNo = allArray.get(3).get(j).toString().strip().toUpperCase();
            tempQual = allArray.get(5).get(j).toString().strip().toUpperCase();
            tempCertDate = allArray.get(6).get(j).toString();
            tempLsa = allArray.get(7).get(j).toString().strip().toUpperCase();
            tempSawyer = allArray.get(11).get(j).toString().strip().toUpperCase();
            tempMspaDate = allArray.get(12).get(j).toString();
            tempRecord = new Record(tempRecordNo, tempName, tempIdNo, tempQual, tempCertDate, tempLsa, tempSawyer, tempMspaDate);

            allRecords.add(tempRecord) ;
            if(!tempMspaDate.isBlank())
                driverRecords.add(tempRecord);
            if(tempQual.contains("FFT2"))
                fft2Records.add(tempRecord);
            else if(tempQual.contains("FFT1"))
                fft1Records.add(tempRecord);
            else if(tempQual.contains("CRWB"))
                crwbRecords.add(tempRecord);
        }
    }
    public void manifestView()
    {
        listToMaps();

        manifestPanes = new ManifestPane[manifestTabs];
        manifestPanes[0] = new ManifestPane(usedRecords, crwbRecords, fft1Records, fft2Records, driverRecords, vehicleRecords);
        manifestPanes[0].setBackground(Color.WHITE);
        tabbedPane.add("MANIFEST", manifestPanes[0]);

        JSeparator separator0 = new JSeparator();
        JSeparator separator1 = new JSeparator();
        JSeparator separator2 = new JSeparator();
        JSeparator separator3 = new JSeparator();
        JSeparator separator4 = new JSeparator();
        JSeparator separator5 = new JSeparator();
        manifestPanes[0].add(separator0);
        manifestPanes[0].add(separator1);
        manifestPanes[0].add(separator2);
        manifestPanes[0].add(separator3);
        manifestPanes[0].add(separator4);
        manifestPanes[0].add(separator5);

        manifestPanes[1] = new ManifestPane(usedRecords, crwbRecords, fft1Records, fft2Records, driverRecords, vehicleRecords);
        manifestPanes[1].setBackground(Color.WHITE);
        manifestPanes[0].add(manifestPanes[1]);

        manifestTabsCount = 2;
    }

    public void anotherManifestView()
    {
        if(manifestTabsCount < manifestTabs - 1)
        {
            ++manifestTabsCount;
            manifestPanes[manifestTabsCount] = new ManifestPane(usedRecords, crwbRecords, fft1Records, fft2Records, driverRecords, vehicleRecords);
            manifestPanes[manifestTabsCount].setBackground(Color.WHITE);
            tabbedPane.add("MANIFEST " + manifestTabsCount, manifestPanes[manifestTabsCount]);
        }
    }

    public boolean loadVehicles(ArrayList<ArrayList> allVehicles)
    {
        boolean retval = false;
        String filename;
        XSSFRead xReader;

        try
        {
            filename = file.getCanonicalPath();
            xReader = new XSSFRead(filename);
            colArrayVehicles = new ArrayList<String>();
            allVehicles = xReader.populate(colArrayVehicles, 0, 8);

        } catch (Exception e) {e.printStackTrace();}

        if(allVehicles != null)
        {
            int i, j;

            String[][] rowStrings = new String[allVehicles.get(0).size()][allVehicles.size()];
            for (i = 0; i < allVehicles.get(0).size(); ++i)
            {
                for (j = 0; j < allVehicles.size(); ++j)
                {
                    rowStrings[i][j] = new String(allVehicles.get(j).get(i).toString());
                }
            }

            DefaultTableModel tableModel = new DefaultTableModel(rowStrings, colArrayVehicles.toArray());
            vehicleTable = new JTable(tableModel);

            vehicleTable.setFont(new Font("consolas", Font.PLAIN, 14));
            vehicleTable.setBackground(Color.decode("#79fcc1"));
            vehicleTable.setDragEnabled(true);
            vehicleTable.setRowHeight(30);
            vehiclePane = new JScrollPane(vehicleTable);
            vehiclePane.setWheelScrollingEnabled(true);
            tabbedPane.add("VEHICLES", vehiclePane);

            int tempVehicleNo;
            String tempMakeModel;
            String tempVehicleLicence;
            Vehicle tempVehicle;
            int m = allVehicles.size();
            int n = allVehicles.get(0).size();
            vehicleRecords = new ArrayList<Vehicle>();
            for(j = 0; j < n; ++j)
            {
                tempVehicleNo = j;
                tempMakeModel = allVehicles.get(3).get(j).toString().strip().toUpperCase();
                tempVehicleLicence = allVehicles.get(4).get(j).toString().strip().toUpperCase();
                tempVehicle = new Vehicle(tempVehicleNo, tempMakeModel, tempVehicleLicence);

                vehicleRecords.add(tempVehicle) ;
            }
            return true;
        }
        else
            return false;
    }

    public boolean loadContacts(ArrayList<ArrayList> allContacts)
    {
        boolean retval = false;
        String filename;
        XSSFRead xReader;

        try
        {
            filename = contactsFile.getCanonicalPath();
            xReader = new XSSFRead(filename);
            colArrayContacts= new ArrayList<String>();
            allContacts = xReader.populate(colArrayContacts, 0, 1);

        } catch (Exception e) {e.printStackTrace();}

        if(allContacts != null)
        {
            int i, j;

            String[][] rowStrings = new String[allContacts.get(0).size()][allContacts.size()];
            for (i = 0; i < allContacts.get(0).size(); ++i)
            {
                for (j = 0; j < allContacts.size(); ++j)
                {
                    rowStrings[i][j] = new String(allContacts.get(j).get(i).toString());
                }
            }

            DefaultTableModel tableModel = new DefaultTableModel(rowStrings, colArrayContacts.toArray());
            contactTable = new JTable(tableModel);
            contactTable.setFont(new Font("consolas", Font.PLAIN, 14));
            contactTable.setBackground(Color.decode("#fb7828"));
            contactTable.setDragEnabled(true);
            contactTable.setRowHeight(30);

            contactPane = new JScrollPane(contactTable);
            contactPane.setWheelScrollingEnabled(true);

            JButton CALLButton;
            JButton TEXTButton;
            JTextArea textArea1;
            JList list1;

            alertPanel = new JPanel();
            alertPanel.setLayout(new GridBagLayout());

            final JPanel spacer1 = new JPanel();
            GridBagConstraints gbc;
            gbc = new GridBagConstraints();
            gbc.gridx = 2;
            gbc.gridy = 3;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            alertPanel.add(spacer1, gbc);
            final JPanel spacer2 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 12;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer2, gbc);
            final JPanel spacer3 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 11;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer3, gbc);
            final JPanel spacer4 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 4;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer4, gbc);
            final JPanel spacer5 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 5;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer5, gbc);
            final JPanel spacer6 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 7;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer6, gbc);
            final JPanel spacer7 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 8;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer7, gbc);
            final JPanel spacer8 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer8, gbc);
            final JScrollPane scrollPane1 = new JScrollPane();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 13;
            gbc.fill = GridBagConstraints.BOTH;
            alertPanel.add(scrollPane1, gbc);
            textArea1 = new JTextArea();
            textArea1.setColumns(40);
            textArea1.setLineWrap(true);
            textArea1.setRows(4);
            textArea1.setWrapStyleWord(true);
            scrollPane1.setViewportView(textArea1);
            TEXTButton = new JButton();
            TEXTButton.setBackground(new Color(-1900537));
            TEXTButton.setForeground(new Color(-1900537));
            TEXTButton.setText("TEXT");
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 16;
            alertPanel.add(TEXTButton, gbc);
            final JPanel spacer9 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 17;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer9, gbc);
            CALLButton = new JButton();
            CALLButton.setBackground(new Color(-1900537));
            CALLButton.setForeground(new Color(-1900537));
            CALLButton.setText("CALL");
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 6;
            alertPanel.add(CALLButton, gbc);
            final JPanel spacer10 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            alertPanel.add(spacer10, gbc);
            final JPanel spacer11 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 14;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer11, gbc);
            final JPanel spacer12 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 15;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer12, gbc);
            final JPanel spacer13 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 10;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer13, gbc);
            final JScrollPane scrollPane2 = new JScrollPane();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.fill = GridBagConstraints.BOTH;
            alertPanel.add(scrollPane2, gbc);

            CALLButton.setEnabled(false);
            TEXTButton.setEnabled(false);

            DefaultListModel listModel = new DefaultListModel();
            list1 = new JList(listModel);
            listModel.addAll(URINames);
            list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            list1.addListSelectionListener(new ListSelectionListener()
            {
                @Override
                public void valueChanged(ListSelectionEvent e)
                {
                    if(!e.getValueIsAdjusting())
                    {
                        selectedCall = list1.getSelectedIndex();
                    }
                }
            });

            scrollPane2.setViewportView(list1);
            final JSeparator separator1 = new JSeparator();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 9;
            gbc.fill = GridBagConstraints.BOTH;
            alertPanel.add(separator1, gbc);
            final JPanel spacer14 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer14, gbc);
            final JPanel spacer15 = new JPanel();
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.VERTICAL;
            alertPanel.add(spacer15, gbc);


            contactPanel = new JPanel();
            contactPanel.setLayout(new GridLayout(1,2));
            contactPanel.add(contactPane);
            contactPanel.add(alertPanel);
            tabbedPane.add("CONTACT", contactPanel);


            TEXTButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == TEXTButton)
                    {
                        int textLength = textArea1.getText().toString().length();
                        if(textLength > 0)
                        {
                            if(textLength < 160)
                            {
                                String sureString = "Send text to the " + selectedContacts.size() + " selected phone numbers?";
                                int sureInt = JOptionPane.showConfirmDialog(App.this, sureString, "Mass Text Initiated", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if(sureInt == 0)
                                {
                                    TwilioAlert twilioAlert = new TwilioAlert();
                                    twilioAlert.sms(selectedContacts, textArea1.getText());
                                    selectedRowUpdateLastText(textArea1.getText());
                                    saveContactTable();
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog( App.this, "SMS must be less than 160 characters");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog( App.this, "Enter a message");
                        }
                    }
                }
            });
            CALLButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == CALLButton)
                    {
                        if(selectedCall != -1)
                        {
                            String sureString = "Make call to the " + selectedContacts.size() + " selected phone numbers?";
                            int sureInt = JOptionPane.showConfirmDialog(App.this, sureString, "Mass Call Initiated", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if(sureInt == 0)
                            {
                                TwilioAlert twilioAlert = new TwilioAlert();
                                twilioAlert.call(selectedContacts, URIStrings.get(selectedCall));
                                selectedRowUpdateLastCall(URINames.get(selectedCall));
                                saveContactTable();
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog( App.this, "Select a script");
                        }
                    }
                }
            });

            ListSelectionModel cellSelectionModel = contactTable.getSelectionModel();
            cellSelectionModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            cellSelectionModel.addListSelectionListener(new ListSelectionListener()
            {
                @Override
                public void valueChanged(ListSelectionEvent e)
                {
                    /*
                    String selectedData = null;
                    int[] selectedRow = contactTable.getSelectedRows();
                    int[] selectedColumns = contactTable.getSelectedColumns();
                    for (int i = 0; i < selectedRow.length; i++) {
                        for (int j = 0; j < selectedColumns.length; j++) {
                            selectedData = (String) contactTable.getValueAt(selectedRow[i], selectedColumns[j]);
                        }
                    }
                    System.out.println("Selected: " + selectedData);
                    */
                    selectedContacts = new ArrayList<String>();
                    int[] selectedRow = contactTable.getSelectedRows();
                    int[] selectedColumns = contactTable.getSelectedColumns();
                    for (int i = 0; i < selectedRow.length; i++)
                    {
                        selectedContacts.add((String) contactTable.getValueAt(selectedRow[i], 1));
                    }
                    if(selectedRow.length > 0)
                    {
                        CALLButton.setEnabled(true);
                        TEXTButton.setEnabled(true);
                    }
                    else
                    {
                        CALLButton.setEnabled(false);
                        TEXTButton.setEnabled(false);
                    }
                }
            });
            return true;
        }
        else
            return false;
    }

    public void selectedRowUpdateLastCall(String madeCall)
    {
        int[] selectedRow = contactTable.getSelectedRows();
        int[] selectedColumns = contactTable.getSelectedColumns();
        for (int i = 0; i < selectedRow.length; i++)
        {
            contactTable.setValueAt(madeCall, selectedRow[i], 2);
        }
    }
    public void selectedRowUpdateLastText(String sentText)
    {
        int[] selectedRow = contactTable.getSelectedRows();
        int[] selectedColumns = contactTable.getSelectedColumns();
        for (int i = 0; i < selectedRow.length; i++)
        {
            contactTable.setValueAt(sentText, selectedRow[i], 3);
        }
    }
    public void saveContactTable()
    {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Row headerRow = sheet.createRow(0);
        Cell cell1 = headerRow.createCell(0);
        cell1.setCellValue("Name");
        Cell cell2 = headerRow.createCell(1);
        cell2.setCellValue("Phone");
        Cell cell3 = headerRow.createCell(2);
        cell3.setCellValue("Last Call");
        Cell cell4 = headerRow.createCell(3);
        cell4.setCellValue("Last Text");

        Row row = null;
        Cell cell = null;

        for (int i = 1; i < contactTable.getRowCount(); ++i)
        {
            row = sheet.createRow(i);
            for (int j = 0; j < contactTable.getColumnCount(); ++j)
            {
                cell = row.createCell(j);
                cell.setCellValue((String) contactTable.getValueAt(i - 1, j));

            }
        }

        FileOutputStream outputStream = null;
        try
        {
            outputStream = new FileOutputStream(contactsFile);
            workbook.write(outputStream);
            outputStream.close();
            workbook.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public App()
    {
        /*
        try
        {
            System.setErr(new PrintStream("err.txt"));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
*/
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { e.printStackTrace(); }

        startView();

        URIStrings = new ArrayList<String>(2);
        URINames = new ArrayList<String>(2);
        URIStrings.add("https://handler.twilio.com/twiml/EHc1d761830a8848b4793a5b8801954d6d");
        URINames.add("Fire Call (en)");
        URIStrings.add("https://handler.twilio.com/twiml/EHe5953ee2efa3c59976880a05229c8e34");
        URINames.add("Fire Call (es)");
        URIStrings.add("https://handler.twilio.com/twiml/EHe7728e3a0927900e2f29193faf803f3d");
        URINames.add("Training Notification (en)");
        URIStrings.add("https://handler.twilio.com/twiml/EH72723efaa34287529c683d12b64ca3c9");
        URINames.add("Training Notification (es)");

        setTitle("Dispatcher");
        img = new ImageIcon("res\\appIcon.jpg");
        setIconImage(img.getImage());
        setSize(new Dimension(1800, 900));
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2,1));

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        //pack();
        setVisible(true);
    }
}
