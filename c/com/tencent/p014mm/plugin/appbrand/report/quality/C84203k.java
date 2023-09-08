package com.tencent.p014mm.plugin.appbrand.report.quality;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.k */
public final class C84203k implements C84206m {

    /* renamed from: a */
    public final C13601g f245951a;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.k$a */
    public static final class C84204a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C84206m f245952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84204a(C84206m mVar) {
            super(0);
            this.f245952d = mVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f245952d.isEnable());
        }
    }

    public C84203k(C84206m mVar) {
        C87412m.m108594g(mVar, "enableResolver");
        this.f245951a = C36568h.m40985a(new C84204a(mVar));
    }

    public boolean isEnable() {
        return ((Boolean) ((C36570n) this.f245951a).getValue()).booleanValue();
    }
}
