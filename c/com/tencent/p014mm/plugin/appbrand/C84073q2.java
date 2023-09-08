package com.tencent.p014mm.plugin.appbrand;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.appbrand.p942v8.C80689p;
import com.tencent.p014mm.plugin.appbrand.C81104a;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gu0.C87386b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import js0.C88016e;
import org.json.JSONException;
import org.json.JSONObject;
import p774zg.C91734m0;
import p774zg.C91735n0;

/* renamed from: com.tencent.mm.plugin.appbrand.q2 */
public class C84073q2 {

    /* renamed from: l */
    public static ReentrantLock f245475l = new ReentrantLock();

    /* renamed from: a */
    public C81925i2 f245476a;

    /* renamed from: b */
    public C83170k f245477b;

    /* renamed from: c */
    public C80681o f245478c;

    /* renamed from: d */
    public ArrayList<C80681o.C80687f> f245479d;

    /* renamed from: e */
    public String f245480e;

    /* renamed from: f */
    public final C87386b f245481f = new C87386b();

    /* renamed from: g */
    public final LinkedList<C84078e> f245482g = new LinkedList<>();

    /* renamed from: h */
    public final AtomicBoolean f245483h = new AtomicBoolean(false);

    /* renamed from: i */
    public final AtomicBoolean f245484i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f245485j = new AtomicBoolean(false);

    /* renamed from: k */
    public C91735n0 f245486k = new C84077d();

    /* renamed from: com.tencent.mm.plugin.appbrand.q2$a */
    public class C84074a implements C80681o.C80688g {

        /* renamed from: a */
        public long f245487a = 0;

        /* renamed from: b */
        public final /* synthetic */ boolean f245488b;

        public C84074a(boolean z) {
            this.f245488b = z;
        }

