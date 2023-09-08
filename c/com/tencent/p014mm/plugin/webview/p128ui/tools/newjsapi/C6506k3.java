package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k3 */
public final class C6506k3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23624d;

    /* renamed from: e */
    public final /* synthetic */ String f23625e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23626f;

    /* renamed from: g */
    public final /* synthetic */ String f23627g;

    /* renamed from: h */
    public final /* synthetic */ boolean f23628h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6506k3(C13855j jVar, String str, C13851h1 h1Var, String str2, boolean z) {
        super(0);
        this.f23624d = jVar;
        this.f23625e = str;
        this.f23626f = h1Var;
        this.f23627g = str2;
        this.f23628h = z;
    }

    public Object invoke() {
        C76879j.m92754y(this.f23624d.f38998a, this.f23625e, "", MMApplicationContext.getContext().getResources().getString(C0966R.string.au5), new C6501j3(this.f23624d, this.f23626f, this.f23627g, this.f23628h));
        return C13598b0.f38549a;
    }
}
