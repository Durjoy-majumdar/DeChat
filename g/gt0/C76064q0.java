package gt0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: gt0.q0 */
public final class C76064q0 {

    /* renamed from: a */
    public static final C76064q0 f222911a = new C76064q0();

    /* renamed from: a */
    public final void mo106274a(Context context, View view, View view2, int i, C79774c cVar, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(cVar, "window");
        ViewParent viewParent = null;
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        int i2 = C0966R.dimen.f4144u0;
        boolean z2 = true;
        if (i == 1 || i == 3) {
            if (view2 != null) {
                viewParent = view2.getParent();
            }
            if (viewParent instanceof RelativeLayout) {
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                Resources resources = context.getResources();
                if (!z) {
                    i2 = C0966R.dimen.f4142ty;
                }
                layoutParams2.bottomMargin = resources.getDimensionPixelSize(i2);
            }
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = context.getResources().getDimensionPixelSize(C0966R.dimen.f4147og);
            }
            if (!cVar.shouldInLargeScreenCompatMode()) {
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                layoutParams4.width = context.getResources().getDimensionPixelSize(C0966R.dimen.f4146u2);
                view.setLayoutParams(layoutParams4);
                return;
            }
            return;
        }
        if ((view2 != null ? view2.getParent() : null) instanceof RelativeLayout) {
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams;
            Resources resources2 = context.getResources();
            if (!z) {
                i2 = C0966R.dimen.f4143tz;
            }
            layoutParams5.bottomMargin = resources2.getDimensionPixelSize(i2);
        }
        if (!cVar.shouldInLargeScreenCompatMode()) {
            if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
                z2 = false;
            }
            if (z2) {
                if (view2 != null) {
                    viewParent = view2.getParent();
                }
                if (viewParent instanceof RelativeLayout) {
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = context.getResources().getDimensionPixelSize(C0966R.dimen.f4142ty);
                    return;
                }
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
        layoutParams6.width = -1;
        view.setLayoutParams(layoutParams6);
    }
}
