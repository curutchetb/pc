package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkersCompCov.eti;WorkersCompCov.eix;WorkersCompCov.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkersCompCovInternal extends com.guidewire._generated.entity.EffDatedInternal, com.guidewire._generated.entity.CoverageInternal, gw.api.copier.EffDatedCopyable, gw.api.domain.CoverageAdapter, gw.api.logicalmatch.EffDatedLogicalMatcher {
  /**
   * Adds the given element to the Costs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCosts(entity.WCCovEmpCost element);
  
  
  /**
   * Gets the value of the BasedOnValue field.
   * Link to the row on which this row is based; or null if new to branch
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkersCompCov getBasedOnValue();
  
  
  public gw.pl.persistence.core.Key getBasedOnValueID();
  
  
  /**
   * Gets the value of the BranchValue field.
   * Link to root of effdated tree
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getBranchValue();
  
  
  public gw.pl.persistence.core.Key getBranchValueID();
  
  
  /**
   * Gets the value of the ChoiceTerm1 field.
   * choice cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChoiceTerm1();
  
  
  /**
   * Gets the value of the ChoiceTerm2 field.
   * choice cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChoiceTerm2();
  
  
  /**
   * Gets the value of the ChoiceTerm3 field.
   * choice cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChoiceTerm3();
  
  
  /**
   * Gets the value of the ChoiceTerm4 field.
   * choice cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChoiceTerm4();
  
  
  /**
   * Gets the value of the Costs field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCCovEmpCost[] getCosts();
  
  
  /**
   * Gets the value of the DirectTerm1 field.
   * direct cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDirectTerm1();
  
  
  /**
   * Gets the value of the DirectTerm2 field.
   * direct cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDirectTerm2();
  
  
  /**
   * Gets the value of the DirectTerm3 field.
   * direct cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDirectTerm3();
  
  
  /**
   * Gets the value of the FedEmpLiabLawTerm1 field.
   * choice cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFedEmpLiabLawTerm1();
  
  
  /**
   * Gets the value of the Fixed field.
   * Unique ID for this 'object' across all branches and periods
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkersCompCov getFixed();
  
  
  public gw.pl.persistence.core.Key getFixedID();
  
  
  /**
   * Gets the value of the StringTerm1 field.
   * string cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStringTerm1();
  
  
  /**
   * Gets the value of the StringTerm2 field.
   * string cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStringTerm2();
  
  
  /**
   * Gets the value of the StringTerm3 field.
   * string cov term field
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStringTerm3();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkersCompCov getSubtype();
  
  
  /**
   * Gets the value of the WCLine field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkersCompLine getWCLine();
  
  
  public gw.pl.persistence.core.Key getWCLineID();
  
  
  /**
   * Gets the value of the ChoiceTerm1Avl field.
   * whether or not the ChoiceTerm1 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isChoiceTerm1Avl();
  
  
  /**
   * Gets the value of the ChoiceTerm2Avl field.
   * whether or not the ChoiceTerm2 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isChoiceTerm2Avl();
  
  
  /**
   * Gets the value of the ChoiceTerm3Avl field.
   * whether or not the ChoiceTerm3 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isChoiceTerm3Avl();
  
  
  /**
   * Gets the value of the ChoiceTerm4Avl field.
   * whether or not the ChoiceTerm4 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isChoiceTerm4Avl();
  
  
  /**
   * Gets the value of the DirectTerm1Avl field.
   * whether or not the DirectTerm1 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDirectTerm1Avl();
  
  
  /**
   * Gets the value of the DirectTerm2Avl field.
   * whether or not the DirectTerm2 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDirectTerm2Avl();
  
  
  /**
   * Gets the value of the DirectTerm3Avl field.
   * whether or not the DirectTerm3 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDirectTerm3Avl();
  
  
  /**
   * Gets the value of the FedEmpLiabLawTerm1Avl field.
   * whether or not the FedEmpLiabLawTerm1 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFedEmpLiabLawTerm1Avl();
  
  
  /**
   * Gets the value of the StringTerm1Avl field.
   * whether or not the StringTerm1 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStringTerm1Avl();
  
  
  /**
   * Gets the value of the StringTerm2Avl field.
   * whether or not the StringTerm2 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStringTerm2Avl();
  
  
  /**
   * Gets the value of the StringTerm3Avl field.
   * whether or not the StringTerm3 field was available the last time availability was checked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStringTerm3Avl();
  
  
  /**
   * Removes the given element from the Costs array. This is achieved by marking the element for removal.
   */
  public void removeFromCosts(entity.WCCovEmpCost element);
  
  
  /**
   * Removes the given element from the Costs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCosts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BasedOnValue field.
   */
  public void setBasedOnValue(entity.WorkersCompCov value);
  
  
  public void setBasedOnValueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BranchValue field.
   */
  public void setBranchValue(entity.PolicyPeriod value);
  
  
  public void setBranchValueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ChoiceTerm1 field.
   */
  public void setChoiceTerm1(java.lang.String value);
  
  
  /**
   * Sets the value of the ChoiceTerm1Avl field.
   */
  public void setChoiceTerm1Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ChoiceTerm2 field.
   */
  public void setChoiceTerm2(java.lang.String value);
  
  
  /**
   * Sets the value of the ChoiceTerm2Avl field.
   */
  public void setChoiceTerm2Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ChoiceTerm3 field.
   */
  public void setChoiceTerm3(java.lang.String value);
  
  
  /**
   * Sets the value of the ChoiceTerm3Avl field.
   */
  public void setChoiceTerm3Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ChoiceTerm4 field.
   */
  public void setChoiceTerm4(java.lang.String value);
  
  
  /**
   * Sets the value of the ChoiceTerm4Avl field.
   */
  public void setChoiceTerm4Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Costs field.
   */
  public void setCosts(entity.WCCovEmpCost[] value);
  
  
  /**
   * Sets the value of the DirectTerm1 field.
   */
  public void setDirectTerm1(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DirectTerm1Avl field.
   */
  public void setDirectTerm1Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DirectTerm2 field.
   */
  public void setDirectTerm2(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DirectTerm2Avl field.
   */
  public void setDirectTerm2Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DirectTerm3 field.
   */
  public void setDirectTerm3(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DirectTerm3Avl field.
   */
  public void setDirectTerm3Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FedEmpLiabLawTerm1 field.
   */
  public void setFedEmpLiabLawTerm1(java.lang.String value);
  
  
  /**
   * Sets the value of the FedEmpLiabLawTerm1Avl field.
   */
  public void setFedEmpLiabLawTerm1Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Fixed field.
   */
  public void setFixed(entity.WorkersCompCov value);
  
  
  public void setFixedID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the StringTerm1 field.
   */
  public void setStringTerm1(java.lang.String value);
  
  
  /**
   * Sets the value of the StringTerm1Avl field.
   */
  public void setStringTerm1Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StringTerm2 field.
   */
  public void setStringTerm2(java.lang.String value);
  
  
  /**
   * Sets the value of the StringTerm2Avl field.
   */
  public void setStringTerm2Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StringTerm3 field.
   */
  public void setStringTerm3(java.lang.String value);
  
  
  /**
   * Sets the value of the StringTerm3Avl field.
   */
  public void setStringTerm3Avl(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.WorkersCompCov value);
  
  
  /**
   * Sets the value of the WCLine field.
   */
  public void setWCLine(entity.WorkersCompLine value);
  
  
  public void setWCLineID(gw.pl.persistence.core.Key value);
  
  
  
}