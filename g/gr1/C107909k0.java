package gr1;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;
import u80.C111140b;
import w80.C111742d;

/* renamed from: gr1.k0 */
public final class C107909k0 extends C111140b {

    /* renamed from: Z */
    public int f323099Z;

    /* renamed from: a0 */
    public int f323100a0;

    public C107909k0(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: w */
    public static final float m146207w(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: k */
    public void mo158337k() {
        if (this.f332751f == 4) {
            Point point = this.f332771z;
            float f = (float) this.f332746a;
            float f2 = (float) 1;
            float f3 = (float) this.f332747b;
            Point point2 = this.f332745A;
            RectF rectF = new RectF(((float) point.x) / f, (((float) point.y) - f2) / f3, (((float) point2.x) - f2) / f, ((float) point2.y) / f3);
            float f4 = rectF.left;
            float f5 = rectF.top;
            float f6 = rectF.right;
            float f7 = rectF.bottom;
            Rect rect = this.f332761p;
            if (rect != null) {
                float[] fArr = C111742d.f334650d;
                float[] copyOf = Arrays.copyOf(fArr, 8);
                int i = this.f323099Z;
                if (i <= 0) {
                    i = this.f332746a;
                }
                int i2 = this.f323100a0;
                if (i2 <= 0) {
                    i2 = this.f332747b;
                }
                float f8 = (float) i;
                float w = m146207w(((float) rect.left) / f8);
                float w2 = m146207w(((float) rect.right) / f8);
                float f9 = (float) i2;
                float w3 = m146207w(((float) rect.bottom) / f9);
                float w4 = m146207w(((float) rect.top) / f9);
                float abs = Math.abs(f6 - f4);
                float abs2 = Math.abs(f7 - f5);
                float f15 = (w * abs) + f4;
                float f16 = f4 + (abs * w2);
                float min = Math.min(f5, f7) + (w3 * abs2);
                float min2 = Math.min(f5, f7) + (abs2 * w4);
                copyOf[0] = f15;
                copyOf[1] = min2;
                copyOf[2] = f16;
                copyOf[3] = min2;
                copyOf[4] = f15;
                copyOf[5] = min;
                copyOf[6] = f16;
                copyOf[7] = min;
                this.f332752g.put(fArr);
                this.f332752g.position(0);
                this.f332752g.put(copyOf);
                this.f332752g.position(0);
                this.f332753h.position(0);
            }
            this.f332753h.position(0);
            this.f332753h.put(C111742d.f334649c);
            this.f332753h.position(0);
            return;
        }
        super.mo158337k();
    }
}
