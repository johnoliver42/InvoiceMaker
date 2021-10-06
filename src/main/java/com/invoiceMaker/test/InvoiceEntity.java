package com.invoiceMaker.test;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Invoice", schema = "InvoiceMaker", catalog = "")
public class InvoiceEntity {
    private int id;
    private String userInvoiceId;
    private Integer shipmentId;
    private Timestamp createDate;
    private Timestamp lastUpdated;
    private String businessName;
    private String businessPhone;
    private String businessStreet1;
    private String userByEmail;
    private String businessCity;
    private String businessState;
    private String businessZip;
    private String businessEmail;
    private String notes;
    private BigDecimal subTotal;
    private BigDecimal total;
    private BigDecimal tax;
    private Collection<InvoiceLineItemEntity> invoiceLineItemsById;
    private Collection<ShipmentEntity> shipmentsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userInvoiceId", nullable = true, length = 50)
    public String getUserInvoiceId() {
        return userInvoiceId;
    }

    public void setUserInvoiceId(String userInvoiceId) {
        this.userInvoiceId = userInvoiceId;
    }

    @Basic
    @Column(name = "shipmentId", nullable = true)
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
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
    @Column(name = "businessName", nullable = true, length = 100)
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "businessPhone", nullable = true, length = 15)
    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    @Basic
    @Column(name = "businessStreet1", nullable = true, length = 50)
    public String getBusinessStreet1() {
        return businessStreet1;
    }

    public void setBusinessStreet1(String businessStreet1) {
        this.businessStreet1 = businessStreet1;
    }

    @Basic
    @Column(name = "businessStreet2", nullable = true, length = 50)
    public String getUserByEmail() {
        return userByEmail;
    }

    public void setUserByEmail(String userByEmail) {
        this.userByEmail = userByEmail;
    }

    @Basic
    @Column(name = "businessCity", nullable = true, length = 50)
    public String getBusinessCity() {
        return businessCity;
    }

    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }

    @Basic
    @Column(name = "businessState", nullable = true, length = 50)
    public String getBusinessState() {
        return businessState;
    }

    public void setBusinessState(String businessState) {
        this.businessState = businessState;
    }

    @Basic
    @Column(name = "businessZip", nullable = true, length = 50)
    public String getBusinessZip() {
        return businessZip;
    }

    public void setBusinessZip(String businessZip) {
        this.businessZip = businessZip;
    }

    @Basic
    @Column(name = "businessEmail", nullable = true, length = 50)
    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 300)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "subTotal", nullable = true, precision = 2)
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @Basic
    @Column(name = "total", nullable = true, precision = 2)
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Basic
    @Column(name = "tax", nullable = true, precision = 5)
    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceEntity that = (InvoiceEntity) o;
        return id == that.id && Objects.equals(userInvoiceId, that.userInvoiceId) && Objects.equals(shipmentId, that.shipmentId) && Objects.equals(createDate, that.createDate) && Objects.equals(lastUpdated, that.lastUpdated) && Objects.equals(businessName, that.businessName) && Objects.equals(businessPhone, that.businessPhone) && Objects.equals(businessStreet1, that.businessStreet1) && Objects.equals(userByEmail, that.userByEmail) && Objects.equals(businessCity, that.businessCity) && Objects.equals(businessState, that.businessState) && Objects.equals(businessZip, that.businessZip) && Objects.equals(businessEmail, that.businessEmail) && Objects.equals(notes, that.notes) && Objects.equals(subTotal, that.subTotal) && Objects.equals(total, that.total) && Objects.equals(tax, that.tax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userInvoiceId, shipmentId, createDate, lastUpdated, businessName, businessPhone, businessStreet1, userByEmail, businessCity, businessState, businessZip, businessEmail, notes, subTotal, total, tax);
    }

    @OneToMany(mappedBy = "invoiceByInvoiceId")
    public Collection<InvoiceLineItemEntity> getInvoiceLineItemsById() {
        return invoiceLineItemsById;
    }

    public void setInvoiceLineItemsById(Collection<InvoiceLineItemEntity> invoiceLineItemsById) {
        this.invoiceLineItemsById = invoiceLineItemsById;
    }

    @OneToMany(mappedBy = "invoiceByInvoiceId")
    public Collection<ShipmentEntity> getShipmentsById() {
        return shipmentsById;
    }

    public void setShipmentsById(Collection<ShipmentEntity> shipmentsById) {
        this.shipmentsById = shipmentsById;
    }
}
