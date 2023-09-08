package p1210qc;

import a70.C112760b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.map.geolocation.sapp.TencentLocationManager;
import com.tencent.map.geolocation.sapp.TencentLocationRequest;
import com.tencent.map.geolocation.sapp.TencentLocationUtils;
import com.tencent.map.geolocation.sapp.internal.LocationLogCallback;
import com.tencent.map.geolocation.sapp.internal.TencentExtraKeys;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82588f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import js0.C88024r;
import ms0.C88840a;
import p156gj.C87203t;
import zt3.C119157j;

/* renamed from: qc.a */
public class C118170a implements C88840a {

    /* renamed from: d */
    public volatile TencentLocationManager f353273d;

    /* renamed from: e */
    public TencentLocation f353274e = null;

    /* renamed from: f */
    public long f353275f = 0;

    /* renamed from: g */
    public int f353276g = 0;

    /* renamed from: h */
    public String f353277h = "";

    /* renamed from: i */
    public final List<C88840a.C88842b> f353278i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List<C88840a.C88842b> f353279j = new CopyOnWriteArrayList();

    /* renamed from: n */
    public final List<C88840a.C88842b> f353280n = new CopyOnWriteArrayList();

    /* renamed from: o */
    public final List<C88840a.C88842b> f353281o = new CopyOnWriteArrayList();

    /* renamed from: p */
    public TencentLocationListener f353282p = new C118172b();

    /* renamed from: q */
    public Set<String> f353283q = new HashSet();

    /* renamed from: r */
    public Runnable f353284r = new C118174c();

    /* renamed from: qc.a$a */
    public class C118171a implements LocationLogCallback {
        public C118171a(C118170a aVar) {
        }

