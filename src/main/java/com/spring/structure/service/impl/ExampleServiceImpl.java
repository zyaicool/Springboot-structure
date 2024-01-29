package com.spring.structure.service.impl;

import com.spring.structure.dto.request.PostWithRequest;
import com.spring.structure.dto.response.PostWithRequestResponse;
import com.spring.structure.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public ResponseEntity<?> postWithRequestJson(PostWithRequest request) {
        PostWithRequestResponse response = new PostWithRequestResponse();
        response.setNama(request.getNama());
        response.setUmur(request.getUmur());
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> postWithRequestParam(String nama, Integer umur) {
        PostWithRequestResponse response = new PostWithRequestResponse();
        response.setNama(nama);
        response.setUmur(umur);
        return ResponseEntity.ok(response);
    }
}
