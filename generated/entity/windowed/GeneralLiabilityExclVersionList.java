package entity.windowed;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GeneralLiabilityExcl.eti;GeneralLiabilityExcl.eix;GeneralLiabilityExcl.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.lang.SimplePropertyProcessing
public interface GeneralLiabilityExclVersionList extends gw.pl.persistence.core.effdate.EffDatedVersionList {
  entity.GeneralLiabilityExcl AsOf(java.util.Date date);
  
  
  java.util.List<? extends entity.GeneralLiabilityExcl> getAllVersions();
  
  
  
}