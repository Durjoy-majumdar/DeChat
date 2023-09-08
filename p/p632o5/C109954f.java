package p632o5;

import android.graphics.drawable.Drawable;
import gy3.C87412m;

/* renamed from: o5.f */
public final class C109954f extends C109959i {

    /* renamed from: a */
    public final Drawable f328979a;

    /* renamed from: b */
    public final C109956h f328980b;

    /* renamed from: c */
    public final Throwable f328981c;

    public C109954f(Drawable drawable, C109956h hVar, Throwable th) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(th, "throwable");
        this.f328979a = drawable;
        this.f328980b = hVar;
        this.f328981c = th;
    }

    /* renamed from: a */
    public Drawable mo161275a() {
        return this.f328979a;
    }

    /* renamed from: b */
    public C109956h mo161276b() {
        return this.f328980b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109954f)) {
            return false;
        }
        C109954f fVar = (C109954f) obj;
        return C87412m.m108589b(this.f328979a, fVar.f328979a) && C87412m.m108589b(this.f328980b, fVar.f328980b) && C87412m.m108589b(this.f328981c, fVar.f328981c);
    }

    public int hashCode() {
        Drawable drawable = this.f328979a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f328980b.hashCode()) * 31) + this.f328981c.hashCode();
    }

    public String toString() {
        return "ErrorResult(drawable=" + this.f328979a + ", request=" + this.f328980b + ", throwable=" + this.f328981c + ')';
    }
}
