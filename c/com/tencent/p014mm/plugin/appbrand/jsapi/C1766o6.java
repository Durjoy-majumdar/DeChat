package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import cy3.C86157m;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.io.StringReader;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o6 */
public final class C1766o6 extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 65;
    public static final String NAME = "systemLog";

    /* renamed from: g */
    public static final ThreadLocal<String> f11506g = new ThreadLocal<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o6$a */
    public static final class C1767a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f11507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1767a(String str) {
            super(1);
            this.f11507d = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "line");
            Log.m105924i("AppBrandLog", this.f11507d + ' ' + str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "service");
        C87412m.m108594g(jSONObject, "data");
        String optString = jSONObject.optString(StateEvent.Name.MESSAGE);
        if (!(optString == null || optString.length() == 0)) {
            try {
                ThreadLocal<String> threadLocal = f11506g;
                String str = threadLocal.get();
                if (str == null) {
                    str = mo1752w(fVar);
                    threadLocal.set(str);
                }
                C86157m.m106665a(new StringReader(optString), new C1767a(str));
                fVar.mo109647a(i, mo115109j("ok"));
            } catch (OutOfMemoryError unused) {
                Log.m105920e("MicroMsg.JsApiSystemLog", "oom");
            }
        }
    }

    /* renamed from: w */
    public final String mo1752w(C82381f fVar) {
        String str;
        if (fVar instanceof C81925i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Service{appId:");
            C81925i2 i2Var = (C81925i2) fVar;
            sb.append(i2Var.getAppId());
            sb.append(",id:");
            sb.append(i2Var.hashCode());
            sb.append('}');
            str = sb.toString();
        } else if (fVar instanceof C83780d1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Page{appId:");
            C83780d1 d1Var = (C83780d1) fVar;
            sb4.append(d1Var.getAppId());
            sb4.append(",id:");
            sb4.append(d1Var.getComponentId());
            sb4.append('}');
            str = sb4.toString();
        } else {
            str = "";
        }
        return str + " print:";
    }
}
