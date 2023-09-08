package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import fy3.C32226l;
import rx3.C13598b0;
import te3.C50259lg1;

/* renamed from: com.tencent.mm.plugin.finder.view.n4 */
public final class C4122n4<T> implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C7045j f18295a;

    /* renamed from: b */
    public final /* synthetic */ FinderPostOriginView f18296b;

    public C4122n4(C7045j jVar, FinderPostOriginView finderPostOriginView) {
        this.f18295a = jVar;
        this.f18296b = finderPostOriginView;
    }

    public final void onResult(boolean z, Object obj, Object obj2) {
        this.f18295a.mo8101d();
        if (z) {
            this.f18296b.f17922w = this.f18295a.mo8099b();
            this.f18296b.mo4676h();
            C32226l<C50259lg1, C13598b0> onSelectTypeItem = this.f18296b.getOnSelectTypeItem();
            if (onSelectTypeItem != null) {
                onSelectTypeItem.invoke(this.f18296b.getSelectOriginTypeItem());
            }
        }
    }
}
