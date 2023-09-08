package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.v0 */
public final class C13482v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13535y0 f38202d;

    public C13482v0(C13535y0 y0Var) {
        this.f38202d = y0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAtManagerHeaderUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AtFeedSelectStateMachine atFeedSelectStateMachine = this.f38202d.f38380j;
        if (atFeedSelectStateMachine != null) {
            atFeedSelectStateMachine.mo5110d(false);
            atFeedSelectStateMachine.mo5109c(AtFeedSelectStateMachine.C4245c.EXIT);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAtManagerHeaderUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("stateMachine");
        throw null;
    }
}
