package rk0;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kk0.C88204p;
import mk0.C88736a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89689d;
import qk0.C89695j;
import qk0.C89696k;

/* renamed from: rk0.c */
public class C89983c {

    /* renamed from: a */
    public final String f258545a = ("MicroMsg.Ble.BleScanWorker#" + hashCode());

    /* renamed from: b */
    public final Context f258546b;

    /* renamed from: c */
    public C89998l f258547c;

    /* renamed from: d */
    public Map<String, C89689d> f258548d;

    /* renamed from: e */
    public final AtomicBoolean f258549e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f258550f = new AtomicBoolean(false);

    /* renamed from: g */
    public final Handler f258551g = new Handler();

    /* renamed from: h */
    public List<C89689d> f258552h;

    /* renamed from: i */
    public final Runnable f258553i = new C89984a();

    /* renamed from: j */
    public BroadcastReceiver f258554j;

    /* renamed from: k */
    public volatile C89987d f258555k = null;

    /* renamed from: l */
    public final Runnable f258556l = new C89985b();

    /* renamed from: m */
    public int f258557m = -1;

    /* renamed from: n */
    public volatile C89997j f258558n = C89995h.f258572a;

    /* renamed from: o */
    public volatile C89695j f258559o;

    /* renamed from: rk0.c$a */
    public class C89984a implements Runnable {
        public C89984a() {
        }

