package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.ComponentName;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import zl0.C91774e;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.l2 */
public final class C2042l2 implements C1761b {

    /* renamed from: d */
    public static final C2042l2 f11989d = new C2042l2();

    /* renamed from: X0 */
    public boolean mo1749X0(C82381f fVar) {
        C87412m.m108594g(fVar, "component");
        return C91774e.f262832c.mo125637a(fVar).f262836b.mo115092e();
    }

    /* renamed from: a */
    public final void mo1965a(boolean z) {
        Log.m105918d("MicroMsg.AppBrand.WeChatNFCLogic", "toggleWeChatNFCLogicUI, enable: " + z);
        try {
            MMApplicationContext.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.InnerNfcDispatchLogicUI"), z ? 1 : 2, 1);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.WeChatNFCLogic", e, "toggleWeChatNFCLogicUI fail", new Object[0]);
        }
    }

    /* renamed from: dE */
    public void mo1750dE() {
        Log.m105918d("MicroMsg.AppBrand.WeChatNFCLogic", "disableHostNFC");
        mo1965a(false);
    }

    /* renamed from: iF */
    public void mo1751iF() {
        Log.m105918d("MicroMsg.AppBrand.WeChatNFCLogic", "enableHostNFC");
        mo1965a(true);
    }
}
