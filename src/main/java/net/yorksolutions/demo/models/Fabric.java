package net.yorksolutions.demo.models;

import java.io.File;

public class Fabric {
    public Long id;
    public int yardsFab;
    public String material;
    public File imageFab;
    public String location;

    public Fabric() {
    }

    public Fabric(Long id, int yardsFab, String material, File imageFab, String location) {
        this.id = id;
        this.yardsFab = yardsFab;
        this.material = material;
        this.imageFab = imageFab;
        this.location = location;
    }
}

