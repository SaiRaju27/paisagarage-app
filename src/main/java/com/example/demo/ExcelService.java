
package com.example.demo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    private VehicleRepository repository;

    public void saveFromExcel(MultipartFile file) throws Exception {
        List<VehicleInfo> vehicles = new ArrayList<>();
        InputStream inputStream = file.getInputStream();
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue;

            VehicleInfo v = new VehicleInfo();
            v.setDate(row.getCell(0).toString());
            v.setCustomerName(row.getCell(1).toString());
            v.setVehicleNo(row.getCell(2).toString());
            v.setVehicleName(row.getCell(3).toString());
            v.setMobile(row.getCell(4).toString());
            v.setHypotication(row.getCell(5).toString());
            v.setAddress(row.getCell(6).toString());
            v.setEngineNo(row.getCell(7).toString());
            v.setChasisNo(row.getCell(8).toString());

            vehicles.add(v);
        }
        workbook.close();
        repository.saveAll(vehicles);
    }

    public VehicleInfo getByVehicleNo(String vehicleNo) {
        return repository.findById(vehicleNo).orElse(null);
    }
}
