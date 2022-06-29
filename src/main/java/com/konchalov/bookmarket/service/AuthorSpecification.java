package com.konchalov.bookmarket.service;

import com.konchalov.bookmarket.entity.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@RequiredArgsConstructor
public class AuthorSpecification implements Specification<Author> {

    private final SearchCriteria criteria;

    @Override
    public Predicate toPredicate(Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(root.<String>get(criteria.getKey()), criteria.getValue());
    }
}
