package gr1;

import android.animation.Animator;
import android.content.Context;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import de1.C7290r;
import dp1.C7435f2;
import gy3.C87412m;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: gr1.h0 */
public final class C8397h0 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27389d;

    public C8397h0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f27389d = finderFullSeekBarLayout;
    }

    public void onAnimationEnd(Animator animator) {
        FinderFullSeekBarLayout finderFullSeekBarLayout = this.f27389d;
        BaseFinderFeed baseFinderFeed = finderFullSeekBarLayout.f17495N;
        if (baseFinderFeed != null) {
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = finderFullSeekBarLayout.getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C7435f2 f2Var = C7435f2.f25626a;
            C49712hj1 hj12 = q3;
            C7435f2.m7551e(f2Var, hj12, "pause_by_icon", true, baseFinderFeed.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
            C7435f2.m7551e(f2Var, hj12, "private_like", true, baseFinderFeed.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
        }
    }
}
