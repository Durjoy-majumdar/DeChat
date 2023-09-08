package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.C81234b4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81237c4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.C81293m3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81296n2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81300o2;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.plugin.appbrand.launching.C83484u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei0.C86518b;
import gy3.C87412m;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import rx3.C13598b0;
import te3.C90415hz1;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.q0 */
public final class C83442q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83397o1.C83398a f243828d;

    /* renamed from: e */
    public final /* synthetic */ C90415hz1[] f243829e;

    /* renamed from: f */
    public final /* synthetic */ C83484u0.C83485a f243830f;

    /* renamed from: g */
    public final /* synthetic */ C83484u0 f243831g;

    /* renamed from: h */
    public final /* synthetic */ String f243832h;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.q0$a */
    public static final class C83443a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C90415hz1[] f243833a;

        /* renamed from: b */
        public final /* synthetic */ C83397o1.C83398a f243834b;

        /* renamed from: c */
        public final /* synthetic */ C83484u0 f243835c;

        /* renamed from: d */
        public final /* synthetic */ int f243836d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0.C83485a f243837e;

        /* renamed from: f */
        public final /* synthetic */ C86518b.C86519a[] f243838f;

        public C83443a(C90415hz1[] hz1Arr, C83397o1.C83398a aVar, C83484u0 u0Var, int i, C83484u0.C83485a aVar2, C86518b.C86519a[] aVarArr) {
            this.f243833a = hz1Arr;
            this.f243834b = aVar;
            this.f243835c = u0Var;
            this.f243836d = i;
            this.f243837e = aVar2;
            this.f243838f = aVarArr;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C90415hz1 hz12 = this.f243833a[2];
            if (hz12 != null) {
                String str = hz12.f259558e;
                if (!(str == null || str.length() == 0)) {
                    C46888b c = C88643g.m110545c();
                    Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryPatch with " + this.f243834b);
                    String j1Var = this.f243835c.f243941i.toString();
                    int i = this.f243834b.f243673n;
                    int i2 = this.f243836d;
                    C90415hz1 hz13 = this.f243833a[2];
                    C87412m.m108591d(hz13);
                    String str2 = hz13.f259558e;
                    C90422jy jyVar = this.f243835c.f243936d;
                    C83403p0 p0Var = new C83403p0(this.f243837e, this.f243838f, this.f243833a, c);
                    C81300o2 o2Var = new C81300o2(j1Var, i, i2, str2, p0Var);
                    o2Var.f251361p = jyVar;
                    C81293m3.m99681g(o2Var, p0Var);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.q0$b */
    public static final class C83444b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C90415hz1[] f243839a;

        /* renamed from: b */
        public final /* synthetic */ C83397o1.C83398a f243840b;

        /* renamed from: c */
        public final /* synthetic */ C83484u0 f243841c;

        /* renamed from: d */
        public final /* synthetic */ int f243842d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0.C83485a f243843e;

        /* renamed from: f */
        public final /* synthetic */ C86518b.C86519a[] f243844f;

        public C83444b(C90415hz1[] hz1Arr, C83397o1.C83398a aVar, C83484u0 u0Var, int i, C83484u0.C83485a aVar2, C86518b.C86519a[] aVarArr) {
            this.f243839a = hz1Arr;
            this.f243840b = aVar;
            this.f243841c = u0Var;
            this.f243842d = i;
            this.f243843e = aVar2;
            this.f243844f = aVarArr;
        }

        public Object call(Object obj) {
            C13598b0 b0Var = (C13598b0) obj;
            C90415hz1 hz12 = this.f243839a[1];
            if (hz12 != null) {
                String str = hz12.f259558e;
                if (!(str == null || str.length() == 0)) {
                    C46888b c = C88643g.m110545c();
                    Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryZstd with " + this.f243840b);
                    C90415hz1 hz13 = this.f243839a[1];
                    C87412m.m108591d(hz13);
                    String str2 = hz13.f259558e;
                    String j1Var = this.f243841c.f243941i.toString();
                    int i = this.f243842d;
                    int i2 = this.f243840b.f243669g;
                    C90422jy jyVar = this.f243841c.f243936d;
                    C83451r0 r0Var = new C83451r0(this.f243843e, this.f243844f, this.f243839a, c);
                    int i3 = C81237c4.f238632a;
                    C81234b4 b4Var = new C81234b4(str2, j1Var, i, i2, r0Var);
                    b4Var.f251361p = jyVar;
                    C81293m3.m99681g(b4Var, r0Var);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.q0$c */
    public static final class C83445c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C90415hz1[] f243845a;

        /* renamed from: b */
        public final /* synthetic */ C83484u0 f243846b;

        /* renamed from: c */
        public final /* synthetic */ C83397o1.C83398a f243847c;

        /* renamed from: d */
        public final /* synthetic */ int f243848d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0.C83485a f243849e;

        /* renamed from: f */
        public final /* synthetic */ String f243850f;

        public C83445c(C90415hz1[] hz1Arr, C83484u0 u0Var, C83397o1.C83398a aVar, int i, C83484u0.C83485a aVar2, String str) {
            this.f243845a = hz1Arr;
            this.f243846b = u0Var;
            this.f243847c = aVar;
            this.f243848d = i;
            this.f243849e = aVar2;
            this.f243850f = str;
        }

        public Object call(Object obj) {
            C13598b0 b0Var = (C13598b0) obj;
            boolean z = false;
            C90415hz1 hz12 = this.f243845a[0];
            C87412m.m108591d(hz12);
            String str = hz12.f259558e;
            if (str == null || str.length() == 0) {
                C90415hz1 hz13 = this.f243845a[0];
                C87412m.m108591d(hz13);
                int i = hz13.f259557d;
                if (i == -2000011 || i == -2000004) {
                    ((C83484u0.C83488d) this.f243846b.f243939g).invoke(C83368m1.C83369a.CGI_GET_URL_FAILED_EXPIRED_VERSION, String.valueOf(i));
                    return C13598b0.f38549a;
                }
                ((C83484u0.C83488d) this.f243846b.f243939g).invoke(C83368m1.C83369a.CGI_GET_URL_FAILED_EMPTY_URL, "invalid url");
                return C13598b0.f38549a;
            }
            Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.fallbackLegacy with " + this.f243847c);
            C83464t0 t0Var = new C83464t0(this.f243849e, this.f243845a);
            if (C81289m.C81290a.m99663a(this.f243847c.f243669g)) {
                String j1Var = this.f243846b.f243941i.toString();
                C83397o1.C83398a aVar = this.f243847c;
                int i2 = aVar.f243669g;
                String str2 = aVar.f243671i;
                C90415hz1 hz14 = this.f243845a[0];
                C87412m.m108591d(hz14);
                String str3 = hz14.f259558e;
                C83458s0 s0Var = new C83458s0(this.f243850f);
                if (C81293m3.m99678d() == null) {
                    Log.m105920e("MicroMsg.WxaPkgUpdater", "startDownloadDebugPkg with keyGen, get null updater instance!!!");
                } else {
                    z = C81293m3.m99681g(new C81296n2(j1Var, i2, str2, str3, s0Var), t0Var);
                }
            } else {
                String j1Var2 = this.f243846b.f243941i.toString();
                int i3 = this.f243847c.f243669g;
                int i4 = this.f243848d;
                C90415hz1 hz15 = this.f243845a[0];
                C87412m.m108591d(hz15);
                z = C81293m3.m99682h(j1Var2, i3, i4, 0, hz15.f259558e, this.f243846b.f243936d, t0Var);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.q0$d */
    public static final class C83446d<T> implements C88631d.C88632b {

        /* renamed from: a */
        public static final C83446d<T> f243851a = new C83446d<>();

        /* renamed from: a */
        public final void mo1772a(Object obj) {
        }
    }

    public C83442q0(C83397o1.C83398a aVar, C90415hz1[] hz1Arr, C83484u0.C83485a aVar2, C83484u0 u0Var, String str) {
        this.f243828d = aVar;
        this.f243829e = hz1Arr;
        this.f243830f = aVar2;
        this.f243831g = u0Var;
        this.f243832h = str;
    }

    public final void run() {
        int i;
        C90415hz1 hz12;
        if (!C81289m.C81290a.m99664b(this.f243828d.f243669g) || !this.f243828d.f243674o) {
            i = this.f243828d.f243670h;
        } else {
            C90415hz1[] hz1Arr = this.f243829e;
            int length = hz1Arr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hz12 = null;
                    break;
                }
                hz12 = hz1Arr[i2];
                if ((hz12 != null ? hz12.f259561h : 0) > 0) {
                    break;
                }
                i2++;
            }
            if (hz12 != null) {
                i = hz12.f259561h;
            } else {
                C83397o1.C83398a aVar = this.f243828d;
                C83484u0 u0Var = this.f243831g;
                Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.start, get invalid app_version using needLatestVersion, request=" + aVar);
                ((C83484u0.C83488d) u0Var.f243939g).invoke(C83368m1.C83369a.FAILED, "invalid cgi response");
                return;
            }
        }
        int i3 = i;
        C86518b.C86519a[] aVarArr = {C86518b.C86519a.OK, C86518b.C86519a.ENV_ERR, C86518b.C86519a.DISK_FULL};
        ((C88633e) C88643g.m110546d()).mo123061d(new C83443a(this.f243829e, this.f243828d, this.f243831g, i3, this.f243830f, aVarArr)).mo123061d(new C83444b(this.f243829e, this.f243828d, this.f243831g, i3, this.f243830f, aVarArr)).mo123061d(new C83445c(this.f243829e, this.f243831g, this.f243828d, i3, this.f243830f, this.f243832h)).mo114038a(C83446d.f243851a);
    }
}
