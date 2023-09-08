package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.v */
public class C84656v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f246973d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandLauncherRecentsList.C84607l f246974e;

    public C84656v(AppBrandLauncherRecentsList.C84607l lVar, boolean z) {
        this.f246974e = lVar;
        this.f246973d = z;
    }

    public void run() {
        C84639j0 j0Var;
        boolean z = true;
        if (!AppBrandLauncherRecentsList.this.f246852y.mo117349G4() && (j0Var = AppBrandLauncherRecentsList.this.f246852y) != null) {
            try {
                j0Var.notifyItemChanged(j0Var.getItemCount() - 1);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandLauncherRecentsList", "adjustListBottomDivider notifyItemChanged e=%s", e);
            }
        }
        AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
        C84657x xVar = appBrandLauncherRecentsList.f246818H;
        if (xVar != null) {
            if (this.f246973d || appBrandLauncherRecentsList.f246852y.mo117349G4()) {
                z = false;
            }
            View view = xVar.f246977c;
            int i = z ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setShowDivider", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setShowDivider", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
