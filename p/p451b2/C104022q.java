package p451b2;

import gy3.C87412m;
import java.util.List;
import sx3.C64197v;

/* renamed from: b2.q */
public final class C104022q implements Comparable<C104022q> {

    /* renamed from: e */
    public static final C104022q f307650e;

    /* renamed from: f */
    public static final C104022q f307651f;

    /* renamed from: g */
    public static final C104022q f307652g;

    /* renamed from: h */
    public static final C104022q f307653h;

    /* renamed from: i */
    public static final C104022q f307654i;

    /* renamed from: j */
    public static final C104022q f307655j;

    /* renamed from: n */
    public static final List<C104022q> f307656n;

    /* renamed from: d */
    public final int f307657d;

    static {
        C104022q qVar = new C104022q(100);
        C104022q qVar2 = new C104022q(200);
        C104022q qVar3 = new C104022q(300);
        C104022q qVar4 = new C104022q(400);
        f307650e = qVar4;
        C104022q qVar5 = new C104022q(500);
        f307651f = qVar5;
        C104022q qVar6 = new C104022q(600);
        f307652g = qVar6;
        C104022q qVar7 = new C104022q(700);
        C104022q qVar8 = new C104022q(800);
        C104022q qVar9 = new C104022q(900);
        f307653h = qVar3;
        f307654i = qVar4;
        f307655j = qVar5;
        f307656n = C64197v.m75537f(qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9);
    }

    public C104022q(int i) {
        this.f307657d = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
        }
    }

    /* renamed from: a */
    public int compareTo(C104022q qVar) {
        C87412m.m108594g(qVar, "other");
        return C87412m.m108596i(this.f307657d, qVar.f307657d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C104022q) && this.f307657d == ((C104022q) obj).f307657d;
    }

    public int hashCode() {
        return this.f307657d;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f307657d + ')';
    }
}
