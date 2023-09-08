package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import hp1.C8703w0;
import java.util.Set;
import kotlin.Metadata;
import rs1.C13438s3;
import sx3.C22415w0;
import te3.C50972qk0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFollowListFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFollowListFragment */
public final class FinderFollowListFragment extends FinderHomeTabFragment {
    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(C13438s3.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 12;
    }

    /* renamed from: T */
    public void mo4178T() {
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27929c = null;
        Intent intent = new Intent();
        intent.putExtra("request_type", 3);
        intent.putExtra("need_history", false);
        Context requireContext = requireContext();
        C87412m.m108593f(requireContext, "requireContext()");
        ((C58684b) C86312j.m106911c(C58684b.class)).Dx0(requireContext, (C50972qk0) null, intent);
    }
}