        public void onLog(int i, String str, String str2, Throwable th) {
            if (i == 2) {
                Log.m105927v("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 3) {
                Log.m105919d("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 4) {
                Log.m105925i("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 5) {
                Log.m105929w("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 6) {
                Object[] objArr = new Object[3];
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = th != null ? th.getMessage() : "";
                Log.m105921e("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s th:%s", objArr);
            }
        }
    }

    /* renamed from: qc.a$b */
    public class C118172b implements TencentLocationListener {

        /* renamed from: qc.a$b$a */
        public class C118173a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TencentLocationListener f353286d;

            /* renamed from: e */
            public final /* synthetic */ TencentLocation f353287e;

            /* renamed from: f */
            public final /* synthetic */ int f353288f;

            /* renamed from: g */
            public final /* synthetic */ String f353289g;

            public C118173a(C118172b bVar, TencentLocationListener tencentLocationListener, TencentLocation tencentLocation, int i, String str) {
                this.f353286d = tencentLocationListener;
                this.f353287e = tencentLocation;
                this.f353288f = i;
                this.f353289g = str;
            }

            public void run() {
                this.f353286d.onLocationChanged(this.f353287e, this.f353288f, this.f353289g);
            }
        }

        public C118172b() {
        }

        public void onLocationChanged(TencentLocation tencentLocation, int i, String str) {
            if (MMHandlerThread.isMainThread()) {
                ((C119157j) C119157j.f356862d).mo183876g(new C118173a(this, this, tencentLocation, i, str), "MicroMsg.DefaultTencentLocationManager");
                return;
            }
            Log.m105927v("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s", Integer.valueOf(i), str);
            if (i != 0) {
                Log.m105921e("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s", Integer.valueOf(i), str);
            }
            List<C88840a.C88842b> list = C118170a.this.f353279j;
            if (list != null && ((CopyOnWriteArrayList) list).size() > 0) {
                C118170a aVar = C118170a.this;
                C118170a.m166717a(aVar, aVar.f353279j, i, str, aVar.mo182974d(tencentLocation, false));
                ((CopyOnWriteArrayList) C118170a.this.f353279j).clear();
            }
            List<C88840a.C88842b> list2 = C118170a.this.f353278i;
            if (list2 != null && ((CopyOnWriteArrayList) list2).size() > 0) {
                C118170a aVar2 = C118170a.this;
                C118170a.m166717a(aVar2, aVar2.f353278i, i, str, aVar2.mo182974d(tencentLocation, true));
                ((CopyOnWriteArrayList) C118170a.this.f353278i).clear();
            }
            List<C88840a.C88842b> list3 = C118170a.this.f353281o;
            if (list3 != null && ((CopyOnWriteArrayList) list3).size() > 0) {
                C118170a aVar3 = C118170a.this;
                C118170a.m166717a(aVar3, aVar3.f353281o, i, str, aVar3.mo182974d(tencentLocation, false));
            }
            List<C88840a.C88842b> list4 = C118170a.this.f353280n;
            if (list4 != null && ((CopyOnWriteArrayList) list4).size() > 0) {
                C118170a aVar4 = C118170a.this;
                C118170a.m166717a(aVar4, aVar4.f353280n, i, str, aVar4.mo182974d(tencentLocation, true));
            }
            C118170a aVar5 = C118170a.this;
            aVar5.f353274e = tencentLocation;
            aVar5.f353275f = System.currentTimeMillis();
            C118170a aVar6 = C118170a.this;
            aVar6.f353276g = i;
            aVar6.f353277h = str;
            aVar6.mo182975f();
        }

        public void onStatusUpdate(String str, int i, String str2) {
            Log.m105925i("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]name:%s, status:%d, desc:%s", str, Integer.valueOf(i), str2);
        }
    }

    /* renamed from: qc.a$c */
    public class C118174c implements Runnable {
        public C118174c() {
        }

        public void run() {
            List<C88840a.C88842b> list = C118170a.this.f353278i;
            if (list != null && ((CopyOnWriteArrayList) list).size() > 0) {
                C118170a aVar = C118170a.this;
                C118170a.m166717a(aVar, aVar.f353278i, -1, "timeout", (C88840a.C88841a) null);
            }
            List<C88840a.C88842b> list2 = C118170a.this.f353279j;
            if (list2 != null && ((CopyOnWriteArrayList) list2).size() > 0) {
                C118170a aVar2 = C118170a.this;
                C118170a.m166717a(aVar2, aVar2.f353279j, -1, "timeout", (C88840a.C88841a) null);
            }
        }
    }

    public C118170a() {
        Log.m105925i("MicroMsg.DefaultTencentLocationManager", "DefaultTencentLocationManager() construct in process %s", MMApplicationContext.getProcessName());
    }

    /* renamed from: a */
    public static void m166717a(C118170a aVar, List list, int i, String str, C88840a.C88841a aVar2) {
        aVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C88840a.C88842b bVar = (C88840a.C88842b) it.next();
            if (bVar != null) {
                bVar.mo114898f(i, str, aVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean Cb0(java.lang.String r6, ms0.C88840a.C88842b r7, android.os.Bundle r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "MicroMsg.DefaultTencentLocationManager"
            java.lang.String r1 = "[registerLocation]type:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x010a }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "wgs84"
            boolean r6 = r0.equals(r6)     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x004e
            java.util.List<ms0.a$b> r6 = r5.f353280n     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x010a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x010a }
        L_0x001e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x010a }
            ms0.a$b r0 = (ms0.C88840a.C88842b) r0     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x001e
            java.lang.String r6 = "MicroMsg.DefaultTencentLocationManager"
            java.lang.String r7 = "already register"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r7)     // Catch:{ all -> 0x010a }
            monitor-exit(r5)
            return r4
        L_0x003b:
            java.util.List<ms0.a$b> r6 = r5.f353280n     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x010a }
            r6.add(r7)     // Catch:{ all -> 0x010a }
            java.util.List<ms0.a$b> r6 = r5.f353280n     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x010a }
            int r6 = r6.size()     // Catch:{ all -> 0x010a }
            if (r6 <= r2) goto L_0x0086
            monitor-exit(r5)
            return r2
        L_0x004e:
            java.util.List<ms0.a$b> r6 = r5.f353281o     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x010a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x010a }
        L_0x0056:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x010a }
            ms0.a$b r0 = (ms0.C88840a.C88842b) r0     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0056
            java.lang.String r6 = "MicroMsg.DefaultTencentLocationManager"
            java.lang.String r7 = "already register"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r7)     // Catch:{ all -> 0x010a }
            monitor-exit(r5)
            return r4
        L_0x0073:
            java.util.List<ms0.a$b> r6 = r5.f353281o     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x010a }
            r6.add(r7)     // Catch:{ all -> 0x010a }
            java.util.List<ms0.a$b> r6 = r5.f353281o     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x010a }
            int r6 = r6.size()     // Catch:{ all -> 0x010a }
            if (r6 <= r2) goto L_0x0086
            monitor-exit(r5)
            return r2
        L_0x0086:
            if (r8 == 0) goto L_0x009c
            java.lang.String r6 = "smallAppKey"
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x010a }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x0095
            goto L_0x009c
        L_0x0095:
            java.util.Set<java.lang.String> r7 = r5.f353283q     // Catch:{ all -> 0x010a }
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ all -> 0x010a }
            r7.add(r6)     // Catch:{ all -> 0x010a }
        L_0x009c:
            if (r8 == 0) goto L_0x00a8
            java.lang.String r6 = "enableIndoor"
            boolean r6 = r8.getBoolean(r6)     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00a8
            r6 = 1
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            java.util.List<ms0.a$b> r7 = r5.f353280n     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ all -> 0x010a }
            int r7 = r7.size()     // Catch:{ all -> 0x010a }
            java.util.List<ms0.a$b> r0 = r5.f353281o     // Catch:{ all -> 0x010a }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x010a }
            int r0 = r0.size()     // Catch:{ all -> 0x010a }
            int r7 = r7 + r0
            if (r7 != r2) goto L_0x00be
            r7 = 1
            goto L_0x00bf
        L_0x00be:
            r7 = 0
        L_0x00bf:
            if (r7 != 0) goto L_0x00c3
            if (r6 == 0) goto L_0x0108
        L_0x00c3:
            com.tencent.map.geolocation.sapp.TencentLocationRequest r7 = com.tencent.map.geolocation.sapp.TencentLocationRequest.create()     // Catch:{ all -> 0x010a }
            r7.setIndoorLocationMode(r6)     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00cf
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00d1
        L_0x00cf:
            r0 = 2000(0x7d0, double:9.88E-321)
        L_0x00d1:
            r7.setInterval(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r6 = r5.mo182973c()     // Catch:{ all -> 0x010a }
            r7.setSmallAppKey(r6)     // Catch:{ all -> 0x010a }
            java.lang.String r6 = p156gj.C87203t.m108266b()     // Catch:{ all -> 0x010a }
            r7.setAndroidId(r6)     // Catch:{ all -> 0x010a }
            java.lang.String r6 = "openId"
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x010a }
            r7.setOpenId(r6)     // Catch:{ all -> 0x010a }
            com.tencent.map.geolocation.sapp.TencentLocationManager r6 = r5.mo182972b()     // Catch:{ all -> 0x010a }
            com.tencent.map.geolocation.sapp.TencentLocationListener r8 = r5.f353282p     // Catch:{ all -> 0x010a }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x010a }
            int r6 = r6.requestLocationUpdates(r7, r8, r0)     // Catch:{ all -> 0x010a }
            java.lang.String r7 = "MicroMsg.DefaultTencentLocationManager"
            java.lang.String r8 = "requestCode %d"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x010a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x010a }
            r0[r4] = r6     // Catch:{ all -> 0x010a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)     // Catch:{ all -> 0x010a }
        L_0x0108:
            monitor-exit(r5)
            return r2
        L_0x010a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1210qc.C118170a.Cb0(java.lang.String, ms0.a$b, android.os.Bundle):boolean");
    }

    /* renamed from: M9 */
    public void mo123224M9(String str, C88840a.C88842b bVar, Bundle bundle) {
        String str2;
        String str3;
        String str4 = str;
        C88840a.C88842b bVar2 = bVar;
        Bundle bundle2 = bundle;
        boolean equals = "wgs84".equals(str4);
        boolean z = bundle2.getBoolean("enableIndoor");
        boolean z2 = bundle2.getBoolean("isHighAccuracy", false);
        int i = bundle2.getInt("highAccuracyExpireTime", 3000);
        boolean z3 = bundle2.getBoolean("useCache", false);
        if (!z3 || this.f353274e == null) {
            if (this.f353274e != null) {
                str2 = "MicroMsg.DefaultTencentLocationManager";
                if (System.currentTimeMillis() - this.f353275f >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    str3 = str2;
                }
            } else {
                str3 = "MicroMsg.DefaultTencentLocationManager";
            }
            if ("wgs84".equals(str4)) {
                ((CopyOnWriteArrayList) this.f353278i).add(bVar2);
                if (((CopyOnWriteArrayList) this.f353278i).size() > 1) {
                    return;
                }
            } else {
                ((CopyOnWriteArrayList) this.f353279j).add(bVar2);
                if (((CopyOnWriteArrayList) this.f353279j).size() > 1) {
                    return;
                }
            }
            C88024r.m109571a().removeCallbacks(this.f353284r);
            C88024r.m109571a().mo122468a(this.f353284r, 20000);
            TencentLocationRequest create = TencentLocationRequest.create();
            create.setInterval(2000);
            create.setIndoorLocationMode(z);
            create.setSmallAppKey(bundle2.getString("smallAppKey"));
            create.setmExpirationTime((long) i);
            create.setAndroidId(C87203t.m108266b());
            create.setOpenId(bundle2.getString("openId"));
            int requestSingleFreshLocation = mo182972b().requestSingleFreshLocation(create, this.f353282p, Looper.getMainLooper(), z2);
            Log.m105919d(str3, "MapReport:%s getLocation openId:%s", bundle2.getString("smallAppKey"), bundle2.getString("openId"));
            Log.m105925i(str3, "enableIndoor:%b isHighAccuracy:%b highAccuracyExpireTime:%d useCache:%b requestCode %d", Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Boolean.valueOf(z3), Integer.valueOf(requestSingleFreshLocation));
            return;
        }
        str2 = "MicroMsg.DefaultTencentLocationManager";
        Log.m105925i(str2, "useCache enableIndoor:%b isHighAccuracy:%b highAccuracyExpireTime:%d", Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i));
        bVar2.mo114898f(this.f353276g, this.f353277h, mo182974d(this.f353274e, equals));
    }

    /* renamed from: a6 */
    public synchronized boolean mo123225a6(String str, C88840a.C88842b bVar, Bundle bundle) {
        Log.m105925i("MicroMsg.DefaultTencentLocationManager", "[unregisterLocation]type:%s", str);
        if ("wgs84".equals(str)) {
            ((CopyOnWriteArrayList) this.f353280n).remove(bVar);
        } else {
            ((CopyOnWriteArrayList) this.f353281o).remove(bVar);
        }
        if (bundle != null) {
            ((HashSet) this.f353283q).remove(bundle.getString("smallAppKey"));
        }
        mo182975f();
        return false;
    }

    /* renamed from: b */
    public TencentLocationManager mo182972b() {
        if (this.f353273d == null) {
            synchronized (this) {
                if (this.f353273d == null) {
                    if (C82588f0.f241713s != null) {
                        C82588f0.f241713s.booleanValue();
                    } else {
                        C82588f0.f241713s = Boolean.FALSE;
                        C82588f0.f241713s.booleanValue();
                    }
                    if (C82588f0.f241713s.booleanValue()) {
                        Uri n = C116299g2.m163858n(C86013q1.m106448i(C112760b.m154195C() + "/lbs" + MMApplicationContext.getProcessName().substring(MMApplicationContext.getPackageName().length() + 1), true));
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        try {
                            TencentExtraKeys.setTencentLog(MMApplicationContext.getContext(), new File(C86013q1.m106448i(C116299g2.m163865u(n), true)));
                        } catch (Exception e) {
                            Log.printInfoStack("MicroMsg.DefaultTencentLocationManager", "", e);
                        }
                    }
                    TencentExtraKeys.setContext(MMApplicationContext.getContext());
                    try {
                        TencentExtraKeys.setTencentLogCallback(new C118171a(this));
                    } catch (Exception e2) {
                        Log.printInfoStack("MicroMsg.DefaultTencentLocationManager", "", e2);
                    }
                    if (TextUtils.isEmpty("")) {
                        this.f353273d = TencentLocationManager.getInstance(MMApplicationContext.getContext());
                    } else {
                        this.f353273d = TencentLocationManager.getInstance(MMApplicationContext.getContext(), new Pair(TencentLocationManager.TYPE_OAID, ""));
                    }
                    this.f353273d.setCoordinateType(0);
                    Log.m105925i("MicroMsg.DefaultTencentLocationManager", "%s Location Sdk Version %s", "", this.f353273d.getVersion());
                }
            }
        }
        return this.f353273d;
    }

    /* renamed from: c */
    public final String mo182973c() {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((HashSet) this.f353283q).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        Log.m105919d("MicroMsg.DefaultTencentLocationManager", "MapReport reportMsg:%s", sb.toString());
        return sb.toString();
    }

    /* renamed from: d */
    public final C88840a.C88841a mo182974d(TencentLocation tencentLocation, boolean z) {
        C88840a.C88841a aVar = new C88840a.C88841a();
        if (z) {
            aVar.f256263a = tencentLocation.getLatitude();
            aVar.f256264b = tencentLocation.getLongitude();
            aVar.f256274l = "wgs84";
        } else {
            double[] dArr = new double[2];
            TencentLocationUtils.wgs84ToGcj02(new double[]{tencentLocation.getLatitude(), tencentLocation.getLongitude()}, dArr);
            aVar.f256263a = dArr[0];
            aVar.f256264b = dArr[1];
            aVar.f256274l = "gcj02";
        }
        String str = "gps";
        if (!str.equals(tencentLocation.getProvider())) {
            str = "network";
        }
        aVar.f256265c = str;
        aVar.f256266d = (double) tencentLocation.getSpeed();
        aVar.f256267e = (double) tencentLocation.getAccuracy();
        aVar.f256268f = tencentLocation.getAltitude();
        aVar.f256271i = tencentLocation.getIndoorLocationType();
        aVar.f256272j = tencentLocation.getBearing();
        if (tencentLocation.getExtra() != null) {
            aVar.f256273k = tencentLocation.getExtra().getDouble("steps");
        }
        Log.m105927v("MicroMsg.DefaultTencentLocationManager", "buildingId:%s floorName:%s steps:%f", tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), Double.valueOf(aVar.f256273k));
        if (!Util.isNullOrNil(tencentLocation.getIndoorBuildingId())) {
            aVar.f256269g = tencentLocation.getIndoorBuildingId();
            aVar.f256270h = tencentLocation.getIndoorBuildingFloor();
        } else {
            aVar.f256269g = "";
            aVar.f256270h = "";
        }
        return aVar;
    }

    /* renamed from: f */
    public final void mo182975f() {
        if (((CopyOnWriteArrayList) this.f353279j).size() <= 0 && ((CopyOnWriteArrayList) this.f353278i).size() <= 0 && ((CopyOnWriteArrayList) this.f353280n).size() <= 0 && ((CopyOnWriteArrayList) this.f353281o).size() <= 0) {
            Log.m105924i("MicroMsg.DefaultTencentLocationManager", "releaseLocationManager");
            mo182972b().removeUpdates((TencentLocationListener) null);
        }
    }
}
