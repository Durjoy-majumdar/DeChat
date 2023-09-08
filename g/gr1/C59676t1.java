package gr1;

import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59667n2;
import gy3.C87412m;
import mt1.C61580b;

/* renamed from: gr1.t1 */
public final class C59676t1 implements C61580b {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170497d;

    public C59676t1(FinderVideoLayout finderVideoLayout) {
        this.f170497d = finderVideoLayout;
    }

    /* renamed from: g5 */
    public void mo80088g5(boolean z) {
        String fTPPTag = this.f170497d.getFTPPTag();
        Log.m105924i(fTPPTag, "onHeadsetStateChange on:" + z + " isVideoPlaying:" + this.f170497d.mo79599y());
        if (!z && this.f170497d.mo79599y()) {
            if (this.f170497d.getLongVideoSeekBar() != null) {
                this.f170497d.mo79547N(false);
                FinderLongVideoPlayerSeekBar longVideoSeekBar = this.f170497d.getLongVideoSeekBar();
                C87412m.m108591d(longVideoSeekBar);
                longVideoSeekBar.setIsPlay(false);
                return;
            }
            this.f170497d.mo79600z(true, true);
            C59667n2 seekBarLayout = this.f170497d.getSeekBarLayout();
            if (seekBarLayout != null) {
                C59667n2.C8415a.m8377a(seekBarLayout, (String) null, false, 3, (Object) null);
            }
            C59667n2 seekBarLayout2 = this.f170497d.getSeekBarLayout();
            if (seekBarLayout2 != null) {
                seekBarLayout2.mo4262l(true);
            }
        }
    }
}
