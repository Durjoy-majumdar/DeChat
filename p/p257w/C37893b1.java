package p257w;

import com.tencent.tav.coremedia.TimeUtil;
import gy3.C8480h;
import gy3.C87412m;
import p257w.C111636d;
import p257w.C37919o;

/* renamed from: w.b1 */
public final class C37893b1<T, V extends C37919o> implements C111636d<T, V> {

    /* renamed from: a */
    public final C37918n1<V> f100295a;

    /* renamed from: b */
    public final C37906k1<T, V> f100296b;

    /* renamed from: c */
    public final T f100297c;

    /* renamed from: d */
    public final T f100298d;

    /* renamed from: e */
    public final V f100299e;

    /* renamed from: f */
    public final V f100300f;

    /* renamed from: g */
    public final V f100301g;

    /* renamed from: h */
    public final long f100302h;

    /* renamed from: i */
    public final V f100303i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37893b1(C37901h hVar, C37906k1 k1Var, Object obj, Object obj2, C37919o oVar, int i, C8480h hVar2) {
        this(hVar, k1Var, obj, obj2, (i & 16) != 0 ? null : oVar);
    }

    /* renamed from: a */
    public boolean mo61381a() {
        return this.f100295a.mo61417a();
    }

    /* renamed from: b */
    public long mo61382b() {
        return this.f100302h;
    }

    /* renamed from: c */
    public boolean mo61383c(long j) {
        return C111636d.C37895a.m41575a(this, j);
    }

    /* renamed from: d */
    public C37906k1<T, V> mo61384d() {
        return this.f100296b;
    }

    /* renamed from: e */
    public T mo61385e(long j) {
        if (C111636d.C37895a.m41575a(this, j)) {
            return this.f100298d;
        }
        return this.f100296b.mo61400b().invoke(this.f100295a.mo61418b(j, this.f100299e, this.f100300f, this.f100301g));
    }

    /* renamed from: f */
    public T mo61386f() {
        return this.f100298d;
    }

    /* renamed from: g */
    public V mo61387g(long j) {
        if (C111636d.C37895a.m41575a(this, j)) {
            return this.f100303i;
        }
        return this.f100295a.mo61419c(j, this.f100299e, this.f100300f, this.f100301g);
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f100297c + " -> " + this.f100298d + ",initial velocity: " + this.f100301g + ", duration: " + (mo61382b() / TimeUtil.SECOND_TO_US) + " ms";
    }

    public C37893b1(C37901h<T> hVar, C37906k1<T, V> k1Var, T t, T t2, V v) {
        V v2;
        C87412m.m108594g(hVar, "animationSpec");
        C87412m.m108594g(k1Var, "typeConverter");
        C37918n1<V> a = hVar.mo61393a(k1Var);
        C87412m.m108594g(a, "animationSpec");
        this.f100295a = a;
        this.f100296b = k1Var;
        this.f100297c = t;
        this.f100298d = t2;
        V v3 = (C37919o) k1Var.mo61399a().invoke(t);
        this.f100299e = v3;
        V v4 = (C37919o) k1Var.mo61399a().invoke(t2);
        this.f100300f = v4;
        if (v != null) {
            v2 = C37921p.m41619a(v);
        } else {
            C37919o oVar = (C37919o) k1Var.mo61399a().invoke(t);
            C87412m.m108594g(oVar, "<this>");
            v2 = oVar.mo61403c();
        }
        this.f100301g = v2;
        this.f100302h = a.mo61420d(v3, v4, v2);
        this.f100303i = a.mo61421g(v3, v4, v2);
    }
}
