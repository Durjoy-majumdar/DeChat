package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC;
import java.util.Set;
import kotlin.Metadata;
import rs1.C13535y0;
import sx3.C110826x0;
import wc1.C15065c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAtFeedManageUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAtFeedManageUI */
public final class FinderAtFeedManageUI extends MMFinderUI {
    public int getLayoutId() {
        return C0966R.C0971layout.a8y;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(FinderAtFeedManageUIC.class, C13535y0.class, C15065c.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f6170z_);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
    }
}
