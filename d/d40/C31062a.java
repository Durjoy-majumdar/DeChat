package d40;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import zt3.C119157j;

/* renamed from: d40.a */
public class C31062a {

    /* renamed from: d40.a$a */
    public class C31063a implements Runnable {
        public void run() {
            C31062a.m39294a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV("MMKV_KARA_BEHAVIOR");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m39294a() {
        /*
            java.lang.Class<d40.a> r0 = d40.C31062a.class
            monitor-enter(r0)
            double r1 = java.lang.Math.random()     // Catch:{ all -> 0x0077 }
            oa1.d r3 = oa1.C117731d.m166007c()     // Catch:{ all -> 0x0077 }
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "clicfg_android_kara_behavior_report"
            r8 = 1
            java.lang.String r3 = r3.mo182444f(r7, r6, r8, r8)     // Catch:{ all -> 0x0077 }
            double r6 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r3, r4)     // Catch:{ all -> 0x0077 }
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0075
            oa1.d r1 = oa1.C117731d.m166007c()     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "clicfg_android_kara_behavior_report"
            java.lang.String r1 = r1.mo182444f(r3, r2, r8, r8)     // Catch:{ all -> 0x0077 }
            double r1 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r1, r4)     // Catch:{ all -> 0x0077 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0075
            java.lang.String r1 = "MMKV_KARA_BEHAVIOR"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String[] r2 = r1.allKeys()     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0075
            int r3 = r2.length     // Catch:{ all -> 0x0077 }
            r4 = 0
            r5 = 0
        L_0x0047:
            if (r5 >= r3) goto L_0x0075
            r6 = r2[r5]     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = ""
            java.lang.String r7 = r1.getString(r6, r7)     // Catch:{ all -> 0x0077 }
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0077 }
            if (r9 != 0) goto L_0x0072
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0077 }
            r10 = 25579(0x63eb, float:3.5844E-41)
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x0077 }
            r11[r4] = r6     // Catch:{ all -> 0x0077 }
            r11[r8] = r7     // Catch:{ all -> 0x0077 }
            r9.mo160131h(r10, r11)     // Catch:{ all -> 0x0077 }
            android.content.SharedPreferences$Editor r7 = r1.edit()     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = ""
            android.content.SharedPreferences$Editor r6 = r7.putString(r6, r9)     // Catch:{ all -> 0x0077 }
            r6.commit()     // Catch:{ all -> 0x0077 }
        L_0x0072:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.C31062a.m39294a():void");
    }

    /* renamed from: b */
    public static void m39295b(String str, int i) {
        synchronized (C31062a.class) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MMKV_KARA_BEHAVIOR");
            StringBuilder sb = new StringBuilder(mmkv.getString(str, ""));
            sb.append(i);
            sb.append("|");
            mmkv.edit().putString(str, sb.toString()).commit();
            if (sb.length() > 5120) {
                Log.m105925i("Kara.KaraBehaviorReport", "content too long !!! %d", Integer.valueOf(sb.length()));
                ((C119157j) C119157j.f356862d).mo183884o(new C31063a());
            }
        }
    }
}
