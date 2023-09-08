package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiWriteCommData;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p170ic.C87689c;
import rx3.C13598b0;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.e2 */
public final class C6423e2 extends C15053a {

    /* renamed from: d */
    public static final C6423e2 f23427d = new C6423e2();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.e2$a */
    public static final class C6424a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C6424a f23428d = new C6424a();

        public C6424a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            C104289g gVar = new C104289g(str);
            C5139t.m5183e(gVar.getInt("businesstype"), gVar.getInt("datatype"));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiRecordOperateUserData", "msg:" + h1Var);
        try {
            Object obj = h1Var.f38983a.get("datalist");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                C87689c.m109089b(new C26827e(str), C6424a.f23428d);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiRecordOperateUserData", e, (String) null, new Object[0]);
        }
        jVar.f39001d.mo10774a(h1Var.f38990c, "recordOperateUserData:ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return JsApiWriteCommData.CTRL_INDEX;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "recordOperateUserData";
    }
}
