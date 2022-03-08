package com.ias.training.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProduct(){
        return "Este es el método para consultar todos los productos";
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String CreateProduct(){
        return "Este es el método para crear un producto";
    }

    @RequestMapping(value = "/products", method = RequestMethod.PUT)
    public String UpdateProduct(){
        return "Este es el método para actualizar un producto";
    }
    @RequestMapping(value = "/products", method = RequestMethod.DELETE)
    public String DeleteProduct(){
        return "Este es el método para eliminar un producto";
    }

}
