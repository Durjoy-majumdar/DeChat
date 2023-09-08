package com.tencent.p014mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29293q1;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83511w1;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o40.C61926c;
import or3.C89286a;
import rx3.C13598b0;
import sx3.C110823p;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.f2 */
public final class C83319f2 extends C83511w1.C83512a {

    /* renamed from: a */
    public final /* synthetic */ QualitySession f243482a;

    /* renamed from: b */
    public final /* synthetic */ C90422jy f243483b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<C83368m1.C83374d, C13598b0> f243484c;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.f2$a */
    public static final class C83320a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83368m1.C83374d f243485d;

        /* renamed from: e */
        public final /* synthetic */ C90422jy f243486e;

        /* renamed from: f */
        public final /* synthetic */ QualitySession f243487f;

        /* renamed from: g */
        public final /* synthetic */ String f243488g;

        /* renamed from: h */
        public final /* synthetic */ C83319f2 f243489h;

        /* renamed from: i */
        public final /* synthetic */ C83368m1.C83377e f243490i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83320a(C83368m1.C83374d dVar, C90422jy jyVar, QualitySession qualitySession, String str, C83319f2 f2Var, C83368m1.C83377e eVar) {
            super(0);
            this.f243485d = dVar;
            this.f243486e = jyVar;
            this.f243487f = qualitySession;
            this.f243488g = str;
            this.f243489h = f2Var;
            this.f243490i = eVar;
        }

