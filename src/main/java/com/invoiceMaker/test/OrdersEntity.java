package com.invoiceMaker.test;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Orders", schema = "InvoiceMaker", catalog = "")
public class OrdersEntity {
    private int orderId;
    private Integer invoiceId;
    private Integer shipmentId;
    private int usersId;
    private InvoiceEntity invoiceByInvoiceId;
    private UserEntity userByUsersId;
    private ShipmentEntity shipmentByShipmentId;

    @Id
    @Column(name = "orderId", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "Invoice_id", nullable = true)
    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "Shipment_id", nullable = true)
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Basic
    @Column(name = "users_id", nullable = false)
    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return orderId == that.orderId && usersId == that.usersId && Objects.equals(invoiceId, that.invoiceId) && Objects.equals(shipmentId, that.shipmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, invoiceId, shipmentId, usersId);
    }

    @ManyToOne
    @JoinColumn(name = "Invoice_id", referencedColumnName = "id")
    public InvoiceEntity getInvoiceByInvoiceId() {
        return invoiceByInvoiceId;
    }

    public void setInvoiceByInvoiceId(InvoiceEntity invoiceByInvoiceId) {
        this.invoiceByInvoiceId = invoiceByInvoiceId;
    }

    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUsersId() {
        return userByUsersId;
    }

    public void setUserByUsersId(UserEntity userByUsersId) {
        this.userByUsersId = userByUsersId;
    }

    @ManyToOne
    @JoinColumn(name = "Shipment_id", referencedColumnName = "id")
    public ShipmentEntity getShipmentByShipmentId() {
        return shipmentByShipmentId;
    }

    public void setShipmentByShipmentId(ShipmentEntity shipmentByShipmentId) {
        this.shipmentByShipmentId = shipmentByShipmentId;
    }
}
