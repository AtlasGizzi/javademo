package net.yorksolutions.demo.controlers;

import net.yorksolutions.demo.models.Fabric;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fabric")
@CrossOrigin
public class FabricControllers {
    private ArrayList<Fabric> fabrics = new ArrayList<>(List.of(new Fabric[]{
            new Fabric(0L, 0, "material", new File(""), "guest room")
    }));
    //FE: this.http.get<fabric[]>(`http://localhost:8080/fabric?yardsFab=${yardsFab}&material=${material}&{location}=${location}`)
    // httpclient made an http request
    // BE: Tomcat

    //@GetMapping
    //public Fabric[] getAll() {
      //  return fabrics;
        //}

    @GetMapping
    public Iterable<Fabric> getByMaterial(@RequestParam(required = false) String material) {
        for (Fabric fabric : fabrics) {
            if (fabric.material.equals(material)) {
                return List.of(new Fabric[]{fabric});
            }
        }
        return null;
    }

    @PostMapping
    public Fabric addFabric(@RequestBody Fabric fabric){
        fabrics.add(fabric);
        return fabric;
    }

}

