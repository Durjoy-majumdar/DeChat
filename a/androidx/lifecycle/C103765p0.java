package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;

/* renamed from: androidx.lifecycle.p0 */
public class C103765p0 {
    /* renamed from: a */
    public static C0123n0 m138169a(View view) {
        C0123n0 n0Var = (C0123n0) view.getTag(C0966R.C0970id.l8t);
        if (n0Var != null) {
            return n0Var;
        }
        ViewParent parent = view.getParent();
        while (n0Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            n0Var = (C0123n0) view2.getTag(C0966R.C0970id.l8t);
            parent = view2.getParent();
        }
        return n0Var;
    }
}
