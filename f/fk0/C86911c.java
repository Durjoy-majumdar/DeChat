package fk0;

import bi0.C79706a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wexnet.SessionKeeper;
import com.tencent.p014mm.wexnet.WeXNet;
import gy3.C87412m;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p224ra.C12964b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: fk0.c */
public final class C86911c extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1093;
    public static final String NAME = "releaseInferenceSession";

    /* renamed from: fk0.c$a */
    public static final class C86912a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f252246d;

        /* renamed from: e */
        public final /* synthetic */ int f252247e;

        /* renamed from: f */
        public final /* synthetic */ int f252248f;

        /* renamed from: g */
        public final /* synthetic */ C86911c f252249g;

        public C86912a(C82381f fVar, int i, int i2, C86911c cVar) {
            this.f252246d = fVar;
            this.f252247e = i;
            this.f252248f = i2;
            this.f252249g = cVar;
        }

        public final void run() {
            boolean z;
            C12964b l = this.f252246d.mo109668l(C79706a.class);
            C87412m.m108591d(l);
            C79706a aVar = (C79706a) l;
            int i = this.f252247e;
            synchronized (aVar) {
                if (aVar.f233618e.containsKey(Integer.valueOf(i))) {
                    try {
                        WeXNet.C86022a aVar2 = WeXNet.Companion;
                        Object obj = ((LinkedHashMap) aVar.f233618e).get(Integer.valueOf(i));
                        C87412m.m108591d(obj);
                        long sessionPtr = ((SessionKeeper) obj).getSessionPtr();
                        aVar2.mo120038a();
                        if (WeXNet.releaseSession(sessionPtr).getSuccess()) {
                            aVar.f233618e.remove(Integer.valueOf(i));
                            z = true;
                        }
                    } catch (WeXNet.C86022a.C86023a unused) {
                    }
                }
                z = false;
            }
            if (z) {
                C82381f fVar = this.f252246d;
                int i2 = this.f252248f;
                C86911c cVar = this.f252249g;
                cVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i2, cVar.mo115115p("ok", jSONObject));
                return;
            }
            C82381f fVar2 = this.f252246d;
            int i3 = this.f252248f;
            C86911c cVar2 = this.f252249g;
            cVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2004011, "fail:session id not exist");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 2004011);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            fVar2.mo109647a(i3, cVar2.mo115115p("fail:session id not exist", jSONObject2));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            int i2 = -1;
            if (jSONObject != null) {
                i2 = jSONObject.optInt("sessionId", -1);
            }
            String appId = fVar.getAppId();
            C87412m.m108593f(appId, "env.appId");
            C86912a aVar = new C86912a(fVar, i2, i, this);
            C119179t tVar = C119157j.f356862d;
            ((C119157j) tVar).mo183871b(aVar, "SessionRunnerGuard+" + appId + '+' + i2);
        }
    }
}
