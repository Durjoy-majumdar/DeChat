package p737wf;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p981ie.C117159b;
import p981ie.C117163d;

/* renamed from: wf.b */
public class C118763b {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m167463a(java.lang.String r9, java.lang.String r10, java.lang.String r11, p329d3.C116555h<java.lang.Boolean> r12) {
        /*
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            r1 = 0
            int r0 = r0.getInt(r10, r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            int r2 = r2.getInt(r11, r1)
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r4 = 1045220556(0x3e4ccccc, float:0.19999999)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            if (r0 < 0) goto L_0x0035
            if (r2 >= 0) goto L_0x001f
            goto L_0x0035
        L_0x001f:
            int r7 = r0 + r2
            r8 = 100
            if (r7 < r8) goto L_0x0033
            float r8 = (float) r0
            float r8 = r8 * r5
            float r7 = (float) r7
            float r8 = r8 / r7
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0032
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            r7 = 0
            goto L_0x0036
        L_0x0035:
            r7 = 1
        L_0x0036:
            java.lang.Object r12 = r12.get()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L_0x009c
            boolean r8 = r12.booleanValue()
            int r0 = r0 + r8
            boolean r12 = r12.booleanValue()
            r12 = r12 ^ r6
            int r2 = r2 + r12
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            android.content.SharedPreferences$Editor r12 = r12.putInt(r10, r0)
            r12.apply()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            android.content.SharedPreferences$Editor r12 = r12.putInt(r11, r2)
            r12.apply()
            boolean r12 = p212oe.b$$f.m166060e()
            if (r12 == 0) goto L_0x009c
            int r12 = r0 + r2
            r8 = 10
            if (r12 < r8) goto L_0x009c
            float r7 = (float) r0
            float r7 = r7 * r5
            float r12 = (float) r12
            float r7 = r7 / r12
            r12 = 4
            java.lang.String[] r12 = new java.lang.String[r12]
            r12[r1] = r9
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 < 0) goto L_0x007c
            java.lang.String r9 = "yes"
            goto L_0x0085
        L_0x007c:
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0083
            java.lang.String r9 = "no"
            goto L_0x0085
        L_0x0083:
            java.lang.String r9 = "neutral"
        L_0x0085:
            r12[r6] = r9
            r9 = 2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12[r9] = r0
            r9 = 3
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r12[r9] = r0
            java.lang.String r9 = "currencyInspect"
            r0 = 0
            p988jj.C87968a.C87969a.C87970a.m109467a(r9, r0, r0, r12)
            goto L_0x009d
        L_0x009c:
            r6 = r7
        L_0x009d:
            if (r6 == 0) goto L_0x00b5
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            android.content.SharedPreferences$Editor r9 = r9.remove(r10)
            r9.apply()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            android.content.SharedPreferences$Editor r9 = r9.remove(r11)
            r9.apply()
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p737wf.C118763b.m167463a(java.lang.String, java.lang.String, java.lang.String, d3.h):void");
    }

    /* renamed from: b */
    public static Boolean m167464b(Context context) {
        int i = MultiProcessMMKV.getDefault().getInt("batt_amp_micro_pos", 0);
        int i2 = MultiProcessMMKV.getDefault().getInt("batt_amp_micro_neg", 0);
        if (i2 >= 0 && i > i2) {
            return Boolean.TRUE;
        }
        long e = C117159b.m165204e(context);
        Log.m105928w("MicroMsg.battery.PowerManagerCompat", "isMicroAmp low specs: " + e + ", " + i + " vs " + i2);
        return C117163d.m165224a(context, 1000);
    }
}
