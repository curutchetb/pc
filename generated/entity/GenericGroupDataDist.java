package entity;

/**
 * GenericGroupDataDist
 * Stores the distribution of value-group sizes for generic column data.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GenericGroupDataDist.eti;GenericGroupDataDist.eix;GenericGroupDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "GenericGroupDataDist")
public class GenericGroupDataDist extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.GenericGroupDataDist> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.GenericGroupDataDist>("entity.GenericGroupDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTENDEDDESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExtendedDescription");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> GENERICGROUPCOLUMNNAMEDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "GenericGroupColumnNameDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> GENERICGROUPCOUNTDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "GenericGroupCountDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPTIONALPREDICATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OptionalPredicate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TABLEDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TableDataDist");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.GenericGroupDataDistInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public GenericGroupDataDist()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public GenericGroupDataDist(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected GenericGroupDataDist(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.GenericGroupDataDistInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.GenericGroupDataDistInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the GenericGroupColumnNameDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist element) {
    __getInternalInterface().addArrayElement(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the GenericGroupCountDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGenericGroupCountDataDists(entity.GenericGroupCountDataDist element) {
    __getInternalInterface().addArrayElement(GENERICGROUPCOUNTDATADISTS_PROP.get(), element);
  }
  
  /**
   * 
   * @return A copy of the current bean and a deep copy of all owned array elements
   */
  public entity.KeyableBean copy() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
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
   * Gets the value of the ExtendedDescription field.
   * Extended description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExtendedDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTENDEDDESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the GenericGroupColumnNameDataDists field.
   * Collection of GenericGroupColumnNameDataDists linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupColumnNameDataDist[] getGenericGroupColumnNameDataDists() {
    return (entity.GenericGroupColumnNameDataDist[])__getInternalInterface().getFieldValue(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the GenericGroupCountDataDists field.
   * Collection of GenericGroupCountDataDists linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupCountDataDist[] getGenericGroupCountDataDists() {
    return (entity.GenericGroupCountDataDist[])__getInternalInterface().getFieldValue(GENERICGROUPCOUNTDATADISTS_PROP.get());
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
  
  /**
   * Gets the value of the OptionalPredicate field.
   * Optional predicate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOptionalPredicate() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OPTIONALPREDICATE_PROP.get());
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
   * Removes the given element from the GenericGroupColumnNameDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist element) {
    __getInternalInterface().removeArrayElement(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the GenericGroupColumnNameDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGenericGroupColumnNameDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the GenericGroupCountDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromGenericGroupCountDataDists(entity.GenericGroupCountDataDist element) {
    __getInternalInterface().removeArrayElement(GENERICGROUPCOUNTDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the GenericGroupCountDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGenericGroupCountDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(GENERICGROUPCOUNTDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExtendedDescription field.
   */
  public void setExtendedDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXTENDEDDESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GenericGroupColumnNameDataDists field.
   */
  public void setGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist[] value) {
    __getInternalInterface().setFieldValue(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GenericGroupCountDataDists field.
   */
  public void setGenericGroupCountDataDists(entity.GenericGroupCountDataDist[] value) {
    __getInternalInterface().setFieldValue(GENERICGROUPCOUNTDATADISTS_PROP.get(), value);
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
   * Sets the value of the OptionalPredicate field.
   */
  public void setOptionalPredicate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OPTIONALPREDICATE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.GenericGroupDataDistInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.GenericGroupDataDist.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the GenericGroupColumnNameDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist element) {
      __getInternalInterface().addArrayElement(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the GenericGroupCountDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToGenericGroupCountDataDists(entity.GenericGroupCountDataDist element) {
      __getInternalInterface().addArrayElement(GENERICGROUPCOUNTDATADISTS_PROP.get(), element);
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
     * Gets the value of the Description field.
     * Description.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the ExtendedDescription field.
     * Extended description.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExtendedDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTENDEDDESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the GenericGroupColumnNameDataDists field.
     * Collection of GenericGroupColumnNameDataDists linked to this ArrayDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GenericGroupColumnNameDataDist[] getGenericGroupColumnNameDataDists() {
      return (entity.GenericGroupColumnNameDataDist[])__getInternalInterface().getFieldValue(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get());
    }
    
    /**
     * Gets the value of the GenericGroupCountDataDists field.
     * Collection of GenericGroupCountDataDists linked to this ArrayDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GenericGroupCountDataDist[] getGenericGroupCountDataDists() {
      return (entity.GenericGroupCountDataDist[])__getInternalInterface().getFieldValue(GENERICGROUPCOUNTDATADISTS_PROP.get());
    }
    
    public entity.GenericGroupCountDataDist[] getGenericGroupCountDataDistsOrderedBySize() {
      return ((com.guidewire.pl.domain.database.impl.GenericGroupDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.GenericGroupDataDistInternalMethods")).getGenericGroupCountDataDistsOrderedBySize();
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
    
    /**
     * Gets the value of the OptionalPredicate field.
     * Optional predicate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOptionalPredicate() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OPTIONALPREDICATE_PROP.get());
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
     * Removes the given element from the GenericGroupColumnNameDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist element) {
      __getInternalInterface().removeArrayElement(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the GenericGroupColumnNameDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromGenericGroupColumnNameDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the GenericGroupCountDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromGenericGroupCountDataDists(entity.GenericGroupCountDataDist element) {
      __getInternalInterface().removeArrayElement(GENERICGROUPCOUNTDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the GenericGroupCountDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromGenericGroupCountDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(GENERICGROUPCOUNTDATADISTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExtendedDescription field.
     */
    public void setExtendedDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXTENDEDDESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GenericGroupColumnNameDataDists field.
     */
    public void setGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist[] value) {
      __getInternalInterface().setFieldValue(GENERICGROUPCOLUMNNAMEDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GenericGroupCountDataDists field.
     */
    public void setGenericGroupCountDataDists(entity.GenericGroupCountDataDist[] value) {
      __getInternalInterface().setFieldValue(GENERICGROUPCOUNTDATADISTS_PROP.get(), value);
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
     * Sets the value of the OptionalPredicate field.
     */
    public void setOptionalPredicate(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OPTIONALPREDICATE_PROP.get(), value);
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
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.database.impl.GenericGroupDataDistInternalMethods", "com.guidewire.pl.domain.database.impl.GenericGroupDataDistImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.GenericGroupDataDist.class, config);
    com.guidewire._generated.entity.GenericGroupDataDistInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.GenericGroupDataDist, com.guidewire._generated.entity.GenericGroupDataDistInternal>() {
      public java.lang.Object getImplementation(entity.GenericGroupDataDist bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.GenericGroupDataDistInternal getInternalInterface(entity.GenericGroupDataDist bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.GenericGroupDataDist newEmptyInstance() {
        return new entity.GenericGroupDataDist((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}