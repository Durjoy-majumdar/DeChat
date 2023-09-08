package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14445a2;
import ve1.C14590p;
import ve1.C14592p2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderPreviewTimelineUIContract$Presenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter$buildItemCoverts$1 */
public final class FinderPreviewTimelineUIContract$Presenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderPreviewTimelineUIContract$Presenter this$0;

    public FinderPreviewTimelineUIContract$Presenter$buildItemCoverts$1(FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter) {
        this.this$0 = finderPreviewTimelineUIContract$Presenter;
    }

    public C60896i<?> getItemConvert(int i) {
        int i2 = i;
        if (i2 == 2) {
            FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter = this.this$0;
            finderPreviewTimelineUIContract$Presenter.getClass();
            return new C14445a2(finderPreviewTimelineUIContract$Presenter, false, Integer.MIN_VALUE, false, 8, (C8480h) null);
        } else if (i2 != 4) {
            return new C14590p();
        } else {
            FinderPreviewTimelineUIContract$Presenter finderPreviewTimelineUIContract$Presenter2 = this.this$0;
            FinderVideoCore finderVideoCore = finderPreviewTimelineUIContract$Presenter2.f29969o;
            finderPreviewTimelineUIContract$Presenter2.getClass();
            return new C14592p2(finderVideoCore, finderPreviewTimelineUIContract$Presenter2, false, Integer.MIN_VALUE, false, 16, (C8480h) null);
        }
    }
}
