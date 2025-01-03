package com.vikyathshirva.api.core.review;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

interface ReviewService {

    @GetMapping(
        value = "/review",
        produces = "application/json"
    )
    List<Review> getReviews(@RequestParam(value = "productId") int productId);
}
