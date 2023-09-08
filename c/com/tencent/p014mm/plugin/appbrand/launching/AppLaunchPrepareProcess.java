package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Log;
import android.util.Pair;
import ap0.C79620c;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KV14609ReportEvent;
import com.tencent.p014mm.autogen.events.WxaGetDownloadUrlReportEvent;
import com.tencent.p014mm.autogen.events.WxaGetTestDownloadUrlReportEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct;
import com.tencent.p014mm.plugin.appbrand.appcache.C81229b1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82260t;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import op3.C117878c;
import op3.C117882j;
import p1042u.C111055b;
import p1042u.C118556h;
import p969gc.C87175c;
import p969gc.C87176d;
import pe3.C47465a;
import rp0.C90077a;
import te3.C52246zc2;
import u24.C90599h;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess */
public final class AppLaunchPrepareProcess implements ILaunchWxaAppInfoNotify, C83404p1 {

    /* renamed from: S0 */
    public static final C111055b<String, AppLaunchPrepareProcess> f243223S0 = new C111055b<>();

    /* renamed from: T0 */
    public static final MultiProcessMMKV f243224T0 = MultiProcessMMKV.getMMKV("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]");

    /* renamed from: U0 */
    public static final ConcurrentHashMap<String, QualitySession> f243225U0 = new ConcurrentHashMap<>();

    /* renamed from: V0 */
    public static final C117878c<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> f243226V0 = C117882j.m166285d(null, null, null);

    /* renamed from: A */
    public final boolean f243227A;

    /* renamed from: B */
    public AppBrandLaunchFromNotifyReferrer f243228B;

    /* renamed from: C */
    public final String f243229C;

    /* renamed from: D */
    public final AppBrandRuntimeReloadReportBundle f243230D;

    /* renamed from: E */
    public boolean f243231E;

    /* renamed from: F */
    public final C80247h f243232F;

    /* renamed from: G */
    public final int f243233G;

    /* renamed from: H */
    public final int f243234H;

    /* renamed from: I */
    public final boolean f243235I;

    /* renamed from: J */
    public final QualitySession f243236J;

    /* renamed from: K */
    public final AppStartupPerformanceReportBundle f243237K;

    /* renamed from: L */
    public volatile long f243238L;

    /* renamed from: M */
    public final List<kv_14609> f243239M;

    /* renamed from: N */
    public final IListener<KV14609ReportEvent> f243240N;

    /* renamed from: P */
    public final List<WeAppQualitySystemGetDownloadCGIStruct> f243241P;

    /* renamed from: Q */
    public final IListener<WxaGetDownloadUrlReportEvent> f243242Q;

    /* renamed from: Q0 */
    public volatile AppBrandBackgroundFetchDataParcel f243243Q0;

    /* renamed from: R */
    public final IListener<WxaGetTestDownloadUrlReportEvent> f243244R;

    /* renamed from: R0 */
    public final Queue<Pair<String, AppLaunchPrepareProcess$$d>> f243245R0;

    /* renamed from: S */
    public final LinkedList<C83349j3> f243246S;

    /* renamed from: T */
    public volatile C83515w2 f243247T;

    /* renamed from: U */
    public volatile boolean f243248U;

    /* renamed from: V */
    public volatile boolean f243249V;

    /* renamed from: W */
    public volatile Boolean f243250W;

    /* renamed from: X */
    public volatile HashMap<String, AppRuntimeApiPermissionBundle> f243251X;

    /* renamed from: Y */
    public volatile HashMap<String, AppRuntimeAppidABTestPermissionBundle> f243252Y;

    /* renamed from: Z */
    public volatile boolean f243253Z;

    /* renamed from: d */
    public final String f243254d;

    /* renamed from: e */
    public final long f243255e;

    /* renamed from: f */
    public final boolean f243256f;

    /* renamed from: g */
    public volatile AppLaunchPrepareProcess$$e f243257g;

    /* renamed from: h */
    public volatile boolean f243258h;

    /* renamed from: i */
    public volatile boolean f243259i;

    /* renamed from: j */
    public volatile C117878c<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> f243260j;

    /* renamed from: n */
    public volatile long f243261n;

    /* renamed from: o */
    public final String f243262o;

    /* renamed from: p */
    public final String f243263p;

    /* renamed from: p0 */
    public volatile boolean f243264p0;

    /* renamed from: q */
    public final int f243265q;

    /* renamed from: r */
    public final int f243266r;

    /* renamed from: s */
    public final int f243267s;

    /* renamed from: t */
    public final String f243268t;

    /* renamed from: u */
    public final String f243269u;

    /* renamed from: v */
    public final AppBrandLaunchReferrer f243270v;

    /* renamed from: w */
    public final String f243271w;

    /* renamed from: x */
    public final ICommLibReader f243272x;

    /* renamed from: x0 */
    public volatile boolean f243273x0;

    /* renamed from: y */
    public final boolean f243274y;

    /* renamed from: y0 */
    public volatile boolean f243275y0;

