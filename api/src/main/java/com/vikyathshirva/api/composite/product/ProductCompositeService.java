package com.vikyathshirva.api.composite.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ProductCompositeService
 */
public interface ProductCompositeService {

    @GetMapping(
        value = "/product-composite/{productId}",
        produces = "application/json"

    )
    ProductAggregate getProduct(@PathVariable int productId);
}
