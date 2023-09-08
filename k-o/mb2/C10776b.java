package mb2;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import kg3.C76577a;

/* renamed from: mb2.b */
public final class C10776b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f32246d;

    /* renamed from: e */
    public final /* synthetic */ View f32247e;

    public C10776b(View view, View view2) {
        this.f32246d = view;
        this.f32247e = view2;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f32246d.getHitRect(rect);
        rect.left -= C76577a.m92151b(this.f32246d.getContext(), 20);
        rect.top -= C76577a.m92151b(this.f32246d.getContext(), 20);
        rect.right += C76577a.m92151b(this.f32246d.getContext(), 20);
        rect.bottom += C76577a.m92151b(this.f32246d.getContext(), 20);
        this.f32247e.setTouchDelegate(new TouchDelegate(rect, this.f32246d));
    }
}
