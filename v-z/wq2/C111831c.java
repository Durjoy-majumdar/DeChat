package wq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: wq2.c */
public class C111831c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdAlphaPlayerView f334849d;

    public C111831c(AdAlphaPlayerView adAlphaPlayerView) {
        this.f334849d = adAlphaPlayerView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$11");
        if (AdAlphaPlayerView.m142782a(this.f334849d) != null) {
            AdAlphaPlayerView.m142782a(this.f334849d).mo137530b(this.f334849d, "opengl component init failed");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$11");
    }
}
