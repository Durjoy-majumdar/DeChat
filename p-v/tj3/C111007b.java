package tj3;

import android.view.ViewTreeObserver;

/* renamed from: tj3.b */
public class C111007b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C111004a f332458d;

    public C111007b(C111004a aVar) {
        this.f332458d = aVar;
    }

    public void onGlobalLayout() {
        this.f332458d.f332443g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f332458d.mo162686l(this.f332458d.f332443g.getMeasuredWidth(), this.f332458d.f332443g.getMeasuredHeight());
    }
}