        /* renamed from: a */
        public void mo116736a(long j) {
            Log.m105925i("MicroMsg.AppBrandWorkerContainer", "js inject cost[%d]", Long.valueOf(j));
            if (this.f245488b) {
                synchronized (C84073q2.this.f245482g) {
                    C87386b bVar = C84073q2.this.f245481f;
                    bVar.f253240e = j;
                    bVar.f253241f = this.f245487a;
                    Iterator it = new LinkedList(C84073q2.this.f245482g).iterator();
                    while (it.hasNext()) {
                        ((C84078e) it.next()).mo113812a(this.f245487a, j);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q2$b */
    public class C84075b implements ValueCallback<String> {
        public C84075b(C84073q2 q2Var) {
        }

        public void onReceiveValue(Object obj) {
            Log.m105924i("MicroMsg.AppBrandWorkerContainer", "inject WXConfig result=" + ((String) obj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q2$c */
    public class C84076c implements ValueCallback<String> {
        public C84076c(C84073q2 q2Var) {
        }

        public void onReceiveValue(Object obj) {
            Log.m105924i("MicroMsg.AppBrandWorkerContainer", "onWxConfigReady result=" + ((String) obj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q2$d */
    public class C84077d extends C91735n0 {
        public C84077d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.q2$e */
    public interface C84078e {
        /* renamed from: a */
        void mo113812a(long j, long j2);

        /* renamed from: b */
        boolean mo113813b();

        /* renamed from: c */
        void mo113814c(C87386b bVar);
    }

    public C84073q2(C81925i2 i2Var) {
        this.f245476a = i2Var;
        this.f245477b = (C83170k) i2Var.getJsRuntime().mo63321n0(C83170k.class);
        this.f245478c = mo116724b();
        this.f245479d = new ArrayList<>();
        this.f245479d.add(new C80681o.C80687f(this.f245476a.mo114343n0() + "wxa_library/bootstrap_j2v8_worker.js", C88016e.m109548e("wxa_library/bootstrap_j2v8_worker.js")));
        i2Var.getJsRuntime().addJavascriptInterface(this, "WeixinWorker");
    }

    /* renamed from: a */
    public void mo116723a(ArrayList<C80681o.C80687f> arrayList, String str, boolean z, String str2) {
        JSONObject Y = z ? this.f245476a.mo114333Y() : this.f245476a.mo114340k0();
        C87412m.m108594g(Y, "config");
        C87412m.m108594g(str2, "workerType");
        try {
            Y.put("workerContentType", str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e, "put with key(workerContentType)", new Object[0]);
        }
        arrayList.add(new C80681o.C80687f(this.f245476a.mo114343n0() + "config", String.format("var __wxConfig = %s;", new Object[]{Y.toString()})));
    }

    /* renamed from: b */
    public C80681o mo116724b() {
        return new C80681o(this.f245486k);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo116725c(java.lang.String r18, java.lang.String r19, com.tencent.p014mm.appbrand.p942v8.C80681o.C80686e r20, int r21, com.tencent.p014mm.appbrand.p942v8.C80681o.C80688g r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r6 = 1
            r4[r6] = r2
            r7 = 2
            r4[r7] = r3
            java.util.concurrent.atomic.AtomicBoolean r7 = r1.f245485j
            boolean r7 = r7.get()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 3
            r4[r8] = r7
            java.lang.String r7 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.String r8 = "createWorker: path:%s, params:%s, type:%s, destroyed?:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.f245485j
            boolean r4 = r4.get()
            r8 = -1
            if (r4 == 0) goto L_0x0032
            return r8
        L_0x0032:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList<com.tencent.mm.appbrand.v8.o$f> r9 = r1.f245479d
            r4.<init>(r9)
            int r9 = r20.ordinal()
            if (r9 == 0) goto L_0x0050
            if (r9 == r6) goto L_0x0042
            goto L_0x005c
        L_0x0042:
            java.lang.String r9 = "wxlib"
            r1.mo116723a(r4, r0, r6, r9)
            com.tencent.mm.appbrand.v8.o$f r0 = r17.mo116730e(r18)
            r4.add(r0)
            goto L_0x005c
        L_0x0050:
            java.lang.String r9 = "app"
            r1.mo116723a(r4, r0, r5, r9)
            com.tencent.mm.appbrand.v8.o$f r0 = r17.mo116731f(r18)
            r4.add(r0)
        L_0x005c:
            r9 = 0
            if (r2 == 0) goto L_0x0099
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008f }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x008f }
            java.lang.String r10 = "APIList"
            org.json.JSONArray r0 = r0.optJSONArray(r10)     // Catch:{ JSONException -> 0x008f }
            if (r0 == 0) goto L_0x0099
            int r10 = r0.length()     // Catch:{ JSONException -> 0x008f }
            if (r10 <= 0) goto L_0x0099
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x008f }
            r11 = 10
            r10.<init>(r11)     // Catch:{ JSONException -> 0x008f }
            r9 = 0
        L_0x007a:
            int r11 = r0.length()     // Catch:{ JSONException -> 0x008c }
            if (r9 >= r11) goto L_0x008a
            java.lang.String r11 = r0.getString(r9)     // Catch:{ JSONException -> 0x008c }
            r10.add(r11)     // Catch:{ JSONException -> 0x008c }
            int r9 = r9 + 1
            goto L_0x007a
        L_0x008a:
            r9 = r10
            goto L_0x0099
        L_0x008c:
            r0 = move-exception
            r9 = r10
            goto L_0x0090
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r5] = r2
            java.lang.String r2 = "hy: json format error! %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r10)
        L_0x0099:
            com.tencent.mm.appbrand.v8.o r0 = r1.f245478c
            com.tencent.mm.plugin.appbrand.i2 r14 = r1.f245476a
            r2 = r21
            if (r2 == r8) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f236075a
            int r2 = r2.addAndGet(r6)
        L_0x00a8:
            com.tencent.mm.appbrand.v8.IJSRuntime$Config r7 = r0.mo112520j(r14)
            com.tencent.mm.plugin.appbrand.jsruntime.y r8 = new com.tencent.mm.plugin.appbrand.jsruntime.y
            r8.<init>(r7)
            com.tencent.mm.appbrand.v8.j r10 = r8.f242939g
            r0.mo112519i(r4, r8, r14)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.appbrand.v8.j> r8 = r0.f236076b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r8.put(r11, r10)
            android.content.Context r12 = r14.getContext()
            com.tencent.mm.appbrand.v8.o$e r8 = com.tencent.p014mm.appbrand.p942v8.C80681o.C80686e.f236087e
            if (r3 != r8) goto L_0x00ca
            r16 = 1
            goto L_0x00cc
        L_0x00ca:
            r16 = 0
        L_0x00cc:
            r11 = r0
            r13 = r2
            r15 = r9
            r11.mo112513c(r12, r13, r14, r15, r16)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.jsapi.g> r3 = r7.f235986n
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r10)
            zg.k0 r7 = new zg.k0
            r7.<init>(r0, r2)
            com.tencent.mm.appbrand.v8.IJSRuntime r8 = r10.f236041b
            zg.p r11 = new zg.p
            java.lang.String r12 = "postMessage"
            r11.<init>(r10, r7, r12)
            r8.mo112450v(r11)
            com.tencent.mm.plugin.appbrand.jsruntime.o r5 = r0.mo112514d(r2, r5)
            if (r3 == 0) goto L_0x0103
            zg.l0 r7 = new zg.l0
            r7.<init>(r0, r3, r9, r5)
            com.tencent.mm.appbrand.v8.IJSRuntime r3 = r10.f236041b
            zg.o r5 = new zg.o
            java.lang.String r8 = "workerInvokeJsApi"
            r5.<init>(r10, r7, r8)
            r3.mo112450v(r5)
        L_0x0103:
            com.tencent.mm.appbrand.v8.n r3 = new com.tencent.mm.appbrand.v8.n
            r3.<init>(r0, r10)
            com.tencent.mm.appbrand.v8.IJSRuntime r5 = r10.f236041b
            r5.mo112430A(r6, r3)
            r3 = r22
            r0.mo112511a(r10, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C84073q2.mo116725c(java.lang.String, java.lang.String, com.tencent.mm.appbrand.v8.o$e, int, com.tencent.mm.appbrand.v8.o$g):int");
    }

    @JavascriptInterface
    public int create(String str) {
        return createWithParams(str, (String) null);
    }

    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: type inference failed for: r14v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (f245475l.isHeldByCurrentThread() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        f245475l.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (((com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q) r12.f245476a.getJsRuntime().mo63321n0(com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q.class)).mo115422q() == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r12.f245476a.getRuntime() == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (((ai0.C79581v) p224ra.C89909e.m112436a(ai0.C79581v.class)).mo109626c4(r12.f245476a.getRuntime()) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandWorkerContainer", "[createWXLibWorker]  jsCreateWork not ad contact");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r3 == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (f245475l.isHeldByCurrentThread() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        f245475l.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r12.f245481f.f253245j = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandWorkerContainer", "[createWXLibWorker]  jsCreateWorkTime=" + r12.f245481f.f253245j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        r12.f245481f.f253244i = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandWorkerContainer", "[createWXLibWorker]  serviceCreateWorkTime=" + r12.f245481f.f253244i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        if (f245475l.tryLock(10, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f2, code lost:
        if (r3 == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (f245475l.isHeldByCurrentThread() == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        f245475l.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0101, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r4 = r12.f245481f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r4.f253237b == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0108, code lost:
        r13 = r4.f253236a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        if (r3 == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        if (f245475l.isHeldByCurrentThread() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        f245475l.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0119, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.f253239d = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c1 A[SYNTHETIC, Splitter:B:106:0x01c1] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int createWXLibWorker(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f245485j
            boolean r0 = r0.get()
            r1 = -1
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            r0 = 1
            r2 = 0
            boolean r3 = r12.mo116732g(r14)     // Catch:{ InterruptedException -> 0x01d7, all -> 0x01bc }
            java.lang.String r4 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5.<init>()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r6 = "[createWXLibWorker]  isAdWorker="
            r5.append(r6)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5.append(r3)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r5 = r5.toString()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r3 == 0) goto L_0x0121
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r4 = r12.f245482g     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ all -> 0x011e }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r6 = r12.f245482g     // Catch:{ all -> 0x011e }
            r5.<init>(r6)     // Catch:{ all -> 0x011e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x011e }
        L_0x0036:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x011e }
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x011e }
            com.tencent.mm.plugin.appbrand.q2$e r6 = (com.tencent.p014mm.plugin.appbrand.C84073q2.C84078e) r6     // Catch:{ all -> 0x011e }
            boolean r6 = r6.mo113813b()     // Catch:{ all -> 0x011e }
            if (r6 == 0) goto L_0x0036
            monitor-exit(r4)     // Catch:{ all -> 0x011e }
            if (r3 == 0) goto L_0x0058
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            boolean r13 = r13.isHeldByCurrentThread()
            if (r13 == 0) goto L_0x0058
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            r13.unlock()
        L_0x0058:
            return r1
        L_0x0059:
            monitor-exit(r4)     // Catch:{ all -> 0x011e }
            com.tencent.mm.plugin.appbrand.i2 r4 = r12.f245476a     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.jsruntime.i r4 = r4.getJsRuntime()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.q> r5 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r4 = r4.mo63321n0(r5)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.jsruntime.q r4 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q) r4     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            boolean r4 = r4.mo115422q()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r4 == 0) goto L_0x00c4
            com.tencent.mm.plugin.appbrand.i2 r4 = r12.f245476a     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r4.getRuntime()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r4 == 0) goto L_0x00a1
            java.lang.Class<ai0.v> r4 = ai0.C79581v.class
            ra.b r4 = p224ra.C89909e.m112436a(r4)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            ai0.v r4 = (ai0.C79581v) r4     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.i2 r5 = r12.f245476a     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.getRuntime()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            boolean r4 = r4.mo109626c4(r5)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r4 != 0) goto L_0x00a1
            java.lang.String r13 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.String r14 = "[createWXLibWorker]  jsCreateWork not ad contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r3 == 0) goto L_0x00a0
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            boolean r13 = r13.isHeldByCurrentThread()
            if (r13 == 0) goto L_0x00a0
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            r13.unlock()
        L_0x00a0:
            return r1
        L_0x00a1:
            gu0.b r4 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r4.f253245j = r5     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r4 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5.<init>()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r6 = "[createWXLibWorker]  jsCreateWorkTime="
            r5.append(r6)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            gu0.b r6 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            long r6 = r6.f253245j     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5.append(r6)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r5 = r5.toString()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            goto L_0x00e6
        L_0x00c4:
            gu0.b r4 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r4.f253244i = r5     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r4 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5.<init>()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r6 = "[createWXLibWorker]  serviceCreateWorkTime="
            r5.append(r6)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            gu0.b r6 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            long r6 = r6.f253244i     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5.append(r6)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r5 = r5.toString()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
        L_0x00e6:
            java.util.concurrent.locks.ReentrantLock r4 = f245475l     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r5 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            boolean r4 = r4.tryLock(r5, r7)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r4 != 0) goto L_0x0102
            if (r3 == 0) goto L_0x0101
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            boolean r13 = r13.isHeldByCurrentThread()
            if (r13 == 0) goto L_0x0101
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            r13.unlock()
        L_0x0101:
            return r1
        L_0x0102:
            gu0.b r4 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.appbrand.v8.j r5 = r4.f253237b     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r5 == 0) goto L_0x011a
            int r13 = r4.f253236a     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r3 == 0) goto L_0x0119
            java.util.concurrent.locks.ReentrantLock r14 = f245475l
            boolean r14 = r14.isHeldByCurrentThread()
            if (r14 == 0) goto L_0x0119
            java.util.concurrent.locks.ReentrantLock r14 = f245475l
            r14.unlock()
        L_0x0119:
            return r13
        L_0x011a:
            r5 = 0
            r4.f253239d = r5     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            goto L_0x0121
        L_0x011e:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x011e }
            throw r13     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
        L_0x0121:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r3 == 0) goto L_0x0129
            r10 = 0
            goto L_0x012a
        L_0x0129:
            r10 = -1
        L_0x012a:
            com.tencent.mm.appbrand.v8.o$e r9 = com.tencent.p014mm.appbrand.p942v8.C80681o.C80686e.f236087e     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.q2$a r11 = new com.tencent.mm.plugin.appbrand.q2$a     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r11.<init>(r3)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r6 = r12
            r7 = r13
            r8 = r14
            int r13 = r6.mo116725c(r7, r8, r9, r10, r11)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            if (r3 == 0) goto L_0x017e
            gu0.b r6 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r6.f253236a = r13     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r12.mo116733h()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            gu0.b r6 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.appbrand.v8.o r7 = r12.f245478c     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.appbrand.v8.j> r7 = r7.f236076b     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.appbrand.v8.j r7 = (com.tencent.p014mm.appbrand.p942v8.C80669j) r7     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r6.f253237b = r7     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            gu0.b r6 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.i2 r7 = r12.f245476a     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r6.f253242g = r7     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            rx3.l r7 = new rx3.l     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r7.<init>(r4, r5)     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r6.f253238c = r7     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            gu0.b r4 = r12.f245481f     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            r4.f253243h = r14     // Catch:{ InterruptedException -> 0x01b9, all -> 0x01b6 }
            java.lang.String r14 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.String r4 = "createWXLibWorker done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)     // Catch:{ InterruptedException -> 0x017b, all -> 0x0178 }
            goto L_0x017f
        L_0x0178:
            r13 = move-exception
            r14 = 1
            goto L_0x01bf
        L_0x017b:
            r13 = move-exception
            r14 = 1
            goto L_0x01da
        L_0x017e:
            r0 = 0
        L_0x017f:
            if (r3 == 0) goto L_0x01b5
            java.util.concurrent.locks.ReentrantLock r14 = f245475l
            boolean r14 = r14.isHeldByCurrentThread()
            if (r14 == 0) goto L_0x018e
            java.util.concurrent.locks.ReentrantLock r14 = f245475l
            r14.unlock()
        L_0x018e:
            if (r0 == 0) goto L_0x01b5
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r14 = r12.f245482g
            monitor-enter(r14)
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x01b2 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r1 = r12.f245482g     // Catch:{ all -> 0x01b2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x019e:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x01b0
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01b2 }
            com.tencent.mm.plugin.appbrand.q2$e r1 = (com.tencent.p014mm.plugin.appbrand.C84073q2.C84078e) r1     // Catch:{ all -> 0x01b2 }
            gu0.b r2 = r12.f245481f     // Catch:{ all -> 0x01b2 }
            r1.mo113814c(r2)     // Catch:{ all -> 0x01b2 }
            goto L_0x019e
        L_0x01b0:
            monitor-exit(r14)     // Catch:{ all -> 0x01b2 }
            goto L_0x01b5
        L_0x01b2:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01b2 }
            throw r13
        L_0x01b5:
            return r13
        L_0x01b6:
            r13 = move-exception
            r14 = 0
            goto L_0x01bf
        L_0x01b9:
            r13 = move-exception
            r14 = 0
            goto L_0x01da
        L_0x01bc:
            r13 = move-exception
            r14 = 0
            r3 = 0
        L_0x01bf:
            if (r3 == 0) goto L_0x01c9
            gu0.b r1 = r12.f245481f     // Catch:{ all -> 0x0228 }
            java.lang.String r4 = r13.getMessage()     // Catch:{ all -> 0x0228 }
            r1.f253239d = r4     // Catch:{ all -> 0x0228 }
        L_0x01c9:
            java.lang.String r1 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.String r4 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0228 }
            java.lang.String r5 = ""
            r0[r2] = r5     // Catch:{ all -> 0x0228 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r4, r0)     // Catch:{ all -> 0x0228 }
            throw r13     // Catch:{ all -> 0x0228 }
        L_0x01d7:
            r13 = move-exception
            r14 = 0
            r3 = 0
        L_0x01da:
            if (r3 == 0) goto L_0x01e4
            gu0.b r4 = r12.f245481f     // Catch:{ all -> 0x0228 }
            java.lang.String r5 = r13.getMessage()     // Catch:{ all -> 0x0228 }
            r4.f253239d = r5     // Catch:{ all -> 0x0228 }
        L_0x01e4:
            java.lang.String r4 = "MicroMsg.AppBrandWorkerContainer"
            java.lang.String r5 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0228 }
            java.lang.String r6 = ""
            r0[r2] = r6     // Catch:{ all -> 0x0228 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r13, r5, r0)     // Catch:{ all -> 0x0228 }
            if (r3 == 0) goto L_0x0227
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            boolean r13 = r13.isHeldByCurrentThread()
            if (r13 == 0) goto L_0x0200
            java.util.concurrent.locks.ReentrantLock r13 = f245475l
            r13.unlock()
        L_0x0200:
            if (r14 == 0) goto L_0x0227
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r13 = r12.f245482g
            monitor-enter(r13)
            java.util.LinkedList r14 = new java.util.LinkedList     // Catch:{ all -> 0x0224 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r0 = r12.f245482g     // Catch:{ all -> 0x0224 }
            r14.<init>(r0)     // Catch:{ all -> 0x0224 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0224 }
        L_0x0210:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0222
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0224 }
            com.tencent.mm.plugin.appbrand.q2$e r0 = (com.tencent.p014mm.plugin.appbrand.C84073q2.C84078e) r0     // Catch:{ all -> 0x0224 }
            gu0.b r2 = r12.f245481f     // Catch:{ all -> 0x0224 }
            r0.mo113814c(r2)     // Catch:{ all -> 0x0224 }
            goto L_0x0210
        L_0x0222:
            monitor-exit(r13)     // Catch:{ all -> 0x0224 }
            goto L_0x0227
        L_0x0224:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0224 }
            throw r14
        L_0x0227:
            return r1
        L_0x0228:
            r13 = move-exception
            if (r3 == 0) goto L_0x025f
            java.util.concurrent.locks.ReentrantLock r0 = f245475l
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0238
            java.util.concurrent.locks.ReentrantLock r0 = f245475l
            r0.unlock()
        L_0x0238:
            if (r14 == 0) goto L_0x025f
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r14 = r12.f245482g
            monitor-enter(r14)
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x025c }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.q2$e> r1 = r12.f245482g     // Catch:{ all -> 0x025c }
            r0.<init>(r1)     // Catch:{ all -> 0x025c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x025c }
        L_0x0248:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x025c }
            if (r1 == 0) goto L_0x025a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x025c }
            com.tencent.mm.plugin.appbrand.q2$e r1 = (com.tencent.p014mm.plugin.appbrand.C84073q2.C84078e) r1     // Catch:{ all -> 0x025c }
            gu0.b r2 = r12.f245481f     // Catch:{ all -> 0x025c }
            r1.mo113814c(r2)     // Catch:{ all -> 0x025c }
            goto L_0x0248
        L_0x025a:
            monitor-exit(r14)     // Catch:{ all -> 0x025c }
            goto L_0x025f
        L_0x025c:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x025c }
            throw r13
        L_0x025f:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C84073q2.createWXLibWorker(java.lang.String, java.lang.String):int");
    }

    @JavascriptInterface
    public int createWithParams(String str, String str2) {
        return mo116725c(str, str2, C80681o.C80686e.USER, -1, (C80681o.C80688g) null);
    }

    /* renamed from: d */
    public List<C40482o> mo116729d() {
        ConcurrentHashMap<Integer, C80669j> concurrentHashMap = this.f245478c.f236076b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(5);
        for (Integer num : concurrentHashMap.keySet()) {
            C80681o oVar = this.f245478c;
            oVar.getClass();
            arrayList.add(new C80689p(oVar, concurrentHashMap.get(num)));
        }
        return arrayList;
    }

    /* renamed from: e */
    public C80681o.C80687f mo116730e(String str) {
        return new C80681o.C80687f(this.f245476a.mo114343n0() + str, this.f245476a.mo114272k().mo113372b(str), str, ExifInterface.GPS_MEASUREMENT_INTERRUPTED + this.f245476a.mo114272k().mo113371a());
    }

    /* renamed from: f */
    public C80681o.C80687f mo116731f(String str) {
        return new C80681o.C80687f(this.f245476a.mo114346q0() + str, C81247g3.m99556l(this.f245476a.getRuntime(), str) + this.f245476a.mo114345p0(str));
    }

    /* renamed from: g */
    public final boolean mo116732g(String str) {
        try {
            return "ad".equals(new JSONObject(str).optString("type"));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandWorkerContainer", e, "[createWXLibWorker] get type fail", new Object[0]);
            return false;
        }
    }

    /* renamed from: h */
    public final void mo116733h() {
        if (!this.f245483h.get() && this.f245484i.get() && this.f245476a.getRuntime() != null && this.f245481f.f253237b != null) {
            this.f245483h.set(true);
            Log.m105924i("MicroMsg.AppBrandWorkerContainer", "dispatch OnWxConfigReady to worker");
            C80669j jVar = this.f245481f.f253237b;
            C87412m.m108594g(jVar, "engine");
            jVar.mo112500d(String.format(Locale.ENGLISH, ";(function(global){if(typeof global.WXConfig==='undefined'){global.WXConfig={};};Object.assign(global.WXConfig, %s);})(this)", new Object[]{this.f245476a.mo114340k0().toString()}), new C81104a.C81105a(new C84075b(this)));
            jVar.mo112500d(String.format(Locale.US, ";(function(global){ if(global.WXConfig.preload) { %s; return true; } else { return false; }})(this);", new Object[]{C83133y6.m101970c("onWxConfigReady", "", 0)}), new C81104a.C81105a(new C84076c(this)));
        }
    }

    @JavascriptInterface
    public void postMsgToWorker(int i, String str) {
        C80681o oVar = this.f245478c;
        C80669j jVar = oVar.f236076b.get(Integer.valueOf(i));
        if (jVar != null) {
            jVar.f236041b.mo112450v(new C91734m0(oVar, jVar, str));
        }
    }

    @JavascriptInterface
    public void terminate(int i) {
        C80681o oVar = this.f245478c;
        C80669j remove = oVar.f236076b.remove(Integer.valueOf(i));
        if (remove != null) {
            oVar.mo112515e(i, remove);
        }
    }
}
