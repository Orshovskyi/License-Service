package com.serg.licensingservice.service;

import com.serg.licensingservice.model.License;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    public License getLicense(String licenseId, String organizationId){
        return new License();
    }

    public String createLicense(License license, String organizationId){
        return "";
    }

    public String updateLicense(License license, String organizationId){
        return "";
    }

    public String deleteLicense(String licenseId, String organizationId){
        return "";
    }
}
