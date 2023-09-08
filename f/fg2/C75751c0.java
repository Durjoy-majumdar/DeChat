package fg2;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: fg2.c0 */
public final class C75751c0 {

    /* renamed from: fg2.c0$a */
    public static final class C75752a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ View f222352d;

        /* renamed from: e */
        public final /* synthetic */ int f222353e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75752a(View view, int i) {
            super(0);
            this.f222352d = view;
            this.f222353e = i;
        }

        public Object invoke() {
            View findViewById = this.f222352d.findViewById(this.f222353e);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type T of com.tencent.mm.plugin.radar.ui.ViewBindKt.bind");
            return findViewById;
        }
    }

    /* renamed from: a */
    public static final <T extends View> C13601g<T> m91019a(View view, int i) {
        C87412m.m108594g(view, "<this>");
        return C36568h.m40986b(C13602i.NONE, new C75752a(view, i));
    }
}
