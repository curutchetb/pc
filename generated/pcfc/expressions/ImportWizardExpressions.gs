package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 11, column 27
    function afterCancel_8 () : void {
      pcImportDataInfo.cancel(); ImportResults.go(pcImportDataInfo)
    }
    
    // 'afterFinish' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 11, column 27
    function afterFinish_13 () : void {
      pcImportDataInfo.commitChanges(); ImportResults.go(pcImportDataInfo)
    }
    
    // 'allowFinish' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 25, column 78
    function allowFinish_1 () : java.lang.Boolean {
      return (pcImportDataInfo.File != null and pcImportDataInfo.NumConflicts == 0) or pcImportDataInfo.ResolutionStrategy != MANUAL
    }
    
    // 'allowNext' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 25, column 78
    function allowNext_2 () : java.lang.Boolean {
      return pcImportDataInfo.File != null and pcImportDataInfo.NumConflicts > 0 and pcImportDataInfo.ResolutionStrategy == MANUAL
    }
    
    // 'canVisit' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 11, column 27
    static function canVisit_9 () : java.lang.Boolean {
      return perm.User.importadmindata
    }
    
    // 'initialValue' attribute on Variable at ImportWizard.pcf: line 17, column 45
    function initialValue_0 () : gw.api.admin.PCImportDataInfo {
      return new gw.api.admin.PCImportDataInfo(new gw.api.admin.PCImportDataValidationImpl())
    }
    
    // Wizard (id=ImportWizard) at ImportWizard.pcf: line 11, column 27
    static function parent_10 () : pcf.api.Destination {
      return pcf.Utilities.createDestination()
    }
    
    // 'screen' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 25, column 78
    function screen_onEnter_3 (def :  pcf.ImportWizard_UploadScreen) : void {
      def.onEnter(pcImportDataInfo)
    }
    
    // 'screen' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 25, column 78
    function screen_refreshVariables_4 (def :  pcf.ImportWizard_UploadScreen) : void {
      def.refreshVariables(pcImportDataInfo)
    }
    
    // 'tabBar' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 11, column 27
    function tabBar_onEnter_11 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 11, column 27
    function tabBar_refreshVariables_12 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on WizardStepIterator at ImportWizard.pcf: line 29, column 53
    function value_7 () : gw.api.admin.ImportDataConflict[] {
      return pcImportDataInfo.Conflicts
    }
    
    override property get CurrentLocation () : pcf.ImportWizard {
      return super.CurrentLocation as pcf.ImportWizard
    }
    
    property get pcImportDataInfo () : gw.api.admin.PCImportDataInfo {
      return getVariableValue("pcImportDataInfo", 0) as gw.api.admin.PCImportDataInfo
    }
    
    property set pcImportDataInfo ($arg :  gw.api.admin.PCImportDataInfo) {
      setVariableValue("pcImportDataInfo", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResolveConflictsExpressionsImpl extends ImportWizardExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'screen' attribute on WizardStep (id=ResolveConflicts) at ImportWizard.pcf: line 33, column 82
    function screen_onEnter_5 (def :  pcf.ImportWizard_ConflictScreen) : void {
      def.onEnter(pcImportDataInfo, importDataConflict)
    }
    
    // 'screen' attribute on WizardStep (id=ResolveConflicts) at ImportWizard.pcf: line 33, column 82
    function screen_refreshVariables_6 (def :  pcf.ImportWizard_ConflictScreen) : void {
      def.refreshVariables(pcImportDataInfo, importDataConflict)
    }
    
    property get importDataConflict () : gw.api.admin.ImportDataConflict {
      return getWizardStepIteratedValue(1) as gw.api.admin.ImportDataConflict
    }
    
    
  }
  
  
}