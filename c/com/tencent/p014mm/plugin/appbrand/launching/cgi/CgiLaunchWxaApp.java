package com.tencent.p014mm.plugin.appbrand.launching.cgi;

import android.text.TextUtils;
import ap0.C79625g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29225l1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29226m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83404p1;
import com.tencent.p014mm.plugin.appbrand.launching.C83515w2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.concurrent.ConcurrentHashMap;
import lc3.C10485b;
import lp3.C88629c;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import p156gj.C107835h0;
import p969gc.C87174b;
import p969gc.C87175c;
import p969gc.C87176d;
import te3.C90444vm2;
import te3.C90446wm2;
import te3.u55;
import wo0.C91041a;
import zp0.C39425a;
import zp0.C91823b;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp */
public class CgiLaunchWxaApp extends C91823b<C90446wm2> {

    /* renamed from: w */
    public static final ConcurrentHashMap<String, String> f243439w = new ConcurrentHashMap<>();

    /* renamed from: p */
    public final C47350c f243440p;

    /* renamed from: q */
    public final String f243441q;

    /* renamed from: r */
    public volatile C83515w2 f243442r;

    /* renamed from: s */
    public volatile boolean f243443s = false;

    /* renamed from: t */
    public final String f243444t;

    /* renamed from: u */
    public C83404p1 f243445u;

    /* renamed from: v */
    public final WeAppQualitySystemLaunchCGIStruct f243446v;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent */
    public static final class UpdateLaunchWxaAppInfoBroadcastEvent extends IEvent {

        /* renamed from: d */
        public final C83515w2 f243447d;

