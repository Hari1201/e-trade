package com.techprimers.springboot.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxesReleaseTaxImport {

  
  @JsonProperty("taxDescription")
private String taxDescription;
  @JsonProperty("taxRate")
private String taxRate;
  @JsonProperty("ytdPaid")
private String ytdPaid;
  @JsonProperty("ytdWages")
private String ytdWages;
  @JsonProperty("rateProration")
private String rateProration;
  @JsonProperty("effectiveRate")
private String effectiveRate;
  @JsonProperty("jurisdictionGain")
private String jurisdictionGain;
  @JsonProperty("gainProration")
private String gainProration;
  @JsonProperty("proratedGain")
private String proratedGain;
  @JsonProperty("taxableGain")
private String taxableGain;
  @JsonProperty("withheld")
private String withheld;
  @JsonProperty("prorate")
private String prorate;
  @JsonProperty("customFMV")
private String customFMV;
  @JsonProperty("fmv")
private String fmv;
  
public String getTaxDescription() {
return taxDescription;
}
public void setTaxDescription(String taxDescription) {
this.taxDescription = taxDescription;
}
public String getTaxRate() {
return taxRate;
}
public void setTaxRate(String taxRate) {
this.taxRate = taxRate;
}
public String getYtdPaid() {
return ytdPaid;
}
public void setYtdPaid(String ytdPaid) {
this.ytdPaid = ytdPaid;
}
public String getYtdWages() {
return ytdWages;
}
public void setYtdWages(String ytdWages) {
this.ytdWages = ytdWages;
}
public String getRateProration() {
return rateProration;
}
public void setRateProration(String rateProration) {
this.rateProration = rateProration;
}
public String getEffectiveRate() {
return effectiveRate;
}
public void setEffectiveRate(String effectiveRate) {
this.effectiveRate = effectiveRate;
}
public String getJurisdictionGain() {
return jurisdictionGain;
}
public void setJurisdictionGain(String jurisdictionGain) {
this.jurisdictionGain = jurisdictionGain;
}
public String getGainProration() {
return gainProration;
}
public void setGainProration(String gainProration) {
this.gainProration = gainProration;
}
public String getProratedGain() {
return proratedGain;
}
public void setProratedGain(String proratedGain) {
this.proratedGain = proratedGain;
}
public String getTaxableGain() {
return taxableGain;
}
public void setTaxableGain(String taxableGain) {
this.taxableGain = taxableGain;
}
public String getWithheld() {
return withheld;
}
public void setWithheld(String withheld) {
this.withheld = withheld;
}
public String getProrate() {
return prorate;
}
public void setProrate(String prorate) {
this.prorate = prorate;
}
public String getCustomFMV() {
return customFMV;
}
public void setCustomFMV(String customFMV) {
this.customFMV = customFMV;
}
public String getFmv() {
return fmv;
}
public void setFmv(String fmv) {
this.fmv = fmv;
}



}