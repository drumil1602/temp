package com.example.demo34;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelperController {
    @GetMapping("/*")
    public String helper(){
        System.out.println("we are here");
        return "sdfwe";
    }
//    @GetMapping("/users")
//    @PreAuthorize("hasRole('admin')")
//    public String helper(){
//        return "this is list of users can be accessed by owner";
//    }
////    @GetMapping("/users12")
////    @PreAuthorize("hasRole('owner')")
//    public String helper12(){
//        return "this is list of users12 can be accessed by admin";
//    }
}
