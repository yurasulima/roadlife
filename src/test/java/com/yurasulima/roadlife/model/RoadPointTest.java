package com.yurasulima.roadlife.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

class RoadPointTest {

    @Test
    void testRoadPointCreation() {
        RoadPoint roadPoint = new RoadPoint();
        roadPoint.setName("Start Point");
        roadPoint.setDescription("First checkpoint");
        roadPoint.setDeadline(LocalDateTime.now().plusDays(7));

        assertNull(roadPoint.getId());
        assertEquals("Start Point", roadPoint.getName());
        assertEquals("First checkpoint", roadPoint.getDescription());
        assertNotNull(roadPoint.getDeadline());
    }

    @Test
    void testSetUser() {
        RoadPoint roadPoint = new RoadPoint();
        User user = new User();
        user.setUsername("testuser");

        roadPoint.setUser(user);

        assertNotNull(roadPoint.getUser());
        assertEquals("testuser", roadPoint.getUser().getUsername());
    }
}

