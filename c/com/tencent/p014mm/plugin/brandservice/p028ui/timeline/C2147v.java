package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.v */
public final class C2147v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C2147v f12117d = new C2147v();

    public C2147v() {
        super(0);
    }

    public Object invoke() {
        MultiProcessMMKV.getSingleMMKV("brandService").encode("insertMainDBAlso", 1);
        return C13598b0.f38549a;
    }
}
