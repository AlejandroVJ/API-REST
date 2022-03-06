package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import repositories.LibroRepository;

/**
 *
 * @author USUARIO
 */
@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public ArrayList<Libro> obtenerLibros() {
        return (ArrayList<Libro>) libroRepository.findAll();
    }
    
    public ArrayList<Libro> Titulos(){
        return libroRepository.mostrarTitulos();
    }

    public Optional<Libro> obtenerId(Long id) {
        return libroRepository.findById(id);
    }

    public ArrayList<Libro> obtenerCategoria(String categoria) {
        return libroRepository.findByCategoria(categoria);
    }

    public ArrayList<Libro> obtenerAutor(String autor) {
        return libroRepository.findByAutor(autor);

    }

    public ArrayList<Libro> obtenerTitulo(String titulo) {
        return libroRepository.findByTitulo(titulo);

    }
}
