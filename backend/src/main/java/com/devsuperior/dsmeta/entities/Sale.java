package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Leandro Menezes
 */
@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "visited")
    private Integer visited;

    @Column(name = "deals")
    private Integer deals;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "date")
    private LocalDate date;

    public Sale() {
    }

    public Sale(Long id) {
        this.id = id;
    }

    public Sale(String sellerName, Integer visited, Integer deals, Double amount, LocalDate date) {
        this.sellerName = sellerName;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }

    public Sale(Long id, String sellerName, Integer visited, Integer deals, Double amount, LocalDate date) {
        this.id = id;
        this.sellerName = sellerName;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sale other = (Sale) obj;
        return Objects.equals(this.id, other.id);
    }

}
