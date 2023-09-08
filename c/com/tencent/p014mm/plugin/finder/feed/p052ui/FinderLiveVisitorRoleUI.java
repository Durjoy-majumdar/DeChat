package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C110826x0;
import xk1.C15771r2;
import xk1.C53365q2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI */
public final class FinderLiveVisitorRoleUI extends MMFinderUI {

    /* renamed from: o */
    public final String f111554o = "FinderLiveVisitorRoleUI";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI$a */
    public static final class C41424a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVisitorRoleUI f111555d;

        public C41424a(FinderLiveVisitorRoleUI finderLiveVisitorRoleUI) {
            this.f111555d = finderLiveVisitorRoleUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111555d.onBackPressed();
            return true;
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f111554o;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359761al0;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C15771r2.class, FinderLiveVisitorGameRankSwitchUIC.class, C53365q2.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f360704ea2);
        setBackBtn(new C41424a(this), C0966R.raw.icons_filled_close);
    }
}
