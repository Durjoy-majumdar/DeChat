package com.tencent.p014mm.plugin.appbrand.app;

import android.text.TextUtils;
import android.util.SparseArray;
import c30.C104289g;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81263i2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81285k2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83105a;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86296l;
import di3.C86301e;
import di3.C86312j;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import java.util.List;
import kr0.C10403n0;
import kr0.C88273g1;
import lp3.C88633e;
import nr3.C89060f;
import org.json.JSONObject;
import p210o.C11323a;
import rr0.C90093d;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.d1 */
public class C81152d1 extends C86301e implements C10403n0 {
    public static boolean vx0(String str, C104289g gVar) {
        try {
            C104289g gVar2 = new C104289g(gVar.optString("invokeData"));
            String optString = gVar2.optString("name");
            C104289g gVar3 = new C104289g(gVar2.optString("args"));
            if (!"standaloneFunctionalDirectApi".equals(optString)) {
                return false;
            }
            C90093d.m112716a(str, C90093d.C90094a.valueOf(gVar3.optString("standaloneDirectApiType")), gVar3);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: TP */
    public C88633e<Integer> mo10715TP(String str) {
        return C89060f.m111322a().mo123062e(new d1$$b(this, str));
    }

    /* renamed from: WC */
    public int mo10716WC() {
        if (!C86709a0.m107523b().f251765p || !C86312j.m106916h(C86296l.class)) {
            Log.m105921e("MicroMsg.AppBrand.ServiceForWebView", "getWxaCommLibVersion, invalid account status, stack:%s", android.util.Log.getStackTraceString(new Throwable()));
            return -1;
        }
        ICommLibReader a = C81274j2.m99632a();
        if (a == null) {
            try {
                C81263i2.m99624b();
                a = C81274j2.m99632a();
            } catch (C86484b unused) {
                return -1;
            }
        }
        if (a == null) {
            return -1;
        }
        return a.mo113371a();
    }

    public void a30(List<String> list) {
        C81662k.m100184c(list, C81652f.C81653a.MP_PRELOAD, (C81662k.C81674j) null).mo114038a(new d1$$c(this));
    }

    /* renamed from: hK */
    public void mo10718hK(String str) {
        AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WASERVICE, C88273g1.H5_JSAPI_PRELOAD);
    }

    /* renamed from: kK */
    public void mo10719kK(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage invalid uuid");
        } else {
            C89060f.m111322a().mo123064p(new d1$$d(this, str, str2)).mo123058O();
        }
    }

    public void li0(String str, String str2, int i) {
        SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = new SendDataToMiniProgramFromH5Event();
        sendDataToMiniProgramFromH5Event.f241627d = str;
        sendDataToMiniProgramFromH5Event.f241628e = str2;
        sendDataToMiniProgramFromH5Event.f241629f = i;
        C81964j.m100679b(str, sendDataToMiniProgramFromH5Event);
    }

    /* renamed from: rJ */
    public void mo10721rJ(int i, String str, Object obj) {
        C40478h hVar;
        SparseArray<C40478h> sparseArray = C83105a.f242910a;
        SparseArray<C40478h> sparseArray2 = C83105a.f242910a;
        synchronized (sparseArray2) {
            hVar = sparseArray2.get(i);
        }
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("htmlId", hVar.getCoverViewId());
            jSONObject.put("name", str);
            jSONObject.put("arg", obj);
            hVar.mo63248m0(jSONObject);
        }
    }

    /* renamed from: vN */
    public void mo10722vN(String str, C11323a<String, Boolean> aVar) {
        if (!TextUtils.isEmpty(str)) {
            C81285k2.m99657a(true, new d1$$a(str, aVar));
        } else if (aVar != null) {
            aVar.apply("fail invalid appId");
        }
    }
}
