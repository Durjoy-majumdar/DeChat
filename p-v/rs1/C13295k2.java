package rs1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: rs1.k2 */
public final class C13295k2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f37733d;

    public C13295k2(C60905o oVar) {
        this.f37733d = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f37733d.mo85812D(C0966R.C0970id.g6w).performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
