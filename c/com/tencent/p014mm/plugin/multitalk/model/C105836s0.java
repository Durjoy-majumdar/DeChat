package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.s0 */
public final class C105836s0 extends C87413o implements C32226l<ByteBuffer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32228q<ByteBuffer, Integer, Integer, C13598b0> f314780d;

    /* renamed from: e */
    public final /* synthetic */ C105834r0 f314781e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105836s0(C32228q<? super ByteBuffer, ? super Integer, ? super Integer, C13598b0> qVar, C105834r0 r0Var) {
        super(1);
        this.f314780d = qVar;
        this.f314781e = r0Var;
    }

    public Object invoke(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C87412m.m108594g(byteBuffer, LocaleUtil.ITALIAN);
        this.f314780d.invoke(byteBuffer, Integer.valueOf(this.f314781e.f314776g), Integer.valueOf(this.f314781e.f314777h));
        return C13598b0.f38549a;
    }
}
