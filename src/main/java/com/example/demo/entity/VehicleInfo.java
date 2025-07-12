
package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class VehicleInfo {

    @Id
    @Column
    private String vehicleNo;
    @Column
    private String customerName;
    @Column
    private String vehicleName;
    @Column
    private String mobile;
    @Column
    private String hypotication;
    @Column
    private String address;
    @Column
    private String engineNo;
    @Column
    private String chasisNo;
    @Column
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
