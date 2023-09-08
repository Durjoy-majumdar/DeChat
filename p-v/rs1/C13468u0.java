package rs1;

import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.u0 */
public final class C13468u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13535y0 f38173d;

    public C13468u0(C13535y0 y0Var) {
        this.f38173d = y0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAtManagerHeaderUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f38173d.getActivity().isFinishing()) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Fy0(1, "manage_return", "", ((C13442s8) C39818r.f106831a.mo62444c(this.f38173d.getActivity()).mo75002a(C13442s8.class)).mo12861q3());
            AtFeedSelectStateMachine atFeedSelectStateMachine = this.f38173d.f38380j;
            if (atFeedSelectStateMachine != null) {
                atFeedSelectStateMachine.mo5109c(AtFeedSelectStateMachine.C4245c.DESTROY);
                this.f38173d.getActivity().finish();
            } else {
                C87412m.m108603p("stateMachine");
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAtManagerHeaderUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
