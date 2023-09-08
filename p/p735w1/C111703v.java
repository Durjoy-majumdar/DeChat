package p735w1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p544h2.C32658d;
import p560i2.C33181m;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: w1.v */
public final class C111703v {

    /* renamed from: a */
    public final C111702u f334371a;

    /* renamed from: b */
    public final C111687d f334372b;

    /* renamed from: c */
    public final long f334373c;

    /* renamed from: d */
    public final float f334374d;

    /* renamed from: e */
    public final float f334375e;

    /* renamed from: f */
    public final List<C112541g> f334376f;

    public C111703v(C111702u uVar, C111687d dVar, long j, C8480h hVar) {
        this.f334371a = uVar;
        this.f334372b = dVar;
        this.f334373c = j;
        float f = 0.0f;
        this.f334374d = ((ArrayList) dVar.f334321h).isEmpty() ? 0.0f : ((C111693h) ((ArrayList) dVar.f334321h).get(0)).f334329a.mo157567g();
        if (!((ArrayList) dVar.f334321h).isEmpty()) {
            C111693h hVar2 = (C111693h) C110818d0.m150923U(dVar.f334321h);
            f = hVar2.f334329a.mo157570i() + hVar2.f334334f;
        }
        this.f334375e = f;
        this.f334376f = dVar.f334320g;
    }

    /* renamed from: a */
    public final C32658d mo163363a(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163344c(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(i == dVar.f334314a.f334322a.length() ? C64197v.m75536e(dVar.f334321h) : C111691f.m152222a(dVar.f334321h, i));
        return hVar.f334329a.mo157582u(hVar.mo163347b(i));
    }

    /* renamed from: b */
    public final C112541g mo163364b(int i) {
        C111687d dVar = this.f334372b;
        boolean z = false;
        if (i >= 0 && i < dVar.f334314a.f334322a.f100413d.length()) {
            z = true;
        }
        if (z) {
            C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152222a(dVar.f334321h, i));
            return hVar.mo163346a(hVar.f334329a.mo157571j(hVar.mo163347b(i)));
        }
        dVar.getClass();
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + dVar.f334314a.f334322a.length() + ')').toString());
    }

    /* renamed from: c */
    public final C112541g mo163365c(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163344c(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(i == dVar.f334314a.f334322a.length() ? C64197v.m75536e(dVar.f334321h) : C111691f.m152222a(dVar.f334321h, i));
        return hVar.mo163346a(hVar.f334329a.mo157569h(hVar.mo163347b(i)));
    }

    /* renamed from: d */
    public final float mo163366d(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163345d(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i));
        return hVar.f334329a.mo157564d(i - hVar.f334332d) + hVar.f334334f;
    }

    /* renamed from: e */
    public final int mo163367e(int i, boolean z) {
        C111687d dVar = this.f334372b;
        dVar.mo163345d(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i));
        return hVar.f334329a.mo157574m(i - hVar.f334332d, z) + hVar.f334330b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111703v)) {
            return false;
        }
        C111703v vVar = (C111703v) obj;
        if (!C87412m.m108589b(this.f334371a, vVar.f334371a) || !C87412m.m108589b(this.f334372b, vVar.f334372b) || !C33181m.m39965a(this.f334373c, vVar.f334373c)) {
            return false;
        }
        if (!(this.f334374d == vVar.f334374d)) {
            return false;
        }
        return ((this.f334375e > vVar.f334375e ? 1 : (this.f334375e == vVar.f334375e ? 0 : -1)) == 0) && C87412m.m108589b(this.f334376f, vVar.f334376f);
    }

    /* renamed from: f */
    public final int mo163369f(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163344c(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(i == dVar.f334314a.f334322a.length() ? C64197v.m75536e(dVar.f334321h) : C111691f.m152222a(dVar.f334321h, i));
        return hVar.f334329a.mo157563c(hVar.mo163347b(i)) + hVar.f334332d;
    }

    /* renamed from: g */
    public final int mo163370g(float f) {
        C111687d dVar = this.f334372b;
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(f <= 0.0f ? 0 : f >= dVar.f334318e ? C64197v.m75536e(dVar.f334321h) : C111691f.m152224c(dVar.f334321h, f));
        int i = hVar.f334331c;
        int i2 = hVar.f334330b;
        return i - i2 == 0 ? Math.max(0, i2 - 1) : hVar.f334329a.mo157575n(f - hVar.f334334f) + hVar.f334332d;
    }

    /* renamed from: h */
    public final float mo163371h(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163345d(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i));
        return hVar.f334329a.mo157576o(i - hVar.f334332d);
    }

    public int hashCode() {
        long j = this.f334373c;
        return (((((((((this.f334371a.hashCode() * 31) + this.f334372b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f334374d)) * 31) + Float.floatToIntBits(this.f334375e)) * 31) + this.f334376f.hashCode();
    }

    /* renamed from: i */
    public final float mo163373i(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163345d(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i));
        return hVar.f334329a.mo157565e(i - hVar.f334332d);
    }

    /* renamed from: j */
    public final int mo163374j(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163345d(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i));
        return hVar.f334329a.mo157562b(i - hVar.f334332d) + hVar.f334330b;
    }

    /* renamed from: k */
    public final float mo163375k(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163345d(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i));
        return hVar.f334329a.mo157561a(i - hVar.f334332d) + hVar.f334334f;
    }

    /* renamed from: l */
    public final int mo163376l(long j) {
        C111687d dVar = this.f334372b;
        dVar.getClass();
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(C112539e.m153739d(j) <= 0.0f ? 0 : C112539e.m153739d(j) >= dVar.f334318e ? C64197v.m75536e(dVar.f334321h) : C111691f.m152224c(dVar.f334321h, C112539e.m153739d(j)));
        int i = hVar.f334331c;
        int i2 = hVar.f334330b;
        return i - i2 == 0 ? Math.max(0, i2 - 1) : hVar.f334329a.mo157573l(C112540f.m153745a(C112539e.m153738c(j), C112539e.m153739d(j) - hVar.f334334f)) + hVar.f334330b;
    }

    /* renamed from: m */
    public final C32658d mo163377m(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163344c(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(i == dVar.f334314a.f334322a.length() ? C64197v.m75536e(dVar.f334321h) : C111691f.m152222a(dVar.f334321h, i));
        return hVar.f334329a.mo157566f(hVar.mo163347b(i));
    }

    /* renamed from: n */
    public final long mo163378n(int i) {
        C111687d dVar = this.f334372b;
        dVar.mo163344c(i);
        C111693h hVar = (C111693h) ((ArrayList) dVar.f334321h).get(i == dVar.f334314a.f334322a.length() ? C64197v.m75536e(dVar.f334321h) : C111691f.m152222a(dVar.f334321h, i));
        long k = hVar.f334329a.mo157572k(hVar.mo163347b(i));
        int i2 = C38006x.f100499c;
        return C38007y.m41701a(((int) (k >> 32)) + hVar.f334330b, C38006x.m41695c(k) + hVar.f334330b);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f334371a + ", multiParagraph=" + this.f334372b + ", size=" + C33181m.m39967c(this.f334373c) + ", firstBaseline=" + this.f334374d + ", lastBaseline=" + this.f334375e + ", placeholderRects=" + this.f334376f + ')';
    }
}
