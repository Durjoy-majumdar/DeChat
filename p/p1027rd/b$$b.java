package p1027rd;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: rd.b$$b */
public final class b$$b {

    /* renamed from: a */
    public final int f258416a;

    /* renamed from: b */
    public final int f258417b;

    /* renamed from: c */
    public final Surface f258418c;

    /* renamed from: d */
    public final C32226l<SurfaceTexture, C13598b0> f258419d;

    /* renamed from: e */
    public final C32226l<SurfaceTexture, C13598b0> f258420e;

    public b$$b(int i, int i2, Surface surface, C32226l<? super SurfaceTexture, C13598b0> lVar, C32226l<? super SurfaceTexture, C13598b0> lVar2) {
        C87412m.m108594g(lVar, "callback");
        this.f258416a = i;
        this.f258417b = i2;
        this.f258418c = surface;
        this.f258419d = lVar;
        this.f258420e = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b$$b)) {
            return false;
        }
        b$$b b__b = (b$$b) obj;
        return this.f258416a == b__b.f258416a && this.f258417b == b__b.f258417b && C87412m.m108589b(this.f258418c, b__b.f258418c) && C87412m.m108589b(this.f258419d, b__b.f258419d) && C87412m.m108589b(this.f258420e, b__b.f258420e);
    }

    public int hashCode() {
        int i = ((this.f258416a * 31) + this.f258417b) * 31;
        Surface surface = this.f258418c;
        int i2 = 0;
        int hashCode = (((i + (surface == null ? 0 : surface.hashCode())) * 31) + this.f258419d.hashCode()) * 31;
        C32226l<SurfaceTexture, C13598b0> lVar = this.f258420e;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SurfaceRegisterParams(width=" + this.f258416a + ", height=" + this.f258417b + ", surface=" + this.f258418c + ", callback=" + this.f258419d + ", frameCallback=" + this.f258420e + ')';
    }
}
