package sk1;

import cm1.C0740i2;
import gy3.C87412m;
import pe3.C47465a;
import pe3.C89349b;
import te3.C64822x51;
import tf0.C64919s1;

/* renamed from: sk1.k */
public abstract class C63956k implements C0740i2, C64919s1<C47465a> {

    /* renamed from: d */
    public long f181291d;

    /* renamed from: e */
    public C89349b f181292e;

    /* renamed from: f */
    public String f181293f = "";

    /* renamed from: g */
    public boolean f181294g;

    /* renamed from: h */
    public int f181295h;

    /* renamed from: i */
    public int f181296i;

    /* renamed from: j */
    public C89349b f181297j;

    /* renamed from: n */
    public int f181298n;

    /* renamed from: o */
    public boolean f181299o;

    /* renamed from: p */
    public boolean f181300p;

    /* renamed from: q */
    public int f181301q;

    /* renamed from: r */
    public String f181302r = "";

    /* renamed from: i */
    public final C63956k mo88743i(C64822x51 x512) {
        C87412m.m108594g(x512, "info");
        this.f181292e = x512.f186260j;
        String str = x512.f186259i;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        this.f181293f = str;
        this.f181294g = x512.f186255e;
        this.f181295h = x512.f186261n;
        this.f181291d = x512.f186258h;
        this.f181296i = x512.f186264q;
        this.f181297j = x512.f186256f;
        this.f181298n = x512.f186254d;
        this.f181299o = x512.f186265r;
        this.f181300p = x512.f186266s;
        String str3 = x512.f186267t;
        if (str3 != null) {
            str2 = str3;
        }
        this.f181302r = str2;
        this.f181301q = x512.f186263p;
        return this;
    }

    /* renamed from: j */
    public final C64822x51 mo88744j(C64822x51 x512) {
        C87412m.m108594g(x512, "info");
        x512.f186260j = this.f181292e;
        x512.f186259i = this.f181293f;
        x512.f186255e = this.f181294g;
        x512.f186261n = this.f181295h;
        x512.f186258h = this.f181291d;
        x512.f186264q = this.f181296i;
        x512.f186256f = new C89349b(mo13073b().toByteArray());
        x512.f186265r = this.f181299o;
        x512.f186266s = this.f181300p;
        x512.f186267t = this.f181302r;
        x512.f186263p = this.f181301q;
        return x512;
    }
}
