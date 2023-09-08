package ul0;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jk0.C87975a;
import jk0.C87986j;
import org.json.JSONObject;
import p224ra.C89909e;
import sp0.C90272a;
import sp0.C90291h;
import sp0.C90299j;
import sp0.C90309m;
import sp0.C90326y;

/* renamed from: ul0.a */
public class C90691a implements C87986j {

    /* renamed from: d */
    public int f260513d = 0;

    /* renamed from: e */
    public C90291h.C90295d f260514e;

    /* renamed from: f */
    public boolean f260515f = false;

    /* renamed from: g */
    public boolean f260516g = false;

    /* renamed from: h */
    public C87975a f260517h;

    /* renamed from: i */
    public final AtomicBoolean f260518i = new AtomicBoolean(false);

    /* renamed from: ul0.a$a */
    public class C90692a implements C90291h.C90294c {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f260519a;

        /* renamed from: b */
        public final /* synthetic */ long f260520b;

        /* renamed from: c */
        public final /* synthetic */ String f260521c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f260522d;

        public C90692a(WeakReference weakReference, long j, String str, C82381f fVar) {
            this.f260519a = weakReference;
            this.f260520b = j;
            this.f260521c = str;
            this.f260522d = fVar;
        }

        /* renamed from: a */
        public void mo124829a(JSONObject jSONObject, int i) {
            C82381f fVar;
            if (jSONObject != null && (fVar = (C82381f) this.f260519a.get()) != null) {
                if (!jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("requestTaskId", this.f260521c);
                    hashMap.put("state", "headersReceived");
                    hashMap.put("header", jSONObject);
                    hashMap.put("statusCode", Integer.valueOf(i));
                    C90693b bVar = new C90693b();
                    String jSONObject2 = new JSONObject(hashMap).toString();
                    bVar.mo115161k(fVar);
                    bVar.mo115163m(jSONObject2);
                    bVar.mo115159i(C90691a.this.f260517h.mo122426a(this.f260521c));
                } else if (((C90272a) fVar.mo109671p(C90272a.class)).f259124F) {
                    jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                    AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new AppBrandNetWorkReqHeaderReceivedEvent();
                    AppBrandNetWorkReqHeaderReceivedEvent.C80702a aVar = appBrandNetWorkReqHeaderReceivedEvent.f236133d;
                    aVar.f236134a = "request";
                    aVar.f236136c = jSONObject;
                    aVar.f236135b = this.f260521c;
                    appBrandNetWorkReqHeaderReceivedEvent.publish();
                }
            }
        }

        /* renamed from: b */
        public void mo124830b(String str, String str2, int i, Map map) {
            C82381f fVar = (C82381f) this.f260519a.get();
            Object[] objArr = new Object[4];
            objArr[0] = Long.valueOf(System.currentTimeMillis() - this.f260520b);
            objArr[1] = Integer.valueOf(str2 == null ? 0 : str2.length());
            objArr[2] = this.f260521c;
            objArr[3] = fVar;
            Log.m105925i("MicroMsg.BaseCreateRequestTask", "onRequestResult, time: %d, data size: %d,requestTaskId %s, service:%s", objArr);
            if (fVar != null) {
                if ("fail".equals(str)) {
                    Log.m105921e("MicroMsg.BaseCreateRequestTask", "onRequestResult taskId[%s] reason[%s] data[%s] errno[%d]", this.f260521c, str, str2, Integer.valueOf(i));
                }
                AtomicInteger atomicInteger = C90299j.f259242b;
                C90291h a = C90299j.C90301b.f259244a.mo124533a(fVar.getAppId());
                if (a != null) {
                    if (((ConcurrentSkipListSet) a.f259189b).contains(this.f260521c)) {
                        Log.m105921e("MicroMsg.BaseCreateRequestTask", "request abort %s", this.f260521c);
                        return;
                    }
                }
                C90691a.this.mo124828b(fVar, this.f260521c, str2, i, map);
                ((C90326y) C89909e.m112439d(C90326y.class, true)).mo121694b(fVar.getAppId());
            }
        }

        /* renamed from: c */
        public void mo124831c(String str, String str2, int i, long j, long j2) {
            HashMap hashMap = new HashMap();
            hashMap.put("requestTaskId", this.f260521c);
            hashMap.put("state", "progressUpdate");
            hashMap.put("progress", Integer.valueOf(i));
            hashMap.put("totalBytesWritten", Long.valueOf(j));
            hashMap.put("totalBytesExpectedToWrite", Long.valueOf(j2));
            C90693b bVar = new C90693b();
            String jSONObject = new JSONObject(hashMap).toString();
            bVar.mo115161k(this.f260522d);
            bVar.mo115163m(jSONObject);
            bVar.mo115159i(C90691a.this.f260517h.mo122426a(this.f260521c));
        }
    }

    /* renamed from: ul0.a$b */
    public static class C90693b extends C82919r2 {
        public static final int CTRL_INDEX = 244;
        public static final String NAME = "onRequestTaskStateChange";
    }

    public C90691a(int i, C90291h.C90295d dVar, C87975a aVar) {
        Log.m105925i("MicroMsg.BaseCreateRequestTask", "BaseCreateRequestTask<init>, programType:%d", Integer.valueOf(i));
        this.f260513d = i;
        this.f260514e = dVar;
        this.f260517h = aVar;
    }

    /* renamed from: a */
    public String mo122435a() {
        return "requestTaskId";
    }

