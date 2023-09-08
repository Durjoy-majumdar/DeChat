package sl0;

import android.util.Pair;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82553j7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82558k7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82564l7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.WcWss;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.plugin.appbrand.utils.C84787t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import hr0.C87583a;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import li0.C88509c;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import sp0.C90272a;
import sp0.C90309m;
import sp0.C90311n;
import sp0.C90318o;
import ys0.C91578a;
import ys0.C91582e;
import ys0.C91584g;

/* renamed from: sl0.f */
public class C90220f extends C90217b {
    public static final int CTRL_INDEX = 346;
    public static final String NAME = "createSocketTask";

    /* renamed from: p */
    public static C90311n.C90315d f259024p;

    /* renamed from: h */
    public C90311n.C90317f f259025h;

    /* renamed from: i */
    public int f259026i = 0;

    /* renamed from: j */
    public boolean f259027j = false;

    /* renamed from: n */
    public boolean f259028n = false;

    /* renamed from: o */
    public final AtomicBoolean f259029o = new AtomicBoolean(false);

    /* renamed from: sl0.f$a */
    public class C90221a implements C83101e.C83102a {

        /* renamed from: a */
        public boolean f259030a = false;

        /* renamed from: b */
        public final /* synthetic */ C82381f f259031b;

        /* renamed from: c */
        public final /* synthetic */ String f259032c;

        /* renamed from: d */
        public final /* synthetic */ boolean f259033d;

        public C90221a(C82381f fVar, String str, boolean z) {
            this.f259031b = fVar;
            this.f259032c = str;
            this.f259033d = z;
        }

