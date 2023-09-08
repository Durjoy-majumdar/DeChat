package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.x7 */
public final class C13532x7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f38371d;

    public C13532x7(C4191v0 v0Var) {
        this.f38371d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderPostQualificationUIC$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f38371d.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPostQualificationUIC$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
