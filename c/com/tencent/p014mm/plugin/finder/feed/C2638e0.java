package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fo1.C8177b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.feed.e0 */
public final class C2638e0 implements C8177b {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13489d;

    public C2638e0(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
        this.f13489d = finderTopicFeedUIContract$TopicFeedPresenter;
    }

    /* renamed from: b */
    public View mo2654b() {
        View findViewById = this.f13489d.f30174d.findViewById(C0966R.C0970id.ksm);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.topic_root_layout)");
        return findViewById;
    }
}
