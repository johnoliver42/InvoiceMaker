package com.invoiceMaker.test;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Shipment", schema = "InvoiceMaker", catalog = "")
public class ShipmentEntity {
    private int id;
    private String userShipmentId;
    private String easyPostShipmentId;
    private String easyPostTrackerId;
    private Timestamp createDate;
    private Timestamp lastUpdated;
    private String fromName;
    private String fromEmail;
    private String fromPhone;
    private String fromStreet1;
    private String fromStreet2;
    private String fromCity;
    private String fromState;
    private String fromZip;
    private Integer toName;
    private Integer toBusiness;
    private Integer toStreet1;
    private Integer toStreet2;
    private Integer toCity;
    private Integer toState;
    private Integer toZip;
    private Integer weight;
    private Date labelDate;
    private String easyPostCarrierReference;
    private String trackingNumber;
    private Integer invoiceId;
    private String shippingLabelLink;
    private InvoiceEntity invoiceByInvoiceId;
    private ShipmentTrackingEntity shipmentTrackingById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userShipmentId", nullable = true, length = 50)
    public String getUserShipmentId() {
        return userShipmentId;
    }

    public void setUserShipmentId(String userShipmentId) {
        this.userShipmentId = userShipmentId;
    }

    @Basic
    @Column(name = "easyPostShipmentId", nullable = true, length = 200)
    public String getEasyPostShipmentId() {
        return easyPostShipmentId;
    }

    public void setEasyPostShipmentId(String easyPostShipmentId) {
        this.easyPostShipmentId = easyPostShipmentId;
    }

    @Basic
    @Column(name = "easyPostTrackerId", nullable = true, length = 200)
    public String getEasyPostTrackerId() {
        return easyPostTrackerId;
    }

    public void setEasyPostTrackerId(String easyPostTrackerId) {
        this.easyPostTrackerId = easyPostTrackerId;
    }

