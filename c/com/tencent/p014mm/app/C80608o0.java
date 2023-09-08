package com.tencent.p014mm.app;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.crash.CallbackForReset;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.crash.ISubReporter;
import com.tencent.p014mm.sdk.platformtools.CrashMonitorForJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p1061wj.C91004a;
import qe3.C89625d;

/* renamed from: com.tencent.mm.app.o0 */
public class C80608o0 implements ICrashReporter, MMUncaughtExceptionHandler.IReporter {

    /* renamed from: a */
    public static final long f235816a = Util.nowMilliSecond();

    /* renamed from: b */
    public static String f235817b = "";

    /* renamed from: c */
    public static final ParcelFileDescriptor[] f235818c = {null};

    /* renamed from: d */
    public static final ParcelFileDescriptor[] f235819d = {null};

    /* renamed from: e */
    public static final Set<ICrashReporter.ICrashReportExtraMessageGetter> f235820e = new HashSet();

    /* renamed from: f */
    public static final Set<ICrashReporter.ICrashReportListener> f235821f = new HashSet();

    /* renamed from: g */
    public static final String f235822g = ("version:" + C89625d.f257841g);

    /* renamed from: h */
    public static final CrashMonitorForJni.CrashExtraMessageGetter f235823h = new C80609a();

    /* renamed from: com.tencent.mm.app.o0$a */
    public class C80609a implements CrashMonitorForJni.CrashExtraMessageGetter {
        public String getExtraMessage() {
            StringBuilder sb = new StringBuilder();
            String processName = MMApplicationContext.getProcessName();
            if (processName != null && (processName.contains(":tools") || processName.contains(":appbrand") || processName.contains(":isolated_process0"))) {
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static String m98238a(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), AppMeasurement.CRASH_ORIGIN);
        File file2 = new File(file, "java_" + str.replace(XVFSFile.PATH_SEPARATOR_CHAR, '_') + "_" + System.currentTimeMillis() + "_" + str2 + ".dmp");
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: b */
    public static String m98239b(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), AppMeasurement.CRASH_ORIGIN);
        File file2 = new File(file, "NativeCrash_" + str.replace(XVFSFile.PATH_SEPARATOR_CHAR, '_') + "_" + System.currentTimeMillis() + "_" + str2 + ".dmp");
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: c */
    public static boolean m98240c(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, String str) {
        Objects.toString(parcelFileDescriptor);
        Objects.toString(parcelFileDescriptor2);
        f235817b = str;
        ParcelFileDescriptor[] parcelFileDescriptorArr = f235818c;
        synchronized (parcelFileDescriptorArr) {
            parcelFileDescriptorArr[0] = parcelFileDescriptor;
        }
        ParcelFileDescriptor[] parcelFileDescriptorArr2 = f235819d;
        synchronized (parcelFileDescriptorArr2) {
            parcelFileDescriptorArr2[0] = parcelFileDescriptor2;
        }
        C80608o0 o0Var = new C80608o0();
        MMApplicationContext.getContext();
        MMUncaughtExceptionHandler.setReporter(o0Var);
        CrashReportFactory.setupCrashReporter(o0Var);
        ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptorArr2[0];
        ParcelFileDescriptor parcelFileDescriptor4 = C91004a.f261102a;
        if (parcelFileDescriptor4 == null || parcelFileDescriptor4 == parcelFileDescriptor3) {
            C91004a.f261102a = parcelFileDescriptor3;
            int i = C91004a.C91006b.f261103a;
            return false;
        }
        throw new IllegalArgumentException("Try to change dumpTo fd after first calling instance().");
    }

    public void addCrashReportListener(ICrashReporter.ICrashReportListener iCrashReportListener) {
        if (iCrashReportListener != null) {
            ((HashSet) f235821f).add(iCrashReportListener);
        }
    }

    public void addExtraMessageGetter(ICrashReporter.ICrashReportExtraMessageGetter iCrashReportExtraMessageGetter) {
        if (iCrashReportExtraMessageGetter != null) {
            ((HashSet) f235820e).add(iCrashReportExtraMessageGetter);
        }
    }

    public void init(Context context, boolean z) {
        MMUncaughtExceptionHandler.setReporter(this);
    }

