package qj1;

import com.tencent.p014mm.plugin.finder.live.multistream.MultiStreamRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: qj1.bf */
public final class C62658bf extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63170ze f177933d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62658bf(C63170ze zeVar) {
        super(0);
        this.f177933d = zeVar;
    }

    public Object invoke() {
        MultiStreamRecyclerView multiStreamRecyclerView;
        this.f177933d.f179244r.setAlpha(1.0f);
        C62843kb kbVar = (C62843kb) this.f177933d.mo87687E0(C62843kb.class);
        if (kbVar != null) {
            multiStreamRecyclerView = kbVar.mo87804b1().f159429b;
            C87412m.m108593f(multiStreamRecyclerView, "multiRecyclerView");
        } else {
            multiStreamRecyclerView = null;
        }
        if (multiStreamRecyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            MultiStreamRecyclerView multiStreamRecyclerView2 = multiStreamRecyclerView;
            C117292a.m165358d(multiStreamRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$startPlay$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            multiStreamRecyclerView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(multiStreamRecyclerView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$startPlay$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return C13598b0.f38549a;
    }
}
