package com.example.skill.service;

import com.example.skill.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service   // ✅ THIS FIXES YOUR ERROR
public class StudentService {

    private Map<Long, Student> db = new HashMap<>();
    private Long idCounter = 1L;

    public Student save(Student s) {
        s.setId(idCounter++);
        db.put(s.getId(), s);
        return s;
    }

    public List<Student> getAll() {
        return new ArrayList<>(db.values());
    }

    public Student getById(Long id) {
        if (!db.containsKey(id))
            throw new RuntimeException("Student not found with ID: " + id);
        return db.get(id);
    }

    public Student update(Long id, Student s) {
        if (!db.containsKey(id))
            throw new RuntimeException("Student not found with ID: " + id);
        s.setId(id);
        db.put(id, s);
        return s;
    }

    public String delete(Long id) {
        if (!db.containsKey(id))
            throw new RuntimeException("Student not found with ID: " + id);
        db.remove(id);
        return "Deleted successfully";
    }
}
