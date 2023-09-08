package qj1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import gy3.C8479f0;

/* renamed from: qj1.s5 */
public final class C62971s5 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ View f178676d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Drawable> f178677e;

    public C62971s5(View view, C8479f0<Drawable> f0Var) {
        this.f178676d = view;
        this.f178677e = f0Var;
    }

    public final void onDismiss() {
        this.f178676d.setBackground((Drawable) this.f178677e.f27484d);
    }
}
