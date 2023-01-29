package perm

uses java.lang.Object
uses javax.annotation.Generated

@Generated("security-config-app.xml;security-config-pl.xml;security-config.xml", "", "com.guidewire.pl.permissions.codegen.EntityPermissionsGenerator")
class Cancellation {
  static function advance (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.ADVANCE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function bind (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.BIND.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function edit (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.EDIT.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function issue (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.ISSUE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function quote (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.QUOTE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function reschedule (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.RESCHEDULE.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function rescind (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.RESCIND.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function review (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.REVIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function view (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.VIEW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  static function withdraw (object :  Object) : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.WITHDRAW.hasPermission(entity.User.util.CurrentUser, object)
  }
  
  public static property get create () : boolean {
    return com.guidewire._generated.security.CancellationPermKeys.CREATE.hasPermission(entity.User.util.CurrentUser, null)
  }
  
  
}