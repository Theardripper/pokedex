package org.pokedex.model;

public class Pokemon {
    String id;
    String name;
    String type;
    Double weight;
    Double height;

    public Pokemon(String id, String name, String type, Double weight, Double height) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