        public void run() {
            ArrayList arrayList;
            if (C89983c.this.f258549e.get()) {
                synchronized (C89983c.this) {
                    arrayList = new ArrayList(C89983c.this.f258552h);
                    ((ArrayList) C89983c.this.f258552h).clear();
                }
                C89695j jVar = C89983c.this.f258559o;
                if (jVar != null && arrayList.size() > 0) {
                    C82381f fVar = ((C88204p.C88206b) jVar).f255008a;
                    if (fVar == null) {
                        Log.m105920e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray.put(((C89689d) it.next()).mo124015a());
                            } catch (JSONException e) {
                                Log.m105921e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e);
                            }
                        }
                        C88204p.C88207c cVar = new C88204p.C88207c();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.remove("devices");
                            jSONObject.put("devices", jSONArray);
                        } catch (JSONException e2) {
                            Log.m105921e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", e2);
                        }
                        int componentId = fVar.getComponentId();
                        cVar.mo115161k(fVar);
                        cVar.f242409h = componentId;
                        cVar.f242407f = jSONObject.toString();
                        cVar.mo115158h();
                        Log.m105925i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothDeviceFoundEvent %s", jSONObject.toString());
                    }
                }
                C89983c cVar2 = C89983c.this;
                cVar2.f258551g.postDelayed(cVar2.f258553i, (long) C88736a.m110767a().f256126a);
            }
        }
    }

    /* renamed from: rk0.c$b */
    public class C89985b implements Runnable {
        public C89985b() {
        }

        public void run() {
            Log.m105924i(C89983c.this.f258545a, "run#mScanWorkaroundTask");
            C89987d dVar = C89983c.this.f258555k;
            if (C89983c.this.f258549e.get() && dVar != null) {
                Log.m105924i(C89983c.this.f258545a, "run#mScanWorkaroundTask, stopBleScan");
                C89696k kVar = C89696k.f257968e;
                if (C89983c.this.mo124310d().f257988a == 0) {
                    synchronized (C89983c.this) {
                        Log.m105924i(C89983c.this.f258545a, "run#mScanWorkaroundTask, startBleScanLocked");
                        C89983c cVar = C89983c.this;
                        C89687b bVar = C89987d.f258563d;
                        if (bVar != dVar.f258564a) {
                            dVar = new C89987d(bVar, dVar.f258565b, dVar.f258566c);
                        }
                        cVar.mo124309c(dVar);
                    }
                }
            }
        }
    }

    /* renamed from: rk0.c$c */
    public class C89986c extends BroadcastReceiver {
        public C89986c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                Log.m105924i(C89983c.this.f258545a, "Receive intent failed");
                return;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                int state = defaultAdapter.getState();
                Log.m105919d(C89983c.this.f258545a, "state:%d", Integer.valueOf(state));
                if (state != 12 && state != 11) {
                    if (state == 10 || state == 13) {
                        Log.m105925i(C89983c.this.f258545a, "bluetooth is disable, stop scan", new Object[0]);
                        C89983c.this.f258549e.set(false);
                        C89983c.this.mo124310d();
                    }
                }
            }
        }
    }

    /* renamed from: rk0.c$d */
    public static class C89987d {

        /* renamed from: d */
        public static final C89687b f258563d = new C89988a();

        /* renamed from: a */
        public final C89687b f258564a;

        /* renamed from: b */
        public List<ScanFilterCompat> f258565b;

        /* renamed from: c */
        public final C89695j f258566c;

        /* renamed from: rk0.c$d$a */
        public class C89988a implements C89687b {
            /* renamed from: a */
            public void mo114631a(C89696k kVar) {
            }
        }

        public C89987d(C89687b bVar, List<ScanFilterCompat> list, C89695j jVar) {
            this.f258564a = bVar;
            this.f258565b = list;
            this.f258566c = jVar;
        }
    }

    public C89983c(Context context) {
        this.f258546b = context;
    }

    /* renamed from: a */
    public static ScanSettingsCompat m112577a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(FirebaseAnalytics.C113379b.MEDIUM)) {
                    c = 0;
                    break;
                }
                break;
            case 107348:
                if (str.equals("low")) {
                    c = 1;
                    break;
                }
                break;
            case 3202466:
                if (str.equals("high")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new ScanSettingsCompat(1, 1, 0, (ScanSettingsCompat.C82259a) null);
            case 1:
                return new ScanSettingsCompat(0, 1, 0, (ScanSettingsCompat.C82259a) null);
            case 2:
                return new ScanSettingsCompat(2, 1, 0, (ScanSettingsCompat.C82259a) null);
            default:
                return m112577a(FirebaseAnalytics.C113379b.MEDIUM);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo124308b() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = r3.f258546b     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.f258545a     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "initBroadcaseListener, context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            return
        L_0x000e:
            android.content.BroadcastReceiver r0 = r3.f258554j     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r3.f258545a     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "bluetoothStateListener init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0030 }
            rk0.c$c r0 = new rk0.c$c     // Catch:{ all -> 0x0030 }
            r0.<init>()     // Catch:{ all -> 0x0030 }
            r3.f258554j = r0     // Catch:{ all -> 0x0030 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r0.<init>(r1)     // Catch:{ all -> 0x0030 }
            android.content.Context r1 = r3.f258546b     // Catch:{ all -> 0x0030 }
            android.content.BroadcastReceiver r2 = r3.f258554j     // Catch:{ all -> 0x0030 }
            r1.registerReceiver(r2, r0)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk0.C89983c.mo124308b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124309c(rk0.C89983c.C89987d r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Class<rk0.i> r2 = rk0.C89996i.class
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f258550f
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x028a
            rk0.l r3 = r0.f258547c
            if (r3 != 0) goto L_0x0014
            goto L_0x028a
        L_0x0014:
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f258549e
            boolean r3 = r3.get()
            r4 = 0
            if (r3 == 0) goto L_0x002e
            java.lang.String r2 = r0.f258545a
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r4 = "already scan"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r3)
            qk0.b r1 = r1.f258564a
            qk0.k r2 = qk0.C89696k.f257968e
            r1.mo114631a(r2)
            return
        L_0x002e:
            android.bluetooth.BluetoothAdapter r3 = sk0.C90216b.m112935d()
            if (r3 == 0) goto L_0x0279
            boolean r5 = sk0.C90216b.m112933b()
            if (r5 != 0) goto L_0x003c
            goto L_0x0279
        L_0x003c:
            mk0.a r5 = mk0.C88736a.m110767a()
            boolean r5 = r5.f256130e
            r6 = 0
            if (r5 == 0) goto L_0x0070
            ra.b r5 = p224ra.C89909e.m112436a(r2)
            rk0.i r5 = (rk0.C89996i) r5
            if (r5 != 0) goto L_0x004f
            rk0.g r5 = rk0.C36330g.f96695d
        L_0x004f:
            boolean r5 = r5.gx0()
            if (r5 == 0) goto L_0x0070
            java.lang.String r2 = r0.f258545a
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r4 = "startBleScanLocked, isScanningTooFrequently"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r3)
            qk0.k r2 = new qk0.k
            r3 = 10008(0x2718, float:1.4024E-41)
            fl0.c r4 = fl0.C86917b.f252281d
            java.lang.String r5 = "fail:system error, scanning too frequently"
            r2.<init>(r3, r5, r4, r6)
            qk0.b r1 = r1.f258564a
            r1.mo114631a(r2)
            return
        L_0x0070:
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            r8 = 1
            if (r5 < r7) goto L_0x00f5
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            int r5 = p385u2.C111105a.m151499a(r5, r7)
            if (r5 != 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 != 0) goto L_0x009c
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "android.permission.ACCESS_COARSE_LOCATION"
            int r5 = p385u2.C111105a.m151499a(r5, r7)
            if (r5 != 0) goto L_0x0096
            r5 = 1
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            if (r5 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r5 = 0
            goto L_0x009d
        L_0x009c:
            r5 = 1
        L_0x009d:
            java.lang.String r7 = r0.f258545a
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            r9[r4] = r10
            java.lang.String r10 = "checkLocationPermission :%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r9)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.LocationUtil.isGpsEnable()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.LocationUtil.isNetworkProviderEnable()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "isGPSEnable "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r11 = ", isNetworkEnable:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r12 = "MicroMsg.Ble.BleHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r11)
            if (r7 != 0) goto L_0x00db
            if (r9 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r7 = 0
            goto L_0x00dc
        L_0x00db:
            r7 = 1
        L_0x00dc:
            java.lang.String r9 = r0.f258545a
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r10[r4] = r7
            java.lang.String r7 = "checkGpsEnable:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r10)
            if (r5 != 0) goto L_0x00f5
            qk0.b r1 = r1.f258564a
            qk0.k r2 = qk0.C89696k.f257986w
            r1.mo114631a(r2)
            return
        L_0x00f5:
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f258549e
            r5.set(r8)
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat> r5 = r1.f258565b
            if (r5 == 0) goto L_0x011c
            int r5 = r5.size()
            if (r5 != 0) goto L_0x011c
            java.lang.String r5 = r0.f258545a
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat> r9 = r1.f258565b
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r4] = r9
            java.lang.String r9 = "scanFilterCompats size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r9, r7)
            r1.f258565b = r6
        L_0x011c:
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat> r5 = r1.f258565b
            mk0.a r7 = mk0.C88736a.m110767a()
            java.lang.String r7 = r7.f256128c
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat r7 = m112577a(r7)
            rk0.l r9 = r0.f258547c
            rk0.e$c r10 = rk0.C89990e.f258568a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "scanMode: "
            r10.append(r11)
            int r11 = r7.f241166d
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.ble.BleScannerCompat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            rk0.e$c r10 = rk0.C89990e.f258568a
            rk0.e$a r10 = (rk0.C89990e.C89991a) r10
            r10.getClass()
            if (r5 == 0) goto L_0x01a5
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = r5.size()
            r10.<init>(r12)
            java.util.Iterator r5 = r5.iterator()
        L_0x015b:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x01a6
            java.lang.Object r12 = r5.next()
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat) r12
            r12.getClass()
            android.bluetooth.le.ScanFilter$Builder r13 = new android.bluetooth.le.ScanFilter$Builder
            r13.<init>()
            java.lang.String r14 = r12.f241151d
            if (r14 == 0) goto L_0x0176
            r13.setDeviceName(r14)
        L_0x0176:
            android.os.ParcelUuid r14 = r12.f241153f
            if (r14 == 0) goto L_0x017f
            android.os.ParcelUuid r15 = r12.f241154g
            r13.setServiceUuid(r14, r15)
        L_0x017f:
            java.lang.String r14 = r12.f241152e
            if (r14 == 0) goto L_0x0186
            r13.setDeviceAddress(r14)
        L_0x0186:
            android.os.ParcelUuid r14 = r12.f241155h
            if (r14 == 0) goto L_0x0191
            byte[] r15 = r12.f241156i
            byte[] r8 = r12.f241157j
            r13.setServiceData(r14, r15, r8)
        L_0x0191:
            int r8 = r12.f241158n
            if (r8 >= 0) goto L_0x019c
            byte[] r14 = r12.f241159o
            byte[] r12 = r12.f241160p
            r13.setManufacturerData(r8, r14, r12)
        L_0x019c:
            android.bluetooth.le.ScanFilter r8 = r13.build()
            r10.add(r8)
            r8 = 1
            goto L_0x015b
        L_0x01a5:
            r10 = r6
        L_0x01a6:
            android.bluetooth.le.ScanSettings$Builder r5 = new android.bluetooth.le.ScanSettings$Builder
            r5.<init>()
            long r12 = r7.f241168f
            android.bluetooth.le.ScanSettings$Builder r5 = r5.setReportDelay(r12)
            int r7 = r7.f241166d
            android.bluetooth.le.ScanSettings$Builder r5 = r5.setScanMode(r7)
            android.bluetooth.le.ScanSettings r5 = r5.build()
            android.bluetooth.le.BluetoothLeScanner r7 = r3.getBluetoothLeScanner()
            if (r7 != 0) goto L_0x01c8
            java.lang.String r3 = "bluetoothscanner is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
            r3 = 0
            goto L_0x0214
        L_0x01c8:
            java.lang.String r7 = "[BluetoothTrace] start scan"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            java.lang.Throwable r7 = new java.lang.Throwable
            r7.<init>()
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r12 = "[BluetoothTrace] ble scan stacktrace"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r7, r12, r8)
            android.bluetooth.le.BluetoothLeScanner r16 = r3.getBluetoothLeScanner()
            u.i<rk0.l, rk0.e$b> r3 = rk0.C89990e.C89991a.f258569a
            java.lang.Object r6 = r3.getOrDefault(r9, r6)
            rk0.e$b r6 = (rk0.C89990e.C89992b) r6
            if (r6 == 0) goto L_0x01e8
            goto L_0x01f0
        L_0x01e8:
            rk0.e$b r6 = new rk0.e$b
            r6.<init>(r9)
            r3.put(r9, r6)
        L_0x01f0:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r6)
            r3.mo10233c(r5)
            r3.mo10233c(r10)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/appbrand/jsapi/bluetooth/sdk/scan/BleScanerCompat$API21BluetoothLeScannerCompatImpl"
            java.lang.String r19 = "startScan"
            java.lang.String r20 = "(Landroid/bluetooth/BluetoothAdapter;Ljava/util/List;Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/sdk/scan/ScanSettingsCompat;Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/sdk/scan/ScanCallbackCompat;)Z"
            java.lang.String r21 = "android/bluetooth/le/BluetoothLeScanner"
            java.lang.String r22 = "startScan"
            java.lang.String r23 = "(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V"
            j20.C117292a.m165364j(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 1
        L_0x0214:
            java.lang.String r5 = r0.f258545a
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r6[r4] = r7
            java.lang.String r4 = "startBleScan isOk:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r6)
            if (r3 == 0) goto L_0x0271
            qk0.j r3 = r1.f258566c
            r0.f258559o = r3
            mk0.a r3 = mk0.C88736a.m110767a()
            int r3 = r3.f256126a
            if (r3 <= 0) goto L_0x0241
            android.os.Handler r3 = r0.f258551g
            java.lang.Runnable r4 = r0.f258553i
            mk0.a r5 = mk0.C88736a.m110767a()
            int r5 = r5.f256126a
            long r5 = (long) r5
            r3.postDelayed(r4, r5)
        L_0x0241:
            mk0.a r3 = mk0.C88736a.m110767a()
            boolean r3 = r3.f256130e
            if (r3 == 0) goto L_0x0269
            ra.b r2 = p224ra.C89909e.m112436a(r2)
            rk0.i r2 = (rk0.C89996i) r2
            if (r2 != 0) goto L_0x0253
            rk0.g r2 = rk0.C36330g.f96695d
        L_0x0253:
            int r2 = r2.mo56171pa()
            r0.f258557m = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0269
            android.os.Handler r2 = r0.f258551g
            java.lang.Runnable r3 = r0.f258556l
            r4 = 1800000(0x1b7740, double:8.89318E-318)
            r2.postDelayed(r3, r4)
        L_0x0269:
            qk0.b r1 = r1.f258564a
            qk0.k r2 = qk0.C89696k.f257968e
            r1.mo114631a(r2)
            goto L_0x0278
        L_0x0271:
            qk0.b r1 = r1.f258564a
            qk0.k r2 = qk0.C89696k.f257977n
            r1.mo114631a(r2)
        L_0x0278:
            return
        L_0x0279:
            java.lang.String r2 = r0.f258545a
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r4 = "BluetoothAdapter is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r3)
            qk0.b r1 = r1.f258564a
            qk0.k r2 = qk0.C89696k.f257972i
            r1.mo114631a(r2)
            return
        L_0x028a:
            qk0.b r1 = r1.f258564a
            qk0.k r2 = qk0.C89696k.f257977n
            r1.mo114631a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk0.C89983c.mo124309c(rk0.c$d):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0091=Splitter:B:34:0x0091, B:38:0x009e=Splitter:B:38:0x009e} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized qk0.C89696k mo124310d() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f258550f     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x009e
            rk0.l r0 = r5.f258547c     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x000f
            goto L_0x009e
        L_0x000f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f258549e     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00a2 }
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = r5.f258545a     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "not scan"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r1)     // Catch:{ all -> 0x00a2 }
            qk0.k r0 = qk0.C89696k.f257968e     // Catch:{ all -> 0x00a2 }
            monitor-exit(r5)
            return r0
        L_0x0025:
            android.bluetooth.BluetoothAdapter r0 = sk0.C90216b.m112935d()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0091
            boolean r2 = sk0.C90216b.m112933b()     // Catch:{ all -> 0x00a2 }
            if (r2 != 0) goto L_0x0032
            goto L_0x0091
        L_0x0032:
            java.lang.String r2 = r5.f258545a     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "stopBleScan, stopScan"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.f258549e     // Catch:{ all -> 0x00a2 }
            r2.set(r1)     // Catch:{ all -> 0x00a2 }
            rk0.l r1 = r5.f258547c     // Catch:{ all -> 0x00a2 }
            rk0.e$c r2 = rk0.C89990e.f258568a     // Catch:{ all -> 0x00a2 }
            rk0.e$a r2 = (rk0.C89990e.C89991a) r2     // Catch:{ all -> 0x00a2 }
            r2.getClass()     // Catch:{ all -> 0x00a2 }
            u.i<rk0.l, rk0.e$b> r2 = rk0.C89990e.C89991a.f258569a     // Catch:{ all -> 0x00a2 }
            java.lang.Object r1 = r2.remove(r1)     // Catch:{ all -> 0x00a2 }
            rk0.e$b r1 = (rk0.C89990e.C89992b) r1     // Catch:{ all -> 0x00a2 }
            if (r1 != 0) goto L_0x0055
            goto L_0x006a
        L_0x0055:
            android.bluetooth.le.BluetoothLeScanner r2 = r0.getBluetoothLeScanner()     // Catch:{ all -> 0x00a2 }
            if (r2 != 0) goto L_0x0063
            java.lang.String r0 = "MicroMsg.ble.BleScannerCompat"
            java.lang.String r1 = "bluetoothscanner is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x00a2 }
            goto L_0x006a
        L_0x0063:
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()     // Catch:{ all -> 0x00a2 }
            r0.stopScan(r1)     // Catch:{ all -> 0x00a2 }
        L_0x006a:
            mk0.a r0 = mk0.C88736a.m110767a()     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.f256130e     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x008d
            java.lang.Class<rk0.i> r0 = rk0.C89996i.class
            ra.b r0 = p224ra.C89909e.m112436a(r0)     // Catch:{ all -> 0x00a2 }
            rk0.i r0 = (rk0.C89996i) r0     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x007e
            rk0.g r0 = rk0.C36330g.f96695d     // Catch:{ all -> 0x00a2 }
        L_0x007e:
            int r1 = r5.f258557m     // Catch:{ all -> 0x00a2 }
            r0.mo56170ja(r1)     // Catch:{ all -> 0x00a2 }
            r0 = -1
            r5.f258557m = r0     // Catch:{ all -> 0x00a2 }
            android.os.Handler r0 = r5.f258551g     // Catch:{ all -> 0x00a2 }
            java.lang.Runnable r1 = r5.f258556l     // Catch:{ all -> 0x00a2 }
            r0.removeCallbacks(r1)     // Catch:{ all -> 0x00a2 }
        L_0x008d:
            qk0.k r0 = qk0.C89696k.f257968e     // Catch:{ all -> 0x00a2 }
            monitor-exit(r5)
            return r0
        L_0x0091:
            java.lang.String r0 = r5.f258545a     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "BluetoothAdapter is null, err"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)     // Catch:{ all -> 0x00a2 }
            qk0.k r0 = qk0.C89696k.f257972i     // Catch:{ all -> 0x00a2 }
            monitor-exit(r5)
            return r0
        L_0x009e:
            qk0.k r0 = qk0.C89696k.f257971h     // Catch:{ all -> 0x00a2 }
            monitor-exit(r5)
            return r0
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk0.C89983c.mo124310d():qk0.k");
    }
}
