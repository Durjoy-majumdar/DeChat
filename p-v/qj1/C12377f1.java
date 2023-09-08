package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveDescEditView;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: qj1.f1 */
public final class C12377f1 extends C62660c {

    /* renamed from: p */
    public final C58124b f35637p;

    /* renamed from: q */
    public FinderLiveDescEditView f35638q;

    /* renamed from: qj1.f1$a */
    public static final class C12378a implements View.OnClickListener {

        /* renamed from: d */
        public static final C12378a f35639d = new C12378a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorDescEditPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorDescEditPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.f1$b */
    public /* synthetic */ class C12379b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35640a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[195] = 1;
            f35640a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12377f1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35637p = bVar;
        viewGroup.setOnClickListener(C12378a.f35639d);
    }

    /* renamed from: Z0 */
    public final void mo12062Z0(boolean z) {
        Class cls = C54991o.class;
        ((C54991o) mo87696x0(cls)).f154286Z = z;
        C58124b bVar = this.f35637p;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((C54991o) mo87696x0(cls)).f154286Z);
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        FinderLiveDescEditView finderLiveDescEditView;
        if (mo14483f0() != 0 || (finderLiveDescEditView = this.f35638q) == null || finderLiveDescEditView.getVisibility() != 0) {
            return false;
        }
        finderLiveDescEditView.mo3401a();
        C32224a<C13598b0> aVar = finderLiveDescEditView.f15372h;
        if (aVar != null) {
            aVar.invoke();
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C12379b.f35640a[bVar.ordinal()] == 1) {
            mo12062Z0(true);
            Class cls = C54991o.class;
            if (this.f35638q == null) {
                Context context = this.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                FinderLiveDescEditView finderLiveDescEditView = new FinderLiveDescEditView(context);
                this.f35638q = finderLiveDescEditView;
                this.f166287d.addView(finderLiveDescEditView);
            }
            FinderLiveDescEditView finderLiveDescEditView2 = this.f35638q;
            C87412m.m108591d(finderLiveDescEditView2);
            finderLiveDescEditView2.mo3403c(((C54991o) mo87684A0().mo71262a(cls)).f154252S0, ((C54991o) mo87696x0(cls)).f154190D, new C12434h1(this), new C12446i1(this), true);
            Object systemService = this.f166287d.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.f35638q, 1);
            mo10792g(0);
        }
    }
}
