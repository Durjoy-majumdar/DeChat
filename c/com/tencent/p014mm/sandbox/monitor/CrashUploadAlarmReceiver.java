package com.tencent.p014mm.sandbox.monitor;

import android.content.BroadcastReceiver;

/* renamed from: com.tencent.mm.sandbox.monitor.CrashUploadAlarmReceiver */
public class CrashUploadAlarmReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r22, android.content.Intent r23) {
        /*
            r21 = this;
            java.lang.String r0 = "MicroMsg.CrashUploadAlarmReceiver"
            java.lang.String r1 = "dkcrash AlarmReceiver.onReceive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.tencent.p014mm.sandbox.monitor.C85701f.f249717a
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.tencent.p014mm.storage.C72994y1.f212832a
            r1.append(r2)
            java.lang.String r2 = "crash/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r2 = 2
            r3 = -1
            java.lang.String r4 = "MicroMsg.CrashUpload"
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "dkcrash checkUpload dir never create ?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x0032:
            r0 = -1
            goto L_0x007f
        L_0x0034:
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x0043
            r0.delete()
            java.lang.String r0 = "dkcrash is the bad file ??"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0032
        L_0x0043:
            com.tencent.mm.sandbox.monitor.b r1 = new com.tencent.mm.sandbox.monitor.b
            r1.<init>()
            java.lang.String[] r0 = r0.list(r1)
            if (r0 == 0) goto L_0x0032
            int r1 = r0.length
            if (r1 != 0) goto L_0x0052
            goto L_0x0032
        L_0x0052:
            java.lang.String r1 = "."
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            int r7 = r0.length
            r8 = 0
        L_0x005a:
            if (r8 >= r7) goto L_0x007e
            r9 = r0[r8]
            java.lang.String[] r10 = r1.split(r9)
            if (r10 == 0) goto L_0x007b
            int r11 = r10.length
            if (r11 >= r5) goto L_0x0068
            goto L_0x007b
        L_0x0068:
            r11 = r10[r6]
            int r12 = r10.length
            if (r12 < r2) goto L_0x0070
            r10 = r10[r5]
            goto L_0x0072
        L_0x0070:
            java.lang.String r10 = ""
        L_0x0072:
            java.lang.String r12 = ".preventcrashlog"
            boolean r9 = r9.endsWith(r12)
            com.tencent.p014mm.sandbox.monitor.C85701f.m105853b(r11, r10, r9)
        L_0x007b:
            int r8 = r8 + 1
            goto L_0x005a
        L_0x007e:
            r0 = 1
        L_0x007f:
            if (r0 == 0) goto L_0x0159
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = com.tencent.p014mm.storage.C72994y1.f212832a
            r1.append(r7)
            java.lang.String r7 = "crashprevent/"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x00a6
            java.lang.String r0 = "checkPreventUpload dir never create ?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0157
        L_0x00a6:
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00b6
            r0.delete()
            java.lang.String r0 = "checkPreventUpload:crash is the bad file ??"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0157
        L_0x00b6:
            com.tencent.mm.sandbox.monitor.c r1 = new com.tencent.mm.sandbox.monitor.c
            r1.<init>()
            java.lang.String[] r1 = r0.list(r1)
            if (r1 == 0) goto L_0x0157
            int r0 = r1.length
            if (r0 != 0) goto L_0x00c6
            goto L_0x0157
        L_0x00c6:
            int r8 = r1.length
            r9 = 0
            r10 = 1
        L_0x00c9:
            if (r9 >= r8) goto L_0x0156
            r0 = r1[r9]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = com.tencent.p014mm.storage.C72994y1.f212832a
            r11.append(r12)
            r11.append(r7)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            byte[] r0 = com.tencent.p014mm.sandbox.monitor.C85706i.m105870f(r11, r6, r3)     // Catch:{ Exception -> 0x0127 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)     // Catch:{ Exception -> 0x0127 }
            if (r12 == 0) goto L_0x00ed
            r0 = 0
            goto L_0x0104
        L_0x00ed:
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0127 }
            int r13 = r0.length     // Catch:{ Exception -> 0x0127 }
            r12.unmarshall(r0, r6, r13)     // Catch:{ Exception -> 0x0127 }
            r12.setDataPosition(r6)     // Catch:{ Exception -> 0x0127 }
            java.lang.Class<com.tencent.mm.sandbox.monitor.ErrLog$PreventError> r0 = com.tencent.p014mm.sandbox.monitor.ErrLog$PreventError.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ Exception -> 0x0127 }
            android.os.Parcelable r0 = r12.readParcelable(r0)     // Catch:{ Exception -> 0x0127 }
            com.tencent.mm.sandbox.monitor.ErrLog$PreventError r0 = (com.tencent.p014mm.sandbox.monitor.ErrLog$PreventError) r0     // Catch:{ Exception -> 0x0127 }
        L_0x0104:
            if (r0 != 0) goto L_0x0107
            goto L_0x0152
        L_0x0107:
            java.lang.String r12 = r0.f249709g     // Catch:{ Exception -> 0x0127 }
            com.tencent.p014mm.sandbox.monitor.C30706a.m39157a(r12)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r12 = "checkPreventUpload processName:%s crashPreventPath:%s"
            java.lang.Object[] r13 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0127 }
            java.lang.String r14 = r0.f249709g     // Catch:{ Exception -> 0x0127 }
            r13[r6] = r14     // Catch:{ Exception -> 0x0127 }
            r13[r5] = r11     // Catch:{ Exception -> 0x0127 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r13)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r12 = r0.f249706d     // Catch:{ Exception -> 0x0127 }
            java.lang.String r13 = r0.f249707e     // Catch:{ Exception -> 0x0127 }
            com.tencent.mm.sandbox.monitor.ErrLog$Error r0 = r0.f249708f     // Catch:{ Exception -> 0x0127 }
            int r0 = com.tencent.p014mm.sandbox.monitor.C85701f.m105855d(r12, r13, r0, r11, r5)     // Catch:{ Exception -> 0x0127 }
            if (r0 != 0) goto L_0x0152
            r10 = 0
            goto L_0x0152
        L_0x0127:
            r0 = move-exception
            com.tencent.p014mm.sandbox.monitor.C85706i.m105866b(r11)
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r6] = r11
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r12[r5] = r11
            java.lang.String r0 = r0.getMessage()
            r12[r2] = r0
            java.lang.String r0 = "checkPreventUpload crashPreventPath:%s Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r12)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 1185(0x4a1, double:5.855E-321)
            r16 = 51
            r18 = 1
            r20 = 1
            r13.idkeyStat(r14, r16, r18, r20)
        L_0x0152:
            int r9 = r9 + 1
            goto L_0x00c9
        L_0x0156:
            r3 = r10
        L_0x0157:
            if (r3 != 0) goto L_0x015c
        L_0x0159:
            com.tencent.p014mm.sandbox.monitor.C85702g.m105857c(r22)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sandbox.monitor.CrashUploadAlarmReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
