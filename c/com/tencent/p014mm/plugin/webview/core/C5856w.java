package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.core.w */
public final class C5856w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f22041d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5856w(String str) {
        super(0);
        this.f22041d = str;
    }

    public Object invoke() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f22041d, 0).show();
        return C13598b0.f38549a;
    }
}
