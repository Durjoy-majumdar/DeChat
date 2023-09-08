package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fo1.C8177b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.feed.a */
public final class C2631a implements C8177b {

    /* renamed from: d */
    public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f13469d;

    public C2631a(FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter) {
        this.f13469d = finderCampaignFeedUIContract$TopicFeedPresenter;
    }

    /* renamed from: b */
    public View mo2654b() {
        View findViewById = this.f13469d.f30442d.findViewById(C0966R.C0970id.ksm);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.topic_root_layout)");
        return findViewById;
    }
}
