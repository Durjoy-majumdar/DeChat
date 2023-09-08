package wq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: wq2.b */
public class C111830b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdAlphaPlayerView f334848d;

    public C111830b(AdAlphaPlayerView adAlphaPlayerView) {
        this.f334848d = adAlphaPlayerView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$10");
        if (AdAlphaPlayerView.m142782a(this.f334848d) != null) {
            AdAlphaPlayerView.m142782a(this.f334848d).mo137530b(this.f334848d, "player start error");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$10");
    }
}
