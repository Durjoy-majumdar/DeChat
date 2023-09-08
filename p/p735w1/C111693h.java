package p735w1;

import gy3.C87412m;
import my3.C61595o;
import p1166z0.C112540f;
import p1166z0.C112541g;

/* renamed from: w1.h */
public final class C111693h {

    /* renamed from: a */
    public final C111692g f334329a;

    /* renamed from: b */
    public final int f334330b;

    /* renamed from: c */
    public final int f334331c;

    /* renamed from: d */
    public int f334332d;

    /* renamed from: e */
    public int f334333e;

    /* renamed from: f */
    public float f334334f;

    /* renamed from: g */
    public float f334335g;

    public C111693h(C111692g gVar, int i, int i2, int i3, int i4, float f, float f2) {
        C87412m.m108594g(gVar, "paragraph");
        this.f334329a = gVar;
        this.f334330b = i;
        this.f334331c = i2;
        this.f334332d = i3;
        this.f334333e = i4;
        this.f334334f = f;
        this.f334335g = f2;
    }

    /* renamed from: a */
    public final C112541g mo163346a(C112541g gVar) {
        C87412m.m108594g(gVar, "<this>");
        return gVar.mo164263d(C112540f.m153745a(0.0f, this.f334334f));
    }

    /* renamed from: b */
    public final int mo163347b(int i) {
        return C61595o.m72297e(i, this.f334330b, this.f334331c) - this.f334330b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111693h)) {
            return false;
        }
        C111693h hVar = (C111693h) obj;
        return C87412m.m108589b(this.f334329a, hVar.f334329a) && this.f334330b == hVar.f334330b && this.f334331c == hVar.f334331c && this.f334332d == hVar.f334332d && this.f334333e == hVar.f334333e && C87412m.m108589b(Float.valueOf(this.f334334f), Float.valueOf(hVar.f334334f)) && C87412m.m108589b(Float.valueOf(this.f334335g), Float.valueOf(hVar.f334335g));
    }

    public int hashCode() {
        return (((((((((((this.f334329a.hashCode() * 31) + this.f334330b) * 31) + this.f334331c) * 31) + this.f334332d) * 31) + this.f334333e) * 31) + Float.floatToIntBits(this.f334334f)) * 31) + Float.floatToIntBits(this.f334335g);
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f334329a + ", startIndex=" + this.f334330b + ", endIndex=" + this.f334331c + ", startLineIndex=" + this.f334332d + ", endLineIndex=" + this.f334333e + ", top=" + this.f334334f + ", bottom=" + this.f334335g + ')';
    }
}
