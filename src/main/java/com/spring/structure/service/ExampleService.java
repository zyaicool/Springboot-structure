package com.spring.structure.service;

import com.spring.structure.dto.request.PostWithRequest;
import org.springframework.http.ResponseEntity;

public interface ExampleService {

    ResponseEntity<?> postWithRequestJson(PostWithRequest request);
    ResponseEntity<?> postWithRequestParam(String nama, Integer umur);
}
