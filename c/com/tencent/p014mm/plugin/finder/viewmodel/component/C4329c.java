package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.ArrayList;
import kf1.C9713f2;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.c */
public final class C4329c extends C9713f2 {

    /* renamed from: p */
    public final /* synthetic */ FinderImmersiveVideoUIC f18805p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4329c(FinderImmersiveVideoUIC finderImmersiveVideoUIC, AppCompatActivity appCompatActivity, FinderImmersiveVideoUIC$presenter$1 finderImmersiveVideoUIC$presenter$1, int i) {
        super((MMActivity) appCompatActivity, finderImmersiveVideoUIC$presenter$1, 0, i, false);
        this.f18805p = finderImmersiveVideoUIC;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    /* renamed from: F0 */
    public void mo5181F0() {
    }

    /* renamed from: G0 */
    public RefreshLoadMoreLayout mo5182G0() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = new RefreshLoadMoreLayout(this.f18805p.getActivity());
        refreshLoadMoreLayout.setRecyclerView(this.f18805p.mo5162e3());
        return refreshLoadMoreLayout;
    }

    /* renamed from: d */
    public void mo5183d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        mo10309Z();
        mo9301k0(arrayList);
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}
