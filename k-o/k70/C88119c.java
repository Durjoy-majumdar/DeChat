package k70;

import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C90364q0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: k70.c */
public abstract class C88119c {

    /* renamed from: a */
    public static final C88121c f254874a = new C88121c((C8480h) null);

    /* renamed from: b */
    public static final C13601g<Boolean> f254875b = C36568h.m40985a(C9563b.f29790d);

    /* renamed from: c */
    public static final C13601g<HashSet<String>> f254876c = C36568h.m40985a(C88120a.f254878d);

    /* renamed from: d */
    public static final Map<String, String> f254877d = C90364q0.m113147f(new C13604l("wxe208ce76dfa39515", "7bc61fb8bcc2b5ff85e128a9050ede3c"), new C13604l("wx2f3fb5db9f226462", "172b23f023bd24ac46bcee33e31f2eb7"));

    /* renamed from: k70.c$b */
    public static final class C9563b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C9563b f29790d = new C9563b();

        public C9563b() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger());
        }
    }

    /* renamed from: k70.c$a */
    public static final class C88120a extends C87413o implements C32224a<HashSet<String>> {

        /* renamed from: d */
        public static final C88120a f254878d = new C88120a();

        public C88120a() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("jsapi");
            String str = File.separator;
            sb.append(str);
            sb.append("surface");
            String[] strArr = {sb.toString(), "jsapi" + str + "surface" + str + "app"};
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 2; i++) {
                String str2 = strArr[i];
                String[] list = MMApplicationContext.getContext().getAssets().list(str2);
                if (list != null) {
                    ArrayList arrayList = new ArrayList(list.length);
                    for (String str3 : list) {
                        arrayList.add(str2 + File.separator + str3);
                    }
                    C110818d0.m150949u0(arrayList, hashSet);
                }
            }
            return hashSet;
        }
    }

    /* renamed from: k70.c$c */
    public static final class C88121c {
        public C88121c(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo122514a(String str, String str2) {
            boolean z = true;
            int i = 0;
            if (!(str == null || C112551y.m153811k(str))) {
                if (str2 != null && !C112551y.m153811k(str2)) {
                    z = false;
                }
                if (!z) {
                    Object[] array = C112550d0.m153785U(str, new String[]{"\\."}, false, 0, 6, (Object) null).toArray(new String[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr = (String[]) array;
                    Object[] array2 = C112550d0.m153785U(str2, new String[]{"\\."}, false, 0, 6, (Object) null).toArray(new String[0]);
                    C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr2 = (String[]) array2;
                    int length = strArr.length;
                    int length2 = strArr2.length;
                    if (length > length2) {
                        length = length2;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        int length3 = strArr[i].length();
                        int length4 = strArr2[i].length();
                        C13598b0 b0Var = C13598b0.f38549a;
                        if (length3 - length4 != 0) {
                            i2 = length4;
                            break;
                        }
                        i2 = strArr[i].compareTo(strArr2[i]);
                        if (i2 != 0) {
                            break;
                        }
                        i++;
                    }
                    return i2 != 0 ? i2 : strArr.length - strArr2.length;
                }
            }
            Log.m105928w("MicroMsg.SurfaceApp.MultiWxaPkgSelector", "compareVersion error:illegal params, version1=" + str + ", version2=" + str2);
            return 0;
        }

        /* renamed from: b */
        public final C104289g mo122515b(C40427l0 l0Var) {
            C87412m.m108594g(l0Var, "<this>");
            String f = C81291m0.m99670f(l0Var, "/app-config.json");
            if (!(f.length() > 0)) {
                f = null;
            }
            if (f != null) {
                return new C104289g(f);
            }
            return null;
        }

        /* renamed from: c */
        public final String mo122516c(C40427l0 l0Var) {
            C87412m.m108594g(l0Var, "<this>");
            C104289g b = mo122515b(l0Var);
            String optString = b != null ? b.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION, "") : null;
            return optString == null ? "" : optString;
        }

        /* renamed from: d */
        public final String mo122517d(C40427l0 l0Var) {
            C87412m.m108594g(l0Var, "<this>");
            String optString = new C104289g(C81291m0.m99666b(l0Var, "/version.json")).optString(ProviderConstants.API_COLNAME_FEATURE_VERSION, "");
            return optString == null ? "" : optString;
        }
    }

    /* renamed from: k70.c$d */
    public static final class C88122d {

        /* renamed from: a */
        public final String f254879a;

        /* renamed from: b */
        public final String f254880b;

        /* renamed from: c */
        public final C40427l0 f254881c;

        public C88122d(String str, String str2, C40427l0 l0Var) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "path");
            C87412m.m108594g(l0Var, "pkg");
            this.f254879a = str;
            this.f254880b = str2;
            this.f254881c = l0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C88122d)) {
                return false;
            }
            C88122d dVar = (C88122d) obj;
            return C87412m.m108589b(this.f254879a, dVar.f254879a) && C87412m.m108589b(this.f254880b, dVar.f254880b) && C87412m.m108589b(this.f254881c, dVar.f254881c);
        }

        public int hashCode() {
            return (((this.f254879a.hashCode() * 31) + this.f254880b.hashCode()) * 31) + this.f254881c.hashCode();
        }

        public String toString() {
            return "Selector(appId=" + this.f254879a + ", path=" + this.f254880b + ", pkg=" + this.f254881c + ')';
        }
    }

    /* renamed from: a */
    public abstract String mo120821a(String str);

    /* renamed from: b */
    public abstract String mo120822b(String str, String str2);

    /* renamed from: c */
    public abstract C40427l0 mo120823c(String str);

    /* renamed from: d */
    public final C88122d mo122513d(String str) {
        C81410b0 b0Var = C81410b0.OK;
        C87412m.m108594g(str, "url");
        String a = mo120821a(str);
        C40427l0 c = mo120823c(a);
        if (c == null) {
            Log.m105920e("MicroMsg.SurfaceApp.MultiWxaPkgSelector", "pkg#" + a + " not found");
            return null;
        }
        String b = mo120822b(str, a);
        Log.m105924i("MicroMsg.SurfaceApp.MultiWxaPkgSelector", "select url:" + str + ",appId:" + a + ",path:" + b);
        C87412m.m108594g(b, "path");
        if ((c.openReadPartialInfo(b) != null ? b0Var : C81410b0.RET_NOT_EXISTS) == b0Var) {
            return new C88122d(a, b, c);
        }
        Log.m105920e("MicroMsg.SurfaceApp.MultiWxaPkgSelector", "pkg#" + a + " path:" + b + " not found");
        return null;
    }
}
