package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tenpay.miniapp.MiniAppSecureEditText;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.a2 */
public final class C68699a2 extends C87413o implements C32226l<MiniAppSecureEditText, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f197355d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68699a2(String str) {
        super(1);
        this.f197355d = str;
    }

    public Object invoke(Object obj) {
        MiniAppSecureEditText miniAppSecureEditText = (MiniAppSecureEditText) obj;
        C87412m.m108594g(miniAppSecureEditText, LocaleUtil.ITALIAN);
        miniAppSecureEditText.customInsertSalt(this.f197355d);
        return C13598b0.f38549a;
    }
}
