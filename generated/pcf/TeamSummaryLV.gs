package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamSummaryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamSummaryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($teamModel :  gw.api.web.team.PCTeamModel, $statsType :  typekey.TeamStatsType) : void {
    __widgetOf(this, pcf.TeamSummaryLV, SECTION_WIDGET_CLASS).setVariables(false, {$teamModel, $statsType})
  }
  
  function refreshVariables ($teamModel :  gw.api.web.team.PCTeamModel, $statsType :  typekey.TeamStatsType) : void {
    __widgetOf(this, pcf.TeamSummaryLV, SECTION_WIDGET_CLASS).setVariables(true, {$teamModel, $statsType})
  }
  
  
}