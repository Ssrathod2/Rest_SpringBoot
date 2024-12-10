package com.example.demo_2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo_2.Entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String>{
    
}
