package com.vikyathshirva.api.composite.product;

/**
 * RecommendationSummary
 */
public record RecommendationSummary(
    int recommendatinoId,
    String author,
    int rate
) {
}
