package p853i4;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: i4.g */
public class C108346g implements TypeEvaluator<Rect> {

    /* renamed from: a */
    public Rect f324373a;

    public C108346g() {
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) (((float) (rect2.left - i)) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) (((float) (rect2.top - i3)) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) (((float) (rect2.right - i5)) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) (((float) (rect2.bottom - i7)) * f));
        Rect rect3 = this.f324373a;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f324373a;
    }

    public C108346g(Rect rect) {
        this.f324373a = rect;
    }
}
