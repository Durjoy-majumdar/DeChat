package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.u1 */
public final class C2146u1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C2146u1 f12116d = new C2146u1();

    public C2146u1() {
        super(0);
    }

    public Object invoke() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("test_biz_profile");
        mmkv.encode("noCache", false);
        mmkv.apply();
        return C13598b0.f38549a;
    }
}
