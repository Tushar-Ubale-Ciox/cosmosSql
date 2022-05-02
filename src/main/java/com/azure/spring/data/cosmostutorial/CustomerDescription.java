package com.azure.spring.data.cosmostutorial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonFormat;

@Container(containerName = "hs-custdesc")
public class CustomerDescription {

	@Id
	public String id;
	public String custGroup;
	public String customer;
	public String searchName;
	public String rName;
	public String addr1;
	public String addr2;
	public String addr3;
	public String addr4;
	public String city;
	public String state;
	
	@PartitionKey
	public String zip;
	public String country;
	public String county;
	public String contact;
	public String title;
	public String intPrefix;
	public String phoneNmbr;
	public String phoneExt;
	public String dunnCd;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	public String dunnDate;
	public Long dunnNumber;
	public String holdCode;
	public Long openOrds;
	public Long currBal;
	public Long draftBal;
	public Long orderLim;
	public Long creditLim;
	public String ovrAddrFl;
	public String taxId;
	public String vendorGroup;
	public String vendor;
	public String countryCode;
	public String region;
	public String custAudit;
	public String legalName;
	public String chkDigType;
	public String lIndex;
	public String cudset2SsSw;
	public String lAtcudSsSw;
	public String telexNbr;
	public String majClass;
	public Long reqPrimaryId;
	public String status;
	public String alias;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public LocalDateTime createdDate;
	public String createdBy;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	public LocalDateTime updatedDate;
	public String updatedBy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustGroup() {
		return custGroup;
	}
	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public String getAddr4() {
		return addr4;
	}
	public void setAddr4(String addr4) {
		this.addr4 = addr4;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntPrefix() {
		return intPrefix;
	}
	public void setIntPrefix(String intPrefix) {
		this.intPrefix = intPrefix;
	}
	public String getPhoneNmbr() {
		return phoneNmbr;
	}
	public void setPhoneNmbr(String phoneNmbr) {
		this.phoneNmbr = phoneNmbr;
	}
	public String getPhoneExt() {
		return phoneExt;
	}
	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}
	public String getDunnCd() {
		return dunnCd;
	}
	public void setDunnCd(String dunnCd) {
		this.dunnCd = dunnCd;
	}
	public String getDunnDate() {
		return dunnDate;
	}
	public void setDunnDate(LocalDateTime dunnDate) {
		this.dunnDate = dunnDate.toString();
	}
	public Long getDunnNumber() {
		return dunnNumber;
	}
	public void setDunnNumber(Long dunnNumber) {
		this.dunnNumber = dunnNumber;
	}
	public String getHoldCode() {
		return holdCode;
	}
	public void setHoldCode(String holdCode) {
		this.holdCode = holdCode;
	}
	public Long getOpenOrds() {
		return openOrds;
	}
	public void setOpenOrds(Long openOrds) {
		this.openOrds = openOrds;
	}
	public Long getCurrBal() {
		return currBal;
	}
	public void setCurrBal(Long currBal) {
		this.currBal = currBal;
	}
	public Long getDraftBal() {
		return draftBal;
	}
	public void setDraftBal(Long draftBal) {
		this.draftBal = draftBal;
	}
	public Long getOrderLim() {
		return orderLim;
	}
	public void setOrderLim(Long orderLim) {
		this.orderLim = orderLim;
	}
	public Long getCreditLim() {
		return creditLim;
	}
	public void setCreditLim(Long creditLim) {
		this.creditLim = creditLim;
	}
	public String getOvrAddrFl() {
		return ovrAddrFl;
	}
	public void setOvrAddrFl(String ovrAddrFl) {
		this.ovrAddrFl = ovrAddrFl;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getVendorGroup() {
		return vendorGroup;
	}
	public void setVendorGroup(String vendorGroup) {
		this.vendorGroup = vendorGroup;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCustAudit() {
		return custAudit;
	}
	public void setCustAudit(String custAudit) {
		this.custAudit = custAudit;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getChkDigType() {
		return chkDigType;
	}
	public void setChkDigType(String chkDigType) {
		this.chkDigType = chkDigType;
	}
	public String getlIndex() {
		return lIndex;
	}
	public void setlIndex(String lIndex) {
		this.lIndex = lIndex;
	}
	public String getCudset2SsSw() {
		return cudset2SsSw;
	}
	public void setCudset2SsSw(String cudset2SsSw) {
		this.cudset2SsSw = cudset2SsSw;
	}
	public String getlAtcudSsSw() {
		return lAtcudSsSw;
	}
	public void setlAtcudSsSw(String lAtcudSsSw) {
		this.lAtcudSsSw = lAtcudSsSw;
	}
	public String getTelexNbr() {
		return telexNbr;
	}
	public void setTelexNbr(String telexNbr) {
		this.telexNbr = telexNbr;
	}
	public String getMajClass() {
		return majClass;
	}
	public void setMajClass(String majClass) {
		this.majClass = majClass;
	}
	public Long getReqPrimaryId() {
		return reqPrimaryId;
	}
	public void setReqPrimaryId(Long reqPrimaryId) {
		this.reqPrimaryId = reqPrimaryId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
