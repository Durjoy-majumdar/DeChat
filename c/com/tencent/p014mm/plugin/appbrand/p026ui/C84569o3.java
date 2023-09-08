package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.o3 */
public final class C84569o3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandUserInfoAuthorizeUI f246770d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84569o3(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
        super(0);
        this.f246770d = appBrandUserInfoAuthorizeUI;
    }

    public Object invoke() {
        MMSwitchBtn mMSwitchBtn = this.f246770d.f246547i;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(true);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("mainSwitch");
        throw null;
    }
}
