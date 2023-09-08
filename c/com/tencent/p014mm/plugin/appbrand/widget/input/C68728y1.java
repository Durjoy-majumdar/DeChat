package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.y1 */
public final class C68728y1 extends C87413o implements C32226l<MiniAppSecureEditText, C13598b0> {

    /* renamed from: d */
    public static final C68728y1 f197402d = new C68728y1();

    public C68728y1() {
        super(1);
    }

    public Object invoke(Object obj) {
        MiniAppSecureEditText miniAppSecureEditText = (MiniAppSecureEditText) obj;
        C87412m.m108594g(miniAppSecureEditText, LocaleUtil.ITALIAN);
        Log.m105918d("MicroMsg.AppBrand.SecureInputLogic", "customPasswdSha1");
        miniAppSecureEditText.customPasswdSha1();
        return C13598b0.f38549a;
    }
}
