package com.example.demo_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_2.Entity.JournalEntry;
import com.example.demo_2.Service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;
    
    
    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournal(@PathVariable String myId){
        return null;
    }

    @PostMapping
    public boolean createJournal(@RequestBody JournalEntry MyEntry){
        journalEntryService.saveEntry(MyEntry);
        return true;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournal(@PathVariable String myId){
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournal(@PathVariable String myId,@RequestBody JournalEntry MyEntry){
        return null;
    }


}
