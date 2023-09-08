package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameSelectUI;
import er1.C58777u0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.l0 */
public final class C65711l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderGameSelectUI f189057d;

    public C65711l0(FinderGameSelectUI finderGameSelectUI) {
        this.f189057d = finderGameSelectUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI$initViews$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58777u0.f168283a.mo83838g(3, (String) null);
        FinderGameSelectUI.m63555O7(this.f189057d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI$initViews$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
