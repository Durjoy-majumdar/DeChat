package kl0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: kl0.b */
public class C88212b {

    /* renamed from: a */
    public static Map<String, C88213a> f255012a = new ConcurrentHashMap();

    /* renamed from: b */
    public static BroadcastReceiver f255013b;

    /* renamed from: c */
    public static boolean f255014c;

    /* renamed from: kl0.b$a */
    public static class C88213a {

        /* renamed from: a */
        public BluetoothAdapter f255015a;

        /* renamed from: b */
        public Map<String, JSONObject> f255016b = new ConcurrentHashMap();

        /* renamed from: c */
        public UUID[] f255017c = null;

        /* renamed from: d */
        public C88215b f255018d;

        /* renamed from: e */
        public volatile boolean f255019e = false;

        /* renamed from: f */
        public long f255020f = 0;

        /* renamed from: g */
        public Map<String, JSONObject> f255021g = new ConcurrentHashMap();

        /* renamed from: h */
        public BluetoothAdapter.LeScanCallback f255022h = new C88214a();

        /* renamed from: kl0.b$a$a */
        public class C88214a implements BluetoothAdapter.LeScanCallback {
            public C88214a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:67:0x01e0  */
            /* JADX WARNING: Removed duplicated region for block: B:89:0x004b A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onLeScan(android.bluetooth.BluetoothDevice r18, int r19, byte[] r20) {
                /*
                    r17 = this;
                    r1 = r17
                    r2 = r19
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r20)
                    java.lang.String r3 = "MicroMsg.BeaconManager"
                    if (r0 == 0) goto L_0x0013
                    java.lang.String r0 = "valueByte is null or nil"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    return
                L_0x0013:
                    java.util.Map<java.lang.String, kl0.b$a> r0 = kl0.C88212b.f255012a
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r4 = "handleScanDataV2, device: "
                    r0.append(r4)
                    r4 = r18
                    r0.append(r4)
                    java.lang.String r0 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                    rk0.m r0 = rk0.C89999m.m112593a(r20)
                    if (r0 != 0) goto L_0x0038
                    java.lang.String r0 = "handleScanDataV2, scanRecordCompat is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                    goto L_0x0252
                L_0x0038:
                    java.util.LinkedHashMap<java.lang.Integer, byte[]> r0 = r0.f258575c
                    if (r0 != 0) goto L_0x0043
                    java.lang.String r0 = "handleScanDataV2, id2ManufacturerData is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                    goto L_0x0252
                L_0x0043:
                    java.util.Collection r0 = r0.values()
                    java.util.Iterator r5 = r0.iterator()
                L_0x004b:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L_0x0252
                    java.lang.Object r0 = r5.next()
                    byte[] r0 = (byte[]) r0
                    if (r0 != 0) goto L_0x0060
                    java.lang.String r0 = "handleScanDataV2, manufacturerData is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                    goto L_0x0252
                L_0x0060:
                    int r6 = r0.length
                    r7 = 22
                    if (r7 < r6) goto L_0x006b
                    java.lang.String r0 = "handleManufacturerData, manufacturerData is too short"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                    goto L_0x004b
                L_0x006b:
                    r6 = 0
                    byte r8 = r0[r6]
                    r8 = r8 & 255(0xff, float:3.57E-43)
                    r9 = 21
                    r10 = 2
                    r11 = 1
                    if (r8 != r10) goto L_0x007e
                    byte r8 = r0[r11]
                    r8 = r8 & 255(0xff, float:3.57E-43)
                    if (r8 != r9) goto L_0x007e
                    r8 = 1
                    goto L_0x007f
                L_0x007e:
                    r8 = 0
                L_0x007f:
                    if (r8 == 0) goto L_0x004b
                    r8 = 16
                    byte[] r12 = new byte[r8]
                    java.lang.System.arraycopy(r0, r10, r12, r6, r8)
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r13 = 0
                L_0x008e:
                    if (r13 >= r8) goto L_0x00a5
                    byte r14 = r12[r13]
                    r14 = r14 & 255(0xff, float:3.57E-43)
                    if (r14 >= r8) goto L_0x009b
                    java.lang.String r15 = "0"
                    r10.append(r15)
                L_0x009b:
                    java.lang.String r14 = java.lang.Integer.toHexString(r14)
                    r10.append(r14)
                    int r13 = r13 + 1
                    goto L_0x008e
                L_0x00a5:
                    java.lang.String r10 = r10.toString()
                    java.util.Locale r12 = java.util.Locale.US
                    java.lang.String r10 = r10.toUpperCase(r12)
                    boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                    if (r12 == 0) goto L_0x00bb
                    java.lang.String r0 = "handleManufacturerData, hexString is null, err"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    goto L_0x004b
                L_0x00bb:
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    r13 = 8
                    java.lang.String r14 = r10.substring(r6, r13)
                    r12.append(r14)
                    java.lang.String r14 = "-"
                    r12.append(r14)
                    r15 = 12
                    java.lang.String r13 = r10.substring(r13, r15)
                    r12.append(r13)
                    r12.append(r14)
                    java.lang.String r13 = r10.substring(r15, r8)
                    r12.append(r13)
                    r12.append(r14)
                    r13 = 20
                    java.lang.String r8 = r10.substring(r8, r13)
                    r12.append(r8)
                    r12.append(r14)
                    r8 = 32
                    java.lang.String r8 = r10.substring(r13, r8)
                    r12.append(r8)
                    java.lang.String r8 = r12.toString()
                    java.lang.Object[] r10 = new java.lang.Object[r11]
                    r10[r6] = r8
                    java.lang.String r12 = "handleManufacturerData, strUuid %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r10)
                    java.util.UUID r8 = java.util.UUID.fromString(r8)
                    kl0.b$a r10 = kl0.C88212b.C88213a.this
                    java.util.UUID[] r10 = r10.f255017c
                    int r12 = r10.length
                    r14 = 0
                L_0x0110:
                    if (r14 >= r12) goto L_0x011f
                    r15 = r10[r14]
                    boolean r15 = r15.equals(r8)
                    if (r15 == 0) goto L_0x011c
                    r10 = 1
                    goto L_0x0120
                L_0x011c:
                    int r14 = r14 + 1
                    goto L_0x0110
                L_0x011f:
                    r10 = 0
                L_0x0120:
                    if (r10 != 0) goto L_0x0129
                    java.lang.String r0 = "handleManufacturerData, not found beacon!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                    goto L_0x004b
                L_0x0129:
                    r10 = 18
                    byte r10 = r0[r10]
                    r10 = r10 & 255(0xff, float:3.57E-43)
                    int r10 = r10 * 256
                    r12 = 19
                    byte r12 = r0[r12]
                    r12 = r12 & 255(0xff, float:3.57E-43)
                    int r10 = r10 + r12
                    byte r12 = r0[r13]
                    r12 = r12 & 255(0xff, float:3.57E-43)
                    int r12 = r12 * 256
                    byte r9 = r0[r9]
                    r9 = r9 & 255(0xff, float:3.57E-43)
                    int r12 = r12 + r9
                    byte r0 = r0[r7]
                    double r13 = (double) r2
                    r15 = 0
                    int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r7 != 0) goto L_0x0150
                    r13 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                L_0x014e:
                    r0 = r12
                    goto L_0x0179
                L_0x0150:
                    r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    double r13 = r13 * r15
                    double r6 = (double) r0
                    double r13 = r13 / r6
                    int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0161
                    r6 = 4621819117588971520(0x4024000000000000, double:10.0)
                    double r13 = java.lang.Math.pow(r13, r6)
                    goto L_0x014e
                L_0x0161:
                    r6 = 4606470219554945038(0x3fed784230fcf80e, double:0.92093)
                    r0 = r12
                    r11 = 4621789619011412243(0x4023e52bd3c36113, double:9.9476)
                    double r11 = java.lang.Math.pow(r13, r11)
                    double r11 = r11 * r6
                    r6 = 4603128458559443582(0x3fe198f1d3ed527e, double:0.54992)
                    double r13 = r11 + r6
                L_0x0179:
                    java.lang.String r6 = r18.getAddress()
                    org.json.JSONObject r7 = new org.json.JSONObject
                    r7.<init>()
                    java.lang.String r11 = "uuid"
                    r7.put(r11, r8)     // Catch:{ JSONException -> 0x01c4 }
                    java.lang.String r8 = "major"
                    r7.put(r8, r10)     // Catch:{ JSONException -> 0x01c4 }
                    java.lang.String r8 = "minor"
                    r7.put(r8, r0)     // Catch:{ JSONException -> 0x01c4 }
                    java.lang.String r0 = "proximity"
                    r8 = 0
                    r7.put(r0, r8)     // Catch:{ JSONException -> 0x01c4 }
                    java.lang.String r0 = "accuracy"
                    r7.put(r0, r13)     // Catch:{ JSONException -> 0x01c4 }
                    java.lang.String r0 = "rssi"
                    r7.put(r0, r2)     // Catch:{ JSONException -> 0x01c4 }
                    kl0.b$a r0 = kl0.C88212b.C88213a.this     // Catch:{ JSONException -> 0x01c4 }
                    java.util.Map<java.lang.String, org.json.JSONObject> r0 = r0.f255016b     // Catch:{ JSONException -> 0x01c4 }
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ JSONException -> 0x01c4 }
                    r0.put(r6, r7)     // Catch:{ JSONException -> 0x01c4 }
                    kl0.b$a r0 = kl0.C88212b.C88213a.this     // Catch:{ JSONException -> 0x01c4 }
                    java.util.Map<java.lang.String, org.json.JSONObject> r0 = r0.f255021g     // Catch:{ JSONException -> 0x01c4 }
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ JSONException -> 0x01c4 }
                    r0.put(r6, r7)     // Catch:{ JSONException -> 0x01c4 }
                    java.lang.String r0 = "handleManufacturerData, found device ibeacon %s"
                    r6 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x01c2 }
                    r6 = 0
                    r8[r6] = r7     // Catch:{ JSONException -> 0x01c4 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r8)     // Catch:{ JSONException -> 0x01c4 }
                    goto L_0x01d0
                L_0x01c2:
                    r0 = move-exception
                    goto L_0x01c6
                L_0x01c4:
                    r0 = move-exception
                    r6 = 1
                L_0x01c6:
                    java.lang.Object[] r7 = new java.lang.Object[r6]
                    r6 = 0
                    r7[r6] = r0
                    java.lang.String r0 = "handleManufacturerData, put JSON data error : %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r7)
                L_0x01d0:
                    long r6 = java.lang.System.currentTimeMillis()
                    kl0.b$a r0 = kl0.C88212b.C88213a.this
                    long r10 = r0.f255020f
                    long r10 = r6 - r10
                    r12 = 500(0x1f4, double:2.47E-321)
                    int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r8 <= 0) goto L_0x004b
                    kl0.b$a$b r8 = r0.f255018d
                    if (r8 == 0) goto L_0x0245
                    java.util.Map<java.lang.String, org.json.JSONObject> r0 = r0.f255021g
                    kl0.d$a r8 = (kl0.C88216d.C88217a) r8
                    r9 = 1
                    java.lang.Object[] r10 = new java.lang.Object[r9]
                    r11 = 0
                    r10[r11] = r0
                    java.lang.String r11 = "MicroMsg.JsApiStartBeaconDiscovery"
                    java.lang.String r12 = "found device ibeacon %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r10)
                    org.json.JSONArray r10 = new org.json.JSONArray
                    r10.<init>()
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.util.Collection r0 = r0.values()
                    java.util.Iterator r0 = r0.iterator()
                L_0x0204:
                    boolean r12 = r0.hasNext()
                    if (r12 == 0) goto L_0x0217
                    java.lang.Object r12 = r0.next()
                    org.json.JSONObject r12 = (org.json.JSONObject) r12
                    if (r12 != 0) goto L_0x0213
                    goto L_0x0204
                L_0x0213:
                    r10.put(r12)
                    goto L_0x0204
                L_0x0217:
                    org.json.JSONObject r12 = new org.json.JSONObject
                    r12.<init>()
                    java.lang.String r0 = "beacons"
                    r12.put(r0, r10)     // Catch:{ JSONException -> 0x0222 }
                    goto L_0x022f
                L_0x0222:
                    r0 = move-exception
                    r9 = 1
                    java.lang.Object[] r9 = new java.lang.Object[r9]
                    r10 = 0
                    r9[r10] = r0
                    java.lang.String r0 = "put res JSON data error : %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r9)
                L_0x022f:
                    kl0.d$d r0 = r8.f255026a
                    com.tencent.mm.plugin.appbrand.jsapi.f r8 = r8.f255028c
                    int r9 = r8.getComponentId()
                    r0.mo115161k(r8)
                    r0.f242409h = r9
                    java.lang.String r8 = r12.toString()
                    r0.f242407f = r8
                    r0.mo115158h()
                L_0x0245:
                    kl0.b$a r0 = kl0.C88212b.C88213a.this
                    r0.f255020f = r6
                    java.util.Map<java.lang.String, org.json.JSONObject> r0 = r0.f255021g
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    r0.clear()
                    goto L_0x004b
                L_0x0252:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kl0.C88212b.C88213a.C88214a.onLeScan(android.bluetooth.BluetoothDevice, int, byte[]):void");
            }
        }

        /* renamed from: kl0.b$a$b */
        public interface C88215b {
        }