    /* renamed from: b */
    public final void mo124828b(C82381f fVar, String str, String str2, int i, Map map) {
        Log.m105929w("MicroMsg.BaseCreateRequestTask", "sendFailMsg, requestTaskId = %s, errMsg = %s, errno = %d", str, str2, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("requestTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", Integer.valueOf(i));
        hashMap.put("errMsg", str2);
        if (map != null && map.size() > 0) {
            hashMap.put("clientInfo", map);
        }
        String jSONObject = new JSONObject(hashMap).toString();
        C90693b bVar = new C90693b();
        bVar.mo115161k(fVar);
        bVar.mo115163m(jSONObject);
        bVar.mo115159i(this.f260517h.mo122426a(str));
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        C90291h hVar;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        Class cls = C90272a.class;
        Log.m105918d("MicroMsg.BaseCreateRequestTask", "JsApiCreateRequestTask");
        if (!this.f260518i.getAndSet(true)) {
            C90291h.C90295d dVar = this.f260514e;
            if (dVar != null) {
                this.f260515f = dVar.mo116760x(fVar.getAppId());
                this.f260516g = this.f260514e.mo116759a(fVar.getAppId());
            }
            if (this.f260515f || this.f260516g) {
                C90272a aVar = (C90272a) fVar2.mo109671p(cls);
                if (aVar == null) {
                    Log.m105921e("MicroMsg.BaseCreateRequestTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", fVar.getAppId());
                    CronetLogic.setUserCertVerify(false);
                } else {
                    Log.m105925i("MicroMsg.BaseCreateRequestTask", "setupRequestMode(%b),appId(%s)", Boolean.valueOf(aVar.f259126H), fVar.getAppId());
                    CronetLogic.setUserCertVerify(aVar.f259126H);
                }
            }
        }
        C90692a aVar2 = new C90692a(new WeakReference(fVar2), System.currentTimeMillis(), str, fVar);
        String optString = jSONObject2.optString("url");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.BaseCreateRequestTask", "url is null");
            mo124828b(fVar, str, "url is null or nil", 600005, (Map) null);
            return;
        }
        C90272a aVar3 = (C90272a) fVar2.mo109671p(cls);
        int i = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        int optInt = jSONObject2.optInt("timeout", 0);
        Log.m105925i("MicroMsg.BaseCreateRequestTask", "lm:data configTimeout %d", Integer.valueOf(optInt));
        if (optInt <= 0) {
            optInt = C90309m.m113079n(aVar3, 0);
            Log.m105925i("MicroMsg.BaseCreateRequestTask", "lm:getRequiredTimeout configTimeout %d", Integer.valueOf(optInt));
        }
        if (optInt > 0) {
            i = optInt;
        }
        Log.m105925i("MicroMsg.BaseCreateRequestTask", "lm:configTimeout: %d,timeout: %d", Integer.valueOf(optInt), Integer.valueOf(i));
        if (aVar3.f259133j <= 0) {
            Log.m105924i("MicroMsg.BaseCreateRequestTask", "maxRequestConcurrent <= 0 use default concurrent");
        }
        Map<String, String> g = C90309m.m113072g(jSONObject2, aVar3);
        boolean z = jSONObject2.optBoolean("__skipDomainCheck__") ? false : aVar3.f259128e;
        if (!z || C90309m.m113088w(aVar3.f259137q, optString, false)) {
            AtomicInteger atomicInteger = C90299j.f259242b;
            if (C90299j.C90301b.f259244a.mo124533a(fVar.getAppId()) == null) {
                hVar = new C90291h(fVar2, this.f260513d, this.f260515f, this.f260516g);
                C90299j jVar = C90299j.C90301b.f259244a;
                String appId = fVar.getAppId();
                if (!jVar.f259243a.containsKey(appId)) {
                    jVar.f259243a.put(appId, hVar);
                }
            } else {
                hVar = C90299j.C90301b.f259244a.mo124533a(fVar.getAppId());
            }
            C90291h hVar2 = hVar;
            if (jSONObject2.optBoolean("useHttpdnsRetry", false)) {
                Log.m105925i("MicroMsg.BaseCreateRequestTask", "use httpdns retry taskId:%s", str);
            }
            Log.m105925i("MicroMsg.BaseCreateRequestTask", "request requestTaskId:%s,url:%s", str, optString);
            if (hVar2 == null) {
                mo124828b(fVar, str, "create request error", 600004, (Map) null);
            } else if (!z) {
                Log.m105924i("MicroMsg.BaseCreateRequestTask", "debug type, do not verify domains");
                hVar2.mo124513g(fVar, i, jSONObject, g, (ArrayList<String>) null, aVar2, str, C90695c.NAME);
            } else {
                hVar2.mo124513g(fVar, i, jSONObject, g, aVar3.f259137q, aVar2, str, C90695c.NAME);
            }
        } else {
            Log.m105925i("MicroMsg.BaseCreateRequestTask", "not in domain url %s", optString);
            String str2 = null;
            try {
                str2 = new URL(optString).getHost();
            } catch (MalformedURLException e) {
                Log.printErrStackTrace("MicroMsg.BaseCreateRequestTask", e, "get url host fail Exception", new Object[0]);
            }
            if (!Util.isNullOrNil(str2)) {
                mo124828b(fVar, str, "url not in domain list:" + str2, 600002, (Map) null);
                return;
            }
            mo124828b(fVar, str, "url not in domain list", 600002, (Map) null);
        }
    }

    public String getTaskId() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger atomicInteger = C90299j.f259242b;
        C90299j.C90301b.f259244a.getClass();
        sb.append(C90299j.f259242b.incrementAndGet());
        sb.append("");
        return sb.toString();
    }
}
