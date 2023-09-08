package gu0;

import android.webkit.ValueCallback;
import bq0.C79766e;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.C81596c;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84867u;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dq0.C86390a;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p284zb.C91635f;
import p774zg.C91735n0;
import zt3.C119157j;

/* renamed from: gu0.g */
public class C87393g extends C87388d {

    /* renamed from: gu0.g$a */
    public static final class C87394a implements C81596c {

        /* renamed from: d */
        public final /* synthetic */ C87393g f253282d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<C80669j> f253283e;

        public C87394a(C87393g gVar, WeakReference<C80669j> weakReference) {
            this.f253282d = gVar;
            this.f253283e = weakReference;
        }

        public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
            C87393g gVar = this.f253282d;
            WeakReference<C80669j> weakReference = this.f253283e;
            C87412m.m108591d(weakReference);
            gVar.mo112512b(weakReference.get(), str, valueCallback);
        }
    }

    /* renamed from: gu0.g$b */
    public static final class C87395b implements IJSRuntime.C80648a {

        /* renamed from: a */
        public final /* synthetic */ WxaPkgV8SnapshotInfo f253284a;

        /* renamed from: b */
        public final /* synthetic */ C87393g f253285b;

        /* renamed from: c */
        public final /* synthetic */ C82510g f253286c;

        /* renamed from: gu0.g$b$a */
        public static final class C87396a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WxaPkgV8SnapshotInfo f253287d;

            public C87396a(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
                this.f253287d = wxaPkgV8SnapshotInfo;
            }

            public final void run() {
                WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f253287d;
                C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
                C84867u uVar = (C84867u) C86312j.m106911c(C84867u.class);
                if (uVar != null) {
                    uVar.rj0(wxaPkgV8SnapshotInfo);
                }
            }
        }

        /* renamed from: gu0.g$b$b */
        public static final class C87397b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WxaPkgV8SnapshotInfo f253288d;

            public C87397b(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
                this.f253288d = wxaPkgV8SnapshotInfo;
            }

            public final void run() {
                WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f253288d;
                C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
                C84867u uVar = (C84867u) C86312j.m106911c(C84867u.class);
                if (uVar != null) {
                    uVar.i30(wxaPkgV8SnapshotInfo);
                }
            }
        }

        public C87395b(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, C87393g gVar, C82510g gVar2) {
            this.f253284a = wxaPkgV8SnapshotInfo;
            this.f253285b = gVar;
            this.f253286c = gVar2;
        }

        /* renamed from: a */
        public void mo112457a() {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f253284a;
            if (wxaPkgV8SnapshotInfo != null) {
                C87393g.m108531r(this.f253285b, this.f253286c, new C87397b(wxaPkgV8SnapshotInfo));
            }
            C84868u0.f247366a.mo117619p((ICommLibReader) null, this.f253284a);
        }

        /* renamed from: b */
        public void mo112458b(long j, long j2) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f253284a;
            if (wxaPkgV8SnapshotInfo != null) {
                C87393g.m108531r(this.f253285b, this.f253286c, new C87396a(wxaPkgV8SnapshotInfo));
            }
            C84868u0 u0Var = C84868u0.f247366a;
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = this.f253284a;
            C82510g gVar = this.f253286c;
            u0Var.mo117618o((ICommLibReader) null, wxaPkgV8SnapshotInfo2, j, j2, false, gVar instanceof C91635f ? (C91635f) gVar : null);
        }
    }

    public C87393g(C91735n0 n0Var) {
        super(n0Var);
    }

    /* renamed from: r */
    public static final void m108531r(C87393g gVar, C82510g gVar2, Runnable runnable) {
        gVar.getClass();
        C84217q qVar = C84217q.PreloadOnProcessCreated;
        C84217q qVar2 = null;
        C91635f fVar = gVar2 instanceof C91635f ? (C91635f) gVar2 : null;
        if (fVar != null) {
            qVar2 = fVar.f262594I;
        }
        if (qVar != qVar2) {
            ((C119157j) C119157j.f356862d).mo183885p(runnable, "MicroMsg.V8WorkerManagerWC");
        }
    }

    /* renamed from: d */
    public C40482o mo112514d(int i, WeakReference<C80669j> weakReference) {
        return i == 0 ? new C87394a(this, weakReference) : new C80681o.C80683b(weakReference);
    }

    /* renamed from: j */
    public IJSRuntime.Config mo112520j(C82510g gVar) {
        C87412m.m108594g(gVar, "component");
        IJSRuntime.Config j = super.mo112520j(gVar);
        C84867u uVar = (C84867u) C86312j.m106911c(C84867u.class);
        WxaPkgV8SnapshotInfo Tf = uVar != null ? uVar.mo117544Tf() : null;
        j.f235989q = new C87395b(Tf, this, gVar);
        if (Tf == null) {
            return j;
        }
        Log.m105924i("MicroMsg.V8WorkerManagerWC", "setupJSRuntimeConfig, use nodeOnly snapshot");
        j.f235974b = Tf.f247273i;
        j.f235975c = true;
        j.f235977e = Tf.mo117552c();
        return j;
    }

    /* renamed from: k */
    public int mo112521k() {
        return 1;
    }

    /* renamed from: l */
    public C86390a mo121807l() {
        return new C79766e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r2 = (r2 = r2.mo113051d0()).f261072r;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo121809n(com.tencent.p014mm.plugin.appbrand.jsapi.C82510g r2) {
        /*
            r1 = this;
            java.lang.String r0 = "component"
            gy3.C87412m.m108594g(r2, r0)
            boolean r0 = r2 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r0 == 0) goto L_0x0029
            com.tencent.mm.plugin.appbrand.i2 r2 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r2.getRuntime()
            if (r2 == 0) goto L_0x001e
            wi0.l r2 = r2.mo113051d0()
            if (r2 == 0) goto L_0x001e
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.md5
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r0 = "nullAsNil(component.runt…sConfig?.appPkgInfo?.md5)"
            gy3.C87412m.m108593f(r2, r0)
            goto L_0x002b
        L_0x0029:
            java.lang.String r2 = ""
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.C87393g.mo121809n(com.tencent.mm.plugin.appbrand.jsapi.g):java.lang.String");
    }

    /* renamed from: o */
    public String mo121810o() {
        String a = C83173l0.m102077a();
        C87412m.m108593f(a, "retrieve()");
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121812q(com.tencent.p014mm.appbrand.p942v8.C80681o.C80687f r6, long r7, long r9, com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g r11) {
        /*
            r5 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "executeDetails"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reportEvaluateResult, filePath:"
            r0.append(r1)
            java.lang.String r1 = r6.f236089a
            r0.append(r1)
            java.lang.String r1 = ", startTimeMs:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", endTimeMs:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", cost:"
            r0.append(r1)
            long r9 = r9 - r7
            r0.append(r9)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "MicroMsg.V8WorkerManagerWC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            java.lang.String[] r7 = p1044ub.C90636f.f260397J0
            java.lang.String r8 = "SCRIPTS_LIB_FOR_WORKER"
            gy3.C87412m.m108593f(r7, r8)
            int r8 = r7.length
            r9 = 0
            r10 = 0
        L_0x0046:
            java.lang.String r0 = ""
            r1 = 0
            if (r10 >= r8) goto L_0x0062
            r2 = r7[r10]
            java.lang.String r3 = r6.f236089a
            if (r3 != 0) goto L_0x0052
            r3 = r0
        L_0x0052:
            java.lang.String r4 = "it"
            gy3.C87412m.m108593f(r2, r4)
            r4 = 2
            boolean r3 = z04.C112551y.m153808h(r3, r2, r9, r4, r1)
            if (r3 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r10 = r10 + 1
            goto L_0x0046
        L_0x0062:
            r2 = r1
        L_0x0063:
            r7 = 1
            if (r2 == 0) goto L_0x006f
            int r8 = r2.length()
            if (r8 != 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r8 = 0
            goto L_0x0070
        L_0x006f:
            r8 = 1
        L_0x0070:
            if (r8 == 0) goto L_0x0073
            return
        L_0x0073:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r8 == 0) goto L_0x0088
            boolean r8 = r6 instanceof gu0.d$$g
            if (r8 == 0) goto L_0x007c
            goto L_0x0088
        L_0x007c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Assertion failed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0088:
            gu0.d$$g r6 = (gu0.d$$g) r6
            java.lang.String r8 = r6.f253274d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r8 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r8)
            int r10 = r11.sourceLength
            if (r10 <= 0) goto L_0x0096
        L_0x0094:
            long r10 = (long) r10
            goto L_0x00b1
        L_0x0096:
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest r10 = r6.f236090b
            int r11 = r10.scriptType
            if (r11 == r7) goto L_0x00ad
            r3 = 3
            if (r11 == r3) goto L_0x00a2
            r10 = 0
            goto L_0x00b1
        L_0x00a2:
            java.lang.String r10 = r10.scriptText
            if (r10 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = r10
        L_0x00a8:
            int r10 = r0.length()
            goto L_0x0094
        L_0x00ad:
            com.eclipsesource.mmv8.V8ScriptFileDescriptor r10 = r10.scriptFd
            long r10 = r10.length
        L_0x00b1:
            com.tencent.mm.plugin.appbrand.report.quality.e r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            boolean r3 = r6.f253275e
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct r0 = r0.mo116889h(r3, r8, r1)
            if (r0 != 0) goto L_0x00bc
            goto L_0x00e3
        L_0x00bc:
            boolean r1 = r8 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r1 == 0) goto L_0x00e2
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r8.mo113184O1(r9)
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.appbrand.appcache.AbsReader
            if (r1 == 0) goto L_0x00e2
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r8 = r8.mo113184O1(r9)
            com.tencent.mm.plugin.appbrand.appcache.AbsReader r8 = (com.tencent.p014mm.plugin.appbrand.appcache.AbsReader) r8
            vb.a r8 = r8.mo113370Z()
            java.lang.String r8 = r8.mo13713a()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r9 = "expt"
            java.lang.String r8 = r0.mo86045b(r9, r8, r7)
            r0.f236937w = r8
        L_0x00e2:
            r1 = r0
        L_0x00e3:
            if (r1 != 0) goto L_0x00e6
            return
        L_0x00e6:
            r1.mo112531s(r2)
            r1.f236930p = r10
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r6 = r6.f253276f
            gy3.C87412m.m108591d(r6)
            java.lang.String r6 = r6.mo113377i()
            java.lang.String r8 = "libVersion"
            java.lang.String r6 = r1.mo86045b(r8, r6, r7)
            r1.f236929o = r6
            r8 = 5
            r1.f236931q = r8
            java.lang.String r6 = com.eclipsesource.mmv8.C80135V8.getV8Version()
            java.lang.String r8 = "engineVersion"
            java.lang.String r6 = r1.mo86045b(r8, r6, r7)
            r1.f236935u = r6
            r1.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.C87393g.mo121812q(com.tencent.mm.appbrand.v8.o$f, long, long, com.tencent.mm.appbrand.v8.j$g):void");
    }
}
