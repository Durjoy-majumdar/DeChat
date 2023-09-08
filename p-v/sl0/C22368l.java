package sl0;

import android.net.wifi.WifiManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sp0.C22381b0;

/* renamed from: sl0.l */
public class C22368l extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 529;
    public static final String NAME = "operateLocalServicesScan";

    /* renamed from: g */
    public final Map<String, C22369a> f63396g = new ConcurrentHashMap();

    /* renamed from: h */
    public WifiManager.MulticastLock f63397h = null;

    /* renamed from: sl0.l$a */
    public class C22369a implements C22381b0.C22383b {

        /* renamed from: a */
        public C82381f f63398a;

        /* renamed from: b */
        public AtomicInteger f63399b = new AtomicInteger();

        /* renamed from: c */
        public AtomicInteger f63400c = new AtomicInteger();

        public C22369a(C82381f fVar) {
            this.f63398a = fVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        r0 = ((android.net.wifi.WifiManager) r6.getContext().getApplicationContext().getSystemService("wifi")).createMulticastLock("MicroMsg.JsApiOperateLocalServicesScan");
        r5.f63397h = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        r0.acquire();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        r0 = new sl0.C22368l.C22369a(r5, r6);
        r0.f63399b.set(r8);
        ((java.util.concurrent.ConcurrentHashMap) r5.f63396g).put(mo35503w(r6, r7), r0);
        r8 = sp0.C22381b0.f63460e;
        r8.getClass();
        r3 = new sp0.C22385z(r8, r0);
        ((java.util.concurrent.ConcurrentHashMap) r8.f63462d).put(r0, r3);
        ((android.net.nsd.NsdManager) com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getSystemService("servicediscovery")).discoverServices(r7, 1, r3);
        com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(new sl0.C22365j(r5, r6, r7, r0), 30000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r6, org.json.JSONObject r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "action"
            java.lang.String r0 = r7.optString(r0)
            java.lang.String r1 = "MicroMsg.JsApiOperateLocalServicesScan"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "action = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r1 = "start"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            r2 = 1
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "serviceType"
            java.lang.String r7 = r7.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x003d
            java.lang.String r7 = "fail:invalid param"
            java.lang.String r7 = r5.mo115109j(r7)
            r6.mo109647a(r8, r7)
            return
        L_0x003d:
            java.util.Map<java.lang.String, sl0.l$a> r1 = r5.f63396g
            monitor-enter(r1)
            java.util.Map<java.lang.String, sl0.l$a> r0 = r5.f63396g     // Catch:{ all -> 0x00ce }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x00ce }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00ce }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ce }
        L_0x004c:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = r6.getAppId()     // Catch:{ all -> 0x00ce }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x004c
            java.lang.String r7 = "fail:scan task already exist"
            java.lang.String r7 = r5.mo115109j(r7)     // Catch:{ all -> 0x00ce }
            r6.mo109647a(r8, r7)     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            goto L_0x0139
        L_0x006e:
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            android.content.Context r0 = r6.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            java.lang.String r1 = "MicroMsg.JsApiOperateLocalServicesScan"
            android.net.wifi.WifiManager$MulticastLock r0 = r0.createMulticastLock(r1)
            r5.f63397h = r0
            if (r0 == 0) goto L_0x008d
            r0.acquire()
        L_0x008d:
            sl0.l$a r0 = new sl0.l$a
            r0.<init>(r6)
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f63399b
            r1.set(r8)
            java.util.Map<java.lang.String, sl0.l$a> r8 = r5.f63396g
            java.lang.String r1 = r5.mo35503w(r6, r7)
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            r8.put(r1, r0)
            sp0.b0 r8 = sp0.C22381b0.INSTANCE
            r8.getClass()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "servicediscovery"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.net.nsd.NsdManager r1 = (android.net.nsd.NsdManager) r1
            sp0.z r3 = new sp0.z
            r3.<init>(r8, r0)
            java.util.Map<sp0.b0$b, android.net.nsd.NsdManager$DiscoveryListener> r8 = r8.f63462d
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            r8.put(r0, r3)
            r1.discoverServices(r7, r2, r3)
            sl0.j r8 = new sl0.j
            r8.<init>(r5, r6, r7, r0)
            r6 = 30000(0x7530, double:1.4822E-319)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, r6)
            goto L_0x0139
        L_0x00ce:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            throw r6
        L_0x00d1:
            java.lang.String r7 = "stop"
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 == 0) goto L_0x0130
            java.util.Map<java.lang.String, sl0.l$a> r7 = r5.f63396g
            monitor-enter(r7)
            java.util.Map<java.lang.String, sl0.l$a> r0 = r5.f63396g     // Catch:{ all -> 0x012d }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x012d }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x012d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x012d }
        L_0x00e9:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x0101
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x012d }
            sl0.l$a r1 = (sl0.C22368l.C22369a) r1     // Catch:{ all -> 0x012d }
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f63400c     // Catch:{ all -> 0x012d }
            r2.set(r8)     // Catch:{ all -> 0x012d }
            sp0.b0 r2 = sp0.C22381b0.INSTANCE     // Catch:{ all -> 0x012d }
            r2.mo35522a(r1)     // Catch:{ all -> 0x012d }
            r2 = 0
            goto L_0x00e9
        L_0x0101:
            if (r2 == 0) goto L_0x010c
            java.lang.String r0 = "fail:task not found"
            java.lang.String r0 = r5.mo115109j(r0)     // Catch:{ all -> 0x012d }
            r6.mo109647a(r8, r0)     // Catch:{ all -> 0x012d }
        L_0x010c:
            android.net.wifi.WifiManager$MulticastLock r6 = r5.f63397h     // Catch:{ all -> 0x012d }
            if (r6 == 0) goto L_0x0124
            boolean r8 = r6.isHeld()     // Catch:{ Exception -> 0x011a }
            if (r8 == 0) goto L_0x0124
            r6.release()     // Catch:{ Exception -> 0x011a }
            goto L_0x0124
        L_0x011a:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x012d }
            java.lang.String r8 = "MicroMsg.JsApiOperateLocalServicesScan"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r6)     // Catch:{ all -> 0x012d }
        L_0x0124:
            java.util.Map<java.lang.String, sl0.l$a> r6 = r5.f63396g     // Catch:{ all -> 0x012d }
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch:{ all -> 0x012d }
            r6.clear()     // Catch:{ all -> 0x012d }
            monitor-exit(r7)     // Catch:{ all -> 0x012d }
            goto L_0x0139
        L_0x012d:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x012d }
            throw r6
        L_0x0130:
            java.lang.String r7 = "fail:invalid param"
            java.lang.String r7 = r5.mo115109j(r7)
            r6.mo109647a(r8, r7)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl0.C22368l.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public final String mo35503w(C82381f fVar, String str) {
        return fVar.getAppId() + "#" + str;
    }
}
