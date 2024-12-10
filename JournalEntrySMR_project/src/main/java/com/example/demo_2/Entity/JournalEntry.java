package com.example.demo_2.Entity;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class JournalEntry {
   
    @Id
    private String id;

    private String title;
    private String content;
    private Date date;

    // public String getId(){
    //     return this.id;
    // }

    // public String gettitle(){
    //     return this.title;
    // }

    // public String content(){
    //     return this.content;
    // }





    
}
