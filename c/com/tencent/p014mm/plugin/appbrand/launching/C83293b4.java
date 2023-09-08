package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C83460s2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.b4 */
public final class C83293b4 extends C83448q3<Pair<WxaAttributes, Boolean>> implements C83447q2 {

    /* renamed from: G */
    public static final C83460s2.C83461a[] f243409G = {C83460s2.C83461a.CMD_UPDATE_VERSION};

    /* renamed from: A */
    public String f243410A;

    /* renamed from: B */
    public int f243411B = -1;

    /* renamed from: C */
    public C81662k.C81676l f243412C = null;

    /* renamed from: D */
    public AppBrandLaunchFromNotifyReferrer f243413D;

    /* renamed from: E */
    public final String f243414E;

    /* renamed from: F */
    public final int f243415F;

    /* renamed from: h */
    public final String f243416h;

    /* renamed from: i */
    public String f243417i;

    /* renamed from: j */
    public String f243418j;

    /* renamed from: n */
    public boolean f243419n;

    /* renamed from: o */
    public boolean f243420o;

    /* renamed from: p */
    public WxaAttributes f243421p;

    /* renamed from: q */
    public final int f243422q;

    /* renamed from: r */
    public final int f243423r;

    /* renamed from: s */
    public final int f243424s;

    /* renamed from: t */
    public final String f243425t;

    /* renamed from: u */
    public final AppBrandStatObject f243426u;

    /* renamed from: v */
    public final AppBrandLaunchReferrer f243427v;

    /* renamed from: w */
    public final C80247h f243428w;

    /* renamed from: x */
    public boolean f243429x = false;

    /* renamed from: y */
    public boolean f243430y = false;

