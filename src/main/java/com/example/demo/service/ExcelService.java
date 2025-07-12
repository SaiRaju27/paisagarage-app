package com.example.demo.service;

import com.example.demo.entity.VehicleInfo;
import org.springframework.web.multipart.MultipartFile;

public interface ExcelService {

    public void saveFromExcel(MultipartFile file) throws Exception;
    public VehicleInfo getByVehicleNo(String vehicleNo);
}
