package sp0;

import com.tencent.p014mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;
import up0.C90721c;
import up0.C90723d;
import vl0.C90825a;

/* renamed from: sp0.k */
public class C90302k {

    /* renamed from: a */
    public int f259245a;

    /* renamed from: b */
    public final String f259246b;

    /* renamed from: c */
    public SSLContext f259247c;

    /* renamed from: d */
    public C82381f f259248d;

    /* renamed from: e */
    public boolean f259249e = false;

    /* renamed from: f */
    public final ArrayList<C90721c> f259250f = new ArrayList<>();

    /* renamed from: g */
    public final ArrayList<String> f259251g = new ArrayList<>();

    /* renamed from: sp0.k$a */
    public class C90303a implements C90723d {

        /* renamed from: a */
        public final /* synthetic */ String f259252a;

        /* renamed from: b */
        public final /* synthetic */ C90304b f259253b;

        public C90303a(String str, C90304b bVar) {
            this.f259252a = str;
            this.f259253b = bVar;
        }

        /* renamed from: a */
        public void mo124537a(String str, String str2, String str3, int i) {
            Log.m105921e("MicroMsg.AppBrandNetworkUpload", "upload error! errorMessage:%s, filename %s, url %s", str3, str, str2);
            C90302k.this.mo124536b(this.f259252a);
            ((C90825a.C90826a) this.f259253b).mo124937a(-1, str3, i);
        }

        /* renamed from: b */
        public void mo124538b(String str) {
            C90302k.this.f259251g.remove(str);
        }

        /* renamed from: c */
        public void mo124539c(String str, String str2, String str3, int i, long j, Map map) {
            C90302k.this.mo124536b(this.f259252a);
            C90825a.C90826a aVar = (C90825a.C90826a) this.f259253b;
            Log.m105925i("MicroMsg.BaseCreateUploadTask", "onUploadResultWithCode uploadTaskId:%s, filePath:%s, result:%s, errMsg:%d, statusCode %d", aVar.f260788b, aVar.f260789c, str3, 0, Integer.valueOf(i));
            HashMap hashMap = new HashMap();
            hashMap.put("data", str3);
            hashMap.put("statusCode", Integer.valueOf(i));
            hashMap.put("uploadTaskId", aVar.f260788b);
            hashMap.put("state", "success");
            JSONObject jSONObject = aVar.f260787a;
            if (jSONObject != null) {
                hashMap.put("header", jSONObject);
            }
            String jSONObject2 = new JSONObject(hashMap).toString();
            C90825a.C90827b bVar = new C90825a.C90827b();
            bVar.mo115161k(aVar.f260790d);
            bVar.mo115163m(jSONObject2);
            bVar.mo115159i(C90825a.this.f260785f.mo122426a(aVar.f260788b));
            C90825a.this.f260785f.mo122427b(aVar.f260788b);
            Log.m105925i("MicroMsg.AppBrandNetworkUpload", "upload success! filename %s, url %s", str, str2);
        }

        /* renamed from: d */
        public void mo124540d(JSONObject jSONObject) {
            C90825a.C90826a aVar = (C90825a.C90826a) this.f259253b;
            aVar.getClass();
            if (jSONObject != null) {
                if (!jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__")) {
                    aVar.f260787a = jSONObject;
                    HashMap hashMap = new HashMap();
                    hashMap.put("uploadTaskId", aVar.f260788b);
                    hashMap.put("state", "headersReceived");
                    hashMap.put("header", aVar.f260787a);
                    String jSONObject2 = new JSONObject(hashMap).toString();
                    C90825a.C90827b bVar = new C90825a.C90827b();
                    bVar.mo115161k(aVar.f260790d);
                    bVar.mo115163m(jSONObject2);
                    bVar.mo115159i(C90825a.this.f260785f.mo122426a(aVar.f260788b));
                } else if (((C90272a) aVar.f260790d.mo109671p(C90272a.class)).f259124F) {
                    jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                    AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new AppBrandNetWorkReqHeaderReceivedEvent();
                    AppBrandNetWorkReqHeaderReceivedEvent.C80702a aVar2 = appBrandNetWorkReqHeaderReceivedEvent.f236133d;
                    aVar2.f236134a = "upload";
                    aVar2.f236136c = jSONObject;
                    aVar2.f236135b = aVar.f260788b;
                    appBrandNetWorkReqHeaderReceivedEvent.publish();
                }
            }
        }

