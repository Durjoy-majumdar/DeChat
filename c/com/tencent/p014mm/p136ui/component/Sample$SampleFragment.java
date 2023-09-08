package com.tencent.p014mm.p136ui.component;

import android.content.Context;
import android.os.Bundle;
import bl3.C0320j;
import bl3.C0321k;
import bl3.C0322l;
import bl3.C0323m;
import bl3.C39818r;
import gy3.C87412m;
import j20.C117292a;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/ui/component/Sample$SampleFragment", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.component.Sample$SampleFragment */
public final class Sample$SampleFragment extends UIComponentFragment {
    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C0320j.class, C0321k.class, C0323m.class, C0322l.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        C117292a.m165355a("com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.mo2202O();
        C117292a.m165361g(this, "com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        C117292a.m165361g(this, "com/tencent/mm/ui/component/Sample$SampleFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39818r rVar = C39818r.f106831a;
        ((C0321k) rVar.mo62445d(this).mo75002a(C0321k.class)).getClass();
        Context requireContext = requireContext();
        C87412m.m108593f(requireContext, "requireContext()");
        ((C0323m) rVar.mo62443b(requireContext).mo75002a(C0323m.class)).getClass();
    }
}
