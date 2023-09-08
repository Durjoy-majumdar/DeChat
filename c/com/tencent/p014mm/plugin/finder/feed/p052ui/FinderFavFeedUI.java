package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFavFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Set;
import kf1.C9712f1;
import kf1.C9753h;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C63537a2;
import sx3.C110826x0;
import ts1.C14078c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFavFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI */
public final class FinderFavFeedUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI$a */
    public static final class C2892a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFavFeedUI f14268d;

        public C2892a(FinderFavFeedUI finderFavFeedUI) {
            this.f14268d = finderFavFeedUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14268d.onBackPressed();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 24;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C63537a2.class, C14078c.class);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        FinderHomeTabFragment finderHomeTabFragment;
        RecyclerView recyclerView;
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1 && intent != null) {
            Iterator<T> it = ((C63537a2) C39818r.f106831a.mo62444c(this).mo75002a(C63537a2.class)).mo80061o3().iterator();
            while (true) {
                if (!it.hasNext()) {
                    finderHomeTabFragment = null;
                    break;
                }
                finderHomeTabFragment = (FinderHomeTabFragment) it.next();
                if (finderHomeTabFragment.f17334o == 100 && finderHomeTabFragment.isVisible()) {
                    break;
                }
            }
            FinderFavFeedFragment finderFavFeedFragment = finderHomeTabFragment instanceof FinderFavFeedFragment ? (FinderFavFeedFragment) finderHomeTabFragment : null;
            if (finderFavFeedFragment != null) {
                C9712f1 f1Var = finderFavFeedFragment.f17312r;
                if (f1Var != null) {
                    C9753h hVar = f1Var.f30176f;
                    if (hVar != null && (recyclerView = hVar.getRecyclerView()) != null) {
                        C58784w3.m68439o1(C58784w3.f168295a, intent, recyclerView, f1Var.f30175e, false, (C32226l) null, 24, (Object) null);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        FinderHomeTabFragment activeFragment = ((C63537a2) C39818r.f106831a.mo62444c(this).mo75002a(C63537a2.class)).getActiveFragment();
        if (activeFragment.f17334o == 100) {
            FinderFavFeedLoader finderFavFeedLoader = null;
            FinderFavFeedFragment finderFavFeedFragment = activeFragment instanceof FinderFavFeedFragment ? (FinderFavFeedFragment) activeFragment : null;
            if (finderFavFeedFragment != null) {
                finderFavFeedLoader = finderFavFeedFragment.mo4180d0();
            }
            if (finderFavFeedLoader != null) {
                intent.putExtra("INNER_ITEM_COUNT", finderFavFeedLoader.f13519g);
            }
        }
        setResult(-1, intent);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C2892a(this));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderFavFeedUI).mo86179qs(this, C76986a.Finder);
    }
}
