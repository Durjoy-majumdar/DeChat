package mh0;

import gy3.C87412m;
import java.util.Iterator;
import sm2.C101650a;

/* renamed from: mh0.a */
public class C99862a extends C101650a {

    /* renamed from: f */
    public long f292634f;

    /* renamed from: g */
    public C99889n f292635g = new C99889n();

    /* renamed from: h */
    public int f292636h;

    /* renamed from: i */
    public int f292637i;

    /* renamed from: j */
    public int f292638j;

    /* renamed from: k */
    public int f292639k;

    public C99862a() {
        this.f297564a = C99863b.class;
    }

    /* renamed from: A */
    public final C99893q mo139216A(String str) {
        T t;
        C87412m.m108594g(str, "dataId");
        Iterator<T> it = mo55365D().mo139238A().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C99893q) t).mo55377B(), str)) {
                break;
            }
        }
        return (C99893q) t;
    }

    /* renamed from: B */
    public int mo55363B() {
        return this.f292639k;
    }

    /* renamed from: C */
    public long mo55364C() {
        return this.f292634f;
    }

    /* renamed from: D */
    public C99889n mo55365D() {
        return this.f292635g;
    }

    /* renamed from: E */
    public int mo55366E() {
        return this.f292637i;
    }

    /* renamed from: F */
    public int mo55367F() {
        return this.f292636h;
    }

    /* renamed from: G */
    public int mo55368G() {
        return this.f292638j;
    }

    /* renamed from: H */
    public void mo55369H(int i) {
        this.f292639k = i;
    }

    /* renamed from: I */
    public void mo55370I(long j) {
        this.f292634f = j;
    }

    /* renamed from: J */
    public void mo55371J(C99889n nVar) {
        C87412m.m108594g(nVar, "<set-?>");
        this.f292635g = nVar;
    }

    /* renamed from: K */
    public void mo55372K(int i) {
        this.f292637i = i;
    }

    /* renamed from: L */
    public void mo55373L(int i) {
        this.f292636h = i;
    }

    /* renamed from: M */
    public void mo55374M(int i) {
        this.f292638j = i;
    }
}
