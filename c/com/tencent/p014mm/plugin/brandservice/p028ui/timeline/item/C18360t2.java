package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import ke3.C88144b;
import qx0.C22136a;
import rx3.C13598b0;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t2 */
public final class C18360t2 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C22499hb0 f50843d;

    /* renamed from: e */
    public final /* synthetic */ C18321o2 f50844e;

    /* renamed from: f */
    public final /* synthetic */ C19623o0 f50845f;

    /* renamed from: g */
    public final /* synthetic */ re4 f50846g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18360t2(C22499hb0 hb02, C18321o2 o2Var, C19623o0 o0Var, re4 re4) {
        super(1);
        this.f50843d = hb02;
        this.f50844e = o2Var;
        this.f50845f = o0Var;
        this.f50846g = re4;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (!Util.isNullOrNil(this.f50843d.f63912q)) {
            String str = this.f50843d.f63912q;
            Intent intent = new Intent();
            String a = C92721n.m116873a(str, 169, 10000, ((int) System.currentTimeMillis()) / 1000);
            intent.putExtra("rawUrl", a);
            intent.putExtra("geta8key_scene", 56);
            C88144b.m109791i(this.f50844e.f50696e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            LinkedList<C22495eh> linkedList = this.f50843d.f63905g;
            this.f50844e.getClass();
            C22495eh ehVar = linkedList.get(0);
            String str2 = ehVar.f63800n.get(0).f63755i;
            C87412m.m108593f(str2, "bizInfo.AppMsg[0].ContentUrl");
            String[] e = C19613h1.m21032e(str2);
            long j = Util.getLong(e[0], 0);
            int i = Util.getInt(e[1], 0);
            C19623o0 o0Var = this.f50845f;
            C22136a.C22137a aVar = C22136a.C22137a.CLICK_REC;
            C87412m.m108594g(o0Var, "info");
            C22136a.f62624g = o0Var;
            C22136a.f62623f = C22136a.f62622e;
            C22136a.f62625h = a;
            C22136a.f62626i = aVar;
            C18412m3 m3Var = this.f50844e.f50695d.f51443n;
            String str3 = ehVar.f63794e;
            re4 re4 = this.f50846g;
            long j2 = re4.f64519h;
            C22499hb0 hb02 = re4.f64523o;
            C22499hb0 hb03 = hb02;
            m3Var.mo22988o(str3, j, i, intValue, 0, j2, "", 0, hb02.f63909n, re4.f64522n, hb02.f63908j, 0, re4.f64521j, "", hb03.f63913r, hb03.f63912q);
            C18321o2 o2Var = this.f50844e;
            o2Var.f50695d.f51443n.mo22977d(this.f50845f, o2Var.f50328b, 0, intValue);
        }
        return C13598b0.f38549a;
    }
}
