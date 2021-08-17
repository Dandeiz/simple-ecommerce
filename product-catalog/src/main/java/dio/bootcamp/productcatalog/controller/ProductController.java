package dio.bootcamp.productcatalog.controller;

import dio.bootcamp.productcatalog.model.Product;
import dio.bootcamp.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    public ProductRepository productRepository;

    // CREATE
    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // READ
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }
}
