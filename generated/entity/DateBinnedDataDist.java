package entity;

/**
 * DateBinnedDataDist
 * Stores the distribution of items by date bins sizes for a given value column, date column pair.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateBinnedDataDist.eti;DateBinnedDataDist.eix;DateBinnedDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DateBinnedDataDist")
public class DateBinnedDataDist extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DateBinnedDataDist> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DateBinnedDataDist>("entity.DateBinnedDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDLCOLUMNNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddlColumnName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DATATYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DataType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATECOLUMNNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateColumnName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TABLEDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TableDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> VALUEBINS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ValueBins");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALUECOLUMNNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ValueColumnName");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DateBinnedDataDistInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DateBinnedDataDist()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DateBinnedDataDist(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DateBinnedDataDist(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DateBinnedDataDistInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DateBinnedDataDistInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the ValueBins array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValueBins(entity.DateBinnedDDValue element) {
    __getInternalInterface().addArrayElement(VALUEBINS_PROP.get(), element);
  }
  
  /**
   * 
   * @return A copy of the current bean and a deep copy of all owned array elements
   */
  public entity.KeyableBean copy() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
  }
  
  /**
   * Gets the value of the AddlColumnName field.
   * Additional value column name (optional)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddlColumnName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDLCOLUMNNAME_PROP.get());
  }
  
  /**
   * Gets the value of the DataType field.
   * Data type of primary column in value bins.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateBinDataType getDataType() {
    return (typekey.DateBinDataType)__getInternalInterface().getFieldValue(DATATYPE_PROP.get());
  }
  
  /**
   * Gets the value of the DateColumnName field.
   * Date column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDateColumnName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DATECOLUMNNAME_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * 
   * @return Unique identifier of the object.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist() {
    return (entity.TableDataDist)__getInternalInterface().getFieldValue(TABLEDATADIST_PROP.get());
  }
  
  /**
   * Gets the value of the ValueBins field.
   * Value of MainColumn and Addlcolumn (these must be bounded)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDDValue[] getValueBins() {
    return (entity.DateBinnedDDValue[])__getInternalInterface().getFieldValue(VALUEBINS_PROP.get());
  }
  
  /**
   * Gets the value of the ValueColumnName field.
   * Main value column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValueColumnName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALUECOLUMNNAME_PROP.get());
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
   * Removes the given element from the ValueBins array. This is achieved by marking the element for removal.
   */
  public void removeFromValueBins(entity.DateBinnedDDValue element) {
    __getInternalInterface().removeArrayElement(VALUEBINS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ValueBins array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValueBins(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(VALUEBINS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AddlColumnName field.
   */
  public void setAddlColumnName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDLCOLUMNNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DataType field.
   */
  public void setDataType(typekey.DateBinDataType value) {
    __getInternalInterface().setFieldValue(DATATYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateColumnName field.
   */
  public void setDateColumnName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DATECOLUMNNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value) {
    __getInternalInterface().setFieldValue(TABLEDATADIST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValueBins field.
   */
  public void setValueBins(entity.DateBinnedDDValue[] value) {
    __getInternalInterface().setFieldValue(VALUEBINS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValueColumnName field.
   */
  public void setValueColumnName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VALUECOLUMNNAME_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DateBinnedDataDistInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DateBinnedDataDist.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ValueBins array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToValueBins(entity.DateBinnedDDValue element) {
      __getInternalInterface().addArrayElement(VALUEBINS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
     * Gets the value of the AddlColumnName field.
     * Additional value column name (optional)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddlColumnName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDLCOLUMNNAME_PROP.get());
    }
    
    /**
     * Gets the value of the DataType field.
     * Data type of primary column in value bins.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DateBinDataType getDataType() {
      return (typekey.DateBinDataType)__getInternalInterface().getFieldValue(DATATYPE_PROP.get());
    }
    
    /**
     * Gets the value of the DateColumnName field.
     * Date column name.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDateColumnName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DATECOLUMNNAME_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * Description.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * 
     * @return Unique identifier of the object.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the TableDataDist field.
     * TableDataDist for this object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableDataDist getTableDataDist() {
      return (entity.TableDataDist)__getInternalInterface().getFieldValue(TABLEDATADIST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTableDataDistID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TABLEDATADIST_PROP.get());
    }
    
    /**
     * Gets the value of the ValueBins field.
     * Value of MainColumn and Addlcolumn (these must be bounded)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateBinnedDDValue[] getValueBins() {
      return (entity.DateBinnedDDValue[])__getInternalInterface().getFieldValue(VALUEBINS_PROP.get());
    }
    
    /**
     * Gets the value of the ValueColumnName field.
     * Main value column name.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getValueColumnName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALUECOLUMNNAME_PROP.get());
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
    
    /**
     * Removes the given element from the ValueBins array. This is achieved by marking the element for removal.
     */
    public void removeFromValueBins(entity.DateBinnedDDValue element) {
      __getInternalInterface().removeArrayElement(VALUEBINS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ValueBins array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromValueBins(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(VALUEBINS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddlColumnName field.
     */
    public void setAddlColumnName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDLCOLUMNNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DataType field.
     */
    public void setDataType(typekey.DateBinDataType value) {
      __getInternalInterface().setFieldValue(DATATYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateColumnName field.
     */
    public void setDateColumnName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DATECOLUMNNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the TableDataDist field.
     */
    public void setTableDataDist(entity.TableDataDist value) {
      __getInternalInterface().setFieldValue(TABLEDATADIST_PROP.get(), value);
    }
    
    public void setTableDataDistID(gw.pl.persistence.core.Key value) {
      setFieldValue(TABLEDATADIST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValueBins field.
     */
    public void setValueBins(entity.DateBinnedDDValue[] value) {
      __getInternalInterface().setFieldValue(VALUEBINS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValueColumnName field.
     */
    public void setValueColumnName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VALUECOLUMNNAME_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DateBinnedDataDist.class, config);
    com.guidewire._generated.entity.DateBinnedDataDistInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DateBinnedDataDist, com.guidewire._generated.entity.DateBinnedDataDistInternal>() {
      public java.lang.Object getImplementation(entity.DateBinnedDataDist bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DateBinnedDataDistInternal getInternalInterface(entity.DateBinnedDataDist bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DateBinnedDataDist newEmptyInstance() {
        return new entity.DateBinnedDataDist((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}