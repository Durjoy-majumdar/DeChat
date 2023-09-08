package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C50920q61;

/* renamed from: com.tencent.mm.plugin.finder.view.e2 */
public final class C4047e2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderFeedLiveNoticeView f18147a;

    /* renamed from: b */
    public final /* synthetic */ String f18148b;

    public C4047e2(FinderFeedLiveNoticeView finderFeedLiveNoticeView, String str) {
        this.f18147a = finderFeedLiveNoticeView;
        this.f18148b = str;
    }

    public Object call(Object obj) {
        C49352ez ezVar;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        String str = this.f18147a.f17742e;
        Log.m105924i(str, "CgiFinderLiveReceiveConcertTicket errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c + ", errType: " + cVar.f256793a);
        if (cVar.f256794b == 0 && cVar.f256793a == 0 && (ezVar = ((C50920q61) cVar.f256796d).f140162d) != null) {
            C61926c.m72668M(new C4034d2(this.f18147a, ezVar, this.f18148b));
        }
        return C13598b0.f38549a;
    }
}
