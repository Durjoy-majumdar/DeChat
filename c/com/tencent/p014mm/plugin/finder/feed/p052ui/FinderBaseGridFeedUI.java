package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import kf1.C9732g;
import kf1.C9753h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lkf1/h;", "V", "Lkf1/g;", "P", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI */
public abstract class FinderBaseGridFeedUI<V extends C9753h, P extends C9732g> extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI$a */
    public static final class C2890a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseGridFeedUI<V, P> f14259d;

        public C2890a(FinderBaseGridFeedUI<V, P> finderBaseGridFeedUI) {
            this.f14259d = finderBaseGridFeedUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14259d.onBackPressed();
            return true;
        }
    }

    /* renamed from: N7 */
    public abstract P mo2960N7();

    /* renamed from: O7 */
    public abstract V mo2961O7();

    /* renamed from: P7 */
    public void mo2962P7() {
    }

    /* renamed from: Q7 */
    public abstract void mo2963Q7();

    public void onBackPressed() {
        mo2960N7().getClass();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo2963Q7();
        setBackBtn(new C2890a(this));
        mo2960N7().mo2525t(mo2961O7());
        mo2962P7();
    }

    public void onDestroy() {
        super.onDestroy();
        mo2960N7().onDetach();
    }

    public void onPause() {
        super.onPause();
        mo2960N7().mo2526x();
    }

    public void onResume() {
        super.onResume();
        mo2960N7().mo2514G();
    }
}
