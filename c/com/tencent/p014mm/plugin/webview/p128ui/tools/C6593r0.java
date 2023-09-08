package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import p287zz.C16417e;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.r0 */
public final class C6593r0 extends C43830a {

    /* renamed from: b */
    public final String f23839b = "MicroMsg.WalletWebViewHelper";

    /* renamed from: c */
    public int f23840c;

    /* renamed from: d */
    public boolean f23841d = true;

    /* renamed from: e */
    public boolean f23842e;

    public C6593r0(WebViewUI webViewUI) {
        super(webViewUI);
    }

    /* renamed from: d */
    public final void mo7518d(MultiProcessMMKV multiProcessMMKV) {
        LinkedList<C13851h1> linkedList;
        C87412m.m108594g(multiProcessMMKV, "mmkv");
        multiProcessMMKV.encode("key_jsapi_pay_need_close", "");
        if (!(mo68388b().f118508Z == null || (linkedList = mo68388b().f118508Z.f130000e) == null)) {
            linkedList.clear();
        }
        mo68388b().finish();
    }

    /* renamed from: e */
    public final boolean mo7519e(MultiProcessMMKV multiProcessMMKV) {
        if (multiProcessMMKV == null) {
            multiProcessMMKV = MultiProcessMMKV.getSingleDefault();
            C87412m.m108593f(multiProcessMMKV, "getSingleDefault()");
        }
        String decodeString = multiProcessMMKV.decodeString("key_jsapi_pay_need_close", "");
        C87412m.m108593f(decodeString, "mmkv.decodeString(Consta…I.KJsApiPayNeedClose, \"\")");
        boolean z = !Util.isNullOrNil(decodeString) && C87412m.m108589b(decodeString, mo68388b().mo6901n0());
        String str = this.f23839b;
        Log.m105925i(str, "isSameUrl:" + z + ", pay need close url:%s rawUrl:%s", decodeString, mo68388b().mo6901n0());
        return z;
    }

    /* renamed from: f */
    public final void mo7520f(int i) {
        ((C16417e) C86312j.m106911c(C16417e.class)).mo14877nf("7", "1", String.valueOf(i), "");
    }
}
