package com.nisil.demo.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.nisil.demo.JournalEntry.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId>{
    
}