        /* renamed from: a */
        public void mo124454a(int i, String str) {
            AppBrandRuntime runtime;
            C90311n.C90315d dVar = C90220f.f259024p;
            if (dVar != null) {
                C82381f fVar = this.f259031b;
                String str2 = this.f259032c;
                ((C82558k7) dVar).getClass();
                C88509c.C88512b bVar = (C88509c.C88512b) ((HashMap) C82564l7.f241668a).get(str2);
                if (!(bVar == null || (runtime = ((C82554k) fVar).getRuntime()) == null)) {
                    runtime.f238113K.mo122982e(bVar);
                }
            }
            HashMap hashMap = new HashMap();
            int ordinal = this.f259031b.getAppState().ordinal();
            if (ordinal == 2 || ordinal == 3) {
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_REASON, "interrupted");
            } else if (!Util.isNullOrNil(str)) {
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_REASON, str);
            }
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("socketTaskId", this.f259032c);
            hashMap.put("state", "close");
            String jSONObject = new JSONObject(hashMap).toString();
            C90222b bVar2 = new C90222b();
            bVar2.mo115161k(this.f259031b);
            bVar2.mo115163m(jSONObject);
            bVar2.mo115159i(C90220f.this.f259018g.mo122426a(this.f259032c));
            C90220f.this.f259018g.mo122427b(this.f259032c);
        }

        /* renamed from: b */
        public void mo124455b(String str) {
            C90220f.this.mo124453x(this.f259031b, this.f259032c, str);
        }

        /* renamed from: c */
        public void mo124456c(String str) {
            Class cls = C87583a.class;
            if (this.f259030a) {
                Log.m105924i("MicroMsg.JsApiCreateSocketTask", "onSocketError is true");
                return;
            }
            this.f259030a = true;
            HashMap hashMap = new HashMap();
            hashMap.put("socketTaskId", this.f259032c);
            hashMap.put("state", "error");
            hashMap.put("errMsg", str);
            String jSONObject = new JSONObject(hashMap).toString();
            C90222b bVar = new C90222b();
            bVar.mo115161k(this.f259031b);
            bVar.mo115163m(jSONObject);
            bVar.mo115159i(C90220f.this.f259018g.mo122426a(this.f259032c));
            C90220f.this.f259018g.mo122427b(this.f259032c);
            C90220f fVar = C90220f.this;
            if (fVar.f259027j || fVar.f259028n) {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 2, 1, false);
            } else {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 1, 1, false);
            }
        }

        /* renamed from: d */
        public void mo124457d(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("data", C84787t1.m104466a(str));
            hashMap.put("isBuffer", Boolean.FALSE);
            hashMap.put("socketTaskId", this.f259032c);
            hashMap.put("state", StateEvent.Name.MESSAGE);
            String jSONObject = new JSONObject(hashMap).toString();
            C90222b bVar = new C90222b();
            bVar.mo115161k(this.f259031b);
            bVar.mo115163m(jSONObject);
            bVar.mo115159i(C90220f.this.f259018g.mo122426a(this.f259032c));
        }

        /* renamed from: e */
        public void mo124458e(ByteBuffer byteBuffer) {
            HashMap hashMap = new HashMap();
            hashMap.put("socketTaskId", this.f259032c);
            hashMap.put("data", byteBuffer);
            hashMap.put("isBuffer", Boolean.TRUE);
            hashMap.put("state", StateEvent.Name.MESSAGE);
            C84782s1.C84784b d = C84782s1.m104463d(this.f259031b.getJsRuntime(), hashMap, (C84782s1.C84783a) this.f259031b.mo109671p(C84782s1.C84783a.class));
            if (d == C84782s1.C84784b.OK) {
                String jSONObject = new JSONObject(hashMap).toString();
                C90222b bVar = new C90222b();
                bVar.mo115161k(this.f259031b);
                bVar.mo115163m(jSONObject);
                bVar.mo115159i(C90220f.this.f259018g.mo122426a(this.f259032c));
            } else if (d == C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT) {
                C84782s1.m104461b(this.f259031b, C90222b.NAME);
            }
        }

        /* renamed from: f */
        public void mo124459f(C91584g gVar, Map<String, String> map) {
            C90311n.C90315d dVar = C90220f.f259024p;
            if (dVar != null) {
                C82381f fVar = this.f259031b;
                String str = this.f259032c;
                C90220f fVar2 = C90220f.this;
                C82558k7 k7Var = (C82558k7) dVar;
                k7Var.getClass();
                C82553j7 j7Var = new C82553j7(k7Var, fVar, str, fVar2);
                ((HashMap) C82564l7.f241668a).put(str, j7Var);
                ((C82554k) fVar).getRuntime().f238113K.mo122978a(j7Var);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("socketTaskId", this.f259032c);
            hashMap.put("state", WeChatBrands.Business.GROUP_OPEN);
            hashMap.put("header", C90220f.m112946w(C90220f.this, gVar));
            if (map != null && map.size() > 0 && this.f259033d) {
                hashMap.put(Scopes.PROFILE, map);
            }
            String jSONObject = new JSONObject(hashMap).toString();
            C90222b bVar = new C90222b();
            bVar.mo115161k(this.f259031b);
            bVar.mo115163m(jSONObject);
            bVar.mo115159i(C90220f.this.f259018g.mo122426a(this.f259032c));
        }

        /* renamed from: g */
        public void mo124460g(C91578a aVar) {
            if (aVar != null && ((C90272a) this.f259031b.mo109671p(C90272a.class)).f259124F) {
                AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new AppBrandNetWorkReqHeaderReceivedEvent();
                AppBrandNetWorkReqHeaderReceivedEvent.C80702a aVar2 = appBrandNetWorkReqHeaderReceivedEvent.f236133d;
                aVar2.f236134a = "socket";
                aVar2.f236136c = C90220f.m112946w(C90220f.this, aVar);
                appBrandNetWorkReqHeaderReceivedEvent.f236133d.f236135b = this.f259032c;
                appBrandNetWorkReqHeaderReceivedEvent.publish();
            }
        }
    }

    /* renamed from: sl0.f$b */
    public static class C90222b extends C82919r2 {
        public static final int CTRL_INDEX = 348;
        public static final String NAME = "onSocketTaskStateChange";
    }

    public C90220f(int i, C90311n.C90317f fVar) {
        Log.m105925i("MicroMsg.JsApiCreateSocketTask", "JsApiCreateSocketTask, programType:%d", Integer.valueOf(i));
        this.f259026i = i;
        this.f259025h = fVar;
    }

    /* renamed from: w */
    public static JSONObject m112946w(C90220f fVar, C91582e eVar) {
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> a = eVar.mo125460a();
        while (a.hasNext()) {
            try {
                String next = a.next();
                jSONObject.put(next, eVar.mo125461c(next));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiCreateSocketTask", e, "JSONExceptions ", new Object[0]);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public String mo122435a() {
        return "socketTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        Class cls = C87583a.class;
        Class cls2 = C90272a.class;
        if (!this.f259029o.getAndSet(true)) {
            C90311n.C90317f fVar3 = this.f259025h;
            if (fVar3 != null) {
                this.f259027j = fVar3.mo116758x(fVar.getAppId());
                this.f259028n = this.f259025h.mo116757a(fVar.getAppId());
            }
            HashMap<Pair<String, Integer>, WcWss.C83093a> hashMap = WcWss.f242875a;
            Log.m105924i("MicroMsg.WcWss", "initWcWss");
            WcWss.init();
        }
        AtomicInteger atomicInteger = C90318o.f259278b;
        C83101e a = C90318o.C90320b.f259280a.mo124551a(fVar.getAppId());
        if (a == null) {
            int i = this.f259026i;
            if (((i != 0 || !this.f259027j) && (i != 1 || !this.f259028n)) || (this.f259018g.mo122426a(str2) != null && !(this.f259018g.mo122426a(str2) instanceof C83165i))) {
                Log.m105918d("MicroMsg.JsApiCreateSocketTask", "hy: trigger use legacy ws");
                a = new C90311n((C90272a) fVar2.mo109671p(cls2));
            } else {
                a = new C83094a((C90272a) fVar2.mo109671p(cls2));
            }
            C90318o oVar = C90318o.C90320b.f259280a;
            String appId = fVar.getAppId();
            if (!oVar.f259279a.containsKey(appId)) {
                oVar.f259279a.put(appId, a);
            }
        }
        boolean optBoolean = jSONObject2.optBoolean("enableProfile", true);
        C90221a aVar = new C90221a(fVar2, str2, optBoolean);
        String optString = jSONObject2.optString("url");
        if (Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.JsApiCreateSocketTask", "url is null");
            mo124453x(fVar2, str2, "url is null");
            return;
        }
        Log.m105925i("MicroMsg.JsApiCreateSocketTask", "useProfile:%b,url is:%s", Boolean.valueOf(optBoolean), optString);
        C90272a aVar2 = (C90272a) fVar2.mo109671p(cls2);
        Map<String, String> g = C90309m.m113072g(jSONObject2, aVar2);
        if (!(jSONObject2.optBoolean("__skipDomainCheck__") ? false : aVar2.f259128e) || C90309m.m113088w(aVar2.f259138r, optString, aVar2.f259119A)) {
            int optInt = jSONObject2.optInt("timeout", 0);
            if (optInt <= 0) {
                optInt = C90309m.m113079n(aVar2, 1);
            }
            if (optInt <= 0) {
                optInt = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            }
            a.mo115342d(fVar.getAppId(), str, this.f259026i, optInt, jSONObject, g, aVar);
            if (this.f259027j || this.f259028n) {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 10, 1, false);
            } else {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 0, 1, false);
            }
            Log.m105925i("MicroMsg.JsApiCreateSocketTask", "connectSocket, url is : %s , componentId: %s", optString, Integer.valueOf(fVar.getComponentId()));
            return;
        }
        Log.m105925i("MicroMsg.JsApiCreateSocketTask", "not in domain url %s", optString);
        mo124453x(fVar2, str2, "url not in domain list");
    }

    public String getTaskId() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger atomicInteger = C90318o.f259278b;
        C90318o.C90320b.f259280a.getClass();
        sb.append(C90318o.f259278b.incrementAndGet());
        sb.append("");
        return sb.toString();
    }

    /* renamed from: x */
    public final void mo124453x(C82381f fVar, String str, String str2) {
        String str3;
        if (Util.isNullOrNil(str2)) {
            str3 = "fail";
        } else {
            str3 = "fail:" + str2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("socketTaskId", str);
        hashMap.put("state", "error");
        hashMap.put("errMsg", str3);
        String jSONObject = new JSONObject(hashMap).toString();
        C90222b bVar = new C90222b();
        bVar.mo115161k(fVar);
        bVar.mo115163m(jSONObject);
        bVar.mo115159i(this.f259018g.mo122426a(str));
        Log.m105919d("MicroMsg.JsApiCreateSocketTask", "onSocketConnectFail jsonResult:%s ", jSONObject);
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(972, 3, 1, false);
    }
}
