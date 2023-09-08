package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import di3.C86312j;
import java.util.Set;
import kk0.C88191m;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import sx3.C22415w0;
import vf1.C14767g4;
import vo3.C90852c;
import zn1.C23537b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPlayListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPlayListUI */
public final class FinderPlayListUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPlayListUI$a */
    public static final class C3000a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPlayListUI f14644d;

        public C3000a(FinderPlayListUI finderPlayListUI) {
            this.f14644d = finderPlayListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14644d.finish();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return C88191m.CTRL_INDEX;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C23537b0.class);
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        super.onCreate(bundle);
        setBackBtn(new C3000a(this));
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setMMTitle(getString(C0966R.string.f360734mx0));
        hideActionbarLine();
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.AllCollectionPage);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "AllCollectionPage");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 12, 27010);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C14767g4(this));
    }
}
