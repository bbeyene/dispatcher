package com.beyene.manifestmaker;

public class Vehicle
{
    private int vehicleNo;
    private String makeModel;
    private String vehicleLicence;

    public Vehicle(int a, String b, String c)
    {
        this.vehicleNo = a;
        this.makeModel = b;
        this.vehicleLicence = c;
    }

    public boolean equals(Vehicle another)
    {
        return (this.vehicleNo == another.vehicleNo);
    }

    public int getVehicleNo()
    {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }

    public String getMakeModel()
    {
        return makeModel;
    }

    public void setMakeModel(String makeModel)
    {
        this.makeModel = makeModel;
    }

    public String getVehicleLicence()
    {
        return vehicleLicence;
    }

    public void setVehicleLicence(String vehicleLicence)
    {
        this.vehicleLicence = vehicleLicence;
    }
}
