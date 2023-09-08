package com.tencent.p014mm.plugin.finder.activity.topic.fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import be1.C0271f;
import be1.C0272g;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import rs1.C13442s8;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/fragment/FinderTopicTabFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment */
public final class FinderTopicTabFragment extends FinderActivityFragment {
    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C0271f.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 22;
    }

    /* renamed from: V */
    public FinderTabUIC mo2204V(FragmentActivity fragmentActivity) {
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62443b(fragmentActivity).mo75002a(C0272g.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…rTopicTabUIC::class.java)");
        return (FinderTabUIC) a;
    }
}
