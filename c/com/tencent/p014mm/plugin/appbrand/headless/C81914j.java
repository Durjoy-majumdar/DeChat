package com.tencent.p014mm.plugin.appbrand.headless;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.page.C83781d2;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.j */
public final class C81914j extends C83781d2 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81914j(Context context, C83849m0 m0Var) {
        super(context, m0Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(m0Var, "pageContainer");
    }

    /* renamed from: B */
    public void mo114316B(long j, String str, C83817h4 h4Var) {
        Log.m105924i("MicroMsg.AppBrand.HeadlessPage", "loadUrl appId:" + getAppId() + " url:" + str + ", type:" + h4Var);
        super.mo114316B(j, str, h4Var);
    }

    /* renamed from: g */
    public View mo114317g() {
        C81915k kVar = new C81915k(this);
        kVar.mo116166U0(getContext(), getRuntime());
        this.f244616L = kVar;
        ViewGroup viewGroup = kVar.f244552D;
        C87412m.m108591d(viewGroup);
        return viewGroup;
    }
}
