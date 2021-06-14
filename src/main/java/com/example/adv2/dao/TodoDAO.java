package com.example.adv2.dao;

import com.example.adv2.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDAO extends JpaRepository<Todo,Integer> { }
