package com.$organization;format="package"$.$name$.api.monitoring.dto;

public class HealthResponseDto {
    private String health;

    public HealthResponseDto() {
    }

    public HealthResponseDto(String health) {
        this.health = health;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}
