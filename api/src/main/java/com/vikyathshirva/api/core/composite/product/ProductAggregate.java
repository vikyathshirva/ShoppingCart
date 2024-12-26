package com.vikyathshirva.api.core.composite.product;

import java.util.List;

/**
 * ProductAggregate
 */
public record ProductAggregate(
    int productId,
    String name,
    int weight,
    List<RecommendationSummary> recommendations,
    List<ReviewSummary> reviews,
    ServiceAddresses ServiceAddresses
    ) {
}
