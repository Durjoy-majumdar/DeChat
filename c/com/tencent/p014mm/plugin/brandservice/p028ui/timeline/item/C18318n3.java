package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import qx0.C22136a;
import rx3.C13598b0;
import te3.C22508lo3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.n3 */
public final class C18318n3 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C22508lo3 f50687d;

    /* renamed from: e */
    public final /* synthetic */ C18291i3 f50688e;

    /* renamed from: f */
    public final /* synthetic */ C19623o0 f50689f;

    /* renamed from: g */
    public final /* synthetic */ int f50690g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18318n3(C22508lo3 lo32, C18291i3 i3Var, C19623o0 o0Var, int i) {
        super(1);
        this.f50687d = lo32;
        this.f50688e = i3Var;
        this.f50689f = o0Var;
        this.f50690g = i;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (!Util.isNullOrNil(this.f50687d.f64178n)) {
            String str = this.f50687d.f64178n;
            Intent intent = new Intent();
            String a = C92721n.m116873a(str, 169, 200, ((int) System.currentTimeMillis()) / 1000);
            intent.putExtra("rawUrl", a);
            intent.putExtra("geta8key_scene", 56);
            C88144b.m109791i(this.f50688e.f50573e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C115669n.INSTANCE.idkeyStat(1590, 26, 1, false);
            C19623o0 o0Var = this.f50689f;
            C22136a.C22137a aVar = C22136a.C22137a.CLICK_REC_FEED;
            C87412m.m108594g(o0Var, "info");
            C22136a.f62624g = o0Var;
            C22136a.f62623f = C22136a.f62622e;
            C22136a.f62625h = a;
            C22136a.f62626i = aVar;
            this.f50688e.f50572d.f51443n.mo22977d(this.f50689f, this.f50690g, 0, intValue);
        }
        return C13598b0.f38549a;
    }
}
