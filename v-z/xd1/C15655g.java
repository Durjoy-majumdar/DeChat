package xd1;

import android.view.View;
import android.view.ViewTreeObserver;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import zp3.C79406f;

/* renamed from: xd1.g */
public final class C15655g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C15644c f42327d;

    public C15655g(C15644c cVar) {
        this.f42327d = cVar;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f42327d.f42282C;
        C87412m.m108591d(view);
        float y = view.getY();
        View view2 = this.f42327d.f42282C;
        C87412m.m108591d(view2);
        float height = y + ((float) view2.getHeight()) + ((float) C79406f.m96347a(this.f42327d.getContext(), 36.0f));
        C15644c cVar = this.f42327d;
        if (!(cVar.f42302u == height)) {
            cVar.f42302u = height;
            C32226l<? super Float, C13598b0> lVar = cVar.f42303v;
            if (lVar != null) {
                lVar.invoke(Float.valueOf(height));
            }
        }
        View view3 = this.f42327d.f42282C;
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
