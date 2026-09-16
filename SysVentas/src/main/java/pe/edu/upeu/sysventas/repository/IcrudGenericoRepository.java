package pe.edu.upeu.sysventas.repository;

import java.util.List;
import java.util.Optional;

public interface IcrudGenericoRepository<T, ID> {
     T save(T entity);
     T udate(T entity);
     Optional<T> findById(ID id);
     List<T> findAll();
     void deleteById(ID id);
     boolean existsById(ID id);
}
