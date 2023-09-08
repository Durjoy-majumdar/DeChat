package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ky2.C10432i;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49712hj1;
import wg1.C15253a;
import wg1.C15300h;
import wg1.C15303i;

/* renamed from: qj1.a0 */
public final class C12238a0 extends C62660c implements C11385n {

    /* renamed from: p */
    public C15253a f35311p;

    /* renamed from: qj1.a0$a */
    public static final class C12239a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12238a0 f35312d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12239a(C12238a0 a0Var) {
            super(1);
            this.f35312d = a0Var;
        }

        public Object invoke(Object obj) {
            this.f35312d.mo10792g(((Number) obj).intValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.a0$b */
    public /* synthetic */ class C12240b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35313a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f35313a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12238a0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f35311p = new C15300h(viewGroup, context, mo87684A0(), bVar, mo14484z0());
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C15303i iVar = new C15303i(viewGroup, (MMActivity) context2, this.f35311p, new C12239a(this));
        C15253a aVar = this.f35311p;
        if (aVar != null) {
            aVar.onAttach(iVar);
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
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w("FinderLiveAllowanceGiftBubblePlugin", "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        Log.m105924i("FinderLiveAllowanceGiftBubblePlugin", "#mount");
        C15253a aVar = this.f35311p;
        if (aVar != null) {
            ((C15300h) aVar).mo14163q();
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C15253a aVar;
        C87412m.m108594g(bVar, "status");
        if (C12240b.f35313a[bVar.ordinal()] == 1 && (aVar = this.f35311p) != null) {
            ((C15300h) aVar).mo14163q();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        Log.m105924i("FinderLiveAllowanceGiftBubblePlugin", "#unMount");
        C15253a aVar = this.f35311p;
        if (aVar != null) {
            ((C15300h) aVar).onDetach();
        }
    }
}
