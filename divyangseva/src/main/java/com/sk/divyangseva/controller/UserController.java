package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.User;
import com.sk.divyangseva.model.resmodel.ResUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sk.divyangseva.service.UserService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public String addUser(@RequestPart User user,@RequestParam("user_pic") MultipartFile file1,@RequestParam("aadharcard_image") MultipartFile file2,@RequestParam("signature_image") MultipartFile file3) throws IOException {
        return userService.addUser(user,file1,file2,file3);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestPart User user,@PathVariable Long id,@RequestParam("user_pic") MultipartFile file1,@RequestParam("aadharcard_image") MultipartFile file2,@RequestParam("signature_image") MultipartFile file3) throws IOException {
        return userService.updateUser(user,id,file1,file2,file3);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.delUser(id);
    }

    @PostMapping("/login")
    public ResUser login(@RequestBody User user){
        return userService.login(user);
    }

    @PatchMapping("/imgs/{id}")
    public User patchUserimgs(@PathVariable Long id,@RequestParam("user_pic") MultipartFile file1,@RequestParam("aadharcard_image") MultipartFile file2,@RequestParam("signature_image") MultipartFile file3) throws IOException {
        return userService.patchUserimgs(id,file1,file2,file3);
    }
}