        /* renamed from: e */
        public void mo124541e(String str, String str2, int i, long j, long j2) {
            C90825a.C90826a aVar = (C90825a.C90826a) this.f259253b;
            aVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("uploadTaskId", aVar.f260788b);
            hashMap.put("state", "progressUpdate");
            hashMap.put("progress", Integer.valueOf(i));
            hashMap.put("totalBytesSent", Long.valueOf(j));
            hashMap.put("totalBytesExpectedToSend", Long.valueOf(j2));
            String jSONObject = new JSONObject(hashMap).toString();
            C90825a.C90827b bVar = new C90825a.C90827b();
            bVar.mo115161k(aVar.f260790d);
            bVar.mo115163m(jSONObject);
            bVar.mo115159i(C90825a.this.f260785f.mo122426a(aVar.f260788b));
        }
    }

    /* renamed from: sp0.k$b */
    public interface C90304b {
    }

    /* renamed from: sp0.k$c */
    public interface C90305c {
    }

    public C90302k(C82381f fVar, boolean z) {
        this.f259248d = fVar;
        C90272a aVar = (C90272a) fVar.mo109671p(C90272a.class);
        this.f259245a = aVar.f259135o;
        this.f259246b = aVar.f259120B;
        this.f259247c = C90309m.m113081p(aVar);
        this.f259249e = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        ((vl0.C90825a.C90826a) r3).mo124937a(-1, "fileName error", 600005);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandNetworkUpload", "fileName error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r0 = r2.optBoolean("enableHttp2", false);
        r16 = r2.optBoolean("enableQuic", false);
        r17 = r2.optBoolean("enableCache", false);
        r2 = r2.optBoolean("enableProfile", true);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkUpload", "upload taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b", r4, java.lang.Boolean.valueOf(r0), java.lang.Boolean.valueOf(r16), java.lang.Boolean.valueOf(r17), java.lang.Boolean.valueOf(r2));
        r6 = r1.f259248d;
        r12 = r1.f259246b;
        r11 = r1.f259249e;
        r3 = new sp0.C90302k.C90303a(r1, r4, r3);
        r4 = r5;
        r5 = new up0.C90721c(r6, r7, r22, r10, r29, r21, r12, r11, r0, r16, r17, r2, r3);
        r4.f260575q = r14;
        r4.f260576r = r24;
        r4.f260577s = r20;
        r4.f260568g = true;
        r4.f260579u = r25;
        r1 = r19;
        r4.f260578t = r1.f259247c;
        r0 = r4;
        r0.f260581w = r27;
        r0.f260559B = r28;
        r2 = r1.f259250f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x012e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.f259250f.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0134, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0135, code lost:
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(r0, "appbrand_upload_thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124535a(int r20, java.lang.String r21, java.lang.String r22, org.json.JSONObject r23, java.util.Map<java.lang.String, java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, sp0.C90302k.C90304b r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r19 = this;
            r1 = r19
            r2 = r23
            r3 = r26
            r4 = r27
            java.lang.String r0 = "url"
            java.lang.String r7 = r2.optString(r0)
            java.lang.String r0 = "MicroMsg.AppBrandNetworkUpload"
            java.lang.String r5 = "upload taskId:%s url:%s"
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r9 = 0
            r8[r9] = r4
            r15 = 1
            r8[r15] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r8)
            java.lang.String r0 = "name"
            java.lang.String r10 = r2.optString(r0)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.lang.String r0 = "formData"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x004b }
            if (r0 == 0) goto L_0x0055
            java.util.Iterator r5 = r0.keys()     // Catch:{ Exception -> 0x004b }
        L_0x0037:
            boolean r8 = r5.hasNext()     // Catch:{ Exception -> 0x004b }
            if (r8 == 0) goto L_0x0055
            java.lang.Object r8 = r5.next()     // Catch:{ Exception -> 0x004b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x004b }
            java.lang.String r11 = r0.getString(r8)     // Catch:{ Exception -> 0x004b }
            r14.put(r8, r11)     // Catch:{ Exception -> 0x004b }
            goto L_0x0037
        L_0x004b:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r8 = "MicroMsg.AppBrandNetworkUtil"
            java.lang.String r11 = "Exception: get form error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r11, r5)
        L_0x0055:
            java.util.ArrayList<up0.c> r5 = r1.f259250f
            monitor-enter(r5)
            java.util.ArrayList<up0.c> r0 = r1.f259250f     // Catch:{ all -> 0x0142 }
            int r0 = r0.size()     // Catch:{ all -> 0x0142 }
            int r8 = r1.f259245a     // Catch:{ all -> 0x0142 }
            r11 = -1
            if (r0 < r8) goto L_0x008c
            java.lang.String r0 = "fail:network exceed max task count"
            r2 = 600007(0x927c7, float:8.40789E-40)
            vl0.a$a r3 = (vl0.C90825a.C90826a) r3     // Catch:{ all -> 0x0142 }
            r3.mo124937a(r11, r0, r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "MicroMsg.AppBrandNetworkUpload"
            java.lang.String r2 = "max connected mUploadTaskList.size():%d,mMaxUploadConcurrent:%d"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0142 }
            java.util.ArrayList<up0.c> r4 = r1.f259250f     // Catch:{ all -> 0x0142 }
            int r4 = r4.size()     // Catch:{ all -> 0x0142 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0142 }
            r3[r9] = r4     // Catch:{ all -> 0x0142 }
            int r4 = r1.f259245a     // Catch:{ all -> 0x0142 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0142 }
            r3[r15] = r4     // Catch:{ all -> 0x0142 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)     // Catch:{ all -> 0x0142 }
            monitor-exit(r5)     // Catch:{ all -> 0x0142 }
            return
        L_0x008c:
            monitor-exit(r5)     // Catch:{ all -> 0x0142 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "fileName error"
            r2 = 600005(0x927c5, float:8.40786E-40)
            vl0.a$a r3 = (vl0.C90825a.C90826a) r3
            r3.mo124937a(r11, r0, r2)
            java.lang.String r0 = "MicroMsg.AppBrandNetworkUpload"
            java.lang.String r2 = "fileName error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        L_0x00a5:
            java.lang.String r0 = "enableHttp2"
            boolean r0 = r2.optBoolean(r0, r9)
            java.lang.String r5 = "enableQuic"
            boolean r16 = r2.optBoolean(r5, r9)
            java.lang.String r5 = "enableCache"
            boolean r17 = r2.optBoolean(r5, r9)
            java.lang.String r5 = "enableProfile"
            boolean r2 = r2.optBoolean(r5, r15)
            java.lang.String r5 = "MicroMsg.AppBrandNetworkUpload"
            java.lang.String r8 = "upload taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r9] = r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r11[r15] = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r16)
            r11[r6] = r9
            r6 = 3
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r17)
            r11[r6] = r9
            r6 = 4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            r11[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r11)
            up0.c r13 = new up0.c
            com.tencent.mm.plugin.appbrand.jsapi.f r6 = r1.f259248d
            java.lang.String r12 = r1.f259246b
            boolean r11 = r1.f259249e
            sp0.k$a r9 = new sp0.k$a
            r9.<init>(r4, r3)
            r5 = r13
            r8 = r22
            r3 = r9
            r9 = r10
            r10 = r29
            r18 = r11
            r11 = r21
            r4 = r13
            r13 = r18
            r1 = r14
            r14 = r0
            r15 = r16
            r16 = r17
            r17 = r2
            r18 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.f260575q = r1
            r1 = r24
            r4.f260576r = r1
            r1 = r20
            r4.f260577s = r1
            r1 = 1
            r4.f260568g = r1
            r1 = r25
            r4.f260579u = r1
            r1 = r19
            javax.net.ssl.SSLContext r0 = r1.f259247c
            r4.f260578t = r0
            r2 = r27
            r0 = r4
            r0.f260581w = r2
            r2 = r28
            r0.f260559B = r2
            java.util.ArrayList<up0.c> r2 = r1.f259250f
            monitor-enter(r2)
            java.util.ArrayList<up0.c> r3 = r1.f259250f     // Catch:{ all -> 0x013f }
            r3.add(r0)     // Catch:{ all -> 0x013f }
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            zt3.t r2 = zt3.C119157j.f356862d
            java.lang.String r3 = "appbrand_upload_thread"
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183876g(r0, r3)
            return
        L_0x013f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            throw r0
        L_0x0142:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0142 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C90302k.mo124535a(int, java.lang.String, java.lang.String, org.json.JSONObject, java.util.Map, java.util.ArrayList, sp0.k$b, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo124536b(String str) {
        if (str != null) {
            synchronized (this.f259250f) {
                Iterator<C90721c> it = this.f259250f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C90721c next = it.next();
                    if (str.equals(next.f260581w)) {
                        this.f259250f.remove(next);
                        break;
                    }
                }
            }
        }
    }
}
