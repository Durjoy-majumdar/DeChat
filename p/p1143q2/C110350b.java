package p1143q2;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: q2.b */
public class C110350b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f330091a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f330092b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m150170a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m150170a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
