package xk1;

import android.view.View;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gg1.C32444a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: xk1.f1 */
public final class C15734f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15728e1 f42450d;

    public C15734f1(C15728e1 e1Var) {
        this.f42450d = e1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32444a.f86121a.mo58623d(1);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, Boolean.TRUE);
        this.f42450d.mo14456c3();
        C32224a<C13598b0> aVar = this.f42450d.f42441o;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
