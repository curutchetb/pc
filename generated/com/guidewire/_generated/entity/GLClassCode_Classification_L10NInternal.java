package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GLClassCode_Classification_L10N.eti;GLClassCode_Classification_L10N.eix;GLClassCode_Classification_L10N.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GLClassCode_Classification_L10NInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Language field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the Owner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GLClassCode getOwner();
  
  
  public gw.pl.persistence.core.Key getOwnerID();
  
  
  /**
   * Gets the value of the Value field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValue();
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the Owner field.
   */
  public void setOwner(entity.GLClassCode value);
  
  
  public void setOwnerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.String value);
  
  
  
}