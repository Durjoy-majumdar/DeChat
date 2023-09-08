package gn2;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: gn2.f */
public final class C107867f implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SettingPermissionView f323004d;

    /* renamed from: e */
    public final /* synthetic */ RoundedCornerFrameLayout f323005e;

    public C107867f(SettingPermissionView settingPermissionView, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f323004d = settingPermissionView;
        this.f323005e = roundedCornerFrameLayout;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        C77407n nVar = this.f323004d.f347188n;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        C77407n nVar2 = this.f323004d.f347188n;
        if (nVar2 != null) {
            nVar2.mo107567l(this.f323005e);
        }
    }
}
