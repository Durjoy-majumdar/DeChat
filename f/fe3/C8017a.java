package fe3;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import kg3.C76577a;

/* renamed from: fe3.a */
public final class C8017a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f26703d;

    /* renamed from: e */
    public final /* synthetic */ View f26704e;

    public C8017a(View view, View view2) {
        this.f26703d = view;
        this.f26704e = view2;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f26703d.getHitRect(rect);
        rect.left -= C76577a.m92151b(this.f26703d.getContext(), 20);
        rect.top -= C76577a.m92151b(this.f26703d.getContext(), 20);
        rect.right += C76577a.m92151b(this.f26703d.getContext(), 20);
        rect.bottom += C76577a.m92151b(this.f26703d.getContext(), 20);
        this.f26704e.setTouchDelegate(new TouchDelegate(rect, this.f26703d));
    }
}
