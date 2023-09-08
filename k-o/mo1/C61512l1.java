package mo1;

import android.view.View;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import mo1.C61514m1;

/* renamed from: mo1.l1 */
public final class C61512l1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61514m1 f174866d;

    /* renamed from: e */
    public final /* synthetic */ C61514m1.C61515a f174867e;

    public C61512l1(C61514m1 m1Var, C61514m1.C61515a aVar) {
        this.f174866d = m1Var;
        this.f174867e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileQQMusicUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RefreshLoadMoreLayout d3 = this.f174866d.mo86478d3();
        C87412m.m108593f(d3, "rlLayout");
        RefreshLoadMoreLayout.m66897N(d3, 0, false, 3, (Object) null);
        this.f174867e.mo5115a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileQQMusicUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
