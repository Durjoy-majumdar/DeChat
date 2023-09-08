package pf1;

import as1.C0201a;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: pf1.h0 */
public final class C11902h0 extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C0201a f34776d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11902h0(C0201a aVar) {
        super(0);
        this.f34776d = aVar;
    }

    public Object invoke() {
        C0201a aVar = this.f34776d;
        PullDownListView pullDownListView = aVar != null ? (PullDownListView) aVar.findViewById(16908298) : null;
        boolean z = true;
        if (pullDownListView != null && pullDownListView.canScrollVertically(-1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
