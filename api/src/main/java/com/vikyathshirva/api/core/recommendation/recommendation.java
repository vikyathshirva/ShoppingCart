package com.vikyathshirva.api.core.recommendation;



public record Recommendation(int productId, int recommendationId, String author, int rate, String content, String serviceAddress) {

}
