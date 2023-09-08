package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.t3 */
public final class C84675t3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandUserProfileAuthorizeUI f247031d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84675t3(AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI) {
        super(0);
        this.f247031d = appBrandUserProfileAuthorizeUI;
    }

    public Object invoke() {
        MMSwitchBtn mMSwitchBtn = this.f247031d.f246563i;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(true);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("mainSwitch");
        throw null;
    }
}
