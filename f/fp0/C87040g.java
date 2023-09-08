package fp0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import gy3.C87412m;

/* renamed from: fp0.g */
public final class C87040g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ View f252587d;

    /* renamed from: e */
    public final /* synthetic */ C87041h f252588e;

    public C87040g(View view, C87041h hVar) {
        this.f252587d = view;
        this.f252588e = hVar;
    }

    public boolean onPreDraw() {
        this.f252587d.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout relativeLayout = this.f252588e.f252614x;
        if (relativeLayout != null) {
            ViewParent parent = relativeLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return true;
            }
            int measuredHeight = viewGroup.getMeasuredHeight();
            RelativeLayout relativeLayout2 = this.f252588e.f252614x;
            if (relativeLayout2 == null) {
                C87412m.m108603p("mRootView");
                throw null;
            } else if (measuredHeight <= relativeLayout2.getMeasuredHeight()) {
                return true;
            } else {
                RelativeLayout relativeLayout3 = this.f252588e.f252614x;
                if (relativeLayout3 != null) {
                    ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = viewGroup.getMeasuredHeight();
                    }
                    RelativeLayout relativeLayout4 = this.f252588e.f252614x;
                    if (relativeLayout4 != null) {
                        relativeLayout4.requestLayout();
                        return true;
                    }
                    C87412m.m108603p("mRootView");
                    throw null;
                }
                C87412m.m108603p("mRootView");
                throw null;
            }
        } else {
            C87412m.m108603p("mRootView");
            throw null;
        }
    }
}
