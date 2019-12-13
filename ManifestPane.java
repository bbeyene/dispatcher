package com.beyene.manifestmaker;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1CFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;


public class ManifestPane extends JPanel
{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JComboBox comboBox1;
    private JTextField textField20;
    private JTextField CRWBTextField;
    private JTextField textField22;
    private JTextField textField5;
    private JComboBox comboBox2;
    private JTextField textField27;
    private JTextField textField29;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JComboBox comboBox10;
    private JComboBox comboBox11;
    private JComboBox comboBox12;
    private JComboBox comboBox13;
    private JComboBox comboBox14;
    private JComboBox comboBox15;
    private JComboBox comboBox16;
    private JComboBox comboBox17;
    private JComboBox comboBox18;
    private JComboBox comboBox19;
    private JComboBox comboBox20;
    private JTextField textField34;
    private JTextField textField36;
    private JTextField textField41;
    private JTextField FFT2TextField1;
    private JTextField textField43;
    private JTextField textField48;
    private JTextField FFT2TextField2;
    private JTextField textField50;
    private JTextField textField55;
    private JTextField FFT2TextField3;
    private JTextField textField57;
    private JTextField textField62;
    private JTextField FFT2TextField4;
    private JTextField textField64;
    private JTextField textField69;
    private JTextField FFT2TextField5;
    private JTextField textField71;
    private JTextField textField76;
    private JTextField FFT2TextField6;
    private JTextField textField78;
    private JTextField textField83;
    private JTextField FFT2TextField7;
    private JTextField textField85;
    private JTextField textField90;
    private JTextField FFT1TextField;
    private JTextField textField92;
    private JTextField textField97;
    private JTextField FFT2TextField8;
    private JTextField textField99;
    private JTextField textField104;
    private JTextField FFT2TextField9;
    private JTextField textField106;
    private JTextField textField111;
    private JTextField FFT2TextField10;
    private JTextField textField113;
    private JTextField textField118;
    private JTextField FFT2TextField11;
    private JTextField textField120;
    private JTextField textField125;
    private JTextField FFT2TextField12;
    private JTextField textField127;
    private JTextField textField132;
    private JTextField textField134;
    private JTextField textField139;
    private JTextField textField141;
    private JTextField textField146;
    private JTextField textField148;
    private JTextField textField153;
    private JTextField FFT1TextField1;
    private JTextField textField155;
    private JComboBox comboBox21;
    private JTextField textField19;
    private JComboBox comboBox22;
    private JTextField textField33;
    private JComboBox comboBox23;
    private JTextField textField47;
    private JComboBox comboBox24;
    private JTextField textField61;
    private JComboBox comboBox25;
    private JTextField textField74;
    private JTextField textField75;
    private JButton clearButton1;
    private JButton clearButton2;
    private JButton clearButton3;
    private JButton clearButton4;
    private JButton clearButton5;
    private JButton clearButton6;
    private JButton clearButton7;
    private JButton clearButton8;
    private JButton clearButton9;
    private JButton clearButton10;
    private JButton clearButton11;
    private JButton clearButton12;
    private JButton clearButton13;
    private JButton clearButton14;
    private JButton clearButton15;
    private JButton clearButton16;
    private JButton clearButton17;
    private JButton clearButton18;
    private JButton clearButton19;
    private JButton clearButton20;
    private JComboBox comboBox26;
    private JComboBox comboBox27;
    private JComboBox comboBox28;
    private JComboBox comboBox29;
    private JComboBox comboBox30;
    private JComboBox comboBox31;
    private JComboBox comboBox32;
    private JComboBox comboBox33;
    private JComboBox comboBox34;
    private JComboBox comboBox35;
    private JComboBox comboBox36;
    private JComboBox comboBox37;
    private JComboBox comboBox38;
    private JComboBox comboBox39;
    private JComboBox comboBox40;
    private JComboBox comboBox41;
    private JComboBox comboBox42;
    private JComboBox comboBox43;
    private JComboBox comboBox44;
    private JComboBox comboBox45;
    private JComboBox comboBox46;
    private JComboBox comboBox47;
    private JComboBox comboBox48;
    private JComboBox comboBox49;
    private JComboBox comboBox50;
    private JComboBox comboBox51;
    private JComboBox comboBox52;
    private JComboBox comboBox53;
    private JComboBox comboBox54;
    private JComboBox comboBox55;
    private JComboBox comboBox56;
    private JComboBox comboBox57;
    private JComboBox comboBox58;
    private JComboBox comboBox59;
    private JComboBox comboBox60;
    private JComboBox comboBox61;
    private JComboBox comboBox62;
    private JComboBox comboBox63;
    private JComboBox comboBox64;
    private JComboBox comboBox65;
    private JComboBox comboBox66;
    private JComboBox comboBox67;
    private JComboBox comboBox68;
    private JComboBox comboBox69;
    private JComboBox comboBox70;
    private JComboBox comboBox71;
    private JComboBox comboBox72;
    private JComboBox comboBox73;
    private JComboBox comboBox74;
    private JComboBox comboBox75;
    private JComboBox comboBox76;
    private JComboBox comboBox77;
    private JComboBox comboBox78;
    private JComboBox comboBox79;
    private JComboBox comboBox80;
    private JComboBox comboBox81;
    private JComboBox comboBox82;
    private JComboBox comboBox83;
    private JComboBox comboBox84;
    private JComboBox comboBox85;
    private JComboBox comboBox86;
    private JComboBox comboBox87;
    private JComboBox comboBox88;
    private JComboBox comboBox89;
    private JComboBox comboBox90;
    private JButton finishButton;
    private JComboBox comboBox91;
    private JComboBox comboBox92;
    private JComboBox comboBox93;
    private JComboBox comboBox94;
    private JComboBox comboBox95;
    private JTextField textField60;
    private JTextField textField46;
    private JTextField textField32;
    private JTextField textField18;
    private JComboBox comboBox96;
    private JComboBox comboBox97;
    private JComboBox comboBox98;
    private JComboBox comboBox99;
    private JComboBox comboBox100;
    private JButton fillButton;


    private ArrayList<String> vehicles;
    private ArrayList<String> licences;
    private ArrayList<String> drivers;
    private ArrayList<String> quals1;
    private ArrayList<String> quals2;
    private ArrayList<String> quals3;
    private ArrayList<String> experience;
    private ArrayList<String> yes;
    private ArrayList<String> mf;

    private int [] recordSelected;
    private int [] driverSelected;
    private int [] vehicleSelected;

