package wo1;

import gy3.C8480h;
import gy3.C87412m;
import p006bk.C0306f;
import p006bk.C54481c;

/* renamed from: wo1.g */
public final class C66155g {

    /* renamed from: a */
    public final int f190143a;

    /* renamed from: b */
    public final int f190144b;

    /* renamed from: c */
    public final int f190145c;

    /* renamed from: d */
    public final int f190146d;

    /* renamed from: e */
    public final int f190147e;

    /* renamed from: f */
    public final int f190148f;

    /* renamed from: g */
    public final C54481c f190149g;

    /* renamed from: h */
    public final C0306f f190150h;

    /* renamed from: i */
    public final int f190151i;

    public C66155g(int i, int i2, int i3, int i4, int i5, int i6, C54481c cVar, C0306f fVar, int i7, int i8, C8480h hVar) {
        i7 = (i8 & 256) != 0 ? 1 : i7;
        C87412m.m108594g(cVar, "danmakuCreator");
        C87412m.m108594g(fVar, "renderCreator");
        this.f190143a = i;
        this.f190144b = i2;
        this.f190145c = i3;
        this.f190146d = i4;
        this.f190147e = i5;
        this.f190148f = i6;
        this.f190149g = cVar;
        this.f190150h = fVar;
        this.f190151i = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66155g)) {
            return false;
        }
        C66155g gVar = (C66155g) obj;
        return this.f190143a == gVar.f190143a && this.f190144b == gVar.f190144b && this.f190145c == gVar.f190145c && this.f190146d == gVar.f190146d && this.f190147e == gVar.f190147e && this.f190148f == gVar.f190148f && C87412m.m108589b(this.f190149g, gVar.f190149g) && C87412m.m108589b(this.f190150h, gVar.f190150h) && this.f190151i == gVar.f190151i;
    }

    public int hashCode() {
        return (((((((((((((((this.f190143a * 31) + this.f190144b) * 31) + this.f190145c) * 31) + this.f190146d) * 31) + this.f190147e) * 31) + this.f190148f) * 31) + this.f190149g.hashCode()) * 31) + this.f190150h.hashCode()) * 31) + this.f190151i;
    }

    public String toString() {
        return "LiveDanmakuConfig(portraitRowCount=" + this.f190143a + ", landscapeRowCount=" + this.f190144b + ", portraitDurationMs=" + this.f190145c + ", landscapeDurationMs=" + this.f190146d + ", curTimeStartOffsetMs=" + this.f190147e + ", repeatTimeMs=" + this.f190148f + ", danmakuCreator=" + this.f190149g + ", renderCreator=" + this.f190150h + ", drawingThreadType=" + this.f190151i + ')';
    }
}
