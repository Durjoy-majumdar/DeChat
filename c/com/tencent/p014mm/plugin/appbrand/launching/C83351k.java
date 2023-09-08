package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83341j;
import com.tencent.p014mm.plugin.appbrand.launching.C83387n;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.k */
public final class C83351k implements Runnable {

    /* renamed from: d */
    public final LaunchParcel f243567d;

    /* renamed from: e */
    public final String f243568e;

    /* renamed from: f */
    public final boolean f243569f;

    /* renamed from: g */
    public final C83341j.C83342a<AppBrandInitConfigWC> f243570g;

    /* renamed from: h */
    public final C83387n.C83389b f243571h;

    /* renamed from: i */
    public final boolean f243572i;

    /* renamed from: j */
    public C80247h f243573j;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.k$a */
    public static final class C83352a extends Error {

        /* renamed from: d */
        public final String f243574d;

        /* renamed from: e */
        public final String f243575e;

        public C83352a(String str, String str2) {
            C87412m.m108594g(str2, "migrateTargetAppId");
            this.f243574d = str;
            this.f243575e = str2;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.AppBrandPreLaunchProcessMigrateCompatWrapper$run$1", mo125469f = "AppBrandPreLaunchProcessMigrateCompatWrapper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.k$b */
    public static final class C83353b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C83351k f243576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83353b(C83351k kVar, C15601d<? super C83353b> dVar) {
            super(2, dVar);
            this.f243576d = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C83353b(this.f243576d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C83353b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C83351k kVar = this.f243576d;
            new C83387n(kVar.f243567d, kVar.f243568e, kVar.f243569f, kVar.f243570g, kVar.f243571h).run();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.AppBrandPreLaunchProcessMigrateCompatWrapper$run$2", mo125469f = "AppBrandPreLaunchProcessMigrateCompatWrapper.kt", mo125470l = {65}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.k$c */
    public static final class C83354c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f243577d;

        /* renamed from: e */
        public int f243578e;

        /* renamed from: f */
        public final /* synthetic */ C83351k f243579f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83354c(C83351k kVar, C15601d<? super C83354c> dVar) {
            super(2, dVar);
            this.f243579f = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C83354c(this.f243579f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C83354c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r10.f243578e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 != r3) goto L_0x001a
                java.lang.Object r1 = r10.f243577d
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r1 = (com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel) r1
                kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ a -> 0x0015 }
                r4 = r1
                r1 = r0
                r0 = r10
                goto L_0x003d
            L_0x0015:
                r11 = move-exception
                r4 = r1
                r1 = r0
                r0 = r10
                goto L_0x005a
            L_0x001a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r11)
                com.tencent.mm.plugin.appbrand.launching.k r11 = r10.f243579f
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r11 = r11.f243567d
                r1 = r11
                r11 = r10
            L_0x002b:
                com.tencent.mm.plugin.appbrand.launching.k r4 = r11.f243579f     // Catch:{ a -> 0x0054 }
                r11.f243577d = r1     // Catch:{ a -> 0x0054 }
                r11.f243578e = r3     // Catch:{ a -> 0x0054 }
                java.lang.Object r4 = com.tencent.p014mm.plugin.appbrand.launching.C83351k.m102303a(r4, r1, r11)     // Catch:{ a -> 0x0054 }
                if (r4 != r0) goto L_0x0038
                return r0
            L_0x0038:
                r9 = r0
                r0 = r11
                r11 = r4
                r4 = r1
                r1 = r9
            L_0x003d:
                com.tencent.mm.plugin.appbrand.launching.k r5 = r0.f243579f     // Catch:{ a -> 0x0052 }
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r11 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r11     // Catch:{ a -> 0x0052 }
                com.tencent.mm.plugin.appbrand.launching.j$a<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC> r5 = r5.f243570g     // Catch:{ a -> 0x0052 }
                if (r5 == 0) goto L_0x004f
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r6 = r4.f243738o     // Catch:{ a -> 0x0052 }
                if (r11 == 0) goto L_0x004b
                r7 = 1
                goto L_0x004c
            L_0x004b:
                r7 = 2
            L_0x004c:
                r5.mo115495a(r11, r6, r7)     // Catch:{ a -> 0x0052 }
            L_0x004f:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            L_0x0052:
                r11 = move-exception
                goto L_0x005a
            L_0x0054:
                r4 = move-exception
                r9 = r0
                r0 = r11
                r11 = r4
                r4 = r1
                r1 = r9
            L_0x005a:
                com.tencent.luggage.sdk.launching.h r5 = r4.f243720L
                com.tencent.luggage.sdk.launching.h r6 = com.tencent.luggage.sdk.launching.C80247h.PRE_RENDER
                java.lang.String r7 = "MicroMsg.AppBrandPreLaunchProcessMigrateCompatWrapper"
                if (r5 != r6) goto L_0x0090
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = "skip migrate because prerender-ing, appId:"
                r11.append(r1)
                java.lang.String r1 = r4.f243731e
                r11.append(r1)
                java.lang.String r1 = ", username:"
                r11.append(r1)
                java.lang.String r1 = r4.f243730d
                r11.append(r1)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r11)
                com.tencent.mm.plugin.appbrand.launching.k r11 = r0.f243579f
                com.tencent.mm.plugin.appbrand.launching.j$a<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC> r11 = r11.f243570g
                if (r11 == 0) goto L_0x008d
                r0 = 0
                r11.mo115495a(r0, r0, r2)
            L_0x008d:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            L_0x0090:
                java.lang.String r5 = r11.f243575e
                java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83435s.m102390g(r4)
                com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp.m102251u(r5, r6)
                com.tencent.mm.plugin.appbrand.launching.k r5 = r0.f243579f
                java.lang.String r6 = r11.f243574d
                r4.f243731e = r6
                java.lang.String r6 = r4.toString()
                java.lang.String r8 = "this.toString()"
                gy3.C87412m.m108593f(r6, r8)
                java.lang.String r5 = r5.f243568e
                java.lang.String r11 = r11.f243575e
                com.tencent.p014mm.plugin.appbrand.RuntimeMigrateRestartHelper.m99332a(r4, r5, r11)
                java.lang.String r11 = r4.toString()
                gy3.C87412m.m108593f(r11, r8)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "[applaunch]replace LaunchParcel content, "
                r5.append(r8)
                r5.append(r6)
                java.lang.String r6 = " => "
                r5.append(r6)
                r5.append(r11)
                java.lang.String r11 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
                r11 = r0
                r0 = r1
                r1 = r4
                goto L_0x002b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83351k.C83354c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C83351k(LaunchParcel launchParcel, String str, boolean z, C83341j.C83342a<AppBrandInitConfigWC> aVar, C83387n.C83389b bVar) {
        C87412m.m108594g(launchParcel, "launchParcel");
        C87412m.m108594g(str, "instanceId");
        this.f243567d = launchParcel;
        this.f243568e = str;
        this.f243569f = z;
        this.f243570g = aVar;
        this.f243571h = bVar;
        boolean z2 = false;
        if (!z) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_launch_migrate_during_get_contact, BuildInfo.CLIENT_VERSION_INT <= 671096831 ? 1 : 0) == 1) {
                z2 = true;
            }
        }
        this.f243572i = z2;
        this.f243573j = C80247h.LEGACY;
    }

    /* renamed from: a */
    public static final Object m102303a(C83351k kVar, LaunchParcel launchParcel, C15601d dVar) {
        kVar.getClass();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        LaunchParcel launchParcel2 = launchParcel;
        C83387n nVar = new C83387n(launchParcel2, kVar.f243568e, kVar.f243569f, new C83360l(mVar), kVar.f243571h);
        nVar.f243649y = kVar.f243573j;
        launchParcel.f243720L = nVar.f243649y;
        nVar.run();
        return mVar.mo74608o();
    }

    public void run() {
        if (!this.f243572i) {
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C83353b(this, (C15601d<? super C83353b>) null), 2, (Object) null);
        } else {
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C83354c(this, (C15601d<? super C83354c>) null), 2, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C83351k(LaunchParcel launchParcel, String str, boolean z, C83341j.C83342a aVar, C83387n.C83389b bVar, int i, C8480h hVar) {
        this(launchParcel, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : bVar);
    }
}
