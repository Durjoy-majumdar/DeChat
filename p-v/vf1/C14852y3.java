package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9854m5;

/* renamed from: vf1.y3 */
public final class C14852y3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> f40866d;

    public C14852y3(FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> finderLoaderFeedUI) {
        this.f40866d = finderLoaderFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40866d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$fixActionBarStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
