package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.z4 */
public final class C65743z4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f189133d;

    public C65743z4(FinderSharePostUI finderSharePostUI) {
        this.f189133d = finderSharePostUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI$initMaskView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderSharePostUI finderSharePostUI = this.f189133d;
        int i = FinderSharePostUI.f159030v;
        finderSharePostUI.mo77439N7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI$initMaskView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
