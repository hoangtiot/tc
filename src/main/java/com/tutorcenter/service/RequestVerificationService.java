package com.tutorcenter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorcenter.model.RequestVerification;

@Service
public interface RequestVerificationService {
    List<RequestVerification> findAll();
}
