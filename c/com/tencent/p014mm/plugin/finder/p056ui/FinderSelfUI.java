package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.MenuItem;
import ao1.C0145d1;
import bl3.C0324s;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import gy3.C24560g0;
import ht1.C8761d3;
import ht1.C8763e3;
import ht1.C8775i4;
import ht1.C8783m1;
import ht1.C8786n1;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C13146c9;
import sx3.C110826x0;
import ts1.C14078c;
import wc1.C15118s;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelfUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lht1/i4;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfUI */
public final class FinderSelfUI extends MMFinderUI implements C8775i4 {

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelfUI$a */
    public static final class C3718a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelfUI f17057d;

        public C3718a(FinderSelfUI finderSelfUI) {
            this.f17057d = finderSelfUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17057d.onBackPressed();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 95;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13146c9.class, C0324s.m265a(C24560g0.m30725a(C8761d3.class)), C0324s.m265a(C24560g0.m30725a(C8763e3.class)), C0145d1.class, C14078c.class, C15118s.class, C0324s.m265a(C24560g0.m30725a(C8786n1.class)), C0324s.m265a(C24560g0.m30725a(C8783m1.class)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C3718a(this));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderSelfUI).mo86179qs(this, C76986a.Finder);
    }
}
