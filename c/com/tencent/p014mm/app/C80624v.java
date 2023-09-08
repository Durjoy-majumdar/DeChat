package com.tencent.p014mm.app;

import android.app.Application;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;

/* renamed from: com.tencent.mm.app.v */
public class C80624v implements MMUncaughtExceptionHandler.IReporter {

    /* renamed from: a */
    public final /* synthetic */ Application f235894a;

    public C80624v(Application application) {
        this.f235894a = application;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x01b0 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportException(com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler r19, java.lang.String r20, java.lang.Throwable r21) {
        /*
            r18 = this;
            r0 = r20
            java.lang.String r1 = "crash_status_file"
            java.lang.String r2 = "MicroMsg.FirstCrashCatcher"
            java.lang.String r3 = "reportException()"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
            r3 = r18
            android.app.Application r4 = r3.f235894a
            java.lang.String r5 = bp3.C79757o.m96896a(r4)
            java.lang.String r6 = "support.weixin.qq.com"
            java.lang.String r7 = "activity"
            java.lang.String r8 = ":"
            java.lang.String r9 = "0"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "reportThrowable:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r11 = 2560(0xa00, float:3.587E-42)
            r10.<init>(r11)     // Catch:{ Exception -> 0x0310 }
            android.util.StringBuilderPrinter r11 = new android.util.StringBuilderPrinter     // Catch:{ Exception -> 0x0310 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r12.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = "#client.version="
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION     // Catch:{ Exception -> 0x0310 }
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r12)     // Catch:{ Exception -> 0x0310 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x0310 }
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = "#accinfo.revision=123321123"
            r11.println(r12)     // Catch:{ Exception -> 0x0310 }
            goto L_0x0074
        L_0x005e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r12.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = "#accinfo.revision="
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x0310 }
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r12)     // Catch:{ Exception -> 0x0310 }
        L_0x0074:
            java.lang.String r12 = com.tencent.p014mm.app.C80634x.m98271a(r4, r9)     // Catch:{ Exception -> 0x0310 }
            if (r12 == 0) goto L_0x0080
            boolean r13 = r12.equals(r9)     // Catch:{ Exception -> 0x0310 }
            if (r13 == 0) goto L_0x00a5
        L_0x0080:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r12.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = android.os.Build.DEVICE     // Catch:{ Exception -> 0x0310 }
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = android.os.Build.FINGERPRINT     // Catch:{ Exception -> 0x0310 }
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0310 }
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0310 }
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0310 }
            int r12 = r12.hashCode()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ Exception -> 0x0310 }
        L_0x00a5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r13.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r14 = "#accinfo.uin="
            r13.append(r14)     // Catch:{ Exception -> 0x0310 }
            r13.append(r12)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r12)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r12.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = "#accinfo.runtime="
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0310 }
            long r15 = com.tencent.p014mm.app.C80589e.f235761b     // Catch:{ Exception -> 0x0310 }
            long r13 = r13 - r15
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = "("
            r12.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r13 = ""
            if (r5 != 0) goto L_0x00d8
            r14 = r13
            goto L_0x00d9
        L_0x00d8:
            r14 = r5
        L_0x00d9:
            r12.append(r14)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r14 = ") by cup"
            r12.append(r14)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r12)     // Catch:{ Exception -> 0x0310 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x0310 }
            r14 = 0
            if (r12 == 0) goto L_0x00f3
            java.lang.String r8 = "#accinfo.build=99/88/2077 66:55 PM:amm-dev"
            r11.println(r8)     // Catch:{ Exception -> 0x0310 }
            goto L_0x0117
        L_0x00f3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r12.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r15 = "#accinfo.build="
            r12.append(r15)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r15 = a70.C79471a.f233017e     // Catch:{ Exception -> 0x0310 }
            r12.append(r15)     // Catch:{ Exception -> 0x0310 }
            r12.append(r8)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r15 = a70.C79471a.f233018f     // Catch:{ Exception -> 0x0310 }
            r12.append(r15)     // Catch:{ Exception -> 0x0310 }
            r12.append(r8)     // Catch:{ Exception -> 0x0310 }
            r12.append(r14)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r8 = r12.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r8)     // Catch:{ Exception -> 0x0310 }
        L_0x0117:
            java.io.File r16 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x01b0 }
            com.tencent.mm.vfs.m1 r16 = com.tencent.p014mm.vfs.C86009m1.m106378c(r16)     // Catch:{ Exception -> 0x01b0 }
            android.os.StatFs r15 = new android.os.StatFs     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r8 = r16.mo119976n()     // Catch:{ Exception -> 0x01b0 }
            r15.<init>(r8)     // Catch:{ Exception -> 0x01b0 }
            android.os.StatFs r8 = new android.os.StatFs     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r12 = com.tencent.p014mm.app.C80634x.m98272b(r4)     // Catch:{ Exception -> 0x01b0 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x01b0 }
            java.lang.Object r12 = r4.getSystemService(r7)     // Catch:{ Exception -> 0x01b0 }
            android.app.ActivityManager r12 = (android.app.ActivityManager) r12     // Catch:{ Exception -> 0x01b0 }
            int r12 = r12.getMemoryClass()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Object r7 = r4.getSystemService(r7)     // Catch:{ Exception -> 0x01b0 }
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch:{ Exception -> 0x01b0 }
            int r7 = r7.getLargeMemoryClass()     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r14 = "%dMB %dMB %s:%d:%d:%d %s:%d:%d:%d"
            r3 = 10
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01b0 }
            r17 = 0
            r3[r17] = r12     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01b0 }
            r12 = 1
            r3[r12] = r7     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r7 = r16.mo119971i()     // Catch:{ Exception -> 0x01b0 }
            r12 = 2
            r3[r12] = r7     // Catch:{ Exception -> 0x01b0 }
            r7 = 3
            int r12 = r15.getBlockSize()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01b0 }
            r3[r7] = r12     // Catch:{ Exception -> 0x01b0 }
            int r7 = r15.getBlockCount()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01b0 }
            r12 = 4
            r3[r12] = r7     // Catch:{ Exception -> 0x01b0 }
            r7 = 5
            int r12 = r15.getAvailableBlocks()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01b0 }
            r3[r7] = r12     // Catch:{ Exception -> 0x01b0 }
            r7 = 6
            java.lang.String r12 = com.tencent.p014mm.app.C80634x.m98272b(r4)     // Catch:{ Exception -> 0x01b0 }
            r3[r7] = r12     // Catch:{ Exception -> 0x01b0 }
            r7 = 7
            int r12 = r8.getBlockSize()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01b0 }
            r3[r7] = r12     // Catch:{ Exception -> 0x01b0 }
            r7 = 8
            int r12 = r8.getBlockCount()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01b0 }
            r3[r7] = r12     // Catch:{ Exception -> 0x01b0 }
            r7 = 9
            int r8 = r8.getAvailableBlocks()     // Catch:{ Exception -> 0x01b0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01b0 }
            r3[r7] = r8     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r13 = java.lang.String.format(r14, r3)     // Catch:{ Exception -> 0x01b0 }
        L_0x01b0:
            com.tencent.p014mm.app.C80588d1.m98205b(r21)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r3.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r7 = "#accinfo.data="
            r3.append(r7)     // Catch:{ Exception -> 0x0310 }
            r3.append(r13)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r3)     // Catch:{ Exception -> 0x0310 }
            java.util.Date r3 = new java.util.Date     // Catch:{ Exception -> 0x0310 }
            r3.<init>()     // Catch:{ Exception -> 0x0310 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0310 }
            java.lang.String r8 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.util.Locale r12 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0310 }
            r7.<init>(r8, r12)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r8.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r12 = "#accinfo.crashTime="
            r8.append(r12)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = r7.format(r3)     // Catch:{ Exception -> 0x0310 }
            r8.append(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x0310 }
            r11.println(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = "#crashContent="
            r11.println(r3)     // Catch:{ Exception -> 0x0310 }
            r3 = 4
            android.content.SharedPreferences r7 = r4.getSharedPreferences(r1, r3)     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = "channel"
            r8 = -1
            int r3 = r7.getInt(r3, r8)     // Catch:{ all -> 0x0202 }
            goto L_0x0203
        L_0x0202:
            r3 = 0
        L_0x0203:
            r7 = 1
            if (r3 != r7) goto L_0x021a
            r3 = 4
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r3)     // Catch:{ all -> 0x0214 }
            java.lang.String r3 = "googleplaysizelimit"
            r7 = 8192(0x2000, float:1.14794E-41)
            int r1 = r1.getInt(r3, r7)     // Catch:{ all -> 0x0214 }
            goto L_0x0215
        L_0x0214:
            r1 = 0
        L_0x0215:
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r1)     // Catch:{ Exception -> 0x0310 }
        L_0x021a:
            java.lang.String r1 = "first"
            com.tencent.p014mm.app.C0989k.m942a(r4, r5, r1)     // Catch:{ Exception -> 0x0310 }
            r11.println(r0)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r1.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = "cpu catch crash:"
            r1.append(r3)     // Catch:{ Exception -> 0x0310 }
            r1.append(r0)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0310 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x0310 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0310 }
            r0.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_ACTION_UNCATCH"
            r0.setAction(r1)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_USER_NAME"
            java.lang.String r2 = "never_login_crash"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r3.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r5 = r4.getPackageName()     // Catch:{ Exception -> 0x0310 }
            r3.append(r5)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r5 = "_preferences"
            r3.append(r5)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0310 }
            r5 = 0
            android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r5)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r5 = "login_user_name"
            java.lang.String r2 = r3.getString(r5, r2)     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_EXCEPTION_MSG"
            java.lang.String r2 = r10.toString()     // Catch:{ Exception -> 0x0310 }
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0310 }
            r3 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_DATA_PATH"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r2.<init>()     // Catch:{ Exception -> 0x0310 }
            java.io.File r3 = r4.getFilesDir()     // Catch:{ Exception -> 0x0310 }
            java.io.File r3 = r3.getParentFile()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0310 }
            r2.append(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = "/MicroMsg/crash/"
            r2.append(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_SDCARD_PATH"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r2.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = com.tencent.p014mm.app.C80634x.m98272b(r4)     // Catch:{ Exception -> 0x0310 }
            r2.append(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = "/tencent/MicroMsg/crash"
            r2.append(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_UIN"
            java.lang.String r2 = com.tencent.p014mm.app.C80634x.m98271a(r4, r9)     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_CLIENT_VERSION"
            java.lang.String r2 = a70.C79471a.f233015c     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_DEVICE_TYPE"
            java.lang.String r2 = a70.C79471a.f233016d     // Catch:{ Exception -> 0x0310 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "INTENT_EXTRA_TAG"
            java.lang.String r2 = "exception"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = "system_config_prefs"
            r2 = 0
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r2.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r3 = "https://"
            r2.append(r3)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = r1.getString(r6, r6)     // Catch:{ Exception -> 0x0310 }
            r2.append(r1)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = "INTENT_EXTRA_HOST"
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x0310 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0310 }
            r1.<init>()     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getSourcePackageName()     // Catch:{ Exception -> 0x0310 }
            r1.append(r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r2 = ".crash.FirstCrashUploadBroadcastReceiver"
            r1.append(r2)     // Catch:{ Exception -> 0x0310 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0310 }
            r0.setClassName(r4, r1)     // Catch:{ Exception -> 0x0310 }
            r4.sendBroadcast(r0)     // Catch:{ Exception -> 0x0310 }
        L_0x0310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80624v.reportException(com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler, java.lang.String, java.lang.Throwable):void");
    }
}
