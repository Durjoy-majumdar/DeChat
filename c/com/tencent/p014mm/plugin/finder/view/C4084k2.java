package com.tencent.p014mm.plugin.finder.view;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import fy3.C32224a;
import gy3.C87413o;
import hs1.C8740e;
import rx3.C13598b0;
import te3.C49098d51;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.finder.view.k2 */
public final class C4084k2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveNoticeView f18214d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C49098d51> f18215e;

    /* renamed from: f */
    public final /* synthetic */ C8740e f18216f;

    /* renamed from: g */
    public final /* synthetic */ NoticeStatusView f18217g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4084k2(FinderFeedLiveNoticeView finderFeedLiveNoticeView, C32224a<? extends C49098d51> aVar, C8740e eVar, NoticeStatusView noticeStatusView) {
        super(0);
        this.f18214d = finderFeedLiveNoticeView;
        this.f18215e = aVar;
        this.f18216f = eVar;
        this.f18217g = noticeStatusView;
    }

    public Object invoke() {
        FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f18214d;
        C53895h.m60466d(finderFeedLiveNoticeView.f17741d, (C66212f) null, (C53934p0) null, new C4076j2(this.f18215e, this.f18216f, this.f18217g, finderFeedLiveNoticeView, (C15601d<? super C4076j2>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
