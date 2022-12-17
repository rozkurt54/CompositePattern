package org.example.CompositeDesignPattern.Product.abstracts;

import org.example.CompositeDesignPattern.Product.types.ProductType;

import java.math.BigDecimal;

public abstract class AProduct implements Product {

  private String productName;
  private ProductType productType;




  public AProduct(String productName, ProductType productType) {
    this.productName = productName;
    this.productType = productType;
  }


}
