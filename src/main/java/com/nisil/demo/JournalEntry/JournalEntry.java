package com.nisil.demo.JournalEntry;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "jounal_entries")
public class JournalEntry {
    @Id
    private ObjectId id;
    private String title;
    private String name;
    private LocalDateTime date;


        // Getter and Setter for id
        public LocalDateTime getDate() {
            return date;
        }
    
        public void setId(LocalDateTime date) {
            this.date = date;
        }

    // Getter and Setter for id
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

