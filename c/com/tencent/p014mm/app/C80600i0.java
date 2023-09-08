package com.tencent.p014mm.app;

import android.content.Intent;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.sdk.crash.CallbackForReset;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.crash.ISubReporter;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.CrashMonitorForJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C7624i3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mr3.C88832a;
import p156gj.C45918i0;
import p757xv.C91355x;
import s72.C90149c;
import um0.C22656e;
import um0.C22657f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.app.i0 */
public class C80600i0 implements ICrashReporter, MMUncaughtExceptionHandler.IReporter, CoreService.C80801f {

    /* renamed from: i */
    public static final long f235790i = Util.nowMilliSecond();

    /* renamed from: j */
    public static final Set<ICrashReporter.ICrashReportExtraMessageGetter> f235791j = new HashSet();

    /* renamed from: k */
    public static final Set<ICrashReporter.ICrashReportListener> f235792k = new HashSet();

    /* renamed from: l */
    public static String f235793l = "";

    /* renamed from: m */
    public static String f235794m = null;

    /* renamed from: n */
    public static long f235795n = 0;

    /* renamed from: o */
    public static boolean f235796o = false;

    /* renamed from: p */
    public static String f235797p = "Handle-ANR-History";

    /* renamed from: q */
    public static boolean f235798q = false;

    /* renamed from: r */
    public static ICrashReporter.ICrashExpansionDelegate f235799r = null;

    /* renamed from: s */
    public static CrashMonitorForJni.CrashExtraMessageGetter f235800s = new i0$$g();

    /* renamed from: t */
    public static final boolean[] f235801t = {false};

    /* renamed from: u */
    public static long[] f235802u = {0, 0, 0};

    /* renamed from: a */
    public volatile long f235803a = 0;

    /* renamed from: b */
    public HashSet<String> f235804b;

    /* renamed from: c */
    public String f235805c;

    /* renamed from: d */
    public String f235806d;

    /* renamed from: e */
    public ConditionVariable f235807e;

    /* renamed from: f */
    public final Handler f235808f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public final Runnable f235809g = new i0$$h(this);

    /* renamed from: h */
    public volatile i0$$l f235810h;

