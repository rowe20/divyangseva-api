package com.sk.divyangseva.service;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.DisabilityCertificates;
import com.sk.divyangseva.model.User;
import com.sk.divyangseva.repository.DisabilityCertificatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DisabilityCertificateService {

    @Autowired
    public DisabilityCertificatesRepository disabilityCertificatesRepository;

    @Autowired
    public FileUploadService fileUploadService;

    public List<DisabilityCertificates> getAllCertificates(){
        return disabilityCertificatesRepository.findAll();
    }

    public Optional<DisabilityCertificates> getCertificate(Long id){return disabilityCertificatesRepository.findById(id);}

    public String addCertificate(DisabilityCertificates disabilityCertificates){
        disabilityCertificatesRepository.save(disabilityCertificates);
        return "Record Inserted Successfully.";
    }

    public DisabilityCertificates updateCertificate(DisabilityCertificates disabilityCertificates,Long id){
        disabilityCertificates.setId(id);
        disabilityCertificates.getUser();
        disabilityCertificates.getDocuser();
        disabilityCertificates.getPoliceuser();
        disabilityCertificates.getRailwayuser();
        disabilityCertificates.getDisabilitytypes();
        disabilityCertificates.getDpercentage();
        disabilityCertificates.getDproof();
        disabilityCertificates.getIs_active();
        disabilityCertificates.getRail_concession_status();
        disabilityCertificates.getNeeds_escort();
        return disabilityCertificatesRepository.save(disabilityCertificates);
    }

    public String delCertificate(Long id){disabilityCertificatesRepository.deleteById(id);return "Record Deleted Successfully.";}

    public String patchDocid(DisabilityCertificates docid, Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setDocuser(docid.getDocuser());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return "Doctor Assigned successfully.";
    }

    public String patchPoliceid(DisabilityCertificates policeid, Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setPoliceuser(policeid.getPoliceuser());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return "Police Officer Assigned successfully.";
    }

    public String patchRailwayid(DisabilityCertificates railwayid, Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setRailwayuser(railwayid.getRailwayuser());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return "Railway Officer Assigned successfully.";
    }

    public DisabilityCertificates patchDisabilityProofimg(Long id, MultipartFile proofpicFile) throws IOException {
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        String proofpicFilename = fileUploadService.uploadDisablityproofFile(proofpicFile);
        disabilityCertificates.setDproof(proofpicFilename);
        disabilityCertificatesRepository.save(disabilityCertificates);
        return disabilityCertificates;
    }

    public DisabilityCertificates patchDisabilityType(DisabilityCertificates disabilitytype,Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setDisabilitytypes(disabilitytype.getDisabilitytypes());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return disabilityCertificates;
    }

    public DisabilityCertificates patchDisabilityPercentage(DisabilityCertificates disabilitypercentage,Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setDpercentage(disabilitypercentage.getDpercentage());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return disabilityCertificates;
    }

    public DisabilityCertificates patchCertificateStatus(DisabilityCertificates certificateStatus,Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setIs_active(certificateStatus.getIs_active());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return disabilityCertificates;
    }

    public DisabilityCertificates patchConcessionStatus(DisabilityCertificates concessionStatus,Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setRail_concession_status(concessionStatus.getRail_concession_status());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return disabilityCertificates;
    }

    public DisabilityCertificates patchEscortStatus(DisabilityCertificates escortStatus,Long id){
        DisabilityCertificates disabilityCertificates = disabilityCertificatesRepository.findById(id).get();
        disabilityCertificates.setNeeds_escort(escortStatus.getNeeds_escort());
        disabilityCertificatesRepository.save(disabilityCertificates);
        return disabilityCertificates;
    }
}
