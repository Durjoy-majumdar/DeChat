package p1126j5;

import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p972h5.C108136b;

/* renamed from: j5.e */
public final class C108574e extends C108575f {

    /* renamed from: a */
    public final Drawable f325029a;

    /* renamed from: b */
    public final boolean f325030b;

    /* renamed from: c */
    public final C108136b f325031c;

    public C108574e(Drawable drawable, boolean z, C108136b bVar) {
        C87412m.m108594g(drawable, "drawable");
        C87412m.m108594g(bVar, "dataSource");
        this.f325029a = drawable;
        this.f325030b = z;
        this.f325031c = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108574e)) {
            return false;
        }
        C108574e eVar = (C108574e) obj;
        return C87412m.m108589b(this.f325029a, eVar.f325029a) && this.f325030b == eVar.f325030b && this.f325031c == eVar.f325031c;
    }

    public int hashCode() {
        int hashCode = this.f325029a.hashCode() * 31;
        boolean z = this.f325030b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f325031c.hashCode();
    }

    public String toString() {
        return "DrawableResult(drawable=" + this.f325029a + ", isSampled=" + this.f325030b + ", dataSource=" + this.f325031c + ')';
    }
}
