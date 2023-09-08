package fp0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import gy3.C87412m;

/* renamed from: fp0.b */
public final class C87031b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ View f252548d;

    /* renamed from: e */
    public final /* synthetic */ C87032c f252549e;

    public C87031b(View view, C87032c cVar) {
        this.f252548d = view;
        this.f252549e = cVar;
    }

    public boolean onPreDraw() {
        this.f252548d.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout relativeLayout = this.f252549e.f252577y;
        if (relativeLayout != null) {
            ViewParent parent = relativeLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return true;
            }
            int measuredHeight = viewGroup.getMeasuredHeight();
            RelativeLayout relativeLayout2 = this.f252549e.f252577y;
            if (relativeLayout2 == null) {
                C87412m.m108603p("requestContainer");
                throw null;
            } else if (measuredHeight <= relativeLayout2.getMeasuredHeight()) {
                return true;
            } else {
                RelativeLayout relativeLayout3 = this.f252549e.f252577y;
                if (relativeLayout3 != null) {
                    ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = viewGroup.getMeasuredHeight();
                    }
                    RelativeLayout relativeLayout4 = this.f252549e.f252577y;
                    if (relativeLayout4 != null) {
                        relativeLayout4.requestLayout();
                        return true;
                    }
                    C87412m.m108603p("requestContainer");
                    throw null;
                }
                C87412m.m108603p("requestContainer");
                throw null;
            }
        } else {
            C87412m.m108603p("requestContainer");
            throw null;
        }
    }
}
