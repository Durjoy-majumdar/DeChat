package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;

/* renamed from: androidx.lifecycle.o0 */
public class C54216o0 {
    /* renamed from: a */
    public static C0125s m60904a(View view) {
        C0125s sVar = (C0125s) view.getTag(C0966R.C0970id.l8r);
        if (sVar != null) {
            return sVar;
        }
        ViewParent parent = view.getParent();
        while (sVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            sVar = (C0125s) view2.getTag(C0966R.C0970id.l8r);
            parent = view2.getParent();
        }
        return sVar;
    }
}
