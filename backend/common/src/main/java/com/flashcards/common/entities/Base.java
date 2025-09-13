package com.flashcards.common.entities;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.*;

@MappedSuperclass
abstract public class Base
{
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    public Base () {
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = Instant.now();
    }
}
