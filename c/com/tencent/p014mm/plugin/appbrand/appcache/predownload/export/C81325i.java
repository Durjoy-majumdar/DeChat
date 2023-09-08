package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import bp3.C28361q;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81244g0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.launching.C29565c4;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import hp3.C87581a;
import java.util.concurrent.Executor;
import kr0.C33983a1;
import lp3.C88631d;
import lp3.C88643g;
import nr3.C89060f;
import ob0.C89144l0;
import rx3.C13598b0;
import te3.C90422jy;
import wi0.C38163u;

@C86522b(creator = C29255b.class, dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.i */
public final class C81325i extends C86301e implements C33983a1 {

    /* renamed from: d */
    public static final C29255b f238776d = new C29255b();

    /* renamed from: e */
    public static final C81326a f238777e = new C81326a();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.i$b */
    public static final class C29255b {
        /* renamed from: a */
        public final C81325i mo56557a() {
            C81325i iVar = (C81325i) C81325i.f238777e.get();
            if (iVar != null) {
                return iVar;
            }
            if (!C86709a0.m107523b().f251765p) {
                throw new C86484b();
            }
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.i$e */
    public static final class C29256e<T> implements C88631d.C88632b {

        /* renamed from: a */
        public static final C29256e<T> f79937a = new C29256e<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1772a(Object obj) {
            C13598b0 b0Var = (C13598b0) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.i$a */
    public static final class C81326a extends C28361q<C81325i> {
        public Object create() {
            return new C81325i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.i$c */
    public static final class C81327c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ int f238778a;

        /* renamed from: b */
        public final /* synthetic */ String f238779b;

        /* renamed from: c */
        public final /* synthetic */ C33983a1.C33984a f238780c;

        public C81327c(int i, String str, C33983a1.C33984a aVar) {
            this.f238778a = i;
            this.f238779b = str;
            this.f238780c = aVar;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            boolean z = true;
            if (this.f238778a == 2) {
                C89144l0.m111429e(C29565c4.m38808a(this.f238779b, (String) null, (String) null), new C81329j(this.f238780c, C88643g.m110545c(), this.f238779b, this.f238778a), true);
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.i$d */
    public static final class C81328d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f238781a;

        /* renamed from: b */
        public final /* synthetic */ int f238782b;

        /* renamed from: c */
        public final /* synthetic */ C33983a1.C33985b f238783c;

        /* renamed from: d */
        public final /* synthetic */ C33983a1.C33984a f238784d;

        public C81328d(String str, int i, C33983a1.C33985b bVar, C33983a1.C33984a aVar) {
            this.f238781a = str;
            this.f238782b = i;
            this.f238783c = bVar;
            this.f238784d = aVar;
        }

        public Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            C83368m1.C83374d dVar = new C83368m1.C83374d(this.f238781a, "", 0, this.f238782b, new C83368m1.C83381g.C83383b(0, true, (String) null, 5, (C8480h) null), false);
            C83368m1.C83370b bVar = C83368m1.f243597a;
            C81330k kVar = new C81330k(this.f238781a, this.f238782b, dVar, this.f238783c);
            C29257l lVar = new C29257l(dVar, this.f238784d);
            C90422jy jyVar = new C90422jy();
            jyVar.f259641f = 1;
            C13598b0 b0Var = C13598b0.f38549a;
            C83368m1.C83370b.m102315a(bVar, dVar, kVar, lVar, (C32226l) null, (C83397o1) null, 0, jyVar, (C83368m1.C83373c) null, (Executor) null, JsApiAddDownloadTaskStraight.CTRL_INDEX, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public static final C81325i vx0() {
        return f238776d.mo56557a();
    }

    /* renamed from: Dh */
    public boolean mo56531Dh(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Log.m105924i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "deletePkgsForAppId(appId:" + str + ", versionType:" + i + "), stack:" + android.util.Log.getStackTraceString(new Throwable()));
        C81161g2.requireAccountInitializedOnDemand();
        C81258h3 h3Var = C81161g2.f238471g;
        if (h3Var == null) {
            return false;
        }
        int c = h3Var.mo113519c(str, i);
        Log.m105924i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "deletePkgsForAppId(appId:" + str + ", versionType:" + i + "), count:" + c);
        if (c <= 0) {
            return false;
        }
        AppBrandProcessesManager.f246131g.mo116962a().mo111408u(str, i, true);
        C81244g0.f238642a.mo113555k();
        return true;
    }

    /* renamed from: sv */
    public void mo56532sv(String str, String str2, int i) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C38163u.f100827a.mo61557a(str, str2, i);
            }
        }
    }

    /* renamed from: yv */
    public void mo56533yv(String str, int i, C33983a1.C33985b bVar, C33983a1.C33984a aVar) {
        if (!(str == null || str.length() == 0)) {
            C89060f.m111322a().mo123064p(new C81327c(i, str, aVar)).mo123064p(new C81328d(str, i, bVar, aVar)).mo114038a(C29256e.f79937a);
        } else if (aVar != null) {
            aVar.mo8657a(-1, "invalid appId");
        }
    }
}
