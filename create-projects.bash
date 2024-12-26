#!/usr/bin/env  bash


mkdir microservices
cd microservices


spring init \
    --boot-version=3.4.1 \
    --type=gradle-project \
    --java-version=21 \
    --packaging=jar \
    --name=project-service \
    --package-name=com.vikyathshirva.microservices.core.product \
    --groupId=com.vikyathshirva.core.product \
    --dependencies=actuator,webflux \
    --version=1.0.0-SNAPSHOT \
    product-service


spring init \
    --boot-version=3.4.1 \
    --type=gradle-project \
    --java-version=21 \
    --packaging=jar \
    --name=project-service \
    --package-name=com.vikyathshirva.microservices.core.review \
    --groupId=com.vikyathshirva.core.review \
    --dependencies=actuator,webflux \
    --version=1.0.0-SNAPSHOT \
    review-service


spring init \
    --boot-version=3.4.1 \
    --type=gradle-project \
    --java-version=21 \
    --packaging=jar \
    --name=project-service \
    --package-name=com.vikyathshirva.microservices.core.recommendation \
    --groupId=com.vikyathshirva.core.recommendation \
    --dependencies=actuator,webflux \
    --version=1.0.0-SNAPSHOT \
    recommendation-service


spring init \
    --boot-version=3.4.1 \
    --type=gradle-project \
    --java-version=21 \
    --packaging=jar \
    --name=project-service \
    --package-name=com.vikyathshirva.microservices.composite.product \
    --groupId=com.vikyathshirva.composite.product \
    --dependencies=actuator,webflux \
    --version=1.0.0-SNAPSHOT \
    product-composite-service


