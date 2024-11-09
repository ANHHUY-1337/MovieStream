package com.example.MovieWebsite.service;

import com.example.MovieWebsite.repository.AddToCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddToCartService {
    @Autowired
    private AddToCartRepository addToCartRepository;
}
