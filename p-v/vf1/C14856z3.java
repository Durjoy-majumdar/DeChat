package vf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9854m5;

/* renamed from: vf1.z3 */
public final class C14856z3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> f40872d;

    /* renamed from: vf1.z3$a */
    public static final class C14857a implements C85878m2.C85879a {

        /* renamed from: a */
        public final /* synthetic */ FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> f40873a;

        public C14857a(FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> finderLoaderFeedUI) {
            this.f40873a = finderLoaderFeedUI;
        }

        /* renamed from: a */
        public void mo4167a() {
            FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> finderLoaderFeedUI = this.f40873a;
            int i = FinderLoaderFeedUI.f14616r;
            finderLoaderFeedUI.mo3055Q7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4168b() {
            FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> finderLoaderFeedUI = this.f40873a;
            int i = FinderLoaderFeedUI.f14616r;
            finderLoaderFeedUI.mo3055Q7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
        }
    }

    public C14856z3(FinderLoaderFeedUI<BaseFinderFeedLoader, C9854m5, FinderLoaderFeedUIContract$Presenter> finderLoaderFeedUI) {
        this.f40872d = finderLoaderFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85878m2.m106216e(this.f40872d.getTaskId(), new C14857a(this.f40872d));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
