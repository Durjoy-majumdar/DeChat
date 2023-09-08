package com.tencent.p014mm.plugin.finder.replay.fragment;

import android.content.Context;
import ap1.C54286f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import sx3.C22415w0;
import vo1.C65798h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/fragment/FinderLiveReplayFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment */
public final class FinderLiveReplayFragment extends MMFinderFragment {

    /* renamed from: j */
    public final String f160796j = "FinderLiveReplayFragment";

    /* renamed from: n */
    public int f160797n;

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        String str = this.f160796j;
        Log.m105924i(str, "importUIComponents sourceType:" + this.f160797n);
        return C22415w0.m26092a(this.f160797n == 3 ? C54286f.class : C65798h0.class);
    }

    public void onAttach(Context context) {
        C87412m.m108594g(context, "context");
        FinderLiveReplayUI finderLiveReplayUI = context instanceof FinderLiveReplayUI ? (FinderLiveReplayUI) context : null;
        this.f160797n = finderLiveReplayUI != null ? finderLiveReplayUI.f159011o : 0;
        String str = this.f160796j;
        Log.m105924i(str, "onAttach sourceType:" + this.f160797n);
        super.onAttach(context);
    }
}
