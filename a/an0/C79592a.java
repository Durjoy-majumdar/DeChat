package an0;

import android.content.Context;
import android.text.TextUtils;
import bn0.C79721e;
import com.tencent.p014mm.vfs.C86009m1;
import dn0.C45428e;
import dn0.C86365j;
import en0.C86586a;
import fn0.C87002g;
import fn0.C87004i;

/* renamed from: an0.a */
public class C79592a {

    /* renamed from: r */
    public static volatile C79592a f233397r;

    /* renamed from: a */
    public Context f233398a;

    /* renamed from: b */
    public boolean f233399b = false;

    /* renamed from: c */
    public boolean f233400c = true;

    /* renamed from: d */
    public boolean f233401d = true;

    /* renamed from: e */
    public boolean f233402e = true;

    /* renamed from: f */
    public boolean f233403f = true;

    /* renamed from: g */
    public boolean f233404g = false;

    /* renamed from: h */
    public String f233405h;

    /* renamed from: i */
    public String f233406i;

    /* renamed from: j */
    public long f233407j = 536870912;

    /* renamed from: k */
    public long f233408k = 1048576;

    /* renamed from: l */
    public int f233409l = 5;

    /* renamed from: m */
    public C87004i f233410m;

    /* renamed from: n */
    public C86586a f233411n;

    /* renamed from: o */
    public C86365j f233412o;

    /* renamed from: p */
    public C79721e f233413p;

    /* renamed from: q */
    public C45428e f233414q;

    public C79592a(Context context) {
        this.f233398a = context;
    }

    /* renamed from: a */
    public static C79592a m96648a() {
        if (f233397r != null) {
            return f233397r;
        }
        throw new RuntimeException("PlayerConfig not initialized!");
    }

    /* renamed from: b */
    public String mo109706b() {
        C86009m1 m1Var;
        if (!TextUtils.isEmpty(this.f233406i)) {
            return this.f233406i;
        }
        try {
            m1Var = C86009m1.m106378c(this.f233398a.getExternalCacheDir());
        } catch (Exception e) {
            C87002g.m108023q(5, "PlayerConfig", "getCacheDir fail", e);
            m1Var = null;
        }
        if (m1Var == null) {
            C87002g.m108023q(5, "PlayerConfig", "getCacheDir fail, extCacheDir not exist", (Throwable) null);
            return null;
        }
        String str = m1Var + "/" + "wxvideocache";
        mo109707c(str);
        return str;
    }

    /* renamed from: c */
    public final String mo109707c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119978p()) {
                boolean f = m1Var.mo119966f();
                C87002g.m108023q(4, "PlayerConfig", "fileDir:" + str + " is file, delete result:" + f, (Throwable) null);
            }
            if (!m1Var.mo119967g()) {
                boolean x = m1Var.mo119987x();
                C87002g.m108023q(4, "PlayerConfig", "fileDir:" + str + " not exist, make dir result:" + x, (Throwable) null);
            }
        }
        return str;
    }

    /* renamed from: d */
    public String mo109708d() {
        C86009m1 m1Var;
        if (!TextUtils.isEmpty(this.f233405h)) {
            return this.f233405h;
        }
        try {
            m1Var = C86009m1.m106378c(this.f233398a.getFilesDir());
        } catch (Exception e) {
            C87002g.m108023q(5, "PlayerConfig", "getTempDir fail", e);
            m1Var = null;
        }
        if (m1Var == null) {
            return null;
        }
        String str = m1Var + "/" + "wxvideotmp";
        mo109707c(str);
        return str;
    }

    /* renamed from: e */
    public C86586a mo109709e() {
        return this.f233411n;
    }

    /* renamed from: f */
    public boolean mo109710f() {
        return this.f233402e;
    }

    /* renamed from: g */
    public boolean mo109711g() {
        return this.f233400c;
    }
}
