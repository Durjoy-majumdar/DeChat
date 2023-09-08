package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import te3.C51181s;

/* renamed from: com.tencent.mm.plugin.aa.ui.h1 */
public class C68289h1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C51181s f196306d;

    /* renamed from: e */
    public final /* synthetic */ C68291i1 f196307e;

    public C68289h1(C68291i1 i1Var, C51181s sVar) {
        this.f196307e = i1Var;
        this.f196306d = sVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        PaylistAAUI.m80674J7(this.f196307e.f196310a, this.f196306d);
        PaylistAAUI paylistAAUI = this.f196307e.f196310a;
        paylistAAUI.f196251j = C75197d0.m90165f(paylistAAUI, false, false, (DialogInterface.OnCancelListener) null);
    }
}
