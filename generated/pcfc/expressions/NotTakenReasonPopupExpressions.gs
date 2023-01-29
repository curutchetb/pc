package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/account/submgr/NotTakenReasonPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NotTakenReasonPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/account/submgr/NotTakenReasonPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotTakenReasonPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (submission :  Submission, policyPeriod :  PolicyPeriod, wizard :  pcf.api.Wizard) : int {
      return 0
    }
    
    // 'afterCommit' attribute on Popup (id=NotTakenReasonPopup) at NotTakenReasonPopup.pcf: line 12, column 65
    function afterCommit_2 (TopLocation :  pcf.api.Location) : void {
      gw.web.account.submgr.NotTakenReasonPopupUIHelper.doNotTakeSubmission(submission, policyPeriod, wizard)
    }
    
    // 'canVisit' attribute on Popup (id=NotTakenReasonPopup) at NotTakenReasonPopup.pcf: line 12, column 65
    static function canVisit_3 (policyPeriod :  PolicyPeriod, submission :  Submission, wizard :  pcf.api.Wizard) : java.lang.Boolean {
      return perm.Submission.edit(submission)
    }
    
    // 'def' attribute on PanelRef at NotTakenReasonPopup.pcf: line 32, column 59
    function def_onEnter_0 (def :  pcf.RejectReasonDV) : void {
      def.onEnter(submission, TC_NOTTAKENACK)
    }
    
    // 'def' attribute on PanelRef at NotTakenReasonPopup.pcf: line 32, column 59
    function def_refreshVariables_1 (def :  pcf.RejectReasonDV) : void {
      def.refreshVariables(submission, TC_NOTTAKENACK)
    }
    
    override property get CurrentLocation () : pcf.NotTakenReasonPopup {
      return super.CurrentLocation as pcf.NotTakenReasonPopup
    }
    
    property get policyPeriod () : PolicyPeriod {
      return getVariableValue("policyPeriod", 0) as PolicyPeriod
    }
    
    property set policyPeriod ($arg :  PolicyPeriod) {
      setVariableValue("policyPeriod", 0, $arg)
    }
    
    property get submission () : Submission {
      return getVariableValue("submission", 0) as Submission
    }
    
    property set submission ($arg :  Submission) {
      setVariableValue("submission", 0, $arg)
    }
    
    property get wizard () : pcf.api.Wizard {
      return getVariableValue("wizard", 0) as pcf.api.Wizard
    }
    
    property set wizard ($arg :  pcf.api.Wizard) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}