package entity;

/**
 * AgreementParticipant
 * A reinsurer in a reinsurance agreement
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AgreementParticipant.eti;AgreementParticipant.eix;AgreementParticipant.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "AgreementParticipant")
public class AgreementParticipant extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, gw.api.contact.ContactOwner {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AgreementParticipant> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AgreementParticipant>("entity.AgreementParticipant");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> AGREEMENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Agreement");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CEDINGRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CedingRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMISSIONRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CommissionRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IMonetaryAmountPropertyInfo> FLATPREMIUM_PROP = new com.guidewire.commons.metadata.types.MonetaryAmountPropertyInfoCache(TYPE, "FlatPremium");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FLATPREMIUM_AMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FlatPremium_amt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FLATPREMIUM_CUR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FlatPremium_cur");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PARTICIPANT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Participant");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REFNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RefNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RISKSHARE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RiskShare");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.AgreementParticipantInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public AgreementParticipant()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public AgreementParticipant(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected AgreementParticipant(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.AgreementParticipantInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.AgreementParticipantInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * 
   * @return A copy of the current bean and a deep copy of all owned array elements
   */
  public entity.KeyableBean copy() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
  }
  
  /**
   * Gets the value of the Agreement field.
   * The reinsurance agreement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreement getAgreement() {
    return (entity.RIAgreement)__getInternalInterface().getFieldValue(AGREEMENT_PROP.get());
  }
  
  /**
   * 
   * @return the currency associated with the agreement
   */
  public typekey.Currency getAgreementCurrency() {
    return ((com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods")).getAgreementCurrency();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CedingRate field.
   * If a non-proportional treaty is divided among multiple participants, then they will each negotiate a rate for their participation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCedingRate() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CEDINGRATE_PROP.get());
  }
  
  /**
   * Gets the value of the CommissionRate field.
   * This is tha actual commission that should be paid to each participant, defined as a % of their share of ceded premiums.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCommissionRate() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(COMMISSIONRATE_PROP.get());
  }
  
  /**
   * Return commission share calculated as (Risk Share * Commission Rate) / Agreement overall commission rate.
   * Sum of Shares should equal 100% across all participants.
   * This is how the overall commission would actually be divided
   * among the participants.
   * @return the calculated commision share
   */
  @gw.datatype.annotation.DataType(name = "longpercentage")
  public java.math.BigDecimal getCommissionShare() {
    return ((com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods")).getCommissionShare();
  }
  
  /**
   * 
   * @return the owned Contact
   */
  public entity.Contact getContact() {
    return ((gw.api.contact.ContactOwner)__getDelegateManager().getImplementation("gw.api.contact.ContactOwner")).getContact();
  }
  
  /**
   * Gets the value of the ContactPublicID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTACTPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the FlatPremium field.
   * If a Fac agreement is divided among multiple participants, then they will each negotiate a price for their participation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getFlatPremium() {
    return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(FLATPREMIUM_PROP.get());
  }
  
  /**
   * Gets the value of the FlatPremium_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFlatPremium_amt() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FLATPREMIUM_AMT_PROP.get());
  }
  
  /**
   * Gets the value of the FlatPremium_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getFlatPremium_cur() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(FLATPREMIUM_CUR_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Participant field.
   * The reinsurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getParticipant() {
    return (entity.Contact)__getInternalInterface().getFieldValue(PARTICIPANT_PROP.get());
  }
  
  /**
   * Return the premium share of this participant. Only applies to non-proportional treaties and
   * only when ceding rate is adjusted for each participant.
   * @return the percentage of premium share
   */
  @gw.datatype.annotation.DataType(name = "longpercentage")
  public java.math.BigDecimal getPremiumShare() {
    return ((com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods")).getPremiumShare();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RefNumber field.
   * Some agreement ID provided by the reinsurer, equivalent to the carrier’s policy number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRefNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REFNUMBER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the RiskShare field.
   * Participants share of any losses to the agreement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRiskShare() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(RISKSHARE_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the Agreement field.
   */
  public void setAgreement(entity.RIAgreement value) {
    __getInternalInterface().setFieldValue(AGREEMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CedingRate field.
   */
  public void setCedingRate(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CEDINGRATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CommissionRate field.
   */
  public void setCommissionRate(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(COMMISSIONRATE_PROP.get(), value);
  }
  
  /**
   * 
   * @param contact the owned Contact
   */
  public void setContact(entity.Contact contact) {
    ((gw.api.contact.ContactOwner)__getDelegateManager().getImplementation("gw.api.contact.ContactOwner")).setContact(contact);
  }
  
  /**
   * Sets the value of the ContactPublicID field.
   */
  public void setContactPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CONTACTPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FlatPremium field.
   */
  public void setFlatPremium(gw.pl.currency.MonetaryAmount value) {
    __getInternalInterface().setFieldValue(FLATPREMIUM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FlatPremium_amt field.
   */
  private void setFlatPremium_amt(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FLATPREMIUM_AMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FlatPremium_cur field.
   */
  private void setFlatPremium_cur(typekey.Currency value) {
    __getInternalInterface().setFieldValue(FLATPREMIUM_CUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the Participant field.
   */
  public void setParticipant(entity.Contact value) {
    __getInternalInterface().setFieldValue(PARTICIPANT_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RefNumber field.
   */
  public void setRefNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REFNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RiskShare field.
   */
  public void setRiskShare(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(RISKSHARE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.AgreementParticipantInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.AgreementParticipant.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * 
     * @return A copy of the current bean and a deep copy of all owned array elements
     */
    public entity.KeyableBean copy() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the Agreement field.
     * The reinsurance agreement.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RIAgreement getAgreement() {
      return (entity.RIAgreement)__getInternalInterface().getFieldValue(AGREEMENT_PROP.get());
    }
    
    /**
     * 
     * @return the currency associated with the agreement
     */
    public typekey.Currency getAgreementCurrency() {
      return ((com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods")).getAgreementCurrency();
    }
    
    public gw.pl.persistence.core.Key getAgreementID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(AGREEMENT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CedingRate field.
     * If a non-proportional treaty is divided among multiple participants, then they will each negotiate a rate for their participation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCedingRate() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(CEDINGRATE_PROP.get());
    }
    
    /**
     * Gets the value of the CommissionRate field.
     * This is tha actual commission that should be paid to each participant, defined as a % of their share of ceded premiums.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getCommissionRate() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(COMMISSIONRATE_PROP.get());
    }
    
    /**
     * Return commission share calculated as (Risk Share * Commission Rate) / Agreement overall commission rate.
     * Sum of Shares should equal 100% across all participants.
     * This is how the overall commission would actually be divided
     * among the participants.
     * @return the calculated commision share
     */
    @gw.datatype.annotation.DataType(name = "longpercentage")
    public java.math.BigDecimal getCommissionShare() {
      return ((com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods")).getCommissionShare();
    }
    
    /**
     * 
     * @return the owned Contact
     */
    public entity.Contact getContact() {
      return ((gw.api.contact.ContactOwner)__getDelegateManager().getImplementation("gw.api.contact.ContactOwner")).getContact();
    }
    
    /**
     * Gets the value of the ContactPublicID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getContactPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTACTPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the FlatPremium field.
     * If a Fac agreement is divided among multiple participants, then they will each negotiate a price for their participation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.currency.MonetaryAmount getFlatPremium() {
      return (gw.pl.currency.MonetaryAmount)__getInternalInterface().getFieldValue(FLATPREMIUM_PROP.get());
    }
    
    /**
     * Gets the value of the FlatPremium_amt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFlatPremium_amt() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FLATPREMIUM_AMT_PROP.get());
    }
    
    /**
     * Gets the value of the FlatPremium_cur field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getFlatPremium_cur() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(FLATPREMIUM_CUR_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the Participant field.
     * The reinsurer.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getParticipant() {
      return (entity.Contact)__getInternalInterface().getFieldValue(PARTICIPANT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getParticipantID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PARTICIPANT_PROP.get());
    }
    
    /**
     * Return the premium share of this participant. Only applies to non-proportional treaties and
     * only when ceding rate is adjusted for each participant.
     * @return the percentage of premium share
     */
    @gw.datatype.annotation.DataType(name = "longpercentage")
    public java.math.BigDecimal getPremiumShare() {
      return ((com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods")).getPremiumShare();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RefNumber field.
     * Some agreement ID provided by the reinsurer, equivalent to the carrier’s policy number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRefNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REFNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RiskShare field.
     * Participants share of any losses to the agreement.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getRiskShare() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(RISKSHARE_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Agreement field.
     */
    public void setAgreement(entity.RIAgreement value) {
      __getInternalInterface().setFieldValue(AGREEMENT_PROP.get(), value);
    }
    
    public void setAgreementID(gw.pl.persistence.core.Key value) {
      setFieldValue(AGREEMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CedingRate field.
     */
    public void setCedingRate(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CEDINGRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CommissionRate field.
     */
    public void setCommissionRate(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(COMMISSIONRATE_PROP.get(), value);
    }
    
    /**
     * 
     * @param contact the owned Contact
     */
    public void setContact(entity.Contact contact) {
      ((gw.api.contact.ContactOwner)__getDelegateManager().getImplementation("gw.api.contact.ContactOwner")).setContact(contact);
    }
    
    /**
     * Sets the value of the ContactPublicID field.
     */
    public void setContactPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CONTACTPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FlatPremium field.
     */
    public void setFlatPremium(gw.pl.currency.MonetaryAmount value) {
      __getInternalInterface().setFieldValue(FLATPREMIUM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FlatPremium_amt field.
     */
    public void setFlatPremium_amt(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FLATPREMIUM_AMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FlatPremium_cur field.
     */
    public void setFlatPremium_cur(typekey.Currency value) {
      __getInternalInterface().setFieldValue(FLATPREMIUM_CUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Participant field.
     */
    public void setParticipant(entity.Contact value) {
      __getInternalInterface().setFieldValue(PARTICIPANT_PROP.get(), value);
    }
    
    public void setParticipantID(gw.pl.persistence.core.Key value) {
      setFieldValue(PARTICIPANT_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RefNumber field.
     */
    public void setRefNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REFNUMBER_PROP.get(), value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RiskShare field.
     */
    public void setRiskShare(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(RISKSHARE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pc.domain.reinsurance.AgreementParticipantPublicMethods", "com.guidewire.pc.domain.reinsurance.impl.AgreementParticipantImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.api.contact.ContactOwner", "com.guidewire.pc.domain.reinsurance.impl.AgreementParticipantImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.AgreementParticipant.class, config);
    com.guidewire._generated.entity.AgreementParticipantInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.AgreementParticipant, com.guidewire._generated.entity.AgreementParticipantInternal>() {
      public java.lang.Object getImplementation(entity.AgreementParticipant bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AgreementParticipantInternal getInternalInterface(entity.AgreementParticipant bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.AgreementParticipant newEmptyInstance() {
        return new entity.AgreementParticipant((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}