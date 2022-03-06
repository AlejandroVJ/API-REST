package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.LibroService;
/**
 *
 * @author USUARIO
 */

@RestController
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    LibroService libroService;
    
    @GetMapping("/")
    public List<Libro> obtenerLibros(){
        return libroService.obtenerLibros();   
    }
    
    @GetMapping("/titulos")
    public ArrayList<Libro> Titulos(){
        return this.libroService.Titulos();
    }
    
    
    @GetMapping( path = "/{id}") 
    public Optional<Libro> obtenerId(@PathVariable("id")Long id){
        return this.libroService.obtenerId(id);
    }
    
    @GetMapping("/cat/{categoria}") 
    public ArrayList<Libro> obtenerCategoria(@PathVariable String categoria){
        return libroService.obtenerCategoria(categoria);
    }
    
    @GetMapping("/aut/{autor}") 
    public ArrayList<Libro> obtenerAutor(@PathVariable String autor){
        return libroService.obtenerAutor(autor);
    }
    
     @GetMapping("/titl/{titulo}") 
    public ArrayList<Libro> obtenerTitulo(@PathVariable String titulo){
        return libroService.obtenerTitulo(titulo);
    }
    
    
}
