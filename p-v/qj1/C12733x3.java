package qj1;

import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C87412m;
import ok1.C62042e;
import te3.C49712hj1;

/* renamed from: qj1.x3 */
public final class C12733x3 extends C62660c {

    /* renamed from: p */
    public final C58124b f36475p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12733x3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36475p = bVar;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd((int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3718c_));
        marginLayoutParams.setMarginStart(mo82893g0() ? C62042e.f176370a.mo87080g0(this) + ((int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3723cd)) : (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.mqn);
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup2.getChildAt(i);
            ViewGroup.LayoutParams layoutParams2 = childAt != null ? childAt.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null && mo82893g0()) {
                marginLayoutParams2.topMargin = 0;
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