    @Basic
    @Column(name = "createDate", nullable = false)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "lastUpdated", nullable = false)
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Basic
    @Column(name = "fromName", nullable = true, length = 50)
    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    @Basic
    @Column(name = "fromEmail", nullable = true, length = 50)
    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    @Basic
    @Column(name = "fromPhone", nullable = true, length = 50)
    public String getFromPhone() {
        return fromPhone;
    }

    public void setFromPhone(String fromPhone) {
        this.fromPhone = fromPhone;
    }

    @Basic
    @Column(name = "fromStreet1", nullable = true, length = 50)
    public String getFromStreet1() {
        return fromStreet1;
    }

    public void setFromStreet1(String fromStreet1) {
        this.fromStreet1 = fromStreet1;
    }

    @Basic
    @Column(name = "fromStreet2", nullable = true, length = 50)
    public String getFromStreet2() {
        return fromStreet2;
    }

    public void setFromStreet2(String fromStreet2) {
        this.fromStreet2 = fromStreet2;
    }

    @Basic
    @Column(name = "fromCity", nullable = true, length = 50)
    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    @Basic
    @Column(name = "fromState", nullable = true, length = 50)
    public String getFromState() {
        return fromState;
    }

    public void setFromState(String fromState) {
        this.fromState = fromState;
    }

    @Basic
    @Column(name = "fromZip", nullable = true, length = 50)
    public String getFromZip() {
        return fromZip;
    }

    public void setFromZip(String fromZip) {
        this.fromZip = fromZip;
    }

    @Basic
    @Column(name = "toName", nullable = true)
    public Integer getToName() {
        return toName;
    }

    public void setToName(Integer toName) {
        this.toName = toName;
    }

    @Basic
    @Column(name = "toBusiness", nullable = true)
    public Integer getToBusiness() {
        return toBusiness;
    }

    public void setToBusiness(Integer toBusiness) {
        this.toBusiness = toBusiness;
    }

    @Basic
    @Column(name = "toStreet1", nullable = true)
    public Integer getToStreet1() {
        return toStreet1;
    }

    public void setToStreet1(Integer toStreet1) {
        this.toStreet1 = toStreet1;
    }

    @Basic
    @Column(name = "toStreet2", nullable = true)
    public Integer getToStreet2() {
        return toStreet2;
    }

    public void setToStreet2(Integer toStreet2) {
        this.toStreet2 = toStreet2;
    }

    @Basic
    @Column(name = "toCity", nullable = true)
    public Integer getToCity() {
        return toCity;
    }

    public void setToCity(Integer toCity) {
        this.toCity = toCity;
    }

    @Basic
    @Column(name = "toState", nullable = true)
    public Integer getToState() {
        return toState;
    }

    public void setToState(Integer toState) {
        this.toState = toState;
    }

    @Basic
    @Column(name = "toZip", nullable = true)
    public Integer getToZip() {
        return toZip;
    }

    public void setToZip(Integer toZip) {
        this.toZip = toZip;
    }

    @Basic
    @Column(name = "weight", nullable = true)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "labelDate", nullable = true)
    public Date getLabelDate() {
        return labelDate;
    }

    public void setLabelDate(Date labelDate) {
        this.labelDate = labelDate;
    }

    @Basic
    @Column(name = "easyPostCarrierReference", nullable = true, length = 20)
    public String getEasyPostCarrierReference() {
        return easyPostCarrierReference;
    }

    public void setEasyPostCarrierReference(String easyPostCarrierReference) {
        this.easyPostCarrierReference = easyPostCarrierReference;
    }

    @Basic
    @Column(name = "trackingNumber", nullable = false, length = 100)
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
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
    @Column(name = "shippingLabelLink", nullable = false, length = 200)
    public String getShippingLabelLink() {
        return shippingLabelLink;
    }

    public void setShippingLabelLink(String shippingLabelLink) {
        this.shippingLabelLink = shippingLabelLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentEntity that = (ShipmentEntity) o;
        return id == that.id && Objects.equals(userShipmentId, that.userShipmentId) && Objects.equals(easyPostShipmentId, that.easyPostShipmentId) && Objects.equals(easyPostTrackerId, that.easyPostTrackerId) && Objects.equals(createDate, that.createDate) && Objects.equals(lastUpdated, that.lastUpdated) && Objects.equals(fromName, that.fromName) && Objects.equals(fromEmail, that.fromEmail) && Objects.equals(fromPhone, that.fromPhone) && Objects.equals(fromStreet1, that.fromStreet1) && Objects.equals(fromStreet2, that.fromStreet2) && Objects.equals(fromCity, that.fromCity) && Objects.equals(fromState, that.fromState) && Objects.equals(fromZip, that.fromZip) && Objects.equals(toName, that.toName) && Objects.equals(toBusiness, that.toBusiness) && Objects.equals(toStreet1, that.toStreet1) && Objects.equals(toStreet2, that.toStreet2) && Objects.equals(toCity, that.toCity) && Objects.equals(toState, that.toState) && Objects.equals(toZip, that.toZip) && Objects.equals(weight, that.weight) && Objects.equals(labelDate, that.labelDate) && Objects.equals(easyPostCarrierReference, that.easyPostCarrierReference) && Objects.equals(trackingNumber, that.trackingNumber) && Objects.equals(invoiceId, that.invoiceId) && Objects.equals(shippingLabelLink, that.shippingLabelLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userShipmentId, easyPostShipmentId, easyPostTrackerId, createDate, lastUpdated, fromName, fromEmail, fromPhone, fromStreet1, fromStreet2, fromCity, fromState, fromZip, toName, toBusiness, toStreet1, toStreet2, toCity, toState, toZip, weight, labelDate, easyPostCarrierReference, trackingNumber, invoiceId, shippingLabelLink);
    }

    @ManyToOne
    @JoinColumn(name = "Invoice_id", referencedColumnName = "id")
    public InvoiceEntity getInvoiceByInvoiceId() {
        return invoiceByInvoiceId;
    }

    public void setInvoiceByInvoiceId(InvoiceEntity invoiceByInvoiceId) {
        this.invoiceByInvoiceId = invoiceByInvoiceId;
    }

    @OneToOne(mappedBy = "shipmentById")
    public ShipmentTrackingEntity getShipmentTrackingById() {
        return shipmentTrackingById;
    }

    public void setShipmentTrackingById(ShipmentTrackingEntity shipmentTrackingById) {
        this.shipmentTrackingById = shipmentTrackingById;
    }
}
