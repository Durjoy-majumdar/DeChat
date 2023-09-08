package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameSelectUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.i0 */
public final class C65703i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderGameSelectUI f189049d;

    public C65703i0(FinderGameSelectUI finderGameSelectUI) {
        this.f189049d = finderGameSelectUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f189049d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
