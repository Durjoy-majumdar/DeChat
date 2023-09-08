package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import er1.C58784w3;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import rs1.C13442s8;
import ve1.C14445a2;
import ve1.C14590p;
import ve1.C14592p2;
import ve1.C14650u6;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1 */
public final class FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderLoaderFeedUIContract$Presenter this$0;

    public FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1(FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter) {
        this.this$0 = finderLoaderFeedUIContract$Presenter;
    }

    public C60896i<?> getItemConvert(int i) {
        int i2 = i;
        if (i2 == -12) {
            return new C14650u6();
        }
        if (i2 == 2) {
            FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter = this.this$0;
            return new C14445a2(finderLoaderFeedUIContract$Presenter, finderLoaderFeedUIContract$Presenter.mo2564a1(), this.this$0.f29967j, false, 8, (C8480h) null);
        } else if (i2 == 4) {
            FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter2 = this.this$0;
            return new C14592p2(finderLoaderFeedUIContract$Presenter2.f29969o, finderLoaderFeedUIContract$Presenter2, finderLoaderFeedUIContract$Presenter2.mo2564a1(), this.this$0.f29967j, false, 16, (C8480h) null);
        } else if (i2 == 9) {
            FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter3 = this.this$0;
            FinderVideoCore finderVideoCore = finderLoaderFeedUIContract$Presenter3.f29969o;
            boolean a1 = finderLoaderFeedUIContract$Presenter3.mo2564a1();
            FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter4 = this.this$0;
            int i3 = finderLoaderFeedUIContract$Presenter4.f29967j;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderLoaderFeedUIContract$Presenter4.f29961d);
            return new FinderFeedFullLiveConvert(finderVideoCore, finderLoaderFeedUIContract$Presenter3, a1, i3, f != null ? f.f38096i : 0);
        } else if (i2 != 2003) {
            C58784w3.f168295a.mo83916b(this.this$0.mo2546N(), i2);
            return new C14590p();
        } else {
            FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter5 = this.this$0;
            return new FinderFeedLiveListConvert(finderLoaderFeedUIContract$Presenter5, ((C13442s8) C39818r.f106831a.mo62444c(finderLoaderFeedUIContract$Presenter5.f29961d).mo75002a(C13442s8.class)).mo12861q3(), 0);
        }
    }
}
