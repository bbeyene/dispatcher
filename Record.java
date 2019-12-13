package com.beyene.manifestmaker;

public class Record
{
    private int recordNo;
    private String name;
    private String idNo;
    private String qual;
    private String certDate;
    private String lsa;
    private String sawyer;
    private String mspaDate;

    public Record(int a, String b, String c, String d, String e, String f, String g, String h)
    {
        this.recordNo = a;
        this.name = b;
        this.idNo = c;
        this.qual = d;
        this.certDate = e;
        this.lsa = f;
        this.sawyer = g;
        this.mspaDate = h;
    }

    public boolean equals(Record another)
    {
        return (this.recordNo == another.recordNo);
    }

    public int getRecordNo()
    {
        return recordNo;
    }

    public void setRecordNo(int recordNo)
    {
        this.recordNo = recordNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIdNo()
    {
        return idNo;
    }

    public void setIdNo(String idNo)
    {
        this.idNo = idNo;
    }

    public String getQual()
    {
        return qual;
    }

    public void setQual(String qual)
    {
        this.qual = qual;
    }

    public String getCertDate()
    {
        return certDate;
    }

    public void setCertDate(String certDate)
    {
        this.certDate = certDate;
    }

    public String getLsa()
    {
        return lsa;
    }

    public void setLsa(String lsa)
    {
        this.lsa = lsa;
    }

    public String getSawyer()
    {
        return sawyer;
    }

    public void setSawyer(String sawyer)
    {
        this.sawyer = sawyer;
    }

    public String getMspaDate()
    {
        return mspaDate;
    }

    public void setMspaDate(String mspaDate)
    {
        this.mspaDate = mspaDate;
    }


}
