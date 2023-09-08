package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import java.util.Set;
import kotlin.Metadata;
import sx3.C22415w0;
import wf1.C15193l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveGiftPkgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveGiftPkgUI */
public final class FinderLiveGiftPkgUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveGiftPkgUI$a */
    public static final class C2963a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveGiftPkgUI f14522d;

        public C2963a(FinderLiveGiftPkgUI finderLiveGiftPkgUI) {
            this.f14522d = finderLiveGiftPkgUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14522d.finish();
            return true;
        }
    }

    public int getCustomBounceId() {
        return -1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C15193l.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C2963a(this));
        setMMTitleColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        hideTitleView();
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
    }

    public void onCreateBeforeSetContentView() {
        setBounceEnabled(false);
        super.onCreateBeforeSetContentView();
    }
}
