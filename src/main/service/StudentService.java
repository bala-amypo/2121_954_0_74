package com.example.demo.service;
import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studententity;

@Service

public class StudentServices {

    private Map<Integer, Studententity> details = new HashMap<>();

    // CREATE

    public Studententity saveData(Studententity st) {

        details.put(st.getId(), st);

        return st;

    }

    // READ by ID

    public Studententity getStudent(int id) {

        return details.get(i)
    }
    }
}