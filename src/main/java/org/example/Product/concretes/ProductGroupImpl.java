package org.example.CompositeDesignPattern.Product.concretes;

import org.example.CompositeDesignPattern.Product.abstracts.AProduct;
import org.example.CompositeDesignPattern.Product.types.ProductType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductGroupImpl extends AProduct {

  List<AProduct> aProductList = new ArrayList<>();

  public ProductGroupImpl(String productName, ProductType productType) {
    super(productName, productType);
  }


  public void addProduct(AProduct product) {
    aProductList.add(product);
  }

  public void removeProduct(AProduct products) {
    aProductList.remove(products);
  }

  @Override
  public BigDecimal getPrice() {

    BigDecimal groupPrice = BigDecimal.ZERO;

    for (AProduct aProduct : aProductList) {

      groupPrice = groupPrice.add(aProduct.getPrice());

    }

    return groupPrice;
  }

}
