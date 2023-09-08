package p972h5;

import android.graphics.drawable.Drawable;
import gy3.C87412m;

/* renamed from: h5.c */
public final class C108137c {

    /* renamed from: a */
    public final Drawable f323801a;

    /* renamed from: b */
    public final boolean f323802b;

    public C108137c(Drawable drawable, boolean z) {
        C87412m.m108594g(drawable, "drawable");
        this.f323801a = drawable;
        this.f323802b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108137c)) {
            return false;
        }
        C108137c cVar = (C108137c) obj;
        return C87412m.m108589b(this.f323801a, cVar.f323801a) && this.f323802b == cVar.f323802b;
    }

    public int hashCode() {
        int hashCode = this.f323801a.hashCode() * 31;
        boolean z = this.f323802b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "DecodeResult(drawable=" + this.f323801a + ", isSampled=" + this.f323802b + ')';
    }
}