        public C88213a() {
            BluetoothManager bluetoothManager = (BluetoothManager) MMApplicationContext.getContext().getSystemService("bluetooth");
            if (bluetoothManager == null) {
                Log.m105920e("MicroMsg.BeaconManager", "bluetoothManager is null!");
                return;
            }
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            this.f255015a = adapter;
            if (adapter == null) {
                Log.m105920e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
            } else {
                C88212b.f255014c = adapter.isEnabled();
            }
        }

        /* renamed from: a */
        public boolean mo122579a() {
            boolean z;
            Log.m105925i("MicroMsg.BeaconManager", "BeaconWorker:%d stop", Integer.valueOf(hashCode()));
            synchronized (this) {
                z = this.f255019e;
            }
            if (!z) {
                Log.m105925i("MicroMsg.BeaconManager", "BeaconWorker:%d, already stop", Integer.valueOf(hashCode()));
                return false;
            }
            ((ConcurrentHashMap) this.f255016b).clear();
            this.f255015a.stopLeScan(this.f255022h);
            this.f255019e = false;
            return true;
        }
    }

    /* renamed from: a */
    public static void m109866a(String str) {
        ((ConcurrentHashMap) f255012a).remove(str);
        Log.m105925i("MicroMsg.BeaconManager", "remove Beacon appid:%s", str);
        if (((ConcurrentHashMap) f255012a).size() == 0 && f255013b != null) {
            Log.m105924i("MicroMsg.BeaconManager", "bluetoothStateListener uninit");
            MMApplicationContext.getContext().unregisterReceiver(f255013b);
            f255013b = null;
        }
    }
}
