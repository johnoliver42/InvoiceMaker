package com.invoiceMaker.test;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "Invoice_Line_Item", schema = "InvoiceMaker", catalog = "")
public class InvoiceLineItemEntity {
    private int id;
    private String productId;
    private String description;
    private BigDecimal price;
    private int quantity;
    private int invoiceId;
    private InvoiceEntity invoiceByInvoiceId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productId", nullable = false, length = 20)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 75)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "Invoice_id", nullable = false)
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceLineItemEntity that = (InvoiceLineItemEntity) o;
        return id == that.id && quantity == that.quantity && invoiceId == that.invoiceId && Objects.equals(productId, that.productId) && Objects.equals(description, that.description) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, description, price, quantity, invoiceId);
    }

    @ManyToOne
    @JoinColumn(name = "Invoice_id", referencedColumnName = "id", nullable = false)
    public InvoiceEntity getInvoiceByInvoiceId() {
        return invoiceByInvoiceId;
    }

    public void setInvoiceByInvoiceId(InvoiceEntity invoiceByInvoiceId) {
        this.invoiceByInvoiceId = invoiceByInvoiceId;
    }
}
