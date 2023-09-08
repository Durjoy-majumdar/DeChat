package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.y */
public final class C83522y extends C87413o implements C32226l<ICommLibReader, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f244017d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83522y(AppBrandRuntimeWC appBrandRuntimeWC) {
        super(1);
        this.f244017d = appBrandRuntimeWC;
    }

    public Object invoke(Object obj) {
        ICommLibReader iCommLibReader = (ICommLibReader) obj;
        C87412m.m108594g(iCommLibReader, LocaleUtil.ITALIAN);
        AppBrandRuntimeWC appBrandRuntimeWC = this.f244017d;
        if (appBrandRuntimeWC.mo113184O1(false) == null) {
            appBrandRuntimeWC.mo113014I0(ICommLibReader.class, iCommLibReader);
            return C13598b0.f38549a;
        }
        throw new IllegalStateException("Duplicated call!!");
    }
}