    /* renamed from: z */
    public final WxaAttributes.WxaVersionInfo f243276z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppLaunchPrepareProcess(com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC r28, com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject r29) {
        /*
            r27 = this;
            r0 = r28
            r1 = r29
            java.lang.String r2 = r0.f234839s
            java.lang.String r3 = r0.f239362d
            int r4 = r0.f239365g
            int r5 = r1.f245531d
            int r6 = r1.f245533f
            java.lang.String r7 = r0.f239367i
            java.lang.String r8 = r0.f234840t
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r9 = r0.f234846y
            java.lang.String r10 = r0.f234837q
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r11 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.m99632a()
            if (r11 != 0) goto L_0x001f
            com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.m99497a()
        L_0x001f:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r11 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.m99632a()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r12 = r0.f234804H
            boolean r13 = r28.mo111300k()
            boolean r14 = r0.f234798B
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r15 = r0.f239379j1
            r16 = r14
            r17 = r15
            long r14 = r0.f234800D
            r18 = r14
            boolean r15 = r0.f239389t1
            com.tencent.luggage.sdk.launching.h r14 = r0.f234829Y0
            r20 = r15
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r15 = r0.f239384o1
            int r1 = r1.f245533f
            r21 = r14
            r14 = 1173(0x495, float:1.644E-42)
            if (r14 != r1) goto L_0x004c
            java.lang.String r1 = r0.f234807K
            java.lang.String r1 = iq0.C87791a.m109237b(r1)
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r26 = r1
            int r1 = r0.f234813Q0
            r22 = r1
            int r1 = r0.f234819T0
            r23 = r1
            com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle r1 = r0.f234833b1
            r24 = r1
            boolean r0 = r0.f234827X0
            r25 = r0
            r1 = r27
            r0 = r21
            r14 = r16
            r21 = r15
            r15 = r17
            r16 = r18
            r18 = r20
            r19 = r0
            r20 = r21
            r21 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess.<init>(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject):void");
    }

    /* renamed from: i */
    public static AppLaunchPrepareProcess m102197i(String str) {
        AppLaunchPrepareProcess orDefault;
        C111055b<String, AppLaunchPrepareProcess> bVar = f243223S0;
        synchronized (bVar) {
            orDefault = bVar.getOrDefault(str, null);
        }
        return orDefault;
    }

    /* renamed from: j */
    public static AppLaunchPrepareProcess m102198j(String str) {
        C111055b<String, AppLaunchPrepareProcess> bVar = f243223S0;
        synchronized (bVar) {
            Iterator it = ((C118556h.C118561e) bVar.values()).iterator();
            while (it.hasNext()) {
                AppLaunchPrepareProcess appLaunchPrepareProcess = (AppLaunchPrepareProcess) it.next();
                if (C90599h.m113509b(appLaunchPrepareProcess.f243254d, str)) {
                    return appLaunchPrepareProcess;
                }
            }
            return null;
        }
    }

    /* renamed from: k */
    public static AppLaunchPrepareProcess m102199k(String str, boolean z) {
        AppLaunchPrepareProcess remove;
        C111055b<String, AppLaunchPrepareProcess> bVar = f243223S0;
        synchronized (bVar) {
            remove = bVar.remove(str);
        }
        if (z) {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (remove != null) {
                com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "pollStagingProcess appId(%s) type(%d) instanceId(%s), stacktrace=%s", remove.f243263p, Integer.valueOf(remove.f243265q), str, stackTraceString);
            } else {
                com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "pollStagingProcess instanceId(%s) get NULL, stacktrace=%s", str, stackTraceString);
            }
        }
        return remove;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0980  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x09e0 A[Catch:{ Exception -> 0x0a52 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x09e2 A[Catch:{ Exception -> 0x0a52 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0a48 A[Catch:{ Exception -> 0x0a52 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02d0 A[Catch:{ Exception -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02e1 A[Catch:{ Exception -> 0x02f2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final op3.C117878c<com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC, com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> mo115516a() {
        /*
            r34 = this;
            r15 = r34
            java.lang.Class<wi0.b0> r21 = wi0.C90975b0.class
            java.lang.String r0 = r15.f243263p
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r14 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100179d(r0)
            r13 = 1
            r12 = 0
            if (r14 != 0) goto L_0x001e
            r0 = 2131821265(0x7f1102d1, float:1.9275268E38)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = ""
            r1[r12] = r2
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104395b(r0, r1)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r15)
        L_0x001e:
            r11 = 7
            r10 = 2
            if (r14 != 0) goto L_0x0046
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "get null config!!!, username:%s, appId:%s"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r3 = r15.f243262o
            r2[r12] = r3
            java.lang.String r3 = r15.f243263p
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r2)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r15.f243276z
            if (r0 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            int r12 = r0.f239452d
        L_0x003a:
            java.lang.String r0 = r15.f243263p
            int r1 = r15.f243265q
            boolean r2 = r15.f243227A
            com.tencent.p014mm.plugin.appbrand.C83606m1.m102639c(r11, r0, r12, r1, r2)
            op3.c<com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> r0 = f243226V0
            return r0
        L_0x0046:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.r> r0 = com.tencent.p014mm.plugin.appbrand.appusage.C29384r.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appusage.r r0 = (com.tencent.p014mm.plugin.appbrand.appusage.C29384r) r0
            java.lang.String r1 = r15.f243263p
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100181f(r1)
            r0.getClass()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.mo56652qq(r1, r2)
            js0.m r9 = new js0.m
            r9.<init>()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KV14609ReportEvent> r0 = r15.f243240N
            r0.alive()
            int r0 = r15.f243265q
            if (r0 != 0) goto L_0x0072
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent> r0 = r15.f243242Q
            r0.alive()
            goto L_0x0077
        L_0x0072:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxaGetTestDownloadUrlReportEvent> r0 = r15.f243244R
            r0.alive()
        L_0x0077:
            com.tencent.mm.plugin.appbrand.launching.j0 r8 = new com.tencent.mm.plugin.appbrand.launching.j0
            java.lang.String r3 = r14.f261062e
            int r4 = r15.f243265q
            java.lang.String r5 = r15.f243268t
            java.lang.String r6 = r15.f243269u
            int r7 = r15.f243267s
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r15.f243276z
            boolean r2 = r15.f243227A
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r15.f243272x
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r11 = r15.f243236J
            com.tencent.luggage.sdk.launching.h r12 = r15.f243232F
            r18 = 0
            r19 = r1
            r1 = r8
            r20 = r2
            r2 = r34
            r22 = r8
            r8 = r0
            r23 = r9
            r9 = r20
            r10 = r19
            r16 = r14
            r14 = 0
            r14 = 1
            r13 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.launching.p3 r1 = new com.tencent.mm.plugin.appbrand.launching.p3
            r13 = r22
            r1.<init>(r13)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r11 = 0
            r10 = 0
            lu3.c r9 = r0.mo183890u(r1, r11, r10)
            com.tencent.mm.plugin.appbrand.launching.k0 r8 = new com.tencent.mm.plugin.appbrand.launching.k0
            java.lang.String r3 = r15.f243263p
            int r4 = r15.f243265q
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r7 = r15.f243276z
            int r5 = r7.f239452d
            boolean r6 = r15.f243227A
            int r0 = r15.f243267s
            java.lang.String r2 = r15.f243271w
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r1 = r15.f243236J
            com.tencent.luggage.sdk.launching.h r11 = r15.f243232F
            r12 = r1
            r1 = r8
            r20 = r2
            r2 = r34
            r14 = r8
            r8 = r0
            r24 = r9
            r9 = r20
            r20 = r13
            r13 = r10
            r10 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.launching.p3 r1 = new com.tencent.mm.plugin.appbrand.launching.p3
            r1.<init>(r14)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r11 = 0
            lu3.c r25 = r0.mo183890u(r1, r11, r13)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_android_wagame_appid_abtest_permission
            r10 = 1
            boolean r0 = r0.mo58784wf(r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r17 = 0
            r1[r17] = r2
            java.lang.String r2 = "MicroMsg.PkgABTest"
            java.lang.String r3 = "openGameAppIdABTestPermissionCheck exp:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            if (r0 == 0) goto L_0x0143
            com.tencent.mm.plugin.appbrand.launching.l0 r0 = new com.tencent.mm.plugin.appbrand.launching.l0
            java.lang.String r3 = r15.f243263p
            int r4 = r15.f243265q
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r15.f243276z
            int r5 = r8.f239452d
            boolean r6 = r15.f243227A
            java.lang.String r7 = r15.f243271w
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r9 = r15.f243236J
            r1 = r0
            r2 = r34
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.launching.p3 r2 = new com.tencent.mm.plugin.appbrand.launching.p3
            r2.<init>(r0)
            zt3.j r1 = (zt3.C119157j) r1
            r1.getClass()
            lu3.c r1 = r1.mo183890u(r2, r11, r13)
            r2 = r0
            r22 = r1
            goto L_0x0146
        L_0x0143:
            r2 = r13
            r22 = r2
        L_0x0146:
            com.tencent.mm.plugin.appbrand.launching.m0 r0 = new com.tencent.mm.plugin.appbrand.launching.m0
            r1 = r0
            java.lang.String r3 = r15.f243263p
            int r4 = r15.f243265q
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r15.f243276z
            int r6 = r15.f243266r
            int r7 = r15.f243267s
            java.lang.String r8 = r15.f243268t
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r9 = r15.f243270v
            java.lang.String r10 = r15.f243271w
            r18 = 1
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r11 = r15.f243272x
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r12 = r15.f243236J
            java.lang.String r13 = r15.f243262o
            r28 = r20
            r26 = r2
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r2 = r15.f243228B
            r30 = r14
            r29 = r16
            r14 = r2
            java.lang.String r2 = r15.f243229C
            r27 = r1
            r1 = r15
            r15 = r2
            com.tencent.luggage.sdk.launching.h r2 = r1.f243232F
            r16 = r2
            int r2 = r1.f243233G
            r17 = r2
            int r2 = r1.f243234H
            r18 = r2
            com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle r2 = r1.f243230D
            r19 = r2
            boolean r2 = r1.f243235I
            r20 = r2
            r31 = r26
            r2 = r34
            r1 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = r34.mo115519d()
            r0.f243860g = r1
            java.lang.Object r1 = r0.mo115732e()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            com.tencent.mm.plugin.appbrand.launching.w2 r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83515w2) r2
            java.lang.Object r1 = r1.second
            te3.wm2 r1 = (te3.C90446wm2) r1
            r3 = r34
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r4 = r3.f243237K
            long r5 = r0.f243857d
            r4.f243292i = r5
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r4 = r3.f243237K
            long r5 = r0.f243858e
            r4.f243293j = r5
            r5 = 3
            if (r2 != 0) goto L_0x01cb
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig username %s, appId %s, get null launchInfo"
            r6 = 2
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r7 = r3.f243262o
            r8 = 0
            r2[r8] = r7
            java.lang.String r7 = r3.f243263p
            r9 = 1
            r2[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            r10 = r23
            goto L_0x01fe
        L_0x01cb:
            r6 = 2
            r8 = 0
            r9 = 1
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction$a r0 = com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.CREATOR
            java.lang.String r7 = r3.f243263p
            int r10 = r3.f243265q
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r0 = r0.mo115481a(r7, r10, r2)
            r7 = 54
            if (r0 == 0) goto L_0x0205
            r10 = r23
            r10.f29691a = r0
            r3.mo115524l(r7)
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig username %s, appId %s, launch ban code %d"
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r11 = r3.f243262o
            r7[r8] = r11
            java.lang.String r11 = r3.f243263p
            r7[r9] = r11
            te3.rm2 r2 = r2.field_launchAction
            int r2 = r2.f259816d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r7)
        L_0x01fe:
            r11 = r29
        L_0x0200:
            r2 = 2
            r4 = 0
        L_0x0202:
            r7 = 1
            goto L_0x097d
        L_0x0205:
            r10 = r23
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            boolean r11 = r2.f243994F
            r0.f243301u = r11
            te3.au r0 = r2.field_jsapiInfo
            if (r0 == 0) goto L_0x0964
            pe3.b r0 = r0.f130770d
            if (r0 != 0) goto L_0x0217
            goto L_0x0964
        L_0x0217:
            r11 = r29
            r2.mo115809m2(r11)
            if (r1 == 0) goto L_0x0244
            te3.hj3 r0 = r1.f259925g
            if (r0 == 0) goto L_0x0228
            boolean r0 = r0.f259556j
            if (r0 == 0) goto L_0x0228
            r13 = 1
            goto L_0x0229
        L_0x0228:
            r13 = 0
        L_0x0229:
            com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized r0 = r11.f234856A
            r0.f234898g = r13
            if (r13 == 0) goto L_0x0244
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig(username:%s, appId:%s), LaunchWxaAppResponse.rely_update=true, update acceptedLibReader:%s"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r7 = r3.f243262o
            r2[r8] = r7
            java.lang.String r7 = r3.f243263p
            r2[r9] = r7
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r7 = r3.f243272x
            r2[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
        L_0x0244:
            gc.d r0 = p969gc.C87176d.f252818a
            java.lang.String r1 = r3.f243254d
            gc.c r0 = r0.mo121614b(r1, r8)
            if (r0 == 0) goto L_0x026f
            java.util.HashMap<java.lang.Integer, gc.b<?>> r0 = r0.f252816a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0259:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x026b
            java.lang.Object r1 = r0.next()
            gc.b r1 = (p969gc.C87174b) r1
            boolean r1 = r1.f252814d
            if (r1 == 0) goto L_0x0259
            r13 = 1
            goto L_0x0259
        L_0x026b:
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            r0.f243300t = r13
        L_0x026f:
            int r0 = r3.f243265q
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)
            if (r0 == 0) goto L_0x039b
            boolean r0 = r3.f243256f
            if (r0 != 0) goto L_0x039b
            java.lang.String r7 = r3.f243263p
            java.lang.String r12 = r3.f243268t
            com.tencent.mm.plugin.appbrand.launching.t2 r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.z3> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81396z3.class
            if (r7 == 0) goto L_0x028e
            int r13 = r7.length()
            if (r13 != 0) goto L_0x028c
            goto L_0x028e
        L_0x028c:
            r13 = 0
            goto L_0x028f
        L_0x028e:
            r13 = 1
        L_0x028f:
            if (r13 == 0) goto L_0x0297
            com.tencent.mm.plugin.appbrand.launching.t2$c$b r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83470b.f243905a
        L_0x0293:
            r12 = 0
            goto L_0x0377
        L_0x0297:
            java.lang.Object r13 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r21)
            wi0.b0 r13 = (wi0.C90975b0) r13
            java.lang.String r14 = "versionInfo"
            java.lang.String r15 = "appInfo"
            java.lang.String[] r14 = new java.lang.String[]{r14, r15}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r13 = r13.mo114011mL(r7, r14)
            if (r13 == 0) goto L_0x02ae
            r14 = 1
            goto L_0x02af
        L_0x02ae:
            r14 = 0
        L_0x02af:
            java.lang.String r15 = "MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils"
            if (r13 != 0) goto L_0x02b4
            goto L_0x031b
        L_0x02b4:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r16 = r13.mo113940m2()     // Catch:{ Exception -> 0x02f2 }
            boolean r16 = r16.mo113970a()     // Catch:{ Exception -> 0x02f2 }
            if (r16 == 0) goto L_0x02c0
            r13 = 1
            goto L_0x031c
        L_0x02c0:
            if (r12 == 0) goto L_0x02cc
            int r16 = r12.length()     // Catch:{ Exception -> 0x02f2 }
            if (r16 != 0) goto L_0x02c9
            goto L_0x02cc
        L_0x02c9:
            r16 = 0
            goto L_0x02ce
        L_0x02cc:
            r16 = 1
        L_0x02ce:
            if (r16 == 0) goto L_0x02e1
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x02f2 }
            com.tencent.mm.plugin.appbrand.appcache.z3 r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C81396z3) r0     // Catch:{ Exception -> 0x02f2 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r13 = r13.mo113942o2()     // Catch:{ Exception -> 0x02f2 }
            int r13 = r13.f239452d     // Catch:{ Exception -> 0x02f2 }
            boolean r13 = r0.mo113625jA(r7, r13)     // Catch:{ Exception -> 0x02f2 }
            goto L_0x031c
        L_0x02e1:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x02f2 }
            com.tencent.mm.plugin.appbrand.appcache.z3 r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C81396z3) r0     // Catch:{ Exception -> 0x02f2 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r13 = r13.mo113942o2()     // Catch:{ Exception -> 0x02f2 }
            int r13 = r13.f239452d     // Catch:{ Exception -> 0x02f2 }
            boolean r13 = r0.y00(r7, r13, r12)     // Catch:{ Exception -> 0x02f2 }
            goto L_0x031c
        L_0x02f2:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "checkLaunchTimeoutStrategy, appId:"
            r13.append(r1)
            r13.append(r7)
            java.lang.String r1 = ", enterPath:"
            r13.append(r1)
            if (r12 != 0) goto L_0x0309
            java.lang.String r12 = ""
        L_0x0309:
            r13.append(r12)
            java.lang.String r1 = ", check PageIndex get failed by "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x031b:
            r13 = 0
        L_0x031c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkLaunchTimeoutStrategy appId:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " isBackupExisted:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " isBackupCodePkgExisted:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            if (r14 == 0) goto L_0x0373
            if (r13 != 0) goto L_0x0345
            goto L_0x0373
        L_0x0345:
            com.tencent.mm.plugin.appbrand.launching.t2 r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a
            com.tencent.mm.plugin.appbrand.launching.t2$a$a r1 = new com.tencent.mm.plugin.appbrand.launching.t2$a$a
            r1.<init>(r7)
            java.lang.String r2 = "checkLaunchTimeoutStrategy"
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a r0 = r0.mo115747d(r1, r2, r8)
            if (r0 != 0) goto L_0x0358
            com.tencent.mm.plugin.appbrand.launching.t2$c$b r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83470b.f243905a
            goto L_0x0293
        L_0x0358:
            boolean r1 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102425e()
            if (r1 == 0) goto L_0x0361
            long r0 = r0.f239509A
            goto L_0x0363
        L_0x0361:
            long r0 = r0.f239538z
        L_0x0363:
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x036c
            com.tencent.mm.plugin.appbrand.launching.t2$c$b r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83470b.f243905a
            goto L_0x0377
        L_0x036c:
            com.tencent.mm.plugin.appbrand.launching.t2$c$a r2 = new com.tencent.mm.plugin.appbrand.launching.t2$c$a
            r2.<init>(r0)
            r0 = r2
            goto L_0x0377
        L_0x0373:
            r12 = 0
            com.tencent.mm.plugin.appbrand.launching.t2$c$b r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83470b.f243905a
        L_0x0377:
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83469a
            if (r1 == 0) goto L_0x039e
            r1 = r0
            com.tencent.mm.plugin.appbrand.launching.t2$c$a r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83469a) r1
            long r1 = r1.f243904a
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r4 = r3.f243255e
            long r14 = r14 - r4
            long r1 = r1 - r14
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x0393
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            goto L_0x0394
        L_0x0393:
            r4 = 1
        L_0x0394:
            r32 = r1
            r1 = r0
            r2 = r4
            r4 = r32
            goto L_0x03a5
        L_0x039b:
            r12 = 0
            r0 = 0
        L_0x039e:
            r1 = r0
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x03a5:
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r7 = "fillConfig() before get app pkg, username[%s] appId[%s] versionType[%d] mIsLaunchedByBackupWxaAttrs[%b] clickTimestamp[%d] timeoutStrategy=[%s], fallbackStrategy[%s]"
            r14 = 7
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = r3.f243262o
            r14[r8] = r15
            java.lang.String r15 = r3.f243263p
            r14[r9] = r15
            int r15 = r3.f243265q
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r6] = r15
            boolean r15 = r3.f243256f
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r16 = 3
            r14[r16] = r15
            long r12 = r3.f243255e
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 4
            r14[r13] = r12
            if (r2 == 0) goto L_0x03e3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r13 = "ms"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            goto L_0x03e5
        L_0x03e3:
            java.lang.String r12 = "false"
        L_0x03e5:
            r13 = 5
            r14[r13] = r12
            r12 = 6
            r14[r12] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r14)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x086a }
            r7 = r24
            r7.get(r4, r0)     // Catch:{ TimeoutException -> 0x086a }
            java.lang.Object r0 = r7.get()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) r0
            r3.f243259i = r9
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r1 = r3.f243257g
            if (r1 == 0) goto L_0x041b
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r1 = r3.f243257g
            r2 = 100
            com.tencent.mm.plugin.appbrand.launching.u r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83483u) r1
            com.tencent.mm.ipcinvoker.g r4 = r1.f243928d
            if (r4 == 0) goto L_0x041b
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult r4 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult
            r4.<init>()
            r4.f243189h = r2
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$d r2 = com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask.C83254d.EVENT_DOWNLOAD_PROGRESS
            r4.f243185d = r2
            com.tencent.mm.ipcinvoker.g r1 = r1.f243928d
            r1.mo894a(r4)
        L_0x041b:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KV14609ReportEvent> r1 = r3.f243240N
            r1.dead()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent> r1 = r3.f243242Q
            r1.dead()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxaGetTestDownloadUrlReportEvent> r1 = r3.f243244R
            r1.dead()
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r1 = r3.f243237K
            java.util.List<com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct> r1 = r1.f243288e
            java.util.List<com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct> r2 = r3.f243241P
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.addAll(r2)
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r1 = r3.f243237K
            java.util.List<com.tencent.mm.plugin.appbrand.report.model.kv_14609> r1 = r1.f243289f
            java.util.List<com.tencent.mm.plugin.appbrand.report.model.kv_14609> r2 = r3.f243239M
            r1.addAll(r2)
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r1 = r3.f243237K
            r2 = r28
            long r4 = r2.f243857d
            r1.f243294n = r4
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r1 = r3.f243237K
            long r4 = r2.f243858e
            r1.f243295o = r4
            if (r0 != 0) goto L_0x04ec
            int r0 = r3.f243265q
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)
            if (r0 == 0) goto L_0x04c2
            boolean r0 = r3.f243256f
            if (r0 != 0) goto L_0x04c2
            java.lang.String r0 = r3.f243262o
            java.lang.String r1 = r3.f243263p
            com.tencent.mm.plugin.appbrand.launching.t2 r2 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "markLaunchFailedByMissedAppPkg(username:"
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = ", appId:"
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = ") ts:"
            r2.append(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            if (r0 == 0) goto L_0x0495
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0493
            goto L_0x0495
        L_0x0493:
            r2 = 0
            goto L_0x0496
        L_0x0495:
            r2 = 1
        L_0x0496:
            if (r2 != 0) goto L_0x04a6
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.t2$a, java.lang.Long> r7 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243900c
            com.tencent.mm.plugin.appbrand.launching.t2$a$b r12 = new com.tencent.mm.plugin.appbrand.launching.t2$a$b
            r12.<init>(r0)
            r7.put(r12, r2)
        L_0x04a6:
            if (r1 == 0) goto L_0x04b1
            int r0 = r1.length()
            if (r0 != 0) goto L_0x04af
            goto L_0x04b1
        L_0x04af:
            r0 = 0
            goto L_0x04b2
        L_0x04b1:
            r0 = 1
        L_0x04b2:
            if (r0 != 0) goto L_0x04c2
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.t2$a, java.lang.Long> r2 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243900c
            com.tencent.mm.plugin.appbrand.launching.t2$a$a r4 = new com.tencent.mm.plugin.appbrand.launching.t2$a$a
            r4.<init>(r1)
            r2.put(r4, r0)
        L_0x04c2:
            r0 = 55
            r3.mo115524l(r0)
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig NULL app pkg, username:%s, appId:%s, instanceId:%s, sessionId:%s, mIsLaunchedByBackupWxaAttrs:%b"
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r4 = r3.f243262o
            r2[r8] = r4
            java.lang.String r4 = r3.f243263p
            r2[r9] = r4
            java.lang.String r4 = r3.f243254d
            r2[r6] = r4
            java.lang.String r4 = r3.f243271w
            r5 = 3
            r2[r5] = r4
            boolean r4 = r3.f243256f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 4
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            goto L_0x0200
        L_0x04ec:
            r11.f261072r = r0
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r11.f261072r
            int r0 = r0.f238585d
            if (r0 == 0) goto L_0x04f8
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r11.f261072r
            r0.pkgVersion = r8
        L_0x04f8:
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig username:%s, appId:%s, instanceId:%s, sessionId:%s, pkg:%s"
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r4 = r3.f243262o
            r2[r8] = r4
            java.lang.String r4 = r11.f261062e
            r2[r9] = r4
            java.lang.String r4 = r3.f243254d
            r2[r6] = r4
            java.lang.String r4 = r3.f243271w
            r5 = 3
            r2[r5] = r4
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r11.f261072r
            r5 = 4
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            java.lang.String r0 = r3.f243263p
            int r1 = r3.f243265q
            boolean r0 = es0.C86666i.m107491a(r0, r1)
            if (r0 == 0) goto L_0x053a
            long r0 = r3.f243261n
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x052b
            r0 = 1
            goto L_0x052c
        L_0x052b:
            r0 = 0
        L_0x052c:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1089(0x441, float:1.526E-42)
            if (r0 == 0) goto L_0x0535
            r0 = 53
            goto L_0x0537
        L_0x0535:
            r0 = 52
        L_0x0537:
            r1.mo175911u(r2, r0)
        L_0x053a:
            if (r25 == 0) goto L_0x0585
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            r1 = r30
            long r4 = r1.f243857d
            r0.f243296p = r4
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            long r1 = r1.f243858e
            r0.f243297q = r1
            java.lang.Object r0 = r25.get()
            if (r0 == 0) goto L_0x0585
            java.lang.Object r0 = r25.get()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r2 = "checkWxaJsApiInfoHashMap size:%d"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            if (r0 == 0) goto L_0x0567
            int r12 = r0.size()
            goto L_0x0568
        L_0x0567:
            r12 = 0
        L_0x0568:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r4[r8] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            r11.f234857B = r0
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            java.lang.Object r1 = r25.get()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f243302v = r1
        L_0x0585:
            r1 = r31
            if (r1 == 0) goto L_0x05d8
            if (r22 == 0) goto L_0x05d8
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            long r4 = r1.f243857d
            r0.f243298r = r4
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            long r1 = r1.f243858e
            r0.f243299s = r1
            java.lang.Object r0 = r22.get()
            if (r0 == 0) goto L_0x05d8
            java.lang.Object r0 = r22.get()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r2 = "checkAppidABTestInfoHashMap size:%d"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            if (r0 == 0) goto L_0x05b4
            int r12 = r0.size()
            goto L_0x05b5
        L_0x05b4:
            r12 = 0
        L_0x05b5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r4[r8] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            int r1 = r0.size()
            if (r1 < r9) goto L_0x05c6
            r11.f234858C = r0
        L_0x05c6:
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            java.lang.Object r1 = r22.get()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f243303w = r1
        L_0x05d8:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            r11.f234876S0 = r0
            np0.b0 r0 = np0.C34962b0.INSTANCE
            java.lang.String r1 = r3.f243263p
            java.lang.String r2 = "copypath"
            java.lang.Long r0 = r0.mo59804B(r1, r2)
            if (r0 != 0) goto L_0x05ed
            r0 = 0
            goto L_0x05f1
        L_0x05ed:
            long r0 = r0.longValue()
        L_0x05f1:
            r11.f234874R0 = r0
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "copyPathMenuShowExpireTime = "
            r1.append(r2)
            long r4 = r11.f234874R0
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r11.f261072r
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.launching.n0 r2 = new com.tencent.mm.plugin.appbrand.launching.n0
            r2.<init>(r3, r0)
            java.lang.String r0 = "AppLaunchPrepareProcess#ExtraWorks"
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183876g(r2, r0)
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig ok username %s, appId %s"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r4 = r3.f243262o
            r2[r8] = r4
            java.lang.String r4 = r3.f243263p
            r2[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = r3.f243263p
            r0[r8] = r1
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r1 = r3.f243257g
            if (r1 == 0) goto L_0x0638
            r1 = 1
            goto L_0x0639
        L_0x0638:
            r1 = 0
        L_0x0639:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r9] = r1
            java.lang.String r1 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r2 = "transferDataForDB start with appId:%s callback!=null:%b "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.launching.i0 r2 = new com.tencent.mm.plugin.appbrand.launching.i0
            r2.<init>(r3)
            r4 = 5000(0x1388, double:2.4703E-320)
            zt3.j r0 = (zt3.C119157j) r0
            lu3.c r0 = r0.mo183878i(r2, r4)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r4 = r3.f243263p
            r2[r8] = r4
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r4 = r3.f243257g
            if (r4 == 0) goto L_0x0662
            r4 = 1
            goto L_0x0663
        L_0x0662:
            r4 = 0
        L_0x0663:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r9] = r4
            java.lang.String r4 = "DATA_TRANSFER_STATE_START with appId:%s, callback!=null:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r2 = r3.f243257g
            if (r2 == 0) goto L_0x0679
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r2 = r3.f243257g
            com.tencent.mm.plugin.appbrand.launching.u r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83483u) r2
            r2.mo113179K(r9)
        L_0x0679:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.j r4 = new com.tencent.mm.plugin.appbrand.appstorage.j
            java.lang.String r5 = r3.f243263p
            r4.<init>(r5)
            r2.add(r4)
            boolean r4 = r3.f243227A
            if (r4 == 0) goto L_0x06a4
            com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized r4 = r11.f234856A
            com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle r4 = r4.f234895d
            if (r4 == 0) goto L_0x06a2
            byte[] r4 = r4.f245266d
            if (r4 == 0) goto L_0x06a2
            int r5 = r4.length
            r7 = 1073(0x431, float:1.504E-42)
            if (r5 < r7) goto L_0x06a2
            r5 = 1072(0x430, float:1.502E-42)
            byte r4 = r4[r5]
            if (r4 != r9) goto L_0x06a2
            goto L_0x06a4
        L_0x06a2:
            r4 = 0
            goto L_0x06a5
        L_0x06a4:
            r4 = 1
        L_0x06a5:
            if (r4 == 0) goto L_0x0772
            sg.q r4 = new sg.q
            f40.e r5 = f40.C86709a0.m107523b()
            int r5 = r5.mo121110g()
            r4.<init>((int) r5)
            long r4 = r4.longValue()
            java.lang.String r7 = r3.f243263p
            java.lang.String r12 = "appId"
            gy3.C87412m.m108594g(r7, r12)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "hadTransferToEncryptMMKV"
            r15.append(r13)
            r13 = 35
            r15.append(r13)
            r15.append(r4)
            r15.append(r13)
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            boolean r7 = r14.getBoolean(r7, r8)
            if (r7 == 0) goto L_0x075a
            com.tencent.mm.plugin.appbrand.appstorage.d r7 = com.tencent.p014mm.plugin.appbrand.appstorage.C1520d.f10881a
            java.lang.String r13 = r3.f243263p
            gy3.C87412m.m108594g(r13, r12)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C1520d.f10884d
            fy3.p<java.lang.Long, java.lang.String, java.lang.String> r14 = com.tencent.p014mm.plugin.appbrand.appstorage.C1520d.f10882b
            java.lang.Long r15 = java.lang.Long.valueOf(r4)
            com.tencent.mm.plugin.appbrand.appstorage.d$b r14 = (com.tencent.p014mm.plugin.appbrand.appstorage.C1520d.C1522b) r14
            java.lang.Object r14 = r14.invoke(r15, r13)
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = r12.getBoolean(r14, r8)
            fy3.p<java.lang.Long, java.lang.String, java.lang.String> r15 = com.tencent.p014mm.plugin.appbrand.appstorage.C1520d.f10883c
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            com.tencent.mm.plugin.appbrand.appstorage.d$a r15 = (com.tencent.p014mm.plugin.appbrand.appstorage.C1520d.C1521a) r15
            java.lang.Object r6 = r15.invoke(r6, r13)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r12.getBoolean(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[tryCleanDirty] isDirty["
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "]  hadBeenCleanedDirty["
            r8.append(r9)
            r8.append(r6)
            r9 = 93
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            if (r14 == 0) goto L_0x075a
            if (r6 != 0) goto L_0x075a
            java.lang.Class<tb.a> r6 = p1039tb.C90388a.class
            ra.b r6 = p224ra.C89909e.m112436a(r6)
            tb.a r6 = (p1039tb.C90388a) r6
            r6.mo56836Sl(r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.lang.Object r6 = r15.invoke(r6, r13)
            java.lang.String r6 = (java.lang.String) r6
            r8 = 1
            r12.putBoolean(r6, r8)
            r7.mo1533a(r4, r13)
            java.lang.String r4 = "[tryCleanDirty] finish clean"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
        L_0x075a:
            com.tencent.mm.plugin.appbrand.appstorage.a r4 = new com.tencent.mm.plugin.appbrand.appstorage.a
            java.lang.String r5 = r3.f243263p
            ni0.a r6 = ni0.C88943a.f256519a
            f40.e r7 = f40.C86709a0.m107523b()
            int r7 = r7.mo121110g()
            java.lang.String r6 = r6.mo123331a(r5, r7)
            r4.<init>(r5, r6)
            r2.add(r4)
        L_0x0772:
            com.tencent.mm.plugin.appbrand.launching.h0 r4 = new com.tencent.mm.plugin.appbrand.launching.h0
            java.lang.String r5 = r3.f243263p
            r4.<init>(r5)
            r2.add(r4)
            int r4 = r2.size()
            eb0.q2[] r4 = new eb0.C86491q2[r4]
            java.lang.Object[] r2 = r2.toArray(r4)
            eb0.q2[] r2 = (eb0.C86491q2[]) r2
            int r4 = r2.length
            r12 = 0
        L_0x078a:
            if (r12 >= r4) goto L_0x079e
            r5 = r2[r12]
            int r6 = qe3.C89625d.f257841g
            boolean r6 = r5.mo56581b(r6)
            if (r6 == 0) goto L_0x079b
            int r6 = qe3.C89625d.f257841g
            r5.mo56582c(r6)
        L_0x079b:
            int r12 = r12 + 1
            goto L_0x078a
        L_0x079e:
            r5 = 0
            r0.cancel(r5)
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r3.f243263p
            r0[r5] = r2
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r2 = r3.f243257g
            if (r2 == 0) goto L_0x07af
            r13 = 1
            goto L_0x07b0
        L_0x07af:
            r13 = 0
        L_0x07b0:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r4 = 1
            r0[r4] = r2
            java.lang.String r2 = "DATA_TRANSFER_STATE_FINISH with appId:%s, callback!=null:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r0 = r3.f243257g
            if (r0 == 0) goto L_0x07c8
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r0 = r3.f243257g
            com.tencent.mm.plugin.appbrand.launching.u r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83483u) r0
            r1 = 2
            r0.mo113179K(r1)
        L_0x07c8:
            com.tencent.mm.plugin.appbrand.appstorage.i r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C29331i.f80084a
            java.lang.String r1 = r3.f243263p
            int r0 = r0.mo56609a(r1)
            r11.f261073s = r0
            com.tencent.mm.plugin.appbrand.appstorage.k r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C29336k.f80092a
            monitor-enter(r1)
            com.tencent.mm.plugin.appbrand.app.g2 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.vx0()     // Catch:{ all -> 0x0867 }
            r0.getClass()     // Catch:{ all -> 0x0867 }
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ all -> 0x0867 }
            monitor-exit(r1)
            r2 = 0
            r11.f261074t = r2
            ni0.a r0 = ni0.C88943a.f256519a
            java.lang.String r2 = r3.f243263p
            f40.e r4 = f40.C86709a0.m107523b()
            int r4 = r4.mo121110g()
            java.lang.String r0 = r0.mo123331a(r2, r4)
            r11.f261075u = r0
            int r0 = r11.f261073s
            r4 = 8
            r6 = 1817(0x719, double:8.977E-321)
            r8 = 1016(0x3f8, double:5.02E-321)
            r2 = 2
            if (r0 != r2) goto L_0x082a
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 7
            r0.mo175912v(r8, r1)
            com.tencent.mm.plugin.appbrand.appstorage.b r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C29319b.f80050a
            monitor-enter(r8)
            com.tencent.mm.plugin.appbrand.app.g2 r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.vx0()     // Catch:{ all -> 0x0827 }
            r9.getClass()     // Catch:{ all -> 0x0827 }
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ all -> 0x0827 }
            int r9 = com.tencent.p014mm.plugin.appbrand.appstorage.C29319b.f80052c     // Catch:{ all -> 0x0827 }
            r12 = 2
            if (r9 != r12) goto L_0x081b
            r13 = 1
            goto L_0x081c
        L_0x081b:
            r13 = 0
        L_0x081c:
            monitor-exit(r8)
            if (r13 == 0) goto L_0x0823
            r0.mo175912v(r6, r4)
            goto L_0x0861
        L_0x0823:
            r0.mo175912v(r6, r1)
            goto L_0x0861
        L_0x0827:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x082a:
            r2 = 3
            if (r0 != r2) goto L_0x0833
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0.mo175912v(r8, r4)
            goto L_0x0861
        L_0x0833:
            r2 = 1
            if (r0 != r2) goto L_0x084c
            boolean r0 = r1.mo56615a()
            if (r0 == 0) goto L_0x0844
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 10
            r0.mo175912v(r8, r1)
            goto L_0x0861
        L_0x0844:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 9
            r0.mo175912v(r8, r1)
            goto L_0x0861
        L_0x084c:
            r1 = 4
            if (r0 != r1) goto L_0x0857
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 6
            r0.mo175912v(r6, r1)
            goto L_0x0861
        L_0x0857:
            r1 = 5
            if (r0 != r1) goto L_0x0861
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 5
            r0.mo175912v(r6, r1)
        L_0x0861:
            r2 = 2
            r4 = 0
            r7 = 1
            r13 = 1
            goto L_0x097e
        L_0x0867:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x086a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0963
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r2 = "fillConfig, get app pkg timeout, try fallback backup wxaattrs, username[%s] appId[%s] awaitTimeout[%d]"
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = r3.f243262o
            r8 = 0
            r7[r8] = r6
            java.lang.String r6 = r3.f243263p
            r8 = 1
            r7[r8] = r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            r7[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r7)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r3.f243276z
            if (r0 == 0) goto L_0x088f
            int r12 = r0.f239452d
            goto L_0x0890
        L_0x088f:
            r12 = 0
        L_0x0890:
            r0 = 9
            java.lang.String r2 = r3.f243263p
            int r4 = r3.f243265q
            boolean r5 = r3.f243227A
            com.tencent.p014mm.plugin.appbrand.C83606m1.m102639c(r0, r2, r12, r4, r5)
            r2 = 1
            r3.f243273x0 = r2
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$e r0 = r3.f243257g
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r3.f243262o
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = r3.f243263p
            r5[r2] = r4
            if (r0 != 0) goto L_0x08b0
            r13 = 1
            goto L_0x08b1
        L_0x08b0:
            r13 = 0
        L_0x08b1:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r4 = 2
            r5[r4] = r2
            java.lang.String r2 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r4 = "notifyFallbackBackupWxaAttrs username[%s] appId[%s] null==callback[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)
            if (r0 == 0) goto L_0x08c6
            com.tencent.mm.plugin.appbrand.launching.u r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83483u) r0
            r0.mo115780b()
        L_0x08c6:
            com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct     // Catch:{ all -> 0x0952 }
            r0.<init>()     // Catch:{ all -> 0x0952 }
            java.lang.String r2 = r3.f243263p     // Catch:{ all -> 0x0952 }
            java.lang.String r4 = "Appid"
            r5 = 1
            java.lang.String r2 = r0.mo86045b(r4, r2, r5)     // Catch:{ all -> 0x0952 }
            r0.f236431d = r2     // Catch:{ all -> 0x0952 }
            java.lang.String r2 = r3.f243262o     // Catch:{ all -> 0x0952 }
            java.lang.String r4 = "Username"
            r5 = 1
            java.lang.String r2 = r0.mo86045b(r4, r2, r5)     // Catch:{ all -> 0x0952 }
            r0.f236432e = r2     // Catch:{ all -> 0x0952 }
            int r2 = r3.f243267s     // Catch:{ all -> 0x0952 }
            long r4 = (long) r2     // Catch:{ all -> 0x0952 }
            r0.f236433f = r4     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r3.f243276z     // Catch:{ all -> 0x0952 }
            int r2 = r2.f239452d     // Catch:{ all -> 0x0952 }
            long r4 = (long) r2     // Catch:{ all -> 0x0952 }
            r0.f236434g = r4     // Catch:{ all -> 0x0952 }
            java.lang.Object r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r21)     // Catch:{ all -> 0x0952 }
            wi0.b0 r2 = (wi0.C90975b0) r2     // Catch:{ all -> 0x0952 }
            java.lang.String r4 = r3.f243263p     // Catch:{ all -> 0x0952 }
            java.lang.String r5 = "versionInfo"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.mo114011mL(r4, r5)     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r2 = r2.mo113942o2()     // Catch:{ all -> 0x0952 }
            int r2 = r2.f239452d     // Catch:{ all -> 0x0952 }
            long r4 = (long) r2     // Catch:{ all -> 0x0952 }
            r0.f236435h = r4     // Catch:{ all -> 0x0952 }
            r4 = 1
            r0.f236436i = r4     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.launching.t2$c$a r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83469a) r1     // Catch:{ all -> 0x0952 }
            long r1 = r1.f243904a     // Catch:{ all -> 0x0952 }
            r0.f236437j = r1     // Catch:{ all -> 0x0952 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0952 }
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r1)     // Catch:{ all -> 0x0952 }
            java.lang.String r2 = "NetType"
            r4 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)     // Catch:{ all -> 0x0952 }
            r0.f236438k = r1     // Catch:{ all -> 0x0952 }
            r1 = 0
            r0.f236439l = r1     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r1 = r3.f243236J     // Catch:{ all -> 0x0952 }
            java.lang.String r1 = r1.f245832d     // Catch:{ all -> 0x0952 }
            java.lang.String r2 = "InstanceId"
            r4 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)     // Catch:{ all -> 0x0952 }
            r0.f236440m = r1     // Catch:{ all -> 0x0952 }
            r0.mo86054n()     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r1 = r3.f243236J     // Catch:{ all -> 0x0952 }
            java.lang.String r1 = r1.f245832d     // Catch:{ all -> 0x0952 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct> r2 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.f243902a     // Catch:{ all -> 0x0952 }
            java.lang.String r2 = "instanceId"
            gy3.C87412m.m108594g(r1, r2)     // Catch:{ all -> 0x0952 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct> r2 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.f243902a     // Catch:{ all -> 0x0952 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0952 }
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r0 = r3.f243236J     // Catch:{ all -> 0x0952 }
            java.lang.String r0 = r0.f245832d     // Catch:{ all -> 0x0952 }
            r1 = 2
            com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.m102430b(r0, r1)     // Catch:{ all -> 0x0952 }
            goto L_0x0200
        L_0x0952:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r2 = "fillConfig, report fallback get exception %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r5)
            r2 = 2
            goto L_0x0202
        L_0x0963:
            throw r0
        L_0x0964:
            r11 = r29
            r4 = 0
            r3.mo115524l(r7)
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig username %s, appId %s, get null jsapi_info"
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r3.f243262o
            r5[r4] = r6
            java.lang.String r6 = r3.f243263p
            r7 = 1
            r5[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r5)
        L_0x097d:
            r13 = 0
        L_0x097e:
            if (r13 != 0) goto L_0x09b0
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "fillConfig, false, username %s, appId %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r3.f243262o
            r2[r4] = r5
            java.lang.String r4 = r3.f243263p
            r2[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r3.f243276z
            if (r0 != 0) goto L_0x0997
            r12 = 0
            goto L_0x0999
        L_0x0997:
            int r12 = r0.f239452d
        L_0x0999:
            r0 = 8
            java.lang.String r1 = r3.f243263p
            int r2 = r3.f243265q
            boolean r4 = r3.f243227A
            com.tencent.p014mm.plugin.appbrand.C83606m1.m102639c(r0, r1, r12, r2, r4)
            T r0 = r10.f29691a
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r0 = (com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction) r0
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r1 = r3.f243237K
            r2 = 0
            op3.c r0 = op3.C117882j.m166285d(r2, r0, r1)
            return r0
        L_0x09b0:
            r2 = 0
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "prepare ok, just go weapp, username %s, appId %s"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r3.f243262o
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = r3.f243263p
            r6 = 1
            r5[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
            int r0 = r3.f243265q
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)
            if (r0 == 0) goto L_0x0a6b
            java.lang.String r0 = r3.f243262o     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.launching.t2 r1 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a     // Catch:{ Exception -> 0x0a52 }
            if (r0 == 0) goto L_0x09dd
            int r1 = r0.length()     // Catch:{ Exception -> 0x0a52 }
            if (r1 != 0) goto L_0x09db
            goto L_0x09dd
        L_0x09db:
            r13 = 0
            goto L_0x09de
        L_0x09dd:
            r13 = 1
        L_0x09de:
            if (r13 == 0) goto L_0x09e2
            r10 = r2
            goto L_0x09f0
        L_0x09e2:
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.t2$a, com.tencent.mm.plugin.appbrand.config.WxaAttributes> r1 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243899b     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.launching.t2$a$b r4 = new com.tencent.mm.plugin.appbrand.launching.t2$a$b     // Catch:{ Exception -> 0x0a52 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0a52 }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ Exception -> 0x0a52 }
            r10 = r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r10 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r10     // Catch:{ Exception -> 0x0a52 }
        L_0x09f0:
            if (r10 == 0) goto L_0x09fe
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r10.mo113942o2()     // Catch:{ Exception -> 0x0a52 }
            int r0 = r0.f239452d     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r1 = r3.f243276z     // Catch:{ Exception -> 0x0a52 }
            int r1 = r1.f239452d     // Catch:{ Exception -> 0x0a52 }
            if (r0 == r1) goto L_0x0a0f
        L_0x09fe:
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.i> r0 = com.tencent.p014mm.plugin.appbrand.config.C81660i.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.i r0 = (com.tencent.p014mm.plugin.appbrand.config.C81660i) r0     // Catch:{ Exception -> 0x0a52 }
            java.lang.String r1 = r3.f243262o     // Catch:{ Exception -> 0x0a52 }
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r10 = r0.mo114000LL(r1, r5)     // Catch:{ Exception -> 0x0a52 }
        L_0x0a0f:
            java.lang.String r0 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r1 = "prepare ok, try backup available attrs with username(%s) appId(%s), now.versionInfo.appVersion:%d, record.versionInfo.appVersion:%d"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0a52 }
            java.lang.String r5 = r3.f243262o     // Catch:{ Exception -> 0x0a52 }
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x0a52 }
            java.lang.String r5 = r3.f243263p     // Catch:{ Exception -> 0x0a52 }
            r6 = 1
            r4[r6] = r5     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r3.f243276z     // Catch:{ Exception -> 0x0a52 }
            int r5 = r5.f239452d     // Catch:{ Exception -> 0x0a52 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0a52 }
            r6 = 2
            r4[r6] = r5     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r10.mo113942o2()     // Catch:{ Exception -> 0x0a52 }
            int r5 = r5.f239452d     // Catch:{ Exception -> 0x0a52 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0a52 }
            r6 = 3
            r4[r6] = r5     // Catch:{ Exception -> 0x0a52 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r10.mo113942o2()     // Catch:{ Exception -> 0x0a52 }
            int r0 = r0.f239452d     // Catch:{ Exception -> 0x0a52 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r1 = r3.f243276z     // Catch:{ Exception -> 0x0a52 }
            int r1 = r1.f239452d     // Catch:{ Exception -> 0x0a52 }
            if (r0 != r1) goto L_0x0a6b
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r21)     // Catch:{ Exception -> 0x0a52 }
            wi0.b0 r0 = (wi0.C90975b0) r0     // Catch:{ Exception -> 0x0a52 }
            r0.mo125053nP(r10)     // Catch:{ Exception -> 0x0a52 }
            goto L_0x0a6b
        L_0x0a52:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            java.lang.String r4 = "prepare ok, try backup available attrs failed with username(%s) appId(%s) by exception:%s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r3.f243262o
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = r3.f243263p
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)
        L_0x0a6b:
            java.lang.String r0 = r3.f243262o
            java.lang.String r1 = r3.f243263p
            com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102426g(r0, r1)
            java.lang.String r0 = r3.f243262o
            java.lang.String r1 = r3.f243263p
            com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102424c(r0, r1)
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            long r4 = r3.f243238L
            r0.f243290g = r4
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f243291h = r4
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r3.f243237K
            op3.c r0 = op3.C117882j.m166285d(r11, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess.mo115516a():op3.c");
    }

    /* renamed from: b */
    public final void mo115517b(String str, AppLaunchPrepareProcess$$d appLaunchPrepareProcess$$d) {
        if (!this.f243258h || this.f243257g == null) {
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "inqueue CallbackEvent(%s) for appId:%s, instanceId:%s", str, this.f243263p, this.f243254d);
            ((ConcurrentLinkedQueue) this.f243245R0).add(Pair.create(str, appLaunchPrepareProcess$$d));
        } else if (!mo115521f()) {
            mo115525m(str, appLaunchPrepareProcess$$d);
        }
    }

    /* renamed from: c */
    public final void mo115518c(String str) {
        try {
            AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = this.f243243Q0;
            if (appBrandBackgroundFetchDataParcel != null) {
                com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "dispatchDeferredBackgroundFetchDataResponse(%s), instanceId:%s, appId:%s, updateTime:%d", str, this.f243254d, this.f243263p, Long.valueOf(appBrandBackgroundFetchDataParcel.f80222j));
                C81964j.m100679b(this.f243263p, appBrandBackgroundFetchDataParcel);
            }
        } finally {
            this.f243243Q0 = null;
        }
    }

    /* renamed from: d */
    public final boolean mo115519d() {
        return !this.f243232F.mo111351b();
    }

    /* renamed from: e */
    public void mo115520e(String str) {
        LinkedList linkedList;
        synchronized (this.f243246S) {
            linkedList = new LinkedList(this.f243246S);
            this.f243246S.clear();
        }
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "emitPendingPluginUpdateStatusChangeEventsToClientProcess, instanceId:%s, events.size:%d, reason:%s", this.f243254d, Integer.valueOf(linkedList.size()), str);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C83349j3 j3Var = (C83349j3) it.next();
            AppBrandPluginUpdateStatusChangeIPCMessage.f243132n.mo115491b(this.f243254d, j3Var.f243563a, j3Var.f243564b, j3Var.f243565c, j3Var.f243566d);
        }
    }

    /* renamed from: f */
    public final boolean mo115521f() {
        while (!((ConcurrentLinkedQueue) this.f243245R0).isEmpty()) {
            Pair pair = (Pair) ((ConcurrentLinkedQueue) this.f243245R0).poll();
            if (mo115525m((String) pair.first, (AppLaunchPrepareProcess$$d) pair.second)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo115522g(C117878c<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> cVar) {
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch] onPrepareDone %s %d in mm process, sessionId:%s, instanceId:%s", this.f243263p, Integer.valueOf(this.f243265q), this.f243271w, this.f243254d);
        mo115523h(cVar);
        C87176d dVar = C87176d.f252818a;
        C87175c b = dVar.mo121614b(this.f243254d, false);
        if (b instanceof C79620c) {
            ((C79620c) b).mo109759b(this.f243236J);
        }
        dVar.mo121613a(this.f243254d);
        f243225U0.remove(this.f243254d);
    }

    /* renamed from: h */
    public final void mo115523h(C117878c<AppBrandSysConfigWC, AppBrandLaunchErrorAction, AppStartupPerformanceReportBundle> cVar) {
        this.f243260j = cVar;
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) cVar.mo182596a(0);
        AppBrandLaunchErrorAction appBrandLaunchErrorAction = (AppBrandLaunchErrorAction) cVar.mo182596a(1);
        if (this.f243247T != null) {
            if (appBrandSysConfigWC != null) {
                this.f243247T.mo115809m2(appBrandSysConfigWC);
                appBrandSysConfigWC.f234856A.f234898g = this.f243248U;
                appBrandSysConfigWC.f234856A.f234899h = this.f243249V;
                com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][permission] onResult, update permissionBundle[%s] username[%s] appId[%s] relyCommLibUpdate[%b] restartOnWxaAttrAsyncUpdatedByLaunch[%b]", appBrandSysConfigWC.f234856A.f234895d, this.f243262o, this.f243263p, Boolean.valueOf(this.f243248U), Boolean.valueOf(this.f243249V));
            }
            appBrandLaunchErrorAction = AppBrandLaunchErrorAction.CREATOR.mo115481a(this.f243263p, this.f243265q, this.f243247T);
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][permission] onResult, updated errorAction[%s] username[%s] appId[%s]", appBrandLaunchErrorAction, this.f243262o, this.f243263p);
            if (appBrandLaunchErrorAction != null) {
                appBrandSysConfigWC = null;
            }
        }
        if (!(this.f243251X == null || appBrandSysConfigWC == null)) {
            appBrandSysConfigWC.f234857B = this.f243251X;
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate]] onResult, update permissionBundle[%s] username[%s] appId[%s]", appBrandSysConfigWC.f234856A.f234895d, this.f243262o, this.f243263p);
        }
        if (!(this.f243252Y == null || appBrandSysConfigWC == null)) {
            HashMap<String, AppRuntimeAppidABTestPermissionBundle> hashMap = this.f243252Y;
            appBrandSysConfigWC.f234858C = hashMap;
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate]] onResult, update permissionBundle[%s] username[%s] appId[%s]", hashMap, this.f243262o, this.f243263p);
        }
        if (this.f243257g != null) {
            AppLaunchPrepareProcess$$e appLaunchPrepareProcess$$e = this.f243257g;
            AppStartupPerformanceReportBundle appStartupPerformanceReportBundle = (AppStartupPerformanceReportBundle) cVar.mo182596a(2);
            C83483u uVar = (C83483u) appLaunchPrepareProcess$$e;
            if (uVar.f243928d != null) {
                com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandPrepareTask", "AppBrandRuntimeProfile| startPrepare onResult %s", uVar.f243929e.f243170i);
                AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
                prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_PREPARE_DONE;
                prepareResult.f243187f = appBrandSysConfigWC;
                prepareResult.f243186e = appBrandLaunchErrorAction;
                prepareResult.f243188g = appStartupPerformanceReportBundle;
                uVar.f243928d.mo894a(prepareResult);
                if (appBrandSysConfigWC != null) {
                    AppBrandPrepareTask.PrepareParams prepareParams = uVar.f243929e;
                    IPCUpdateStateNotifier iPCUpdateStateNotifier = new IPCUpdateStateNotifier(prepareParams.f243165d, prepareParams.f243170i);
                    AppBrandPrepareTask.PrepareParams prepareParams2 = uVar.f243929e;
                    if (prepareParams2.f243178t || !C81289m.C81290a.m99664b(prepareParams2.f243172n)) {
                        iPCUpdateStateNotifier.mo115556a(C91291c.NO_UPDATE, 0, (String) null, appBrandSysConfigWC.f239418g1, appBrandSysConfigWC.f239419h1);
                    } else {
                        new C83518x0(uVar.f243929e, iPCUpdateStateNotifier).mo115811a();
                    }
                } else {
                    try {
                        C81662k.m100196o(C81661j.m100181f(uVar.f243929e.f243170i));
                    } catch (Exception unused) {
                    }
                }
            }
            m102199k(this.f243254d, false);
            mo115520e("notifyResult");
            mo115518c("notifyResult");
        }
    }

    /* renamed from: l */
    public final void mo115524l(int i) {
        if (!this.f243231E && "wxb6d22f922f37b35a".equals(this.f243263p) && C81289m.C81290a.m99664b(this.f243265q)) {
            this.f243231E = true;
            C115669n.INSTANCE.mo175911u(C82260t.CTRL_INDEX, i);
            String str = this.f243263p;
            WxaAttributes.WxaVersionInfo wxaVersionInfo = this.f243276z;
            C84240s.m103843i(str, wxaVersionInfo == null ? 0 : wxaVersionInfo.f239452d, this.f243265q, C82260t.CTRL_INDEX, i, 1);
        }
    }

    /* renamed from: m */
    public final boolean mo115525m(String str, AppLaunchPrepareProcess$$d appLaunchPrepareProcess$$d) {
        boolean a = appLaunchPrepareProcess$$d.mo115527a();
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "runCallbackEvent(%s) for appId:%s, instanceId:%s, return %b", str, this.f243263p, this.f243254d, Boolean.valueOf(a));
        return a;
    }

    /* renamed from: n */
    public final void mo115526n() {
        if (!this.f243258h) {
            C83226n.m102130g(this.f243263p, KSProcessWeAppLaunch.stepPrepareResourceGroup);
            C83226n.m102130g(this.f243263p, KSProcessWeAppLaunch.stepPrepareResourceProcess);
            this.f243258h = true;
            this.f243238L = Util.nowMilliSecond();
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch] startPrepare in mm appId[%s] type[%d] scene[%d], instanceId[%s], sessionId[%s]", this.f243263p, Integer.valueOf(this.f243265q), Integer.valueOf(this.f243267s), this.f243254d, this.f243271w);
            C111055b<String, AppLaunchPrepareProcess> bVar = f243223S0;
            synchronized (bVar) {
                bVar.put(this.f243254d, this);
            }
            new AppLaunchPrepareProcess$$c(this.f243254d, this.f243236J).startTimer(TimeUnit.SECONDS.toMillis(300));
            if (this.f243276z == null) {
                com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "startPrepare() NULL wxaVersionInfo username[%s], appId[%s]", this.f243262o, this.f243263p);
                C83454r3.m102415a(C0966R.string.f7747qa, this);
                mo115522g(f243226V0);
                return;
            }
            new MMHandler(String.format(Locale.US, "AppLaunchPrepareProcess[%s %d]", new Object[]{this.f243263p, Integer.valueOf(this.f243265q)})).post(new AppLaunchPrepareProcess$$b(this));
        }
    }

    public AppLaunchPrepareProcess(String str, String str2, int i, int i2, int i3, String str3, String str4, AppBrandLaunchReferrer appBrandLaunchReferrer, String str5, ICommLibReader iCommLibReader, WxaAttributes.WxaVersionInfo wxaVersionInfo, boolean z, boolean z2, QualitySession qualitySession, long j, boolean z3, C80247h hVar, AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer, String str6, int i4, int i5, AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle, boolean z4) {
        String str7 = str;
        String str8 = str2;
        String str9 = str5;
        ICommLibReader iCommLibReader2 = iCommLibReader;
        WxaAttributes.WxaVersionInfo wxaVersionInfo2 = wxaVersionInfo;
        boolean z5 = z;
        QualitySession qualitySession2 = qualitySession;
        this.f243261n = -1;
        this.f243231E = false;
        this.f243239M = new CopyOnWriteArrayList();
        C40008f fVar = C40008f.f107254d;
        this.f243240N = new IListener<KV14609ReportEvent>(fVar) {
            {
                this.__eventId = -356225563;
            }

            public boolean callback(IEvent iEvent) {
                KV14609ReportEvent kV14609ReportEvent = (KV14609ReportEvent) iEvent;
                if (AppLaunchPrepareProcess.this.f243263p.equals(kV14609ReportEvent.f236226d.f236227a.f245668g)) {
                    AppLaunchPrepareProcess appLaunchPrepareProcess = AppLaunchPrepareProcess.this;
                    int i = appLaunchPrepareProcess.f243276z.f239452d;
                    kv_14609 kv_14609 = kV14609ReportEvent.f236226d.f236227a;
                    if (i == kv_14609.f245672n) {
                        kv_14609.f245666e = appLaunchPrepareProcess.f243236J;
                        ((CopyOnWriteArrayList) appLaunchPrepareProcess.f243239M).add(kv_14609);
                        ((kv_14609.C84152d) kV14609ReportEvent.f236226d.f236228b).f245687b = true;
                        return true;
                    }
                }
                kv_14609 kv_146092 = kV14609ReportEvent.f236226d.f236227a;
                if (kv_146092.f245684z != 6) {
                    return false;
                }
                ((CopyOnWriteArrayList) AppLaunchPrepareProcess.this.f243239M).add(kv_146092);
                KV14609ReportEvent.C80727a aVar = kV14609ReportEvent.f236226d;
                aVar.f236227a.f245666e = AppLaunchPrepareProcess.this.f243236J;
                ((kv_14609.C84152d) aVar.f236228b).f245687b = true;
                return true;
            }
        };
        this.f243241P = new CopyOnWriteArrayList();
        this.f243242Q = new IListener<WxaGetDownloadUrlReportEvent>(fVar) {
            {
                this.__eventId = 1901080293;
            }

            public boolean callback(IEvent iEvent) {
                WxaGetDownloadUrlReportEvent wxaGetDownloadUrlReportEvent = (WxaGetDownloadUrlReportEvent) iEvent;
                if (AppLaunchPrepareProcess.this.f243263p.equals(((C52246zc2) wxaGetDownloadUrlReportEvent.f236306d.f236307a.f238685p.f127055a.f127080a).f145806e)) {
                    int i = AppLaunchPrepareProcess.this.f243276z.f239452d;
                    C47465a aVar = wxaGetDownloadUrlReportEvent.f236306d.f236307a.f238685p.f127055a.f127080a;
                    if (i == ((C52246zc2) aVar).f145807f && (((C52246zc2) aVar).f145809h == 0 || ((C52246zc2) aVar).f145809h == 4)) {
                        WeAppQualitySystemGetDownloadCGIStruct weAppQualitySystemGetDownloadCGIStruct = new WeAppQualitySystemGetDownloadCGIStruct();
                        weAppQualitySystemGetDownloadCGIStruct.f237168g = WeAppQualitySystemGetDownloadCGIStruct.C80779a.release;
                        WxaGetDownloadUrlReportEvent.C80747a aVar2 = wxaGetDownloadUrlReportEvent.f236306d;
                        long j = aVar2.f236310d - aVar2.f236309c;
                        weAppQualitySystemGetDownloadCGIStruct.f237170i = j;
                        weAppQualitySystemGetDownloadCGIStruct.mo86046c("CostTimeMs", j);
                        long j2 = wxaGetDownloadUrlReportEvent.f236306d.f236309c;
                        weAppQualitySystemGetDownloadCGIStruct.f237172k = j2;
                        weAppQualitySystemGetDownloadCGIStruct.mo86048e("StartTimeStampMs", j2);
                        long j3 = wxaGetDownloadUrlReportEvent.f236306d.f236310d;
                        weAppQualitySystemGetDownloadCGIStruct.f237173l = j3;
                        weAppQualitySystemGetDownloadCGIStruct.mo86048e("EndTimeStampMs", j3);
                        weAppQualitySystemGetDownloadCGIStruct.f237174m = C90077a.m112679b(wxaGetDownloadUrlReportEvent.f236306d.f236308b) ? WeAppQualitySystemGetDownloadCGIStruct.C80780b.ok : WeAppQualitySystemGetDownloadCGIStruct.C80780b.common_fail;
                        weAppQualitySystemGetDownloadCGIStruct.f237175n = (long) C84201i.m103806c();
                        weAppQualitySystemGetDownloadCGIStruct.f237179r = weAppQualitySystemGetDownloadCGIStruct.mo86045b("NetworkTypeStr", C84116i0.m103659b(MMApplicationContext.getContext()), true);
                        ((CopyOnWriteArrayList) AppLaunchPrepareProcess.this.f243241P).add(weAppQualitySystemGetDownloadCGIStruct);
                        return true;
                    }
                }
                return false;
            }
        };
        this.f243244R = new IListener<WxaGetTestDownloadUrlReportEvent>(fVar) {
            {
                this.__eventId = 1694589719;
            }

            public boolean callback(IEvent iEvent) {
                String str = AppLaunchPrepareProcess.this.f243263p;
                ((WxaGetTestDownloadUrlReportEvent) iEvent).f79072d.getClass();
                throw null;
            }
        };
        this.f243246S = new LinkedList<>();
        this.f243250W = null;
        this.f243252Y = null;
        this.f243253Z = false;
        this.f243264p0 = false;
        this.f243273x0 = false;
        this.f243275y0 = false;
        this.f243243Q0 = null;
        this.f243245R0 = new ConcurrentLinkedQueue();
        this.f243262o = str7;
        this.f243263p = str8;
        this.f243265q = i;
        this.f243266r = i2;
        this.f243267s = i3;
        this.f243268t = str3;
        this.f243269u = str4;
        this.f243270v = appBrandLaunchReferrer;
        this.f243271w = str9;
        this.f243272x = iCommLibReader2;
        String str10 = qualitySession2.f245832d;
        this.f243254d = str10;
        this.f243255e = j;
        this.f243256f = z3;
        this.f243232F = hVar;
        this.f243228B = appBrandLaunchFromNotifyReferrer;
        this.f243229C = str6;
        this.f243233G = i4;
        this.f243234H = i5;
        this.f243230D = appBrandRuntimeReloadReportBundle;
        Assert.assertNotNull("<init> NULL wxaVersionInfo " + str8, wxaVersionInfo2);
        this.f243276z = wxaVersionInfo2;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "<init> username[%s] appId[%s] versionType[%d] appVersion[%d], scene[%d] sessionId[%s] instanceId[%s] mIsLaunchedByBackupWxaAttrs[%b] path[%s], entryModule[%s]", str7, str8, Integer.valueOf(i), Integer.valueOf(wxaVersionInfo2.f239452d), Integer.valueOf(i3), str9, str10, Boolean.valueOf(z3), Util.nullAsNil(str3), Util.nullAsNil(str4));
        if (iCommLibReader2 == null) {
            com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "<init> NULL acceptedLibReader, instanceId[%s]", str10);
        }
        this.f243227A = z5;
        this.f243274y = z2;
        this.f243236J = qualitySession2;
        this.f243237K = new AppStartupPerformanceReportBundle(qualitySession2.f245832d);
        f243225U0.put(qualitySession2.f245832d, qualitySession2);
        this.f243235I = z4;
        if (z5) {
            C81229b1.m99530c(str2);
        }
    }
}
