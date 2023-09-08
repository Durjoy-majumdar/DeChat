package xk1;

import android.view.View;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.ArrayList;
import p749xh.C66276va;

/* renamed from: xk1.p1 */
public final class C66341p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66320l1 f190972d;

    public C66341p1(C66320l1 l1Var) {
        this.f190972d = l1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$setFold$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f190972d.mo90435j3(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, (C66276va) null);
        C66320l1 l1Var = this.f190972d;
        l1Var.mo90436k3(l1Var.f190921j);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveMentionUIC$setFold$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
