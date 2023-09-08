package com.tencent.p014mm.plugin.multitask;

import com.tencent.p014mm.autogen.events.MulitTaskEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitask.m */
public final class C69865m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f201580d;

    /* renamed from: e */
    public final /* synthetic */ String f201581e;

    /* renamed from: f */
    public final /* synthetic */ int f201582f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69865m(int i, String str, int i2) {
        super(0);
        this.f201580d = i;
        this.f201581e = str;
        this.f201582f = i2;
    }

    public Object invoke() {
        MulitTaskEvent mulitTaskEvent = new MulitTaskEvent();
        MulitTaskEvent.C67733a aVar = mulitTaskEvent.f193741d;
        aVar.f193743b = this.f201580d;
        aVar.f193742a = this.f201581e;
        aVar.f193744c = this.f201582f;
        mulitTaskEvent.publish();
        return C13598b0.f38549a;
    }
}
