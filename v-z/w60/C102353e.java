package w60;

import android.graphics.Bitmap;
import gy3.C87412m;

/* renamed from: w60.e */
public final class C102353e<R> {

    /* renamed from: a */
    public R f301453a;

    public C102353e() {
    }

    /* renamed from: a */
    public final boolean mo141920a() {
        R r = this.f301453a;
        if (r == null) {
            return false;
        }
        if (!(r instanceof Bitmap)) {
            return true;
        }
        C87412m.m108592e(r, "null cannot be cast to non-null type android.graphics.Bitmap");
        return !((Bitmap) r).isRecycled();
    }

    public C102353e(int i, int i2, R r) {
        this.f301453a = r;
    }
}
