package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizListUI;

/* renamed from: vf1.o1 */
public final class C65718o1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizListUI f189074d;

    public C65718o1(FinderLiveBizListUI finderLiveBizListUI) {
        this.f189074d = finderLiveBizListUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f189074d.finish();
        return true;
    }
}
