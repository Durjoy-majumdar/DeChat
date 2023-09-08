package com.tencent.p014mm.plugin.finder.activity.music.fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C24560g0;
import gy3.C87412m;
import ht1.C8807v3;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import rs1.C13442s8;
import sx3.C110826x0;
import ud1.C14174s;
import ud1.C14175t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/music/fragment/FinderMusicTopicFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment */
public final class FinderMusicTopicFragment extends FinderActivityFragment {
    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C14174s.class);
    }

    /* renamed from: Q */
    public void mo2207Q(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.mo2207Q(hashSet);
        hashSet.remove(C0324s.m265a(C24560g0.m30725a(C8807v3.class)));
    }

    /* renamed from: R */
    public int mo2203R() {
        return 138;
    }

    /* renamed from: V */
    public FinderTabUIC mo2204V(FragmentActivity fragmentActivity) {
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62443b(fragmentActivity).mo75002a(C14175t.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…cTopicTabUIC::class.java)");
        return (FinderTabUIC) a;
    }
}
