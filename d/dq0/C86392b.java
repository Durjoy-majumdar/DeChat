package dq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C48016e;
import sp0.C90272a;

/* renamed from: dq0.b */
public class C86392b {

    /* renamed from: a */
    public static C86394b f251180a;

    /* renamed from: b */
    public static C86393a f251181b;

    /* renamed from: dq0.b$a */
    public interface C86393a {
    }

    /* renamed from: dq0.b$b */
    public interface C86394b {
        /* renamed from: a */
        void mo109891a(AppBrandRuntime appBrandRuntime, JSONObject jSONObject);
    }

    /* renamed from: a */
    public static JSONObject m107057a(AppBrandRuntime appBrandRuntime) {
        AppBrandRuntime appBrandRuntime2 = appBrandRuntime;
        JSONObject jSONObject = new JSONObject();
        char c = 0;
        try {
            jSONObject.put("appId", appBrandRuntime2.f238147j);
            jSONObject.put("appversion", appBrandRuntime.mo113051d0() == null ? 0 : appBrandRuntime.mo113051d0().f261072r.pkgVersion);
            jSONObject.put("appstate", appBrandRuntime.mo113051d0() == null ? 0 : appBrandRuntime.mo113051d0().f261072r.f238585d + 1);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.PrepareDataForNodeHelper", "prepareCommonData e:%s", e);
        }
        C90272a aVar = (C90272a) appBrandRuntime2.mo113018M(C90272a.class);
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("maxWebsocketConcurrent", aVar.f259134n);
                jSONObject2.put("socketDomains", C48016e.m53376b(aVar.f259138r));
                jSONObject2.put("websocketSkipPortCheck", aVar.f259119A);
                jSONObject2.put("websocketTimeoutMS", aVar.f259130g);
                jSONObject2.put("headerFilterMode", aVar.f259123E);
                jSONObject2.put("blacklistHeaders", C48016e.m53376b(aVar.f259143w));
                jSONObject2.put("whitelistHeaders", C48016e.m53376b(aVar.f259144x));
                jSONObject2.put("referer", aVar.f259122D);
                jSONObject2.put("canSkipCheckDomainsByArg", aVar.f259127d);
                jSONObject2.put("shouldCheckDomains", aVar.f259128e);
                jSONObject2.put("userAgentString", aVar.f259120B);
                jSONObject.put("networkConfig", jSONObject2);
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.PrepareDataForNodeHelper", "prepareNetworkConfigData e:%s", e2);
            }
        }
        C84782s1.C84783a aVar2 = (C84782s1.C84783a) appBrandRuntime2.mo113018M(C84782s1.C84783a.class);
        if (aVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("nativeBufferSizeLimitByte", aVar2.f247210h);
                jSONObject3.put("itemBase64", aVar2.f247209g);
                jSONObject3.put("itemID", aVar2.f247208f);
                jSONObject3.put("itemKey", aVar2.f247207e);
                jSONObject3.put("outKey", aVar2.f247206d);
                jSONObject.put("nativeBufferConfig", jSONObject3);
            } catch (JSONException e3) {
                Log.m105921e("MicroMsg.PrepareDataForNodeHelper", "prepareNativeBufferConfigData e:%s", e3);
            }
        }
        if (appBrandRuntime.mo113034V() instanceof C81428p0) {
            JSONObject jSONObject4 = new JSONObject();
            LinkedList<C81415h0> linkedList = ((C81428p0) appBrandRuntime.mo113034V()).f238970d;
            int i = 0;
            while (i < linkedList.size()) {
                C81415h0 h0Var = linkedList.get(i);
                if (h0Var instanceof C81439t0) {
                    C81439t0 t0Var = (C81439t0) h0Var;
                    String str = t0Var.f238992d;
                    String str2 = t0Var.f238993e;
                    long j = t0Var.f238994f;
                    Object[] objArr = new Object[3];
                    objArr[c] = str;
                    objArr[1] = str2;
                    objArr[2] = Long.valueOf(j);
                    Log.m105925i("MicroMsg.PrepareDataForNodeHelper", "prepareFSData rootPath:%s pathPrefix:%s quota:%d", objArr);
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 1);
                        jSONObject5.put("rootPath", str);
                        jSONObject5.put("quota", j);
                        jSONObject4.put(str2, jSONObject5);
                    } catch (JSONException e4) {
                        Log.m105921e("MicroMsg.PrepareDataForNodeHelper", "prepareFSData e:%s", e4);
                    }
                }
                i++;
                c = 0;
            }
            for (C81415h0 next : linkedList) {
                if (next instanceof C81413f0) {
                    C81413f0 f0Var = (C81413f0) next;
                    String str3 = f0Var.f238947e;
                    String str4 = f0Var.f238948f;
                    try {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 0);
                        jSONObject6.put("rootPath", str3);
                        jSONObject4.put(str4, jSONObject6);
                    } catch (JSONException e5) {
                        Log.m105921e("MicroMsg.PrepareDataForNodeHelper", "prepareFSData e:%s", e5);
                    }
                }
            }
            try {
                jSONObject.put("fsData", jSONObject4);
            } catch (JSONException e6) {
                Log.m105921e("MicroMsg.PrepareDataForNodeHelper", "prepareFSData e:%s", e6);
            }
            C86394b bVar = f251180a;
            if (bVar != null) {
                bVar.mo109891a(appBrandRuntime2, jSONObject);
            }
            Log.m105927v("MicroMsg.PrepareDataForNodeHelper", "prepareDataForNode :%s", jSONObject.toString());
            return jSONObject;
        }
        throw new IllegalStateException("getFileSystem not LuggageFileSystemRegistry");
    }
}
