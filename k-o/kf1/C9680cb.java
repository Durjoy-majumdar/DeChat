package kf1;

import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60898l;
import rx3.C13598b0;

/* renamed from: kf1.cb */
public final class C9680cb extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10029wa f30068d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9680cb(C10029wa waVar) {
        super(0);
        this.f30068d = waVar;
    }

    public Object invoke() {
        RecyclerView recyclerView = this.f30068d.mo10486e().getRecyclerView();
        this.f30068d.f30746u.getClass();
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
        RecyclerView.C16631z b6 = C60898l.m71330b6((C60898l) adapter, 512, false, 2, (Object) null);
        Integer valueOf = b6 != null ? Integer.valueOf(b6.mo17363j()) : null;
        if (valueOf != null) {
            valueOf.intValue();
            RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(valueOf.intValue());
            }
        }
        return C13598b0.f38549a;
    }
}
