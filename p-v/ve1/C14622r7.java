package ve1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ve1.r7 */
public final class C14622r7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f40461d;

    /* renamed from: e */
    public final /* synthetic */ int f40462e;

    public C14622r7(C32226l<? super Integer, C13598b0> lVar, int i) {
        this.f40461d = lVar;
        this.f40462e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindMedia$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40461d.invoke(Integer.valueOf(this.f40462e));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindMedia$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