    /* renamed from: a */
    public static void m98219a(String str) {
        try {
            ((C119157j) C119157j.f356862d).mo183876g(new i0$$b(str), f235797p);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMCrashReporter", "saveAnrLocal failed, msg = " + th.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x04bd A[Catch:{ Exception -> 0x04e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x036d A[Catch:{ Exception -> 0x04e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0383 A[Catch:{ Exception -> 0x04e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0412 A[Catch:{ Exception -> 0x04e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0466 A[Catch:{ Exception -> 0x04e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x047c A[Catch:{ Exception -> 0x04e3 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.StringBuilder m98220b(java.lang.String r18, boolean r19, java.lang.String r20, p757xv.C91355x r21) {
        /*
            r1 = r21
            java.lang.String r2 = "webview_url_prefs_url"
            java.lang.String r3 = ")"
            java.lang.String r4 = "("
            java.lang.String r0 = ":"
            java.lang.String r5 = "\n"
            java.lang.String r6 = ""
            java.lang.String r7 = "MicroMsg.MMCrashReporter"
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 600(0x258, float:8.41E-43)
            r8.<init>(r9)
            r9 = 0
            java.lang.String r10 = " "
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            r10 = 10
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e3 }
            r11.<init>()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = "#build.info="
            r11.append(r12)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.info()     // Catch:{ Exception -> 0x04e3 }
            r11.append(r12)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r11)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r11 = "#client.version="
            r8.append(r11)     // Catch:{ Exception -> 0x04e3 }
            r11 = r20
            r8.append(r11)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r11 = "#client.verHistory="
            r8.append(r11)     // Catch:{ Exception -> 0x04e3 }
            r11 = 4
            java.lang.String r12 = eb0.C86487f6.m107217a(r11)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = "#client.revision="
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x04e3 }
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = "#client.uin="
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            eb0.i3 r12 = eb0.C7624i3.f25910c     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r13 = "last_login_uin"
            java.lang.String r14 = p156gj.C87203t.m108273i()     // Catch:{ Exception -> 0x04e3 }
            int r14 = r14.hashCode()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r14 = p823sg.C77710q.m93738a(r14)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = r12.mo19a(r13, r14)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = "#client.dev="
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = p156gj.C87203t.m108273i()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = "#client.build="
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.TIME     // Catch:{ Exception -> 0x04e3 }
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.HOSTNAME     // Catch:{ Exception -> 0x04e3 }
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            int r0 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#client.runtime="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x04e3 }
            long r14 = f235790i     // Catch:{ Exception -> 0x04e3 }
            long r12 = r12 - r14
            r8.append(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r4)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = f235793l     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r3)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#client.IMEI="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r12 = 1
            java.lang.String r0 = p156gj.C87203t.m108270f(r12)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#client.abi="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = android.os.Build.CPU_ABI     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#qbrwoser.coreVersion="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r9)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#qbrwoser.ver="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r9)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#status.dwx_bt="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.isDualByTools()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r13 = "1"
            java.lang.String r14 = "0"
            if (r0 == 0) goto L_0x011b
            r0 = r13
            goto L_0x011c
        L_0x011b:
            r0 = r14
        L_0x011c:
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#status.xh="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.isHookedByXposed()     // Catch:{ Exception -> 0x04e3 }
            if (r0 == 0) goto L_0x012f
            r0 = r13
            goto L_0x0130
        L_0x012f:
            r0 = r14
        L_0x0130:
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#status.x86_env="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.isX86Env()     // Catch:{ Exception -> 0x04e3 }
            if (r0 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r13 = r14
        L_0x0143:
            r8.append(r13)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#xsdkver="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            int r0 = com.tencent.xweb.XWebSdk.getXWebSdkVersion()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#accinfo.foreground="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE     // Catch:{ Exception -> 0x04e3 }
            boolean r13 = r0.f343454n     // Catch:{ Exception -> 0x04e3 }
            r8.append(r13)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r13 = "#accinfo.currentThread="
            r8.append(r13)     // Catch:{ Exception -> 0x04e3 }
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r13)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r13 = "#accinfo.currentActivity="
            r8.append(r13)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = r0.mo174210c()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.util.Date r0 = new java.util.Date     // Catch:{ Exception -> 0x04e3 }
            r0.<init>()     // Catch:{ Exception -> 0x04e3 }
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r14 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.util.Locale r15 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x04e3 }
            r13.<init>(r14, r15)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r14 = "#accinfo.crashTime="
            r8.append(r14)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = r13.format(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "build header."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x04e3 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x025f }
            java.io.File r13 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x025f }
            java.lang.String r13 = r13.getPath()     // Catch:{ Exception -> 0x025f }
            r0.<init>(r13)     // Catch:{ Exception -> 0x025f }
            android.os.StatFs r13 = new android.os.StatFs     // Catch:{ Exception -> 0x025f }
            java.lang.String r14 = a70.C112760b.m154230f0()     // Catch:{ Exception -> 0x025f }
            r13.<init>(r14)     // Catch:{ Exception -> 0x025f }
            java.util.concurrent.CountDownLatch r14 = new java.util.concurrent.CountDownLatch     // Catch:{ Exception -> 0x025f }
            r14.<init>(r12)     // Catch:{ Exception -> 0x025f }
            zt3.t r15 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x025f }
            com.tencent.mm.app.i0$$f r10 = new com.tencent.mm.app.i0$$f     // Catch:{ Exception -> 0x025f }
            r10.<init>(r14)     // Catch:{ Exception -> 0x025f }
            zt3.j r15 = (zt3.C119157j) r15     // Catch:{ Exception -> 0x025f }
            r15.mo183875f(r10)     // Catch:{ Exception -> 0x025f }
            r11 = 2
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x025f }
            r14.await(r11, r15)     // Catch:{ Exception -> 0x025f }
            java.lang.String r11 = "%s:%d:%d:%d %d:%d:%d %s:%d:%d:%d"
            r12 = 11
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x025f }
            java.io.File r14 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x025f }
            java.lang.String r14 = r14.getAbsolutePath()     // Catch:{ Exception -> 0x025f }
            r12[r9] = r14     // Catch:{ Exception -> 0x025f }
            long r14 = r0.getBlockSizeLong()     // Catch:{ Exception -> 0x025f }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x025f }
            r10 = 1
            r12[r10] = r14     // Catch:{ Exception -> 0x025f }
            long r14 = r0.getBlockCountLong()     // Catch:{ Exception -> 0x025f }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x025f }
            r15 = 2
            r12[r15] = r14     // Catch:{ Exception -> 0x025f }
            r14 = 3
            long r16 = r0.getAvailableBlocksLong()     // Catch:{ Exception -> 0x025f }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x025f }
            r12[r14] = r0     // Catch:{ Exception -> 0x025f }
            long[] r0 = f235802u     // Catch:{ Exception -> 0x025f }
            r16 = r0[r9]     // Catch:{ Exception -> 0x025f }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x025f }
            r14 = 4
            r12[r14] = r0     // Catch:{ Exception -> 0x025f }
            r0 = 5
            long[] r14 = f235802u     // Catch:{ Exception -> 0x025f }
            r10 = 1
            r16 = r14[r10]     // Catch:{ Exception -> 0x025f }
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x025f }
            r12[r0] = r14     // Catch:{ Exception -> 0x025f }
            r0 = 6
            long[] r14 = f235802u     // Catch:{ Exception -> 0x025f }
            r16 = r14[r15]     // Catch:{ Exception -> 0x025f }
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x025f }
            r12[r0] = r14     // Catch:{ Exception -> 0x025f }
            r0 = 7
            java.lang.String r14 = a70.C112760b.m154230f0()     // Catch:{ Exception -> 0x025f }
            r12[r0] = r14     // Catch:{ Exception -> 0x025f }
            r0 = 8
            long r14 = r13.getBlockSizeLong()     // Catch:{ Exception -> 0x025f }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x025f }
            r12[r0] = r14     // Catch:{ Exception -> 0x025f }
            r0 = 9
            long r14 = r13.getBlockCountLong()     // Catch:{ Exception -> 0x025f }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x025f }
            r12[r0] = r14     // Catch:{ Exception -> 0x025f }
            long r13 = r13.getAvailableBlocksLong()     // Catch:{ Exception -> 0x025f }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x025f }
            r13 = 10
            r12[r13] = r0     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = java.lang.String.format(r11, r12)     // Catch:{ Exception -> 0x025f }
            goto L_0x026f
        L_0x025f:
            r0 = move-exception
            java.lang.String r11 = "check data size failed :%s"
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x04e3 }
            r12[r9] = r0     // Catch:{ Exception -> 0x04e3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r11, r12)     // Catch:{ Exception -> 0x04e3 }
            r0 = r6
        L_0x026f:
            java.lang.String r11 = "#accinfo.data="
            r8.append(r11)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r11 = 10
            r8.append(r11)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#xwalk.coreVersion="
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x02ce }
            int r0 = com.tencent.xweb.XWebSdk.getInstalledNewstVersion(r0)     // Catch:{ Exception -> 0x02ce }
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            r11 = 10
            r8.append(r11)     // Catch:{ Exception -> 0x02ce }
            boolean r0 = com.tencent.xweb.XWebSdk.isXWebApplicationContextReady()     // Catch:{ Exception -> 0x02ce }
            if (r0 == 0) goto L_0x02a8
            java.lang.String r0 = "#xwalk.sysWebCore="
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            int r0 = com.tencent.xweb.XWebSdk.safeGetChromiumVersion()     // Catch:{ Exception -> 0x02ce }
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            r11 = 10
            r8.append(r11)     // Catch:{ Exception -> 0x02ce }
        L_0x02a8:
            java.lang.String r0 = "#xweb.multiProcessType="
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            int r0 = com.tencent.xweb.XWebSdk.getMultiProcessType()     // Catch:{ Exception -> 0x02ce }
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            java.lang.String r0 = "(0-disable;1-render;2-render&gpu)"
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            r11 = 10
            r8.append(r11)     // Catch:{ Exception -> 0x02ce }
            java.lang.String r0 = "#xweb.enableSandbox="
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            boolean r0 = com.tencent.xweb.XWebSdk.getEnableSandbox()     // Catch:{ Exception -> 0x02ce }
            r8.append(r0)     // Catch:{ Exception -> 0x02ce }
            r8.append(r11)     // Catch:{ Exception -> 0x02ce }
            goto L_0x02d4
        L_0x02ce:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x04e3 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r11)     // Catch:{ Exception -> 0x04e3 }
        L_0x02d4:
            java.util.List r0 = com.tencent.xweb.xwalk.plugin.XWalkPluginManager.getAllPlugins()     // Catch:{ Exception -> 0x0357 }
            java.lang.String r11 = "="
            java.lang.String r12 = "#xwalk."
            if (r0 == 0) goto L_0x0315
            boolean r13 = r0.isEmpty()     // Catch:{ Exception -> 0x0357 }
            if (r13 != 0) goto L_0x0315
            java.lang.String r13 = "#xwalk.pluginInit=true\n"
            r8.append(r13)     // Catch:{ Exception -> 0x0357 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0357 }
        L_0x02ed:
            boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x0357 }
            if (r13 == 0) goto L_0x0362
            java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x0357 }
            com.tencent.xweb.xwalk.plugin.XWalkPlugin r13 = (com.tencent.xweb.xwalk.plugin.XWalkPlugin) r13     // Catch:{ Exception -> 0x0357 }
            if (r13 == 0) goto L_0x02ed
            r8.append(r12)     // Catch:{ Exception -> 0x0357 }
            java.lang.String r14 = r13.getPluginName()     // Catch:{ Exception -> 0x0357 }
            r8.append(r14)     // Catch:{ Exception -> 0x0357 }
            r8.append(r11)     // Catch:{ Exception -> 0x0357 }
            int r13 = r13.getAvailableVersion()     // Catch:{ Exception -> 0x0357 }
            r8.append(r13)     // Catch:{ Exception -> 0x0357 }
            r13 = 10
            r8.append(r13)     // Catch:{ Exception -> 0x0357 }
            goto L_0x02ed
        L_0x0315:
            java.lang.String r0 = "#xwalk.pluginInit=false\n"
            r8.append(r0)     // Catch:{ Exception -> 0x0357 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0357 }
            java.util.Map r0 = com.tencent.xweb.xwalk.plugin.XWalkPluginManager.getInstalledPluginVersions(r0)     // Catch:{ Exception -> 0x0357 }
            if (r0 == 0) goto L_0x0362
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0357 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0357 }
        L_0x032c:
            boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x0357 }
            if (r13 == 0) goto L_0x0362
            java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x0357 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ Exception -> 0x0357 }
            if (r13 != 0) goto L_0x033b
            goto L_0x032c
        L_0x033b:
            r8.append(r12)     // Catch:{ Exception -> 0x0357 }
            java.lang.Object r14 = r13.getKey()     // Catch:{ Exception -> 0x0357 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0357 }
            r8.append(r14)     // Catch:{ Exception -> 0x0357 }
            r8.append(r11)     // Catch:{ Exception -> 0x0357 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x0357 }
            r8.append(r13)     // Catch:{ Exception -> 0x0357 }
            r13 = 10
            r8.append(r13)     // Catch:{ Exception -> 0x0357 }
            goto L_0x032c
        L_0x0357:
            r0 = move-exception
            java.lang.String r11 = "get xwalk plugin info error "
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x04e3 }
            r10[r9] = r0     // Catch:{ Exception -> 0x04e3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r11, r10)     // Catch:{ Exception -> 0x04e3 }
        L_0x0362:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ Exception -> 0x04e3 }
            r10 = 0
            java.lang.String r0 = r0.getString(r2, r10)     // Catch:{ Exception -> 0x04e3 }
            if (r0 == 0) goto L_0x0381
            java.lang.String r10 = "#qbrowser.url="
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r10 = 10
            r8.append(r10)     // Catch:{ Exception -> 0x04e3 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ Exception -> 0x04e3 }
            r0.remove(r2)     // Catch:{ Exception -> 0x04e3 }
        L_0x0381:
            if (r19 == 0) goto L_0x039e
            com.tencent.mm.sdk.platformtools.CrashMonitorForJni$CrashExtraMessageGetter r0 = f235800s     // Catch:{ Exception -> 0x04e3 }
            com.tencent.mm.app.i0$$g r0 = (com.tencent.p014mm.app.i0$$g) r0     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = r0.getExtraMessage()     // Catch:{ Exception -> 0x04e3 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04e3 }
            if (r2 != 0) goto L_0x039e
            java.lang.String r2 = "#extraCrashMsg="
            r8.append(r2)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r2 = 10
            r8.append(r2)     // Catch:{ Exception -> 0x04e3 }
        L_0x039e:
            java.lang.String r0 = "#appUserId="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            int r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppUserId()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r5)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#appUserInfo="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppUserInfo(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r5)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#appUserProfile="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppProfile(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r5)     // Catch:{ Exception -> 0x04e3 }
            if (r1 == 0) goto L_0x0408
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0400 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x0400 }
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_high_vmsize_threshold     // Catch:{ all -> 0x0400 }
            r10 = 3700000(0x387520, double:1.828043E-317)
            long r10 = r0.mo58777He(r2, r10)     // Catch:{ all -> 0x0400 }
            int r0 = r1.f262003e     // Catch:{ all -> 0x0400 }
            long r12 = (long) r0     // Catch:{ all -> 0x0400 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0400 }
            long r12 = r0.longValue()     // Catch:{ all -> 0x0400 }
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x03fb
            java.lang.String r0 = "#runtime.highVmSize=1\n"
            r8.append(r0)     // Catch:{ all -> 0x0400 }
            goto L_0x0400
        L_0x03fb:
            java.lang.String r0 = "#runtime.highVmSize=0\n"
            r8.append(r0)     // Catch:{ all -> 0x0400 }
        L_0x0400:
            java.lang.String r0 = "#runtime.memory="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
        L_0x0408:
            com.tencent.mm.sdk.crash.ICrashReporter$ICrashExpansionDelegate r0 = f235799r     // Catch:{ Exception -> 0x04e3 }
            if (r0 == 0) goto L_0x0466
            boolean r0 = r0.needObbRes()     // Catch:{ Exception -> 0x04e3 }
            if (r0 == 0) goto L_0x0466
            java.lang.String r0 = "not found"
            com.tencent.mm.sdk.crash.ICrashReporter$ICrashExpansionDelegate r1 = f235799r     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r1 = r1.getObbInfo()     // Catch:{ Exception -> 0x04e3 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x04e3 }
            if (r2 != 0) goto L_0x0422
            r0 = r1
            goto L_0x0443
        L_0x0422:
            com.tencent.mm.sdk.crash.ICrashReporter$ICrashExpansionDelegate r1 = f235799r     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r1 = r1.getLastObbErrorInfo()     // Catch:{ Exception -> 0x04e3 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x04e3 }
            if (r2 != 0) goto L_0x0443
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e3 }
            r2.<init>()     // Catch:{ Exception -> 0x04e3 }
            r2.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r2.append(r4)     // Catch:{ Exception -> 0x04e3 }
            r2.append(r1)     // Catch:{ Exception -> 0x04e3 }
            r2.append(r3)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x04e3 }
        L_0x0443:
            java.lang.String r1 = "#expansions="
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "#classloader="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x04e3 }
            java.lang.ClassLoader r0 = r0.getContextClassLoader()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            goto L_0x0470
        L_0x0466:
            java.lang.String r0 = "#expansions=disabled"
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
        L_0x0470:
            java.lang.String r0 = r40.C89868a.m112382a()     // Catch:{ Exception -> 0x04e3 }
            int r1 = r0.length()     // Catch:{ Exception -> 0x04e3 }
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 <= r2) goto L_0x0480
            java.lang.String r0 = r0.substring(r9, r2)     // Catch:{ Exception -> 0x04e3 }
        L_0x0480:
            java.lang.String r1 = "#runtime.Activity dump ["
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r0 = "]\n\n"
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            int r0 = com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105365c()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r1 = "#runtime.processThreadCount="
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            r1 = 130(0x82, float:1.82E-43)
            if (r0 >= r1) goto L_0x04a6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x04e3 }
            if (r0 == 0) goto L_0x04b7
        L_0x04a6:
            java.lang.String r0 = "#runtime.threadInfo="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            java.util.List r0 = com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105366d()     // Catch:{ Exception -> 0x04e3 }
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
        L_0x04b7:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)     // Catch:{ Exception -> 0x04e3 }
            if (r0 != 0) goto L_0x04cc
            java.lang.String r0 = "#subHeader="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = r18
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
        L_0x04cc:
            java.lang.String r0 = "#crashContent="
            r8.append(r0)     // Catch:{ Exception -> 0x04e3 }
            r1 = 10
            r8.append(r1)     // Catch:{ Exception -> 0x04e3 }
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x04e3 }
            com.tencent.mm.app.j0 r1 = new com.tencent.mm.app.j0     // Catch:{ Exception -> 0x04e3 }
            r1.<init>()     // Catch:{ Exception -> 0x04e3 }
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ Exception -> 0x04e3 }
            r0.mo183875f(r1)     // Catch:{ Exception -> 0x04e3 }
            goto L_0x04e9
        L_0x04e3:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r1)
        L_0x04e9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.m98220b(java.lang.String, boolean, java.lang.String, xv.x):java.lang.StringBuilder");
    }

    /* renamed from: d */
    public static void m98221d() {
        try {
            ((C119157j) C119157j.f356862d).mo183876g(new i0$$c(), f235797p);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMCrashReporter", "deleteAnrHistory failed, msg = " + th.getMessage());
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: g */
    public static void m98222g(android.content.Context r8, java.lang.String r9) {
        /*
            long[] r0 = f235802u
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r4 = 1
            r0[r4] = r2
            r5 = 2
            r0[r5] = r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 >= r2) goto L_0x0068
            long[] r0 = f235802u
            monitor-enter(r0)
            java.lang.Class<android.content.pm.PackageManager> r2 = android.content.pm.PackageManager.class
            java.lang.String r3 = "getPackageSizeInfo"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0044 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch:{ Exception -> 0x0044 }
            java.lang.Class<android.content.pm.IPackageStatsObserver> r7 = android.content.p929pm.IPackageStatsObserver.class
            r6[r4] = r7     // Catch:{ Exception -> 0x0044 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch:{ Exception -> 0x0044 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ Exception -> 0x0044 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0044 }
            r3[r1] = r9     // Catch:{ Exception -> 0x0044 }
            com.tencent.mm.app.i0$$j r9 = new com.tencent.mm.app.i0$$j     // Catch:{ Exception -> 0x0044 }
            r9.<init>()     // Catch:{ Exception -> 0x0044 }
            r3[r4] = r9     // Catch:{ Exception -> 0x0044 }
            r2.invoke(r8, r3)     // Catch:{ Exception -> 0x0044 }
            long[] r8 = f235802u     // Catch:{ Exception -> 0x0044 }
            r2 = 500(0x1f4, double:2.47E-321)
            r8.wait(r2)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0061
        L_0x0042:
            r8 = move-exception
            goto L_0x0066
        L_0x0044:
            r8 = move-exception
            long[] r9 = f235802u     // Catch:{ all -> 0x0042 }
            r2 = -1
            r9[r1] = r2     // Catch:{ all -> 0x0042 }
            r9[r4] = r2     // Catch:{ all -> 0x0042 }
            r9[r5] = r2     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = "MicroMsg.MMCrashReporter"
            java.lang.String r2 = "crash e:"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0042 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r2, r1)     // Catch:{ all -> 0x0042 }
            long[] r8 = f235802u     // Catch:{ all -> 0x0042 }
            monitor-enter(r8)     // Catch:{ all -> 0x0042 }
            long[] r9 = f235802u     // Catch:{ all -> 0x0063 }
            r9.notify()     // Catch:{ all -> 0x0063 }
            monitor-exit(r8)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0068
        L_0x0063:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0063 }
            throw r9     // Catch:{ all -> 0x0042 }
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r8
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.m98222g(android.content.Context, java.lang.String):void");
    }

    /* renamed from: h */
    public static void m98223h(String str) {
        while (str.length() > 896) {
            try {
                int lastIndexOf = str.substring(0, C22657f.CTRL_INDEX).lastIndexOf("\n");
                if (-1 == lastIndexOf) {
                    Log.m105920e("MicroMsg.MMCrashReporter", str.substring(0, C22657f.CTRL_INDEX));
                    str = str.substring(C22656e.CTRL_INDEX);
                } else {
                    Log.m105920e("MicroMsg.MMCrashReporter", str.substring(0, lastIndexOf));
                    str = str.substring(lastIndexOf + 1);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMCrashReporter", e, "Failed printing stack trace.", new Object[0]);
                return;
            }
        }
        Log.m105920e("MicroMsg.MMCrashReporter", str);
        Log.appenderFlush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        f235793l = r10;
        f235799r = r9;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.MMCrashReporter", "setup MMCrashReporter, %s, %s, %s", r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (s72.C90149c.f258834a != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        s72.C90149c.f258834a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r8 = new com.tencent.p014mm.app.C80600i0();
        r8.init(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), false);
        com.tencent.p014mm.sdk.crash.CrashReportFactory.setupCrashReporter(r8);
        p206nj.C88957l.m111079o("wechatcrash", com.tencent.nativecrash.NativeCrash.class.getClassLoader());
        p1061wj.C91007b.C91010c.f261108a.f261104a = f235800s;
        r8 = a70.C112760b.m154225d();
        r9 = eb0.C86487f6.f251311d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10 = zt3.C119157j.f356862d;
        r0 = new eb0.C86486e6(r8);
        r10 = (zt3.C119157j) r10;
        r10.getClass();
        r9[0] = r10.mo183887r(r0, 0, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r8 = f235799r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r8 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r8.isInstalled("rabbiteye") != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MMCrashReporter", "reportPreviousAnr not in main thread, return");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new com.tencent.p014mm.app.i0$$a(), f235797p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MMCrashReporter", "reportPreviousAnr failed, msg = " + r8.getMessage());
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fa  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m98224l(s72.C90148b r8, com.tencent.p014mm.sdk.crash.ICrashReporter.ICrashExpansionDelegate r9, java.lang.String r10) {
        /*
            boolean[] r0 = f235801t
            r1 = 0
            boolean r2 = r0[r1]
            if (r2 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r0)
            boolean r2 = r0[r1]     // Catch:{ all -> 0x020e }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x020e }
            return r1
        L_0x000f:
            r2 = 1
            r0[r1] = r2     // Catch:{ all -> 0x020e }
            monitor-exit(r0)     // Catch:{ all -> 0x020e }
            f235793l = r10
            f235799r = r9
            java.lang.String r0 = "MicroMsg.MMCrashReporter"
            java.lang.String r3 = "setup MMCrashReporter, %s, %s, %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r2] = r9
            r9 = 2
            r4[r9] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            s72.b r9 = s72.C90149c.f258834a
            if (r9 != 0) goto L_0x002f
            s72.C90149c.f258834a = r8
        L_0x002f:
            com.tencent.mm.app.i0 r8 = new com.tencent.mm.app.i0
            r8.<init>()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8.init(r9, r1)
            com.tencent.p014mm.sdk.crash.CrashReportFactory.setupCrashReporter(r8)
            java.lang.String r8 = "wechatcrash"
            java.lang.Class<com.tencent.nativecrash.NativeCrash> r9 = com.tencent.nativecrash.NativeCrash.class
            java.lang.ClassLoader r9 = r9.getClassLoader()
            p206nj.C88957l.m111079o(r8, r9)
            wj.b r8 = p1061wj.C91007b.C91010c.f261108a
            com.tencent.mm.sdk.platformtools.CrashMonitorForJni$CrashExtraMessageGetter r9 = f235800s
            r8.f261104a = r9
            java.lang.String r8 = a70.C112760b.m154225d()
            java.util.concurrent.Future<eb0.f6>[] r9 = eb0.C86487f6.f251311d
            monitor-enter(r9)
            zt3.t r10 = zt3.C119157j.f356862d     // Catch:{ all -> 0x020b }
            eb0.e6 r0 = new eb0.e6     // Catch:{ all -> 0x020b }
            r0.<init>(r8)     // Catch:{ all -> 0x020b }
            zt3.j r10 = (zt3.C119157j) r10     // Catch:{ all -> 0x020b }
            r10.getClass()     // Catch:{ all -> 0x020b }
            r8 = 0
            r3 = 0
            lu3.c r8 = r10.mo183887r(r0, r3, r8)     // Catch:{ all -> 0x020b }
            r9[r1] = r8     // Catch:{ all -> 0x020b }
            monitor-exit(r9)     // Catch:{ all -> 0x020b }
            com.tencent.mm.sdk.crash.ICrashReporter$ICrashExpansionDelegate r8 = f235799r
            if (r8 == 0) goto L_0x007c
            java.lang.String r9 = "rabbiteye"
            boolean r8 = r8.isInstalled(r9)
            if (r8 != 0) goto L_0x007c
            goto L_0x018f
        L_0x007c:
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            android.os.Looper r9 = android.os.Looper.myLooper()
            java.lang.String r10 = "MicroMsg.MMCrashReporter"
            if (r8 == r9) goto L_0x008f
            java.lang.String r8 = "reportPreviousAnr not in main thread, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            goto L_0x00b8
        L_0x008f:
            zt3.t r8 = zt3.C119157j.f356862d     // Catch:{ all -> 0x009e }
            com.tencent.mm.app.i0$$a r9 = new com.tencent.mm.app.i0$$a     // Catch:{ all -> 0x009e }
            r9.<init>()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = f235797p     // Catch:{ all -> 0x009e }
            zt3.j r8 = (zt3.C119157j) r8     // Catch:{ all -> 0x009e }
            r8.mo183876g(r9, r0)     // Catch:{ all -> 0x009e }
            goto L_0x00b8
        L_0x009e:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "reportPreviousAnr failed, msg = "
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r8)
        L_0x00b8:
            java.lang.String r8 = "anrTrace is enabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            java.io.File r8 = new java.io.File
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r9 = r9.getFilesDir()
            java.lang.String r0 = "anr"
            r8.<init>(r9, r0)
            boolean r9 = r8.exists()
            if (r9 != 0) goto L_0x00e9
            java.lang.String r9 = "anrTraceDir not exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            boolean r9 = r8.mkdirs()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0[r1] = r9
            java.lang.String r9 = "anrTraceDir mkdirs = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r0)
            goto L_0x00ee
        L_0x00e9:
            java.lang.String r9 = "anrTraceDir exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x00ee:
            java.io.File r9 = new java.io.File
            java.lang.String r0 = "currentAnr.trace"
            r9.<init>(r8, r0)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "anrTraceFilePath = "
            r0.append(r5)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            java.lang.String r0 = ""
            java.lang.String r5 = "printTrace is enabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)     // Catch:{ all -> 0x015c }
            boolean r5 = r8.exists()     // Catch:{ all -> 0x015c }
            if (r5 != 0) goto L_0x0134
            java.lang.String r5 = "printTraceDir not exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)     // Catch:{ all -> 0x015c }
            boolean r5 = r8.mkdirs()     // Catch:{ all -> 0x015c }
            java.lang.String r6 = "printTraceDir mkdirs = %b"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x015c }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x015c }
            r7[r1] = r5     // Catch:{ all -> 0x015c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r7)     // Catch:{ all -> 0x015c }
            goto L_0x013a
        L_0x0134:
            java.lang.String r5 = "printTraceDir exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)     // Catch:{ all -> 0x015c }
        L_0x013a:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x015c }
            java.lang.String r6 = "print.trace"
            r5.<init>(r8, r6)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r8.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "printTraceFilePath = "
            r8.append(r5)     // Catch:{ all -> 0x015c }
            r8.append(r0)     // Catch:{ all -> 0x015c }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x015c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)     // Catch:{ all -> 0x015c }
            goto L_0x0176
        L_0x015c:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "print trace failed, message : "
            r5.append(r6)
            java.lang.String r8 = r8.getMessage()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r8)
        L_0x0176:
            com.tencent.matrix.trace.tracer.SignalAnrTracer r8 = new com.tencent.matrix.trace.tracer.SignalAnrTracer
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.app.Application r10 = (android.app.Application) r10
            r8.<init>(r10, r9, r0)
            r9 = 10000(0x2710, double:4.9407E-320)
            com.tencent.matrix.trace.tracer.SignalAnrTracer.f235561e = r9
            com.tencent.mm.app.n0 r9 = new com.tencent.mm.app.n0
            r9.<init>()
            com.tencent.matrix.trace.tracer.SignalAnrTracer.f235565i = r9
            r8.mo124297i()
        L_0x018f:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r8 != 0) goto L_0x0197
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r8 == 0) goto L_0x01a8
        L_0x0197:
            com.tencent.matrix.trace.tracer.ThreadTracer r8 = new com.tencent.matrix.trace.tracer.ThreadTracer
            r8.<init>()
            com.tencent.mm.app.m0 r9 = new com.tencent.mm.app.m0
            r9.<init>()
            com.tencent.matrix.trace.tracer.ThreadTracer.f235592f = r2
            com.tencent.matrix.trace.tracer.ThreadTracer.f235591e = r9
            r8.mo124297i()
        L_0x01a8:
            long r8 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 % r5
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x01b5
            r8 = 1
            goto L_0x01b6
        L_0x01b5:
            r8 = 0
        L_0x01b6:
            if (r8 != 0) goto L_0x01b9
            goto L_0x01dc
        L_0x01b9:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r9 = "clicfg_pthread_key_seq"
            boolean r8 = r8.decodeBool(r9, r1)
            if (r8 != 0) goto L_0x01cf
            boolean r8 = qe3.C89625d.f257845k
            if (r8 != 0) goto L_0x01cf
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r8 == 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r2 = 0
        L_0x01cf:
            if (r2 != 0) goto L_0x01d2
            goto L_0x01dc
        L_0x01d2:
            com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            com.tencent.mm.app.k0 r9 = new com.tencent.mm.app.k0
            r9.<init>()
            r8.mo174209b(r9)
        L_0x01dc:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 < r9) goto L_0x020a
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isBacktraceProcess()
            if (r8 != 0) goto L_0x020a
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            android.os.Looper r9 = android.os.Looper.myLooper()
            if (r8 == r9) goto L_0x01fa
            java.lang.String r8 = "MicroMsg.MMCrashReporter"
            java.lang.String r9 = "handleExitInfo not in main thread, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            goto L_0x020a
        L_0x01fa:
            zt3.t r8 = zt3.C119157j.f356862d
            com.tencent.mm.app.l0 r9 = new com.tencent.mm.app.l0
            r9.<init>()
            r2 = 2000(0x7d0, double:9.88E-321)
            zt3.j r8 = (zt3.C119157j) r8
            java.lang.String r10 = "Handle-ExitInfo-Thread"
            r8.mo183879j(r9, r2, r10)
        L_0x020a:
            return r1
        L_0x020b:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x020b }
            throw r8
        L_0x020e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x020e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.m98224l(s72.b, com.tencent.mm.sdk.crash.ICrashReporter$ICrashExpansionDelegate, java.lang.String):boolean");
    }

    public void addCrashReportListener(ICrashReporter.ICrashReportListener iCrashReportListener) {
        if (iCrashReportListener != null) {
            ((HashSet) f235792k).add(iCrashReportListener);
        }
    }

    public void addExtraMessageGetter(ICrashReporter.ICrashReportExtraMessageGetter iCrashReportExtraMessageGetter) {
        if (iCrashReportExtraMessageGetter != null) {
            ((HashSet) f235791j).add(iCrashReportExtraMessageGetter);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0134  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo112318c(android.content.Context r27) {
        /*
            r26 = this;
            r8 = r26
            r9 = r27
            java.lang.String r10 = "0x"
            java.lang.String r11 = "MicroMsg.MMCrashReporter"
            java.lang.String r0 = "previousUpload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.lang.String r0 = r27.getPackageName()
            java.io.File r1 = new java.io.File
            java.io.File r2 = r27.getFilesDir()
            java.lang.String r3 = "crash"
            r1.<init>(r2, r3)
            com.tencent.mm.app.i0$$i r2 = new com.tencent.mm.app.i0$$i
            r2.<init>(r8, r0)
            java.io.File[] r12 = r1.listFiles(r2)
            if (r12 == 0) goto L_0x0289
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r0 = 16384(0x4000, float:2.2959E-41)
            r7.<init>(r0)
            r0 = 1024(0x400, float:1.435E-42)
            char[] r6 = new char[r0]
            int r5 = r12.length
            r4 = 0
        L_0x0039:
            if (r4 >= r5) goto L_0x026d
            r2 = r12[r4]
            boolean r0 = com.tencent.xweb.XWebSdk.isXWebChildProcessCrashDumpFiles(r2)
            if (r0 == 0) goto L_0x0052
            long r0 = r2.length()
            r16 = 0
            int r18 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x004f
            r0 = 1
            goto L_0x0053
        L_0x004f:
            com.tencent.xweb.XWebSdk.onReportXWebCrash(r2)
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0079
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "crashDoubleUpload, ignore file:"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x006d:
            r16 = r4
            r18 = r5
            r23 = r6
            r19 = r12
            r2 = 0
            r12 = r7
            goto L_0x0260
        L_0x0079:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "NativeCrash_"
            boolean r0 = r0.startsWith(r1)
            java.lang.String r1 = "Failed uploading previous crash: %s"
            java.lang.String r3 = "Uploading previous crash: "
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = r2.getName()
            java.lang.String r13 = ".fulldmp"
            boolean r0 = r0.endsWith(r13)
            if (r0 == 0) goto L_0x0096
            goto L_0x006d
        L_0x0096:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.lang.String r0 = r2.getPath()
            java.lang.String r3 = ".dmp"
            java.lang.String r3 = r0.replace(r3, r13)
            boolean r13 = r3.equals(r0)
            if (r13 == 0) goto L_0x00b9
            r3 = 0
        L_0x00b9:
            r13 = r3
            r3 = 0
            wj.b$b r0 = p1061wj.C91007b.m114176b(r3, r0, r13)     // Catch:{ IOException -> 0x0114 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0114 }
            r3.<init>()     // Catch:{ IOException -> 0x0114 }
            r18 = r1
            java.lang.String r1 = "NativeCrash crash: "
            r3.append(r1)     // Catch:{ IOException -> 0x0106 }
            int r1 = r0.f261105a     // Catch:{ IOException -> 0x0106 }
            r3.append(r1)     // Catch:{ IOException -> 0x0106 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0106 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ IOException -> 0x0106 }
            int r3 = r0.f261105a     // Catch:{ IOException -> 0x0106 }
            java.lang.String r1 = r0.f261107c     // Catch:{ IOException -> 0x0106 }
            java.lang.String r19 = "NativeCrash"
            r20 = 1
            java.lang.String r0 = r0.f261106b     // Catch:{ IOException -> 0x0106 }
            r21 = 0
            r22 = r18
            r18 = r1
            r1 = r26
            r23 = r2
            r2 = r3
            r3 = r18
            r16 = r4
            r4 = r19
            r18 = r5
            r5 = r20
            r24 = r6
            r6 = r0
            r19 = r12
            r12 = r7
            r7 = r21
            r1.mo112324k(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0104 }
            r6 = r23
            goto L_0x012f
        L_0x0104:
            r0 = move-exception
            goto L_0x0122
        L_0x0106:
            r0 = move-exception
            r23 = r2
            r16 = r4
            r24 = r6
            r19 = r12
            r22 = r18
            r18 = r5
            goto L_0x0121
        L_0x0114:
            r0 = move-exception
            r22 = r1
            r23 = r2
            r16 = r4
            r18 = r5
            r24 = r6
            r19 = r12
        L_0x0121:
            r12 = r7
        L_0x0122:
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r6 = r23
            r2 = 0
            r1[r2] = r6
            r5 = r22
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r5, r1)
        L_0x012f:
            r6.delete()
            if (r13 == 0) goto L_0x013c
            java.io.File r0 = new java.io.File
            r0.<init>(r13)
            r0.delete()
        L_0x013c:
            r23 = r24
        L_0x013e:
            r2 = 0
            goto L_0x0260
        L_0x0141:
            r16 = r4
            r18 = r5
            r24 = r6
            r19 = r12
            r5 = r1
            r6 = r2
            r12 = r7
            r7 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.io.FileReader r13 = new java.io.FileReader     // Catch:{ Exception -> 0x024e }
            r13.<init>(r6)     // Catch:{ Exception -> 0x024e }
            r1 = 0
            r12.setLength(r1)     // Catch:{ all -> 0x0239 }
            r4 = r24
        L_0x016a:
            int r0 = r13.read(r4)     // Catch:{ all -> 0x0231 }
            r2 = -1
            if (r0 == r2) goto L_0x0181
            r12.append(r4, r1, r0)     // Catch:{ all -> 0x0176 }
            r1 = 0
            goto L_0x016a
        L_0x0176:
            r0 = move-exception
            r1 = r0
            r23 = r4
            r25 = r5
            r20 = r6
            r8 = 1
            goto L_0x0242
        L_0x0181:
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = r6.getName()     // Catch:{ all -> 0x0231 }
            java.lang.String r2 = "java_"
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x0231 }
            if (r1 == 0) goto L_0x01a1
            r1 = 0
            r8.mo112323j(r0, r1, r1, r1)     // Catch:{ all -> 0x0176 }
            r6.delete()     // Catch:{ all -> 0x0176 }
            r23 = r4
            r25 = r5
            r20 = r6
            r8 = 1
            goto L_0x022a
        L_0x01a1:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION     // Catch:{ all -> 0x0231 }
            java.lang.String r2 = "^version:((?:0x)?[0-9A-Fa-f]+)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch:{ all -> 0x0231 }
            java.util.regex.Matcher r2 = r2.matcher(r0)     // Catch:{ all -> 0x0231 }
            boolean r3 = r2.find()     // Catch:{ all -> 0x0231 }
            if (r3 == 0) goto L_0x01e2
            java.lang.String r1 = r2.group(r7)     // Catch:{ all -> 0x0176 }
            boolean r3 = r1.startsWith(r10)     // Catch:{ all -> 0x0176 }
            if (r3 != 0) goto L_0x01da
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x01da
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r1.<init>()     // Catch:{ all -> 0x0176 }
            r1.append(r10)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = r3.toUpperCase()     // Catch:{ all -> 0x0176 }
            r1.append(r3)     // Catch:{ all -> 0x0176 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0176 }
        L_0x01da:
            int r2 = r2.end()     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = r0.substring(r2)     // Catch:{ all -> 0x0176 }
        L_0x01e2:
            r3 = r0
            r0 = r1
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x0231 }
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = "\nsignal (\\d+) \\("
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch:{ all -> 0x0231 }
            java.util.regex.Matcher r1 = r1.matcher(r3)     // Catch:{ all -> 0x0231 }
            boolean r2 = r1.find()     // Catch:{ all -> 0x0231 }
            if (r2 == 0) goto L_0x0205
            java.lang.String r1 = r1.group(r7)     // Catch:{ all -> 0x0176 }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ all -> 0x0176 }
            r2 = r1
            goto L_0x0206
        L_0x0205:
            r2 = 0
        L_0x0206:
            java.lang.String r20 = "CrashMonitor"
            r21 = 1
            r22 = 0
            r1 = r26
            r23 = r4
            r4 = r20
            r25 = r5
            r5 = r21
            r20 = r6
            r6 = r0
            r8 = 1
            r7 = r22
            r1.mo112324k(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x022f }
            goto L_0x0227
        L_0x0220:
            r23 = r4
            r25 = r5
            r20 = r6
            r8 = 1
        L_0x0227:
            r20.delete()     // Catch:{ all -> 0x022f }
        L_0x022a:
            r13.close()     // Catch:{ Exception -> 0x024c }
            goto L_0x013e
        L_0x022f:
            r0 = move-exception
            goto L_0x0241
        L_0x0231:
            r0 = move-exception
            r23 = r4
            r25 = r5
            r20 = r6
            goto L_0x0240
        L_0x0239:
            r0 = move-exception
            r25 = r5
            r20 = r6
            r23 = r24
        L_0x0240:
            r8 = 1
        L_0x0241:
            r1 = r0
        L_0x0242:
            r13.close()     // Catch:{ all -> 0x0246 }
            goto L_0x024b
        L_0x0246:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ Exception -> 0x024c }
        L_0x024b:
            throw r1     // Catch:{ Exception -> 0x024c }
        L_0x024c:
            r0 = move-exception
            goto L_0x0256
        L_0x024e:
            r0 = move-exception
            r25 = r5
            r20 = r6
            r23 = r24
            r8 = 1
        L_0x0256:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r2 = 0
            r1[r2] = r20
            r3 = r25
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r3, r1)
        L_0x0260:
            int r4 = r16 + 1
            r8 = r26
            r7 = r12
            r5 = r18
            r12 = r19
            r6 = r23
            goto L_0x0039
        L_0x026d:
            r2 = 0
            r8 = 1
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r0[r2] = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r14
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "previousUpload startTime:%s interTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
        L_0x0289:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r27.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "_preferences"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r1)
            java.lang.String r2 = "login_user_name"
            java.lang.String r3 = "never_login_crash"
            java.lang.String r0 = r0.getString(r2, r3)
            java.lang.String r2 = "system_config_prefs"
            android.content.SharedPreferences r2 = r9.getSharedPreferences(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://"
            r3.append(r4)
            java.lang.String r4 = "support.weixin.qq.com"
            java.lang.String r2 = r2.getString(r4, r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.File r4 = r27.getFilesDir()
            java.io.File r4 = r4.getParentFile()
            java.lang.String r4 = r4.getAbsolutePath()
            r3.append(r4)
            java.lang.String r4 = "/MicroMsg/crash/"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            r4.<init>((java.lang.String) r3)
            boolean r3 = r4.mo119967g()
            if (r3 == 0) goto L_0x031e
            boolean r3 = r4.mo119977o()
            if (r3 == 0) goto L_0x031e
            com.tencent.mm.vfs.m1[] r3 = r4.mo119984u()
            int r4 = r3.length
            r13 = 0
        L_0x02fe:
            if (r13 >= r4) goto L_0x031e
            r1 = r3[r13]
            boolean r5 = r1.mo119977o()
            if (r5 == 0) goto L_0x031b
            java.lang.String r5 = r1.getName()
            java.lang.String r6 = "_nf"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x031b
            java.lang.String r5 = a70.C79471a.f233016d
            java.lang.String r6 = "exception"
            com.tencent.p014mm.crash.CrashUploaderService.m98688m(r1, r0, r5, r2, r6)
        L_0x031b:
            int r13 = r13 + 1
            goto L_0x02fe
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.mo112318c(android.content.Context):void");
    }

    /* renamed from: e */
    public String mo112319e() {
        String str = "/data/anr/traces.txt";
        try {
            String a = C45918i0.m51188a("dalvik.vm.stack-trace-file");
            if (!(a == null || a.length() == 0)) {
                str = a;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMCrashReporter", e, "Failed finding out ANR trace file path, using default.", new Object[0]);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String processName = MMApplicationContext.getProcessName();
            if (processName == null || processName.length() == 0) {
                processName = MMApplicationContext.getApplicationId();
            }
            String str2 = str.substring(0, lastIndexOf) + '_' + processName + str.substring(lastIndexOf);
            if (new File(str2).isFile()) {
                return str2;
            }
        }
        if (new File(str).isFile()) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final String mo112320f(C91355x xVar) {
        String str;
        if (xVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        StringBuilder sb4 = new StringBuilder();
        if (!((ArrayList) xVar.f261991D).isEmpty()) {
            sb4.append("| Top 20 mapped memory region sizes:\n");
            Iterator it = ((ArrayList) xVar.f261991D).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    str = "!no-name!";
                } else {
                    str = "'" + ((String) entry.getKey()) + "'";
                }
                sb4.append("|   name: ");
                sb4.append(str);
                sb4.append(", size: ");
                sb4.append(entry.getValue());
                sb4.append(" bytes\n");
            }
        }
        sb.append(sb4.toString());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r7 != null) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca A[SYNTHETIC, Splitter:B:57:0x00ca] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo112321i(java.lang.String r15, int r16, long r17, android.app.ActivityManager.ProcessErrorStateInfo r19) {
        /*
            r14 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "----- pid "
            r3.append(r4)
            r4 = r16
            r3.append(r4)
            java.lang.String r4 = " at "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 10
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.longMsg
            r1.append(r0)
            r1.append(r4)
        L_0x0035:
            r5 = 0
            r6 = 0
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b7, all -> 0x00b5 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x00b7, all -> 0x00b5 }
            r8 = r15
            r0.<init>(r15)     // Catch:{ Exception -> 0x00b7, all -> 0x00b5 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00b7, all -> 0x00b5 }
            r0 = 0
        L_0x0043:
            java.lang.String r8 = r7.readLine()     // Catch:{ Exception -> 0x00b3 }
            if (r8 == 0) goto L_0x00af
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0085
            if (r0 == r10) goto L_0x0069
            if (r0 == r9) goto L_0x0052
            goto L_0x0043
        L_0x0052:
            java.lang.String r9 = "----- end "
            boolean r9 = r8.startsWith(r9)     // Catch:{ Exception -> 0x00b3 }
            if (r9 == 0) goto L_0x0062
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00b3 }
            r7.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            return r0
        L_0x0062:
            r1.append(r8)     // Catch:{ Exception -> 0x00b3 }
            r1.append(r4)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x0043
        L_0x0069:
            r1.append(r8)     // Catch:{ Exception -> 0x00b3 }
            r1.append(r4)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r10 = "DALVIK THREADS"
            boolean r10 = r8.startsWith(r10)     // Catch:{ Exception -> 0x00b3 }
            if (r10 == 0) goto L_0x0079
            r0 = 2
            goto L_0x0043
        L_0x0079:
            java.lang.String r9 = "-----"
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x00b3 }
            if (r8 == 0) goto L_0x0043
            r7.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return r6
        L_0x0085:
            boolean r9 = r8.startsWith(r3)     // Catch:{ Exception -> 0x00b3 }
            if (r9 == 0) goto L_0x0043
            int r9 = r3.length()     // Catch:{ Exception -> 0x00b3 }
            int r11 = r9 + 19
            java.lang.String r8 = r8.substring(r9, r11)     // Catch:{ Exception -> 0x00b3 }
            java.util.Date r8 = r2.parse(r8)     // Catch:{ Exception -> 0x00b3 }
            long r8 = r8.getTime()     // Catch:{ Exception -> 0x00b3 }
            long r8 = r8 - r17
            r11 = -60000(0xffffffffffff15a0, double:NaN)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0043
            r11 = 60000(0xea60, double:2.9644E-319)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x0043
            r0 = 1
            goto L_0x0043
        L_0x00af:
            r7.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00c5
        L_0x00b3:
            r0 = move-exception
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            goto L_0x00c8
        L_0x00b7:
            r0 = move-exception
            r7 = r6
        L_0x00b9:
            java.lang.String r1 = "MicroMsg.MMCrashReporter"
            java.lang.String r2 = "Failed parsing ANR trace file."
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)     // Catch:{ all -> 0x00c6 }
            if (r7 == 0) goto L_0x00c5
            goto L_0x00af
        L_0x00c5:
            return r6
        L_0x00c6:
            r0 = move-exception
            r6 = r7
        L_0x00c8:
            if (r6 == 0) goto L_0x00cd
            r6.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.mo112321i(java.lang.String, int, long, android.app.ActivityManager$ProcessErrorStateInfo):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0.length() != 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r5 = "MicroMsg.MMCrashReporter"
            com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler.setReporter(r3)
            java.lang.String r0 = f235793l
            java.lang.String r1 = ":push"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "dalvik.vm.stack-trace-file"
            java.lang.String r0 = p156gj.C45918i0.m51188a(r0)     // Catch:{ Exception -> 0x001e }
            if (r0 == 0) goto L_0x0027
            int r1 = r0.length()     // Catch:{ Exception -> 0x001e }
            if (r1 != 0) goto L_0x0029
            goto L_0x0027
        L_0x001e:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed finding out ANR trace file path, using default."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r1)
        L_0x0027:
            java.lang.String r0 = "/data/anr/traces.txt"
        L_0x0029:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.lang.String r2 = r1.getParent()
            r3.f235805c = r2
            if (r2 == 0) goto L_0x003c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0040
        L_0x003c:
            java.lang.String r2 = "/"
            r3.f235805c = r2
        L_0x0040:
            java.lang.String r1 = r1.getName()
            r3.f235806d = r1
            android.os.ConditionVariable r1 = new android.os.ConditionVariable
            r1.<init>()
            r3.f235807e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Initialize ANR Observer, trace file: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r3.f235804b = r5
            com.tencent.mm.app.i0$$k r5 = new com.tencent.mm.app.i0$$k
            java.lang.String r0 = r3.f235805c
            r5.<init>(r3, r0)
            r5.startWatching()
            com.tencent.p014mm.booter.CoreService.f343882t = r3
        L_0x0074:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r5 == 0) goto L_0x0088
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "com.tencent.mm.sandbox.monitor.CrashUploadAlarmReceiver"
            android.content.Intent r5 = r5.setClassName(r4, r0)
            r4.sendBroadcast(r5)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.init(android.content.Context, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fa  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112323j(java.lang.String r15, int r16, boolean r17, boolean r18) {
        /*
            r14 = this;
            r0 = r16
            r1 = 4
            r2 = 2
            r3 = 1
            if (r17 == 0) goto L_0x0012
            if (r18 == 0) goto L_0x000e
            r4 = 3
            com.tencent.p014mm.app.C80594h0.m98212a(r4)
            goto L_0x001b
        L_0x000e:
            com.tencent.p014mm.app.C80594h0.m98212a(r1)
            goto L_0x001b
        L_0x0012:
            if (r18 == 0) goto L_0x0018
            com.tencent.p014mm.app.C80594h0.m98212a(r3)
            goto L_0x001b
        L_0x0018:
            com.tencent.p014mm.app.C80594h0.m98212a(r2)
        L_0x001b:
            m98223h(r15)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 11338(0x2c4a, float:1.5888E-41)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r13 = 0
            r6[r13] = r7
            r4.mo160140o(r5, r3, r3, r6)
            r6 = 25
            r8 = 0
            r10 = 1
            r12 = 1
            r5 = r4
            r5.idkeyStat(r6, r8, r10, r12)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            java.lang.String r6 = ":push"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x0051
            r6 = 25
            r8 = 2
            r10 = 1
            r12 = 1
            r5 = r4
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x008c
        L_0x0051:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r5 == 0) goto L_0x0063
            r6 = 25
            r8 = 3
            r10 = 1
            r12 = 1
            r5 = r4
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x008c
        L_0x0063:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            java.lang.String r6 = ":exdevice"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x007b
            r6 = 25
            r8 = 4
            r10 = 1
            r12 = 1
            r5 = r4
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x008c
        L_0x007b:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r5 == 0) goto L_0x008c
            r6 = 25
            r8 = 1
            r10 = 1
            r12 = 1
            r5 = r4
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x008c:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "crash_status_file"
            if (r5 != 0) goto L_0x0096
        L_0x0094:
            r5 = 0
            goto L_0x00a1
        L_0x0096:
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r7 = "channel"
            r8 = -1
            int r5 = r5.getInt(r7, r8)     // Catch:{ all -> 0x0094 }
        L_0x00a1:
            if (r5 != r3) goto L_0x00d2
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r5 != 0) goto L_0x00ab
        L_0x00a9:
            r1 = 0
            goto L_0x00b7
        L_0x00ab:
            android.content.SharedPreferences r1 = r5.getSharedPreferences(r6, r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = "googleplaysizelimit"
            r6 = 8192(0x2000, float:1.14794E-41)
            int r1 = r1.getInt(r5, r6)     // Catch:{ all -> 0x00a9 }
        L_0x00b7:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3[r13] = r5
            java.lang.String r5 = "MicroMsg.MMCrashReporter"
            java.lang.String r6 = "google play crash size limit %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            int r3 = r15.length()
            if (r3 <= r1) goto L_0x00d2
            r3 = r15
            java.lang.String r1 = r15.substring(r13, r1)
            goto L_0x00d4
        L_0x00d2:
            r3 = r15
            r1 = r3
        L_0x00d4:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            if (r17 == 0) goto L_0x00e1
            java.lang.String r6 = "jni"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r6 = "java"
        L_0x00e3:
            com.tencent.p014mm.app.C0989k.m942a(r3, r5, r6)
            if (r0 <= 0) goto L_0x00f2
            int r3 = r1.length()
            if (r3 <= r0) goto L_0x00f2
            java.lang.String r1 = r1.substring(r13, r0)
        L_0x00f2:
            r0 = 7
            com.tencent.p014mm.app.C80594h0.m98212a(r0)
            s72.b r0 = s72.C90149c.f258834a
            if (r0 == 0) goto L_0x0159
            r0 = 8
            com.tencent.p014mm.app.C80594h0.m98212a(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "uncatch_exception"
            r0.setAction(r3)
            int r3 = android.os.Process.myPid()
            java.lang.String r5 = "exceptionPid"
            r0.putExtra(r5, r3)
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r3 = "exceptionTime"
            r0.putExtra(r3, r5)
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.String r5 = "login_weixin_username"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.mo19a(r5, r6)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 == 0) goto L_0x0136
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.String r5 = "login_user_name"
            java.lang.String r6 = "never_login_crash"
            java.lang.String r3 = r3.mo19a(r5, r6)
        L_0x0136:
            java.lang.String r5 = "userName"
            r0.putExtra(r5, r3)
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            java.lang.String r2 = "exceptionMsg"
            r0.putExtra(r2, r1)
            s72.b r1 = s72.C90149c.f258834a
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.sandbox.SubCoreSandBox r1 = (com.tencent.p014mm.plugin.sandbox.SubCoreSandBox) r1
            r1.mo118745d(r2, r0)
            r0 = 9
            com.tencent.p014mm.app.C80594h0.m98212a(r0)
        L_0x0159:
            r4.mo160139n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.mo112323j(java.lang.String, int, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083 A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[Catch:{ all -> 0x00a0 }, LOOP:0: B:18:0x0090->B:20:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0049 A[Catch:{ all -> 0x00a0 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112324k(int r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.String r14, boolean r15) {
        /*
            r9 = this;
            r0 = 6
            r1 = 0
            r2 = 0
            if (r10 != r0) goto L_0x001a
            java.lang.String r4 = r9.mo112319e()     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x001a
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x00a0 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a0 }
            r8 = 0
            r3 = r9
            java.lang.String r0 = r3.mo112321i(r4, r5, r6, r8)     // Catch:{ all -> 0x00a0 }
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r4 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4)     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "#[jin_crash]sig="
            r3.append(r4)     // Catch:{ all -> 0x00a0 }
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            r10 = 10
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "#crash.previous="
            r3.append(r4)     // Catch:{ all -> 0x00a0 }
            r3.append(r13)     // Catch:{ all -> 0x00a0 }
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "#crash.provider="
            r3.append(r4)     // Catch:{ all -> 0x00a0 }
            r3.append(r12)     // Catch:{ all -> 0x00a0 }
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            r4 = 1
            r13 = r13 ^ r4
            if (r13 == 0) goto L_0x0050
            com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog r13 = com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog.f248575A     // Catch:{ all -> 0x00a0 }
            r2 = 4
            xv.x r2 = r13.mo118582h(r4, r2)     // Catch:{ all -> 0x00a0 }
        L_0x0050:
            java.lang.String r13 = ""
            java.lang.StringBuilder r13 = m98220b(r13, r1, r14, r2)     // Catch:{ all -> 0x00a0 }
            r3.append(r13)     // Catch:{ all -> 0x00a0 }
            r3.append(r11)     // Catch:{ all -> 0x00a0 }
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            java.lang.String r11 = r9.mo112320f(r2)     // Catch:{ all -> 0x00a0 }
            r3.append(r11)     // Catch:{ all -> 0x00a0 }
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0073
            java.lang.String r10 = "******* ANR Trace *******\n"
            r3.append(r10)     // Catch:{ all -> 0x00a0 }
            r3.append(r0)     // Catch:{ all -> 0x00a0 }
        L_0x0073:
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.String r11 = "NativeCrash"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00a0 }
            if (r11 == 0) goto L_0x0083
            r11 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0085
        L_0x0083:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0085:
            r9.mo112323j(r10, r11, r4, r15)     // Catch:{ all -> 0x00a0 }
            java.util.Set<com.tencent.mm.sdk.crash.ICrashReporter$ICrashReportListener> r11 = f235792k     // Catch:{ all -> 0x00a0 }
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x0090:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r12 == 0) goto L_0x00b2
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x00a0 }
            com.tencent.mm.sdk.crash.ICrashReporter$ICrashReportListener r12 = (com.tencent.p014mm.sdk.crash.ICrashReporter.ICrashReportListener) r12     // Catch:{ all -> 0x00a0 }
            r12.onCrashDumped(r10)     // Catch:{ all -> 0x00a0 }
            goto L_0x0090
        L_0x00a0:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "MicroMsg.MMCrashReporter"
            java.lang.String r13 = "Failed reporting JNI crash."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r10, r13, r11)
            boolean r11 = r10 instanceof java.lang.RuntimeException
            if (r11 != 0) goto L_0x00b6
            boolean r11 = r10 instanceof java.lang.Error
            if (r11 != 0) goto L_0x00b3
        L_0x00b2:
            return
        L_0x00b3:
            java.lang.Error r10 = (java.lang.Error) r10
            throw r10
        L_0x00b6:
            java.lang.RuntimeException r10 = (java.lang.RuntimeException) r10
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.mo112324k(int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void");
    }

    public void removeCrashReportListener(ICrashReporter.ICrashReportListener iCrashReportListener) {
        if (iCrashReportListener != null) {
            ((HashSet) f235792k).remove(iCrashReportListener);
        }
    }

    public void reportCrashMessage(String str, String str2) {
        C91355x h = MemoryWatchDog.f248575A.mo118582h(true, 4);
        mo112323j(m98220b(str, true, BuildInfo.CLIENT_VERSION, h) + str2 + 10 + mo112320f(h), 0, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2) == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[Catch:{ all -> 0x011a, all -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportException(com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler r55, java.lang.String r56, java.lang.Throwable r57) {
        /*
            r54 = this;
            r1 = r54
            r0 = r57
            boolean r2 = r0 instanceof junit.framework.AssertionFailedError
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r57.getMessage()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x001f
            r3 = r55
            java.lang.String r2 = r3.getReportByAssertPrefix(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            java.lang.String r2 = ""
        L_0x0021:
            boolean r3 = r0 instanceof com.tencent.p014mm.support.feature_service.ServiceDefException
            if (r3 != 0) goto L_0x0031
            java.lang.Throwable r3 = r57.getCause()
            boolean r3 = r3 instanceof com.tencent.p014mm.support.feature_service.ServiceDefException
            if (r3 == 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r3 = r56
            goto L_0x0045
        L_0x0031:
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            java.io.PrintWriter r4 = new java.io.PrintWriter
            r4.<init>(r3)
            r0.printStackTrace(r4)
            r4.close()
            java.lang.String r3 = r3.toString()
        L_0x0045:
            com.tencent.p014mm.app.C80588d1.m98205b(r57)
            com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog r4 = com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog.f248575A
            r5 = 4
            r6 = 1
            xv.x r4 = r4.mo118582h(r6, r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            java.lang.StringBuilder r2 = m98220b(r2, r6, r5, r4)
            r2.append(r3)
            r5 = 10
            r2.append(r5)
            java.lang.String r7 = r1.mo112320f(r4)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = 0
            r1.mo112323j(r2, r5, r5, r6)
            mr3.a r2 = mr3.C88832a.f256247b
            r2.mo123217a()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r3 = r3.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.MMCrashReporter"
            java.lang.String r7 = "Crash msg content size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r2)
            boolean r0 = r0 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x012c
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_dump_hprof_when_oom_occurred     // Catch:{ all -> 0x0123 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00a3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_P_ALPHA     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00a3
            boolean r2 = qe3.C89625d.f257845k     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00a3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r2 = 0
            goto L_0x00a4
        L_0x00a3:
            r2 = 1
        L_0x00a4:
            boolean r0 = p761yd.C38993b.m41993c(r0, r2)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = "is OOM, dump hprof"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0123 }
            df.e r0 = p955df.C86266e.f250872e     // Catch:{ all -> 0x011a }
            java.lang.String r2 = "OOM"
            java.io.File r0 = r0.mo120674b(r2, r6)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x011a }
            r6 = 60
            com.tencent.matrix.resource.MemoryUtil.m98119e(r0, r6)     // Catch:{ all -> 0x011a }
            long r6 = r4.f262014p     // Catch:{ all -> 0x011a }
            long r8 = r4.f262015q     // Catch:{ all -> 0x011a }
            long r15 = r6 - r8
            xe.k$a r0 = p269xe.C91190k.f261451a     // Catch:{ all -> 0x011a }
            xe.k$b r2 = new xe.k$b     // Catch:{ all -> 0x011a }
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = -18
            r52 = 1
            r53 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r17, r19, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x011a }
            r0.mo53491a(r2)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "hprof dumped when OOM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x011a }
            goto L_0x012c
        L_0x011a:
            r0 = move-exception
            java.lang.String r2 = "dump hprof failed"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0123 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r4)     // Catch:{ all -> 0x0123 }
            goto L_0x012c
        L_0x0123:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r4 = "proctection: OOM dump logic error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80600i0.reportException(com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler, java.lang.String, java.lang.Throwable):void");
    }

    public void reportJniCrash(int i, String str, String str2) {
        mo112324k(i, str, str2, false, BuildInfo.CLIENT_VERSION, true);
        C88832a.f256247b.mo123217a();
    }

    public void reportRawMessage(String str, String str2) {
        if (C90149c.f258834a != null) {
            Intent intent = new Intent();
            intent.setAction("custom_exception");
            String a = C7624i3.f25910c.mo19a("login_weixin_username", "");
            if (Util.isNullOrNil(a)) {
                a = C7624i3.f25910c.mo19a("login_user_name", "never_login_crash");
            }
            intent.putExtra("userName", a);
            intent.putExtra("tag", str2);
            intent.putExtra("exceptionMsg", str);
            ((SubCoreSandBox) C90149c.f258834a).mo118745d(MMApplicationContext.getContext(), intent);
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
