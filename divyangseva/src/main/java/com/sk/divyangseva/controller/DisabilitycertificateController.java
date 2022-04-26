package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.DisabilityCertificates;
import com.sk.divyangseva.model.Disabilitytypes;
import com.sk.divyangseva.model.User;
import com.sk.divyangseva.service.DisabilityCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/certificate")
public class DisabilitycertificateController {

    @Autowired
    private DisabilityCertificateService disabilityCertificateService;

    @GetMapping
    public List<DisabilityCertificates> getAllCertificates(){
        return disabilityCertificateService.getAllCertificates();
    }

    @GetMapping("/{id}")
    public Optional<DisabilityCertificates> getCertificate(@PathVariable Long id){
        return disabilityCertificateService.getCertificate(id);
    }

    @PostMapping
    public String addCertificate(@RequestBody DisabilityCertificates disabilityCertificates) {
        return disabilityCertificateService.addCertificate(disabilityCertificates);
    }

    @PutMapping("/{id}")
    public DisabilityCertificates updateCertificate(@RequestBody DisabilityCertificates disabilityCertificates,@PathVariable Long id){
        return disabilityCertificateService.updateCertificate(disabilityCertificates,id);
    }

    @DeleteMapping("/{id}")
    public String deleteCertificate(@PathVariable Long id){
        return disabilityCertificateService.delCertificate(id);
    }

    @PatchMapping("/doc/{id}")
    public String patchDocid(@RequestBody DisabilityCertificates disabilityCertificates, @PathVariable Long id){
        return disabilityCertificateService.patchDocid(disabilityCertificates,id);
    }

    @PatchMapping("/police/{id}")
    public String patchPoliceid(@RequestBody DisabilityCertificates disabilityCertificates, @PathVariable Long id){
        return disabilityCertificateService.patchPoliceid(disabilityCertificates,id);
    }

    @PatchMapping("/railway/{id}")
    public String patchRailwayid(@RequestBody DisabilityCertificates disabilityCertificates, @PathVariable Long id){
        return disabilityCertificateService.patchRailwayid(disabilityCertificates,id);
    }

    @PatchMapping("/{id}/proof")
    public DisabilityCertificates patchProofimg(@PathVariable Long id,@RequestParam("proof_pic") MultipartFile file1) throws IOException {
        return disabilityCertificateService.patchDisabilityProofimg(id,file1);
    }

    @PatchMapping("/{id}/disabilitytype")
    public DisabilityCertificates patchDisabilitytype(@RequestBody DisabilityCertificates disabilitytype, @PathVariable Long id){
        return disabilityCertificateService.patchDisabilityType(disabilitytype,id);
    }

    @PatchMapping("/{id}/disabilitypercentage")
    public DisabilityCertificates patchDisabilitypercentage(@RequestBody DisabilityCertificates disabilitypercentage, @PathVariable Long id){
        return disabilityCertificateService.patchDisabilityPercentage(disabilitypercentage,id);
    }

    @PatchMapping("/{id}/certificatestatus")
    public DisabilityCertificates patchCertificatestatus(@RequestBody DisabilityCertificates certificatestatus, @PathVariable Long id){
        return disabilityCertificateService.patchCertificateStatus(certificatestatus,id);
    }

    @PatchMapping("/{id}/concessionstatus")
    public DisabilityCertificates patchConcessionstatus(@RequestBody DisabilityCertificates concessionstatus, @PathVariable Long id){
        return disabilityCertificateService.patchConcessionStatus(concessionstatus,id);
    }

    @PatchMapping("/{id}/escortstatus")
    public DisabilityCertificates patchEscortstatus(@RequestBody DisabilityCertificates escortstatus, @PathVariable Long id){
        return disabilityCertificateService.patchEscortStatus(escortstatus,id);
    }
}
