package com.sk.divyangseva.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService {

    public String uploadUserPicFile(MultipartFile file) throws IOException {
        file.transferTo(new File("E:\\Personal\\Divyangseva Project\\Java backend\\divyangseva\\images\\user_imgs\\" + file.getOriginalFilename()));
        return file.getOriginalFilename();
    }

    public String uploadAadharFile(MultipartFile file) throws IOException {
        file.transferTo(new File("E:\\Personal\\Divyangseva Project\\Java backend\\divyangseva\\images\\aadharcard_imgs\\" + file.getOriginalFilename()));
        return file.getOriginalFilename();
    }

    public String uploadSignatureFile(MultipartFile file) throws IOException {
        file.transferTo(new File("E:\\Personal\\Divyangseva Project\\Java backend\\divyangseva\\images\\signature_imgs\\" + file.getOriginalFilename()));
        return file.getOriginalFilename();
    }

    public String uploadDisablityproofFile(MultipartFile file) throws IOException {
        file.transferTo(new File("E:\\Personal\\Divyangseva Project\\Java backend\\divyangseva\\images\\disability_proof_imgs\\" + file.getOriginalFilename()));
        return file.getOriginalFilename();
    }
}
