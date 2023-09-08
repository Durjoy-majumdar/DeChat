package p257w;

import gy3.C87412m;
import java.util.Iterator;
import my3.C61595o;
import p257w.C37919o;
import sx3.C36904l0;

/* renamed from: w.t1 */
public final class C37935t1<V extends C37919o> implements C37918n1 {

    /* renamed from: a */
    public final C37923q f100358a;

    /* renamed from: b */
    public V f100359b;

    /* renamed from: c */
    public V f100360c;

    /* renamed from: d */
    public V f100361d;

    /* renamed from: w.t1$a */
    public static final class C37936a implements C37923q {

        /* renamed from: a */
        public final /* synthetic */ C37894c0 f100362a;

        public C37936a(C37894c0 c0Var) {
            this.f100362a = c0Var;
        }

        public C37894c0 get(int i) {
            return this.f100362a;
        }
    }

    public C37935t1(C37923q qVar) {
        C87412m.m108594g(qVar, "anims");
        this.f100358a = qVar;
    }

    /* renamed from: a */
    public boolean mo61417a() {
        return false;
    }

    /* renamed from: b */
    public V mo61418b(long j, V v, V v2, V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        C87412m.m108594g(v4, "initialValue");
        C87412m.m108594g(v5, "targetValue");
        C87412m.m108594g(v6, "initialVelocity");
        if (this.f100359b == null) {
            this.f100359b = v.mo61403c();
        }
        int i = 0;
        V v7 = this.f100359b;
        if (v7 != null) {
            int b = v7.mo61402b();
            while (i < b) {
                V v8 = this.f100359b;
                if (v8 != null) {
                    v8.mo61405e(i, this.f100358a.get(i).mo61392e(j, v4.mo61401a(i), v5.mo61401a(i), v6.mo61401a(i)));
                    i++;
                } else {
                    C87412m.m108603p("valueVector");
                    throw null;
                }
            }
            V v9 = this.f100359b;
            if (v9 != null) {
                return v9;
            }
            C87412m.m108603p("valueVector");
            throw null;
        }
        C87412m.m108603p("valueVector");
        throw null;
    }

    /* renamed from: c */
    public V mo61419c(long j, V v, V v2, V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        C87412m.m108594g(v4, "initialValue");
        C87412m.m108594g(v5, "targetValue");
        C87412m.m108594g(v6, "initialVelocity");
        if (this.f100360c == null) {
            this.f100360c = v3.mo61403c();
        }
        int i = 0;
        V v7 = this.f100360c;
        if (v7 != null) {
            int b = v7.mo61402b();
            while (i < b) {
                V v8 = this.f100360c;
                if (v8 != null) {
                    v8.mo61405e(i, this.f100358a.get(i).mo61389b(j, v4.mo61401a(i), v5.mo61401a(i), v6.mo61401a(i)));
                    i++;
                } else {
                    C87412m.m108603p("velocityVector");
                    throw null;
                }
            }
            V v9 = this.f100360c;
            if (v9 != null) {
                return v9;
            }
            C87412m.m108603p("velocityVector");
            throw null;
        }
        C87412m.m108603p("velocityVector");
        throw null;
    }

    /* renamed from: d */
    public long mo61420d(V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        Iterator it = C61595o.m72301i(0, v.mo61402b()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            j = Math.max(j, this.f100358a.get(a).mo61390c(v.mo61401a(a), v2.mo61401a(a), v3.mo61401a(a)));
        }
        return j;
    }

    /* renamed from: g */
    public V mo61421g(V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        if (this.f100361d == null) {
            this.f100361d = v3.mo61403c();
        }
        int i = 0;
        V v4 = this.f100361d;
        if (v4 != null) {
            int b = v4.mo61402b();
            while (i < b) {
                V v5 = this.f100361d;
                if (v5 != null) {
                    v5.mo61405e(i, this.f100358a.get(i).mo61391d(v.mo61401a(i), v2.mo61401a(i), v3.mo61401a(i)));
                    i++;
                } else {
                    C87412m.m108603p("endVelocityVector");
                    throw null;
                }
            }
            V v6 = this.f100361d;
            if (v6 != null) {
                return v6;
            }
            C87412m.m108603p("endVelocityVector");
            throw null;
        }
        C87412m.m108603p("endVelocityVector");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C37935t1(C37894c0 c0Var) {
        this((C37923q) new C37936a(c0Var));
        C87412m.m108594g(c0Var, "anim");
    }
}