        public UpdateLaunchWxaAppInfoBroadcastEvent(C83515w2 w2Var) {
            this.f243447d = w2Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$a */
    public class C83300a implements C88629c.C88630a<C89132b.C89134c<C90446wm2>> {

        /* renamed from: a */
        public final /* synthetic */ C89132b.C89134c f243448a;

        public C83300a(C89132b.C89134c cVar) {
            this.f243448a = cVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(0, 0, "", (C90446wm2) this.f243448a.f256796d, (C117747y) null, CgiLaunchWxaApp.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$b */
    public class C83301b implements C88629c.C88630a<C89132b.C89134c<C90446wm2>> {
        public C83301b() {
        }

        public Object call() {
            return C89132b.C89134c.m111401a(4, -2, "", null, (C117747y) null, CgiLaunchWxaApp.this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CgiLaunchWxaApp(java.lang.String r16, boolean r17, te3.p45 r18, te3.b85 r19, te3.l65 r20, java.lang.String r21, int r22, com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession r23, java.lang.String r24, com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r25, java.lang.String r26, te3.C90422jy r27, int r28, boolean r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r21
            r3 = r24
            r4 = r25
            r15.<init>(r1, r3)
            r5 = 0
            r0.f243443s = r5
            r0.f243441q = r2
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r6 = com.tencent.p014mm.plugin.appbrand.report.quality.C84201i.m103805b(r23)
            r0.f243446v = r6
            if (r17 == 0) goto L_0x001c
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$b r7 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct.C80784b.sync
            goto L_0x001e
        L_0x001c:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$b r7 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct.C80784b.async
        L_0x001e:
            r6.mo112532s(r7)
            int r7 = com.tencent.p014mm.plugin.appbrand.report.quality.C84201i.m103806c()
            long r7 = (long) r7
            r6.mo112533t(r7)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.report.C84240s.m103838d(r7)
            r6.mo112534u(r7)
            r6 = r23
            java.lang.String r6 = r6.f245832d
            r0.f243444t = r6
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 == 0) goto L_0x0049
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            if (r7 == 0) goto L_0x0049
            java.lang.String r7 = "appId can not be Null Or Nil"
            junit.framework.Assert.fail(r7)
        L_0x0049:
            te3.vm2 r7 = new te3.vm2
            r7.<init>()
            r7.f259880d = r1
            r8 = r18
            r7.f259881e = r8
            r8 = 1
            r9 = 2
            if (r17 == 0) goto L_0x005a
            r10 = 1
            goto L_0x005b
        L_0x005a:
            r10 = 2
        L_0x005b:
            r7.f259882f = r10
            r10 = r19
            r7.f259885i = r10
            r10 = r20
            r7.f259886j = r10
            r7.f259890q = r3
            r7.f259889p = r6
            r10 = r28
            r7.f259898y = r10
            te3.u55 r11 = new te3.u55
            r11.<init>()
            r12 = r22
            r11.f259849d = r12
            r7.f259884h = r11
            te3.p45 r11 = r7.f259881e
            int r11 = r11.f259733f
            r13 = 1162(0x48a, float:1.628E-42)
            if (r11 != r13) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            te3.w65 r11 = new te3.w65
            r11.<init>()
            java.lang.String r4 = r4.f197024g
            r11.f143895d = r4
            r7.f259893t = r11
        L_0x008d:
            r4 = 1173(0x495, float:1.644E-42)
            te3.p45 r11 = r7.f259881e
            int r11 = r11.f259733f
            java.lang.String r13 = "MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122"
            if (r4 != r11) goto L_0x00ae
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)
            if (r4 == 0) goto L_0x00a3
            java.lang.String r4 = "<init>, openMaterialMimeType is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r4)
            goto L_0x00ae
        L_0x00a3:
            te3.o65 r4 = new te3.o65
            r4.<init>()
            r11 = r26
            r4.f138989d = r11
            r7.f259897x = r4
        L_0x00ae:
            java.util.Objects.requireNonNull(r27)
            r4 = r27
            r7.f259896w = r4
            ob0.c$b r11 = new ob0.c$b
            r11.<init>()
            r14 = 1122(0x462, float:1.572E-42)
            r11.mo72404b(r14)
            java.lang.String r14 = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp"
            r11.mo72409g(r14)
            r11.mo72405c(r7)
            te3.wm2 r7 = new te3.wm2
            r7.<init>()
            r11.mo72407e(r7)
            ob0.c r7 = r11.mo72403a()
            r0.f243440p = r7
            r15.mo123453j(r7)
            r7 = 10
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r11 = r15.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r5] = r11
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r24)
            r7[r8] = r3
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r16)
            r7[r9] = r1
            r1 = 3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r17)
            r7[r1] = r3
            r1 = 4
            r7[r1] = r2
            r1 = 5
            r7[r1] = r6
            r1 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r7[r1] = r2
            r1 = 7
            java.lang.String r2 = za0.C91626a.m114981a(r27)
            r7[r1] = r2
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r7[r1] = r2
            r1 = 9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r29)
            r7[r1] = r2
            java.lang.String r1 = "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp.<init>(java.lang.String, boolean, te3.p45, te3.b85, te3.l65, java.lang.String, int, com.tencent.mm.plugin.appbrand.report.quality.QualitySession, java.lang.String, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer, java.lang.String, te3.jy, int, boolean):void");
    }

