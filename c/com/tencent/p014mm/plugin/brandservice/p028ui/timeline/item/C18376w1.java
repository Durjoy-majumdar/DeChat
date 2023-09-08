package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.w1 */
public final class C18376w1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C22499hb0 f50911d;

    /* renamed from: e */
    public final /* synthetic */ C18335q1 f50912e;

    /* renamed from: f */
    public final /* synthetic */ re4 f50913f;

    /* renamed from: g */
    public final /* synthetic */ C19623o0 f50914g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18376w1(C22499hb0 hb02, C18335q1 q1Var, re4 re4, C19623o0 o0Var) {
        super(0);
        this.f50911d = hb02;
        this.f50912e = q1Var;
        this.f50913f = re4;
        this.f50914g = o0Var;
    }

    public Object invoke() {
        if (!Util.isNullOrNil(this.f50911d.f63912q)) {
            String str = this.f50911d.f63912q;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", C92721n.m116873a(str, 169, 10000, ((int) System.currentTimeMillis()) / 1000));
            intent.putExtra("geta8key_scene", 56);
            C88144b.m109791i(this.f50912e.f50744e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C22495eh ehVar = this.f50911d.f63905g.get(this.f50912e.f50756q);
            String str2 = ehVar.f63800n.get(0).f63755i;
            C87412m.m108593f(str2, "bizInfo.AppMsg[0].ContentUrl");
            String[] e = C19613h1.m21032e(str2);
            long j = Util.getLong(e[0], 0);
            int i = Util.getInt(e[1], 0);
            C18412m3 m3Var = this.f50912e.f50743d.f51443n;
            String str3 = ehVar.f63794e;
            re4 re4 = this.f50913f;
            long j2 = re4.f64519h;
            C22499hb0 hb02 = re4.f64523o;
            m3Var.mo22988o(str3, j, i, 24, 0, j2, "", 0, hb02.f63909n, re4.f64522n, hb02.f63908j, 0, re4.f64521j, "", hb02.f63913r, hb02.f63912q);
            C18335q1 q1Var = this.f50912e;
            q1Var.f50743d.f51443n.mo22977d(this.f50914g, q1Var.f50328b, 0, 24);
        }
        return C13598b0.f38549a;
    }
}