        public Object invoke() {
            WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = new WeAppPluginAutoUpdateStruct();
            QualitySession qualitySession = this.f243487f;
            C83368m1.C83374d dVar = this.f243485d;
            String str = this.f243488g;
            weAppPluginAutoUpdateStruct.f236613d = weAppPluginAutoUpdateStruct.mo86045b("AppId", qualitySession.f245833e, true);
            weAppPluginAutoUpdateStruct.f236614e = (long) qualitySession.f245837i;
            int i = qualitySession.f245834f;
            weAppPluginAutoUpdateStruct.f236615f = i != 1 ? i != 2 ? i != 3 ? null : WeAppPluginAutoUpdateStruct.C80753a.demo : WeAppPluginAutoUpdateStruct.C80753a.debug : WeAppPluginAutoUpdateStruct.C80753a.release;
            weAppPluginAutoUpdateStruct.f236616g = (long) qualitySession.f245835g;
            weAppPluginAutoUpdateStruct.f236617h = weAppPluginAutoUpdateStruct.mo86045b("PluginAppid", dVar.f243616d, true);
            weAppPluginAutoUpdateStruct.f236618i = WeAppPluginAutoUpdateStruct.C80754b.release;
            weAppPluginAutoUpdateStruct.f236619j = weAppPluginAutoUpdateStruct.mo86045b("networkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
            weAppPluginAutoUpdateStruct.f236620k = weAppPluginAutoUpdateStruct.mo86045b("InstanceId", str, true);
            weAppPluginAutoUpdateStruct.f236621l = (long) qualitySession.f245836h;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicReference atomicReference = new AtomicReference();
            C83368m1.C83370b bVar = C83368m1.f243597a;
            C83368m1.C83374d dVar2 = this.f243485d;
            String str2 = dVar2.f243616d;
            String str3 = dVar2.f243617e;
            int i2 = dVar2.f243618f;
            int i3 = dVar2.f243619g;
            C83368m1.C83381g.C83383b bVar2 = (C83368m1.C83381g.C83383b) dVar2.f243620h;
            C83368m1.C83370b.m102315a(bVar, new C83368m1.C83374d(str2, str3, i2, i3, new C83368m1.C83381g.C83383b(bVar2.f243631a, true, bVar2.f243633c), false), new C83308d2(this.f243489h, this.f243485d, this.f243490i, weAppPluginAutoUpdateStruct), new C83312e2(this.f243489h, this.f243485d, this.f243488g, atomicInteger, atomicReference, weAppPluginAutoUpdateStruct), (C32226l) null, (C83397o1) null, 0, this.f243486e, new C83299c2(this.f243488g, atomicInteger, atomicReference), (Executor) null, 312, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C83319f2(QualitySession qualitySession, C90422jy jyVar, C32226l<? super C83368m1.C83374d, C13598b0> lVar) {
        this.f243482a = qualitySession;
        this.f243483b = jyVar;
        this.f243484c = lVar;
    }

    /* renamed from: a */
    public void mo115597a(C83368m1.C83374d dVar, int i, String str) {
        C87412m.m108594g(dVar, "request");
        this.f243484c.invoke(dVar);
        if (C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct = new WeAppQualitySplitCodeLibStatisStruct();
            mo115803f(weAppQualitySplitCodeLibStatisStruct, this.f243482a);
            weAppQualitySplitCodeLibStatisStruct.f237130k = weAppQualitySplitCodeLibStatisStruct.mo86045b("networkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
            weAppQualitySplitCodeLibStatisStruct.f237127h = weAppQualitySplitCodeLibStatisStruct.mo86045b("Provider", dVar.f243616d, true);
            C83368m1.C83381g gVar = dVar.f243620h;
            if (gVar instanceof C83368m1.C83381g.C83384c) {
                weAppQualitySplitCodeLibStatisStruct.f237128i = (long) ((C83368m1.C83381g.C83384c) gVar).f243634a;
                C81161g2.requireAccountInitializedOnDemand();
                int[] y = C81161g2.f238471g.mo113543y(dVar.mo115637a().toString());
                if (y == null) {
                    weAppQualitySplitCodeLibStatisStruct.f237129j = 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int length = y.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        int i3 = y[i2];
                        if (!(i3 == dVar.f243620h.mo115647a())) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        weAppQualitySplitCodeLibStatisStruct.f237129j = 4;
                    }
                }
            } else {
                weAppQualitySplitCodeLibStatisStruct.f237128i = 0;
                weAppQualitySplitCodeLibStatisStruct.f237129j = 2;
            }
            weAppQualitySplitCodeLibStatisStruct.mo86054n();
        }
    }

    /* renamed from: d */
    public void mo115598d(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(eVar, "response");
        C83368m1.C83381g gVar = dVar.f243620h;
        if ((gVar instanceof C83368m1.C83381g.C83383b) && !((C83368m1.C83381g.C83383b) gVar).f243632b && C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            Log.m105924i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", "onPkgCached, will update plugin(" + dVar.f243616d + ") to latest in background...");
            QualitySession qualitySession = this.f243482a;
            C83368m1.C83374d dVar2 = dVar;
            C61926c.m72656A((String) null, new C83320a(dVar2, this.f243483b, qualitySession, qualitySession.f245832d, this, eVar));
        }
        if (C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct = new WeAppQualitySplitCodeLibStatisStruct();
            mo115803f(weAppQualitySplitCodeLibStatisStruct, this.f243482a);
            weAppQualitySplitCodeLibStatisStruct.f237130k = weAppQualitySplitCodeLibStatisStruct.mo86045b("networkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
            weAppQualitySplitCodeLibStatisStruct.f237127h = weAppQualitySplitCodeLibStatisStruct.mo86045b("Provider", dVar.f243616d, true);
            weAppQualitySplitCodeLibStatisStruct.f237128i = (long) eVar.f243626a.pkgVersion();
            weAppQualitySplitCodeLibStatisStruct.f237129j = 3;
            weAppQualitySplitCodeLibStatisStruct.mo86054n();
            C29293q1.m38615b(dVar.f243616d, eVar.f243626a.pkgVersion());
        }
        mo115804g(this.f243482a, dVar, eVar);
    }

    /* renamed from: e */
    public void mo115599e(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(eVar, "response");
        if (C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            C29293q1.m38615b(dVar.f243616d, eVar.f243626a.pkgVersion());
        }
    }
}
