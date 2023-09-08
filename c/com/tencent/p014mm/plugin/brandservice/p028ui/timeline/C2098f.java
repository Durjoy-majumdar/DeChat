package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.f */
public final class C2098f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C2098f f12062d = new C2098f();

    public C2098f() {
        super(0);
    }

    public Object invoke() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        boolean z = !singleMMKV.decodeBool("ProfileAllaysShowLive", false);
        singleMMKV.encode("ProfileAllaysShowLive", z);
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success! AllaysShowProfileLive=" + z, 1).show();
        return C13598b0.f38549a;
    }
}
