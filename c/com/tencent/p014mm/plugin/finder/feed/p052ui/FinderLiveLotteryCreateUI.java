package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import java.util.Set;
import kotlin.Metadata;
import sx3.C22415w0;
import ul1.C14218j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveLotteryCreateUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveLotteryCreateUI */
public final class FinderLiveLotteryCreateUI extends MMFinderUI {

    /* renamed from: o */
    public final MenuItem.OnMenuItemClickListener f159007o = new C55830a(this);

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveLotteryCreateUI$a */
    public static final class C55830a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLotteryCreateUI f159008d;

        public C55830a(FinderLiveLotteryCreateUI finderLiveLotteryCreateUI) {
            this.f159008d = finderLiveLotteryCreateUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f159008d.hideVKB();
            this.f159008d.finish();
            this.f159008d.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C14218j.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.dk7);
        hideActionbarLine();
        setBackBtn(this.f159007o, C0966R.raw.icons_filled_close);
    }
}
