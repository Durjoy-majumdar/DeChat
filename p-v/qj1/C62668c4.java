package qj1;

import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import gy3.C87412m;
import te3.C49712hj1;

/* renamed from: qj1.c4 */
public final class C62668c4 extends C62660c {

    /* renamed from: p */
    public final C58124b f177952p;

    /* renamed from: qj1.c4$a */
    public static final class C62669a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f177953d;

        /* renamed from: e */
        public final /* synthetic */ int f177954e;

        public C62669a(ViewGroup viewGroup, int i) {
            this.f177953d = viewGroup;
            this.f177954e = i;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f177953d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f177954e + C75044y4.m89991c(this.f177953d.getContext());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62668c4(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f177952p = bVar;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (!mo82893g0()) {
            viewGroup.post(new C62669a(viewGroup, i));
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
        return true;
    }
}
