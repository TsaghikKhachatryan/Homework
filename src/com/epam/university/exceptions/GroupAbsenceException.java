package com.epam.university.exceptions;

import com.epam.university.models.Faculty;

public class GroupAbsenceException extends RuntimeException {
    private Faculty faculty;

    public GroupAbsenceException(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return faculty.getName()+" doesn't have groups!";
    }
}