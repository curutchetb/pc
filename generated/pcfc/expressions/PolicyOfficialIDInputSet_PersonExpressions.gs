package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/PolicyOfficialIDInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyOfficialIDInputSet_PersonExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/PolicyOfficialIDInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyOfficialIDInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=OfficialIDDV_Input_Input) at PolicyOfficialIDInputSet.Person.pcf: line 17, column 85
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      namedInsured.AccountContactRole.AccountContact.Contact.SSNOfficialID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'required' attribute on TextInput (id=OfficialIDDV_Input_Input) at PolicyOfficialIDInputSet.Person.pcf: line 17, column 85
    function required_0 () : java.lang.Boolean {
      return namedInsured.Branch.HasWorkersComp
    }
    
    // 'value' attribute on TextInput (id=OfficialIDDV_Input_Input) at PolicyOfficialIDInputSet.Person.pcf: line 17, column 85
    function valueRoot_3 () : java.lang.Object {
      return namedInsured.AccountContactRole.AccountContact.Contact
    }
    
    // 'value' attribute on TextInput (id=OfficialIDDV_Input_Input) at PolicyOfficialIDInputSet.Person.pcf: line 17, column 85
    function value_1 () : java.lang.String {
      return namedInsured.AccountContactRole.AccountContact.Contact.SSNOfficialID
    }
    
    property get namedInsured () : PolicyNamedInsured {
      return getRequireValue("namedInsured", 0) as PolicyNamedInsured
    }
    
    property set namedInsured ($arg :  PolicyNamedInsured) {
      setRequireValue("namedInsured", 0, $arg)
    }
    
    
  }
  
  
}