package com.guidewire._generated.productmodel;

@gw.lang.SimplePropertyProcessing
@javax.annotation.Generated(comments = "config/resources/productmodel/policylinepatterns/HOPLine/coveragepatterns/HOPCovA.xml", date = "", value = "com.guidewire.pc.productmodel.codegen.ProductModelCodegen")
public class OptionHOPCovACauseOfLossTypeImpl extends com.guidewire.pc.api.domain.covterm.OptionCovTermInternal<productmodel.OptionHOPCovACauseOfLossType> implements productmodel.OptionHOPCovACauseOfLossType {
  public OptionHOPCovACauseOfLossTypeImpl(gw.api.productmodel.OptionCovTermPattern pattern, entity.Clause clause)  {
    super(pattern, clause);
  }
  
  @java.lang.Override
  public productmodel.HOPCovA getCoverage() {
    return (productmodel.HOPCovA)getClause();
  }
  
  @java.lang.Override
  public productmodel.HOPCovA getHOPCovA() {
    return (productmodel.HOPCovA)getClause();
  }
  
  
}