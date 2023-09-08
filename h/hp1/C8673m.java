package hp1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hp1.m */
public final class C8673m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f27865d;

    public C8673m(FinderFeedSearchUI finderFeedSearchUI) {
        this.f27865d = finderFeedSearchUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f27865d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
