package com.tencent.luggage.sdk.customize.impl;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import rk0.C89996i;

/* renamed from: com.tencent.luggage.sdk.customize.impl.a */
public final class C28638a implements C89996i {

    /* renamed from: d */
    public static final C28638a f78573d = new C28638a();

    /* renamed from: e */
    public static final ArrayList<C28639a> f78574e = new ArrayList<>(5);

    /* renamed from: f */
    public static final HashMap<Integer, C28639a> f78575f = new HashMap<>();

    /* renamed from: g */
    public static int f78576g;

    /* renamed from: com.tencent.luggage.sdk.customize.impl.a$a */
    public static final class C28639a {

        /* renamed from: a */
        public final int f78577a;

        /* renamed from: b */
        public final long f78578b;

        public C28639a(int i, long j) {
            this.f78577a = i;
            this.f78578b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28639a)) {
                return false;
            }
            C28639a aVar = (C28639a) obj;
            return this.f78577a == aVar.f78577a && this.f78578b == aVar.f78578b;
        }

        public int hashCode() {
            long j = this.f78578b;
            return (this.f78577a * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "LastScan(id=" + this.f78577a + ", timeStamp=" + this.f78578b + ')';
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean gx0() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList<com.tencent.luggage.sdk.customize.impl.a$a> r0 = f78574e     // Catch:{ all -> 0x0023 }
            int r1 = r0.size()     // Catch:{ all -> 0x0023 }
            r2 = 5
            r3 = 0
            if (r1 >= r2) goto L_0x000d
            monitor-exit(r6)
            return r3
        L_0x000d:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0023 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0023 }
            com.tencent.luggage.sdk.customize.impl.a$a r0 = (com.tencent.luggage.sdk.customize.impl.C28638a.C28639a) r0     // Catch:{ all -> 0x0023 }
            long r4 = r0.f78578b     // Catch:{ all -> 0x0023 }
            long r1 = r1 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0021
            r3 = 1
        L_0x0021:
            monitor-exit(r6)
            return r3
        L_0x0023:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.customize.impl.C28638a.gx0():boolean");
    }

    /* renamed from: ja */
    public synchronized void mo56170ja(int i) {
        Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStop, id: " + i);
        C28639a remove = f78575f.remove(Integer.valueOf(i));
        if (remove == null) {
            Log.m105928w("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStop, scan is null");
            return;
        }
        ArrayList<C28639a> arrayList = f78574e;
        if (arrayList.size() >= 5) {
            arrayList.remove(0);
        }
        arrayList.add(remove);
    }

    /* renamed from: pa */
    public synchronized int mo56171pa() {
        int i;
        Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStart");
        i = f78576g;
        f78576g = i + 1;
        f78575f.put(Integer.valueOf(i), new C28639a(i, SystemClock.elapsedRealtime()));
        return i;
    }
}
