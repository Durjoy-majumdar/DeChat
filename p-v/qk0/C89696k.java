package qk0;

import android.text.TextUtils;
import com.tencent.mars.cdn.CdnLogic;
import fl0.C86917b;
import fl0.C86918c;
import fl0.C86920e;

/* renamed from: qk0.k */
public class C89696k {

    /* renamed from: e */
    public static final C89696k f257968e = new C89696k(0, "", C86920e.f252311a, (Object) null);

    /* renamed from: f */
    public static final C89696k f257969f = new C89696k(-1, "fail:internal error", C86917b.f252268F, (Object) null);

    /* renamed from: g */
    public static final C89696k f257970g;

    /* renamed from: h */
    public static final C89696k f257971h = new C89696k(10000, "fail:not init", C86917b.f252278a, (Object) null);

    /* renamed from: i */
    public static final C89696k f257972i = new C89696k(10001, "fail:not available", C86917b.f252279b, (Object) null);

    /* renamed from: j */
    public static final C89696k f257973j = new C89696k(10004, "fail:no service", C86917b.f252280c, (Object) null);

    /* renamed from: k */
    public static final C89696k f257974k = new C89696k(10005, "fail:no characteristic", C86917b.f252270H, (Object) null);

    /* renamed from: l */
    public static final C89696k f257975l = new C89696k(10006, "fail:no connection", C86917b.f252271I, (Object) null);

    /* renamed from: m */
    public static final C89696k f257976m;

    /* renamed from: n */
    public static final C89696k f257977n;

    /* renamed from: o */
    public static final C89696k f257978o = new C89696k(10009, "fail:system not support", C86917b.f252282e, (Object) null);

    /* renamed from: p */
    public static final C89696k f257979p;

    /* renamed from: q */
    public static final C89696k f257980q;

    /* renamed from: r */
    public static final C89696k f257981r;

    /* renamed from: s */
    public static final C89696k f257982s = new C89696k(10012, "fail:operate time out", C86917b.f252273K, (Object) null);

    /* renamed from: t */
    public static final C89696k f257983t = new C89696k(-1, "fail:already connect", C86917b.f252274L, (Object) null);

    /* renamed from: u */
    public static final C89696k f257984u = new C89696k(10013, "fail:invalid data", C86920e.f252317g, (Object) null);

    /* renamed from: v */
    public static final C89696k f257985v = new C89696k(10014, "fail:need pin", C86917b.f252276N, (Object) null);

    /* renamed from: w */
    public static final C89696k f257986w = new C89696k(-1, "fail:location permission is denied", C86917b.f252275M, (Object) null);

    /* renamed from: x */
    public static final C89696k f257987x;
    @Deprecated

    /* renamed from: a */
    public int f257988a;

    /* renamed from: b */
    public String f257989b;

    /* renamed from: c */
    public final C86918c f257990c;

    /* renamed from: d */
    public final Object f257991d;

    static {
        C86918c cVar = C86917b.f252281d;
        f257970g = new C89696k(-1, "fail:internal error", cVar, (Object) null);
        C86918c cVar2 = C86917b.f252272J;
        f257976m = new C89696k(CdnLogic.kMediaTypeFavoriteBigFile, "fail:property not support", cVar2, (Object) null);
        f257977n = new C89696k(10008, "fail:system error", cVar, (Object) null);
        f257979p = new C89696k(10008, "fail:no descriptor", cVar, (Object) null);
        f257980q = new C89696k(10008, "fail:fail to set descriptor", cVar, (Object) null);
        f257981r = new C89696k(10008, "fail:fail to write descriptor", cVar, (Object) null);
        f257987x = new C89696k(CdnLogic.kMediaTypeFavoriteBigFile, "fail:The writeType is not supported", cVar2, (Object) null);
    }

    public C89696k(int i, String str, C86918c cVar, Object obj) {
        this.f257988a = i;
        this.f257989b = str;
        this.f257990c = cVar;
        this.f257991d = obj;
    }

    /* renamed from: a */
    public static C89696k m112157a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C89696k(-1, "fail:system error", C86917b.f252281d, (Object) null);
        }
        return new C89696k(-1, "fail:system error, " + str, C86917b.f252281d, (Object) null);
    }

    /* renamed from: b */
    public static C89696k m112158b(String str) {
        return new C89696k(10008, "fail:system error, " + str, C86917b.f252281d, (Object) null);
    }

    public String toString() {
        return "Result{errCode=" + this.f257988a + ", errMsg='" + this.f257989b + '\'' + ", errorInfo=" + this.f257990c + ", retObj=" + this.f257991d + '}';
    }
}
