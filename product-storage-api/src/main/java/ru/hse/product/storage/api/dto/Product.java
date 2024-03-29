package ru.hse.product.storage.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {

  private UUID id;

  private String name;

  private String imageUrl;

  private int price;
}
