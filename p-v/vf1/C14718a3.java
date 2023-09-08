package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.a3 */
public final class C14718a3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderUI f40677d;

    public C14718a3(FinderLiveOrderUI finderLiveOrderUI) {
        this.f40677d = finderLiveOrderUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderUI$checkShop$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40677d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderUI$checkShop$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
