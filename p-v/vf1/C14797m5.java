package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vf1.m5 */
public final class C14797m5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUI f40783d;

    public C14797m5(FinderTopicFeedUI finderTopicFeedUI) {
        this.f40783d = finderTopicFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$initCustomActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderTopicFeedUI finderTopicFeedUI = this.f40783d;
        ConcurrentHashMap<Long, FinderItem> concurrentHashMap = FinderTopicFeedUI.f14881D;
        finderTopicFeedUI.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$initCustomActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
