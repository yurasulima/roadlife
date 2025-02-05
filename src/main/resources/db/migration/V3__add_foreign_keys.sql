ALTER TABLE "user"
ADD CONSTRAINT fk_current_point FOREIGN KEY (current_point) REFERENCES road_point(id);
