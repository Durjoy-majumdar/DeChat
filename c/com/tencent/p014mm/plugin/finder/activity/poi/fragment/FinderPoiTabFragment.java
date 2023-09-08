package com.tencent.p014mm.plugin.finder.activity.poi.fragment;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C98522w3;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import pe3.C89349b;
import rs1.C13442s8;
import sx3.C110826x0;
import te3.C49982je3;
import xd1.C15665p;
import xd1.C15669q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/fragment/FinderPoiTabFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment */
public final class FinderPoiTabFragment extends FinderActivityFragment {

    /* renamed from: s */
    public C89349b f12485s;

    /* renamed from: t */
    public List<? extends C0740i2> f12486t;

    /* renamed from: u */
    public C49982je3 f12487u;

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C15665p.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        FragmentActivity activity = getActivity();
        C98522w3.C8810a aVar = null;
        Intent intent = activity != null ? activity.getIntent() : null;
        Object serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        if (serializableExtra instanceof C98522w3.C8810a) {
            aVar = (C98522w3.C8810a) serializableExtra;
        }
        return aVar == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS ? 81 : 26;
    }

    /* renamed from: V */
    public FinderTabUIC mo2204V(FragmentActivity fragmentActivity) {
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62443b(fragmentActivity).mo75002a(C15669q.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…derPoiTabUIC::class.java)");
        return (FinderTabUIC) a;
    }
}
