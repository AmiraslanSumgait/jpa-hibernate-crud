package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public void insert(Course course) {
        entityManager.merge(course);
    }
    public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }
    public void deleteById(int id) {
        Course course = findById(id);
        entityManager.remove(course);
    }
}
