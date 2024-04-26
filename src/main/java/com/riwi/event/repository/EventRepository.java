package com.riwi.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.event.entity.Event;

public interface EventRepository extends JpaRepository<Event, String> {
    Event findByName(String name);
}
