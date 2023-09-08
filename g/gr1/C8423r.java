package gr1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import gy3.C87412m;
import java.util.Map;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: gr1.r */
public final class C8423r implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderFullSeekBarLayout f27419a;

    public C8423r(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f27419a = finderFullSeekBarLayout;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        FinderItem o;
        C13604l[] lVarArr = new C13604l[2];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f27419a.getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        Long l = null;
        lVarArr[0] = new C13604l("comment_scene", f != null ? Integer.valueOf(f.mo12861q3().f134675i) : null);
        BaseFinderFeed baseFinderFeed = this.f27419a.f17495N;
        if (!(baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null)) {
            l = Long.valueOf(o.getId());
        }
        lVarArr[1] = new C13604l("feed_id", l);
        return C90364q0.m113147f(lVarArr);
    }
}
