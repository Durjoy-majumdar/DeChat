package p632o5;

import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p632o5.C109959i;

/* renamed from: o5.m */
public final class C109963m extends C109959i {

    /* renamed from: a */
    public final Drawable f329059a;

    /* renamed from: b */
    public final C109956h f329060b;

    /* renamed from: c */
    public final C109959i.C109960a f329061c;

    public C109963m(Drawable drawable, C109956h hVar, C109959i.C109960a aVar) {
        C87412m.m108594g(drawable, "drawable");
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(aVar, "metadata");
        this.f329059a = drawable;
        this.f329060b = hVar;
        this.f329061c = aVar;
    }

    /* renamed from: a */
    public Drawable mo161275a() {
        return this.f329059a;
    }

    /* renamed from: b */
    public C109956h mo161276b() {
        return this.f329060b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109963m)) {
            return false;
        }
        C109963m mVar = (C109963m) obj;
        return C87412m.m108589b(this.f329059a, mVar.f329059a) && C87412m.m108589b(this.f329060b, mVar.f329060b) && C87412m.m108589b(this.f329061c, mVar.f329061c);
    }

    public int hashCode() {
        return (((this.f329059a.hashCode() * 31) + this.f329060b.hashCode()) * 31) + this.f329061c.hashCode();
    }

    public String toString() {
        return "SuccessResult(drawable=" + this.f329059a + ", request=" + this.f329060b + ", metadata=" + this.f329061c + ')';
    }
}
