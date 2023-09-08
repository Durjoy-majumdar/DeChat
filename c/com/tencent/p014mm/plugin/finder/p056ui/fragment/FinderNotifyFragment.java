package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFinderMsgUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import rs1.C63621r6;
import rs1.C63659v6;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderNotifyFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment */
public final class FinderNotifyFragment extends FinderHomeTabFragment {
    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C63659v6.class, C63621r6.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("FinderNotifyFragment", "index:" + this.f17334o);
        C39818r rVar = C39818r.f106831a;
        ((C63659v6) rVar.mo62445d(this).mo75002a(C63659v6.class)).f180475d = this.f17334o;
        C63621r6 r6Var = (C63621r6) rVar.mo62445d(this).mo75002a(C63621r6.class);
        int i = this.f17334o;
        r6Var.f180387f = i;
        ArrayList<int[]> arrayList = FinderFinderMsgUI.f161048o;
        r6Var.f180386e = FinderFinderMsgUI.f161049p[i];
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        Log.m105924i("FinderNotifyFragment", " onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        Log.m105924i("FinderNotifyFragment", "onViewCreated");
        super.onViewCreated(view, bundle);
    }
}
