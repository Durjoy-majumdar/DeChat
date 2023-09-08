package com.tencent.p014mm.sandbox.monitor;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.File;
import rg3.C89963b;

/* renamed from: com.tencent.mm.sandbox.monitor.h */
public abstract class C85705h implements C89963b {

    /* renamed from: f */
    public static final String f249722f = C112760b.m154195C();

    /* renamed from: a */
    public int f249723a;

    /* renamed from: b */
    public int f249724b;

    /* renamed from: c */
    public int f249725c = C85706i.m105869e(mo119309f());

    /* renamed from: d */
    public String f249726d;

    /* renamed from: e */
    public boolean f249727e;

    public C85705h(int i, String str, int i2, boolean z) {
        this.f249724b = i;
        this.f249726d = str;
        this.f249723a = i2;
        this.f249727e = z;
        File file = new File(f249722f);
        if (!file.exists()) {
            file.mkdirs();
        }
        Log.m105918d("MM.GetUpdatePack", "NetSceneGetUpdatePack : temp path = " + mo119309f() + " packOffset = " + this.f249725c);
    }

    /* renamed from: d */
    public static String m105860d(String str) {
        return m105861e(str, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0151  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m105861e(java.lang.String r19, boolean r20) {
        /*
            r1 = r19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = f249722f
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = ".temp"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r5 = ".apk"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r6 = com.tencent.p014mm.sandbox.monitor.C85706i.m105867c(r0)
            if (r6 == 0) goto L_0x009b
            if (r20 != 0) goto L_0x009b
            boolean r6 = p1054vg.C90793a.m113860a(r0)
            if (r6 != 0) goto L_0x0044
            java.lang.String r0 = com.tencent.p014mm.sandbox.monitor.C85706i.m105868d(r0)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009b
        L_0x0044:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            if (r2 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x0069
            goto L_0x009a
        L_0x0069:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L_0x009a
            r3.renameTo(r0)
        L_0x009a:
            return r4
        L_0x009b:
            boolean r0 = com.tencent.p014mm.sandbox.monitor.C85706i.m105867c(r4)
            r2 = 0
            if (r0 == 0) goto L_0x01b5
            boolean r0 = p1054vg.C90793a.m113860a(r4)
            java.lang.String r3 = "MM.GetUpdatePack"
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "summertoken getReadyPack checkApkMd5 update pack ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x00b1:
            r5 = 11098(0x2b5a, float:1.5552E-41)
            r6 = 2
            r7 = 1
            r8 = 0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00f4 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ Exception -> 0x00f4 }
            int r0 = r0.targetSdkVersion     // Catch:{ Exception -> 0x00f4 }
            r9 = 29
            if (r0 > r9) goto L_0x00cf
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00f4 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r0 = p1054vg.C90796c.m113866b(r0)     // Catch:{ Exception -> 0x00f4 }
            r9 = r0
            goto L_0x00d0
        L_0x00cf:
            r9 = r2
        L_0x00d0:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x00f2 }
            if (r0 == 0) goto L_0x0130
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00f2 }
            r11 = 322(0x142, double:1.59E-321)
            r13 = 10
            r15 = 1
            r17 = 0
            r10 = r0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ Exception -> 0x00f2 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00f2 }
            r11 = 4010(0xfaa, float:5.619E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00f2 }
            r10[r8] = r11     // Catch:{ Exception -> 0x00f2 }
            r0.mo160131h(r5, r10)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x0130
        L_0x00f2:
            r0 = move-exception
            goto L_0x00f6
        L_0x00f4:
            r0 = move-exception
            r9 = r2
        L_0x00f6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "summertoken getReadyPack getSecurityCode e:"
            r10.append(r11)
            java.lang.String r11 = r0.getMessage()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 322(0x142, double:1.59E-321)
            r14 = 9
            r16 = 1
            r18 = 0
            r11 = r10
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r12 = 4009(0xfa9, float:5.618E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r8] = r12
            java.lang.String r0 = r0.getMessage()
            r11[r7] = r0
            r10.mo160131h(r5, r11)
        L_0x0130:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r9
            java.lang.String r10 = "summertoken getReadyPack getSecurityCode pkgsig[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = com.tencent.p014mm.sandbox.monitor.C85706i.m105868d(r4)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "summertoken getReadyPack no pkgsig getMD5 update pack ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x0151:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 4
            java.lang.String r10 = "update_config_prefs"
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences.getSharedPreferences(r0, r10, r1)
            java.lang.String r1 = "update_downloaded_pack_sig_key"
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r8] = r9
            r1[r7] = r0
            java.lang.String r10 = "summertoken getReadyPack pkgsig[%s], downloadedSig[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r1)
            boolean r1 = r9.equals(r0)
            if (r1 == 0) goto L_0x017d
            java.lang.String r0 = "summertoken getReadyPack pkgsig check update pack ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r4
        L_0x017d:
            java.lang.String r1 = "summertoken getReadyPack pkgsig check invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 322(0x142, double:1.59E-321)
            r13 = 11
            r15 = 1
            r17 = 0
            r10 = r1
            r10.idkeyStat(r11, r13, r15, r17)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r11 = 4011(0xfab, float:5.62E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r8] = r0
            r6[r7] = r9
            java.lang.String r0 = "%s,%s"
            java.lang.String r0 = java.lang.String.format(r0, r6)
            r10[r7] = r0
            r1.mo160131h(r5, r10)
        L_0x01ac:
            java.lang.String r0 = "summertoken getReadyPack: update pack MD5 not same"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            com.tencent.p014mm.sandbox.monitor.C85706i.m105866b(r4)
        L_0x01b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sandbox.monitor.C85705h.m105861e(java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: b */
    public void mo119307b() {
        try {
            Log.m105918d("MM.GetUpdatePack", "deleteTempFile");
            File file = new File(mo119309f());
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
            Log.m105920e("MM.GetUpdatePack", "error in deleteTempFile");
        }
    }

    /* renamed from: c */
    public String mo119308c() {
        return f249722f + this.f249726d + ".apk";
    }

    /* renamed from: f */
    public String mo119309f() {
        return f249722f + this.f249726d + ".temp";
    }
}
