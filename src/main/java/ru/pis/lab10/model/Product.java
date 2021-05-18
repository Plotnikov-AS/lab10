package ru.pis.lab10.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "table_products", schema = "lab10_schema")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer count;
    private Float price;

    @ManyToMany(mappedBy = "products")
    private List<History> histories;
}
