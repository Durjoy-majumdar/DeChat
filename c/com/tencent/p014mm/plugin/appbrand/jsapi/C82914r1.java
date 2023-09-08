package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import lp3.C88631d;
import org.json.JSONArray;
import org.json.JSONObject;
import u24.C90599h;
import zp0.C16377l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r1 */
public final class C82914r1 extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 410;
    @Deprecated
    public static final String NAME = "batchGetContact";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r1$d */
    public static final class C1847d implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C32226l f11657a;

        public C1847d(C32226l lVar) {
            this.f11657a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo1772a(Object obj) {
            this.f11657a.invoke(obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r1$a */
    public static final class C82915a {
        public C82915a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r1$b */
    public static final class C82916b extends C82919r2 {
        public static final int CTRL_INDEX = -2;
        public static final String NAME = "onContactUpdate";

        /* renamed from: i */
        public static final C82917a f242400i = new C82917a((C8480h) null);

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r1$b$a */
        public static final class C82917a {
            public C82917a(C8480h hVar) {
            }

            /* renamed from: a */
            public final void mo115156a(C81879g gVar, List<WxaAttributes> list, String str) {
                boolean z = true;
                if (gVar != null && gVar.isRunning()) {
                    if (!(str == null || str.length() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        C82916b bVar = new C82916b();
                        if (list != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (WxaAttributes wxaAttributes : list) {
                                JSONObject optJSONObject = new JSONObject(wxaAttributes.field_appInfo).optJSONObject("PluginInfo");
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                jSONArray.put(optJSONObject.put("appId", wxaAttributes.field_appId));
                            }
                            bVar.mo115164n("contactList", jSONArray);
                        }
                        bVar.mo115164n("callbackId", str);
                        bVar.mo115161k(gVar);
                        bVar.mo115158h();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r1$c */
    public static final class C82918c {

        /* renamed from: a */
        public final String f242401a;

        /* renamed from: b */
        public final int f242402b;

        /* renamed from: c */
        public final List<String> f242403c;

        /* renamed from: d */
        public final C16377l f242404d;

        /* renamed from: e */
        public final long f242405e = TimeUnit.MINUTES.toSeconds(5);

        public C82918c(String str, int i, List<String> list, C16377l lVar) {
            C87412m.m108594g(str, "hostWxaAppId");
            C87412m.m108594g(list, "appIds");
            C87412m.m108594g(lVar, "cgiService");
            this.f242401a = str;
            this.f242402b = i;
            this.f242403c = list;
            this.f242404d = lVar;
        }
    }

    static {
        new C82915a((C8480h) null);
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            if (jSONObject == null) {
                gVar.mo109647a(i, mo115109j("fail:invalid data"));
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("appIds");
            if (optJSONArray != null) {
                LinkedList linkedList = new LinkedList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = optJSONArray.optString(i2);
                    if (!(optString == null || optString.length() == 0)) {
                        linkedList.add(optString);
                    }
                }
                if (linkedList.isEmpty()) {
                    linkedList = null;
                }
                if (linkedList != null) {
                    String uuid = UUID.randomUUID().toString();
                    C87412m.m108593f(uuid, "randomUUID().toString()");
                    C16377l lVar = (C16377l) gVar.mo109668l(C16377l.class);
                    if (lVar == null) {
                        gVar.mo109647a(i, mo115109j("fail:internal error"));
                        return;
                    }
                    WeakReference weakReference = new WeakReference(gVar);
                    C83131y1 y1Var = new C83131y1(weakReference, i, this, uuid);
                    Log.m105924i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + i + ").load(), hostWxaAppId[" + gVar.getAppId() + "], eventCallbackId[" + uuid + "] appIds[" + C90599h.m113513f(linkedList.iterator(), ",") + ']');
                    String appId = gVar.getAppId();
                    C87412m.m108593f(appId, "env.appId");
                    ((C119157j) C119157j.f356862d).mo183875f(new C82928s1(new C82918c(appId, i, linkedList, lVar), new C1906x1(i, weakReference, this), new C29543u1(i, y1Var), new C29545w1(i, weakReference, uuid), new C29544v1(i, y1Var, weakReference, uuid)));
                    return;
                }
            }
            gVar.mo109647a(i, mo115109j("fail:appIds is empty"));
        }
    }
}
