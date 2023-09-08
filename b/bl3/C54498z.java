package bl3;

import c14.C54624g;
import d14.C58017a1;
import d14.C58085t0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: bl3.z */
public class C54498z implements Cloneable {

    /* renamed from: d */
    public final C13601g f152777d = C36568h.m40985a(C54499a.f152778d);

    /* renamed from: bl3.z$a */
    public static final class C54499a extends C87413o implements C32224a<C58085t0<C54498z>> {

        /* renamed from: d */
        public static final C54499a f152778d = new C54499a();

        public C54499a() {
            super(0);
        }

        public Object invoke() {
            return C58017a1.m67172a(0, Integer.MAX_VALUE, C54624g.DROP_OLDEST);
        }
    }

    public Object clone() {
        Object clone = super.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type com.tencent.mm.ui.component.UicState");
        return (C54498z) clone;
    }
}
