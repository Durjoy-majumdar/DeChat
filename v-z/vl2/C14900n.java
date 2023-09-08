package vl2;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C90364q0;
import te3.C49197dw3;
import te3.C49343ew3;

/* renamed from: vl2.n */
public final class C14900n {

    /* renamed from: a */
    public static final C14900n f40927a = new C14900n();

    /* renamed from: b */
    public static HashMap<Long, Integer> f40928b = C90364q0.m113146e(new C13604l(3600000L, 3), new C13604l(86400000L, 10));

    /* renamed from: c */
    public static MultiProcessMMKV f40929c;

    /* renamed from: d */
    public static boolean f40930d;

    /* renamed from: e */
    public static long f40931e = 86400000;

    /* renamed from: f */
    public static long f40932f;

    /* JADX WARNING: type inference failed for: r7v7, types: [pe3.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        if ((86400 <= r8 && r8 < 604801) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "MicroMsg.ScanCrashManager"
            vl2.n r1 = new vl2.n
            r1.<init>()
            f40927a = r1
            r1 = 2
            rx3.l[] r2 = new rx3.C13604l[r1]
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            rx3.l r6 = new rx3.l
            r6.<init>(r3, r5)
            r3 = 0
            r2[r3] = r6
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r8 = 10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            rx3.l r9 = new rx3.l
            r9.<init>(r7, r8)
            r7 = 1
            r2[r7] = r9
            java.util.HashMap r2 = sx3.C90364q0.m113146e(r2)
            f40928b = r2
            f40931e = r5
            r5 = 259200(0x3f480, double:1.28062E-318)
            f40932f = r5
            boolean r2 = f40.C86709a0.m107522a()     // Catch:{ Exception -> 0x0079 }
            if (r2 == 0) goto L_0x0067
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = f40929c     // Catch:{ Exception -> 0x0079 }
            if (r8 != 0) goto L_0x0067
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0079 }
            r8.<init>()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r9 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0079 }
            r8.append(r9)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r9 = "_scan_crash_mmkv"
            r8.append(r9)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0079 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)     // Catch:{ Exception -> 0x0079 }
            f40929c = r8     // Catch:{ Exception -> 0x0079 }
        L_0x0067:
            java.lang.String r8 = "initMMKV %s, mmkv: %s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0079 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0079 }
            r9[r3] = r2     // Catch:{ Exception -> 0x0079 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = f40929c     // Catch:{ Exception -> 0x0079 }
            r9[r7] = r2     // Catch:{ Exception -> 0x0079 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r9)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0081
        L_0x0079:
            r2 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = "checkInitMMKV exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r9, r8)
        L_0x0081:
            vl2.n r2 = f40927a
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_scan_merge_disable_scan_goods_duration_seconds
            long r8 = r8.mo58777He(r9, r5)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r10 != 0) goto L_0x00ac
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r10 != 0) goto L_0x00ac
            r10 = 86400(0x15180, double:4.26873E-319)
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 > 0) goto L_0x00a9
            r10 = 604801(0x93a81, double:2.988114E-318)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x00a9
            r10 = 1
            goto L_0x00aa
        L_0x00a9:
            r10 = 0
        L_0x00aa:
            if (r10 == 0) goto L_0x00ad
        L_0x00ac:
            r5 = r8
        L_0x00ad:
            f40932f = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "initCrashConfig crashValidDuration: "
            r5.append(r6)
            long r8 = f40932f
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = f40929c
            java.lang.String r6 = "key_client_version"
            if (r5 == 0) goto L_0x00d0
            int r5 = r5.getInt(r6, r3)
            goto L_0x00d1
        L_0x00d0:
            r5 = 0
        L_0x00d1:
            int r8 = qe3.C89625d.f257841g
            r9 = 0
            if (r5 == r8) goto L_0x0103
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4[r7] = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            r4[r1] = r5
            java.lang.String r1 = "initWillCrash client not the same, and clear crash info. last: %X, current: %d, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f40929c
            if (r1 == 0) goto L_0x00f5
            r1.clearAll()
        L_0x00f5:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f40929c
            if (r1 == 0) goto L_0x00fc
            r1.putInt(r6, r8)
        L_0x00fc:
            r2.mo13964c(r3, r9)
            f40930d = r3
            goto L_0x01b1
        L_0x0103:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f40929c
            if (r1 == 0) goto L_0x010e
            java.lang.String r4 = "key_last_enter_will_crash"
            boolean r1 = r1.getBoolean(r4, r3)
            goto L_0x010f
        L_0x010e:
            r1 = 0
        L_0x010f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = f40929c
            if (r4 == 0) goto L_0x011a
            java.lang.String r5 = "key_last_enter"
            long r4 = r4.getLong(r5, r9)
            goto L_0x011b
        L_0x011a:
            r4 = r9
        L_0x011b:
            if (r1 == 0) goto L_0x01a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0198 }
            r1.<init>()     // Catch:{ Exception -> 0x0198 }
            java.lang.String r2 = "updateCrash lastEnterTimestamp: "
            r1.append(r2)     // Catch:{ Exception -> 0x0198 }
            r1.append(r4)     // Catch:{ Exception -> 0x0198 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0198 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0198 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f40929c     // Catch:{ Exception -> 0x0198 }
            java.lang.String r2 = "key_crash_info"
            r6 = 0
            if (r1 == 0) goto L_0x016a
            boolean r8 = r1.containsKey(r2)     // Catch:{ Exception -> 0x0198 }
            if (r8 == 0) goto L_0x0168
            byte[] r1 = r1.decodeBytes(r2)     // Catch:{ Exception -> 0x0198 }
            if (r1 == 0) goto L_0x0168
            int r8 = r1.length     // Catch:{ Exception -> 0x0198 }
            if (r8 != 0) goto L_0x014a
            r8 = 1
            goto L_0x014b
        L_0x014a:
            r8 = 0
        L_0x014b:
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0168
            java.lang.Class<te3.dw3> r7 = te3.C49197dw3.class
            java.lang.Object r7 = r7.newInstance()     // Catch:{ Exception -> 0x015e }
            r8 = r7
            pe3.a r8 = (pe3.C47465a) r8     // Catch:{ Exception -> 0x015e }
            r8.parseFrom(r1)     // Catch:{ Exception -> 0x015e }
            pe3.a r7 = (pe3.C47465a) r7     // Catch:{ Exception -> 0x015e }
            r6 = r7
            goto L_0x0168
        L_0x015e:
            r1 = move-exception
            java.lang.String r7 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r8 = "decode ProtoBuffer"
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0198 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r1, r8, r11)     // Catch:{ Exception -> 0x0198 }
        L_0x0168:
            te3.dw3 r6 = (te3.C49197dw3) r6     // Catch:{ Exception -> 0x0198 }
        L_0x016a:
            if (r6 != 0) goto L_0x0171
            te3.dw3 r6 = new te3.dw3     // Catch:{ Exception -> 0x0198 }
            r6.<init>()     // Catch:{ Exception -> 0x0198 }
        L_0x0171:
            java.util.LinkedList<te3.ew3> r1 = r6.f132551d     // Catch:{ Exception -> 0x0198 }
            if (r1 == 0) goto L_0x0187
            te3.ew3 r7 = new te3.ew3     // Catch:{ Exception -> 0x0198 }
            r7.<init>()     // Catch:{ Exception -> 0x0198 }
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0182
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0198 }
        L_0x0182:
            r7.f133148d = r4     // Catch:{ Exception -> 0x0198 }
            r1.add(r7)     // Catch:{ Exception -> 0x0198 }
        L_0x0187:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f40929c     // Catch:{ Exception -> 0x0198 }
            if (r1 == 0) goto L_0x0192
            byte[] r4 = r6.toByteArray()     // Catch:{ Exception -> 0x0198 }
            r1.encode((java.lang.String) r2, (byte[]) r4)     // Catch:{ Exception -> 0x0198 }
        L_0x0192:
            vl2.n r1 = f40927a     // Catch:{ Exception -> 0x0198 }
            r1.mo13963b(r6)     // Catch:{ Exception -> 0x0198 }
            goto L_0x01b1
        L_0x0198:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "updateCrashInfo exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r3, r2)
            goto L_0x01b1
        L_0x01a2:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f40929c
            if (r1 == 0) goto L_0x01ac
            java.lang.String r4 = "key_will_crash"
            boolean r3 = r1.getBoolean(r4, r3)
        L_0x01ac:
            f40930d = r3
            r2.mo13962a()
        L_0x01b1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initWillCrash willCrash: "
            r1.append(r2)
            boolean r2 = f40930d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C14900n.<clinit>():void");
    }

    /* renamed from: a */
    public final void mo13962a() {
        MultiProcessMMKV multiProcessMMKV = f40929c;
        long j = multiProcessMMKV != null ? multiProcessMMKV.getLong("key_crash_valid_timestamp", 0) : 0;
        Log.m105925i("MicroMsg.ScanCrashManager", "checkCrashExpired crashValidTime: %s", Long.valueOf(j));
        if (j > 0 && MMSlotKt.isExpire(j, f40932f * 1000)) {
            Log.m105924i("MicroMsg.ScanCrashManager", "checkCrashExpired crashInfo expire and clear");
            MultiProcessMMKV multiProcessMMKV2 = f40929c;
            if (multiProcessMMKV2 != null) {
                multiProcessMMKV2.clearAll();
            }
            mo13964c(false, 0);
            f40930d = false;
        }
    }

