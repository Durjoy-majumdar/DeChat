package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.view.m2 */
public final class C4102m2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C49098d51 f18251d;

    /* renamed from: e */
    public final /* synthetic */ String f18252e;

    /* renamed from: f */
    public final /* synthetic */ C49712hj1 f18253f;

    /* renamed from: g */
    public final /* synthetic */ FinderFeedLiveNoticeView f18254g;

    /* renamed from: h */
    public final /* synthetic */ Context f18255h;

    /* renamed from: i */
    public final /* synthetic */ NoticeStatusView f18256i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4102m2(C49098d51 d512, String str, C49712hj1 hj12, FinderFeedLiveNoticeView finderFeedLiveNoticeView, Context context, NoticeStatusView noticeStatusView) {
        super(0);
        this.f18251d = d512;
        this.f18252e = str;
        this.f18253f = hj12;
        this.f18254g = finderFeedLiveNoticeView;
        this.f18255h = context;
        this.f18256i = noticeStatusView;
    }

    public Object invoke() {
        FinderFeedLiveNoticeView.C3949b.m4160b(this.f18251d, this.f18252e, this.f18253f, this.f18254g, this.f18255h, this.f18256i);
        return C13598b0.f38549a;
    }
}
