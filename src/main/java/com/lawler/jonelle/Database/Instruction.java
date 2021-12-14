package com.lawler.jonelle.Database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instruction {
    public Instruction(String instructionID, String equipment, String ingredientName, String descrip) {
        InstructionID = instructionID;
        equipment = instructionEquipment;
        ingredientName = ingredient;
        descrip = description;
    }

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    String InstructionID;
    String description;
    String instructionEquipment;
    String ingredient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}