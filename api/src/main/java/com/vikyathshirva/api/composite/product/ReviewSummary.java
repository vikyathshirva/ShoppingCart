package com.vikyathshirva.api.composite.product;

/**
 * ReviewSummary
 */
public record ReviewSummary(
    int reviewId,
    String author,
    String subject
) {
}
