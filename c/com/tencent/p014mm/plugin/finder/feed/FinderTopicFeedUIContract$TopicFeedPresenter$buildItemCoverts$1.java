package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import dq1.C7461a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1 */
public final class FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> $onBind;
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter this$0;

    public FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter, C32226l<? super Integer, ? extends C60896i<?>> lVar, C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0> qVar) {
        this.this$0 = finderTopicFeedUIContract$TopicFeedPresenter;
        this.$extraMap = lVar;
        this.$onBind = qVar;
    }

    public C60896i<?> getItemConvert(int i) {
        return new FinderConfigForNewLiveCardStyle(this.this$0.f30174d, (C7461a) null, 0, (FinderVideoCore) null, 14, (C8480h) null).mo4003g(i, this.$extraMap, this.$onBind);
    }
}
