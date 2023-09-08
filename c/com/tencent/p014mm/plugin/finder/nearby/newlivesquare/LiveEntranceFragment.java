package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.livescroll.LiveScrollSquareUIC;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import ph1.C62293i;
import sx3.C110826x0;
import xm1.C15833g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment */
public final class LiveEntranceFragment extends MMFinderFragment {
    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C15833g.class, LiveScrollSquareUIC.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("key_use_dark_style", 1);
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        C62293i.f177081a.mo87361f();
    }
}
