package com.product.api.services;

import com.product.api.entites.Category;
import com.product.api.specification.ObjectFilter;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ICategoryService {

    Page findAll(ObjectFilter filter);
    Optional<?> findById(Integer id);
    Category save(Category category);
    Category edit(Category newInfoCategory);
}
