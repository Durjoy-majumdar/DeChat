package com.tencent.p014mm.plugin.setting.p102ui.setting.permission;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import eb0.C45628s0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingLocationPermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.permission.SettingLocationPermissionUI */
public final class SettingLocationPermissionUI extends BaseSettingPermissionUI {
    /* renamed from: H7 */
    public int mo6369H7() {
        return C0966R.C0971layout.cmb;
    }

    /* renamed from: I7 */
    public int mo6370I7() {
        return C0966R.string.lwc;
    }

    /* renamed from: J7 */
    public int mo6371J7() {
        return C0966R.string.f361304ly0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.mj9);
        int i = C45628s0.m50756U() ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/permission/SettingLocationPermissionUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/setting/permission/SettingLocationPermissionUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
