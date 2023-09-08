package wk1;

import android.graphics.Bitmap;
import gy3.C87412m;

/* renamed from: wk1.t */
public final class C15478t {

    /* renamed from: a */
    public final int f41987a;

    /* renamed from: b */
    public final int f41988b;

    /* renamed from: c */
    public final Bitmap f41989c;

    /* renamed from: d */
    public final Bitmap f41990d;

    /* renamed from: e */
    public final Bitmap f41991e;

    public C15478t(int i, int i2, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        C87412m.m108594g(bitmap, "swipeBitmap");
        C87412m.m108594g(bitmap2, "topLightBitmap");
        C87412m.m108594g(bitmap3, "bottomLightBitmap");
        this.f41987a = i;
        this.f41988b = i2;
        this.f41989c = bitmap;
        this.f41990d = bitmap2;
        this.f41991e = bitmap3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15478t)) {
            return false;
        }
        C15478t tVar = (C15478t) obj;
        return this.f41987a == tVar.f41987a && this.f41988b == tVar.f41988b && C87412m.m108589b(this.f41989c, tVar.f41989c) && C87412m.m108589b(this.f41990d, tVar.f41990d) && C87412m.m108589b(this.f41991e, tVar.f41991e);
    }

    public int hashCode() {
        return (((((((this.f41987a * 31) + this.f41988b) * 31) + this.f41989c.hashCode()) * 31) + this.f41990d.hashCode()) * 31) + this.f41991e.hashCode();
    }

    public String toString() {
        return "FgParams(animtionTime=" + this.f41987a + ", animationInterval=" + this.f41988b + ", swipeBitmap=" + this.f41989c + ", topLightBitmap=" + this.f41990d + ", bottomLightBitmap=" + this.f41991e + ')';
    }
}
