package om1;

import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: om1.a */
public final class C11503a extends NearbyLivePresenter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11503a(MMActivity mMActivity, Fragment fragment, C49712hj1 hj12, C51942x91 x912) {
        super(mMActivity, hj12, "");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(fragment, "fragment");
        C87412m.m108594g(hj12, "contextObj");
        this.f15611i = fragment;
        this.f15612j = x912;
    }

    /* renamed from: f0 */
    public int mo3580f0() {
        C51942x91 x912 = this.f15612j;
        return (x912 != null ? x912.f144531d : 0) + 15;
    }

    public int getCommentScene() {
        return this.f15607e.f134675i;
    }

    /* renamed from: s3 */
    public int mo3593s3() {
        C51942x91 x912 = this.f15612j;
        return (x912 != null ? x912.f144531d : 0) + 1001;
    }
}
