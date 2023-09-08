package p161h8;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: h8.f */
public class C108167f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f323896a = new Matrix();

    public C108167f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.f323896a.set(((ImageView) obj).getImageMatrix());
        return this.f323896a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
