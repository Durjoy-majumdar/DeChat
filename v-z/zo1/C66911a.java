package zo1;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bp1.C54519d;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import gy3.C87412m;
import kg3.C76577a;
import ok1.C62042e;
import qj1.C62660c;
import te3.C49712hj1;

/* renamed from: zo1.a */
public final class C66911a extends C62660c {

    /* renamed from: p */
    public final C58124b f192269p;

    /* renamed from: zo1.a$a */
    public static final class C66912a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66911a f192270d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f192271e;

        public C66912a(C66911a aVar, ViewGroup viewGroup) {
            this.f192270d = aVar;
            this.f192271e = viewGroup;
        }

        public final void run() {
            if (this.f192270d.mo82893g0() && this.f192271e.getLayoutParams() != null && (this.f192271e.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.LayoutParams layoutParams = this.f192271e.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.LayoutParams layoutParams2 = this.f192271e.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() + C76577a.m92151b(this.f192271e.getContext(), 16));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66911a(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192269p = bVar;
        if (((C54519d) mo87696x0(C54519d.class)).f152861x) {
            mo10792g(8);
            return;
        }
        C62042e.f176370a.mo87074e(this, false);
        viewGroup.post(new C66912a(this, viewGroup));
    }

    /* renamed from: Z0 */
    public final void mo90906Z0(int i) {
        if (!((C54519d) mo87696x0(C54519d.class)).f152861x) {
            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i + C75044y4.m89991c(MMApplicationContext.getContext());
            this.f166287d.setLayoutParams(layoutParams2);
            this.f166287d.setVisibility(0);
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
