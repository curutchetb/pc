package com.guidewire._generated.productmodel;

@gw.lang.SimplePropertyProcessing
@javax.annotation.Generated(comments = "config/resources/productmodel/policylinepatterns/PersonalAutoLine/coveragepatterns/PAPIP_HI.xml", date = "", value = "com.guidewire.pc.productmodel.codegen.ProductModelCodegen")
public class PackagePAPIP_HI_WageLossTypeImpl extends com.guidewire.pc.api.domain.covterm.PackageCovTermInternal<productmodel.PackagePAPIP_HI_WageLossType> implements productmodel.PackagePAPIP_HI_WageLossType {
  public PackagePAPIP_HI_WageLossTypeImpl(gw.api.productmodel.PackageCovTermPattern pattern, entity.Clause clause)  {
    super(pattern, clause);
  }
  
  @java.lang.Override
  public productmodel.PAPIP_HI getCoverage() {
    return (productmodel.PAPIP_HI)getClause();
  }
  
  @java.lang.Override
  public productmodel.PAPIP_HI getPAPIP_HI() {
    return (productmodel.PAPIP_HI)getClause();
  }
  
  
}