    /* renamed from: u */
    public static void m102251u(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Log.m105925i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "saveMigrateAppId2SourceAppIdMapping, %s -> %s", str, str2);
            f243439w.put(str, str2);
        }
    }

    /* renamed from: v */
    public static void m102252v(C90444vm2 vm22) {
        u55 u55 = vm22.f259884h;
        int i = u55.f259849d;
        if (i > 0) {
            C81161g2.requireAccountInitializedOnDemand();
            C29226m1 m1Var = C81161g2.f238479r;
            if (m1Var != null) {
                C29225l1 l1Var = new C29225l1();
                l1Var.field_key = "@LibraryAppId";
                l1Var.field_version = i;
                if (m1Var.get(l1Var, "key", ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
                    u55 u552 = vm22.f259884h;
                    u552.f259850e = (int) l1Var.field_updateTime;
                    u552.f259851f = l1Var.field_scene;
                    return;
                }
                return;
            }
            return;
        }
        u55.f259849d = 0;
    }

    /* renamed from: w */
    public static void m102253w(C90444vm2 vm22) {
        try {
            if (C107835h0.f322854k.f252862a) {
                Log.m105924i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "SrvDeviceInfo isLimit benchmarkLevel");
                vm22.f259888o = -1;
                return;
            }
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ClientBenchmarkLevel", -1);
            vm22.f259888o = b;
            if (b == 0) {
                Log.m105920e("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "DynamicConfig performanceLevel 0 illegal");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", e, "read performanceLevel", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x0373 A[Catch:{ all -> 0x038f }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10094h(int r22, int r23, java.lang.String r24, te3.C49335eu3 r25, ob0.C117747y r26) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r25
            te3.wm2 r10 = (te3.C90446wm2) r10
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.f> r11 = com.tencent.p014mm.plugin.appbrand.appstorage.C29324f.class
            te3.wm2 r0 = r21.mo115602s()
            r12 = 0
            r13 = 1
            java.lang.String r14 = "MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122"
            if (r0 == r10) goto L_0x002c
            te3.wm2 r0 = r21.mo115602s()     // Catch:{ Exception -> 0x0022 }
            byte[] r1 = r10.toByteArray()     // Catch:{ Exception -> 0x0022 }
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0022 }
            goto L_0x002c
        L_0x0022:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r12] = r0
            java.lang.String r0 = "onCgiBack, intercepted by other cgi instance, copy response buffer get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r1)
        L_0x002c:
            if (r26 != 0) goto L_0x0030
            r15 = 1
            goto L_0x0031
        L_0x0030:
            r15 = 0
        L_0x0031:
            if (r15 != 0) goto L_0x00a3
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r10
            r6 = r26
            super.mo10094h(r2, r3, r4, r5, r6)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r2 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            r2.f237218l = r0     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = "EndTimeStampMs"
            r2.mo86048e(r3, r0)     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r2 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            long r3 = r2.f237217k     // Catch:{ Exception -> 0x0098 }
            long r0 = r0 - r3
            r2.f237215i = r0     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = "CostTimeMs"
            r2.mo86046c(r3, r0)     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r0 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            boolean r1 = r21.mo115603t()     // Catch:{ Exception -> 0x0098 }
            if (r1 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0067
        L_0x0065:
            r1 = 0
        L_0x0067:
            r0.f237222p = r1     // Catch:{ Exception -> 0x0098 }
            boolean r0 = rp0.C90077a.m112678a(r8, r9, r10)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x008c
            te3.au r0 = r10.f259923e     // Catch:{ Exception -> 0x0098 }
            if (r0 != 0) goto L_0x007a
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r0 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$c r1 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct.C80785c.bundle_null     // Catch:{ Exception -> 0x0098 }
            r0.f237219m = r1     // Catch:{ Exception -> 0x0098 }
            goto L_0x0092
        L_0x007a:
            pe3.b r0 = r0.f130770d     // Catch:{ Exception -> 0x0098 }
            if (r0 != 0) goto L_0x0085
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r0 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$c r1 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct.C80785c.jsapi_control_bytes_null     // Catch:{ Exception -> 0x0098 }
            r0.f237219m = r1     // Catch:{ Exception -> 0x0098 }
            goto L_0x0092
        L_0x0085:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r0 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$c r1 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct.C80785c.ok     // Catch:{ Exception -> 0x0098 }
            r0.f237219m = r1     // Catch:{ Exception -> 0x0098 }
            goto L_0x0092
        L_0x008c:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r0 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct$c r1 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct.C80785c.common_fail     // Catch:{ Exception -> 0x0098 }
            r0.f237219m = r1     // Catch:{ Exception -> 0x0098 }
        L_0x0092:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct r0 = r7.f243446v     // Catch:{ Exception -> 0x0098 }
            r0.mo86054n()     // Catch:{ Exception -> 0x0098 }
            goto L_0x00a3
        L_0x0098:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r12] = r0
            java.lang.String r0 = "quality report e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r1)
        L_0x00a3:
            ob0.c r0 = r7.f243440p
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.vm2 r0 = (te3.C90444vm2) r0
            te3.jy r0 = r0.f259896w
            boolean r0 = r0.f259640e
            r1 = 12
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r1[r13] = r2
            r2 = 2
            r1[r2] = r24
            int r3 = r21.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r1[r4] = r3
            java.lang.String r3 = r21.mo115601r()
            r5 = 4
            r1[r5] = r3
            ob0.c r3 = r7.f243440p
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            te3.vm2 r3 = (te3.C90444vm2) r3
            te3.p45 r3 = r3.f259881e
            int r3 = r3.f259731d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 5
            r1[r6] = r3
            ob0.c r3 = r7.f243440p
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            te3.vm2 r3 = (te3.C90444vm2) r3
            te3.p45 r3 = r3.f259881e
            int r3 = r3.f259732e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 6
            r1[r6] = r3
            r3 = 7
            boolean r16 = r21.mo115603t()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
            r1[r3] = r16
            r3 = 8
            boolean r4 = r7.f243443s
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r4
            r3 = 9
            ob0.c r4 = r7.f243440p
            ob0.c$c r4 = r4.f127055a
            pe3.a r4 = r4.f127080a
            te3.vm2 r4 = (te3.C90444vm2) r4
            te3.u55 r4 = r4.f259884h
            int r4 = r4.f259849d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 10
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r1[r3] = r4
            r3 = 11
            java.lang.String r4 = za0.C91626a.m114982b(r10)
            r1[r3] = r4
            java.lang.String r3 = "onCgiBack, errType %d, errCode %d, errMsg %s, cgiHash[%d] req[appId %s, versionType %d, appVersion %d, bg %B, sync %B, libVersion %d, isForPreRender %b], resp[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r1)
            if (r8 != 0) goto L_0x03b1
            if (r9 != 0) goto L_0x03b1
            if (r10 == 0) goto L_0x03b1
            gc.d r1 = p969gc.C87176d.f252818a
            java.lang.String r3 = r7.f243444t
            gc.c r1 = r1.mo121614b(r3, r12)
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r11)
            com.tencent.mm.plugin.appbrand.appstorage.f r3 = (com.tencent.p014mm.plugin.appbrand.appstorage.C29324f) r3
            if (r1 == 0) goto L_0x0165
            if (r3 == 0) goto L_0x0165
            java.lang.Object r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r11)
            com.tencent.mm.plugin.appbrand.appstorage.f r1 = (com.tencent.p014mm.plugin.appbrand.appstorage.C29324f) r1
            java.lang.String r3 = r10.f259928j
            ob0.c r4 = r7.f243440p
            ob0.c$c r4 = r4.f127055a
            pe3.a r4 = r4.f127080a
            te3.vm2 r4 = (te3.C90444vm2) r4
            java.lang.String r4 = r4.f259890q
            r1.mo56602jo(r3, r4)
        L_0x0165:
            if (r15 == 0) goto L_0x017c
            com.tencent.mm.plugin.appbrand.launching.w2 r1 = new com.tencent.mm.plugin.appbrand.launching.w2
            r1.<init>()
            r7.f243442r = r1
            com.tencent.mm.plugin.appbrand.launching.w2 r1 = r7.f243442r
            java.lang.String r3 = r21.mo115601r()
            r1.field_appId = r3
            com.tencent.mm.plugin.appbrand.launching.w2 r1 = r7.f243442r
            r1.mo115808l2(r10)
            goto L_0x018b
        L_0x017c:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.u2 r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n
            java.lang.String r3 = r21.mo115601r()
            com.tencent.mm.plugin.appbrand.launching.w2 r1 = r1.mo115787Lo(r3, r10)
            r7.f243442r = r1
        L_0x018b:
            com.tencent.mm.plugin.appbrand.launching.w2 r1 = r7.f243442r
            boolean r3 = r7.f243443s
            r1.f243994F = r3
            com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent r1 = new com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent
            com.tencent.mm.plugin.appbrand.launching.w2 r3 = r7.f243442r
            r1.<init>(r3)
            wo0.b$$a r3 = new wo0.b$$a
            r3.<init>()
            r1.asyncPublish((java.util.concurrent.Executor) r3)
            nr3.e r1 = nr3.C89060f.m111322a()
            wo0.d r3 = new wo0.d
            r3.<init>(r7, r10)
            nr3.e r1 = r1.mo123060U(r3)
            r1.mo123058O()
            te3.rm2 r1 = r10.f259922d
            if (r1 == 0) goto L_0x03e4
            int r1 = r1.f259816d
            if (r13 != r1) goto L_0x01c4
            zt3.t r1 = zt3.C119157j.f356862d
            wo0.b$$b r3 = new wo0.b$$b
            r3.<init>(r7, r0)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183884o(r3)
        L_0x01c4:
            te3.wm2 r1 = r21.mo115602s()
            te3.rm2 r1 = r1.f259922d
            int r1 = r1.f259816d
            if (r6 != r1) goto L_0x01d7
            te3.wm2 r1 = r21.mo115602s()
            te3.rm2 r1 = r1.f259922d
            te3.p65 r1 = r1.f259821i
            goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            if (r1 == 0) goto L_0x01e3
            java.lang.String r4 = r1.f139610d
            java.lang.String r8 = r21.mo115601r()
            m102251u(r4, r8)
        L_0x01e3:
            te3.rm2 r4 = r10.f259922d
            boolean r4 = r4.f259818f
            if (r4 == 0) goto L_0x0212
            if (r0 == 0) goto L_0x0202
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r1 = r21.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r12] = r1
            java.lang.String r1 = r7.f243441q
            r0[r13] = r1
            java.lang.String r1 = "onCgiBack cgiHash[%d] sessionId[%s] isForPreRender[true], skip add HistoryList"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            goto L_0x03e4
        L_0x0202:
            nr3.e r4 = nr3.C89060f.m111322a()
            wo0.e r8 = new wo0.e
            r8.<init>(r7, r0)
            nr3.e r0 = r4.mo123060U(r8)
            r0.mo123058O()
        L_0x0212:
            boolean r0 = r7.f243443s
            if (r0 != 0) goto L_0x03e4
            te3.wm2 r0 = r21.mo115602s()
            te3.hj3 r0 = r0.f259925g
            if (r0 == 0) goto L_0x022a
            te3.wm2 r0 = r21.mo115602s()
            te3.hj3 r0 = r0.f259925g
            boolean r0 = r0.f259556j
            if (r0 == 0) goto L_0x022a
            r0 = 1
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            te3.wm2 r4 = r21.mo115602s()
            te3.rm2 r4 = r4.f259922d
            if (r4 == 0) goto L_0x023f
            te3.wm2 r4 = r21.mo115602s()
            te3.rm2 r4 = r4.f259922d
            int r4 = r4.f259816d
            if (r5 != r4) goto L_0x023f
            r4 = 1
            goto L_0x0240
        L_0x023f:
            r4 = 0
        L_0x0240:
            com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify r8 = com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.f243337m0
            java.lang.String r9 = r21.mo115601r()
            ob0.c r10 = r7.f243440p
            ob0.c$c r10 = r10.f127055a
            pe3.a r10 = r10.f127080a
            r11 = r10
            te3.vm2 r11 = (te3.C90444vm2) r11
            te3.p45 r11 = r11.f259881e
            int r11 = r11.f259731d
            te3.vm2 r10 = (te3.C90444vm2) r10
            java.lang.String r10 = r10.f259889p
            java.util.Objects.requireNonNull(r10)
            com.tencent.mm.plugin.appbrand.launching.w2 r15 = r7.f243442r
            com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$a r8 = (com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify.C83273a) r8
            java.lang.String r14 = "notifyLaunchInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], %s"
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess r6 = com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess.m102197i(r10)
            java.lang.String r3 = "MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]"
            if (r6 == 0) goto L_0x0338
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r12] = r9
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r2[r13] = r16
            r16 = 2
            r2[r16] = r10
            java.lang.String r16 = r8.mo115555a(r15)
            r17 = 3
            r2[r17] = r16
            java.lang.String r5 = "notifyLaunchInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            if (r1 == 0) goto L_0x0299
            java.lang.String r2 = r1.f139610d
            boolean r2 = u24.C90599h.m113509b(r2, r9)
            if (r2 != 0) goto L_0x0299
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$a r2 = new com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$a
            r2.<init>(r6, r1)
            java.lang.String r5 = "notifyLaunchInfoUpdateWithWxaMigrateInfo"
            r6.mo115517b(r5, r2)
            goto L_0x0338
        L_0x0299:
            op3.c<com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> r2 = r6.f243260j
            java.lang.String r5 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            if (r2 == 0) goto L_0x0307
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction$a r2 = com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.CREATOR
            java.lang.String r13 = r6.f243263p
            int r12 = r6.f243265q
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r2 = r2.mo115481a(r13, r12, r15)
            if (r2 == 0) goto L_0x02b6
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r5 = r6.f243237K
            r12 = 0
            op3.c r2 = op3.C117882j.m166285d(r12, r2, r5)
            r6.f243260j = r2
            goto L_0x0338
        L_0x02b6:
            op3.c<com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> r2 = r6.f243260j
            r12 = 0
            java.lang.Object r2 = r2.mo182596a(r12)
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC) r2
            if (r2 != 0) goto L_0x02cc
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r12] = r9
            java.lang.String r6 = "notifyLaunchInfoUpdate null config with appId(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r2)
            goto L_0x0338
        L_0x02cc:
            r13 = 6
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r12] = r9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r16 = 1
            r13[r16] = r12
            r12 = 2
            r13[r12] = r10
            r12 = 3
            r13[r12] = r15
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            r16 = 4
            r13[r16] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            r16 = 5
            r13[r16] = r12
            java.lang.String r12 = "[ILaunchWxaAppInfoNotify][notifyLaunchInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%s] relyCommLibUpdate[%b] restartOnAsyncWxaAttrUpdatedWithLaunchRequestedLatestVersion[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r12, r13)
            r15.mo115809m2(r2)
            com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized r5 = r2.f234856A
            r5.f234898g = r0
            r5.f234899h = r4
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r5 = r6.f243237K
            r12 = 0
            op3.c r2 = op3.C117882j.m166285d(r2, r12, r5)
            r6.f243260j = r2
            goto L_0x0339
        L_0x0307:
            r2 = 6
            r12 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r13 = 0
            r2[r13] = r9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r16 = 1
            r2[r16] = r13
            r13 = 2
            r2[r13] = r10
            r13 = 3
            r2[r13] = r15
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r16 = 4
            r2[r16] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            r16 = 5
            r2[r16] = r13
            java.lang.String r13 = "[ILaunchWxaAppInfoNotify][notifyLaunchInfoUpdate] set mMaybeUpdatedLaunchPB appId[%s] type[%d] instanceId[%s] info[%s] relyCommLibUpdate[%b] restartOnAsyncWxaAttrUpdatedWithLaunchRequestedLatestVersion[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r2)
            r6.f243247T = r15
            r6.f243248U = r0
            r6.f243249V = r4
            goto L_0x0339
        L_0x0338:
            r12 = 0
        L_0x0339:
            r2 = 4
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0394 }
            r2 = 0
            r5[r2] = r9     // Catch:{ all -> 0x038f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x038f }
            r6 = 1
            r5[r6] = r2     // Catch:{ all -> 0x038f }
            r2 = 2
            r5[r2] = r10     // Catch:{ all -> 0x038f }
            java.lang.String r2 = r8.mo115555a(r15)     // Catch:{ all -> 0x038f }
            r6 = 3
            r5[r6] = r2     // Catch:{ all -> 0x038f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r14, r5)     // Catch:{ all -> 0x038f }
            com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper r2 = new com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper     // Catch:{ all -> 0x038f }
            r2.<init>()     // Catch:{ all -> 0x038f }
            r2.f243341d = r9     // Catch:{ all -> 0x038f }
            r2.f243342e = r11     // Catch:{ all -> 0x038f }
            com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized r5 = new com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized     // Catch:{ all -> 0x038f }
            com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle r6 = new com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle     // Catch:{ all -> 0x038f }
            te3.au r13 = r15.field_jsapiInfo     // Catch:{ all -> 0x038f }
            r6.<init>(r13)     // Catch:{ all -> 0x038f }
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction$a r13 = com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.CREATOR     // Catch:{ all -> 0x038f }
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r16 = r13.mo115481a(r9, r11, r15)     // Catch:{ all -> 0x038f }
            java.lang.String r13 = r15.field_opConfig     // Catch:{ all -> 0x038f }
            if (r1 != 0) goto L_0x0373
        L_0x036f:
            r20 = r12
            r1 = r14
            goto L_0x037b
        L_0x0373:
            com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized r12 = new com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized     // Catch:{ all -> 0x038f }
            java.lang.String r1 = r1.f139610d     // Catch:{ all -> 0x038f }
            r12.<init>(r1)     // Catch:{ all -> 0x038f }
            goto L_0x036f
        L_0x037b:
            r14 = r5
            r12 = r15
            r15 = r6
            r17 = r13
            r18 = r0
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x038d }
            r2.f243343f = r5     // Catch:{ all -> 0x038d }
            com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage.C84298b.m103919a(r9, r2)     // Catch:{ all -> 0x038d }
            goto L_0x03e4
        L_0x038d:
            r0 = move-exception
            goto L_0x0392
        L_0x038f:
            r0 = move-exception
            r1 = r14
            r12 = r15
        L_0x0392:
            r2 = 4
            goto L_0x0397
        L_0x0394:
            r0 = move-exception
            r1 = r14
            r12 = r15
        L_0x0397:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r5 = 1
            r2[r5] = r4
            r4 = 2
            r2[r4] = r10
            java.lang.String r4 = r8.mo115555a(r12)
            r5 = 3
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r1, r2)
            goto L_0x03e4
        L_0x03b1:
            boolean r1 = r7.f243443s
            if (r1 == 0) goto L_0x03e4
            com.tencent.mm.plugin.appbrand.launching.p1 r1 = r7.f243445u
            if (r1 == 0) goto L_0x03e4
            if (r0 != 0) goto L_0x03e4
            r0 = 2131821269(0x7f1102d5, float:1.9275276E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.util.Locale r3 = java.util.Locale.US
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r4[r1] = r5
            java.lang.String r1 = " (%d,%d)"
            java.lang.String r1 = java.lang.String.format(r3, r1, r4)
            r2[r6] = r1
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.m104395b(r0, r2)
            com.tencent.mm.plugin.appbrand.launching.p1 r1 = r7.f243445u
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r1)
        L_0x03e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp.mo10094h(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }

    /* renamed from: i */
    public final synchronized C89059e<C89132b.C89134c<C90446wm2>> mo9225i() {
        C89059e<C89132b.C89134c<C90446wm2>> a = new C91041a().mo125107a((C90444vm2) this.f243440p.f127055a.f127080a, this.f243443s, this);
        if (a != null) {
            return a;
        }
        C87175c b = C87176d.f252818a.mo121614b(this.f243444t, false);
        if (b != null) {
            C87174b bVar = b.f252816a.get(0);
            C79625g gVar = null;
            if (bVar == null) {
                bVar = null;
            }
            if (bVar == null) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandParallelTaskCollection", "getLaunchTask: ret == null!");
            } else {
                gVar = (C79625g) bVar;
            }
            if (gVar != null) {
                C89132b.C89134c<C90446wm2> e = gVar.mo109762a(100);
                if (e == null || e.f256796d == null || e.f256793a != 0 || e.f256794b != 0) {
                    gVar.f252814d = false;
                } else {
                    gVar.f252814d = true;
                    Log.m105925i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "run() intercepted by preFetchLaunchTask, instanceId:%s", this.f243444t);
                    return C89060f.m111325d(new C83300a(e));
                }
            }
        }
        m102252v((C90444vm2) this.f243440p.f127055a.f127080a);
        m102253w((C90444vm2) this.f243440p.f127055a.f127080a);
        long nowMilliSecond = Util.nowMilliSecond();
        WeAppQualitySystemLaunchCGIStruct weAppQualitySystemLaunchCGIStruct = this.f243446v;
        weAppQualitySystemLaunchCGIStruct.f237217k = nowMilliSecond;
        weAppQualitySystemLaunchCGIStruct.mo86048e("StartTimeStampMs", nowMilliSecond);
        return super.mo9225i();
    }

    /* renamed from: n */
    public final C89132b.C89134c<C90446wm2> mo115600n() {
        this.f243443s = true;
        return super.mo115600n();
    }

    /* renamed from: q */
    public C89059e<C89132b.C89134c<C90446wm2>> mo109760q() {
        if (!C39425a.m42111a(mo115601r(), ((C90444vm2) this.f243440p.f127055a.f127080a).f259890q)) {
            return C89060f.m111325d(new C83301b());
        }
        return null;
    }

    /* renamed from: r */
    public final String mo115601r() {
        return ((C90444vm2) this.f243440p.f127055a.f127080a).f259880d;
    }

    /* renamed from: s */
    public final C90446wm2 mo115602s() {
        return (C90446wm2) this.f243440p.f127056b.f127083a;
    }

    /* renamed from: t */
    public final boolean mo115603t() {
        return ((C90444vm2) this.f243440p.f127055a.f127080a).f259881e.f259735h > 0;
    }
}
