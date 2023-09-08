package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.g */
public final class C44444g extends C87413o implements C32226l<IPCString, C13598b0> {

    /* renamed from: d */
    public static final C44444g f120539d = new C44444g();

    public C44444g() {
        super(1);
    }

    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        C87412m.m108594g(iPCString, LocaleUtil.ITALIAN);
        C44408c.C44410b bVar = C44408c.f120395e;
        String str = iPCString.f10315d;
        if (str == null) {
            str = "";
        }
        C44408c.f120404n = str;
        return C13598b0.f38549a;
    }
}