    public ManifestPane(ArrayList<Record> usedRecords, ArrayList<Record> crwbRecords, ArrayList<Record> fft1Records, ArrayList<Record> fft2Records, ArrayList<Record> driverRecords, ArrayList<Vehicle> vehicleRecords)
    {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "HAND CREW MANIFEST FORM", TitledBorder.CENTER, TitledBorder.ABOVE_TOP));
        textField1 = new JTextField();
        textField1.setText("");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 6;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField1, gbc);
        textField2 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.gridwidth = 30;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField2, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("CONTRACTOR");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 14;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("CONTRACTOR REPRESENTATIVE");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 14;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label2, gbc);
        textField8 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 14;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField8, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("PLACE");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 10;
        panel1.add(label3, gbc);
        textField11 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 10;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField11, gbc);
        textField20 = new JTextField();
        textField20.setColumns(12);
        textField20.setEditable(false);
        textField20.setHorizontalAlignment(0);
        textField20.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 17;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField20, gbc);
        CRWBTextField = new JTextField();
        CRWBTextField.setColumns(7);
        CRWBTextField.setEditable(false);
        CRWBTextField.setHorizontalAlignment(0);
        CRWBTextField.setText("CRWB");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 17;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(CRWBTextField, gbc);
        final JLabel label4 = new JLabel();
        label4.setText("INCIDENT NUMBER");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 1;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label4, gbc);
        textField3 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 2;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField3, gbc);
        final JLabel label5 = new JLabel();
        label5.setText("INCIDENT NAME");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.gridwidth = 28;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label5, gbc);
        final JLabel label6 = new JLabel();
        label6.setText("ORDERING UNIT");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label6, gbc);
        textField5 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 9;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField5, gbc);
        final JLabel label7 = new JLabel();
        label7.setText("ETA");
        gbc = new GridBagConstraints();
        gbc.gridx = 53;
        gbc.gridy = 11;
        panel1.add(label7, gbc);
        final JLabel label8 = new JLabel();
        label8.setText("DESTINATION");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 10;
        gbc.gridwidth = 16;
        panel1.add(label8, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer1, gbc);
        textField13 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 12;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField13, gbc);
        final JLabel label9 = new JLabel();
        label9.setText("PLACE");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 11;
        gbc.gridwidth = 18;
        panel1.add(label9, gbc);
        final JLabel label10 = new JLabel();
        label10.setText("DEPARTURE");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 18;
        panel1.add(label10, gbc);
        final JLabel label11 = new JLabel();
        label11.setText("INTERMEDIATE STOPS");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 10;
        gbc.gridwidth = 18;
        panel1.add(label11, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 37;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer3, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer4, gbc);
        textField14 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 12;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField14, gbc);
        final JLabel label12 = new JLabel();
        label12.setText("PLACE");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 11;
        gbc.gridwidth = 9;
        panel1.add(label12, gbc);
        final JLabel label13 = new JLabel();
        label13.setText("EXPERIENCE AND LSA");
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 15;
        gbc.gridwidth = 6;
        gbc.gridheight = 2;
        panel1.add(label13, gbc);
        textField27 = new JTextField();
        textField27.setColumns(12);
        textField27.setEditable(false);
        textField27.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 18;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField27, gbc);
        textField34 = new JTextField();
        textField34.setEditable(false);
        textField34.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 19;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField34, gbc);
        textField41 = new JTextField();
        textField41.setEditable(false);
        textField41.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 20;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField41, gbc);
        FFT2TextField1 = new JTextField();
        FFT2TextField1.setEditable(false);
        FFT2TextField1.setHorizontalAlignment(0);
        FFT2TextField1.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 20;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField1, gbc);
        textField48 = new JTextField();
        textField48.setEditable(false);
        textField48.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 21;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField48, gbc);
        FFT2TextField2 = new JTextField();
        FFT2TextField2.setEditable(false);
        FFT2TextField2.setHorizontalAlignment(0);
        FFT2TextField2.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 21;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField2, gbc);
        textField55 = new JTextField();
        textField55.setEditable(false);
        textField55.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 22;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField55, gbc);
        FFT2TextField3 = new JTextField();
        FFT2TextField3.setEditable(false);
        FFT2TextField3.setHorizontalAlignment(0);
        FFT2TextField3.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 22;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField3, gbc);
        textField62 = new JTextField();
        textField62.setEditable(false);
        textField62.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 23;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField62, gbc);
        FFT2TextField4 = new JTextField();
        FFT2TextField4.setEditable(false);
        FFT2TextField4.setHorizontalAlignment(0);
        FFT2TextField4.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 23;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField4, gbc);
        textField69 = new JTextField();
        textField69.setEditable(false);
        textField69.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 24;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField69, gbc);
        FFT2TextField5 = new JTextField();
        FFT2TextField5.setEditable(false);
        FFT2TextField5.setHorizontalAlignment(0);
        FFT2TextField5.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 24;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField5, gbc);
        textField76 = new JTextField();
        textField76.setEditable(false);
        textField76.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 25;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField76, gbc);
        FFT2TextField6 = new JTextField();
        FFT2TextField6.setEditable(false);
        FFT2TextField6.setHorizontalAlignment(0);
        FFT2TextField6.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 25;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField6, gbc);
        textField83 = new JTextField();
        textField83.setEditable(false);
        textField83.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 26;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField83, gbc);
        FFT2TextField7 = new JTextField();
        FFT2TextField7.setEditable(false);
        FFT2TextField7.setHorizontalAlignment(0);
        FFT2TextField7.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 26;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField7, gbc);
        textField90 = new JTextField();
        textField90.setEditable(false);
        textField90.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 27;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField90, gbc);
        FFT1TextField = new JTextField();
        FFT1TextField.setEditable(false);
        FFT1TextField.setHorizontalAlignment(0);
        FFT1TextField.setText("FFT1");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 27;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT1TextField, gbc);
        textField97 = new JTextField();
        textField97.setEditable(false);
        textField97.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 28;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField97, gbc);
        FFT2TextField8 = new JTextField();
        FFT2TextField8.setEditable(false);
        FFT2TextField8.setHorizontalAlignment(0);
        FFT2TextField8.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 28;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField8, gbc);
        textField104 = new JTextField();
        textField104.setEditable(false);
        textField104.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 29;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField104, gbc);
        FFT2TextField9 = new JTextField();
        FFT2TextField9.setEditable(false);
        FFT2TextField9.setHorizontalAlignment(0);
        FFT2TextField9.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 29;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField9, gbc);
        textField111 = new JTextField();
        textField111.setEditable(false);
        textField111.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 30;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField111, gbc);
        FFT2TextField10 = new JTextField();
        FFT2TextField10.setEditable(false);
        FFT2TextField10.setHorizontalAlignment(0);
        FFT2TextField10.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 30;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField10, gbc);
        textField118 = new JTextField();
        textField118.setEditable(false);
        textField118.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 31;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField118, gbc);
        FFT2TextField11 = new JTextField();
        FFT2TextField11.setEditable(false);
        FFT2TextField11.setHorizontalAlignment(0);
        FFT2TextField11.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 31;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField11, gbc);
        textField125 = new JTextField();
        textField125.setEditable(false);
        textField125.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 32;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField125, gbc);
        FFT2TextField12 = new JTextField();
        FFT2TextField12.setEditable(false);
        FFT2TextField12.setHorizontalAlignment(0);
        FFT2TextField12.setText("FFT2");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 32;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT2TextField12, gbc);
        textField132 = new JTextField();
        textField132.setEditable(false);
        textField132.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 33;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField132, gbc);
        textField139 = new JTextField();
        textField139.setEditable(false);
        textField139.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 34;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField139, gbc);
        textField146 = new JTextField();
        textField146.setEditable(false);
        textField146.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 35;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField146, gbc);
        textField153 = new JTextField();
        textField153.setEditable(false);
        textField153.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 36;
        gbc.gridwidth = 18;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField153, gbc);
        FFT1TextField1 = new JTextField();
        FFT1TextField1.setEditable(false);
        FFT1TextField1.setHorizontalAlignment(0);
        FFT1TextField1.setText("FFT1");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 36;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(FFT1TextField1, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 37;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer6, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 39;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer7, gbc);
        final JLabel label14 = new JLabel();
        label14.setText("MSPA Exp. Date");
        gbc = new GridBagConstraints();
        gbc.gridx = 36;
        gbc.gridy = 40;
        panel1.add(label14, gbc);
        textField33 = new JTextField();
        textField33.setEditable(false);
        textField33.setEnabled(true);
        textField33.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 36;
        gbc.gridy = 42;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField33, gbc);
        textField47 = new JTextField();
        textField47.setEditable(false);
        textField47.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 36;
        gbc.gridy = 43;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField47, gbc);
        textField61 = new JTextField();
        textField61.setEditable(false);
        textField61.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 36;
        gbc.gridy = 44;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField61, gbc);
        textField74 = new JTextField();
        textField74.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 45;
        gbc.gridwidth = 24;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField74, gbc);
        textField75 = new JTextField();
        textField75.setEditable(false);
        textField75.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 36;
        gbc.gridy = 45;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField75, gbc);
        final JLabel label15 = new JLabel();
        label15.setText("AGREEMENT NUMBER");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 4;
        gbc.gridwidth = 20;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label15, gbc);
        final JLabel label16 = new JLabel();
        label16.setText("CONTACT PHONE");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 7;
        gbc.gridwidth = 20;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label16, gbc);
        textField9 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 8;
        gbc.gridwidth = 22;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField9, gbc);
        textField6 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 5;
        gbc.gridwidth = 22;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField6, gbc);
        final JLabel label17 = new JLabel();
        label17.setText("DESIGNATED DISPATCH LOCATION");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 4;
        gbc.gridwidth = 16;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label17, gbc);
        textField10 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 8;
        gbc.gridwidth = 16;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField10, gbc);
        textField7 = new JTextField();
        textField7.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 5;
        gbc.gridwidth = 16;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField7, gbc);
        textField4 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 2;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField4, gbc);
        final JLabel label18 = new JLabel();
        label18.setText("RESOURCE NUMBER");
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 1;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label18, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 47;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer8, gbc);
        textField22 = new JTextField();
        textField22.setColumns(3);
        textField22.setEditable(false);
        textField22.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 17;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField22, gbc);
        textField29 = new JTextField();
        textField29.setColumns(3);
        textField29.setEditable(false);
        textField29.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 18;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField29, gbc);
        final JLabel label19 = new JLabel();
        label19.setText("SAWYER");
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 15;
        gbc.gridwidth = 4;
        gbc.gridheight = 2;
        panel1.add(label19, gbc);
        textField36 = new JTextField();
        textField36.setColumns(3);
        textField36.setEditable(false);
        textField36.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 19;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField36, gbc);
        textField43 = new JTextField();
        textField43.setColumns(3);
        textField43.setEditable(false);
        textField43.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 20;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField43, gbc);
        textField50 = new JTextField();
        textField50.setColumns(3);
        textField50.setEditable(false);
        textField50.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 21;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField50, gbc);
        textField57 = new JTextField();
        textField57.setColumns(3);
        textField57.setEditable(false);
        textField57.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 22;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField57, gbc);
        textField64 = new JTextField();
        textField64.setColumns(3);
        textField64.setEditable(false);
        textField64.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 23;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField64, gbc);
        textField71 = new JTextField();
        textField71.setColumns(3);
        textField71.setEditable(false);
        textField71.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 24;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField71, gbc);
        textField78 = new JTextField();
        textField78.setColumns(3);
        textField78.setEditable(false);
        textField78.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 25;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField78, gbc);
        textField85 = new JTextField();
        textField85.setColumns(3);
        textField85.setEditable(false);
        textField85.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 26;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField85, gbc);
        textField92 = new JTextField();
        textField92.setColumns(3);
        textField92.setEditable(false);
        textField92.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 27;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField92, gbc);
        textField99 = new JTextField();
        textField99.setColumns(3);
        textField99.setEditable(false);
        textField99.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 28;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField99, gbc);
        final JLabel label20 = new JLabel();
        label20.setText("EMT");
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 15;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        panel1.add(label20, gbc);
        textField106 = new JTextField();
        textField106.setColumns(3);
        textField106.setEditable(false);
        textField106.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 29;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField106, gbc);
        textField113 = new JTextField();
        textField113.setColumns(3);
        textField113.setEditable(false);
        textField113.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 30;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField113, gbc);
        textField120 = new JTextField();
        textField120.setColumns(3);
        textField120.setEditable(false);
        textField120.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 31;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField120, gbc);
        textField127 = new JTextField();
        textField127.setColumns(3);
        textField127.setEditable(false);
        textField127.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 32;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField127, gbc);
        textField134 = new JTextField();
        textField134.setColumns(3);
        textField134.setEditable(false);
        textField134.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 33;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField134, gbc);
        textField141 = new JTextField();
        textField141.setColumns(3);
        textField141.setEditable(false);
        textField141.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 34;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField141, gbc);
        textField148 = new JTextField();
        textField148.setColumns(3);
        textField148.setEditable(false);
        textField148.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 35;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField148, gbc);
        textField155 = new JTextField();
        textField155.setColumns(3);
        textField155.setEditable(false);
        textField155.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 40;
        gbc.gridy = 36;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField155, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 44;
        gbc.gridy = 16;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer9, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 51;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer10, gbc);
        textField16 = new JTextField();
        textField16.setColumns(5);
        textField16.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 12;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField16, gbc);
        final JLabel label21 = new JLabel();
        label21.setText("ETD");
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        panel1.add(label21, gbc);
        textField12 = new JTextField();
        textField12.setColumns(5);
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 12;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField12, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer11, gbc);
        final JLabel label22 = new JLabel();
        label22.setText("ETA");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        panel1.add(label22, gbc);
        textField17 = new JTextField();
        textField17.setColumns(5);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 12;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField17, gbc);
        final JLabel label23 = new JLabel();
        label23.setText("ETD");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        panel1.add(label23, gbc);
        comboBox1 = new JComboBox();
        comboBox1.setBackground(new Color(-855310));
        comboBox1.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 17;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox1, gbc);
        final JLabel label24 = new JLabel();
        label24.setText("          CREW MEMBER NAME          ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 10;
        gbc.gridheight = 2;
        panel1.add(label24, gbc);
        clearButton1 = new JButton();
        clearButton1.setEnabled(false);
        clearButton1.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 17;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton1, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer12, gbc);
        comboBox2 = new JComboBox();
        comboBox2.setBackground(new Color(-855310));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 18;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox2, gbc);
        comboBox3 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 19;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox3, gbc);
        comboBox4 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 20;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox4, gbc);
        comboBox5 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 21;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox5, gbc);
        comboBox6 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 22;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox6, gbc);
        comboBox7 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 23;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox7, gbc);
        comboBox8 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 24;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox8, gbc);
        comboBox9 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 25;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox9, gbc);
        comboBox10 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 26;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox10, gbc);
        comboBox11 = new JComboBox();
        comboBox11.setBackground(new Color(-11030798));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 27;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox11, gbc);
        comboBox12 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 28;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox12, gbc);
        comboBox13 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 29;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox13, gbc);
        comboBox14 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 30;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox14, gbc);
        comboBox15 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 31;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox15, gbc);
        comboBox16 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 32;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox16, gbc);
        comboBox17 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 33;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox17, gbc);
        comboBox18 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 34;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox18, gbc);
        comboBox19 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 35;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox19, gbc);
        comboBox20 = new JComboBox();
        comboBox20.setBackground(new Color(-855310));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 36;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox20, gbc);
        clearButton2 = new JButton();
        clearButton2.setEnabled(false);
        clearButton2.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 18;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton2, gbc);
        clearButton3 = new JButton();
        clearButton3.setEnabled(false);
        clearButton3.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 19;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton3, gbc);
        clearButton4 = new JButton();
        clearButton4.setEnabled(false);
        clearButton4.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 20;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton4, gbc);
        clearButton5 = new JButton();
        clearButton5.setEnabled(false);
        clearButton5.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 21;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton5, gbc);
        clearButton6 = new JButton();
        clearButton6.setEnabled(false);
        clearButton6.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 22;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton6, gbc);
        clearButton7 = new JButton();
        clearButton7.setEnabled(false);
        clearButton7.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 23;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton7, gbc);
        clearButton8 = new JButton();
        clearButton8.setEnabled(false);
        clearButton8.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 24;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton8, gbc);
        clearButton9 = new JButton();
        clearButton9.setEnabled(false);
        clearButton9.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 25;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton9, gbc);
        clearButton10 = new JButton();
        clearButton10.setEnabled(false);
        clearButton10.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 26;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton10, gbc);
        clearButton11 = new JButton();
        clearButton11.setEnabled(false);
        clearButton11.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 27;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton11, gbc);
        clearButton12 = new JButton();
        clearButton12.setEnabled(false);
        clearButton12.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 28;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton12, gbc);
        clearButton13 = new JButton();
        clearButton13.setEnabled(false);
        clearButton13.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 29;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton13, gbc);
        clearButton14 = new JButton();
        clearButton14.setEnabled(false);
        clearButton14.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 30;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton14, gbc);
        clearButton15 = new JButton();
        clearButton15.setEnabled(false);
        clearButton15.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 31;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton15, gbc);
        clearButton16 = new JButton();
        clearButton16.setEnabled(false);
        clearButton16.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 32;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton16, gbc);
        clearButton17 = new JButton();
        clearButton17.setEnabled(false);
        clearButton17.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 33;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton17, gbc);
        clearButton18 = new JButton();
        clearButton18.setEnabled(false);
        clearButton18.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 34;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton18, gbc);
        clearButton19 = new JButton();
        clearButton19.setEnabled(false);
        clearButton19.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 35;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton19, gbc);
        clearButton20 = new JButton();
        clearButton20.setEnabled(false);
        clearButton20.setText("x");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 36;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(clearButton20, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 47;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer13, gbc);
        final JPanel spacer14 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer14, gbc);
        comboBox21 = new JComboBox();
        comboBox21.setForeground(new Color(-16777216));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 41;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox21, gbc);
        comboBox22 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 42;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox22, gbc);
        comboBox23 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 43;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox23, gbc);
        comboBox24 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 44;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox24, gbc);
        comboBox25 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 45;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox25, gbc);
        final JLabel label25 = new JLabel();
        label25.setText("DRIVER AND VEHICLE INFORMATION");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 38;
        gbc.gridwidth = 54;
        panel1.add(label25, gbc);
        final JLabel label26 = new JLabel();
        label26.setText("Driver Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 40;
        gbc.gridwidth = 9;
        panel1.add(label26, gbc);
        textField19 = new JTextField();
        textField19.setEditable(false);
        textField19.setEnabled(true);
        textField19.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 36;
        gbc.gridy = 41;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField19, gbc);
        final JLabel label27 = new JLabel();
        label27.setText("M | F");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 15;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        panel1.add(label27, gbc);
        final JPanel spacer15 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer15, gbc);
        final JPanel spacer16 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 18;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer16, gbc);
        final JPanel spacer17 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer17, gbc);
        final JPanel spacer18 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 34;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer18, gbc);
        final JLabel label28 = new JLabel();
        label28.setText("CREW MEMBER");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 15;
        gbc.gridwidth = 18;
        panel1.add(label28, gbc);
        final JLabel label29 = new JLabel();
        label29.setText("NUMBER");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 16;
        gbc.gridwidth = 18;
        panel1.add(label29, gbc);
        final JLabel label30 = new JLabel();
        label30.setText("INCIDENT");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 15;
        panel1.add(label30, gbc);
        final JLabel label31 = new JLabel();
        label31.setText("POSITION");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 16;
        panel1.add(label31, gbc);
        final JLabel label32 = new JLabel();
        label32.setText("Vehicle Make/Model");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 40;
        gbc.gridwidth = 9;
        panel1.add(label32, gbc);
        final JLabel label33 = new JLabel();
        label33.setText("Vehicle License No.");
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 40;
        gbc.gridwidth = 6;
        panel1.add(label33, gbc);
        final JPanel spacer19 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 39;
        gbc.gridy = 16;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer19, gbc);
        final JLabel label34 = new JLabel();
        label34.setText("Licence Number/State");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 40;
        gbc.gridwidth = 24;
        panel1.add(label34, gbc);
        final JLabel label35 = new JLabel();
        label35.setText("REPORT TO");
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 7;
        gbc.gridwidth = 14;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label35, gbc);
        final JPanel spacer20 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 35;
        gbc.gridy = 40;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(spacer20, gbc);
        comboBox26 = new JComboBox();
        comboBox26.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 18;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox26, gbc);
        comboBox27 = new JComboBox();
        comboBox27.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 33;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox27, gbc);
        comboBox28 = new JComboBox();
        comboBox28.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 34;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox28, gbc);
        comboBox29 = new JComboBox();
        comboBox29.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 35;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox29, gbc);
        comboBox30 = new JComboBox();
        comboBox30.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 17;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox30, gbc);
        comboBox31 = new JComboBox();
        comboBox31.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 18;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox31, gbc);
        textField15 = new JTextField();
        textField15.setColumns(5);
        gbc = new GridBagConstraints();
        gbc.gridx = 52;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField15, gbc);
        comboBox32 = new JComboBox();
        comboBox32.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 19;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox32, gbc);
        comboBox33 = new JComboBox();
        comboBox33.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 20;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox33, gbc);
        comboBox34 = new JComboBox();
        comboBox34.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 21;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox34, gbc);
        comboBox35 = new JComboBox();
        comboBox35.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 22;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox35, gbc);
        comboBox36 = new JComboBox();
        comboBox36.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 23;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox36, gbc);
        comboBox37 = new JComboBox();
        comboBox37.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 24;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox37, gbc);
        comboBox38 = new JComboBox();
        comboBox38.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 25;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox38, gbc);
        comboBox39 = new JComboBox();
        comboBox39.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 26;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox39, gbc);
        comboBox40 = new JComboBox();
        comboBox40.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 27;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox40, gbc);
        comboBox41 = new JComboBox();
        comboBox41.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 28;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox41, gbc);
        comboBox42 = new JComboBox();
        comboBox42.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 29;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox42, gbc);
        comboBox43 = new JComboBox();
        comboBox43.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 30;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox43, gbc);
        comboBox44 = new JComboBox();
        comboBox44.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 31;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox44, gbc);
        comboBox45 = new JComboBox();
        comboBox45.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 32;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox45, gbc);
        comboBox46 = new JComboBox();
        comboBox46.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 33;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox46, gbc);
        comboBox47 = new JComboBox();
        comboBox47.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 34;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox47, gbc);
        comboBox48 = new JComboBox();
        comboBox48.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 35;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox48, gbc);
        comboBox49 = new JComboBox();
        comboBox49.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 36;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox49, gbc);
        comboBox54 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 21;
        gbc.gridwidth = 3;
        panel1.add(comboBox54, gbc);
        comboBox55 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 22;
        gbc.gridwidth = 3;
        panel1.add(comboBox55, gbc);
        comboBox56 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 23;
        gbc.gridwidth = 3;
        panel1.add(comboBox56, gbc);
        comboBox57 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 24;
        gbc.gridwidth = 3;
        panel1.add(comboBox57, gbc);
        comboBox59 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 26;
        gbc.gridwidth = 3;
        panel1.add(comboBox59, gbc);
        comboBox60 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 27;
        gbc.gridwidth = 3;
        panel1.add(comboBox60, gbc);
        comboBox70 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 17;
        gbc.gridwidth = 2;
        panel1.add(comboBox70, gbc);
        comboBox71 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 18;
        gbc.gridwidth = 2;
        panel1.add(comboBox71, gbc);
        comboBox72 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 19;
        gbc.gridwidth = 2;
        panel1.add(comboBox72, gbc);
        comboBox73 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 20;
        gbc.gridwidth = 2;
        panel1.add(comboBox73, gbc);
        comboBox74 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 21;
        gbc.gridwidth = 2;
        panel1.add(comboBox74, gbc);
        comboBox75 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 22;
        gbc.gridwidth = 2;
        panel1.add(comboBox75, gbc);
        comboBox76 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 23;
        gbc.gridwidth = 2;
        panel1.add(comboBox76, gbc);
        comboBox77 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 24;
        gbc.gridwidth = 2;
        panel1.add(comboBox77, gbc);
        comboBox78 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 25;
        gbc.gridwidth = 2;
        panel1.add(comboBox78, gbc);
        comboBox79 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 26;
        gbc.gridwidth = 2;
        panel1.add(comboBox79, gbc);
        comboBox80 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 27;
        gbc.gridwidth = 2;
        panel1.add(comboBox80, gbc);
        comboBox83 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 30;
        gbc.gridwidth = 2;
        panel1.add(comboBox83, gbc);
        comboBox84 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 31;
        gbc.gridwidth = 2;
        panel1.add(comboBox84, gbc);
        comboBox85 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 32;
        gbc.gridwidth = 2;
        panel1.add(comboBox85, gbc);
        comboBox86 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 33;
        gbc.gridwidth = 2;
        panel1.add(comboBox86, gbc);
        comboBox87 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 34;
        gbc.gridwidth = 2;
        panel1.add(comboBox87, gbc);
        comboBox88 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 35;
        gbc.gridwidth = 2;
        panel1.add(comboBox88, gbc);
        comboBox89 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 36;
        gbc.gridwidth = 2;
        panel1.add(comboBox89, gbc);
        comboBox81 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 28;
        gbc.gridwidth = 2;
        panel1.add(comboBox81, gbc);
        comboBox82 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 45;
        gbc.gridy = 29;
        gbc.gridwidth = 2;
        panel1.add(comboBox82, gbc);
        comboBox62 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 29;
        gbc.gridwidth = 3;
        panel1.add(comboBox62, gbc);
        comboBox63 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 30;
        gbc.gridwidth = 3;
        panel1.add(comboBox63, gbc);
        comboBox64 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 31;
        gbc.gridwidth = 3;
        panel1.add(comboBox64, gbc);
        comboBox65 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 32;
        gbc.gridwidth = 3;
        panel1.add(comboBox65, gbc);
        comboBox66 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 33;
        gbc.gridwidth = 3;
        panel1.add(comboBox66, gbc);
        comboBox67 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 34;
        gbc.gridwidth = 3;
        panel1.add(comboBox67, gbc);
        comboBox68 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 35;
        gbc.gridwidth = 3;
        panel1.add(comboBox68, gbc);
        comboBox69 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 36;
        gbc.gridwidth = 3;
        panel1.add(comboBox69, gbc);
        comboBox58 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 25;
        gbc.gridwidth = 3;
        panel1.add(comboBox58, gbc);
        comboBox61 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 28;
        gbc.gridwidth = 3;
        panel1.add(comboBox61, gbc);
        comboBox51 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 18;
        gbc.gridwidth = 3;
        panel1.add(comboBox51, gbc);
        comboBox50 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 17;
        gbc.gridwidth = 3;
        panel1.add(comboBox50, gbc);
        comboBox52 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 19;
        gbc.gridwidth = 3;
        panel1.add(comboBox52, gbc);
        comboBox53 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 20;
        gbc.gridwidth = 3;
        panel1.add(comboBox53, gbc);
        comboBox90 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 19;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox90, gbc);
        final JPanel spacer21 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 35;
        gbc.gridy = 46;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer21, gbc);
        final JPanel spacer22 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 35;
        gbc.gridy = 47;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer22, gbc);
        finishButton = new JButton();
        finishButton.setText("Finish");
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 48;
        gbc.gridwidth = 6;
        panel1.add(finishButton, gbc);
        comboBox91 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 41;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox91, gbc);
        comboBox92 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 42;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox92, gbc);
        comboBox93 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 43;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox93, gbc);
        comboBox94 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 44;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox94, gbc);
        comboBox95 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 38;
        gbc.gridy = 45;
        gbc.gridwidth = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox95, gbc);
        textField60 = new JTextField();
        textField60.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 44;
        gbc.gridwidth = 24;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField60, gbc);
        textField46 = new JTextField();
        textField46.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 43;
        gbc.gridwidth = 24;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField46, gbc);
        textField32 = new JTextField();
        textField32.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 42;
        gbc.gridwidth = 24;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField32, gbc);
        textField18 = new JTextField();
        textField18.setHorizontalAlignment(0);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 41;
        gbc.gridwidth = 24;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField18, gbc);
        comboBox96 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 41;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox96, gbc);
        comboBox97 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 42;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox97, gbc);
        comboBox98 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 43;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox98, gbc);
        comboBox99 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 44;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox99, gbc);
        comboBox100 = new JComboBox();
        gbc = new GridBagConstraints();
        gbc.gridx = 48;
        gbc.gridy = 45;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(comboBox100, gbc);
        fillButton = new JButton();
        fillButton.setText("Fill");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(fillButton, gbc);



        JScrollPane scroller = new JScrollPane(panel1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroller.setAutoscrolls(true);
        scroller.setWheelScrollingEnabled(true);
        //scroller.setPreferredSize(new Dimension(1100, 800));// for mac
        add(scroller);


        DefaultComboBoxModel comboBoxModel1 = new DefaultComboBoxModel();
        comboBox1.setModel(comboBoxModel1);
        DefaultComboBoxModel comboBoxModel2 = new DefaultComboBoxModel();
        comboBox2.setModel(comboBoxModel2);
        DefaultComboBoxModel comboBoxModel3 = new DefaultComboBoxModel();
        comboBox3.setModel(comboBoxModel3);
        DefaultComboBoxModel comboBoxModel4 = new DefaultComboBoxModel();
        comboBox4.setModel(comboBoxModel4);
        DefaultComboBoxModel comboBoxModel5 = new DefaultComboBoxModel();
        comboBox5.setModel(comboBoxModel5);
        DefaultComboBoxModel comboBoxModel6 = new DefaultComboBoxModel();
        comboBox6.setModel(comboBoxModel6);
        DefaultComboBoxModel comboBoxModel7 = new DefaultComboBoxModel();
        comboBox7.setModel(comboBoxModel7);
        DefaultComboBoxModel comboBoxModel8 = new DefaultComboBoxModel();
        comboBox8.setModel(comboBoxModel8);
        DefaultComboBoxModel comboBoxModel9 = new DefaultComboBoxModel();
        comboBox9.setModel(comboBoxModel9);
        DefaultComboBoxModel comboBoxModel10 = new DefaultComboBoxModel();
        comboBox10.setModel(comboBoxModel10);
        DefaultComboBoxModel comboBoxModel11 = new DefaultComboBoxModel();
        comboBox11.setModel(comboBoxModel11);
        DefaultComboBoxModel comboBoxModel12 = new DefaultComboBoxModel();
        comboBox12.setModel(comboBoxModel12);
        DefaultComboBoxModel comboBoxModel13 = new DefaultComboBoxModel();
        comboBox13.setModel(comboBoxModel13);
        DefaultComboBoxModel comboBoxModel14 = new DefaultComboBoxModel();
        comboBox14.setModel(comboBoxModel14);
        DefaultComboBoxModel comboBoxModel15 = new DefaultComboBoxModel();
        comboBox15.setModel(comboBoxModel15);
        DefaultComboBoxModel comboBoxModel16 = new DefaultComboBoxModel();
        comboBox16.setModel(comboBoxModel16);
        DefaultComboBoxModel comboBoxModel17 = new DefaultComboBoxModel();
        comboBox17.setModel(comboBoxModel17);
        DefaultComboBoxModel comboBoxModel18 = new DefaultComboBoxModel();
        comboBox18.setModel(comboBoxModel18);
        DefaultComboBoxModel comboBoxModel19 = new DefaultComboBoxModel();
        comboBox19.setModel(comboBoxModel19);
        DefaultComboBoxModel comboBoxModel20 = new DefaultComboBoxModel();
        comboBox20.setModel(comboBoxModel20);

        drivers = new ArrayList<String>(driverRecords.size());
        drivers.add("");
        for(int i = 0; i < driverRecords.size(); ++i)
        {
            drivers.add(driverRecords.get(i).getName());
        }
        DefaultComboBoxModel comboBoxModel21 = new DefaultComboBoxModel();
        comboBox21.setModel(comboBoxModel21);
        comboBoxModel21.addAll(drivers);
        DefaultComboBoxModel comboBoxModel22 = new DefaultComboBoxModel();
        comboBox22.setModel(comboBoxModel22);
        comboBoxModel22.addAll(drivers);
        DefaultComboBoxModel comboBoxModel23 = new DefaultComboBoxModel();
        comboBox23.setModel(comboBoxModel23);
        comboBoxModel23.addAll(drivers);
        DefaultComboBoxModel comboBoxModel24 = new DefaultComboBoxModel();
        comboBox24.setModel(comboBoxModel24);
        comboBoxModel24.addAll(drivers);
        DefaultComboBoxModel comboBoxModel25 = new DefaultComboBoxModel();
        comboBox25.setModel(comboBoxModel25);
        comboBoxModel25.addAll(drivers);

        quals1 = new ArrayList<String>(3);
        quals2 = new ArrayList<String>(3);
        quals3 = new ArrayList<String>(3);
        yes = new ArrayList<String>(2);
        experience = new ArrayList<String>(4);
        mf = new ArrayList<String>(3);
        quals1.add("");
        quals1.add("FFT1");
        quals1.add("CRWB(t)");
        quals2.add("");
        quals2.add("FFT1(t)");
        quals2.add("FFT2");
        quals3.add("");
        quals3.add("FFT2");
        quals3.add("FFT1");
        yes.add("");
        yes.add("YES");
        experience.add("");
        experience.add("RED");
        experience.add("BLUE");
        experience.add("YELLOW");
        mf.add("");
        mf.add("M");
        mf.add("F");
        DefaultComboBoxModel comboBoxModel26 = new DefaultComboBoxModel();
        comboBox26.setModel(comboBoxModel26);
        comboBoxModel26.addAll(quals1);
        DefaultComboBoxModel comboBoxModel90 = new DefaultComboBoxModel();
        comboBox90.setModel(comboBoxModel90);
        comboBoxModel90.addAll(quals3);
        DefaultComboBoxModel comboBoxModel27 = new DefaultComboBoxModel();
        comboBox27.setModel(comboBoxModel27);
        comboBoxModel27.addAll(quals2);
        DefaultComboBoxModel comboBoxModel28 = new DefaultComboBoxModel();
        comboBox28.setModel(comboBoxModel28);
        comboBoxModel28.addAll(quals2);
        DefaultComboBoxModel comboBoxModel29 = new DefaultComboBoxModel();
        comboBox29.setModel(comboBoxModel29);
        comboBoxModel29.addAll(quals2);
        DefaultComboBoxModel comboBoxModel30 = new DefaultComboBoxModel();
        comboBox30.setModel(comboBoxModel30);
        comboBoxModel30.addAll(experience);
        DefaultComboBoxModel comboBoxModel31 = new DefaultComboBoxModel();
        comboBox31.setModel(comboBoxModel31);
        comboBoxModel31.addAll(experience);
        DefaultComboBoxModel comboBoxModel32 = new DefaultComboBoxModel();
        comboBox32.setModel(comboBoxModel32);
        comboBoxModel32.addAll(experience);
        DefaultComboBoxModel comboBoxModel33 = new DefaultComboBoxModel();
        comboBox33.setModel(comboBoxModel33);
        comboBoxModel33.addAll(experience);
        DefaultComboBoxModel comboBoxModel34 = new DefaultComboBoxModel();
        comboBox34.setModel(comboBoxModel34);
        comboBoxModel34.addAll(experience);
        DefaultComboBoxModel comboBoxModel35 = new DefaultComboBoxModel();
        comboBox35.setModel(comboBoxModel35);
        comboBoxModel35.addAll(experience);
        DefaultComboBoxModel comboBoxModel36 = new DefaultComboBoxModel();
        comboBox36.setModel(comboBoxModel36);
        comboBoxModel36.addAll(experience);
        DefaultComboBoxModel comboBoxModel37 = new DefaultComboBoxModel();
        comboBox37.setModel(comboBoxModel37);
        comboBoxModel37.addAll(experience);
        DefaultComboBoxModel comboBoxModel38 = new DefaultComboBoxModel();
        comboBox38.setModel(comboBoxModel38);
        comboBoxModel38.addAll(experience);
        DefaultComboBoxModel comboBoxModel39 = new DefaultComboBoxModel();
        comboBox39.setModel(comboBoxModel39);
        comboBoxModel39.addAll(experience);
        DefaultComboBoxModel comboBoxModel40 = new DefaultComboBoxModel();
        comboBox40.setModel(comboBoxModel40);
        comboBoxModel40.addAll(experience);
        DefaultComboBoxModel comboBoxModel41 = new DefaultComboBoxModel();
        comboBox41.setModel(comboBoxModel41);
        comboBoxModel41.addAll(experience);
        DefaultComboBoxModel comboBoxModel42 = new DefaultComboBoxModel();
        comboBox42.setModel(comboBoxModel42);
        comboBoxModel42.addAll(experience);
        DefaultComboBoxModel comboBoxModel43 = new DefaultComboBoxModel();
        comboBox43.setModel(comboBoxModel43);
        comboBoxModel43.addAll(experience);
        DefaultComboBoxModel comboBoxModel44 = new DefaultComboBoxModel();
        comboBox44.setModel(comboBoxModel44);
        comboBoxModel44.addAll(experience);
        DefaultComboBoxModel comboBoxModel45 = new DefaultComboBoxModel();
        comboBox45.setModel(comboBoxModel45);
        comboBoxModel45.addAll(experience);
        DefaultComboBoxModel comboBoxModel46 = new DefaultComboBoxModel();
        comboBox46.setModel(comboBoxModel46);
        comboBoxModel46.addAll(experience);
        DefaultComboBoxModel comboBoxModel47 = new DefaultComboBoxModel();
        comboBox47.setModel(comboBoxModel47);
        comboBoxModel47.addAll(experience);
        DefaultComboBoxModel comboBoxModel48 = new DefaultComboBoxModel();
        comboBox48.setModel(comboBoxModel48);
        comboBoxModel48.addAll(experience);
        DefaultComboBoxModel comboBoxModel49 = new DefaultComboBoxModel();
        comboBox49.setModel(comboBoxModel49);
        comboBoxModel49.addAll(experience);
        DefaultComboBoxModel comboBoxModel50 = new DefaultComboBoxModel();
        comboBox50.setModel(comboBoxModel50);
        comboBoxModel50.addAll(mf);
        DefaultComboBoxModel comboBoxModel51 = new DefaultComboBoxModel();
        comboBox51.setModel(comboBoxModel51);
        comboBoxModel51.addAll(mf);
        DefaultComboBoxModel comboBoxModel52 = new DefaultComboBoxModel();
        comboBox52.setModel(comboBoxModel52);
        comboBoxModel52.addAll(mf);
        DefaultComboBoxModel comboBoxModel53 = new DefaultComboBoxModel();
        comboBox53.setModel(comboBoxModel53);
        comboBoxModel53.addAll(mf);
        DefaultComboBoxModel comboBoxModel54 = new DefaultComboBoxModel();
        comboBox54.setModel(comboBoxModel54);
        comboBoxModel54.addAll(mf);
        DefaultComboBoxModel comboBoxModel55 = new DefaultComboBoxModel();
        comboBox55.setModel(comboBoxModel55);
        comboBoxModel55.addAll(mf);
        DefaultComboBoxModel comboBoxModel56 = new DefaultComboBoxModel();
        comboBox56.setModel(comboBoxModel56);
        comboBoxModel56.addAll(mf);
        DefaultComboBoxModel comboBoxModel57 = new DefaultComboBoxModel();
        comboBox57.setModel(comboBoxModel57);
        comboBoxModel57.addAll(mf);
        DefaultComboBoxModel comboBoxModel58 = new DefaultComboBoxModel();
        comboBox58.setModel(comboBoxModel58);
        comboBoxModel58.addAll(mf);
        DefaultComboBoxModel comboBoxModel59 = new DefaultComboBoxModel();
        comboBox59.setModel(comboBoxModel59);
        comboBoxModel59.addAll(mf);
        DefaultComboBoxModel comboBoxModel60 = new DefaultComboBoxModel();
        comboBox60.setModel(comboBoxModel60);
        comboBoxModel60.addAll(mf);
        DefaultComboBoxModel comboBoxModel61 = new DefaultComboBoxModel();
        comboBox61.setModel(comboBoxModel61);
        comboBoxModel61.addAll(mf);
        DefaultComboBoxModel comboBoxModel62 = new DefaultComboBoxModel();
        comboBox62.setModel(comboBoxModel62);
        comboBoxModel62.addAll(mf);
        DefaultComboBoxModel comboBoxModel63 = new DefaultComboBoxModel();
        comboBox63.setModel(comboBoxModel63);
        comboBoxModel63.addAll(mf);
        DefaultComboBoxModel comboBoxModel64 = new DefaultComboBoxModel();
        comboBox64.setModel(comboBoxModel64);
        comboBoxModel64.addAll(mf);
        DefaultComboBoxModel comboBoxModel65 = new DefaultComboBoxModel();
        comboBox65.setModel(comboBoxModel65);
        comboBoxModel65.addAll(mf);
        DefaultComboBoxModel comboBoxModel66 = new DefaultComboBoxModel();
        comboBox66.setModel(comboBoxModel66);
        comboBoxModel66.addAll(mf);
        DefaultComboBoxModel comboBoxModel67 = new DefaultComboBoxModel();
        comboBox67.setModel(comboBoxModel67);
        comboBoxModel67.addAll(mf);
        DefaultComboBoxModel comboBoxModel68 = new DefaultComboBoxModel();
        comboBox68.setModel(comboBoxModel68);
        comboBoxModel68.addAll(mf);
        DefaultComboBoxModel comboBoxModel69 = new DefaultComboBoxModel();
        comboBox69.setModel(comboBoxModel69);
        comboBoxModel69.addAll(mf);
        DefaultComboBoxModel comboBoxModel70 = new DefaultComboBoxModel();
        comboBox70.setModel(comboBoxModel70);
        comboBoxModel70.addAll(yes);
        DefaultComboBoxModel comboBoxModel71 = new DefaultComboBoxModel();
        comboBox71.setModel(comboBoxModel71);
        comboBoxModel71.addAll(yes);
        DefaultComboBoxModel comboBoxModel72 = new DefaultComboBoxModel();
        comboBox72.setModel(comboBoxModel72);
        comboBoxModel72.addAll(yes);
        DefaultComboBoxModel comboBoxModel73 = new DefaultComboBoxModel();
        comboBox73.setModel(comboBoxModel73);
        comboBoxModel73.addAll(yes);
        DefaultComboBoxModel comboBoxModel74 = new DefaultComboBoxModel();
        comboBox74.setModel(comboBoxModel74);
        comboBoxModel74.addAll(yes);
        DefaultComboBoxModel comboBoxModel75 = new DefaultComboBoxModel();
        comboBox75.setModel(comboBoxModel75);
        comboBoxModel75.addAll(yes);
        DefaultComboBoxModel comboBoxModel76 = new DefaultComboBoxModel();
        comboBox76.setModel(comboBoxModel76);
        comboBoxModel76.addAll(yes);
        DefaultComboBoxModel comboBoxModel77 = new DefaultComboBoxModel();
        comboBox77.setModel(comboBoxModel77);
        comboBoxModel77.addAll(yes);
        DefaultComboBoxModel comboBoxModel78 = new DefaultComboBoxModel();
        comboBox78.setModel(comboBoxModel78);
        comboBoxModel78.addAll(yes);
        DefaultComboBoxModel comboBoxModel79 = new DefaultComboBoxModel();
        comboBox79.setModel(comboBoxModel79);
        comboBoxModel79.addAll(yes);
        DefaultComboBoxModel comboBoxModel80 = new DefaultComboBoxModel();
        comboBox80.setModel(comboBoxModel80);
        comboBoxModel80.addAll(yes);
        DefaultComboBoxModel comboBoxModel81 = new DefaultComboBoxModel();
        comboBox81.setModel(comboBoxModel81);
        comboBoxModel81.addAll(yes);
        DefaultComboBoxModel comboBoxModel82 = new DefaultComboBoxModel();
        comboBox82.setModel(comboBoxModel82);
        comboBoxModel82.addAll(yes);
        DefaultComboBoxModel comboBoxModel83 = new DefaultComboBoxModel();
        comboBox83.setModel(comboBoxModel83);
        comboBoxModel83.addAll(yes);
        DefaultComboBoxModel comboBoxModel84 = new DefaultComboBoxModel();
        comboBox84.setModel(comboBoxModel84);
        comboBoxModel84.addAll(yes);
        DefaultComboBoxModel comboBoxModel85 = new DefaultComboBoxModel();
        comboBox85.setModel(comboBoxModel85);
        comboBoxModel85.addAll(yes);
        DefaultComboBoxModel comboBoxModel86 = new DefaultComboBoxModel();
        comboBox86.setModel(comboBoxModel86);
        comboBoxModel86.addAll(yes);
        DefaultComboBoxModel comboBoxModel87 = new DefaultComboBoxModel();
        comboBox87.setModel(comboBoxModel87);
        comboBoxModel87.addAll(yes);
        DefaultComboBoxModel comboBoxModel88 = new DefaultComboBoxModel();
        comboBox88.setModel(comboBoxModel88);
        comboBoxModel88.addAll(yes);
        DefaultComboBoxModel comboBoxModel89 = new DefaultComboBoxModel();
        comboBox89.setModel(comboBoxModel89);
        comboBoxModel89.addAll(yes);


        int i;
        int n;
        if(vehicleRecords != null)
        {
            n = vehicleRecords.size() + 1;
            vehicles = new ArrayList<String>(n);
            vehicles.add("");
            for (i = 1; i < n; ++i)
            {
                vehicles.add(vehicleRecords.get(i-1).getVehicleNo() + " -  " + vehicleRecords.get(i-1).getMakeModel());
            }
            licences = new ArrayList<String>(n);
            licences.add("");
            for (i = 1; i < n; ++i)
            {
                licences.add(vehicleRecords.get(i-1).getVehicleLicence());
            }
            comboBox91.setEditable(true);
            comboBox92.setEditable(true);
            comboBox93.setEditable(true);
            comboBox94.setEditable(true);
            comboBox95.setEditable(true);
            comboBox96.setEditable(true);
            comboBox97.setEditable(true);
            comboBox98.setEditable(true);
            comboBox99.setEditable(true);
            comboBox100.setEditable(true);
        }
        else
        {
            n = 1;
            vehicles = new ArrayList<String>(1);
            vehicles.add("");
            licences = new ArrayList<String>(1);
            licences.add("");
            comboBox91.setEditable(true);
            comboBox92.setEditable(true);
            comboBox93.setEditable(true);
            comboBox94.setEditable(true);
            comboBox95.setEditable(true);
            comboBox96.setEditable(true);
            comboBox97.setEditable(true);
            comboBox98.setEditable(true);
            comboBox99.setEditable(true);
            comboBox100.setEditable(true);
        }
        DefaultComboBoxModel comboBoxModel190 = new DefaultComboBoxModel();
        comboBox91.setModel(comboBoxModel190);
        comboBoxModel190.addAll(vehicles);
        DefaultComboBoxModel comboBoxModel191 = new DefaultComboBoxModel();
        comboBox92.setModel(comboBoxModel191);
        comboBoxModel191.addAll(vehicles);
        DefaultComboBoxModel comboBoxModel192 = new DefaultComboBoxModel();
        comboBox93.setModel(comboBoxModel192);
        comboBoxModel192.addAll(vehicles);
        DefaultComboBoxModel comboBoxModel193 = new DefaultComboBoxModel();
        comboBox94.setModel(comboBoxModel193);
        comboBoxModel193.addAll(vehicles);
        DefaultComboBoxModel comboBoxModel194 = new DefaultComboBoxModel();
        comboBox95.setModel(comboBoxModel194);
        comboBoxModel194.addAll(vehicles);
        DefaultComboBoxModel comboBoxModel195 = new DefaultComboBoxModel();
        comboBox96.setModel(comboBoxModel195);
        comboBoxModel195.addAll(licences);
        DefaultComboBoxModel comboBoxModel196 = new DefaultComboBoxModel();
        comboBox97.setModel(comboBoxModel196);
        comboBoxModel196.addAll(licences);
        DefaultComboBoxModel comboBoxModel197 = new DefaultComboBoxModel();
        comboBox98.setModel(comboBoxModel197);
        comboBoxModel197.addAll(licences);
        DefaultComboBoxModel comboBoxModel198 = new DefaultComboBoxModel();
        comboBox99.setModel(comboBoxModel198);
        comboBoxModel198.addAll(licences);
        DefaultComboBoxModel comboBoxModel199 = new DefaultComboBoxModel();
        comboBox100.setModel(comboBoxModel199);
        comboBoxModel199.addAll(licences);

        recordSelected = new int[20];
        driverSelected = new int[5];
        vehicleSelected = new int[5];
        for(i = 0; i < recordSelected.length; ++i)
            recordSelected[i] = -1;
        for(i = 0; i < driverSelected.length; ++i)
            driverSelected[i] = -1;
        for(i = 0; i < vehicleSelected.length; ++i)
            vehicleSelected[i] = -1;


        comboBox1.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel1.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) { }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel1.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(crwbRecords.size());
                for(int i = 0; i < crwbRecords.size(); ++i)
                    tempList.add(crwbRecords.get(i).getName());

                comboBoxModel1.addAll(tempList);
            }
        });
        comboBox1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {
                    recordSelected[0] = crwbRecords.get(i).getRecordNo();
                    textField20.setText(crwbRecords.get(i).getIdNo().toUpperCase());
                    textField22.setText(crwbRecords.get(i).getSawyer().toUpperCase());

                    comboBox1.setEnabled(false);
                    clearButton1.setEnabled(true);
                    usedRecords.add(crwbRecords.get(i));
                    crwbRecords.remove(i);
                }
            }
        });
        clearButton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton1)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[0])
                        {
                            textField20.setText("");
                            textField22.setText("");
                            comboBox30.setSelectedIndex(0);
                            comboBox50.setSelectedIndex(0);
                            comboBox70.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[0] = -1;
                                comboBoxModel1.removeAllElements();
                                clearButton1.setEnabled(false);
                                comboBox1.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[0] = -1;
                                comboBoxModel1.removeAllElements();
                                clearButton1.setEnabled(false);
                                comboBox1.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[0] = -1;
                                comboBoxModel1.removeAllElements();
                                clearButton1.setEnabled(false);
                                comboBox1.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });

        comboBox2.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel2.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
                //System.out.println("popupMenu will become invisible");
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel2.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(crwbRecords.size() + fft1Records.size());
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                for(int i = 0; i < crwbRecords.size(); ++i)
                {
                    tempList.add(crwbRecords.get(i).getName());
                }
                comboBoxModel2.addAll(tempList);
            }
        });
        comboBox2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft1Records.size())
                    {
                        recordSelected[1] = fft1Records.get(i).getRecordNo();
                        textField27.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField29.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox2.setEnabled(false);
                        clearButton2.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft1Records.size();
                        recordSelected[1] = crwbRecords.get(i).getRecordNo();
                        textField27.setText(crwbRecords.get(i).getIdNo().toUpperCase());
                        textField29.setText(crwbRecords.get(i).getSawyer().toUpperCase());
                        usedRecords.add(crwbRecords.get(i));
                        crwbRecords.remove(i);
                        comboBox2.setEnabled(false);
                        clearButton2.setEnabled(true);
                    }
                }
            }
        });
        clearButton2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton2)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[1])
                        {
                            textField27.setText("");
                            textField29.setText("");
                            comboBox31.setSelectedIndex(0);
                            comboBox51.setSelectedIndex(0);
                            comboBox71.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[1] = -1;
                                comboBoxModel2.removeAllElements();
                                clearButton2.setEnabled(false);
                                comboBox2.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[1] = -1;
                                comboBoxModel2.removeAllElements();
                                clearButton2.setEnabled(false);
                                comboBox2.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[1] = -1;
                                comboBoxModel2.removeAllElements();
                                clearButton2.setEnabled(false);
                                comboBox2.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });

        comboBox3.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel3.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel3.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel3.addAll(tempList);
            }
        });
        comboBox3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[2] = fft2Records.get(i).getRecordNo();
                        textField34.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField36.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox3.setEnabled(false);
                        clearButton3.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[2] = fft1Records.get(i).getRecordNo();
                        textField34.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField36.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox3.setEnabled(false);
                        clearButton3.setEnabled(true);
                    }
                }
            }
        });
        clearButton3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton3)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[2])
                        {
                            textField34.setText("");
                            textField36.setText("");
                            comboBox32.setSelectedIndex(0);
                            comboBox52.setSelectedIndex(0);
                            comboBox72.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[2] = -1;
                                comboBoxModel3.removeAllElements();
                                clearButton3.setEnabled(false);
                                comboBox3.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[2] = -1;
                                comboBoxModel3.removeAllElements();
                                clearButton3.setEnabled(false);
                                comboBox3.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[2] = -1;
                                comboBoxModel3.removeAllElements();
                                clearButton3.setEnabled(false);
                                comboBox3.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox4.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel4.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel4.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel4.addAll(tempList);
            }
        });
        comboBox4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[3] = fft2Records.get(i).getRecordNo();
                        textField41.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField43.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox4.setEnabled(false);
                        clearButton4.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[3] = fft1Records.get(i).getRecordNo();
                        textField41.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField43.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox4.setEnabled(false);
                        clearButton4.setEnabled(true);
                    }
                }
            }
        });
        clearButton4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton4)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[3])
                        {
                            textField41.setText("");
                            textField43.setText("");
                            comboBox33.setSelectedIndex(0);
                            comboBox53.setSelectedIndex(0);
                            comboBox73.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[3] = -1;
                                comboBoxModel4.removeAllElements();
                                clearButton4.setEnabled(false);
                                comboBox4.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[3] = -1;
                                comboBoxModel4.removeAllElements();
                                clearButton4.setEnabled(false);
                                comboBox4.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[3] = -1;
                                comboBoxModel4.removeAllElements();
                                clearButton4.setEnabled(false);
                                comboBox4.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox5.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel5.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel5.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel5.addAll(tempList);
            }
        });
        comboBox5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[4] = fft2Records.get(i).getRecordNo();
                        textField48.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField50.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox5.setEnabled(false);
                        clearButton5.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[4] = fft1Records.get(i).getRecordNo();
                        textField48.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField50.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox5.setEnabled(false);
                        clearButton5.setEnabled(true);
                    }
                }
            }
        });
        clearButton5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton5)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[4])
                        {
                            textField48.setText("");
                            textField50.setText("");
                            comboBox34.setSelectedIndex(0);
                            comboBox54.setSelectedIndex(0);
                            comboBox74.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[4] = -1;
                                comboBoxModel5.removeAllElements();
                                clearButton5.setEnabled(false);
                                comboBox5.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[4] = -1;
                                comboBoxModel5.removeAllElements();
                                clearButton5.setEnabled(false);
                                comboBox5.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[4] = -1;
                                comboBoxModel5.removeAllElements();
                                clearButton5.setEnabled(false);
                                comboBox5.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox6.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel6.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel6.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel6.addAll(tempList);
            }
        });
        comboBox6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[5] = fft2Records.get(i).getRecordNo();
                        textField55.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField57.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox6.setEnabled(false);
                        clearButton6.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[5] = fft1Records.get(i).getRecordNo();
                        textField55.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField57.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox6.setEnabled(false);
                        clearButton6.setEnabled(true);
                    }
                }
            }
        });
        clearButton6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton6)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[5])
                        {
                            textField55.setText("");
                            textField57.setText("");
                            comboBox35.setSelectedIndex(0);
                            comboBox55.setSelectedIndex(0);
                            comboBox75.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[5] = -1;
                                comboBoxModel6.removeAllElements();
                                clearButton6.setEnabled(false);
                                comboBox6.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[5] = -1;
                                comboBoxModel6.removeAllElements();
                                clearButton6.setEnabled(false);
                                comboBox6.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[5] = -1;
                                comboBoxModel6.removeAllElements();
                                clearButton6.setEnabled(false);
                                comboBox6.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox7.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel7.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel7.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel7.addAll(tempList);
            }
        });
        comboBox7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[6] = fft2Records.get(i).getRecordNo();
                        textField62.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField64.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox7.setEnabled(false);
                        clearButton7.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[6] = fft1Records.get(i).getRecordNo();
                        textField62.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField64.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox7.setEnabled(false);
                        clearButton7.setEnabled(true);
                    }
                }
            }
        });
        clearButton7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton7)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[6])
                        {
                            textField62.setText("");
                            textField64.setText("");
                            comboBox36.setSelectedIndex(0);
                            comboBox56.setSelectedIndex(0);
                            comboBox76.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[6] = -1;
                                comboBoxModel7.removeAllElements();
                                clearButton7.setEnabled(false);
                                comboBox7.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[6] = -1;
                                comboBoxModel7.removeAllElements();
                                clearButton7.setEnabled(false);
                                comboBox7.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[6] = -1;
                                comboBoxModel7.removeAllElements();
                                clearButton7.setEnabled(false);
                                comboBox7.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox8.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel8.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel8.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel8.addAll(tempList);
            }
        });
        comboBox8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[7] = fft2Records.get(i).getRecordNo();
                        textField69.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField71.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox8.setEnabled(false);
                        clearButton8.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[7] = fft1Records.get(i).getRecordNo();
                        textField69.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField71.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox8.setEnabled(false);
                        clearButton8.setEnabled(true);
                    }
                }
            }
        });
        clearButton8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton8)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[7])
                        {
                            textField69.setText("");
                            textField71.setText("");
                            comboBox37.setSelectedIndex(0);
                            comboBox57.setSelectedIndex(0);
                            comboBox77.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[7] = -1;
                                comboBoxModel8.removeAllElements();
                                clearButton8.setEnabled(false);
                                comboBox8.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[7] = -1;
                                comboBoxModel8.removeAllElements();
                                clearButton8.setEnabled(false);
                                comboBox8.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[7] = -1;
                                comboBoxModel8.removeAllElements();
                                clearButton8.setEnabled(false);
                                comboBox8.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox9.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel9.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel9.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel9.addAll(tempList);
            }
        });
        comboBox9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[8] = fft2Records.get(i).getRecordNo();
                        textField76.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField78.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox9.setEnabled(false);
                        clearButton9.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[8] = fft1Records.get(i).getRecordNo();
                        textField76.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField78.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox9.setEnabled(false);
                        clearButton9.setEnabled(true);
                    }
                }
            }
        });
        clearButton9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton9)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[8])
                        {
                            textField76.setText("");
                            textField78.setText("");
                            comboBox38.setSelectedIndex(0);
                            comboBox58.setSelectedIndex(0);
                            comboBox78.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[8] = -1;
                                comboBoxModel9.removeAllElements();
                                clearButton9.setEnabled(false);
                                comboBox9.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[8] = -1;
                                comboBoxModel9.removeAllElements();
                                clearButton9.setEnabled(false);
                                comboBox9.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[8] = -1;
                                comboBoxModel9.removeAllElements();
                                clearButton9.setEnabled(false);
                                comboBox9.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox10.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel10.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel10.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel10.addAll(tempList);
            }
        });
        comboBox10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[9] = fft2Records.get(i).getRecordNo();
                        textField83.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField85.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox10.setEnabled(false);
                        clearButton10.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[9] = fft1Records.get(i).getRecordNo();
                        textField83.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField85.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox10.setEnabled(false);
                        clearButton10.setEnabled(true);
                    }
                }
            }
        });
        clearButton10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton10)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[9])
                        {
                            textField83.setText("");
                            textField85.setText("");
                            comboBox39.setSelectedIndex(0);
                            comboBox59.setSelectedIndex(0);
                            comboBox79.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[9] = -1;
                                comboBoxModel10.removeAllElements();
                                clearButton10.setEnabled(false);
                                comboBox10.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[9] = -1;
                                comboBoxModel10.removeAllElements();
                                clearButton10.setEnabled(false);
                                comboBox10.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[9] = -1;
                                comboBoxModel10.removeAllElements();
                                clearButton10.setEnabled(false);
                                comboBox10.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox11.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel11.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel11.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(crwbRecords.size() + fft1Records.size());
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                for(int i = 0; i < crwbRecords.size(); ++i)
                {
                    tempList.add(crwbRecords.get(i).getName());
                }
                comboBoxModel11.addAll(tempList);
            }
        });
        comboBox11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft1Records.size())
                    {
                        recordSelected[10] = fft1Records.get(i).getRecordNo();
                        textField90.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField92.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox11.setEnabled(false);
                        clearButton11.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft1Records.size();
                        recordSelected[10] = crwbRecords.get(i).getRecordNo();
                        textField90.setText(crwbRecords.get(i).getIdNo().toUpperCase());
                        textField92.setText(crwbRecords.get(i).getSawyer().toUpperCase());
                        usedRecords.add(crwbRecords.get(i));
                        crwbRecords.remove(i);
                        comboBox11.setEnabled(false);
                        clearButton11.setEnabled(true);
                    }
                }
            }
        });
        clearButton11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton11)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[10])
                        {
                            textField90.setText("");
                            textField92.setText("");
                            comboBox40.setSelectedIndex(0);
                            comboBox60.setSelectedIndex(0);
                            comboBox80.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[10] = -1;
                                comboBoxModel11.removeAllElements();
                                clearButton11.setEnabled(false);
                                comboBox11.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[10] = -1;
                                comboBoxModel11.removeAllElements();
                                clearButton11.setEnabled(false);
                                comboBox11.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[10] = -1;
                                comboBoxModel11.removeAllElements();
                                clearButton11.setEnabled(false);
                                comboBox11.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox12.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel12.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel12.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel12.addAll(tempList);
            }
        });
        comboBox12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[11] = fft2Records.get(i).getRecordNo();
                        textField97.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField99.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox12.setEnabled(false);
                        clearButton12.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[11] = fft1Records.get(i).getRecordNo();
                        textField97.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField99.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox12.setEnabled(false);
                        clearButton12.setEnabled(true);
                    }
                }
            }
        });
        clearButton12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton12)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[11])
                        {
                            textField97.setText("");
                            textField99.setText("");
                            comboBox41.setSelectedIndex(0);
                            comboBox61.setSelectedIndex(0);
                            comboBox81.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[11] = -1;
                                comboBoxModel12.removeAllElements();
                                clearButton12.setEnabled(false);
                                comboBox12.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[11] = -1;
                                comboBoxModel12.removeAllElements();
                                clearButton12.setEnabled(false);
                                comboBox12.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[11] = -1;
                                comboBoxModel12.removeAllElements();
                                clearButton12.setEnabled(false);
                                comboBox12.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox13.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel13.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel13.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel13.addAll(tempList);
            }
        });
        comboBox13.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[12] = fft2Records.get(i).getRecordNo();
                        textField104.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField106.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox13.setEnabled(false);
                        clearButton13.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[12] = fft1Records.get(i).getRecordNo();
                        textField104.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField106.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox13.setEnabled(false);
                        clearButton13.setEnabled(true);
                    }
                }
            }
        });
        clearButton13.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton13)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[12])
                        {
                            textField104.setText("");
                            textField106.setText("");
                            comboBox42.setSelectedIndex(0);
                            comboBox62.setSelectedIndex(0);
                            comboBox82.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[12] = -1;
                                comboBoxModel13.removeAllElements();
                                clearButton13.setEnabled(false);
                                comboBox13.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[12] = -1;
                                comboBoxModel13.removeAllElements();
                                clearButton13.setEnabled(false);
                                comboBox13.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[12] = -1;
                                comboBoxModel13.removeAllElements();
                                clearButton13.setEnabled(false);
                                comboBox13.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox14.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel14.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel14.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel14.addAll(tempList);
            }
        });
        comboBox14.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[13] = fft2Records.get(i).getRecordNo();
                        textField111.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField113.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox14.setEnabled(false);
                        clearButton14.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[13] = fft1Records.get(i).getRecordNo();
                        textField111.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField113.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox14.setEnabled(false);
                        clearButton14.setEnabled(true);
                    }
                }
            }
        });
        clearButton14.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton14)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[13])
                        {
                            textField111.setText("");
                            textField113.setText("");
                            comboBox43.setSelectedIndex(0);
                            comboBox63.setSelectedIndex(0);
                            comboBox83.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[13] = -1;
                                comboBoxModel14.removeAllElements();
                                clearButton14.setEnabled(false);
                                comboBox14.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[13] = -1;
                                comboBoxModel14.removeAllElements();
                                clearButton14.setEnabled(false);
                                comboBox14.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[13] = -1;
                                comboBoxModel14.removeAllElements();
                                clearButton14.setEnabled(false);
                                comboBox14.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox15.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel15.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel15.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel15.addAll(tempList);
            }
        });
        comboBox15.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[14] = fft2Records.get(i).getRecordNo();
                        textField118.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField120.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox15.setEnabled(false);
                        clearButton15.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[14] = fft1Records.get(i).getRecordNo();
                        textField118.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField120.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox15.setEnabled(false);
                        clearButton15.setEnabled(true);
                    }
                }
            }
        });
        clearButton15.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton15)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[14])
                        {
                            textField118.setText("");
                            textField120.setText("");
                            comboBox44.setSelectedIndex(0);
                            comboBox64.setSelectedIndex(0);
                            comboBox84.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[14] = -1;
                                comboBoxModel15.removeAllElements();
                                clearButton15.setEnabled(false);
                                comboBox15.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[14] = -1;
                                comboBoxModel15.removeAllElements();
                                clearButton15.setEnabled(false);
                                comboBox15.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[14] = -1;
                                comboBoxModel15.removeAllElements();
                                clearButton15.setEnabled(false);
                                comboBox15.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox16.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel16.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel16.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel16.addAll(tempList);
            }
        });
        comboBox16.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[15] = fft2Records.get(i).getRecordNo();
                        textField125.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField127.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox16.setEnabled(false);
                        clearButton16.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[15] = fft1Records.get(i).getRecordNo();
                        textField125.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField127.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox16.setEnabled(false);
                        clearButton16.setEnabled(true);
                    }
                }
            }
        });
        clearButton16.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton16)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[15])
                        {
                            textField125.setText("");
                            textField127.setText("");
                            comboBox45.setSelectedIndex(0);
                            comboBox65.setSelectedIndex(0);
                            comboBox85.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[15] = -1;
                                comboBoxModel16.removeAllElements();
                                clearButton16.setEnabled(false);
                                comboBox16.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[15] = -1;
                                comboBoxModel16.removeAllElements();
                                clearButton16.setEnabled(false);
                                comboBox16.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[15] = -1;
                                comboBoxModel16.removeAllElements();
                                clearButton16.setEnabled(false);
                                comboBox16.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox17.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel17.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel17.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel17.addAll(tempList);
            }
        });
        comboBox17.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[16] = fft2Records.get(i).getRecordNo();
                        textField132.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField134.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox17.setEnabled(false);
                        clearButton17.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[16] = fft1Records.get(i).getRecordNo();
                        textField132.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField134.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox17.setEnabled(false);
                        clearButton17.setEnabled(true);
                    }
                }
            }
        });
        clearButton17.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton17)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[16])
                        {
                            textField132.setText("");
                            textField134.setText("");
                            comboBox27.setSelectedIndex(0);
                            comboBox46.setSelectedIndex(0);
                            comboBox66.setSelectedIndex(0);
                            comboBox86.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[16] = -1;
                                comboBoxModel17.removeAllElements();
                                clearButton17.setEnabled(false);
                                comboBox17.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[16] = -1;
                                comboBoxModel17.removeAllElements();
                                clearButton17.setEnabled(false);
                                comboBox17.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[16] = -1;
                                comboBoxModel17.removeAllElements();
                                clearButton17.setEnabled(false);
                                comboBox17.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox18.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel18.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel18.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel18.addAll(tempList);
            }
        });
        comboBox18.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[17] = fft2Records.get(i).getRecordNo();
                        textField139.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField141.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox18.setEnabled(false);
                        clearButton18.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[17] = fft1Records.get(i).getRecordNo();
                        textField139.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField141.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox18.setEnabled(false);
                        clearButton18.setEnabled(true);
                    }
                }
            }
        });
        clearButton18.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton18)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[17])
                        {
                            textField139.setText("");
                            textField141.setText("");
                            comboBox28.setSelectedIndex(0);
                            comboBox47.setSelectedIndex(0);
                            comboBox67.setSelectedIndex(0);
                            comboBox87.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[17] = -1;
                                comboBoxModel18.removeAllElements();
                                clearButton18.setEnabled(false);
                                comboBox18.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[17] = -1;
                                comboBoxModel18.removeAllElements();
                                clearButton18.setEnabled(false);
                                comboBox18.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[17] = -1;
                                comboBoxModel18.removeAllElements();
                                clearButton18.setEnabled(false);
                                comboBox18.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox19.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel19.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel19.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(fft1Records.size() + fft2Records.size());
                for(int i = 0; i < fft2Records.size(); ++i)
                {
                    tempList.add(fft2Records.get(i).getName());
                }
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                comboBoxModel19.addAll(tempList);
            }
        });
        comboBox19.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft2Records.size())
                    {
                        recordSelected[18] = fft2Records.get(i).getRecordNo();
                        textField146.setText(fft2Records.get(i).getIdNo().toUpperCase());
                        textField148.setText(fft2Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft2Records.get(i));
                        fft2Records.remove(i);
                        comboBox19.setEnabled(false);
                        clearButton19.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft2Records.size();
                        recordSelected[18] = fft1Records.get(i).getRecordNo();
                        textField146.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField148.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox19.setEnabled(false);
                        clearButton19.setEnabled(true);
                    }
                }
            }
        });
        clearButton19.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton19)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[18])
                        {
                            textField146.setText("");
                            textField148.setText("");
                            comboBox29.setSelectedIndex(0);
                            comboBox48.setSelectedIndex(0);
                            comboBox68.setSelectedIndex(0);
                            comboBox88.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[18] = -1;
                                comboBoxModel19.removeAllElements();
                                clearButton19.setEnabled(false);
                                comboBox19.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[18] = -1;
                                comboBoxModel19.removeAllElements();
                                clearButton19.setEnabled(false);
                                comboBox19.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[18] = -1;
                                comboBoxModel19.removeAllElements();
                                clearButton19.setEnabled(false);
                                comboBox19.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });
        comboBox20.addPopupMenuListener(new PopupMenuListener()
        {
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                comboBoxModel20.removeAllElements();
            }
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
            }
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                comboBoxModel20.removeAllElements();
                ArrayList<String> tempList = new ArrayList<String>(crwbRecords.size() + fft1Records.size());
                for(int i = 0; i < fft1Records.size(); ++i)
                {
                    tempList.add(fft1Records.get(i).getName());
                }
                for(int i = 0; i < crwbRecords.size(); ++i)
                {
                    tempList.add(crwbRecords.get(i).getName());
                }
                comboBoxModel20.addAll(tempList);
            }
        });
        comboBox20.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i != -1)
                {

                    if(i < fft1Records.size())
                    {
                        recordSelected[19] = fft1Records.get(i).getRecordNo();
                        textField153.setText(fft1Records.get(i).getIdNo().toUpperCase());
                        textField155.setText(fft1Records.get(i).getSawyer().toUpperCase());
                        usedRecords.add(fft1Records.get(i));
                        fft1Records.remove(i);
                        comboBox20.setEnabled(false);
                        clearButton20.setEnabled(true);
                    }
                    else
                    {
                        i = i - fft1Records.size();
                        recordSelected[19] = crwbRecords.get(i).getRecordNo();
                        textField153.setText(crwbRecords.get(i).getIdNo().toUpperCase());
                        textField155.setText(crwbRecords.get(i).getSawyer().toUpperCase());
                        usedRecords.add(crwbRecords.get(i));
                        crwbRecords.remove(i);
                        comboBox20.setEnabled(false);
                        clearButton20.setEnabled(true);
                    }
                }
            }
        });
        clearButton20.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == clearButton20)
                {
                    for(Record r : usedRecords)
                    {
                        if(r.getRecordNo() == recordSelected[19])
                        {
                            textField153.setText("");
                            textField155.setText("");
                            comboBox69.setSelectedIndex(0);
                            comboBox89.setSelectedIndex(0);
                            comboBox49.setSelectedIndex(0);
                            if(r.getQual().equalsIgnoreCase("FFT2"))
                            {
                                fft2Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[19] = -1;
                                comboBoxModel20.removeAllElements();
                                clearButton20.setEnabled(false);
                                comboBox20.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("FFT1"))
                            {
                                fft1Records.add(r);
                                usedRecords.remove(r);
                                recordSelected[19] = -1;
                                comboBoxModel20.removeAllElements();
                                clearButton20.setEnabled(false);
                                comboBox20.setEnabled(true);
                                break;
                            }
                            else if(r.getQual().equalsIgnoreCase("CRWB"))
                            {
                                crwbRecords.add(r);
                                usedRecords.remove(r);
                                recordSelected[19] = -1;
                                comboBoxModel20.removeAllElements();
                                clearButton20.setEnabled(false);
                                comboBox20.setEnabled(true);
                                break;
                            }
                        }
                    }
                }
            }
        });

        comboBox21.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i == 0)
                {
                    driverSelected[0] = -1;
                }
                else if(i != -1)
                {
                    driverSelected[0] = driverRecords.get(i-1).getRecordNo();

                    textField19.setText(driverRecords.get(i-1).getMspaDate());
                }
            }
        });
        comboBox22.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i == 0)
                {
                    driverSelected[1] = -1;
                }
                else if(i != -1)
                {
                    driverSelected[1] = driverRecords.get(i-1).getRecordNo();

                    textField33.setText(driverRecords.get(i-1).getMspaDate());
                }
            }
        });
        comboBox23.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i == 0)
                {
                    driverSelected[2] = -1;
                }
                else if(i != -1)
                {
                    driverSelected[2] = driverRecords.get(i-1).getRecordNo();

                    textField47.setText(driverRecords.get(i-1).getMspaDate());
                }
            }
        });
        comboBox24.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i == 0)
                {
                    driverSelected[3] = -1;
                }
                else if(i != -1)
                {
                    driverSelected[3] = driverRecords.get(i-1).getRecordNo();

                    textField61.setText(driverRecords.get(i-1).getMspaDate());
                }
            }
        });
        comboBox25.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();
                if(i == 0)
                {
                    driverSelected[4] = -1;
                }
                else if(i != -1)
                {
                    driverSelected[4] = driverRecords.get(i-1).getRecordNo();

                    textField75.setText(driverRecords.get(i-1).getMspaDate());
                }
            }
        });

        comboBox91.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox96.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox96.setSelectedIndex(i);
                }
            }
        });
        comboBox96.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox91.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox91.setSelectedIndex(i);
                }
            }
        });
        comboBox92.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox97.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox97.setSelectedIndex(i);
                }
            }
        });
        comboBox97.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox92.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox92.setSelectedIndex(i);
                }
            }
        });
        comboBox93.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox98.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox98.setSelectedIndex(i);
                }
            }
        });
        comboBox98.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox93.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox93.setSelectedIndex(i);
                }
            }
        });
        comboBox94.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox99.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox99.setSelectedIndex(i);
                }
            }
        });
        comboBox99.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox94.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox94.setSelectedIndex(i);
                }
            }
        });
        comboBox95.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox100.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox100.setSelectedIndex(i);
                }
            }
        });
        comboBox100.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox cb = (JComboBox) e.getSource();
                int i = cb.getSelectedIndex();

                if(i == 0)
                {
                    vehicleSelected[0] = -1;
                    comboBox95.setSelectedIndex(0);
                }
                else if(i != -1)
                {
                    vehicleSelected[0] = vehicleRecords.get(i-1).getVehicleNo();
                    comboBox95.setSelectedIndex(i);
                }
            }
        });


        finishButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == finishButton)
                {
                    try
                    {
                        LocalDate todayLocalDate = LocalDate.now();
                        LocalDate expLocalDate = LocalDate.of(2019,11,1);
                        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String today = sdf.format(todayLocalDate);
                        String exp = sdf.format(expLocalDate);

                        if(todayLocalDate.isAfter(expLocalDate))
                        {
                            JOptionPane.showMessageDialog(ManifestPane.this, "This version expired " + exp + "\nContact the developer");
                        }
                        else
                        {
                            manifestPDF(usedRecords, driverRecords, vehicleRecords, recordSelected, driverSelected, vehicleSelected);
                        }

                    } catch (Exception ex) { ex.printStackTrace(); }

                }
            }
        });
        fillButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == fillButton)
                {
                    try(InputStream is = new FileInputStream("res\\config.properties")) {
                        Properties prop = new Properties();
                        prop.load(is);
                        textField5.setText(prop.getProperty("contractor"));
                        textField6.setText(prop.getProperty("agreementNum"));
                        textField8.setText(prop.getProperty("contractorRep"));
                        textField9.setText(prop.getProperty("contactPhone"));
                    } catch (IOException ex) { ex.printStackTrace(); }

                }
            }
        });
    }

    public void manifestPDF(ArrayList<Record> usedRecords, ArrayList<Record> driverRecords, ArrayList<Vehicle> vehicleRecords, int [] recordSelected, int [] driverSelected, int [] vehicleSelected)
    {
        try
        {

            String outputFile = new String();
            String incident = new String(textField2.getText());
            String resource = new String(textField4.getText());
            String boss = new String("");
            if(recordSelected[0] != -1)
            {
                for (Record r : usedRecords)
                {
                    if (r.getRecordNo() == recordSelected[0])
                    {
                        boss += r.getName();
                        break;
                    }
                }
            }
            String [] names = new String[20];
            DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy hh_mm_ss");
            Date date = new Date();
            if(!incident.isBlank())
                outputFile = incident + " ";
            if(!resource.isBlank())
                outputFile += resource + " ";
            if(!boss.isBlank())
                outputFile += boss + " ";
            outputFile += dateFormat.format(date) + ".pdf";

            outputFile = JOptionPane.showInputDialog(this, "Save manifest PDF as...", outputFile);
            if(outputFile == null)
                return;
            //JOptionPane.showMessageDialog(App.this, "Final Company Manifest Required\n Format must follow instructions on sheet 1", "Bad File", JOptionPane.INFORMATION_MESSAGE);

            File file = new File("res\\template.pdf");
            PDDocument document = PDDocument.load(file);
            PDDocumentCatalog catalog = document.getDocumentCatalog();
            PDAcroForm acroForm = catalog.getAcroForm();


            acroForm.getField("0_0").setValue(textField1.getText());
            acroForm.getField("0_1").setValue(textField2.getText());
            acroForm.getField("0_2").setValue(textField3.getText());
            acroForm.getField("0_3").setValue(textField4.getText());

            acroForm.getField("0_4").setValue(textField5.getText());
            acroForm.getField("0_5").setValue(textField6.getText());
            acroForm.getField("0_6").setValue(textField7.getText());

            acroForm.getField("0_7").setValue(textField8.getText());
            acroForm.getField("0_8").setValue(textField9.getText());
            acroForm.getField("0_9").setValue(textField10.getText());

            acroForm.getField("0_10").setValue(textField11.getText());
            acroForm.getField("0_11").setValue(textField17.getText());
            acroForm.getField("0_12").setValue(textField12.getText());
            acroForm.getField("0_13").setValue(textField13.getText());
            acroForm.getField("0_14").setValue(textField14.getText());
            acroForm.getField("0_15").setValue(textField16.getText());
            acroForm.getField("0_16").setValue(textField15.getText());

            for(int i = 0; i < 20; ++i)
            {
                if(recordSelected[i] != -1)
                {
                    for (Record r : usedRecords)
                    {
                        if (r.getRecordNo() == recordSelected[i])
                        {
                            names[i] = new String(r.getName());
                            break;
                        }
                    }
                }
            }
            acroForm.getField("1_0").setValue(names[0]);
            acroForm.getField("2_0").setValue(names[1]);
            acroForm.getField("3_0").setValue(names[2]);
            acroForm.getField("4_0").setValue(names[3]);
            acroForm.getField("5_0").setValue(names[4]);
            acroForm.getField("6_0").setValue(names[5]);
            acroForm.getField("7_0").setValue(names[6]);
            acroForm.getField("8_0").setValue(names[7]);
            acroForm.getField("9_0").setValue(names[8]);
            acroForm.getField("10_0").setValue(names[9]);
            acroForm.getField("11_0").setValue(names[10]);
            acroForm.getField("12_0").setValue(names[11]);
            acroForm.getField("13_0").setValue(names[12]);
            acroForm.getField("14_0").setValue(names[13]);
            acroForm.getField("15_0").setValue(names[14]);
            acroForm.getField("16_0").setValue(names[15]);
            acroForm.getField("17_0").setValue(names[16]);
            acroForm.getField("18_0").setValue(names[17]);
            acroForm.getField("19_0").setValue(names[18]);
            acroForm.getField("20_0").setValue(names[19]);

            if(comboBox50.getSelectedIndex() != -1)
            {
                if (comboBox50.getSelectedItem().toString().equals("M"))
                    acroForm.getField("1_1").setValue("X");
                else if (comboBox50.getSelectedItem().toString().equals("F"))
                    acroForm.getField("1_2").setValue("X");
            }
            if(comboBox51.getSelectedIndex() != -1)
            {
                if (comboBox51.getSelectedItem().toString().equals("M"))
                    acroForm.getField("2_1").setValue("X");
                else if (comboBox51.getSelectedItem().toString().equals("F"))
                    acroForm.getField("2_2").setValue("X");
            }
            if(comboBox52.getSelectedIndex() != -1)
            {
                if (comboBox52.getSelectedItem().toString().equals("M"))
                    acroForm.getField("3_1").setValue("X");
                else if (comboBox52.getSelectedItem().toString().equals("F"))
                    acroForm.getField("3_2").setValue("X");
            }
            if(comboBox53.getSelectedIndex() != -1)
            {
                if (comboBox53.getSelectedItem().toString().equals("M"))
                    acroForm.getField("4_1").setValue("X");
                else if (comboBox53.getSelectedItem().toString().equals("F"))
                    acroForm.getField("4_2").setValue("X");
            }
            if(comboBox54.getSelectedIndex() != -1)
            {
                if (comboBox54.getSelectedItem().toString().equals("M"))
                    acroForm.getField("5_1").setValue("X");
                else if (comboBox54.getSelectedItem().toString().equals("F"))
                    acroForm.getField("5_2").setValue("X");
            }
            if(comboBox55.getSelectedIndex() != -1)
            {
                if (comboBox55.getSelectedItem().toString().equals("M"))
                    acroForm.getField("6_1").setValue("X");
                else if (comboBox55.getSelectedItem().toString().equals("F"))
                    acroForm.getField("6_2").setValue("X");
            }
            if(comboBox56.getSelectedIndex() != -1)
            {
                if (comboBox56.getSelectedItem().toString().equals("M"))
                    acroForm.getField("7_1").setValue("X");
                else if (comboBox56.getSelectedItem().toString().equals("F"))
                    acroForm.getField("7_2").setValue("X");
            }
            if(comboBox57.getSelectedIndex() != -1)
            {
                if (comboBox57.getSelectedItem().toString().equals("M"))
                    acroForm.getField("8_1").setValue("X");
                else if (comboBox57.getSelectedItem().toString().equals("F"))
                    acroForm.getField("8_2").setValue("X");
            }
            if(comboBox58.getSelectedIndex() != -1)
            {
                if (comboBox58.getSelectedItem().toString().equals("M"))
                    acroForm.getField("9_1").setValue("X");
                else if (comboBox58.getSelectedItem().toString().equals("F"))
                    acroForm.getField("9_2").setValue("X");
            }
            if(comboBox59.getSelectedIndex() != -1)
            {
                if (comboBox59.getSelectedItem().toString().equals("M"))
                    acroForm.getField("10_1").setValue("X");
                else if (comboBox59.getSelectedItem().toString().equals("F"))
                    acroForm.getField("10_2").setValue("X");
            }
            if(comboBox60.getSelectedIndex() != -1)
            {
                if (comboBox60.getSelectedItem().toString().equals("M"))
                    acroForm.getField("11_1").setValue("X");
                else if (comboBox60.getSelectedItem().toString().equals("F"))
                    acroForm.getField("11_2").setValue("X");
            }
            if(comboBox61.getSelectedIndex() != -1)
            {
                if (comboBox61.getSelectedItem().toString().equals("M"))
                    acroForm.getField("12_1").setValue("X");
                else if (comboBox61.getSelectedItem().toString().equals("F"))
                    acroForm.getField("12_2").setValue("X");
            }
            if(comboBox62.getSelectedIndex() != -1)
            {
                if (comboBox62.getSelectedItem().toString().equals("M"))
                    acroForm.getField("13_1").setValue("X");
                else if (comboBox62.getSelectedItem().toString().equals("F"))
                    acroForm.getField("13_2").setValue("X");
            }
            if(comboBox63.getSelectedIndex() != -1)
            {
                if (comboBox63.getSelectedItem().toString().equals("M"))
                    acroForm.getField("14_1").setValue("X");
                else if (comboBox63.getSelectedItem().toString().equals("F"))
                    acroForm.getField("14_2").setValue("X");
            }
            if(comboBox64.getSelectedIndex() != -1)
            {
                if (comboBox64.getSelectedItem().toString().equals("M"))
                    acroForm.getField("15_1").setValue("X");
                else if (comboBox64.getSelectedItem().toString().equals("F"))
                    acroForm.getField("15_2").setValue("X");
            }
            if(comboBox65.getSelectedIndex() != -1)
            {
                if (comboBox65.getSelectedItem().toString().equals("M"))
                    acroForm.getField("16_1").setValue("X");
                else if (comboBox65.getSelectedItem().toString().equals("F"))
                    acroForm.getField("16_2").setValue("X");
            }
            if(comboBox66.getSelectedIndex() != -1)
            {
                if (comboBox66.getSelectedItem().toString().equals("M"))
                    acroForm.getField("17_1").setValue("X");
                else if (comboBox66.getSelectedItem().toString().equals("F"))
                    acroForm.getField("17_2").setValue("X");
            }
            if(comboBox67.getSelectedIndex() != -1)
            {
                if (comboBox67.getSelectedItem().toString().equals("M"))
                    acroForm.getField("18_1").setValue("X");
                else if (comboBox67.getSelectedItem().toString().equals("F"))
                    acroForm.getField("18_2").setValue("X");
            }
            if(comboBox68.getSelectedIndex() != -1)
            {
                if (comboBox68.getSelectedItem().toString().equals("M"))
                    acroForm.getField("19_1").setValue("X");
                else if (comboBox68.getSelectedItem().toString().equals("F"))
                    acroForm.getField("19_2").setValue("X");
            }

            if(comboBox69.getSelectedIndex() != -1)
            {
                if (comboBox69.getSelectedItem().toString().equals("M"))
                    acroForm.getField("20_1").setValue("X");
                else if (comboBox69.getSelectedItem().toString().equals("F"))
                    acroForm.getField("20_2").setValue("X");
            }

            acroForm.getField("1_3").setValue(textField20.getText().toUpperCase());
            acroForm.getField("2_3").setValue(textField27.getText().toUpperCase());
            acroForm.getField("3_3").setValue(textField34.getText().toUpperCase());
            acroForm.getField("4_3").setValue(textField41.getText().toUpperCase());
            acroForm.getField("5_3").setValue(textField48.getText().toUpperCase());
            acroForm.getField("6_3").setValue(textField55.getText().toUpperCase());
            acroForm.getField("7_3").setValue(textField62.getText().toUpperCase());
            acroForm.getField("8_3").setValue(textField69.getText().toUpperCase());
            acroForm.getField("9_3").setValue(textField76.getText().toUpperCase());
            acroForm.getField("10_3").setValue(textField83.getText().toUpperCase());
            acroForm.getField("11_3").setValue(textField90.getText().toUpperCase());
            acroForm.getField("12_3").setValue(textField97.getText().toUpperCase());
            acroForm.getField("13_3").setValue(textField104.getText().toUpperCase());
            acroForm.getField("14_3").setValue(textField111.getText().toUpperCase());
            acroForm.getField("15_3").setValue(textField118.getText().toUpperCase());
            acroForm.getField("16_3").setValue(textField125.getText().toUpperCase());
            acroForm.getField("17_3").setValue(textField132.getText().toUpperCase());
            acroForm.getField("18_3").setValue(textField139.getText().toUpperCase());
            acroForm.getField("19_3").setValue(textField146.getText().toUpperCase());
            acroForm.getField("20_3").setValue(textField153.getText().toUpperCase());

            acroForm.getField("1_4").setValue(CRWBTextField.getText());
            if(comboBox26.getSelectedIndex() != -1)
                acroForm.getField("2_4").setValue(comboBox26.getSelectedItem().toString());
            if(comboBox90.getSelectedIndex() != -1)
                acroForm.getField("3_4").setValue(comboBox90.getSelectedItem().toString());
            acroForm.getField("4_4").setValue(FFT2TextField1.getText());
            acroForm.getField("5_4").setValue(FFT2TextField1.getText());
            acroForm.getField("6_4").setValue(FFT2TextField1.getText());
            acroForm.getField("7_4").setValue(FFT2TextField1.getText());
            acroForm.getField("8_4").setValue(FFT2TextField1.getText());
            acroForm.getField("9_4").setValue(FFT2TextField1.getText());
            acroForm.getField("10_4").setValue(FFT2TextField1.getText());
            acroForm.getField("11_4").setValue(FFT1TextField1.getText());
            acroForm.getField("12_4").setValue(FFT2TextField1.getText());
            acroForm.getField("13_4").setValue(FFT2TextField1.getText());
            acroForm.getField("14_4").setValue(FFT2TextField1.getText());
            acroForm.getField("15_4").setValue(FFT2TextField1.getText());
            acroForm.getField("16_4").setValue(FFT2TextField1.getText());
            if(comboBox27.getSelectedIndex() != -1)
                acroForm.getField("17_4").setValue(comboBox27.getSelectedItem().toString());
            if(comboBox28.getSelectedIndex() != -1)
                acroForm.getField("18_4").setValue(comboBox28.getSelectedItem().toString());
            if(comboBox29.getSelectedIndex() != -1)
                acroForm.getField("19_4").setValue(comboBox29.getSelectedItem().toString());
            acroForm.getField("20_4").setValue(FFT1TextField1.getText());

            acroForm.getField("1_5").setValue(textField22.getText().toString());
            acroForm.getField("2_5").setValue(textField29.getText().toString());
            acroForm.getField("3_5").setValue(textField36.getText().toString());
            acroForm.getField("4_5").setValue(textField43.getText().toString());
            acroForm.getField("5_5").setValue(textField50.getText().toString());
            acroForm.getField("6_5").setValue(textField57.getText().toString());
            acroForm.getField("7_5").setValue(textField64.getText().toString());
            acroForm.getField("8_5").setValue(textField71.getText().toString());
            acroForm.getField("9_5").setValue(textField78.getText().toString());
            acroForm.getField("10_5").setValue(textField85.getText().toString());
            acroForm.getField("11_5").setValue(textField92.getText().toString());
            acroForm.getField("12_5").setValue(textField99.getText().toString());
            acroForm.getField("13_5").setValue(textField106.getText().toString());
            acroForm.getField("14_5").setValue(textField113.getText().toString());
            acroForm.getField("15_5").setValue(textField120.getText().toString());
            acroForm.getField("16_5").setValue(textField127.getText().toString());
            acroForm.getField("17_5").setValue(textField134.getText().toString());
            acroForm.getField("18_5").setValue(textField141.getText().toString());
            acroForm.getField("19_5").setValue(textField148.getText().toString());
            acroForm.getField("20_5").setValue(textField155.getText());

            if(comboBox70.getSelectedIndex() != -1)
                acroForm.getField("1_6").setValue(comboBox70.getSelectedItem().toString());
            if(comboBox71.getSelectedIndex() != -1)
                acroForm.getField("2_6").setValue(comboBox71.getSelectedItem().toString());
            if(comboBox72.getSelectedIndex() != -1)
                acroForm.getField("3_6").setValue(comboBox72.getSelectedItem().toString());
            if(comboBox73.getSelectedIndex() != -1)
                acroForm.getField("4_6").setValue(comboBox73.getSelectedItem().toString());
            if(comboBox74.getSelectedIndex() != -1)
                acroForm.getField("5_6").setValue(comboBox74.getSelectedItem().toString());
            if(comboBox75.getSelectedIndex() != -1)
                acroForm.getField("6_6").setValue(comboBox75.getSelectedItem().toString());
            if(comboBox76.getSelectedIndex() != -1)
                acroForm.getField("7_6").setValue(comboBox76.getSelectedItem().toString());
            if(comboBox77.getSelectedIndex() != -1)
                acroForm.getField("8_6").setValue(comboBox77.getSelectedItem().toString());
            if(comboBox78.getSelectedIndex() != -1)
                acroForm.getField("9_6").setValue(comboBox78.getSelectedItem().toString());
            if(comboBox79.getSelectedIndex() != -1)
                acroForm.getField("10_6").setValue(comboBox79.getSelectedItem().toString());
            if(comboBox80.getSelectedIndex() != -1)
                acroForm.getField("11_6").setValue(comboBox80.getSelectedItem().toString());
            if(comboBox81.getSelectedIndex() != -1)
                acroForm.getField("12_6").setValue(comboBox81.getSelectedItem().toString());
            if(comboBox82.getSelectedIndex() != -1)
                acroForm.getField("13_6").setValue(comboBox82.getSelectedItem().toString());
            if(comboBox83.getSelectedIndex() != -1)
                acroForm.getField("14_6").setValue(comboBox83.getSelectedItem().toString());
            if(comboBox84.getSelectedIndex() != -1)
                acroForm.getField("15_6").setValue(comboBox84.getSelectedItem().toString());
            if(comboBox85.getSelectedIndex() != -1)
                acroForm.getField("16_6").setValue(comboBox85.getSelectedItem().toString());
            if(comboBox86.getSelectedIndex() != -1)
                acroForm.getField("17_6").setValue(comboBox86.getSelectedItem().toString());
            if(comboBox87.getSelectedIndex() != -1)
                acroForm.getField("18_6").setValue(comboBox87.getSelectedItem().toString());
            if(comboBox88.getSelectedIndex() != -1)
                acroForm.getField("19_6").setValue(comboBox88.getSelectedItem().toString());
            if(comboBox89.getSelectedIndex() != -1)
                acroForm.getField("20_6").setValue(comboBox89.getSelectedItem().toString());

            if(comboBox30.getSelectedIndex() != -1)
                acroForm.getField("1_7").setValue(comboBox30.getSelectedItem().toString());
            if(comboBox31.getSelectedIndex() != -1)
                acroForm.getField("2_7").setValue(comboBox31.getSelectedItem().toString());
            if(comboBox32.getSelectedIndex() != -1)
                acroForm.getField("3_7").setValue(comboBox32.getSelectedItem().toString());
            if(comboBox33.getSelectedIndex() != -1)
                acroForm.getField("4_7").setValue(comboBox33.getSelectedItem().toString());
            if(comboBox34.getSelectedIndex() != -1)
                acroForm.getField("5_7").setValue(comboBox34.getSelectedItem().toString());
            if(comboBox35.getSelectedIndex() != -1)
                acroForm.getField("6_7").setValue(comboBox35.getSelectedItem().toString());
            if(comboBox36.getSelectedIndex() != -1)
                acroForm.getField("7_7").setValue(comboBox36.getSelectedItem().toString());
            if(comboBox37.getSelectedIndex() != -1)
                acroForm.getField("8_7").setValue(comboBox37.getSelectedItem().toString());
            if(comboBox38.getSelectedIndex() != -1)
                acroForm.getField("9_7").setValue(comboBox38.getSelectedItem().toString());
            if(comboBox39.getSelectedIndex() != -1)
                acroForm.getField("10_7").setValue(comboBox39.getSelectedItem().toString());
            if(comboBox40.getSelectedIndex() != -1)
                acroForm.getField("11_7").setValue(comboBox40.getSelectedItem().toString());
            if(comboBox41.getSelectedIndex() != -1)
                acroForm.getField("12_7").setValue(comboBox41.getSelectedItem().toString());
            if(comboBox42.getSelectedIndex() != -1)
                acroForm.getField("13_7").setValue(comboBox42.getSelectedItem().toString());
            if(comboBox43.getSelectedIndex() != -1)
                acroForm.getField("14_7").setValue(comboBox43.getSelectedItem().toString());
            if(comboBox44.getSelectedIndex() != -1)
                acroForm.getField("15_7").setValue(comboBox44.getSelectedItem().toString());
            if(comboBox45.getSelectedIndex() != -1)
                acroForm.getField("16_7").setValue(comboBox45.getSelectedItem().toString());
            if(comboBox46.getSelectedIndex() != -1)
                acroForm.getField("17_7").setValue(comboBox46.getSelectedItem().toString());
            if(comboBox47.getSelectedIndex() != -1)
                acroForm.getField("18_7").setValue(comboBox47.getSelectedItem().toString());
            if(comboBox48.getSelectedIndex() != -1)
                acroForm.getField("19_7").setValue(comboBox48.getSelectedItem().toString());
            if(comboBox49.getSelectedIndex() != -1)
                acroForm.getField("20_7").setValue(comboBox49.getSelectedItem().toString());


            String [] drivers = new String[5];
            for(int i = 0; i < 5; ++i)
            {
                if(driverSelected[i] != -1)
                {
                    for (Record r : driverRecords)
                    {
                        if (r.getRecordNo() == driverSelected[i])
                        {
                            drivers[i] = new String(r.getName());
                            break;
                        }
                    }
                }
            }
            acroForm.getField("21_0").setValue(drivers[0]);
            acroForm.getField("22_0").setValue(drivers[1]);
            acroForm.getField("23_0").setValue(drivers[2]);
            acroForm.getField("24_0").setValue(drivers[3]);
            acroForm.getField("25_0").setValue(drivers[4]);

            acroForm.getField("21_2").setValue(textField19.getText().toString());
            acroForm.getField("22_2").setValue(textField33.getText().toString());
            acroForm.getField("23_2").setValue(textField47.getText().toString());
            acroForm.getField("24_2").setValue(textField61.getText().toString());
            acroForm.getField("25_2").setValue(textField75.getText().toString());

            acroForm.getField("21_1").setValue(textField18.getText().toString().strip().toUpperCase());
            acroForm.getField("22_1").setValue(textField32.getText().toString().strip().toUpperCase());
            acroForm.getField("23_1").setValue(textField46.getText().toString().strip().toUpperCase());
            acroForm.getField("24_1").setValue(textField60.getText().toString().strip().toUpperCase());
            acroForm.getField("25_1").setValue(textField74.getText().toString().strip().toUpperCase());


            if(comboBox91.getSelectedIndex() != -1)
                acroForm.getField("21_3").setValue(comboBox91.getSelectedItem().toString());
            else
                acroForm.getField("21_3").setValue(comboBox91.getEditor().getItem().toString());
            if(comboBox92.getSelectedIndex() != -1)
                acroForm.getField("22_3").setValue(comboBox92.getSelectedItem().toString());
            else
                acroForm.getField("22_3").setValue(comboBox92.getEditor().getItem().toString());
            if(comboBox93.getSelectedIndex() != -1)
                acroForm.getField("23_3").setValue(comboBox93.getSelectedItem().toString());
            else
                acroForm.getField("23_3").setValue(comboBox93.getEditor().getItem().toString());
            if(comboBox94.getSelectedIndex() != -1)
                acroForm.getField("24_3").setValue(comboBox94.getSelectedItem().toString());
            else
                acroForm.getField("24_3").setValue(comboBox94.getEditor().getItem().toString());
            if(comboBox95.getSelectedIndex() != -1)
                acroForm.getField("25_3").setValue(comboBox95.getSelectedItem().toString());
            else
                acroForm.getField("25_3").setValue(comboBox95.getEditor().getItem().toString());
            if(comboBox96.getSelectedIndex() != -1)
                acroForm.getField("21_4").setValue(comboBox96.getSelectedItem().toString());
            else
                acroForm.getField("21_4").setValue(comboBox96.getEditor().getItem().toString());
            if(comboBox97.getSelectedIndex() != -1)
                acroForm.getField("22_4").setValue(comboBox97.getSelectedItem().toString());
            else
                acroForm.getField("22_4").setValue(comboBox97.getEditor().getItem().toString());
            if(comboBox98.getSelectedIndex() != -1)
                acroForm.getField("23_4").setValue(comboBox98.getSelectedItem().toString());
            else
                acroForm.getField("23_4").setValue(comboBox98.getEditor().getItem().toString());
            if(comboBox99.getSelectedIndex() != -1)
                acroForm.getField("24_4").setValue(comboBox99.getSelectedItem().toString());
            else
                acroForm.getField("24_4").setValue(comboBox99.getEditor().getItem().toString());
            if(comboBox100.getSelectedIndex() != -1)
                acroForm.getField("25_4").setValue(comboBox100.getSelectedItem().toString());
            else
                acroForm.getField("25_4").setValue(comboBox100.getEditor().getItem().toString());


            document.save(outputFile);
            document.close();

            File finishedPDF = new File(outputFile);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(finishedPDF);
        }
        catch (Exception e) { e.printStackTrace();}
    }
}
