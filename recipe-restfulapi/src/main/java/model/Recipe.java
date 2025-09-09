package com.example.recipeapi.model;

import jakarta.xml.bind.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@XmlRootElement(name = "recipe")
@XmlAccessorType(XmlAccessType.FIELD)
@Document(collection = "recipes")
public class Recipe {

    @Id
    private String id;
    private String title;
    private List<String> ingredients;
    private List<String> instructions;
    private int cookingTime;
    private String category;
    +
    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<String> getIngredients() { return ingredients; }
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }

    public List<String> getInstructions() { return instructions; }
    public void setInstructions(List<String> instructions) { this.instructions = instructions; }

    public int getCookingTime() { return cookingTime; }
    public void setCookingTime(int cookingTime) { this.cookingTime = cookingTime; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
