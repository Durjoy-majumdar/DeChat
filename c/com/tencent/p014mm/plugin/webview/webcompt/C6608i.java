package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.i */
public final class C6608i extends C87413o implements C32226l<IPCInteger, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15601d<Integer> f23864d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6608i(C15601d<? super Integer> dVar) {
        super(1);
        this.f23864d = dVar;
    }

    public Object invoke(Object obj) {
        IPCInteger iPCInteger = (IPCInteger) obj;
        C87412m.m108594g(iPCInteger, LocaleUtil.ITALIAN);
        C15601d<Integer> dVar = this.f23864d;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(Integer.valueOf(iPCInteger.f10313d)));
        return C13598b0.f38549a;
    }
}
