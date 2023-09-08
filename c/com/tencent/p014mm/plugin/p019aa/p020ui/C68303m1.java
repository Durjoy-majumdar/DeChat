package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.aa.ui.m1 */
public class C68303m1 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196325a;

    public C68303m1(PaylistAAUI paylistAAUI) {
        this.f196325a = paylistAAUI;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        this.f196325a.hideLoading();
        if (!(obj instanceof String) || obj.toString().equalsIgnoreCase("ok")) {
            PaylistAAUI paylistAAUI = this.f196325a;
            PaylistAAUI.m80675K7(paylistAAUI, paylistAAUI.getContext().getString(C0966R.string.f361483k81));
        } else {
            PaylistAAUI.m80675K7(this.f196325a, obj.toString());
        }
        Log.m105920e("MicroMsg.Aa.PaylistAAUI", "urgeAAPay fail");
    }
}
