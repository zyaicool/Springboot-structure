package com.spring.structure.controller;

import com.spring.structure.dto.request.PostWithRequest;
import com.spring.structure.dto.response.PostWithRequestResponse;
import com.spring.structure.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @GetMapping
    public String getExampleResponseString() {
        return "this is response";
    }

    @PostMapping("/postWithRequestJson")
    public ResponseEntity<?> postWithRequestJson(@RequestBody PostWithRequest request) {
        return exampleService.postWithRequestJson(request);
    }

    @PostMapping("/postWithRequestParam")
    public ResponseEntity<?> postWithRequestParam(
            @RequestParam String nama,
            @RequestParam Integer umur) {
        return exampleService.postWithRequestParam(nama, umur);
    }

}
