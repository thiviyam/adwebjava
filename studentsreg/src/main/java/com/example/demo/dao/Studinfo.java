package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Students;

public interface Studinfo extends CrudRepository<Students, Integer>
{

}
