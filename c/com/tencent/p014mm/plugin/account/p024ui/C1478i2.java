package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import gy3.C87412m;
import ke3.C88144b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import te3.C51544ug3;

/* renamed from: com.tencent.mm.plugin.account.ui.i2 */
public final class C1478i2 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ PreCheckAffiliateAccountUI f10823d;

    public C1478i2(PreCheckAffiliateAccountUI preCheckAffiliateAccountUI) {
        this.f10823d = preCheckAffiliateAccountUI;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            Intent intent = new Intent();
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrecheckAffiliatedAcctResponse");
            intent.putExtra("rawUrl", ((C51544ug3) aVar).f142851d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            C88144b.m109795m(this.f10823d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 702);
        }
        return 0;
    }
}
