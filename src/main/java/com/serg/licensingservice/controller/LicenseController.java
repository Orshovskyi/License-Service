package com.serg.licensingservice.controller;

import com.serg.licensingservice.model.License;
import com.serg.licensingservice.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/organizaation/{organizationId}/license")
@RequiredArgsConstructor
public class LicenseController {

    private final LicenseService licenseService;

    @GetMapping(value = "/{licenseId}")
    public ResponseEntity<License> getLicense(
            @PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId){
        License license = licenseService.getLicense(organizationId, licenseId);

        return ResponseEntity.ok(license);
    }

    @PostMapping
    public ResponseEntity<String> createLicense(
            @PathVariable("organizationId") String organizationId, @RequestBody License license){

        return ResponseEntity.ok(licenseService.createLicense(license, organizationId));
    }

    @PutMapping
    public ResponseEntity<String> updateLicense(
            @PathVariable("organizationId") String organizationId, @RequestBody License license){

        return ResponseEntity.ok(licenseService.updateLicense(license, organizationId));
    }

    @DeleteMapping(value = "/{licenseId}")
    public ResponseEntity<String> deleteLicense(
            @PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId){

        return ResponseEntity.ok(licenseService.deleteLicense(organizationId, licenseId));
    }
}
