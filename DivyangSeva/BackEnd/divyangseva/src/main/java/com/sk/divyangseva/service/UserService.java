package com.sk.divyangseva.service;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.User;
import com.sk.divyangseva.model.resmodel.ResUser;
import com.sk.divyangseva.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    public FileUploadService fileUploadService;

    @Autowired
    ResUser resUser;

    public Base64.Encoder encoder = Base64.getEncoder();

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }

    public String addUser(User user,MultipartFile userpicFile,MultipartFile aadharimgFile,MultipartFile signatureimgFile) throws IOException {
        String encodedpw = encoder.encodeToString(user.getPassword().getBytes());
        user.setPassword(encodedpw);
        String userpicFilename = fileUploadService.uploadUserPicFile(userpicFile);
        String aadharFilename = fileUploadService.uploadAadharFile(aadharimgFile);
        String signatureFilename = fileUploadService.uploadSignatureFile(signatureimgFile);
        user.setImage(userpicFilename);
        user.setAadhar(aadharFilename);
        user.setSignature(signatureFilename);
        userRepository.save(user);
        return "User Inserted Successfully.";
    }

    public User updateUser(User user,Long id,MultipartFile userpicFile,MultipartFile aadharimgFile,MultipartFile signatureimgFile) throws IOException {
        user.setId(id);
        user.getUname();
        user.getEmail();
        String encodedpw = encoder.encodeToString(user.getPassword().getBytes());
        user.setPassword(encodedpw);
        String userpicFilename = fileUploadService.uploadUserPicFile(userpicFile);
        String aadharFilename = fileUploadService.uploadAadharFile(aadharimgFile);
        String signatureFilename = fileUploadService.uploadSignatureFile(signatureimgFile);
        user.setImage(userpicFilename);
        user.setAadhar(aadharFilename);
        user.setSignature(signatureFilename);
        user.getPhone_no();
        user.getOrganization_name();
        user.getImage();
        user.getSignature();
        user.getAadhar();
        user.getDob();
        user.getCity();
        user.getUsertype();
        return userRepository.save(user);
    }

    public String delUser(Long id){
        userRepository.deleteById(id);
        return "User Deleted Successfully.";
    }

    public ResUser login(User user){

        String encodedpw = encoder.encodeToString(user.getPassword().getBytes());
        user.setPassword(encodedpw);
        User user1 = userRepository.checkUser(user.getEmail(),user.getPassword());
        if(user1!=null) {
           resUser.setName(user1.getUname());
           resUser.setUser_type(user1.getUsertype().getUser_type());
           return resUser;
        }
        else{
            resUser.setName("NULL");
            resUser.setUser_type("NULL");
            return resUser;
        }
    }

    public User patchUserimgs(Long id,MultipartFile userpicFile,MultipartFile aadharimgFile,MultipartFile signatureimgFile) throws IOException {
        User user = userRepository.findById(id).get();
        String userpicFilename = fileUploadService.uploadUserPicFile(userpicFile);
        String aadharFilename = fileUploadService.uploadAadharFile(aadharimgFile);
        String signatureFilename = fileUploadService.uploadSignatureFile(signatureimgFile);
        user.setImage(userpicFilename);
        user.setAadhar(aadharFilename);
        user.setSignature(signatureFilename);
        userRepository.save(user);
        return user;
    }
}
