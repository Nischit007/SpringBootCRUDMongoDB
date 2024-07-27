package com.nisil.demo.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.nisil.demo.JournalEntry.JournalEntry;
import com.nisil.demo.Service.JournalEntryService;


@RestController
@RequestMapping("/journal")
public class JournalController {
    

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getAllEntries(){
        return journalEntryService.getEntry();
    }


    @PostMapping
    public JournalEntry addJournalEntries(@RequestBody JournalEntry entries){
     
        return journalEntryService.saveAll(entries);
    }

    @DeleteMapping("/id/{myid}")
    public boolean deleteEntries(@PathVariable ObjectId myid){
       journalEntryService.deleteEntries(myid);
        return true;
    }

    @PutMapping("/id/{myid}")
    public boolean updateEntries(@RequestBody JournalEntry newentry,@PathVariable ObjectId myid){
        JournalEntry oldEntry=journalEntryService.findByID(myid).orElse(null);

        oldEntry.setTitle(newentry.getTitle()!=null && !newentry.getTitle().equals("")?newentry.getTitle():oldEntry.getTitle());
        oldEntry.setName(newentry.getName()!=null && !newentry.getName().equals("")?newentry.getName():oldEntry.getName());
        return true;
    }





}
