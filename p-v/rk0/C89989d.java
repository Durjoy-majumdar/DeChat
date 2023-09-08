package rk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: rk0.d */
public class C89989d extends C89998l {

    /* renamed from: a */
    public final /* synthetic */ C89983c f258567a;

    public C89989d(C89983c cVar) {
        this.f258567a = cVar;
    }

    /* renamed from: a */
    public void mo124314a(List<ScanResultCompat> list) {
    }

    /* renamed from: b */
    public void mo124315b(int i) {
        Log.m105921e(this.f258567a.f258545a, "[onScanResult]onScanFailed, errorCode:%d", Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (mk0.C88736a.m110767a().f256126a <= 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r8 = r7.f258567a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r9 = r7.f258567a.f258552h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r9 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        ((java.util.ArrayList) r9).add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r8 = r7.f258567a.f258559o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        r8 = ((kk0.C88204p.C88206b) r8).f255008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r8 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        r5 = new org.json.JSONArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r5.put(r4.mo124015a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124316c(int r8, com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L_0x00fe
            android.bluetooth.BluetoothDevice r1 = r9.mo114648a()
            if (r1 != 0) goto L_0x000b
            goto L_0x00fe
        L_0x000b:
            rk0.c r1 = r7.f258567a
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f258550f
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0021
            rk0.c r8 = r7.f258567a
            java.lang.String r8 = r8.f258545a
            java.lang.String r9 = "[onScanResult]not init, err"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r9, r0)
            return
        L_0x0021:
            rk0.c r1 = r7.f258567a
            monitor-enter(r1)
            rk0.c r2 = r7.f258567a     // Catch:{ all -> 0x00fb }
            java.util.Map<java.lang.String, qk0.d> r3 = r2.f258548d     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x0035
            java.lang.String r8 = r2.f258545a     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = "[onScanResult]may be close, err"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00fb }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r9, r0)     // Catch:{ all -> 0x00fb }
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            return
        L_0x0035:
            rk0.j r2 = r2.f258558n     // Catch:{ all -> 0x00fb }
            r2.mo124307a(r8, r9)     // Catch:{ all -> 0x00fb }
            android.bluetooth.BluetoothDevice r8 = r9.mo114648a()     // Catch:{ all -> 0x00fb }
            java.lang.String r8 = r8.getAddress()     // Catch:{ all -> 0x00fb }
            rk0.c r2 = r7.f258567a     // Catch:{ all -> 0x00fb }
            java.util.Map<java.lang.String, qk0.d> r2 = r2.f258548d     // Catch:{ all -> 0x00fb }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x00fb }
            r3 = 1
            if (r2 == 0) goto L_0x005a
            mk0.a r2 = mk0.C88736a.m110767a()     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.f256127b     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = 1
        L_0x005b:
            qk0.d r4 = new qk0.d     // Catch:{ all -> 0x00fb }
            r4.<init>(r9)     // Catch:{ all -> 0x00fb }
            rk0.c r9 = r7.f258567a     // Catch:{ all -> 0x00fb }
            java.util.Map<java.lang.String, qk0.d> r9 = r9.f258548d     // Catch:{ all -> 0x00fb }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ all -> 0x00fb }
            r9.put(r8, r4)     // Catch:{ all -> 0x00fb }
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x00fa
            mk0.a r8 = mk0.C88736a.m110767a()
            int r8 = r8.f256126a
            if (r8 <= 0) goto L_0x0088
            rk0.c r8 = r7.f258567a
            monitor-enter(r8)
            rk0.c r9 = r7.f258567a     // Catch:{ all -> 0x0085 }
            java.util.List<qk0.d> r9 = r9.f258552h     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x0082
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0085 }
            r9.add(r4)     // Catch:{ all -> 0x0085 }
        L_0x0082:
            monitor-exit(r8)     // Catch:{ all -> 0x0085 }
            goto L_0x00fa
        L_0x0085:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0085 }
            throw r9
        L_0x0088:
            rk0.c r8 = r7.f258567a
            qk0.j r8 = r8.f258559o
            if (r8 == 0) goto L_0x00fa
            kk0.p$b r8 = (kk0.C88204p.C88206b) r8
            com.tencent.mm.plugin.appbrand.jsapi.f r8 = r8.f255008a
            java.lang.String r9 = "devices"
            java.lang.String r1 = "put JSON data error : %s"
            java.lang.String r2 = "MicroMsg.JsApiStartBluetoothDevicesDiscovery"
            if (r8 != 0) goto L_0x00a1
            java.lang.String r8 = "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            goto L_0x00fa
        L_0x00a1:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONObject r4 = r4.mo124015a()     // Catch:{ JSONException -> 0x00ae }
            r5.put(r4)     // Catch:{ JSONException -> 0x00ae }
            goto L_0x00b6
        L_0x00ae:
            r4 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r0] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r6)
        L_0x00b6:
            kk0.p$c r4 = new kk0.p$c
            r4.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r6.remove(r9)     // Catch:{ JSONException -> 0x00c7 }
            r6.put(r9, r5)     // Catch:{ JSONException -> 0x00c7 }
            goto L_0x00cf
        L_0x00c7:
            r9 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r3)
        L_0x00cf:
            int r9 = r8.getComponentId()
            r4.mo115161k(r8)
            r4.f242409h = r9
            java.lang.String r8 = r6.toString()
            r4.f242407f = r8
            r4.mo115158h()
            boolean r8 = rk0.C89982b.f258541d
            if (r8 != 0) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "OnBluetoothDeviceFoundEvent "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
        L_0x00fa:
            return
        L_0x00fb:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            throw r8
        L_0x00fe:
            rk0.c r8 = r7.f258567a
            java.lang.String r8 = r8.f258545a
            java.lang.String r9 = "[onScanResult]result is null, err"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk0.C89989d.mo124316c(int, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat):void");
    }
}
