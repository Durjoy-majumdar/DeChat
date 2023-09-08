package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import di3.C86312j;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C63639u7;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiRelateListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI */
public final class FinderPoiRelateListUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI$a */
    public static final class C55834a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiRelateListUI f159029d;

        public C55834a(FinderPoiRelateListUI finderPoiRelateListUI) {
            this.f159029d = finderPoiRelateListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f159029d.finish();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 124;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C63639u7.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C55834a(this));
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setMMTitle(getResources().getString(C0966R.string.egy));
        hideActionbarLine();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderPoiRelateListUI).mo86179qs(this, C76986a.Finder);
    }
}
