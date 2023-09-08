package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.f2 */
public final class C2100f2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C2100f2 f12064d = new C2100f2();

    public C2100f2() {
        super(0);
    }

    public Object invoke() {
        MultiProcessMMKV.getMMKV("__webview_command").encode("forcesharecard", 0);
        return C13598b0.f38549a;
    }
}
