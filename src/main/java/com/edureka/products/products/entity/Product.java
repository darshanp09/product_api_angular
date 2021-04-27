package com.edureka.products.products.entity;

import com.edureka.products.products.repository.ProductRepository;
import com.edureka.products.products.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, updatable = false, unique = true)
    private UUID id;

    private Integer productId;

    private String productName;
    private String productCode;
    private String releaseDate;
    private String description;
    private float price;
    private float starRating;
    private String imageUrl;
}
