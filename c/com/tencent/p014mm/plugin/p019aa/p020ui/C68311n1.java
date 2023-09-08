package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.aa.ui.n1 */
public class C68311n1 implements C87581a<Void, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196334a;

    public C68311n1(PaylistAAUI paylistAAUI) {
        this.f196334a = paylistAAUI;
    }

    public Object call(Object obj) {
        this.f196334a.hideLoading();
        if (((Boolean) obj).booleanValue()) {
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "urgeAAPay success");
            PaylistAAUI paylistAAUI = this.f196334a;
            PaylistAAUI.m80675K7(paylistAAUI, paylistAAUI.getContext().getString(C0966R.string.f361484k82));
            return null;
        }
        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "urgeAAPay fail");
        PaylistAAUI paylistAAUI2 = this.f196334a;
        PaylistAAUI.m80675K7(paylistAAUI2, paylistAAUI2.getContext().getString(C0966R.string.f361483k81));
        return null;
    }
}
