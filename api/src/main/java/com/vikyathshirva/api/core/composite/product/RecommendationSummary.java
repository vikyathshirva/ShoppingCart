package com.vikyathshirva.api.core.composite.product;

/**
 * RecommendationSummary
 */
public record RecommendationSummary(
    int recommendatinoId,
    String author,
    int rate
) {
}
