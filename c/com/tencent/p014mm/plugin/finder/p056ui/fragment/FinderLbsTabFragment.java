package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import java.util.Set;
import kf1.C9720fa;
import kf1.C9957r9;
import kotlin.Metadata;
import rs1.C13492va;
import rs1.C63586o;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderLbsTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment */
public final class FinderLbsTabFragment extends FinderHomeTabFragment {
    public FinderLbsTabFragment() {
        super(C0966R.string.eqo, 2);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13492va.class, C63586o.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 16;
    }

    /* renamed from: S */
    public void mo4177S() {
        C63586o oVar = (C63586o) mo82247K(C63586o.class);
        C13492va vaVar = (C13492va) mo82247K(C13492va.class);
        C9720fa faVar = vaVar.f38222d;
        if (faVar != null) {
            faVar.mo10326t(true);
        }
        C9957r9 r9Var = vaVar.f38223e;
        if (r9Var != null) {
            r9Var.mo10461x(true);
        }
    }
}
