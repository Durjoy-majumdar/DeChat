package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import er1.C58784w3;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14445a2;
import ve1.C14590p;
import ve1.C14592p2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$buildItemCoverts$1 */
public final class C2550xa772c4da implements C9500j {
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter this$0;

    public C2550xa772c4da(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        this.this$0 = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    public C60896i<?> getItemConvert(int i) {
        int i2 = i;
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 9) {
                    FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.this$0;
                    return new FinderFeedFullLiveConvert(finderProfileTimelineContract$ProfileTimelinePresenter.f13153x, finderProfileTimelineContract$ProfileTimelinePresenter, false, 0, 0, 28, (C8480h) null);
                } else if (i2 != 3001) {
                    if (i2 != 3002) {
                        C58784w3.f168295a.mo83916b(this.this$0.f13140h, i2);
                        return new C14590p();
                    }
                }
            }
            FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter2 = this.this$0;
            return new C14592p2(finderProfileTimelineContract$ProfileTimelinePresenter2.f13153x, finderProfileTimelineContract$ProfileTimelinePresenter2, false, 0, false, 28, (C8480h) null);
        }
        return new C14445a2(this.this$0, false, 0, false, 14, (C8480h) null);
    }
}
