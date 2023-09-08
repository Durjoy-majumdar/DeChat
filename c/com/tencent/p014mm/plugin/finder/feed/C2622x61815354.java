package com.tencent.p014mm.plugin.finder.feed;

import dq1.C7461a;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14548j3;
import ve1.C14590p;
import ve1.C14632t2;
import ve1.C14648u3;
import ve1.C14706z2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$buildCampaignConvert$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildCampaignConvert$1 */
public final class C2622x61815354 implements C9500j {
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter this$0;

    public C2622x61815354(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
        this.this$0 = finderTopicFeedUIContract$TopicFeedPresenter;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == -5) {
            return new C14706z2();
        }
        if (i == -3) {
            return new C14548j3();
        }
        if (i != 2) {
            if (!(i == 4 || i == 9)) {
                if (i != 3001) {
                    if (i != 3002) {
                        return new C14590p();
                    }
                }
            }
            C14648u3 u3Var = new C14648u3(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            u3Var.f40246p = this.this$0.f13406v;
            return u3Var;
        }
        C14632t2 t2Var = new C14632t2(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
        t2Var.f40246p = this.this$0.f13406v;
        return t2Var;
    }
}
