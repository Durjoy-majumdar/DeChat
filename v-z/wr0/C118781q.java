package wr0;

import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gt0.C87362k;
import hk0.C87537c;
import rx3.C13598b0;
import te3.C50093k8;

/* renamed from: wr0.q */
public class C118781q implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardUI f355367d;

    public C118781q(AppBrandIDCardUI appBrandIDCardUI) {
        this.f355367d = appBrandIDCardUI;
    }

    public Object invoke() {
        AppBrandIDCardUI appBrandIDCardUI = this.f355367d;
        C50093k8 k8Var = appBrandIDCardUI.f345449o.f354578w.f132177j;
        if (k8Var == null) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "authorize_wording is null");
            return null;
        }
        String nullAsNil = Util.nullAsNil(k8Var.f136605f);
        String nullAsNil2 = Util.nullAsNil(this.f355367d.f345449o.f354578w.f132177j.f136604e);
        int measuredHeight = this.f355367d.f345459y.f223243d.getMeasuredHeight();
        C87362k kVar = appBrandIDCardUI.f345458x;
        if (kVar == null) {
            return null;
        }
        kVar.mo121778b(new C87537c(kVar, nullAsNil, nullAsNil2, appBrandIDCardUI.getContext(), measuredHeight, measuredHeight, new C118779o(appBrandIDCardUI)));
        return null;
    }
}
