package com.nisil.demo.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nisil.demo.JournalEntry.JournalEntry;
import com.nisil.demo.Repository.JournalEntryRepository;


@Component
public class JournalEntryService{
   
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public JournalEntry saveAll(JournalEntry entry){
        return journalEntryRepository.save(entry);

    }

    public List<JournalEntry> getEntry(){
        return journalEntryRepository.findAll();
    }
    public boolean deleteEntries(ObjectId myid){
         journalEntryRepository.deleteById(myid);
         return true;
    }

    public Optional<JournalEntry> findByID(ObjectId id){
        return journalEntryRepository.findById(id);

    }
}
