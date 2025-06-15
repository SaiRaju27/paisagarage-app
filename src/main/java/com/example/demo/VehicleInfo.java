
package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VehicleInfo {

    @Id
    private String vehicleNo;

    private String customerName;
    private String vehicleName;
    private String mobile;
    private String hypotication;
    private String address;
    private String engineNo;
    private String chasisNo;
    private String date;

    public String getVehicleNo() { return vehicleNo; }
    public void setVehicleNo(String vehicleNo) { this.vehicleNo = vehicleNo; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getVehicleName() { return vehicleName; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getHypotication() { return hypotication; }
    public void setHypotication(String hypotication) { this.hypotication = hypotication; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEngineNo() { return engineNo; }
    public void setEngineNo(String engineNo) { this.engineNo = engineNo; }

    public String getChasisNo() { return chasisNo; }
    public void setChasisNo(String chasisNo) { this.chasisNo = chasisNo; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
