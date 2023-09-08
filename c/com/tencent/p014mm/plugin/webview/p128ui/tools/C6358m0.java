package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.net.Uri;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.m0 */
public final class C6358m0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f23270d;

    /* renamed from: e */
    public final /* synthetic */ String f23271e;

    /* renamed from: f */
    public final /* synthetic */ String f23272f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6358m0(Context context, String str, String str2) {
        super(0);
        this.f23270d = context;
        this.f23271e = str;
        this.f23272f = str2;
    }

    public Object invoke() {
        Context context = this.f23270d;
        String str = this.f23271e;
        C87412m.m108591d(str);
        String str2 = this.f23272f;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str2, "url");
        Uri parse = Uri.parse(str2);
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(str);
        qVar.mo107589a(true);
        qVar.mo107590b(new C6363n0(parse, context));
        qVar.mo107593e(C6591o0.f23834d);
        qVar.mo107603o();
        return C13598b0.f38549a;
    }
}
