package com.yurasulima.roadlife.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void testUserCreation() {
        User user = new User();
        user.setUsername("testuser");
        user.setCurrentPoint(1L);

        assertNull(user.getId());
        assertEquals("testuser", user.getUsername());
        assertEquals(1L, user.getCurrentPoint());
        assertNotNull(user.getRoadPoints());
        assertTrue(user.getRoadPoints().isEmpty());
    }

    @Test
    void testAddingRoadPoint() {
        User user = new User();
        RoadPoint roadPoint = new RoadPoint();
        roadPoint.setName("Start Point");
        roadPoint.setUser(user);

        user.getRoadPoints().add(roadPoint);

        assertEquals(1, user.getRoadPoints().size());
        assertEquals("Start Point", user.getRoadPoints().get(0).getName());
    }

    @Test
    void testRemovingRoadPoint() {
        User user = new User();
        RoadPoint roadPoint = new RoadPoint();
        roadPoint.setName("Start Point");
        roadPoint.setUser(user);

        user.getRoadPoints().add(roadPoint);
        user.getRoadPoints().remove(roadPoint);

        assertTrue(user.getRoadPoints().isEmpty());
    }
}
