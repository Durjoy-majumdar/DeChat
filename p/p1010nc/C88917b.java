package p1010nc;

import android.view.View;

/* renamed from: nc.b */
public class C88917b implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C88916a f256460d;

    public C88917b(C88916a aVar) {
        this.f256460d = aVar;
    }

    public void onViewAttachedToWindow(View view) {
        C88916a aVar = this.f256460d;
        View view2 = aVar.f256456f;
        if (view2 != null) {
            view2.setOnClickListener(new a$$a(aVar));
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
