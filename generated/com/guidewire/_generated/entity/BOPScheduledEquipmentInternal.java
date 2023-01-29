package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BOPScheduledEquipment.eti;BOPScheduledEquipment.eix;BOPScheduledEquipment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BOPScheduledEquipmentInternal extends com.guidewire._generated.entity.EffDatedInternal {
  /**
   * Gets the value of the BOPLine field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BusinessOwnersLine getBOPLine();
  
  
  public gw.pl.persistence.core.Key getBOPLineID();
  
  
  /**
   * Gets the value of the BasedOnValue field.
   * Link to the row on which this row is based; or null if new to branch
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BOPScheduledEquipment getBasedOnValue();
  
  
  public gw.pl.persistence.core.Key getBasedOnValueID();
  
  
  /**
   * Gets the value of the BranchValue field.
   * Link to root of effdated tree
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getBranchValue();
  
  
  public gw.pl.persistence.core.Key getBranchValueID();
  
  
  /**
   * Gets the value of the Description field.
   * Description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EquipmentNumber field.
   * The index of this equipment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEquipmentNumber();
  
  
  /**
   * Gets the value of the EquipmentValue field.
   * Equipment Value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEquipmentValue();
  
  
  /**
   * Gets the value of the Fixed field.
   * Unique ID for this 'object' across all branches and periods
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BOPScheduledEquipment getFixed();
  
  
  public gw.pl.persistence.core.Key getFixedID();
  
  
  /**
   * Gets the value of the SerialNumber field.
   * Equipment Identifier.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSerialNumber();
  
  
  /**
   * Sets the value of the BOPLine field.
   */
  public void setBOPLine(entity.BusinessOwnersLine value);
  
  
  public void setBOPLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BasedOnValue field.
   */
  public void setBasedOnValue(entity.BOPScheduledEquipment value);
  
  
  public void setBasedOnValueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BranchValue field.
   */
  public void setBranchValue(entity.PolicyPeriod value);
  
  
  public void setBranchValueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EquipmentNumber field.
   */
  public void setEquipmentNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the EquipmentValue field.
   */
  public void setEquipmentValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Fixed field.
   */
  public void setFixed(entity.BOPScheduledEquipment value);
  
  
  public void setFixedID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SerialNumber field.
   */
  public void setSerialNumber(java.lang.String value);
  
  
  
}