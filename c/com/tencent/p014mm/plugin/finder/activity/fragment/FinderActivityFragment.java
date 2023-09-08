package com.tencent.p014mm.plugin.finder.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import ce1.C0468g0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C58398q1;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import rs1.C13442s8;
import sx3.C110826x0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment */
public class FinderActivityFragment extends FinderHomeTabFragment {

    /* renamed from: q */
    public long f12469q;

    /* renamed from: r */
    public String f12470r = "";

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C0468g0.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
    }

    /* renamed from: R */
    public int mo2203R() {
        return 59;
    }

    /* renamed from: V */
    public FinderTabUIC mo2204V(FragmentActivity fragmentActivity) {
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62443b(fragmentActivity).mo75002a(FinderActivityTabUIC.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…tivityTabUIC::class.java)");
        return (FinderTabUIC) a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58398q1 q1Var;
        C87412m.m108594g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Iterator<T> it = mo2204V(activity).mo80061o3().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                T next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C64197v.m75542k();
                    throw null;
                } else if (C87412m.m108589b((FinderHomeTabFragment) next, this)) {
                    break;
                } else {
                    i = i2;
                }
            }
            Log.m105924i("MicroMsg.UIComponentFragment", "index : " + i);
            if (i == 0 && (q1Var = ((C13442s8) C39818r.f106831a.mo62445d(this).mo75002a(C13442s8.class)).f38071F) != null) {
                q1Var.f167332p = true;
            }
        }
        return onCreateView;
    }
}
