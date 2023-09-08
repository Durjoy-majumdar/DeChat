package y42;

import com.tencent.p014mm.plugin.magicbrush.C85256f0;
import com.tencent.p014mm.plugin.magicbrush.api.IMBNetworkService;
import com.tencent.p014mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d42.C86184l;
import d42.C86185m;
import di3.C86312j;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;
import z04.C112550d0;

/* renamed from: y42.c */
public final class C91379c extends C86430i<C7597n> {

    /* renamed from: d */
    public final String f262074d = "MBJsApiOperateCDNDownloadTask";

    /* renamed from: e */
    public String mo16e() {
        return "operateCDNDownloadTask";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("downloadTaskId");
        if (Util.isNullOrNil(optString)) {
            Log.m105924i(this.f262074d, "downloadTaskId is null or nil");
            mo120840p().invoke(mo120842g(300005, "downloadTaskId is null or nil"));
            return;
        }
        String optString2 = hVar.optString("operationType");
        if (Util.isNullOrNil(optString2)) {
            Log.m105924i(this.f262074d, "operationType is null");
            mo120840p().invoke(mo120842g(300005, "operationType is null"));
            return;
        }
        String str = mo120841d().f26666a;
        C87412m.m108594g(str, "instanceName");
        String g0 = C112550d0.m153797g0(str, "-", str);
        if (C87412m.m108589b(optString2, "abort")) {
            C86184l xf = ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118378xf(g0, IMBNetworkService.Key.CDNDownload);
            if (xf == null) {
                Log.m105924i(this.f262074d, "get download task error");
                mo120840p().invoke(mo120842g(300004, "get download task error"));
                return;
            }
            C86185m a = xf.mo120589a(optString);
            if (a == null) {
                Log.m105925i(this.f262074d, "downloadWorker is null %s", optString);
                mo120840p().invoke(mo120842g(300004, "get download worker error"));
                return;
            }
            xf.mo120591c(a);
            HashMap hashMap = new HashMap();
            hashMap.put("downloadTaskId", optString);
            mo120840p().invoke(mo120846k(hashMap));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("downloadTaskId", optString);
            jSONObject.put("state", "fail");
            jSONObject.put("errno", 303305);
            jSONObject.put("errMsg", "fail:abort download");
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange = new MBJsEventOnCDNDownloadTaskStateChange();
            mBJsEventOnCDNDownloadTaskStateChange.f81582e = jSONObject2;
            C7597n nVar = (C7597n) this.f251227a;
            if (nVar != null) {
                nVar.mo8722f0(mBJsEventOnCDNDownloadTaskStateChange);
            }
            Log.m105919d(this.f262074d, "abortTask finish %s", optString);
            return;
        }
        Log.m105924i(this.f262074d, "unknown operationType");
        mo120840p().invoke(mo120842g(300005, "unknown operationType"));
    }
}
