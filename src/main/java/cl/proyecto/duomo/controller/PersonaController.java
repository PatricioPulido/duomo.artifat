package cl.proyecto.duomo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.proyecto.duomo.entity.Persona;
import cl.proyecto.duomo.interfaces.PersonaRepository;

@RestController
@RequestMapping(path = "/persona")
public class PersonaController {

    @Autowired
    private PersonaRepository repo;

    @PostMapping("/add")
    public Persona add(@RequestBody Persona val) {
        return repo.save(val);
    }

    @GetMapping("/views")
    public List<Persona> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Persona> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Persona update(@RequestBody Persona val) {
        return repo.save(val);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer val) {
        repo.deleteById(val);
        return "Id : " + val + " delete";
    }

}
