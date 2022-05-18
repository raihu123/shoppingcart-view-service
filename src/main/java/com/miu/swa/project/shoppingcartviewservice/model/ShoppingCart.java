package com.miu.swa.project.shoppingcartviewservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@Document
public class ShoppingCart {
    @Id
    BigInteger shoppingCartID;
    HashMap<BigInteger, ProductDTO> shoppingCartList;
}
