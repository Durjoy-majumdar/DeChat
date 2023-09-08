package qq0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: qq0.z */
public final class C89829z {
    /* renamed from: a */
    public static final void m112322a(View view) {
        C87412m.m108594g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = view.getResources().getDimensionPixelSize(C0966R.dimen.f4085r0);
            view.requestLayout();
        }
    }

    /* renamed from: b */
    public static final void m112323b(View view) {
        View view2;
        C87412m.m108594g(view, "<this>");
        Log.m105924i("Luggage.WAGameCapsuleBarStyleApplier", "setupCapsuleMarginsForGame, this:" + view.getClass().getSimpleName() + ", context:" + view.getContext().getClass().getSimpleName() + ", density:" + view.getResources().getDisplayMetrics().density);
        if (view instanceof C89796d) {
            view2 = ((C89796d) view).getCapsuleContentAreaView();
        } else if (view instanceof AppBrandCapsuleBarPlaceHolderView) {
            view2 = view;
        } else {
            throw new IllegalStateException("Unrecognized View class".toString());
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = view.getResources().getDimensionPixelSize(C0966R.dimen.f4056q2) + view.getResources().getDimensionPixelSize(C0966R.dimen.f4084qz);
            view2.requestLayout();
        }
    }
}
