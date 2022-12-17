package org.example.CompositeDesignPattern.Product.concretes;

import org.example.CompositeDesignPattern.Product.abstracts.AProduct;
import org.example.CompositeDesignPattern.Product.abstracts.Product;
import org.example.CompositeDesignPattern.Product.types.ProductType;

import java.math.BigDecimal;

public class ProductImpl extends AProduct implements Product {

  public ProductImpl(String productName, ProductType productType, BigDecimal price) {

    super(productName, productType);

    this.price = price;
  }

  private BigDecimal price;


  @Override
  public BigDecimal getPrice() {

    return price;

  }

}
