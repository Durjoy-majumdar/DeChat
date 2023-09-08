package rk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: rk0.a */
public final class C89981a {

    /* renamed from: a */
    public final ScanResultCompat f258540a;

    public C89981a(ScanResultCompat scanResultCompat) {
        C87412m.m108594g(scanResultCompat, "theResult");
        this.f258540a = scanResultCompat;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class<rk0.a> r1 = rk0.C89981a.class
            if (r6 == 0) goto L_0x000d
            java.lang.Class r2 = r6.getClass()
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            r2 = 0
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.BleScanPrinter.Companion.ScanResult"
            gy3.C87412m.m108592e(r6, r1)
            rk0.a r6 = (rk0.C89981a) r6
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r1 = r5.f258540a
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r6 = r6.f258540a
            android.bluetooth.BluetoothDevice r3 = r1.mo114648a()
            android.bluetooth.BluetoothDevice r4 = r6.mo114648a()
            boolean r3 = rk0.C118230k.m166791b(r3, r4)
            if (r3 == 0) goto L_0x004c
            rk0.m r1 = r1.f241162e
            rk0.m r6 = r6.f241162e
            if (r1 != 0) goto L_0x0037
            if (r6 == 0) goto L_0x0045
        L_0x0037:
            if (r1 == 0) goto L_0x0047
            if (r6 == 0) goto L_0x0047
            byte[] r1 = r1.f258579g
            byte[] r6 = r6.f258579g
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 == 0) goto L_0x0047
        L_0x0045:
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            if (r6 == 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            if (r6 != 0) goto L_0x0050
            return r2
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk0.C89981a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ScanResultCompat scanResultCompat = this.f258540a;
        Object[] objArr = new Object[2];
        objArr[0] = scanResultCompat.mo114648a();
        C89999m mVar = scanResultCompat.f241162e;
        objArr[1] = Integer.valueOf(Arrays.hashCode(mVar != null ? mVar.f258579g : null));
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        return "{rssi: " + this.f258540a.f241163f + ", timestampNanos: " + this.f258540a.f241164g + '}';
    }
}
