package org.example.CompositeDesignPattern;

import org.example.CompositeDesignPattern.Product.abstracts.AProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

  List<AProduct> aProductList = new ArrayList<>();

  public Basket() {
  }

  public BigDecimal getBasketTotal(){
    BigDecimal basketTotal = BigDecimal.ZERO;
    for (AProduct aProduct : aProductList) {
      basketTotal = basketTotal.add(aProduct.getPrice());
    }
    return basketTotal;
  }


  public void addToBasket(AProduct product) {
    aProductList.add(product);
  }

  public void removeFromBasket(AProduct product) {
    aProductList.remove(product);
  }





}
