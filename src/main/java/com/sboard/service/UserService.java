package com.sboard.service;

import com.sboard.dto.TermsDTO;
import com.sboard.dto.UserDTO;
import com.sboard.entity.Terms;
import com.sboard.entity.User;
import com.sboard.repository.TermsRepository;
import com.sboard.repository.UserRepository;
import jakarta.mail.Message;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final TermsRepository termsRepository;

    // JavaMailSender 주입

    private final PasswordEncoder passwordEncoder;


    public void insertUser(UserDTO userDTO) {

        String encoded = passwordEncoder.encode(userDTO.getPass());
        userDTO.setPass(encoded);
        userRepository.save(userDTO.toEntity());
    }

    public void selectUser() {

    }

    public void selectAllUser() {

    }

    public TermsDTO selectTerms() {
        List<Terms> termsList = termsRepository.findAll();
        return termsList.get(0).toDTO();
    }


    public void updateUser() {

    }

    public void deleteUser() {

    }
}