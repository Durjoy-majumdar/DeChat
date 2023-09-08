package p463c0;

import android.graphics.Rect;
import android.view.View;
import gy3.C87412m;
import p1166z0.C112541g;
import p631o1.C109857o;
import p631o1.C109861p;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: c0.a */
public final class C104189a implements C104192d {

    /* renamed from: d */
    public final View f308453d;

    public C104189a(View view) {
        C87412m.m108594g(view, "view");
        this.f308453d = view;
    }

    /* renamed from: b */
    public Object mo145807b(C112541g gVar, C109857o oVar, C15601d<? super C13598b0> dVar) {
        C112541g d = gVar.mo164263d(C109861p.m149328d(oVar));
        this.f308453d.requestRectangleOnScreen(new Rect((int) d.f336961a, (int) d.f336962b, (int) d.f336963c, (int) d.f336964d), false);
        return C13598b0.f38549a;
    }
}
