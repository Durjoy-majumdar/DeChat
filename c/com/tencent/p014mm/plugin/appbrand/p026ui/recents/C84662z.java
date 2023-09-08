package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.z */
public final class C84662z extends C84658y {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84662z(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup, true, true);
        C87412m.m108594g(fragmentActivity, "context");
        C87412m.m108594g(viewGroup, "viewGroup");
    }

    /* renamed from: o */
    public List<C84620b> mo117367o(FragmentActivity fragmentActivity, ViewGroup viewGroup, boolean z) {
        C87412m.m108594g(fragmentActivity, "context");
        C87412m.m108594g(viewGroup, "childrenContainer");
        ArrayList arrayList = new ArrayList(2);
        mo117366n(arrayList, super.mo117368p(fragmentActivity, viewGroup));
        mo117366n(arrayList, super.mo117369q(fragmentActivity, viewGroup));
        return arrayList;
    }

    /* renamed from: p */
    public C84620b mo117368p(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        return super.mo117368p(fragmentActivity, viewGroup);
    }

    /* renamed from: q */
    public C84620b mo117369q(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        return super.mo117369q(fragmentActivity, viewGroup);
    }
}
