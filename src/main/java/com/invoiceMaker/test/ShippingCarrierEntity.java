package com.invoiceMaker.test;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Shipping_Carrier", schema = "InvoiceMaker", catalog = "")
public class ShippingCarrierEntity {
    private int id;
    private String displayName;
    private String easyPostCarrierReference;
    private ShipmentEntity shipmentByEasyPostCarrierReference;
    private Collection<ShipmentTrackingEntity> shipmentTrackingsById;
    private Collection<ShippingAccountCarrierEntity> shippingAccountCarriersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "displayName", nullable = false, length = 20)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Basic
    @Column(name = "easyPostCarrierReference", nullable = false, length = 20)
    public String getEasyPostCarrierReference() {
        return easyPostCarrierReference;
    }

    public void setEasyPostCarrierReference(String easyPostCarrierReference) {
        this.easyPostCarrierReference = easyPostCarrierReference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingCarrierEntity that = (ShippingCarrierEntity) o;
        return id == that.id && Objects.equals(displayName, that.displayName) && Objects.equals(easyPostCarrierReference, that.easyPostCarrierReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName, easyPostCarrierReference);
    }

    @ManyToOne
    @JoinColumn(name = "easyPostCarrierReference", referencedColumnName = "easyPostCarrierReference", nullable = false)
    public ShipmentEntity getShipmentByEasyPostCarrierReference() {
        return shipmentByEasyPostCarrierReference;
    }

    public void setShipmentByEasyPostCarrierReference(ShipmentEntity shipmentByEasyPostCarrierReference) {
        this.shipmentByEasyPostCarrierReference = shipmentByEasyPostCarrierReference;
    }

    @OneToMany(mappedBy = "shippingCarrierByShippingCarrierId")
    public Collection<ShipmentTrackingEntity> getShipmentTrackingsById() {
        return shipmentTrackingsById;
    }

    public void setShipmentTrackingsById(Collection<ShipmentTrackingEntity> shipmentTrackingsById) {
        this.shipmentTrackingsById = shipmentTrackingsById;
    }

    @OneToMany(mappedBy = "shippingCarrierByShippingCarrierId")
    public Collection<ShippingAccountCarrierEntity> getShippingAccountCarriersById() {
        return shippingAccountCarriersById;
    }

    public void setShippingAccountCarriersById(Collection<ShippingAccountCarrierEntity> shippingAccountCarriersById) {
        this.shippingAccountCarriersById = shippingAccountCarriersById;
    }
}
