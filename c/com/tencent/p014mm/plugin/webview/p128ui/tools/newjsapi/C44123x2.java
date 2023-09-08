package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.x2 */
public final class C44123x2 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f119523d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44123x2(C13855j jVar) {
        super(1);
        this.f119523d = jVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "sourUserName");
        C44111u2 u2Var = C44111u2.f119490d;
        u2Var.getClass();
        HashMap e = C44111u2.m48408e(u2Var, C44111u2.f119494h);
        e.put("sourUserName", str);
        Context context = this.f119523d.f38998a;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        ((WebViewUI) context).f118513b1.mo67720g0().mo73243l("sendAppMessage", true);
        Context context2 = this.f119523d.f38998a;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        ((WebViewUI) context2).f118513b1.mo67720g0().mo73237f0(e, 4);
        return C13598b0.f38549a;
    }
}
