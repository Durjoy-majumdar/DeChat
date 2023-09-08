package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import gy3.C87412m;
import java.util.List;
import p156gj.C87203t;
import rt0.C77568i;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.r0 */
public final class C68719r0 {
    /* renamed from: a */
    public static final String m80993a(C104912p0 p0Var, C83780d1 d1Var, C77568i iVar) {
        String str;
        String str2;
        if (p0Var == null || d1Var == null || iVar == null) {
            Log.m105920e("MicroMsg.AppBrand.AppBrandSecureInputWidget", "getEncryptedData, this: " + p0Var + ", env: " + d1Var + ", inputParams: " + iVar);
            throw new IllegalStateException("env error");
        }
        String str3 = iVar.f226134H;
        if (str3 != null) {
            Long l = iVar.f226137K;
            if (l != null) {
                long longValue = l.longValue();
                Long l2 = iVar.f226138L;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    String str4 = iVar.f226136J;
                    List<String> list = iVar.f226139M;
                    C87412m.m108593f(list, "inputParams.safePasswordCompatList");
                    if (str4 != null || !list.isEmpty()) {
                        String a = C2056v1.m2007a();
                        if (a != null) {
                            if (C87412m.m108589b(str3, p0Var.f311526x)) {
                                str = p0Var.f311527y;
                                if (str == null) {
                                    Log.m105920e(p0Var.getMyTag$luggage_wxa_app_input_ext_release(), "readCertPem, cachedCertPem is null");
                                    throw new IllegalStateException("certPath is illegal");
                                }
                            } else {
                                try {
                                    str = C84949c1.f247602a.mo117811a(d1Var, str3);
                                    p0Var.f311527y = str;
                                    p0Var.f311526x = str3;
                                } catch (C68716d1 e) {
                                    throw new IllegalStateException(e.getMessage());
                                }
                            }
                            C87203t.m108270f(true);
                            if (p0Var.getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release().setCertContext(str, a, C87203t.m108270f(true))) {
                                if (list.isEmpty()) {
                                    MiniAppSecureEditText secureInputWidgetLogic$luggage_wxa_app_input_ext_release = p0Var.getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release();
                                    secureInputWidgetLogic$luggage_wxa_app_input_ext_release.setSalt(str4);
                                    secureInputWidgetLogic$luggage_wxa_app_input_ext_release.setTimeStamp(longValue);
                                    secureInputWidgetLogic$luggage_wxa_app_input_ext_release.setNonce(longValue2);
                                    str2 = secureInputWidgetLogic$luggage_wxa_app_input_ext_release.getEncryptedData();
                                } else {
                                    str2 = C68711c2.f197387a.mo94512b(p0Var.getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release(), list, longValue, longValue2);
                                }
                                String myTag$luggage_wxa_app_input_ext_release = p0Var.getMyTag$luggage_wxa_app_input_ext_release();
                                Log.m105918d(myTag$luggage_wxa_app_input_ext_release, "getEncryptedData, encryptedData: " + str2);
                                if (str2 != null) {
                                    return str2;
                                }
                                throw new IllegalStateException("sdk error:" + p0Var.getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release().getLastError());
                            }
                            Log.m105920e(p0Var.getMyTag$luggage_wxa_app_input_ext_release(), "getEncryptedData, setCertContext fail");
                            throw new IllegalStateException("sdk error:" + p0Var.getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release().getLastError());
                        }
                        Log.m105920e(p0Var.getMyTag$luggage_wxa_app_input_ext_release(), "getEncryptedData, rootPath is null");
                        throw new IllegalStateException("env error");
                    }
                    throw new IllegalStateException("need salt or customHash");
                }
                throw new IllegalStateException("need nonce");
            }
            throw new IllegalStateException("need timeStamp");
        }
        throw new IllegalStateException("need certPath");
    }
}
