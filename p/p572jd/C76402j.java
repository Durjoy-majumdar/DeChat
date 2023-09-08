package p572jd;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.widget.input.C2056v1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68716d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84949c1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import gy3.C87412m;
import java.util.List;
import p156gj.C87203t;
import rt0.C77568i;

/* renamed from: jd.j */
public final class C76402j {
    /* renamed from: a */
    public static final String m91824a(C108701a aVar, C82520h hVar, C77568i iVar) {
        String str;
        String str2;
        if (aVar == null || hVar == null || iVar == null) {
            Log.m105920e("MicroMsg.DelegateEditText", "getEncryptedData, this: " + aVar + ", env: " + hVar + ", inputParams: " + iVar);
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
                            if (C87412m.m108589b(str3, aVar.f325545y)) {
                                str = aVar.f325546z;
                                if (str == null) {
                                    Log.m105920e("MicroMsg.DelegateEditText", "readCertPem, cachedCertPem is null");
                                    throw new IllegalStateException("certPath is illegal");
                                }
                            } else {
                                try {
                                    str = C84949c1.f247602a.mo117811a(hVar, str3);
                                    aVar.f325546z = str;
                                    aVar.f325545y = str3;
                                } catch (C68716d1 e) {
                                    throw new IllegalStateException(e.getMessage());
                                }
                            }
                            C87203t.m108270f(true);
                            if (aVar.getSecureInputWidgetLogic$luggage_xweb_ext_release().setCertContext(str, a, C87203t.m108270f(true))) {
                                if (list.isEmpty()) {
                                    MiniAppSecureEditText secureInputWidgetLogic$luggage_xweb_ext_release = aVar.getSecureInputWidgetLogic$luggage_xweb_ext_release();
                                    secureInputWidgetLogic$luggage_xweb_ext_release.setSalt(str4);
                                    secureInputWidgetLogic$luggage_xweb_ext_release.setTimeStamp(longValue);
                                    secureInputWidgetLogic$luggage_xweb_ext_release.setNonce(longValue2);
                                    str2 = secureInputWidgetLogic$luggage_xweb_ext_release.getEncryptedData();
                                } else {
                                    str2 = C68711c2.f197387a.mo94512b(aVar.getSecureInputWidgetLogic$luggage_xweb_ext_release(), list, longValue, longValue2);
                                }
                                Log.m105918d("MicroMsg.DelegateEditText", "getEncryptedData, encryptedData: " + str2);
                                if (str2 != null) {
                                    return str2;
                                }
                                throw new IllegalStateException("sdk error:" + aVar.getSecureInputWidgetLogic$luggage_xweb_ext_release().getLastError());
                            }
                            Log.m105920e("MicroMsg.DelegateEditText", "getEncryptedData, setCertContext fail");
                            throw new IllegalStateException("sdk error:" + aVar.getSecureInputWidgetLogic$luggage_xweb_ext_release().getLastError());
                        }
                        Log.m105920e("MicroMsg.DelegateEditText", "getEncryptedData, rootPath is null");
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
