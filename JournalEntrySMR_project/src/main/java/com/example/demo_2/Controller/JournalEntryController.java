package com.example.demo_2.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_2.Entity.JournalEntry;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {
    
    private Map<String,JournalEntry> JournalEntries = new HashMap<>(); 
    
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(JournalEntries.values());
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournal(@PathVariable String myId){
        return JournalEntries.get(myId);
    }

    @PostMapping
    public JournalEntry createJournal(@RequestBody JournalEntry MyEntry){
         JournalEntries.put(MyEntry.getId(),MyEntry);
         return JournalEntries.get(MyEntry.getId());
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournal(@PathVariable String myId){
        return JournalEntries.remove(myId);
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournal(@PathVariable String myId,@RequestBody JournalEntry MyEntry){
        return JournalEntries.put(myId,MyEntry);
    }


}
