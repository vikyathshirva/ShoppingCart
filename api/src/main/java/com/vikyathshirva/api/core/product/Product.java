package com.vikyathshirva.api.core.product;

public record Product(int productId, String name, int weight, String serviceAddress) {
    public String description() {
        return "Product : %s (ID: %d, Weight : %d, Service Address: %s)".formatted(name, productId, weight, serviceAddress);
    }

}
