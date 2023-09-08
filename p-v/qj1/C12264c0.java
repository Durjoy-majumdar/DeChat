package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import d60.C58124b;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import te3.C49712hj1;
import wg1.C15324n;
import wg1.C15328o;
import wg1.C15333p;
import wg1.C15349s;

/* renamed from: qj1.c0 */
public final class C12264c0 extends C62660c implements C11385n {

    /* renamed from: p */
    public final C58124b f35349p;

    /* renamed from: q */
    public C15324n f35350q;

    /* renamed from: qj1.c0$a */
    public /* synthetic */ class C12265a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35351a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[203] = 1;
            f35351a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12264c0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35349p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f35350q = new C15333p(context, mo87684A0(), bVar);
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C15349s sVar = new C15349s(viewGroup, (MMActivity) context2, this.f35350q);
        C15324n nVar = this.f35350q;
        if (nVar != null) {
            nVar.onAttach(sVar);
        }
        if (mo82893g0()) {
            C62042e.f176370a.mo87074e(this, false);
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(viewGroup.getContext());
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C15328o oVar;
        C87412m.m108594g(bVar, "status");
        if (C12265a.f35351a[bVar.ordinal()] == 1) {
            String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL") : null;
            C15324n nVar = this.f35350q;
            if (nVar != null && (oVar = ((C15333p) nVar).f41664f) != null) {
                oVar.mo14174R(string);
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
    }
}
