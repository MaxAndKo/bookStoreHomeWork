package com.konchalov.bookmarket.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class SearchCriteria {
    private final String key;
    private final String operation;
    private final Object value;
}
