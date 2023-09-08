package tl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import sp0.C90280d;
import sp0.C90283e;
import tl0.C90509a;
import tp0.C90567d;

/* renamed from: tl0.d */
public class C90514d extends C82268c {
    public static final int CTRL_INDEX = 270;
    public static final String NAME = "operateDownloadTask";

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        Log.m105918d("MicroMsg.JsApiOperateDownloadTask", "JsApiOperateDownloadTask");
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiOperateDownloadTask", "data is null");
            return;
        }
        String optString = jSONObject.optString("downloadTaskId");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
            fVar.mo109647a(i, mo115109j("fail:downloadTaskId is null or nil"));
            return;
        }
        String optString2 = jSONObject.optString("operationType");
        if (Util.isNullOrNil(optString2)) {
            Log.m105920e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
            fVar.mo109647a(i, mo115109j("fail:operationType is null or nil"));
        } else if (optString2.equals("abort")) {
            AtomicInteger atomicInteger = C90283e.f259174b;
            C90280d a = C90283e.C90285b.f259176a.mo124502a(fVar.getAppId());
            if (a == null) {
                fVar.mo109647a(i, mo115109j("fail:no task"));
                Log.m105928w("MicroMsg.JsApiOperateDownloadTask", "download is null");
                return;
            }
            C90567d dVar = null;
            if (optString != null) {
                synchronized (a.f259173i) {
                    Iterator<C90567d> it = a.f259173i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C90567d next = it.next();
                        if (optString.equals(next.f260220v)) {
                            dVar = next;
                            break;
                        }
                    }
                }
            }
            if (dVar == null) {
                fVar.mo109647a(i, mo115109j("fail:no task"));
                Log.m105929w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", optString);
                return;
            }
            a.f259170f.add(dVar.f260220v);
            a.mo124501a(dVar.f260220v);
            dVar.mo124699a();
            fVar.mo109647a(i, mo115109j("ok"));
            HashMap hashMap = new HashMap();
            hashMap.put("downloadTaskId", optString + "");
            hashMap.put("state", "fail");
            hashMap.put("errMsg", "abort");
            String jSONObject2 = new JSONObject(hashMap).toString();
            C90509a.C90511b bVar = new C90509a.C90511b();
            bVar.mo115161k(fVar);
            bVar.mo115163m(jSONObject2);
            bVar.mo115159i(oVar);
            Log.m105919d("MicroMsg.JsApiOperateDownloadTask", "abortTask finish %s", optString);
        } else {
            fVar.mo109647a(i, mo115109j("fail:unknown operationType"));
        }
    }
}
