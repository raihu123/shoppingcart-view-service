package com.miu.swa.project.shoppingcartviewservice.repo;

import com.miu.swa.project.shoppingcartviewservice.model.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface ShoppingCartRepo extends MongoRepository<ShoppingCart, BigInteger> {
    Optional<ShoppingCart> findByShoppingCartID(BigInteger shoppingCartID);
}
