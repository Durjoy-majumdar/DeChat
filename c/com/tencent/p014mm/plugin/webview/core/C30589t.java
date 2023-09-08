package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.core.t */
public final class C30589t extends C87413o implements C32226l<IPCString, C13598b0> {

    /* renamed from: d */
    public static final C30589t f82385d = new C30589t();

    public C30589t() {
        super(1);
    }

    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        C87412m.m108594g(iPCString, LocaleUtil.ITALIAN);
        String str = iPCString.f10315d;
        if (!(str == null || C112551y.m153811k(str))) {
            C30584q qVar = C30584q.f82375a;
            String str2 = iPCString.f10315d;
            C87412m.m108593f(str2, "it.value");
            ((MultiProcessMMKV) ((C36570n) C30584q.f82378d).getValue()).encode("AdWUID", str2);
        } else {
            C30584q.f82379e = false;
        }
        return C13598b0.f38549a;
    }
}
