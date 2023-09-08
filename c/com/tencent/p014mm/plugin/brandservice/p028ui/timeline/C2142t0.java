package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import p227rn.C22240c0;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.t0 */
public final class C2142t0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C2142t0 f12112d = new C2142t0();

    public C2142t0() {
        super(0);
    }

    public Object invoke() {
        Class cls = C22240c0.class;
        boolean vH = ((C22240c0) C86312j.m106911c(cls)).mo35410vH();
        boolean eG = ((C22240c0) C86312j.m106911c(cls)).mo35407eG();
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "使用Flutter:" + vH + ", 使用新数据通道" + eG + '.', 1).show();
        return C13598b0.f38549a;
    }
}
