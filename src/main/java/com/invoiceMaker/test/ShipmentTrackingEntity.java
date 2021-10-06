package com.invoiceMaker.test;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Shipment_Tracking", schema = "InvoiceMaker", catalog = "")
public class ShipmentTrackingEntity {
    private int id;
    private int shipmentId;
    private String easyPostTracker;
    private String trackingNumber;
    private Integer shippingCarrierId;
    private String trackingLink;
    private ShipmentEntity shipmentById;
    private ShippingCarrierEntity shippingCarrierByShippingCarrierId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "shipmentId", nullable = false)
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Basic
    @Column(name = "easyPostTracker", nullable = false, length = 200)
    public String getEasyPostTracker() {
        return easyPostTracker;
    }

    public void setEasyPostTracker(String easyPostTracker) {
        this.easyPostTracker = easyPostTracker;
    }

    @Basic
    @Column(name = "trackingNumber", nullable = false, length = 75)
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Basic
    @Column(name = "shipping_carrier_id", nullable = true)
    public Integer getShippingCarrierId() {
        return shippingCarrierId;
    }

    public void setShippingCarrierId(Integer shippingCarrierId) {
        this.shippingCarrierId = shippingCarrierId;
    }

    @Basic
    @Column(name = "trackingLink", nullable = false, length = 200)
    public String getTrackingLink() {
        return trackingLink;
    }

    public void setTrackingLink(String trackingLink) {
        this.trackingLink = trackingLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentTrackingEntity that = (ShipmentTrackingEntity) o;
        return id == that.id && shipmentId == that.shipmentId && Objects.equals(easyPostTracker, that.easyPostTracker) && Objects.equals(trackingNumber, that.trackingNumber) && Objects.equals(shippingCarrierId, that.shippingCarrierId) && Objects.equals(trackingLink, that.trackingLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shipmentId, easyPostTracker, trackingNumber, shippingCarrierId, trackingLink);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public ShipmentEntity getShipmentById() {
        return shipmentById;
    }

    public void setShipmentById(ShipmentEntity shipmentById) {
        this.shipmentById = shipmentById;
    }

    @ManyToOne
    @JoinColumn(name = "shipping_carrier_id", referencedColumnName = "id")
    public ShippingCarrierEntity getShippingCarrierByShippingCarrierId() {
        return shippingCarrierByShippingCarrierId;
    }

    public void setShippingCarrierByShippingCarrierId(ShippingCarrierEntity shippingCarrierByShippingCarrierId) {
        this.shippingCarrierByShippingCarrierId = shippingCarrierByShippingCarrierId;
    }
}
