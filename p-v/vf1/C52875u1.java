package vf1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizPrepareUI;

/* renamed from: vf1.u1 */
public final class C52875u1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizPrepareUI f147674d;

    public C52875u1(FinderLiveBizPrepareUI finderLiveBizPrepareUI) {
        this.f147674d = finderLiveBizPrepareUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f147674d.finish();
        return true;
    }
}