    public void removeCrashReportListener(ICrashReporter.ICrashReportListener iCrashReportListener) {
        if (iCrashReportListener != null) {
            ((HashSet) f235821f).remove(iCrashReportListener);
        }
    }

    public void reportCrashMessage(String str, String str2) {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportException(com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler r22, java.lang.String r23, java.lang.Throwable r24) {
        /*
            r21 = this;
            java.lang.String r0 = ""
            r1 = r24
            boolean r2 = r1 instanceof junit.framework.AssertionFailedError
            if (r2 == 0) goto L_0x001f
            java.lang.String r1 = r24.getMessage()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x001f
            r2 = r22
            java.lang.String r1 = r2.getReportByAssertPrefix(r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = r0
        L_0x0020:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.XWeb.MMIsolatedCrashReporter"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = 256(0x100, float:3.59E-43)
            r5.<init>(r0)
            android.util.StringBuilderPrinter r6 = new android.util.StringBuilderPrinter
            r6.<init>(r5)
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "#client.version="
            r0.append(r7)
            int r7 = qe3.C89625d.f257841g
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "#client.verhistory="
            r0.append(r7)
            r7 = 4
            java.lang.String r8 = eb0.C86487f6.m107217a(r7)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.String r0 = "#client.imei=0123456789ABCDEF"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "#accinfo.revision="
            r0.append(r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.String r0 = "#accinfo.uin=0"
            r6.println(r0)
            java.lang.String r0 = "#accinfo.dev="
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "#accinfo.runtime="
            r0.append(r8)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r10 = f235816a
            long r8 = r8 - r10
            r0.append(r8)
            java.lang.String r8 = "("
            r0.append(r8)
            java.lang.String r8 = f235817b
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r0.append(r8)
            java.lang.String r8 = ")"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "#accinfo.build="
            r0.append(r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.TIME
            r0.append(r8)
            java.lang.String r8 = ":"
            r0.append(r8)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.HOSTNAME
            r0.append(r9)
            r0.append(r8)
            int r9 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "#xsdkver="
            r0.append(r9)
            int r9 = com.tencent.xweb.XWebSdk.getXWebSdkVersion()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012f }
            r0.<init>()     // Catch:{ Exception -> 0x012f }
            java.lang.String r9 = "#xcorever="
            r0.append(r9)     // Catch:{ Exception -> 0x012f }
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x012f }
            int r9 = com.tencent.xweb.XWebSdk.getInstalledNewstVersion(r9)     // Catch:{ Exception -> 0x012f }
            r0.append(r9)     // Catch:{ Exception -> 0x012f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012f }
            r6.println(r0)     // Catch:{ Exception -> 0x012f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012f }
            r0.<init>()     // Catch:{ Exception -> 0x012f }
            java.lang.String r9 = "#syswebcore="
            r0.append(r9)     // Catch:{ Exception -> 0x012f }
            int r9 = com.tencent.xweb.XWebSdk.safeGetChromiumVersion()     // Catch:{ Exception -> 0x012f }
            r0.append(r9)     // Catch:{ Exception -> 0x012f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012f }
            r6.println(r0)     // Catch:{ Exception -> 0x012f }
            goto L_0x0148
        L_0x012f:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "get syswebcore failed: "
            r9.append(r10)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0148:
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r10 = r40.C89868a.m112382a()
            r11 = 0
            r0[r11] = r10
            java.lang.String r10 = "Activity dump before crash report, [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r0)
            com.tencent.mm.sdk.platformtools.CrashMonitorForJni$CrashExtraMessageGetter r0 = f235823h
            com.tencent.mm.app.o0$a r0 = (com.tencent.p014mm.app.C80608o0.C80609a) r0
            java.lang.String r0 = r0.getExtraMessage()
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "#accinfo.env="
            r0.append(r10)
            boolean r10 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r10 == 0) goto L_0x0173
            java.lang.String r10 = "f"
            goto L_0x0175
        L_0x0173:
            java.lang.String r10 = "b"
        L_0x0175:
            r0.append(r10)
            r0.append(r8)
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r0.append(r10)
            r0.append(r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.crash.CrashReportFactory.currentActivity
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            r8 = 5
            r10 = 3
            r12 = 2
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x0207 }
            java.io.File r13 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x0207 }
            java.lang.String r13 = r13.getPath()     // Catch:{ Exception -> 0x0207 }
            r0.<init>(r13)     // Catch:{ Exception -> 0x0207 }
            android.os.StatFs r13 = new android.os.StatFs     // Catch:{ Exception -> 0x0207 }
            java.lang.String r14 = a70.C112760b.m154230f0()     // Catch:{ Exception -> 0x0207 }
            r13.<init>(r14)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r14 = "%s:%d:%d:%d %s:%d:%d:%d"
            r15 = 8
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0207 }
            java.io.File r16 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x0207 }
            java.lang.String r16 = r16.getAbsolutePath()     // Catch:{ Exception -> 0x0207 }
            r15[r11] = r16     // Catch:{ Exception -> 0x0207 }
            int r16 = r0.getBlockSize()     // Catch:{ Exception -> 0x0207 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0207 }
            r15[r9] = r16     // Catch:{ Exception -> 0x0207 }
            int r16 = r0.getBlockCount()     // Catch:{ Exception -> 0x0207 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0207 }
            r15[r12] = r16     // Catch:{ Exception -> 0x0207 }
            int r0 = r0.getAvailableBlocks()     // Catch:{ Exception -> 0x0207 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0207 }
            r15[r10] = r0     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = a70.C112760b.m154230f0()     // Catch:{ Exception -> 0x0207 }
            r15[r7] = r0     // Catch:{ Exception -> 0x0207 }
            int r0 = r13.getBlockSize()     // Catch:{ Exception -> 0x0207 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0207 }
            r15[r8] = r0     // Catch:{ Exception -> 0x0207 }
            r0 = 6
            int r16 = r13.getBlockCount()     // Catch:{ Exception -> 0x0207 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0207 }
            r15[r0] = r16     // Catch:{ Exception -> 0x0207 }
            r0 = 7
            int r13 = r13.getAvailableBlocks()     // Catch:{ Exception -> 0x0207 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0207 }
            r15[r0] = r13     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = java.lang.String.format(r14, r15)     // Catch:{ Exception -> 0x0207 }
            goto L_0x0216
        L_0x0207:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r0 = r0.getMessage()
            r13[r11] = r0
            java.lang.String r0 = "check data size failed :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r13)
            r0 = r3
        L_0x0216:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "#accinfo.data="
            r4.append(r13)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r6.println(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.util.Locale r13 = java.util.Locale.getDefault()
            java.lang.String r14 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            r4.<init>(r14, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#accinfo.crashTime="
            r13.append(r14)
            java.lang.String r0 = r4.format(r0)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            r6.println(r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r13 = r0.totalMemory()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r15 = r0.freeMemory()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r17 = r0.maxMemory()
            long r19 = r13 - r15
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r0[r11] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r15)
            r0[r9] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            r0[r12] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r17)
            r0[r10] = r4
            java.lang.String r4 = com.tencent.mars.xlog.LogLogic.getVmSize()
            r0[r7] = r4
            java.lang.String r4 = "Runtime Mem[%s:%s:%s:%s] vmSize:%s"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r3 = com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105365c()
            r4 = 260(0x104, float:3.64E-43)
            if (r3 <= r4) goto L_0x02d7
            int r4 = com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105363a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r9] = r3
            java.util.List r3 = com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105366d()
            r0[r12] = r3
            java.lang.String r3 = "[threadInfo(%s:%s) %s]"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L_0x02d7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#accinfo.memory="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.println(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x0305
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "#"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
        L_0x0305:
            java.lang.String r0 = "#crashContent="
            r6.println(r0)
            java.lang.String r0 = r5.toString()
            r2.append(r0)
            r1 = r23
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x03a7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0324
            goto L_0x03a7
        L_0x0324:
            java.lang.String r2 = "MicroMsg.XWeb.MMIsolatedCrashReporter"
            r0 = r1
        L_0x0327:
            int r3 = r0.length()     // Catch:{ Exception -> 0x034f }
            r4 = 896(0x380, float:1.256E-42)
            if (r3 <= r4) goto L_0x034b
            java.lang.String r3 = r0.substring(r11, r4)     // Catch:{ Exception -> 0x034f }
            java.lang.String r4 = "\n"
            int r3 = r3.lastIndexOf(r4)     // Catch:{ Exception -> 0x034f }
            r4 = -1
            if (r4 != r3) goto L_0x033d
            goto L_0x034b
        L_0x033d:
            java.lang.String r4 = r0.substring(r11, r3)     // Catch:{ Exception -> 0x034f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ Exception -> 0x034f }
            int r3 = r3 + 1
            java.lang.String r0 = r0.substring(r3)     // Catch:{ Exception -> 0x034f }
            goto L_0x0327
        L_0x034b:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x034f }
            goto L_0x0357
        L_0x034f:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r4 = "Failed printing stack trace."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x0357:
            android.os.ParcelFileDescriptor[] r2 = f235818c
            monitor-enter(r2)
            r0 = r2[r11]     // Catch:{ all -> 0x03a4 }
            if (r0 == 0) goto L_0x03a2
            r3 = 0
            r0 = 3072(0xc00, float:4.305E-42)
            int r4 = r1.length()     // Catch:{ all -> 0x038e }
            if (r4 <= r0) goto L_0x036b
            java.lang.String r1 = r1.substring(r11, r0)     // Catch:{ all -> 0x038e }
        L_0x036b:
            java.lang.String r0 = r1.trim()     // Catch:{ all -> 0x038e }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x038e }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ all -> 0x038e }
            r5 = r2[r11]     // Catch:{ all -> 0x038e }
            java.io.FileDescriptor r5 = r5.getFileDescriptor()     // Catch:{ all -> 0x038e }
            r4.<init>(r5)     // Catch:{ all -> 0x038e }
            r1.<init>(r4)     // Catch:{ all -> 0x038e }
            java.lang.String r3 = f235822g     // Catch:{ all -> 0x038b }
            r1.print(r3)     // Catch:{ all -> 0x038b }
            r1.println(r0)     // Catch:{ all -> 0x038b }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)     // Catch:{ all -> 0x03a4 }
            goto L_0x03a2
        L_0x038b:
            r0 = move-exception
            r3 = r1
            goto L_0x038f
        L_0x038e:
            r0 = move-exception
        L_0x038f:
            java.lang.String r1 = "MicroMsg.XWeb.MMIsolatedCrashReporter"
            java.lang.String r4 = "writeException"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x039d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r5)     // Catch:{ all -> 0x039d }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)     // Catch:{ all -> 0x03a4 }
            goto L_0x03a2
        L_0x039d:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)     // Catch:{ all -> 0x03a4 }
            throw r0     // Catch:{ all -> 0x03a4 }
        L_0x03a2:
            monitor-exit(r2)     // Catch:{ all -> 0x03a4 }
            goto L_0x03a7
        L_0x03a4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03a4 }
            throw r0
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80608o0.reportException(com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler, java.lang.String, java.lang.Throwable):void");
    }

    public void reportJniCrash(int i, String str, String str2) {
    }

    /* JADX INFO: finally extract failed */
    public void reportRawMessage(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            ParcelFileDescriptor[] parcelFileDescriptorArr = f235818c;
            synchronized (parcelFileDescriptorArr) {
                if (parcelFileDescriptorArr[0] != null) {
                    PrintWriter printWriter = null;
                    try {
                        PrintWriter printWriter2 = new PrintWriter(new FileWriter(parcelFileDescriptorArr[0].getFileDescriptor()));
                        try {
                            printWriter2.print(f235822g);
                            printWriter2.println(str);
                            Util.qualityClose(printWriter2);
                        } catch (Throwable th) {
                            th = th;
                            printWriter = printWriter2;
                            try {
                                Log.printErrStackTrace("MicroMsg.XWeb.MMIsolatedCrashReporter", th, "reportRawMessage", new Object[0]);
                                Util.qualityClose(printWriter);
                            } catch (Throwable th4) {
                                Util.qualityClose(printWriter);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        Log.printErrStackTrace("MicroMsg.XWeb.MMIsolatedCrashReporter", th, "reportRawMessage", new Object[0]);
                        Util.qualityClose(printWriter);
                    }
                }
            }
        }
    }

    public void setCallbackForReset(CallbackForReset callbackForReset) {
        MMUncaughtExceptionHandler.setCallbackForReset(callbackForReset);
    }

    public void setReportID(String str) {
    }

    public void setupSubReporter(ISubReporter iSubReporter) {
    }
}
