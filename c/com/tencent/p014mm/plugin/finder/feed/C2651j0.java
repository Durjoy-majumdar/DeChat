package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.FinderTagClickEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import os1.C11755t;
import rx3.C13598b0;
import te3.C51270sn1;

/* renamed from: com.tencent.mm.plugin.finder.feed.j0 */
public final class C2651j0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTagClickEvent f13506d;

    /* renamed from: e */
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13507e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2651j0(FinderTagClickEvent finderTagClickEvent, FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
        super(0);
        this.f13506d = finderTagClickEvent;
        this.f13507e = finderTopicFeedUIContract$TopicFeedPresenter;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("tag click:");
        sb.append(this.f13506d.f9253d.f9254a);
        sb.append(",index:");
        this.f13506d.f9253d.getClass();
        sb.append(0);
        Log.m105918d("Finder.TimelineMachinePresenter", sb.toString());
        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f13507e;
        C51270sn1 sn12 = this.f13506d.f9253d.f9254a;
        C87412m.m108593f(sn12, "event.data.tag");
        if (!finderTopicFeedUIContract$TopicFeedPresenter.mo2639f0(sn12)) {
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter2 = this.f13507e;
            if (finderTopicFeedUIContract$TopicFeedPresenter2.mo2639f0(finderTopicFeedUIContract$TopicFeedPresenter2.f13400p)) {
                FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter3 = this.f13507e;
                C11755t tVar = finderTopicFeedUIContract$TopicFeedPresenter3.f13409y;
                Object clone = finderTopicFeedUIContract$TopicFeedPresenter3.f30175e.getDataListJustForAdapter().clone();
                C87412m.m108592e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
                ArrayList<BaseFinderFeed> arrayList = (ArrayList) clone;
                tVar.getClass();
                Log.m105924i("Finder.FinderTopicFeedCacheVM", "lastDataList size=" + Integer.valueOf(arrayList.size()) + ' ');
                tVar.f34412e = arrayList;
            }
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter4 = this.f13507e;
            C51270sn1 sn13 = this.f13506d.f9253d.f9254a;
            C87412m.m108593f(sn13, "event.data.tag");
            finderTopicFeedUIContract$TopicFeedPresenter4.getClass();
            finderTopicFeedUIContract$TopicFeedPresenter4.f13400p = sn13;
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter5 = this.f13507e;
            finderTopicFeedUIContract$TopicFeedPresenter5.mo2640j0(new C2647h0(finderTopicFeedUIContract$TopicFeedPresenter5));
        } else {
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter6 = this.f13507e;
            C51270sn1 sn14 = this.f13506d.f9253d.f9254a;
            C87412m.m108593f(sn14, "event.data.tag");
            finderTopicFeedUIContract$TopicFeedPresenter6.getClass();
            finderTopicFeedUIContract$TopicFeedPresenter6.f13400p = sn14;
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter7 = this.f13507e;
            finderTopicFeedUIContract$TopicFeedPresenter7.mo2640j0(new C2649i0(finderTopicFeedUIContract$TopicFeedPresenter7));
        }
        return C13598b0.f38549a;
    }
}
