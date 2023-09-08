package wr0;

import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gt0.C87362k;
import hk0.C87537c;
import rx3.C13598b0;
import te3.C51888ww3;

/* renamed from: wr0.p */
public class C118780p implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355366d;

    public C118780p(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355366d = appBrandIDCardUI;
    }

    public Object invoke() {
        AppBrandIDCardUI appBrandIDCardUI = this.f355366d;
        C51888ww3 ww32 = appBrandIDCardUI.f345449o.f354578w.f132176i;
        if (ww32 == null) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "scope_wording is null");
            return null;
        }
        String nullAsNil = Util.nullAsNil(ww32.f144327e);
        String nullAsNil2 = Util.nullAsNil(this.f355366d.f345449o.f354578w.f132176i.f144326d);
        int measuredHeight = this.f355366d.f345459y.f223243d.getMeasuredHeight();
        C87362k kVar = appBrandIDCardUI.f345458x;
        if (kVar == null) {
            return null;
        }
        kVar.mo121778b(new C87537c(kVar, nullAsNil, nullAsNil2, appBrandIDCardUI.getContext(), measuredHeight, measuredHeight, new C118779o(appBrandIDCardUI)));
        return null;
    }
}
