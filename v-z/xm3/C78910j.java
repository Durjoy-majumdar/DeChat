package xm3;

import android.view.View;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import j20.C117292a;
import java.util.ArrayList;
import tm3.C78051b;

/* renamed from: xm3.j */
public final class C78910j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78904i f231776d;

    public C78910j(C78904i iVar) {
        this.f231776d = iVar;
    }

    public final void onClick(View view) {
        UIStateCenter stateCenter;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/base/SelectContactBottomMenuUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BaseMvvmActivity d3 = this.f231776d.mo14598d3();
        if (!(d3 == null || (stateCenter = d3.getStateCenter()) == null)) {
            stateCenter.dispatch(new C78051b());
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactBottomMenuUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
