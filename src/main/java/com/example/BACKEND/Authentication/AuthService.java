package com.example.BACKEND.Authentication;

import com.example.BACKEND.Repository.PersonaRepo;
import com.example.BACKEND.Security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    
    private final PersonaRepo repository;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    
    public AuthenticationResponse login(AuthenticationRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUser(), request.getPassword()));
        var user = repository.findByUser(request.getUser()).orElseThrow();
        var jwtToken = jwtService.generateToken(user); 
        return AuthenticationResponse.builder().token(jwtToken).build();
    }
}
