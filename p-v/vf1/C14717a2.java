package vf1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveCreateVisitorModeUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p140cw.C7138g;

/* renamed from: vf1.a2 */
public final class C14717a2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCreateVisitorModeUI f40676d;

    public C14717a2(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f40676d = finderLiveCreateVisitorModeUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f40676d;
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8317di(finderLiveCreateVisitorModeUI, finderLiveCreateVisitorModeUI.f14497p, 1, 5, (Intent) null, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
