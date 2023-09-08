package hp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hp1.o0 */
public final class C8678o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8684r0 f27869d;

    public C8678o0(C8684r0 r0Var) {
        this.f27869d = r0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f27869d.f27879e.mo3908b0();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
