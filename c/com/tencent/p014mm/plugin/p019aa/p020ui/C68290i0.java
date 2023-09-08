package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.aa.ui.i0 */
public class C68290i0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C77407n f196308g;

    /* renamed from: h */
    public final /* synthetic */ LaunchAAUI f196309h;

    public C68290i0(LaunchAAUI launchAAUI, C77407n nVar) {
        this.f196309h = launchAAUI;
        this.f196308g = nVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        int i = LaunchAAUI.f196093l1;
        MultiProcessMMKV.getMMKV("aa_pay").edit().putBoolean("new_user_guide_show", false);
        this.f196308g.mo107572p();
        this.f196309h.mo93790I7(2);
    }
}
