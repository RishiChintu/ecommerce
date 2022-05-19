package com.example.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/ecom")
public class Users {
@Autowired
private UserRepository userRepo;



@PostMapping("/saveUser")
public String saveStudents(@RequestBody User user)
{
User save = userRepo.save(user);
if(save!=null)
{
return "Your Registration was Successfull";
}
else
{
return "Registration was unsuccessfull! Please enter valid user details";
}
}

@GetMapping("/getUsers")
public List<User> getUsers()
{
List<User> u = userRepo.findAll();
return u;
}


public JSONObject verifylogin(@RequestBody LoginDto users)
{
String email = users.getEmail();
String password = users.getPassword();
User user = userRepo.findByEmail(email);
JSONObject obj=new JSONObject();
obj.put("status","ok");
obj.put("message","logged In");
obj.put("accessToken","eyJhbGciOiJIUzI1NiIsInR5cC...");
if(user!=null)
{
if(user.getEmail().equals(email)&& user.getPassword().equals(password))
{
return obj;
}
}
return obj;
}
}
