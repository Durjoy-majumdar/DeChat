package qj1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import gy3.C8479f0;

/* renamed from: qj1.v5 */
public final class C63045v5 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ View f178909d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Drawable> f178910e;

    public C63045v5(View view, C8479f0<Drawable> f0Var) {
        this.f178909d = view;
        this.f178910e = f0Var;
    }

    public final void onDismiss() {
        this.f178909d.setBackground((Drawable) this.f178910e.f27484d);
    }
}
