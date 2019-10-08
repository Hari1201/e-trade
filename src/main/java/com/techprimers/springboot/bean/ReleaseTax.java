package com.techprimers.springboot.bean;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReleaseTax {
  @JsonProperty("transactionId")
private String transactionId;
  @JsonProperty("taxes")
private List<TaxesReleaseTaxImport> taxes;

public List<TaxesReleaseTaxImport> getTaxes() {
return taxes;
}

public void setTaxes(List<TaxesReleaseTaxImport> taxes) {
this.taxes = taxes;
}

public String getTransactionId() {
return transactionId;
}

public void setTransactionId(String transactionId) {
this.transactionId = transactionId;
}


}