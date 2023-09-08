package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C76912y0;
import p687sr.C64153e;
import te3.C49098d51;
import te3.C50523nc3;

/* renamed from: com.tencent.mm.plugin.finder.view.l2 */
public final class C4093l2 implements C64153e.C64155b {

    /* renamed from: a */
    public final /* synthetic */ FinderFeedLiveNoticeView f18231a;

    /* renamed from: b */
    public final /* synthetic */ boolean f18232b;

    /* renamed from: c */
    public final /* synthetic */ C49098d51 f18233c;

    public C4093l2(FinderFeedLiveNoticeView finderFeedLiveNoticeView, boolean z, C49098d51 d512) {
        this.f18231a = finderFeedLiveNoticeView;
        this.f18232b = z;
        this.f18233c = d512;
    }

    /* renamed from: a */
    public void mo4980a(boolean z) {
        FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f18231a;
        boolean z2 = this.f18232b;
        C50523nc3 nc32 = this.f18233c.f132128q;
        boolean z3 = true;
        if (nc32 == null || !nc32.f138532d) {
            z3 = false;
        }
        int i = FinderFeedLiveNoticeView.f17740i;
        if (z2) {
            C76912y0.m92773l(finderFeedLiveNoticeView.getContext(), finderFeedLiveNoticeView.getContext().getString(C0966R.string.fq9));
            return;
        }
        String string = z3 ? finderFeedLiveNoticeView.getContext().getString(C0966R.string.mr5) : finderFeedLiveNoticeView.getContext().getString(C0966R.string.dzj);
        C87412m.m108593f(string, "if (isPay) {\n           …toast_tips)\n            }");
        C76912y0.m92773l(finderFeedLiveNoticeView.getContext(), string);
    }
}
