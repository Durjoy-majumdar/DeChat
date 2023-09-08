package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.finder.view.h2 */
public final class C4066h2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveNoticeView f18194d;

    public C4066h2(FinderFeedLiveNoticeView finderFeedLiveNoticeView) {
        this.f18194d = finderFeedLiveNoticeView;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(4, this.f18194d.getContext().getResources().getColor(C0966R.color.f2966ao), this.f18194d.getContext().getResources().getString(C0966R.string.e08));
    }
}
