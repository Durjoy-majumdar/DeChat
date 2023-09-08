package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneySpareActivityFirst;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import qo3.C101218e0;
import z53.C79309g;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.a0 */
public class C72139a0 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f209268a;

    /* renamed from: b */
    public final /* synthetic */ C79309g f209269b;

    /* renamed from: c */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209270c;

    public C72139a0(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI, C101218e0 e0Var, C79309g gVar) {
        this.f209270c = wcPayRealnameVerifyIdInputUI;
        this.f209268a = e0Var;
        this.f209269b = gVar;
    }

    /* renamed from: a */
    public void mo2001a() {
        this.f209268a.mo140680z();
        C75228t.m90245f0(22, 1, Util.nowSecond(), this.f209270c.f209178U);
        WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209270c;
        C79309g gVar = this.f209269b;
        wcPayRealnameVerifyIdInputUI.getClass();
        Intent intent = new Intent(wcPayRealnameVerifyIdInputUI.getContext(), LuckyMoneySpareActivityFirst.class);
        intent.putExtra("under_age_session_id", gVar.f232839p);
        intent.putExtra("under_age_msg_preview_text", gVar.f232840q);
        wcPayRealnameVerifyIdInputUI.startActivityForResult(intent, 5);
    }
}
