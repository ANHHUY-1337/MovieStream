package com.example.MovieWebsite.service;

import com.example.MovieWebsite.repository.ActorAndDirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorAndDirectorService {
    @Autowired
    private ActorAndDirectorRepository actorAndDirectorRepository;
}
