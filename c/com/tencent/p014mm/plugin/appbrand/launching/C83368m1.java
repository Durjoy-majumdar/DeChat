package com.tencent.p014mm.plugin.appbrand.launching;

import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.utils.C84741h;
import com.tencent.p014mm.plugin.appbrand.utils.C84774n2;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import js0.C88021l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C90422jy;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.m1 */
public interface C83368m1 {

    /* renamed from: a */
    public static final C83370b f243597a = C83370b.f243608a;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$a */
    public enum C83369a {
        FAILED(101),
        PKG_RECORD_NULL(111),
        CGI_GET_URL_FAILED_EXPIRED_VERSION(114),
        CGI_GET_URL_FAILED_NETWORK(115),
        CGI_GET_URL_FAILED_EMPTY_URL(116),
        CGI_GET_URL_FAILED_SERVER_ERROR(117),
        CGI_GET_URL_FAILED_TIMEOUT(118),
        ENV_ERR(120);
        

        /* renamed from: d */
        public final int f243607d;

        /* access modifiers changed from: public */
        C83369a(int i) {
            this.f243607d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$b */
    public static final class C83370b {

        /* renamed from: a */
        public static final /* synthetic */ C83370b f243608a = new C83370b();

        /* renamed from: b */
        public static final ConcurrentHashMap<C83374d, Boolean> f243609b = new ConcurrentHashMap<>();

        /* renamed from: c */
        public static final C88021l<C83374d, C32226l<C83377e, C13598b0>> f243610c = new C88021l<>();

        /* renamed from: d */
        public static final C88021l<C83374d, C32227p<C83369a, String, C13598b0>> f243611d = new C88021l<>();

        /* renamed from: e */
        public static final C88021l<C83374d, C32226l<WxaPkgLoadProgress, C13598b0>> f243612e = new C88021l<>();

        /* renamed from: f */
        public static final ConcurrentHashMap<C32228q<C83374d, C83377e, C90422jy, C13598b0>, Boolean> f243613f = new ConcurrentHashMap<>();

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$b$a */
        public static final class C83371a implements Executor {

            /* renamed from: d */
            public static final C83371a f243614d = new C83371a();

            public final void execute(Runnable runnable) {
                C87412m.m108591d(runnable);
                String str = null;
                C84774n2 n2Var = runnable instanceof C84774n2 ? (C84774n2) runnable : null;
                if (n2Var != null) {
                    str = n2Var.mo117460a();
                }
                if (str == null || str.length() == 0) {
                    ((C119157j) C119157j.f356862d).mo183875f(runnable);
                } else {
                    ((C119157j) C119157j.f356862d).mo183876g(runnable, str);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$b$b */
        public static final class C83372b extends C87413o implements C32226l<WxaPkgLoadProgress, C13598b0> {

            /* renamed from: d */
            public static final C83372b f243615d = new C83372b();

            public C83372b() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((WxaPkgLoadProgress) obj, LocaleUtil.ITALIAN);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public static void m102315a(C83370b bVar, C83374d dVar, C32226l lVar, C32227p pVar, C32226l lVar2, C83397o1 o1Var, int i, C90422jy jyVar, C83373c cVar, Executor executor, int i2, Object obj) {
            C83374d dVar2 = dVar;
            C32226l lVar3 = lVar;
            C32227p pVar2 = pVar;
            int i3 = i2;
            C83372b bVar2 = (i3 & 8) != 0 ? C83372b.f243615d : lVar2;
            C83344j1 j1Var = (i3 & 16) != 0 ? C83344j1.f243546a : o1Var;
            Executor executor2 = null;
            C83373c cVar2 = (i3 & 128) != 0 ? null : cVar;
            if ((i3 & 256) == 0) {
                executor2 = executor;
            }
            bVar.getClass();
            C87412m.m108594g(dVar, "request");
            C87412m.m108594g(lVar, "onSuccess");
            C87412m.m108594g(pVar2, "onError");
            C87412m.m108594g(bVar2, "onProgress");
            C87412m.m108594g(j1Var, "cgiExecutor");
            C87412m.m108594g(jyVar, "cgiCommRequestSource");
            ConcurrentHashMap<C83374d, Boolean> concurrentHashMap = f243609b;
            if (concurrentHashMap.containsKey(dVar)) {
                C81161g2.vx0().getClass();
                C81161g2.requireAccountInitializedOnDemand();
                Log.m105924i("MicroMsg.AppBrand.ICommonPkgFetcher", "waitForPkg already executing, add pending callbacks, request(" + dVar + ')');
                f243610c.mo122464e(dVar, lVar);
                f243611d.mo122464e(dVar, pVar2);
                f243612e.mo122464e(dVar, bVar2);
                return;
            }
            concurrentHashMap.put(dVar, Boolean.TRUE);
            Log.m105924i("MicroMsg.AppBrand.ICommonPkgFetcher", "waitForPkg enqueue request(" + dVar + ')');
            if (executor2 == null) {
                executor2 = C83371a.f243614d;
            }
            executor2.execute(new C84741h(new C83391n1(dVar, lVar, pVar, bVar2, j1Var, jyVar, cVar2), (String) ((C36570n) dVar2.f243623n).getValue()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$c */
    public interface C83373c {
        /* renamed from: a */
        void mo115597a(C83374d dVar, int i, String str);

        /* renamed from: d */
        void mo115598d(C83374d dVar, C83377e eVar);

        /* renamed from: e */
        void mo115599e(C83374d dVar, C83377e eVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$d */
    public static final class C83374d implements Comparable<C83374d> {

        /* renamed from: d */
        public final String f243616d;

        /* renamed from: e */
        public final String f243617e;

        /* renamed from: f */
        public final int f243618f;

        /* renamed from: g */
        public final int f243619g;

        /* renamed from: h */
        public final C83381g f243620h;

        /* renamed from: i */
        public final boolean f243621i;

        /* renamed from: j */
        public final C13601g f243622j = C36568h.m40985a(new C83375a(this));

        /* renamed from: n */
        public final C13601g f243623n = C36568h.m40985a(new C83376b(this));

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$d$a */
        public static final class C83375a extends C87413o implements C32224a<C81273j1> {

            /* renamed from: d */
            public final /* synthetic */ C83374d f243624d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C83375a(C83374d dVar) {
                super(0);
                this.f243624d = dVar;
            }

            public Object invoke() {
                C83374d dVar = this.f243624d;
                return new C81273j1(dVar.f243616d, dVar.f243617e, dVar.f243618f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$d$b */
        public static final class C83376b extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ C83374d f243625d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C83376b(C83374d dVar) {
                super(0);
                this.f243625d = dVar;
            }

            public Object invoke() {
                return this.f243625d.mo115637a().toString() + "|ver:" + this.f243625d.f243620h;
            }
        }

        public C83374d(String str, String str2, int i, int i2, C83381g gVar, boolean z) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(gVar, ProviderConstants.API_COLNAME_FEATURE_VERSION);
            this.f243616d = str;
            this.f243617e = str2;
            this.f243618f = i;
            this.f243619g = i2;
            this.f243620h = gVar;
            this.f243621i = z;
        }

        /* renamed from: a */
        public final C81273j1 mo115637a() {
            return (C81273j1) ((C36570n) this.f243622j).getValue();
        }

        public int compareTo(Object obj) {
            C83374d dVar = (C83374d) obj;
            C87412m.m108594g(dVar, "other");
            return toString().compareTo(dVar.toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C87412m.m108589b(C83374d.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.ICommonPkgFetcher.Request");
            return C87412m.m108589b(toString(), ((C83374d) obj).toString());
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Request{ appId=");
            sb.append(this.f243616d);
            sb.append(", module_name=");
            String str = this.f243617e;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(", package_type=");
            sb.append(this.f243618f);
            sb.append(", version_type=");
            sb.append(this.f243619g);
            sb.append(" app_version=");
            sb.append(this.f243620h);
            sb.append(" forceNoEncrypt=");
            sb.append(this.f243621i);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$e */
    public static final class C83377e {

        /* renamed from: a */
        public final IPkgInfo f243626a;

        /* renamed from: b */
        public final C83378f f243627b;

        public C83377e(IPkgInfo iPkgInfo, C83378f fVar) {
            C87412m.m108594g(iPkgInfo, "pkgInfo");
            C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
            this.f243626a = iPkgInfo;
            this.f243627b = fVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C83377e)) {
                return false;
            }
            C83377e eVar = (C83377e) obj;
            return C87412m.m108589b(this.f243626a, eVar.f243626a) && C87412m.m108589b(this.f243627b, eVar.f243627b);
        }

        public int hashCode() {
            return (this.f243626a.hashCode() * 31) + this.f243627b.hashCode();
        }

        public String toString() {
            return "Response(pkgInfo=" + this.f243626a + ", source=" + this.f243627b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$f */
    public static abstract class C83378f {

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$f$b */
        public static final class C83380b extends C83378f {

            /* renamed from: a */
            public static final C83380b f243629a = new C83380b();

            public String toString() {
                return "REMOTE";
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$f$a */
        public static final class C83379a extends C83378f {

            /* renamed from: a */
            public final int f243628a;

            public C83379a(int i) {
                this.f243628a = i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CACHED(");
                int i = this.f243628a;
                sb.append(i != 0 ? i != 1 ? i != 2 ? "" : "SHARED_TEMPLATE" : "SHARED_MODULE" : "SELF");
                sb.append(')');
                return sb.toString();
            }

            public C83379a() {
                this(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$g */
    public static abstract class C83381g {

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$g$a */
        public static final class C83382a extends C83381g {

            /* renamed from: a */
            public final String f243630a;

            public C83382a(String str) {
                C87412m.m108594g(str, "desc");
                this.f243630a = str;
            }

            /* renamed from: a */
            public int mo115647a() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C83382a) && C87412m.m108589b(this.f243630a, ((C83382a) obj).f243630a);
            }

            public int hashCode() {
                return this.f243630a.hashCode();
            }

            public String toString() {
                return "DESC(" + this.f243630a + ')';
            }
        }

        /* renamed from: a */
        public int mo115647a() {
            return -1;
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$g$b */
        public static final class C83383b extends C83381g {

            /* renamed from: a */
            public final int f243631a;

            /* renamed from: b */
            public final boolean f243632b;

            /* renamed from: c */
            public final String f243633c;

            public C83383b() {
                this(0, false, (String) null, 7, (C8480h) null);
            }

            public C83383b(int i, boolean z, String str) {
                this.f243631a = i;
                this.f243632b = z;
                this.f243633c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C83383b)) {
                    return false;
                }
                C83383b bVar = (C83383b) obj;
                return this.f243631a == bVar.f243631a && this.f243632b == bVar.f243632b && C87412m.m108589b(this.f243633c, bVar.f243633c);
            }

            public int hashCode() {
                int i = this.f243631a * 31;
                boolean z = this.f243632b;
                if (z) {
                    z = true;
                }
                int i2 = (i + (z ? 1 : 0)) * 31;
                String str = this.f243633c;
                return i2 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("LATEST(");
                sb.append(this.f243631a);
                sb.append("|forceUpdate:");
                sb.append(this.f243632b);
                sb.append("|semver:");
                String str = this.f243633c;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                sb.append(')');
                return sb.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C83383b(int i, boolean z, String str, int i2, C8480h hVar) {
                this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.m1$g$c */
        public static final class C83384c extends C83381g {

            /* renamed from: a */
            public final int f243634a;

            /* renamed from: b */
            public final long f243635b;

            public C83384c(int i, long j) {
                this.f243634a = i;
                this.f243635b = j;
            }

            /* renamed from: a */
            public int mo115647a() {
                return this.f243634a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C83384c)) {
                    return false;
                }
                C83384c cVar = (C83384c) obj;
                return this.f243634a == cVar.f243634a && this.f243635b == cVar.f243635b;
            }

            public int hashCode() {
                long j = this.f243635b;
                return (this.f243634a * 31) + ((int) (j ^ (j >>> 32)));
            }

            public String toString() {
                StringBuilder sb;
                if (this.f243635b >= 0) {
                    sb.append("VERSION(");
                    sb.append(this.f243634a);
                    sb.append('|');
                    sb.append(this.f243635b);
                } else {
                    sb = new StringBuilder();
                    sb.append("VERSION(");
                    sb.append(this.f243634a);
                }
                sb.append(')');
                return sb.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C83384c(int i, long j, int i2, C8480h hVar) {
                this(i, (i2 & 2) != 0 ? -1 : j);
            }
        }
    }
}
