package q73;

import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.HashSet;
import java.util.LinkedList;
import kj2.C117407d;
import kr0.C33983a1;
import kr0.C33987b1;
import kr0.C88262c1;
import qe3.C89625d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: q73.s */
public final class C35812s {

    /* renamed from: a */
    public static final C35812s f95615a = new C35812s();

    /* renamed from: b */
    public static final C13601g f95616b = C36568h.m40985a(C35813b.f95624d);

    /* renamed from: c */
    public static final C13601g f95617c = C36568h.m40985a(C12151a.f35257d);

    /* renamed from: d */
    public static final C13601g f95618d = C36568h.m40985a(C35814c.f95625d);

    /* renamed from: e */
    public static final boolean f95619e = true;

    /* renamed from: f */
    public static final C13601g f95620f = C36568h.m40985a(C12153e.f35259d);

    /* renamed from: g */
    public static final C13601g f95621g = C36568h.m40985a(C12152d.f35258d);

    /* renamed from: h */
    public static long f95622h;

    /* renamed from: i */
    public static final HashSet<String> f95623i = new HashSet<>();

    /* renamed from: q73.s$a */
    public static final class C12151a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C12151a f35257d = new C12151a();

        public C12151a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("WebCanvasStorage");
        }
    }

    /* renamed from: q73.s$d */
    public static final class C12152d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C12152d f35258d = new C12152d();

        public C12152d() {
            super(0);
        }

        public Object invoke() {
            Long valueOf = Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_open_biz_trigger_download_pkg_interval_v2, 3600000));
            long longValue = valueOf.longValue();
            Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "download pkg interval " + longValue);
            return valueOf;
        }
    }

    /* renamed from: q73.s$e */
    public static final class C12153e extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C12153e f35259d = new C12153e();

        public C12153e() {
            super(0);
        }

        public Object invoke() {
            Long valueOf = Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_open_biz_trigger_download_pkg_on_get_data_interval_2, 86400000));
            long longValue = valueOf.longValue();
            Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "download pkg on get data interval " + longValue);
            return valueOf;
        }
    }

    /* renamed from: q73.s$b */
    public static final class C35813b extends C87413o implements C32224a<LinkedList<String>> {

        /* renamed from: d */
        public static final C35813b f95624d = new C35813b();

        public C35813b() {
            super(0);
        }

        public Object invoke() {
            LinkedList linkedList = new LinkedList();
            linkedList.add("wxfedb0854e2b1820d");
            linkedList.add("wxf337cbaa27790d8e");
            linkedList.add("wx97b7aebac2183fd2");
            linkedList.add("wxa06c02b5c00ff39b");
            return linkedList;
        }
    }

    /* renamed from: q73.s$c */
    public static final class C35814c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C35814c f95625d = new C35814c();

        public C35814c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C35796c0.f95588a.mo60408j());
        }
    }

    /* renamed from: h */
    public static void m40851h(C35812s sVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        sVar.getClass();
        C87412m.m108594g(str, "appId");
        ((C88262c1) C86312j.m106911c(C88262c1.class)).e60((String) null, str, i);
    }

    /* renamed from: a */
    public final C29315z2 mo60420a(String str, int i) {
        C87412m.m108594g(str, "appId");
        try {
            C29315z2 Yh = ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59392Yh(str, i, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("getPkgInfo appId=");
            sb.append(str);
            sb.append(", pkgType=");
            sb.append(i);
            sb.append(", md5=");
            sb.append(Yh != null ? Yh.field_versionMd5 : null);
            sb.append(" download version= ");
            sb.append(Yh != null ? Integer.valueOf(Yh.field_version) : null);
            sb.append(" path=");
            sb.append(Yh != null ? Yh.field_pkgPath : null);
            Log.m105924i("MicroMsg.WebCanvasPackageDownManager", sb.toString());
            return Yh;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.WebCanvasPackageDownManager", "getPkgInfo ex " + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final String mo60421b(String str) {
        C87412m.m108594g(str, "appId");
        boolean z = true;
        if (mo60422c() != 1) {
            z = false;
        }
        if (z) {
            C29315z2 a = mo60420a(str, 2);
            if (a != null) {
                return a.field_pkgPath;
            }
            return null;
        } else if (Util.isNullOrNil(str)) {
            return null;
        } else {
            C29315z2 a2 = mo60420a(str, 0);
            if (a2 == null) {
                Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "geReleasePkgPath pkgInfo is null");
                return null;
            } else if (!C86013q1.m106450k(a2.field_pkgPath)) {
                Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "geReleasePkgPath pkgInfo " + a2.field_pkgPath + " not exist");
                return null;
            } else {
                ((MultiProcessMMKV) ((C36570n) f95617c).getValue()).encode("LastUseVersion_" + str, a2.field_version);
                mo60425f(str, a2.field_version);
                return a2.field_pkgPath;
            }
        }
    }

    /* renamed from: c */
    public final int mo60422c() {
        return ((Number) ((C36570n) f95618d).getValue()).intValue();
    }

    /* renamed from: d */
    public final boolean mo60423d(String str, C40427l0 l0Var, C40427l0 l0Var2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(l0Var, "bizPkg");
        C87412m.m108594g(l0Var2, "wxaPkg");
        try {
            int optInt = new C104289g(C81291m0.m99666b(l0Var, "/meta.json")).optInt("minAndroidBasePkgVersion");
            int c = C44404a.m48766c(l0Var2);
            Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "isWxaPkgSupport appId=" + str + " minBasePkgVersion=" + optInt + ", wxaPkgVersionn=" + c);
            if (optInt <= c) {
                return true;
            }
            Log.m105928w("MicroMsg.WebCanvasPackageDownManager", "isWxaPkgSupport minBasePkgVersion check fail");
            C117407d.INSTANCE.mo182089r(1454, 59, 1);
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebCanvasPackageDownManager", "isWxaPkgSupport ex " + e.getMessage());
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo60424e(C40427l0 l0Var, String str) {
        C87412m.m108594g(l0Var, "pkg");
        C87412m.m108594g(str, "appId");
        try {
            int optInt = new C104289g(C81291m0.m99666b(l0Var, "/meta.json")).optInt("minAndroidClientVersion");
            int c = C44404a.m48766c(l0Var);
            Log.m105925i("MicroMsg.WebCanvasPackageDownManager", "isWxaPkgValid appId=" + str + ", minClientVersion=0x%x, localClientVersion=0x%x", Integer.valueOf(optInt), Integer.valueOf(C89625d.f257841g));
            if (optInt <= C89625d.f257841g) {
                C115669n.INSTANCE.mo160131h(20780, str, 0, Integer.valueOf(c), 0, 0, 1);
                return true;
            }
            C115669n.INSTANCE.mo160131h(20780, str, 0, Integer.valueOf(c), 1, 0, 1);
            Log.m105928w("MicroMsg.WebCanvasPackageDownManager", "isWxaPkgValid minClientVersion check fail");
            if (C87412m.m108589b(str, "wxfedb0854e2b1820d")) {
                C117407d.INSTANCE.mo182089r(1454, 43, 1);
            } else if (C87412m.m108589b(str, "wx97b7aebac2183fd2")) {
                C117407d.INSTANCE.mo182089r(1454, 50, 1);
            }
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebCanvasPackageDownManager", "isWxaPkgValid ex " + e.getMessage());
        }
    }

    /* renamed from: f */
    public final void mo60425f(String str, int i) {
        C87412m.m108594g(str, "appId");
        String str2 = str + '-' + i;
        HashSet<String> hashSet = f95623i;
        if (!hashSet.contains(str2)) {
            Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "setPkgIsOccupied start");
            C33987b1 b1Var = (C33987b1) C86312j.m106911c(C33987b1.class);
            if (b1Var != null) {
                b1Var.mo59394hF(str, i);
                C13598b0 b0Var = C13598b0.f38549a;
                hashSet.add(str2);
                Log.m105924i("MicroMsg.WebCanvasPackageDownManager", "setPkgIsOccupied appId = " + str + " version=" + i);
            }
        }
    }

    /* renamed from: g */
    public final void mo60426g() {
        Class cls = C33983a1.class;
        if (System.currentTimeMillis() - f95622h >= ((Number) ((C36570n) f95621g).getValue()).longValue()) {
            f95622h = System.currentTimeMillis();
            if (f95619e) {
                C117407d.INSTANCE.mo182089r(1454, 40, 1);
                m40851h(this, "wxfedb0854e2b1820d", 0, 2, (Object) null);
                m40851h(this, "wxf337cbaa27790d8e", 0, 2, (Object) null);
                m40851h(this, "wxa06c02b5c00ff39b", 0, 2, (Object) null);
                C35796c0.f95588a.mo60413o();
                if (mo60422c() == 1) {
                    ((C33983a1) C86312j.m106911c(cls)).mo56533yv("wxfedb0854e2b1820d", 2, new C35810p("wxfedb0854e2b1820d"), new C12150q("wxfedb0854e2b1820d"));
                    ((C33983a1) C86312j.m106911c(cls)).mo56533yv("wxf337cbaa27790d8e", 2, new C35810p("wxf337cbaa27790d8e"), new C12150q("wxf337cbaa27790d8e"));
                }
            }
        }
    }
}
