package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderBaseFeedUI;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9640c;
import kf1.C9707f;

/* renamed from: vf1.k */
public final class C14784k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBaseFeedUI<C9707f, C9640c> f40767d;

    public C14784k(FinderBaseFeedUI<C9707f, C9640c> finderBaseFeedUI) {
        this.f40767d = finderBaseFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40767d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
