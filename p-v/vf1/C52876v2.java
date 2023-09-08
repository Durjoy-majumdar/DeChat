package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderSearchUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.v2 */
public final class C52876v2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderSearchUI f147675d;

    public C52876v2(FinderLiveOrderSearchUI finderLiveOrderSearchUI) {
        this.f147675d = finderLiveOrderSearchUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveOrderSearchUI finderLiveOrderSearchUI = this.f147675d;
        finderLiveOrderSearchUI.mo64511N7(finderLiveOrderSearchUI.f111533w);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
