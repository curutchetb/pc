package com.guidewire._generated.productmodel;

@gw.lang.SimplePropertyProcessing
@javax.annotation.Generated(comments = "config/resources/productmodel/policylinepatterns/BOPLine/coveragepatterns/BOPTenantsLiabilityCov.xml", date = "", value = "com.guidewire.pc.productmodel.codegen.ProductModelCodegen")
public class DirectBOPTenantsLiabLimTypeImpl extends com.guidewire.pc.api.domain.covterm.DirectCovTermInternal implements productmodel.DirectBOPTenantsLiabLimType {
  public DirectBOPTenantsLiabLimTypeImpl(gw.api.productmodel.DirectCovTermPattern pattern, entity.Clause clause)  {
    super(pattern, clause);
  }
  
  @java.lang.Override
  public productmodel.BOPTenantsLiabilityCov getBOPTenantsLiabilityCov() {
    return (productmodel.BOPTenantsLiabilityCov)getClause();
  }
  
  @java.lang.Override
  public productmodel.BOPTenantsLiabilityCov getCoverage() {
    return (productmodel.BOPTenantsLiabilityCov)getClause();
  }
  
  
}