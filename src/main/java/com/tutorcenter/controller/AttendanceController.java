package com.tutorcenter.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    // @GetMapping("")
    // public ResponseEntity<?> getListAttendance() {

    // return new ResponseEntity<>(null, null, 0);
    // }
}
