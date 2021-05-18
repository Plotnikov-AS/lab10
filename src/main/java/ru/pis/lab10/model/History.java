package ru.pis.lab10.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "table_history", schema = "lab10_schema")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dat;
    private Integer count;
    private Float price;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "mtm_products_history",
            joinColumns = {@JoinColumn(name = "historyId")},
            inverseJoinColumns = {@JoinColumn(name = "productId")})
    private List<Product> products;
}
