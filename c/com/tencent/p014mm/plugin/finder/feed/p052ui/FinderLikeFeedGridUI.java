package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderLikeFeedGridFragment;
import di3.C86312j;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C63552g6;
import sx3.C110826x0;
import ts1.C14078c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLikeFeedGridUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLikeFeedGridUI */
public final class FinderLikeFeedGridUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLikeFeedGridUI$a */
    public static final class C2954a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeFeedGridUI f14482d;

        public C2954a(FinderLikeFeedGridUI finderLikeFeedGridUI) {
            this.f14482d = finderLikeFeedGridUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14482d.onBackPressed();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 35;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C63552g6.class, C14078c.class);
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        FinderHomeTabFragment activeFragment = ((C63552g6) C39818r.f106831a.mo62444c(this).mo75002a(C63552g6.class)).getActiveFragment();
        if (activeFragment.f17334o == 102) {
            FinderLikedFeedLoader finderLikedFeedLoader = null;
            FinderLikeFeedGridFragment finderLikeFeedGridFragment = activeFragment instanceof FinderLikeFeedGridFragment ? (FinderLikeFeedGridFragment) activeFragment : null;
            if (finderLikeFeedGridFragment != null) {
                finderLikedFeedLoader = finderLikeFeedGridFragment.mo4183d0();
            }
            if (finderLikedFeedLoader != null) {
                intent.putExtra("INNER_ITEM_COUNT", finderLikedFeedLoader.f13708e);
            }
        }
        setResult(-1, intent);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C2954a(this));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderLikeFeedGridUI).mo86179qs(this, C76986a.Finder);
    }
}
