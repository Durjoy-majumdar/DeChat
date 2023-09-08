package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.graphics.Color;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import rl1.C63463e;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveLotteryAudienceUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveLotteryAudienceUI */
public final class FinderLiveLotteryAudienceUI extends MMFinderUI {
    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C63463e.class);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        int parseColor = Color.parseColor("#FFF5EA");
        setNavigationbarColor(parseColor);
        setActionbarColor(parseColor);
        getWindow().setStatusBarColor(parseColor);
    }
}
