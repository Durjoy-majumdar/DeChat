package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.x0 */
public final class C13526x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13535y0 f38357d;

    public C13526x0(C13535y0 y0Var) {
        this.f38357d = y0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAtManagerHeaderUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AtFeedSelectStateMachine atFeedSelectStateMachine = this.f38357d.f38380j;
        if (atFeedSelectStateMachine != null) {
            AtFeedSelectStateMachine.C4245c cVar = AtFeedSelectStateMachine.C4245c.ENTER;
            int ordinal = atFeedSelectStateMachine.f18567c.ordinal();
            if (ordinal == 0) {
                atFeedSelectStateMachine.mo5110d(true);
                atFeedSelectStateMachine.mo5109c(cVar);
            } else if (ordinal != 4) {
                Log.m105924i("Finder.AtFeedSelectStateMachine", "enterSelect transition error! state:" + atFeedSelectStateMachine.f18567c);
            } else {
                atFeedSelectStateMachine.mo5110d(true);
                atFeedSelectStateMachine.mo5109c(cVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAtManagerHeaderUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("stateMachine");
        throw null;
    }
}
