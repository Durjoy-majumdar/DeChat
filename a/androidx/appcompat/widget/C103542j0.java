package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: androidx.appcompat.widget.j0 */
public class C103542j0 {
    /* renamed from: a */
    public static void m137612a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C103544k0 k0Var = C103544k0.f305774p;
        if (k0Var != null && k0Var.f305776d == view) {
            C103544k0.m137615b((C103544k0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C103544k0 k0Var2 = C103544k0.f305775q;
            if (k0Var2 != null && k0Var2.f305776d == view) {
                k0Var2.mo144387a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C103544k0(view, charSequence);
    }
}
