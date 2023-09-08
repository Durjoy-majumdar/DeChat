package p212oe;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: oe.j$$f */
public class j$$f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public long f257036a = 0;

    public void onAvailable(Network network) {
        super.onAvailable(network);
        Log.m105924i("Matrix.battery.LifeCycle", "network onAvailable " + network);
    }

    public void onBlockedStatusChanged(Network network, boolean z) {
        super.onBlockedStatusChanged(network, z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:2|3|(1:5)(1:6)|7|(1:9)(1:10)|11|12|(2:14|15)|16|(1:18)|19|20|(1:28)|32|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x010d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCapabilitiesChanged(android.net.Network r12, android.net.NetworkCapabilities r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Matrix.battery.LifeCycle"
            super.onCapabilitiesChanged(r12, r13)
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r11.f257036a
            long r1 = r1 - r3
            r3 = 1800000(0x1b7740, double:8.89318E-318)
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0161
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0139 }
            r1 = 29
            r2 = 0
            if (r12 < r1) goto L_0x0033
            int r1 = r13.getSignalStrength()     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r3.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r4 = "network strength: "
            r3.append(r4)     // Catch:{ all -> 0x0139 }
            r3.append(r1)     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0139 }
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            r3 = 31
            r4 = 0
            if (r12 < r3) goto L_0x0056
            int[] r3 = r13.getCapabilities()     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = "network capabilities: "
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = java.util.Arrays.toString(r3)     // Catch:{ all -> 0x0139 }
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0139 }
            goto L_0x0057
        L_0x0056:
            r3 = r4
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = "network TRANSPORT_CELLULAR: "
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            boolean r6 = r13.hasTransport(r2)     // Catch:{ all -> 0x0139 }
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = "network TRANSPORT_WIFI: "
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            r6 = 1
            boolean r7 = r13.hasTransport(r6)     // Catch:{ all -> 0x0139 }
            r5.append(r7)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r7 = "network TRANSPORT_BLUETOOTH: "
            r5.append(r7)     // Catch:{ all -> 0x0139 }
            r7 = 2
            boolean r8 = r13.hasTransport(r7)     // Catch:{ all -> 0x0139 }
            r5.append(r8)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = "network TRANSPORT_ETHERNET: "
            r5.append(r8)     // Catch:{ all -> 0x0139 }
            r8 = 3
            boolean r9 = r13.hasTransport(r8)     // Catch:{ all -> 0x0139 }
            r5.append(r9)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r9 = "network TRANSPORT_VPN: "
            r5.append(r9)     // Catch:{ all -> 0x0139 }
            r9 = 4
            boolean r9 = r13.hasTransport(r9)     // Catch:{ all -> 0x0139 }
            r5.append(r9)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0139 }
            r5 = 26
            r9 = 5
            if (r12 < r5) goto L_0x00f0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r5.<init>()     // Catch:{ all -> 0x010d }
            java.lang.String r10 = "network TRANSPORT_WIFI_AWARE: "
            r5.append(r10)     // Catch:{ all -> 0x010d }
            boolean r10 = r13.hasTransport(r9)     // Catch:{ all -> 0x010d }
            r5.append(r10)     // Catch:{ all -> 0x010d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x010d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x010d }
        L_0x00f0:
            r5 = 27
            if (r12 < r5) goto L_0x010d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r12.<init>()     // Catch:{ all -> 0x010d }
            java.lang.String r5 = "network TRANSPORT_LOWPAN: "
            r12.append(r5)     // Catch:{ all -> 0x010d }
            r5 = 6
            boolean r5 = r13.hasTransport(r5)     // Catch:{ all -> 0x010d }
            r12.append(r5)     // Catch:{ all -> 0x010d }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x010d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ all -> 0x010d }
        L_0x010d:
            boolean r12 = r13.hasTransport(r2)     // Catch:{ all -> 0x0139 }
            if (r12 == 0) goto L_0x0152
            boolean r12 = r13.hasTransport(r6)     // Catch:{ all -> 0x0139 }
            if (r12 != 0) goto L_0x0125
            boolean r12 = r13.hasTransport(r9)     // Catch:{ all -> 0x0139 }
            if (r12 != 0) goto L_0x0125
            boolean r12 = r13.hasTransport(r8)     // Catch:{ all -> 0x0139 }
            if (r12 == 0) goto L_0x0152
        L_0x0125:
            java.lang.String r12 = "DualNetTransport"
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0139 }
            r13[r2] = r1     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = java.util.Arrays.toString(r3)     // Catch:{ all -> 0x0139 }
            r13[r6] = r1     // Catch:{ all -> 0x0139 }
            p988jj.C87968a.C87969a.C87970a.m109467a(r12, r4, r4, r13)     // Catch:{ all -> 0x0139 }
            goto L_0x0152
        L_0x0139:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r13.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = "dump transport Networks failed: "
            r13.append(r1)     // Catch:{ all -> 0x0159 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0159 }
            r13.append(r12)     // Catch:{ all -> 0x0159 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0159 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r12)     // Catch:{ all -> 0x0159 }
        L_0x0152:
            long r12 = android.os.SystemClock.uptimeMillis()
            r11.f257036a = r12
            goto L_0x0161
        L_0x0159:
            r12 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()
            r11.f257036a = r0
            throw r12
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.j$$f.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
    }

    public void onLosing(Network network, int i) {
        super.onLosing(network, i);
    }

    public void onLost(Network network) {
        super.onLost(network);
        Log.m105924i("Matrix.battery.LifeCycle", "network onLost " + network);
    }

    public void onUnavailable() {
        super.onUnavailable();
    }
}
