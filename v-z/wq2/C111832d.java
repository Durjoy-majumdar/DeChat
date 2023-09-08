package wq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: wq2.d */
public class C111832d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdAlphaPlayerView f334850d;

    public C111832d(AdAlphaPlayerView adAlphaPlayerView) {
        this.f334850d = adAlphaPlayerView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
        if (AdAlphaPlayerView.m142782a(this.f334850d) != null) {
            AdAlphaPlayerView.m142782a(this.f334850d).mo137530b(this.f334850d, "opengl context init failed");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$8");
    }
}
