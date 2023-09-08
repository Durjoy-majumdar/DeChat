package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.aa.ui.e1 */
public class C68282e1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ PaylistAAUI f196293g;

    public C68282e1(PaylistAAUI paylistAAUI) {
        this.f196293g = paylistAAUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click mInstantPayBtn ForCustomize");
        Intent intent = this.f196293g.getIntent();
        intent.putExtra("user_name", this.f196293g.f196240I);
        intent.putExtra("user_real_name", this.f196293g.f196241J);
        intent.putExtra("user_group_solitatire_content", this.f196293g.f196232A);
        C88144b.m109795m(this.f196293g, "aa", ".ui.AARemittanceUI", intent, 234);
    }
}