    /* renamed from: z */
    public C83460s2.C83461a f243431z = C83460s2.C83461a.NONE;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.b4$a */
    public static final class C83294a extends Error {
        public C83294a() {
            super("AbortOnDirectFallbackRequested");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.b4$b */
    public static final class C83295b extends Error {
        public C83295b() {
            super("AbortOnWeakNetError");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.b4$c */
    public class C83296c implements C81662k.C81676l {
        public C83296c(C83289a4 a4Var) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
            r4 = r3.f243413D;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114022a() {
            /*
                r20 = this;
                r0 = r20
                com.tencent.mm.plugin.appbrand.launching.b4 r1 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                com.tencent.mm.plugin.appbrand.config.k$l r1 = r1.f243412C
                if (r1 == 0) goto L_0x000b
                r1.mo114022a()
            L_0x000b:
                com.tencent.mm.plugin.appbrand.launching.b4 r1 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                int r1 = r1.f243422q
                boolean r1 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r1)
                if (r1 != 0) goto L_0x0016
                return
            L_0x0016:
                boolean r1 = com.tencent.p014mm.plugin.appbrand.appcache.C81245g1.f238643a
                r2 = 1
                if (r1 == 0) goto L_0x001c
                goto L_0x002a
            L_0x001c:
                com.tencent.p014mm.plugin.appbrand.appcache.C81245g1.f238643a = r2
                zt3.t r1 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.appbrand.appcache.e1 r3 = new com.tencent.mm.plugin.appbrand.appcache.e1
                r3.<init>()
                zt3.j r1 = (zt3.C119157j) r1
                r1.mo183875f(r3)
            L_0x002a:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r1 != 0) goto L_0x0038
                boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r1 != 0) goto L_0x0038
                boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r1 != 0) goto L_0x0038
                int r1 = qe3.C89625d.f257835a
            L_0x0038:
                com.tencent.mm.plugin.appbrand.launching.b4 r1 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                java.lang.String r3 = r1.f243416h
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = r1.f243417i
                r6 = 0
                r4[r6] = r5
                java.lang.String r1 = r1.f243418j
                r4[r2] = r1
                r1 = 2
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r4[r1] = r5
                java.lang.String r1 = "beforeSync: sync contact[username(%s) appId(%s)], process preload cgi, is open = [%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r4)
                gc.d r1 = p969gc.C87176d.f252818a
                ap0.c r3 = new ap0.c
                r3.<init>()
                com.tencent.mm.plugin.appbrand.launching.b4 r4 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                java.lang.String r4 = r4.f243410A
                java.lang.String r5 = "id"
                gy3.C87412m.m108594g(r4, r5)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, gc.c> r5 = p969gc.C87176d.f252819b
                java.lang.Object r3 = r5.put(r4, r3)
                gc.c r3 = (p969gc.C87175c) r3
                if (r3 == 0) goto L_0x0077
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r6] = r4
                java.lang.String r4 = "Luggage.AppBrandParallelTasksManager"
                java.lang.String r5 = "add duplicate collection id = [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r3)
            L_0x0077:
                com.tencent.mm.plugin.appbrand.launching.b4 r3 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                java.lang.String r3 = r3.f243410A
                gc.c r1 = r1.mo121614b(r3, r2)
                java.util.Objects.requireNonNull(r1)
                ap0.g r2 = new ap0.g
                com.tencent.mm.plugin.appbrand.launching.b4 r3 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                java.lang.String r8 = r3.f243417i
                int r9 = r3.f243422q
                int r10 = r3.f243424s
                java.lang.String r11 = r3.f243425t
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r12 = r3.f243426u
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r13 = r3.f243427v
                java.lang.String r14 = r3.f243418j
                r4 = 1162(0x48a, float:1.628E-42)
                if (r10 != r4) goto L_0x009f
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r4 = r3.f243413D
                if (r4 == 0) goto L_0x009f
                java.lang.String r4 = r4.f197024g
                goto L_0x00a0
            L_0x009f:
                r4 = 0
            L_0x00a0:
                r15 = r4
                java.lang.String r4 = r3.f243414E
                com.tencent.luggage.sdk.launching.h r5 = r3.f243428w
                java.lang.String r7 = r3.f243410A
                int r3 = r3.f243415F
                r18 = r7
                r7 = r2
                r16 = r4
                r17 = r5
                r19 = r3
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r1.mo121612a(r2)
                ap0.f r2 = new ap0.f
                com.tencent.mm.plugin.appbrand.launching.b4 r3 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                java.lang.String r4 = r3.f243425t
                java.lang.String r5 = r3.f243417i
                java.lang.String r3 = r3.f243418j
                r2.<init>(r4, r5, r3)
                r1.mo121612a(r2)
                ap0.C27992b.m38051a(r6)
                com.tencent.mm.plugin.appbrand.launching.b4 r1 = com.tencent.p014mm.plugin.appbrand.launching.C83293b4.this
                java.lang.String r1 = r1.f243418j
                uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact_CGI
                com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83293b4.C83296c.mo114022a():void");
        }
    }

    public C83293b4(String str, String str2, int i, int i2, int i3, String str3, AppBrandStatObject appBrandStatObject, AppBrandLaunchReferrer appBrandLaunchReferrer, String str4, AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer, String str5, int i4, C81662k.C81676l lVar, C80247h hVar) {
        this.f243417i = str;
        this.f243418j = str2;
        this.f243422q = i;
        this.f243423r = i2;
        this.f243424s = i3;
        this.f243425t = str3;
        this.f243426u = appBrandStatObject;
        this.f243427v = appBrandLaunchReferrer;
        this.f243410A = str4;
        this.f243413D = appBrandLaunchFromNotifyReferrer;
        this.f243414E = str5;
        this.f243415F = i4;
        this.f243428w = hVar;
        if (BuildInfo.DEBUG && Util.isNullOrNil(str) && Util.isNullOrNil(str2)) {
            Assert.fail("username and appId should not be null or nil!");
        }
        if (!Util.isNullOrNil(str)) {
            this.f243416h = "MicroMsg.AppBrand.PrepareStepGetWxaAttrs[" + str + "]";
        } else {
            this.f243416h = "MicroMsg.AppBrand.PrepareStepGetWxaAttrs[" + str2 + "]";
        }
        this.f243412C = lVar;
    }

    /* renamed from: a */
    public long mo115587a() {
        return this.f243857d;
    }

    /* renamed from: b */
    public long mo115588b() {
        return this.f243858e;
    }

    /* renamed from: c */
    public long mo115589c() {
        return this.f243859f;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0583, code lost:
        r8.mo175911u(wm0.C38230b.CTRL_INDEX, r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x031c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034d A[Catch:{ NullPointerException -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x034e A[Catch:{ NullPointerException -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r28 = this;
            r1 = r28
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            com.tencent.luggage.sdk.processes.LuggageServiceType r2 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
            kr0.g1 r3 = kr0.C88273g1.SYNC_WXA_ATTRS_ON_APP_LAUNCH
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r28.mo115592h()
            r1.f243421p = r0
            r4 = 0
            r7 = 3
            r11 = 0
            r8 = 1
            r12 = 2
            if (r0 != 0) goto L_0x0022
            r1.f243429x = r8
            com.tencent.mm.plugin.appbrand.launching.s2$a r0 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.ATTRS_NOT_FOUND
            r1.f243431z = r0
        L_0x001e:
            r18 = r9
            goto L_0x02de
        L_0x0022:
            java.lang.String r13 = r0.field_username
            r1.f243417i = r13
            java.lang.String r13 = r0.field_appId
            r1.f243418j = r13
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r13 = r0.mo113940m2()
            if (r13 == 0) goto L_0x003c
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r13 = r0.mo113940m2()
            boolean r13 = r13.mo113971b()
            if (r13 == 0) goto L_0x003c
            r13 = 1
            goto L_0x003d
        L_0x003c:
            r13 = 0
        L_0x003d:
            r1.f243419n = r13
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r13 = r0.mo113940m2()
            if (r13 == 0) goto L_0x0051
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r13 = r0.mo113940m2()
            boolean r13 = r13.mo113970a()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            r1.f243420o = r13
            boolean r13 = com.tencent.p014mm.plugin.appbrand.config.C81681p.m100219a(r0)
            if (r13 != 0) goto L_0x02d0
            boolean r13 = com.tencent.p014mm.plugin.appbrand.config.C81681p.m100220b(r0)
            if (r13 == 0) goto L_0x0075
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage> r14 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.class
            java.lang.Object r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r14)
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r14 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage) r14
            java.lang.String r15 = r0.field_username
            int r14 = r14.mo56569b(r15)
            ii0.a r15 = ii0.C87732a.INSTANCE
            r6 = 199(0xc7, float:2.79E-43)
            r15.mo122144a(r14, r6)
        L_0x0075:
            if (r13 == 0) goto L_0x0079
            goto L_0x02d0
        L_0x0079:
            int r6 = r1.f243422q
            boolean r6 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r6)
            if (r6 == 0) goto L_0x00bc
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r6 = r0.mo113940m2()
            if (r6 == 0) goto L_0x00bc
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r6 = r0.mo113940m2()
            te3.p65 r6 = r6.f239506v
            if (r6 == 0) goto L_0x00bc
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r6 = r0.mo113940m2()
            te3.p65 r6 = r6.f239506v
            java.lang.String r6 = r6.f139610d
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00bc
            r1.f243429x = r11
            java.lang.String r6 = r1.f243416h
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r14 = r1.f243417i
            r13[r11] = r14
            java.lang.String r14 = r1.f243418j
            r13[r8] = r14
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r0 = r0.mo113940m2()
            te3.p65 r0 = r0.f239506v
            java.lang.String r0 = r0.f139610d
            r13[r12] = r0
            java.lang.String r0 = "call, skip await for migrate, username:%s, appId:%s, targetAppId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r13)
            goto L_0x001e
        L_0x00bc:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r6 = r0.mo113942o2()
            long r13 = r6.f239466u
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x00ce
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r6 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r6 = r6.f239287J
            long r13 = r6.f239351e
        L_0x00ce:
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r4 = r0.field_syncTimeSecond
            long r4 = r4 + r13
            int r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0100
            java.lang.String r4 = r1.f243416h
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r0.field_username
            r6[r11] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r6[r8] = r5
            r18 = r9
            long r8 = r0.field_syncTimeSecond
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6[r12] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r6[r7] = r8
            java.lang.String r8 = "forceUpdateByLastUpdateTime returns [true], username[%s], now[%d], lastUpdate[%d], interval[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r6)
            r4 = 1
            r5 = 1
            goto L_0x0126
        L_0x0100:
            r18 = r9
            java.lang.String r4 = r1.f243416h
            r6 = 4
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r6 = r0.field_username
            r8[r11] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            r5 = 1
            r8[r5] = r6
            long r9 = r0.field_syncTimeSecond
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r8[r12] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r8[r7] = r6
            java.lang.String r6 = "forceUpdateByLastUpdateTime returns [false], username[%s], now[%d], lastUpdate[%d], interval[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r8)
            r4 = 0
        L_0x0126:
            if (r4 == 0) goto L_0x0132
            r1.f243429x = r5
            r1.f243430y = r5
            com.tencent.mm.plugin.appbrand.launching.s2$a r0 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.NO_USE_RECENT
            r1.f243431z = r0
            goto L_0x02de
        L_0x0132:
            int r4 = r1.f243422q
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r4)
            if (r4 != 0) goto L_0x013c
            goto L_0x02de
        L_0x013c:
            int r4 = r1.f243423r
            if (r4 <= 0) goto L_0x016e
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r6 = r0.mo113942o2()
            int r6 = r6.f239452d
            if (r4 <= r6) goto L_0x016e
            java.lang.String r4 = r1.f243416h
            java.lang.Object[] r6 = new java.lang.Object[r12]
            int r8 = r1.f243423r
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r11] = r8
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r0.mo113942o2()
            int r0 = r0.f239452d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r6[r5] = r0
            java.lang.String r0 = "call, preferVersion[%d], attrs.appVersion[%d], forceSync"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r6)
            r1.f243429x = r5
            com.tencent.mm.plugin.appbrand.launching.s2$a r0 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.VERSION_NOT_FOUND
            r1.f243431z = r0
            goto L_0x02de
        L_0x016e:
            com.tencent.mm.plugin.appbrand.launching.s2$a r4 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.MISSING_PKG
            int r6 = r1.f243424s
            r8 = 1111(0x457, float:1.557E-42)
            if (r8 != r6) goto L_0x0178
            r6 = 1
            goto L_0x0179
        L_0x0178:
            r6 = 0
        L_0x0179:
            if (r6 == 0) goto L_0x017d
            goto L_0x028c
        L_0x017d:
            int r6 = r1.f243422q
            if (r6 != 0) goto L_0x028c
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r6 = r0.mo113940m2()
            if (r6 == 0) goto L_0x0193
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r6 = r0.mo113940m2()
            boolean r6 = r6.mo113970a()
            if (r6 == 0) goto L_0x0193
            r6 = 1
            goto L_0x0194
        L_0x0193:
            r6 = 0
        L_0x0194:
            if (r6 == 0) goto L_0x01ad
            java.lang.String r6 = r0.field_appId
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r0.mo113942o2()
            int r8 = r8.f239452d
            boolean r6 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102336a(r6, r8)
            if (r6 == 0) goto L_0x01a6
            goto L_0x028c
        L_0x01a6:
            r1.f243431z = r4
            r5 = 1
            r1.f243430y = r5
            goto L_0x028a
        L_0x01ad:
            java.lang.String r6 = r1.f243425t
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x01d1
            java.lang.String r6 = r1.f243425t
            java.lang.String r6 = p225rc.C89925n.m112488a(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x01c2
            goto L_0x01d1
        L_0x01c2:
            java.lang.String r6 = r1.f243425t
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r6 = r6.getScheme()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            goto L_0x01d2
        L_0x01d1:
            r6 = 0
        L_0x01d2:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.z3> r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81396z3.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            com.tencent.mm.plugin.appbrand.appcache.z3 r8 = (com.tencent.p014mm.plugin.appbrand.appcache.C81396z3) r8
            java.lang.String r9 = "forceUpdateAttrsByPkgState, return[FALSE] latestPkgExists[FALSE], enterPath[%s], syncTimeSecond[%d], skip in 6 hours"
            if (r6 != 0) goto L_0x023d
            java.lang.String r6 = r0.field_appId
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r10 = r0.mo113942o2()
            int r10 = r10.f239452d
            boolean r6 = r8.mo113625jA(r6, r10)
            if (r6 != 0) goto L_0x01fd
            java.lang.String r6 = r1.f243418j
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r0.mo113942o2()
            int r8 = r8.f239452d
            boolean r6 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102336a(r6, r8)
            if (r6 == 0) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            r6 = 0
            goto L_0x01fe
        L_0x01fd:
            r6 = 1
        L_0x01fe:
            if (r6 == 0) goto L_0x0210
            java.lang.String r6 = r1.f243416h
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r1.f243425t
            r8[r11] = r9
            java.lang.String r9 = "forceUpdateAttrsByPkgState, return[FALSE], latestPkgExists[TRUE], path[%s], checkPathExisted[FALSE]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r8)
            goto L_0x028c
        L_0x0210:
            long r13 = r0.field_syncTimeSecond
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r13)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r6 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r6 = r6.f239287J
            long r5 = r6.f239350d
            int r10 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0237
            java.lang.String r5 = r1.f243416h
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.String r10 = r1.f243425t
            r6[r11] = r10
            long r13 = r0.field_syncTimeSecond
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r8 = 1
            r6[r8] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r6)
            goto L_0x028c
        L_0x0237:
            r8 = 1
            r1.f243431z = r4
            r1.f243430y = r8
            goto L_0x028a
        L_0x023d:
            java.lang.String r6 = r1.f243418j
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r10 = r0.mo113942o2()
            java.lang.String r13 = r1.f243425t
            boolean r6 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83430q.m102386a(r6, r10, r13, r8)
            java.lang.String r8 = r1.f243416h
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.String r13 = r1.f243425t
            r10[r11] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            r5 = 1
            r10[r5] = r13
            java.lang.String r13 = "forceUpdateAttrsByPkgState, enterPath[%s], pathAccessible[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r10)
            if (r6 != 0) goto L_0x028c
            long r13 = r0.field_syncTimeSecond
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r13)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r6 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r6 = r6.f239287J
            long r5 = r6.f239350d
            int r10 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0286
            java.lang.String r6 = r1.f243416h
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.String r5 = r1.f243425t
            r10[r11] = r5
            long r13 = r0.field_syncTimeSecond
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r8 = 1
            r10[r8] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r10)
            goto L_0x028c
        L_0x0286:
            com.tencent.mm.plugin.appbrand.launching.s2$a r6 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.PATH_NOT_FOUND
            r1.f243431z = r6
        L_0x028a:
            r6 = 1
            goto L_0x028d
        L_0x028c:
            r6 = 0
        L_0x028d:
            if (r6 == 0) goto L_0x029d
            r5 = 1
            r1.f243429x = r5
            com.tencent.mm.plugin.appbrand.launching.s2$a r0 = r1.f243431z
            com.tencent.mm.plugin.appbrand.launching.s2$a r6 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.NONE
            if (r0 != r6) goto L_0x02de
            r1.f243431z = r4
            r1.f243430y = r5
            goto L_0x02de
        L_0x029d:
            java.lang.Class<ki0.j> r4 = ki0.C33915j.class
            java.lang.Object r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r4)
            ki0.j r4 = (ki0.C33915j) r4
            java.lang.String r6 = r0.field_username
            ki0.i r4 = r4.mo59363jo(r6)
            if (r4 == 0) goto L_0x02ce
            int r6 = r4.field_appVersion
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r0.mo113942o2()
            int r0 = r0.f239452d
            if (r6 <= r0) goto L_0x02ce
            int r0 = r4.field_appVersion
            r1.f243411B = r0
            r5 = 1
            r1.f243429x = r5
            com.tencent.mm.plugin.appbrand.launching.s2$a r0 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.CMD_UPDATE_VERSION
            r1.f243431z = r0
            r1.f243430y = r5
            ii0.a r0 = ii0.C87732a.INSTANCE
            int r4 = r4.field_reportId
            r6 = 154(0x9a, float:2.16E-43)
            r0.mo122144a(r4, r6)
            goto L_0x02de
        L_0x02ce:
            r5 = 1
            goto L_0x02de
        L_0x02d0:
            r18 = r9
            r5 = 1
            java.lang.String r0 = r1.f243417i
            com.tencent.p014mm.plugin.appbrand.config.C81661j.m100183h(r0)
            r1.f243429x = r5
            com.tencent.mm.plugin.appbrand.launching.s2$a r0 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83461a.INVALID_FIELDS
            r1.f243431z = r0
        L_0x02de:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102425e()
            java.lang.String r4 = r1.f243416h
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            boolean r8 = r1.f243429x
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6[r11] = r8
            boolean r8 = r1.f243430y
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r5 = 1
            r6[r5] = r8
            com.tencent.mm.plugin.appbrand.launching.s2$a r8 = r1.f243431z
            java.lang.String r8 = r8.name()
            r6[r12] = r8
            com.tencent.mm.plugin.appbrand.launching.s2$a r8 = r1.f243431z
            int r8 = r8.ordinal()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r9 = 4
            r6[r9] = r8
            java.lang.String r8 = "getAttrs, awaitCgi=%B, fallbackIfCgiFailed=%B, reason=%s[%d], isWeakNet[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r6)
            boolean r4 = r1.f243429x
            if (r4 == 0) goto L_0x0337
            if (r0 == 0) goto L_0x0337
            int r0 = r1.f243422q
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)
            if (r0 == 0) goto L_0x0337
            com.tencent.mm.plugin.appbrand.launching.s2$a[] r0 = f243409G
            com.tencent.mm.plugin.appbrand.launching.s2$a r4 = r1.f243431z
            boolean r0 = u24.C90595a.m113498b(r0, r4)
            if (r0 != 0) goto L_0x0331
            goto L_0x0337
        L_0x0331:
            com.tencent.mm.plugin.appbrand.launching.b4$b r0 = new com.tencent.mm.plugin.appbrand.launching.b4$b
            r0.<init>()
            throw r0
        L_0x0337:
            boolean r0 = r1.f243429x     // Catch:{ NullPointerException -> 0x0354 }
            if (r0 == 0) goto L_0x0369
            int r0 = r1.f243422q     // Catch:{ NullPointerException -> 0x0354 }
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)     // Catch:{ NullPointerException -> 0x0354 }
            if (r0 == 0) goto L_0x0369
            java.lang.String r0 = r1.f243425t     // Catch:{ NullPointerException -> 0x0354 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r4 = r1.f243421p     // Catch:{ NullPointerException -> 0x0354 }
            boolean r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102422a(r0, r4)     // Catch:{ NullPointerException -> 0x0354 }
            if (r0 != 0) goto L_0x034e
            goto L_0x0369
        L_0x034e:
            com.tencent.mm.plugin.appbrand.launching.b4$a r0 = new com.tencent.mm.plugin.appbrand.launching.b4$a     // Catch:{ NullPointerException -> 0x0354 }
            r0.<init>()     // Catch:{ NullPointerException -> 0x0354 }
            throw r0     // Catch:{ NullPointerException -> 0x0354 }
        L_0x0354:
            r0 = move-exception
            java.lang.String r4 = r1.f243416h
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r8 = r1.f243417i
            r6[r11] = r8
            java.lang.String r8 = r1.f243418j
            r5 = 1
            r6[r5] = r8
            r6[r12] = r0
            java.lang.String r0 = "getAttrs, check LaunchFallbackMinVersion for username:%s, appId:%s, get npe:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r6)
        L_0x0369:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            boolean r0 = r1.f243429x
            if (r0 == 0) goto L_0x03db
            boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84499c0.m104089c()
            if (r0 != 0) goto L_0x0379
            r0 = 0
            goto L_0x0385
        L_0x0379:
            android.content.SharedPreferences r0 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r6 = "AppBrandDebugUI.SHOW_DEBUG_HINT_FOR_WXA_APP_LAUNCH_PROCESS"
            boolean r0 = r0.getBoolean(r6, r4)
        L_0x0385:
            if (r0 == 0) goto L_0x03ba
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r4 = 4
            java.lang.Object[] r6 = new java.lang.Object[r4]
            boolean r4 = r1.f243429x
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6[r11] = r4
            boolean r4 = r1.f243430y
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 1
            r6[r5] = r4
            com.tencent.mm.plugin.appbrand.launching.s2$a r4 = r1.f243431z
            java.lang.String r4 = r4.name()
            r6[r12] = r4
            com.tencent.mm.plugin.appbrand.launching.s2$a r4 = r1.f243431z
            int r4 = r4.ordinal()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            java.lang.String r4 = "getAttrs, awaitCgi=%B, fallbackIfCgiFailed=%B, reason=%s[%d]"
            java.lang.String r0 = java.lang.String.format(r0, r4, r6)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r1)
        L_0x03ba:
            boolean r0 = r1.f243419n
            if (r0 == 0) goto L_0x03c6
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r0 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            r0.mo116954S(r2, r3)
            goto L_0x03db
        L_0x03c6:
            boolean r0 = r1.f243420o
            if (r0 == 0) goto L_0x03d4
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r0 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            com.tencent.luggage.sdk.processes.LuggageServiceType r2 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
            r0.mo116954S(r2, r3)
            goto L_0x03db
        L_0x03d4:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r0 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            r0.mo116954S(r2, r3)
        L_0x03db:
            boolean r0 = r1.f243429x
            java.lang.String r2 = "MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils"
            r10 = 0
            if (r0 != 0) goto L_0x03ec
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r1.f243421p
            if (r0 == 0) goto L_0x03ec
            android.util.Pair r0 = android.util.Pair.create(r0, r10)
            goto L_0x049f
        L_0x03ec:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.launching.a4 r3 = new com.tencent.mm.plugin.appbrand.launching.a4
            r3.<init>(r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r13 = 0
            lu3.c r0 = r0.mo183890u(r3, r13, r10)
            int r3 = r1.f243422q
            boolean r3 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r3)
            if (r3 == 0) goto L_0x0499
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = r1.f243421p
            if (r3 == 0) goto L_0x0413
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c r4 = r3.mo113941n2()
            if (r4 == 0) goto L_0x0413
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a r4 = r4.f239507a
            goto L_0x0414
        L_0x0413:
            r4 = r10
        L_0x0414:
            if (r4 == 0) goto L_0x0462
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "checkGetWxaAttrsTimeoutStrategy, username:"
            r6.append(r13)
            gy3.C87412m.m108591d(r3)
            java.lang.String r13 = r3.field_username
            r6.append(r13)
            java.lang.String r13 = ", appId:"
            r6.append(r13)
            java.lang.String r3 = r3.field_appId
            r6.append(r3)
            java.lang.String r3 = ", settings:"
            r6.append(r3)
            com.tencent.mm.plugin.appbrand.launching.t2 r3 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a
            java.lang.String r3 = r3.mo115748f(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r3 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102425e()
            if (r3 == 0) goto L_0x0450
            long r3 = r4.f239509A
            goto L_0x0452
        L_0x0450:
            long r3 = r4.f239538z
        L_0x0452:
            r13 = 0
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x045b
            com.tencent.mm.plugin.appbrand.launching.t2$c$b r3 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83470b.f243905a
            goto L_0x0464
        L_0x045b:
            com.tencent.mm.plugin.appbrand.launching.t2$c$a r6 = new com.tencent.mm.plugin.appbrand.launching.t2$c$a
            r6.<init>(r3)
            r3 = r6
            goto L_0x0464
        L_0x0462:
            com.tencent.mm.plugin.appbrand.launching.t2$c$b r3 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83470b.f243905a
        L_0x0464:
            java.lang.String r4 = r1.f243416h
            r6 = 4
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r6 = r1.f243417i
            r13[r11] = r6
            java.lang.String r6 = r1.f243418j
            r5 = 1
            r13[r5] = r6
            boolean r6 = r1.f243429x
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r13[r12] = r6
            r13[r7] = r3
            java.lang.String r6 = "getAttrs, username[%s] appId[%s] awaitCgi[%B], timeoutStrategy[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r13)
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83469a
            if (r4 == 0) goto L_0x0492
            com.tencent.mm.plugin.appbrand.launching.t2$c$a r3 = (com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83468c.C83469a) r3
            long r3 = r3.f243904a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r0 = r0.get(r3, r6)
            android.util.Pair r0 = (android.util.Pair) r0
            goto L_0x049f
        L_0x0492:
            java.lang.Object r0 = r0.get()
            android.util.Pair r0 = (android.util.Pair) r0
            goto L_0x049f
        L_0x0499:
            java.lang.Object r0 = r0.get()
            android.util.Pair r0 = (android.util.Pair) r0
        L_0x049f:
            java.lang.Object r3 = r0.first
            java.lang.String r4 = "(%d,%d)"
            java.lang.String r6 = ""
            r13 = 2131821265(0x7f1102d1, float:1.9275268E38)
            if (r3 != 0) goto L_0x04e4
            r3 = 1
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Object r3 = r0.second
            if (r3 != 0) goto L_0x04b4
            r3 = r6
            r5 = 1
            goto L_0x04d3
        L_0x04b4:
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r14 = new java.lang.Object[r12]
            ob0.b$c r3 = (ob0.C89132b.C89134c) r3
            int r3 = r3.f256793a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14[r11] = r3
            java.lang.Object r3 = r0.second
            ob0.b$c r3 = (ob0.C89132b.C89134c) r3
            int r3 = r3.f256794b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r14[r5] = r3
            java.lang.String r3 = java.lang.String.format(r9, r4, r14)
        L_0x04d3:
            r8[r11] = r3
            java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104395b(r13, r8)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r3, r1)
            r3 = 7
            int r8 = r1.f243422q
            int r8 = r8 + r5
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r6, r3, r8)
            goto L_0x0511
        L_0x04e4:
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r25 = r14 - r8
            java.lang.Object r3 = r0.second
            if (r3 == 0) goto L_0x0511
            java.lang.String r3 = r1.f243418j
            java.lang.Object r8 = r0.first
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r8 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r8
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r8.mo113942o2()
            int r8 = r8.f239452d
            int r9 = r1.f243422q
            int r14 = r1.f243424s
            com.tencent.mm.plugin.appbrand.launching.s2$a r15 = r1.f243431z
            com.tencent.mm.plugin.appbrand.launching.s2$b r20 = com.tencent.p014mm.plugin.appbrand.launching.C83460s2.C83462b.SYNC_GET_ATTRS
            int r27 = r15.ordinal()
            r21 = r3
            r22 = r8
            r23 = r9
            r24 = r14
            com.tencent.p014mm.plugin.appbrand.launching.C83460s2.m102419a(r20, r21, r22, r23, r24, r25, r27)
        L_0x0511:
            java.lang.Object r3 = r0.second
            if (r3 == 0) goto L_0x054d
            ob0.b$c r3 = (ob0.C89132b.C89134c) r3
            int r8 = r3.f256793a
            if (r8 != 0) goto L_0x0527
            int r8 = r3.f256794b
            if (r8 != 0) goto L_0x0527
            java.lang.String r3 = r1.f243418j
            uo0.a r8 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact_CGI
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r3, r8)
            goto L_0x054d
        L_0x0527:
            java.lang.String r8 = r1.f243418j
            uo0.a r9 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact_CGI
            java.util.Locale r14 = java.util.Locale.ENGLISH
            java.lang.Object[] r15 = new java.lang.Object[r12]
            int r3 = r3.f256794b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r15[r11] = r3
            java.lang.Object r3 = r0.second
            ob0.b$c r3 = (ob0.C89132b.C89134c) r3
            int r3 = r3.f256793a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r15[r5] = r3
            java.lang.String r3 = "errCode=%d errType=%d"
            java.lang.String r3 = java.lang.String.format(r14, r3, r15)
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102126c(r8, r9, r3)
        L_0x054d:
            boolean r3 = r1.f243429x
            if (r3 == 0) goto L_0x0657
            com.tencent.mm.plugin.appbrand.launching.s2$a r3 = r1.f243431z
            java.lang.String r8 = "reason"
            gy3.C87412m.m108594g(r3, r8)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 10
            r14 = 648(0x288, float:9.08E-43)
            r8.mo175911u(r14, r9)
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L_0x0586;
                case 1: goto L_0x0581;
                case 2: goto L_0x057e;
                case 3: goto L_0x057b;
                case 4: goto L_0x0578;
                case 5: goto L_0x0575;
                case 6: goto L_0x0572;
                case 7: goto L_0x056f;
                default: goto L_0x0569;
            }
        L_0x0569:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x056f:
            r3 = 17
            goto L_0x0583
        L_0x0572:
            r3 = 16
            goto L_0x0583
        L_0x0575:
            r3 = 15
            goto L_0x0583
        L_0x0578:
            r3 = 14
            goto L_0x0583
        L_0x057b:
            r3 = 13
            goto L_0x0583
        L_0x057e:
            r3 = 12
            goto L_0x0583
        L_0x0581:
            r3 = 11
        L_0x0583:
            r8.mo175911u(r14, r3)
        L_0x0586:
            java.lang.Object r3 = r0.second
            if (r3 == 0) goto L_0x061e
            ob0.b$c r3 = (ob0.C89132b.C89134c) r3
            int r3 = r3.f256793a
            if (r3 == 0) goto L_0x061e
            java.lang.String r9 = r1.f243418j
            int r15 = r1.f243422q
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r12)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r13 = 51
            r12 = 1
            r10.<init>((int) r14, (int) r13, (int) r12)
            r5.add(r10)
            r10 = 4
            if (r10 != r3) goto L_0x05b2
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r10 = 52
            r3.<init>((int) r14, (int) r10, (int) r12)
            r5.add(r3)
            goto L_0x05bc
        L_0x05b2:
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r10 = 53
            r3.<init>((int) r14, (int) r10, (int) r12)
            r5.add(r3)
        L_0x05bc:
            r8.mo160124a(r5, r12)
            if (r9 != 0) goto L_0x05c3
            r3 = r6
            goto L_0x05c4
        L_0x05c3:
            r3 = r9
        L_0x05c4:
            com.tencent.p014mm.plugin.appbrand.C83606m1.m102639c(r12, r3, r11, r15, r11)
            if (r9 != 0) goto L_0x05ca
            goto L_0x05cb
        L_0x05ca:
            r6 = r9
        L_0x05cb:
            com.tencent.p014mm.plugin.appbrand.C83606m1.m102639c(r7, r6, r11, r15, r11)
            boolean r3 = r1.f243430y
            if (r3 == 0) goto L_0x05e5
            java.lang.String r0 = r1.f243416h
            java.lang.String r3 = "getInternal, await but cgi failed, return result from db"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r28.mo115592h()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            goto L_0x066a
        L_0x05e5:
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.util.Locale r3 = java.util.Locale.US
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r8 = r0.second
            ob0.b$c r8 = (ob0.C89132b.C89134c) r8
            int r8 = r8.f256793a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r11] = r8
            java.lang.Object r0 = r0.second
            ob0.b$c r0 = (ob0.C89132b.C89134c) r0
            int r0 = r0.f256794b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r9[r5] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4, r9)
            r6[r11] = r0
            r0 = 2131821265(0x7f1102d1, float:1.9275268E38)
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104395b(r0, r6)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3 = 0
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            goto L_0x066a
        L_0x061e:
            java.lang.Object r3 = r0.first
            if (r3 == 0) goto L_0x0636
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r3
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r3.mo113942o2()
            if (r3 != 0) goto L_0x062b
            goto L_0x0636
        L_0x062b:
            java.lang.Object r3 = r0.first
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r3
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r3.mo113942o2()
            int r3 = r3.f239452d
            goto L_0x0637
        L_0x0636:
            r3 = -1
        L_0x0637:
            int r4 = r1.f243411B
            if (r3 >= r4) goto L_0x0657
            java.lang.String r4 = r1.f243416h
            r6 = 2
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9[r11] = r3
            int r3 = r1.f243411B
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r9[r5] = r3
            java.lang.String r3 = "getInternal, version mismatched attrsVersion[%d], syncVersion[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r9)
            r8.mo175911u(r14, r6)
        L_0x0657:
            java.lang.Object r3 = r0.first
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r3
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x0661
            r0 = 1
            goto L_0x0662
        L_0x0661:
            r0 = 0
        L_0x0662:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
        L_0x066a:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r3 = r1.f243416h
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r1.f243417i
            r4[r11] = r6
            java.lang.String r6 = r1.f243418j
            r5 = 1
            r4[r5] = r6
            long r12 = r8 - r18
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r10 = 2
            r4[r10] = r6
            java.lang.Object r6 = r0.second
            r4[r7] = r6
            java.lang.String r6 = "call(), getAttributesInternal username:%s, appId:%s, cost:%d, sync:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r4)
            java.lang.Object r3 = r0.first
            r10 = r3
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r10 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r10
            java.lang.Object r3 = r0.second
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r10 != 0) goto L_0x06f9
            if (r3 == 0) goto L_0x06f9
            java.lang.String r3 = r1.f243417i
            java.lang.String r4 = r1.f243418j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "markLaunchFailedByUpdateWxaAttrs, username:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " appId:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            if (r3 == 0) goto L_0x06ce
            int r2 = r3.length()
            if (r2 != 0) goto L_0x06cc
            goto L_0x06ce
        L_0x06cc:
            r2 = 0
            goto L_0x06cf
        L_0x06ce:
            r2 = 1
        L_0x06cf:
            if (r2 != 0) goto L_0x06df
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.t2$a, java.lang.Long> r12 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243901d
            com.tencent.mm.plugin.appbrand.launching.t2$a$b r13 = new com.tencent.mm.plugin.appbrand.launching.t2$a$b
            r13.<init>(r3)
            r12.put(r13, r2)
        L_0x06df:
            if (r4 == 0) goto L_0x06e9
            int r2 = r4.length()
            if (r2 != 0) goto L_0x06e8
            goto L_0x06e9
        L_0x06e8:
            r5 = 0
        L_0x06e9:
            if (r5 != 0) goto L_0x06f9
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.t2$a, java.lang.Long> r3 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243901d
            com.tencent.mm.plugin.appbrand.launching.t2$a$a r5 = new com.tencent.mm.plugin.appbrand.launching.t2$a$a
            r5.<init>(r4)
            r3.put(r5, r2)
        L_0x06f9:
            java.lang.Object r2 = r0.second
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0716
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x0728
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r2
            java.lang.String r2 = r2.field_appId
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact_CGI
            java.lang.String r4 = ""
            r5 = r18
            r7 = r8
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r2, r3, r4, r5, r7)
            goto L_0x0728
        L_0x0716:
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x0728
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r2
            java.lang.String r2 = r2.field_appId
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact_DB
            java.lang.String r4 = ""
            r5 = r18
            r7 = r8
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r2, r3, r4, r5, r7)
        L_0x0728:
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x0769
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r2
            boolean r2 = com.tencent.p014mm.plugin.appbrand.config.C81681p.m100219a(r2)
            if (r2 == 0) goto L_0x0769
            java.lang.String r2 = r1.f243418j
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102125b(r2, r3)
            r2 = 2131821190(0x7f110286, float:1.9275116E38)
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            java.lang.String r2 = r3.getString(r2)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r2, r1)
            java.lang.Object r0 = r0.first
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r0
            java.lang.String r0 = r0.field_appId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0758
            r0 = 42
            goto L_0x075a
        L_0x0758:
            r0 = 41
        L_0x075a:
            java.lang.String r2 = r1.f243418j
            int r3 = r1.f243422q
            com.tencent.p014mm.plugin.appbrand.C83606m1.m102639c(r0, r2, r11, r3, r11)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2 = 0
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            goto L_0x07be
        L_0x0769:
            java.lang.Object r2 = r0.first
            if (r2 == 0) goto L_0x0781
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r2
            java.lang.String r2 = r2.field_appId
            r1.f243418j = r2
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r4 = ""
            r5 = r18
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r2, r3, r4, r5, r7)
            goto L_0x0792
        L_0x0781:
            java.lang.String r2 = r1.f243418j
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGetContact
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r6 = r18
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r2, r3, r4, r5, r6, r8)
        L_0x0792:
            if (r10 == 0) goto L_0x07be
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c r2 = r10.mo113941n2()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a r2 = r2.f239507a
            if (r2 == 0) goto L_0x07be
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.launching.t2$a, com.tencent.mm.plugin.appbrand.config.WxaAttributes> r2 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243899b
            com.tencent.mm.plugin.appbrand.launching.t2$a$b r3 = new com.tencent.mm.plugin.appbrand.launching.t2$a$b
            java.lang.String r4 = r10.field_username
            java.lang.String r5 = "wxaAttributes.field_username"
            gy3.C87412m.m108593f(r4, r5)
            r3.<init>(r4)
            r2.put(r3, r10)
            com.tencent.mm.plugin.appbrand.launching.t2$a$a r3 = new com.tencent.mm.plugin.appbrand.launching.t2$a$a
            java.lang.String r4 = r10.field_appId
            java.lang.String r5 = "wxaAttributes.field_appId"
            gy3.C87412m.m108593f(r4, r5)
            r3.<init>(r4)
            r2.put(r3, r10)
        L_0x07be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83293b4.call():java.lang.Object");
    }

    /* renamed from: d */
    public boolean mo115519d() {
        return this.f243860g && C80247h.PRE_RENDER != this.f243428w;
    }

    /* renamed from: f */
    public String mo115591f() {
        return this.f243416h;
    }

    /* renamed from: h */
    public final WxaAttributes mo115592h() {
        return !Util.isNullOrNil(this.f243417i) ? C81161g2.Cx0().mo114000LL(this.f243417i, new String[0]) : C81161g2.Cx0().mo114011mL(this.f243418j, new String[0]);
    }

    public String name() {
        return "PrepareStepGetWxaAttrs";
    }
}
