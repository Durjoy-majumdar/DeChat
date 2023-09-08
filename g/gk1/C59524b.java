package gk1;

import android.graphics.Point;
import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gk1.b */
public final class C59524b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59522a f170141d;

    /* renamed from: e */
    public final /* synthetic */ Point f170142e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59524b(C59522a aVar, Point point) {
        super(0);
        this.f170141d = aVar;
        this.f170142e = point;
    }

    public Object invoke() {
        ViewGroup.LayoutParams layoutParams = this.f170141d.f170127j.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Point point = this.f170142e;
        marginLayoutParams.width = point.x;
        marginLayoutParams.height = point.y;
        ViewGroup.LayoutParams layoutParams2 = this.f170141d.f170138x.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        Point point2 = this.f170142e;
        marginLayoutParams2.width = point2.x;
        marginLayoutParams2.height = point2.y;
        this.f170141d.f170138x.requestLayout();
        this.f170141d.f170127j.requestLayout();
        return C13598b0.f38549a;
    }
}
