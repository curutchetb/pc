package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/rating/RateRoutineStepInstruction.assignment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RateRoutineStepInstruction_assignmentExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/rating/RateRoutineStepInstruction.assignment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RateRoutineStepInstructionExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'outputConversion' attribute on TextCell (id=RateRoutineStepInstructionForAssignment_Cell) at RateRoutineStepInstruction.assignment.pcf: line 21, column 45
    function outputConversion_0 (VALUE :  java.lang.String) : java.lang.String {
      return step.CalcRoutineDefinition.indentValue(step, VALUE, indentLevelMap)
    }
    
    // 'value' attribute on TextCell (id=RateRoutineStepInstructionForAssignment_Cell) at RateRoutineStepInstruction.assignment.pcf: line 21, column 45
    function valueRoot_2 () : java.lang.Object {
      return step
    }
    
    // 'value' attribute on TextCell (id=RateRoutineStepInstructionForAssignment_Cell) at RateRoutineStepInstruction.assignment.pcf: line 21, column 45
    function value_1 () : java.lang.String {
      return step.StoreLocationForDisplay
    }
    
    property get helper () : gw.pcf.rating.flow.RateRoutineEditScreenHelper {
      return getRequireValue("helper", 0) as gw.pcf.rating.flow.RateRoutineEditScreenHelper
    }
    
    property set helper ($arg :  gw.pcf.rating.flow.RateRoutineEditScreenHelper) {
      setRequireValue("helper", 0, $arg)
    }
    
    property get indentLevelMap () : java.util.HashMap<CalcStepDefinition, java.lang.Integer> {
      return getRequireValue("indentLevelMap", 0) as java.util.HashMap<CalcStepDefinition, java.lang.Integer>
    }
    
    property set indentLevelMap ($arg :  java.util.HashMap<CalcStepDefinition, java.lang.Integer>) {
      setRequireValue("indentLevelMap", 0, $arg)
    }
    
    property get step () : entity.CalcStepDefinition {
      return getRequireValue("step", 0) as entity.CalcStepDefinition
    }
    
    property set step ($arg :  entity.CalcStepDefinition) {
      setRequireValue("step", 0, $arg)
    }
    
    
  }
  
  
}