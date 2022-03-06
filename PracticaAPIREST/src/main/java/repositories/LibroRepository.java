
package repositories;

import java.util.ArrayList;
import java.util.List;
import models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{
    @Query(value = "SELECT c.id, c.titulo FROM Libros c")
    public abstract ArrayList<Libro> mostrarTitulos();
    public abstract ArrayList<Libro> findByCategoria(String categoria);
    public abstract ArrayList<Libro> findByAutor (String autor);
    public abstract ArrayList<Libro> findByTitulo (String titulo);
}
