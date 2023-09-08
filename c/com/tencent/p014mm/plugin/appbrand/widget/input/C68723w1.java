package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w1 */
public final class C68723w1 extends C87413o implements C32226l<MiniAppSecureEditText, C13598b0> {

    /* renamed from: d */
    public static final C68723w1 f197396d = new C68723w1();

    public C68723w1() {
        super(1);
    }

    public Object invoke(Object obj) {
        MiniAppSecureEditText miniAppSecureEditText = (MiniAppSecureEditText) obj;
        C87412m.m108594g(miniAppSecureEditText, LocaleUtil.ITALIAN);
        Log.m105918d("MicroMsg.AppBrand.SecureInputLogic", "customPasswdSm3");
        miniAppSecureEditText.customPasswdSm3();
        return C13598b0.f38549a;
    }
}
