package p853i4;

import android.graphics.Matrix;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: i4.z */
public class C108366z {
    /* renamed from: a */
    public float mo158854a(View view) {
        Float f = (Float) view.getTag(C0966R.C0970id.j0q);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    /* renamed from: b */
    public void mo158857b(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    /* renamed from: c */
    public void mo158855c(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: d */
    public void mo158856d(View view, Matrix matrix) {
        throw null;
    }
}
