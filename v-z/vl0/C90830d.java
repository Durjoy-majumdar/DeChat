package vl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import sp0.C90302k;
import sp0.C90306l;
import up0.C90721c;
import vl0.C90825a;

/* renamed from: vl0.d */
public class C90830d extends C82268c {
    public static final int CTRL_INDEX = 273;
    public static final String NAME = "operateUploadTask";

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
        Log.m105918d("MicroMsg.JsApiOperateUploadTask", "JsApiOperateUploadTask");
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiOperateUploadTask", "data is null");
            return;
        }
        String optString = jSONObject.optString("uploadTaskId");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
            fVar.mo109647a(i, mo115109j("fail:uploadTaskId is null or nil"));
            return;
        }
        String optString2 = jSONObject.optString("operationType");
        if (Util.isNullOrNil(optString2)) {
            Log.m105920e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
            fVar.mo109647a(i, mo115109j("fail:operationType is null or nil"));
        } else if (optString2.equals("abort")) {
            AtomicInteger atomicInteger = C90306l.f259255b;
            C90302k a = C90306l.C90308b.f259257a.mo124542a(fVar.getAppId());
            if (a == null) {
                Log.m105924i("MicroMsg.JsApiOperateUploadTask", "upload is null");
                fVar.mo109647a(i, mo115109j("fail:no task"));
                return;
            }
            C90721c cVar = null;
            if (optString != null) {
                synchronized (a.f259250f) {
                    Iterator<C90721c> it = a.f259250f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C90721c next = it.next();
                        if (optString.equals(next.f260581w)) {
                            cVar = next;
                            break;
                        }
                    }
                }
            }
            if (cVar == null) {
                Log.m105925i("MicroMsg.JsApiOperateUploadTask", "uploadWorker is null %s", optString);
                fVar.mo109647a(i, mo115109j("fail:no task"));
                return;
            }
            a.f259251g.add(cVar.f260581w);
            a.mo124536b(cVar.f260581w);
            cVar.mo124841a();
            fVar.mo109647a(i, mo115109j("ok"));
            HashMap hashMap = new HashMap();
            hashMap.put("uploadTaskId", optString + "");
            hashMap.put("state", "fail");
            hashMap.put("errMsg", "abort");
            String jSONObject2 = new JSONObject(hashMap).toString();
            C90825a.C90827b bVar = new C90825a.C90827b();
            bVar.mo115161k(fVar);
            bVar.mo115163m(jSONObject2);
            bVar.mo115159i(oVar);
            Log.m105919d("MicroMsg.JsApiOperateUploadTask", "abortTask finish %s", optString);
        } else {
            fVar.mo109647a(i, mo115109j("fail:unknown operationType"));
        }
    }
}