    /* renamed from: b */
    public final void mo13963b(C49197dw3 dw32) {
        SharedPreferences.Editor remove;
        Iterator<Map.Entry<Long, Integer>> it;
        C49197dw3 dw33 = dw32;
        Iterator<Map.Entry<Long, Integer>> it4 = f40928b.entrySet().iterator();
        boolean z = false;
        long j = 0;
        while (it4.hasNext()) {
            Map.Entry next = it4.next();
            long longValue = ((Number) next.getKey()).longValue();
            int intValue = ((Number) next.getValue()).intValue();
            ArrayList arrayList = new ArrayList();
            LinkedList<C49343ew3> linkedList = dw33.f132551d;
            C87412m.m108593f(linkedList, "crashInfo.crashList");
            int i = 0;
            int i2 = 0;
            for (T next2 : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C49343ew3 ew32 = (C49343ew3) next2;
                    boolean z2 = z;
                    long currentTimeMillis = System.currentTimeMillis() - ew32.f133148d;
                    if (currentTimeMillis <= longValue) {
                        StringBuilder sb = new StringBuilder();
                        it = it4;
                        sb.append("updateCrashInfo find crash diff: ");
                        sb.append(currentTimeMillis);
                        Log.m105928w("MicroMsg.ScanCrashManager", sb.toString());
                        i++;
                    } else {
                        it = it4;
                    }
                    if (currentTimeMillis < f40931e) {
                        arrayList.add(ew32);
                    }
                    if (i >= intValue) {
                        Log.m105928w("MicroMsg.ScanCrashManager", "updateCrashInfo crash count >= limit count");
                        j = longValue;
                        z = true;
                    } else {
                        z = z2;
                    }
                    i2 = i3;
                    it4 = it;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Iterator<Map.Entry<Long, Integer>> it5 = it4;
            boolean z3 = z;
            Log.m105924i("MicroMsg.ScanCrashManager", "checkWillCrash time: " + longValue + ", crashLimit: " + intValue + ", currentCrashCount: " + i + ", newCrashList: " + arrayList.size() + ", willCrash: " + z);
            dw33.f132551d.clear();
            dw33.f132551d.addAll(arrayList);
            it4 = it5;
        }
        if (z) {
            mo13964c(true, j);
            MultiProcessMMKV multiProcessMMKV = f40929c;
            if (multiProcessMMKV != null && (remove = multiProcessMMKV.remove("key_crash_info")) != null) {
                remove.apply();
                return;
            }
            return;
        }
        mo13964c(false, 0);
        MultiProcessMMKV multiProcessMMKV2 = f40929c;
        if (multiProcessMMKV2 != null) {
            multiProcessMMKV2.encode("key_crash_info", dw32.toByteArray());
        }
    }

    /* renamed from: c */
    public final void mo13964c(boolean z, long j) {
        SharedPreferences.Editor putBoolean;
        SharedPreferences.Editor putLong;
        SharedPreferences.Editor putLong2;
        Log.m105924i("MicroMsg.ScanCrashManager", "saveWillCrash willCrash: " + z + ", timeLimit: " + j);
        f40930d = z;
        MultiProcessMMKV multiProcessMMKV = f40929c;
        if (multiProcessMMKV != null && (putBoolean = multiProcessMMKV.putBoolean("key_will_crash", z)) != null && (putLong = putBoolean.putLong("key_will_crash_time_limit", j)) != null && (putLong2 = putLong.putLong("key_crash_valid_timestamp", System.currentTimeMillis())) != null) {
            putLong2.apply();
        }
    }
}
