package com.tencent.p014mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29293q1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83511w1;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import nr3.C89060f;
import o40.C61926c;
import or3.C89286a;
import rx3.C13598b0;
import sx3.C110823p;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.z1 */
public final class C83527z1 extends C83511w1.C83512a {

    /* renamed from: a */
    public CopyOnWriteArrayList<C83528a> f244041a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public volatile boolean f244042b;

    /* renamed from: c */
    public final /* synthetic */ boolean f244043c;

    /* renamed from: d */
    public final /* synthetic */ QualitySession f244044d;

    /* renamed from: e */
    public final /* synthetic */ C90422jy f244045e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C83368m1.C83374d, C13598b0> f244046f;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.z1$a */
    public final class C83528a {

        /* renamed from: a */
        public int f244047a;

        /* renamed from: b */
        public String f244048b = "";

        /* renamed from: c */
        public int f244049c;

        public C83528a(C83527z1 z1Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.z1$b */
    public static final class C83529b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83368m1.C83374d f244050d;

        /* renamed from: e */
        public final /* synthetic */ C90422jy f244051e;

        /* renamed from: f */
        public final /* synthetic */ QualitySession f244052f;

        /* renamed from: g */
        public final /* synthetic */ C83527z1 f244053g;

        /* renamed from: h */
        public final /* synthetic */ C83368m1.C83377e f244054h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83529b(C83368m1.C83374d dVar, C90422jy jyVar, QualitySession qualitySession, C83527z1 z1Var, C83368m1.C83377e eVar) {
            super(0);
            this.f244050d = dVar;
            this.f244051e = jyVar;
            this.f244052f = qualitySession;
            this.f244053g = z1Var;
            this.f244054h = eVar;
        }

        public Object invoke() {
            WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = new WeAppPluginAutoUpdateStruct();
            QualitySession qualitySession = this.f244052f;
            C83368m1.C83374d dVar = this.f244050d;
            weAppPluginAutoUpdateStruct.f236613d = weAppPluginAutoUpdateStruct.mo86045b("AppId", qualitySession.f245833e, true);
            weAppPluginAutoUpdateStruct.f236614e = (long) qualitySession.f245837i;
            int i = qualitySession.f245834f;
            weAppPluginAutoUpdateStruct.f236615f = i != 1 ? i != 2 ? i != 3 ? null : WeAppPluginAutoUpdateStruct.C80753a.demo : WeAppPluginAutoUpdateStruct.C80753a.debug : WeAppPluginAutoUpdateStruct.C80753a.release;
            weAppPluginAutoUpdateStruct.f236616g = (long) qualitySession.f245835g;
            weAppPluginAutoUpdateStruct.f236617h = weAppPluginAutoUpdateStruct.mo86045b("PluginAppid", dVar.f243616d, true);
            weAppPluginAutoUpdateStruct.f236618i = WeAppPluginAutoUpdateStruct.C80754b.release;
            weAppPluginAutoUpdateStruct.f236619j = weAppPluginAutoUpdateStruct.mo86045b("networkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
            weAppPluginAutoUpdateStruct.f236620k = weAppPluginAutoUpdateStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
            weAppPluginAutoUpdateStruct.f236621l = (long) qualitySession.f245836h;
            C83368m1.C83370b bVar = C83368m1.f243597a;
            C83368m1.C83374d dVar2 = this.f244050d;
            String str = dVar2.f243616d;
            String str2 = dVar2.f243617e;
            int i2 = dVar2.f243618f;
            int i3 = dVar2.f243619g;
            C83368m1.C83381g.C83383b bVar2 = (C83368m1.C83381g.C83383b) dVar2.f243620h;
            C83368m1.C83370b.m102315a(bVar, new C83368m1.C83374d(str, str2, i2, i3, new C83368m1.C83381g.C83383b(bVar2.f243631a, true, bVar2.f243633c), false), new C83288a2(this.f244053g, this.f244050d, this.f244054h, weAppPluginAutoUpdateStruct), new C83292b2(this.f244053g, this.f244050d, weAppPluginAutoUpdateStruct), (C32226l) null, (C83397o1) null, 0, this.f244051e, (C83368m1.C83373c) null, (Executor) null, JsApiAddDownloadTaskStraight.CTRL_INDEX, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.z1$c */
    public static final class C83530c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C83368m1.C83374d f244055a;

        /* renamed from: b */
        public final /* synthetic */ C83368m1.C83377e f244056b;

        public C83530c(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
            this.f244055a = dVar;
            this.f244056b = eVar;
        }

        public Object call(Object obj) {
            String str;
            String str2;
            Void voidR = (Void) obj;
            String str3 = this.f244055a.f243616d;
            String a = C81273j1.m99631a(ModulePkgInfo.PLUGIN_CODE);
            if (Util.isNullOrNil((String) null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                if (Util.isNullOrNil(a)) {
                    str2 = "";
                } else {
                    str2 = '$' + a;
                }
                sb.append(str2);
                str = sb.toString();
            } else {
                str = null;
            }
            C29293q1.m38615b(str, this.f244056b.f243626a.pkgVersion());
            return null;
        }
    }

    public C83527z1(boolean z, QualitySession qualitySession, C90422jy jyVar, C32226l<? super C83368m1.C83374d, C13598b0> lVar) {
        this.f244043c = z;
        this.f244044d = qualitySession;
        this.f244045e = jyVar;
        this.f244046f = lVar;
    }

    /* renamed from: a */
    public void mo115597a(C83368m1.C83374d dVar, int i, String str) {
        C87412m.m108594g(dVar, "request");
        this.f244046f.invoke(dVar);
        if (C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            C83368m1.C83381g gVar = dVar.f243620h;
            if (gVar instanceof C83368m1.C83381g.C83384c) {
                int a = gVar.mo115647a();
                C81161g2.requireAccountInitializedOnDemand();
                int[] y = C81161g2.f238471g.mo113543y(dVar.mo115637a().toString());
                if (y == null) {
                    mo115817i();
                    mo115816h(2, dVar.f243616d, a);
                    mo115818j(dVar.f243618f);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int length = y.length;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    int i3 = y[i2];
                    if (i3 != dVar.f243620h.mo115647a()) {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                    i2++;
                }
                if (!arrayList.isEmpty()) {
                    mo115817i();
                    mo115816h(4, dVar.f243616d, a);
                    mo115818j(dVar.f243618f);
                    return;
                }
                return;
            }
            mo115817i();
            mo115816h(2, dVar.f243616d, 0);
            mo115818j(dVar.f243618f);
        } else if (C110823p.m151008x(C89286a.f257212a, dVar.f243618f)) {
            mo115817i();
            mo115818j(dVar.f243618f);
        }
    }

    /* renamed from: b */
    public void mo115536b() {
        CopyOnWriteArrayList<C83528a> copyOnWriteArrayList;
        Log.m105925i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "onAllPkgDownloaded isLaunch:%b", Boolean.valueOf(this.f244043c));
        if (this.f244042b && this.f244043c && (copyOnWriteArrayList = this.f244041a) != null && copyOnWriteArrayList.size() > 0) {
            Log.m105925i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "mStageList size:%d", Integer.valueOf(this.f244041a.size()));
            Iterator<C83528a> it = this.f244041a.iterator();
            while (it.hasNext()) {
                C83528a next = it.next();
                WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct = new WeAppQualitySplitCodeLibStatisStruct();
                mo115803f(weAppQualitySplitCodeLibStatisStruct, this.f244044d);
                weAppQualitySplitCodeLibStatisStruct.f237130k = weAppQualitySplitCodeLibStatisStruct.mo86045b("networkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
                weAppQualitySplitCodeLibStatisStruct.f237127h = weAppQualitySplitCodeLibStatisStruct.mo86045b("Provider", next.f244048b, true);
                weAppQualitySplitCodeLibStatisStruct.f237128i = (long) next.f244049c;
                weAppQualitySplitCodeLibStatisStruct.f237129j = (long) next.f244047a;
                weAppQualitySplitCodeLibStatisStruct.mo86054n();
            }
        }
    }

    /* renamed from: c */
    public void mo115537c(C83368m1.C83374d dVar) {
        C87412m.m108594g(dVar, "request");
        int i = dVar.f243618f;
        if (i == 0) {
            mo115819k(12);
        } else if (i == 4) {
            mo115819k(14);
        } else if (i == 6) {
            mo115819k(1);
        } else if (i == 12) {
            mo115819k(3);
        } else if (i == 13) {
            mo115819k(5);
        } else if (i == 22) {
            mo115819k(8);
        } else if (i == 23) {
            mo115819k(10);
        }
    }

    /* renamed from: d */
    public void mo115598d(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(eVar, "response");
        C83368m1.C83381g gVar = dVar.f243620h;
        if ((gVar instanceof C83368m1.C83381g.C83383b) && !((C83368m1.C83381g.C83383b) gVar).f243632b && C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            Log.m105924i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "onPkgCached, will update plugin(" + dVar.f243616d + ") to latest in background...");
            C61926c.m72656A((String) null, new C83529b(dVar, this.f244045e, this.f244044d, this, eVar));
        }
        if (C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            mo115816h(3, dVar.f243616d, eVar.f243626a.pkgVersion());
            C89060f.m111322a().mo123060U(new C83530c(dVar, eVar)).mo123058O();
        }
        mo115804g(this.f244044d, dVar, eVar);
    }

    /* renamed from: e */
    public void mo115599e(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(eVar, "response");
        if (C110823p.m151008x(C89286a.f257214c, dVar.f243618f)) {
            C29293q1.m38615b(dVar.f243616d, eVar.f243626a.pkgVersion());
        }
    }

    /* renamed from: h */
    public final void mo115816h(int i, String str, int i2) {
        Log.m105925i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "addPluginStage stage:%d,provider:%s,version:%d", Integer.valueOf(i), str, Integer.valueOf(i2));
        C83528a aVar = new C83528a(this);
        C87412m.m108594g(str, "<set-?>");
        aVar.f244048b = str;
        aVar.f244047a = i;
        aVar.f244049c = i2;
        this.f244041a.add(aVar);
    }

    /* renamed from: i */
    public final void mo115817i() {
        if (!this.f244042b) {
            this.f244042b = true;
            mo115816h(1, "", 0);
        }
    }

    /* renamed from: j */
    public final void mo115818j(int i) {
        if (i == 0) {
            mo115819k(11);
        } else if (i == 4) {
            mo115819k(13);
        } else if (i == 6) {
            mo115819k(0);
        } else if (i == 12) {
            mo115819k(2);
        } else if (i == 13) {
            mo115819k(4);
        } else if (i == 22) {
            mo115819k(7);
        } else if (i == 23) {
            mo115819k(9);
        }
    }

    /* renamed from: k */
    public final void mo115819k(int i) {
        C115669n.INSTANCE.idkeyStat(1027, (long) i, 1, false);
    }
}
