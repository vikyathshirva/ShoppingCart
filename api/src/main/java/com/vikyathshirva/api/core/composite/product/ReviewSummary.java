package com.vikyathshirva.api.core.composite.product;

/**
 * ReviewSummary
 */
public record ReviewSummary(
    int reviewId,
    String author,
    String subject
) {
}
