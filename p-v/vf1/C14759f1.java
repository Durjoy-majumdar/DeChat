package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorCommentManagerUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.f1 */
public final class C14759f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorCommentManagerUI f40733d;

    public C14759f1(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        this.f40733d = finderLiveAnchorCommentManagerUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCommentManagerUI$initPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40733d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCommentManagerUI$initPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
