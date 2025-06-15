//
//package com.example.demo;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//@RestController
//@RequestMapping("/api/employees")
//@CrossOrigin(origins = "*")
//public class EmployeeController {
//
//    @Autowired
//    private ExcelService excelService;
//
//    @PostMapping("/upload")
//    public ResponseEntity<?> uploadExcel(@RequestParam("file") MultipartFile file) {
//        try {
//            excelService.saveEmployeesFromExcel(file);
//            return ResponseEntity.ok("File uploaded and data saved!");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Upload failed: " + e.getMessage());
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
//        Optional<Employee> employee = excelService.getEmployeeById(id);
//        if (employee.isPresent()) {
//            return ResponseEntity.ok(employee.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
//        }
//    }
//
//}
