package com.example.BACKEND.Authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("BACKEND")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService service;
    private final PasswordEncoder passwordenconder;
    
    @PostMapping
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.login(request));
    }
    
    @PostMapping
    @RequestMapping(value = "login/2", method = RequestMethod.POST)
    public ResponseEntity<String> login2(@RequestBody AuthenticationRequest request){
        System.out.print(request.getUser());
        return ResponseEntity.ok("hola");
    }
    
    @PostMapping
    @RequestMapping(value = "login/3", method = RequestMethod.POST)
    public String login3(){
//        System.out.print("prueba a co nsola");
        return "hola";
    }
}
