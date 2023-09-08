package g92;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: g92.b */
public final class C107788b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107789c f322607d;

    public C107788b(C107789c cVar) {
        this.f322607d = cVar;
    }

    public final void run() {
        ViewParent viewParent;
        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = this.f322607d.f322610c;
        if (floatMultiTaskIndicatorView != null) {
            ViewParent viewParent2 = null;
            if (floatMultiTaskIndicatorView != null) {
                try {
                    viewParent = floatMultiTaskIndicatorView.getParent();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FloatMultiTaskIndicatorController", e, "detachFloatIndicatorView exception:%s", e);
                    return;
                }
            } else {
                viewParent = null;
            }
            if (viewParent != null) {
                FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = this.f322607d.f322610c;
                if (floatMultiTaskIndicatorView2 != null) {
                    viewParent2 = floatMultiTaskIndicatorView2.getParent();
                }
                C87412m.m108592e(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) viewParent2).removeView(this.f322607d.f322610c);
            }
        }
    }
}
