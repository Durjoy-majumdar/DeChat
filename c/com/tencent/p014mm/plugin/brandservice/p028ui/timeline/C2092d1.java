package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.d1 */
public final class C2092d1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C2092d1 f12057d = new C2092d1();

    public C2092d1() {
        super(0);
    }

    public Object invoke() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("test_biz_pc");
        mmkv.encode("fake_delete", true);
        mmkv.apply();
        return C13598b0.f38549a;
    }
}
