package com.edu.rayenne.hexa_archi_demo.studentservice.domain.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Student(UUID studentUid,
                      String studentName,
                      String studentLastName,
                      Long studentIdentifier) {
}
