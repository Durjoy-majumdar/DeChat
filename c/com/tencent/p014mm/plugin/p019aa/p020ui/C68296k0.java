package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.aa.ui.k0 */
public class C68296k0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C77407n f196316g;

    public C68296k0(LaunchAAUI launchAAUI, C77407n nVar) {
        this.f196316g = nVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        int i = LaunchAAUI.f196093l1;
        MultiProcessMMKV.getMMKV("aa_pay").edit().putBoolean("new_open_IM_user_guide_show", false);
        this.f196316g.mo107572p();
    }
}
