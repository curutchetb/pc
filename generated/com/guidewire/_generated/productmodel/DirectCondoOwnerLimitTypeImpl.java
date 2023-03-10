package com.guidewire._generated.productmodel;

@gw.lang.SimplePropertyProcessing
@javax.annotation.Generated(comments = "config/resources/productmodel/policylinepatterns/BOPLine/coveragepatterns/BOPCondoUnitOwnCov.xml", date = "", value = "com.guidewire.pc.productmodel.codegen.ProductModelCodegen")
public class DirectCondoOwnerLimitTypeImpl extends com.guidewire.pc.api.domain.covterm.DirectCovTermInternal implements productmodel.DirectCondoOwnerLimitType {
  public DirectCondoOwnerLimitTypeImpl(gw.api.productmodel.DirectCovTermPattern pattern, entity.Clause clause)  {
    super(pattern, clause);
  }
  
  @java.lang.Override
  public productmodel.BOPCondoUnitOwnCov getBOPCondoUnitOwnCov() {
    return (productmodel.BOPCondoUnitOwnCov)getClause();
  }
  
  @java.lang.Override
  public productmodel.BOPCondoUnitOwnCov getCoverage() {
    return (productmodel.BOPCondoUnitOwnCov)getClause();
  }
  
  
}