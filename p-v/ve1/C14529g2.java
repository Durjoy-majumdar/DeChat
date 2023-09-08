package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import zp3.C23555k;

/* renamed from: ve1.g2 */
public final class C14529g2 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ FinderItem f40274a;

    /* renamed from: b */
    public final /* synthetic */ FinderFeedFullLiveConvert f40275b;

    /* renamed from: c */
    public final /* synthetic */ Context f40276c;

    public C14529g2(FinderItem finderItem, FinderFeedFullLiveConvert finderFeedFullLiveConvert, Context context) {
        this.f40274a = finderItem;
        this.f40275b = finderFeedFullLiveConvert;
        this.f40276c = context;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        Log.m105924i("Finder.FeedFullLiveConvert", "feedLiveExpose isExposed " + z + " feedId: " + this.f40274a.getId());
        if (z) {
            this.f40275b.f12783R.alive();
            this.f40275b.mo2399Z0(this.f40274a, 68, this.f40276c);
            String str = this.f40275b.f12780N;
            Log.m105924i(str, "feedLiveExpose true curScrollFeedId:" + this.f40275b.f12782Q + " exposeFeedId: " + this.f40274a.getId());
            if (this.f40275b.f12782Q == this.f40274a.getId()) {
                FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f40275b;
                finderFeedFullLiveConvert.mo2391R0(finderFeedFullLiveConvert.f12782Q, true);
                return;
            }
            return;
        }
        this.f40275b.f12783R.dead();
    }
}
