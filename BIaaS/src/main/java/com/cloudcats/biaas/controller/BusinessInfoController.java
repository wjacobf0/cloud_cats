package com.cloudcats.biaas.controller;

import com.cloudcats.biaas.dto.BusinessInfoDto;
import com.cloudcats.biaas.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BusinessInfoController {

    @Autowired
    private BusinessInfoService businessInfoService;

    @GetMapping("/info/businesses")
    public ResponseEntity<?> getBusinessesInfo() {
        return new ResponseEntity<>(businessInfoService.getBusinessesInfo(), HttpStatus.OK);
    }

    @GetMapping("/info/businesses/{businessId}")
    public ResponseEntity<?>  getBusinessInfo(@PathVariable int businessId) {
        return new ResponseEntity<>(businessInfoService.getBusinessInfo(businessId), HttpStatus.OK);
    }
}
