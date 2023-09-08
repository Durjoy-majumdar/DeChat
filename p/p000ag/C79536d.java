package p000ag;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import d42.C86186n;
import e42.C86434m;
import e42.C86437q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C64186f0;

/* renamed from: ag.d */
public final class C79536d implements C86186n {

    /* renamed from: a */
    public final C79535c f233187a = new C79535c();

    /* renamed from: b */
    public final C29315z2 f233188b;

    /* renamed from: c */
    public final C0038k f233189c;

    /* renamed from: d */
    public final C13601g f233190d;

    /* renamed from: ag.d$a */
    public static final class C79537a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C79536d f233191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79537a(C79536d dVar) {
            super(0);
            this.f233191d = dVar;
        }

        public Object invoke() {
            String str;
            C40427l0 b = this.f233191d.f233187a.mo109574b();
            if (b != null) {
                str = b.mo63190c();
                C87412m.m108593f(str, "pkg.pkgPath");
            } else {
                str = "";
            }
            return (!(str.length() > 0) || !C86013q1.m106450k(str)) ? "MagicPlayableService" : C86013q1.m106456q(str);
        }
    }

    public C79536d() {
        C27884e eVar = C27884e.f77039a;
        this.f233188b = eVar.mo55661b();
        String decodeString = eVar.mo55660a().decodeString("AppID", "");
        String decodeString2 = eVar.mo55660a().decodeString("ModuleName", "");
        int decodeInt = eVar.mo55660a().decodeInt("VersionType", 0);
        C87412m.m108593f(decodeString, "appId");
        C87412m.m108593f(decodeString2, "moduleName");
        this.f233189c = new C0038k(decodeString, decodeInt, decodeString2);
        this.f233190d = C36568h.m40985a(new C79537a(this));
    }

    /* renamed from: a */
    public C81415h0 mo109577a() {
        return this.f233187a;
    }

    /* renamed from: b */
    public String mo109578b() {
        StringBuilder sb = new StringBuilder();
        sb.append("providePackageMD5 md5:");
        Object value = ((C36570n) this.f233190d).getValue();
        C87412m.m108593f(value, "<get-pkgMd5>(...)");
        sb.append((String) value);
        Log.m105924i("MagicPlayablePkgManagement", sb.toString());
        Object value2 = ((C36570n) this.f233190d).getValue();
        C87412m.m108593f(value2, "<get-pkgMd5>(...)");
        return (String) value2;
    }

    /* renamed from: c */
    public String mo109579c() {
        C29315z2 z2Var = this.f233188b;
        String str = z2Var != null ? z2Var.field_appId : null;
        if (str == null) {
            str = "MagicPlayableService";
        }
        Log.m105924i("MagicPlayablePkgManagement", "provideAppId appId:" + str);
        return str;
    }

    /* renamed from: d */
    public void mo109580d(C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
        C13598b0 b0Var;
        C87412m.m108594g(lVar, "cb");
        String str = "game.js";
        if (this.f233189c.f47c.length() > 0) {
            str = this.f233189c.f47c + str;
        }
        Log.m105924i("MagicPlayablePkgManagement", "provideEncryptedPath:" + str);
        C40427l0 b = this.f233187a.mo109574b();
        if (b != null) {
            String c = b.mo63190c();
            C87412m.m108593f(c, "pkg.pkgPath");
            lVar.invoke(C26236u.m33719b(new C86437q(c, str)));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MagicPlayablePkgManagement", "provideEncryptedPath: pkg not found");
            lVar.invoke(C64186f0.f181907d);
        }
    }

    public void release() {
    }
}
