package com.konchalov.bookmarket.service;

import com.konchalov.bookmarket.entity.Author;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class Service {


    public Specification<Author> test(String name){
        return new AuthorSpecification(new SearchCriteria("name", "", ""));
    }
}
