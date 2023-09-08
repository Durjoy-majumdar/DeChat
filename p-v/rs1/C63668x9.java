package rs1;

import android.view.ViewParent;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.HorizontalVideoPreviewLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import fy3.C32224a;
import gr1.C59667n2;
import gr1.C59670o2;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.x9 */
public final class C63668x9 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f180490d;

    /* renamed from: e */
    public final /* synthetic */ C63672y9 f180491e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63668x9(boolean z, C63672y9 y9Var) {
        super(0);
        this.f180490d = z;
        this.f180491e = y9Var;
    }

    public Object invoke() {
        if (this.f180490d) {
            FinderFullSeekBarLayout finderFullSeekBarLayout = this.f180491e.f180514t;
            if (finderFullSeekBarLayout != null) {
                C59667n2.C8415a.m8377a(finderFullSeekBarLayout, (String) null, false, 3, (Object) null);
            }
        } else {
            C59670o2 x = ((FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class)).mo80085x(this.f180491e.getContext());
            ViewParent parentView = x != null ? x.getParentView() : null;
            if (parentView instanceof FinderVideoLayout) {
                C59667n2 seekBarLayout = ((FinderVideoLayout) parentView).getSeekBarLayout();
                if (seekBarLayout != null) {
                    C59667n2.C8415a.m8377a(seekBarLayout, (String) null, false, 3, (Object) null);
                }
            } else if (parentView instanceof HorizontalVideoPreviewLayout) {
                HorizontalVideoPreviewLayout horizontalVideoPreviewLayout = (HorizontalVideoPreviewLayout) parentView;
                HorizontalVideoPreviewLayout.m4254i(horizontalVideoPreviewLayout, false, 1, (Object) null);
                FinderLongVideoPlayerSeekBar longVideoSeekBar = horizontalVideoPreviewLayout.getLongVideoSeekBarLayout().getLongVideoSeekBar();
                if (longVideoSeekBar.f283824z) {
                    longVideoSeekBar.getPlayBtn().performClick();
                }
            }
        }
        return C13598b0.f38549a;
    }
}
