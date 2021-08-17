package dio.bootcamp.productcatalog.repository;

import dio.bootcamp.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
