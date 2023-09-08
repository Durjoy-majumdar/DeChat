package wq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j03.C60698b;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdAlphaPlayerView f334846d;

    /* renamed from: e */
    public final /* synthetic */ C60698b f334847e;

    public /* synthetic */ a$$a(AdAlphaPlayerView adAlphaPlayerView, C60698b bVar) {
        this.f334846d = adAlphaPlayerView;
        this.f334847e = bVar;
    }

    public final void run() {
        AdAlphaPlayerView adAlphaPlayerView = this.f334846d;
        C60698b bVar = this.f334847e;
        int i = AdAlphaPlayerView.f316168r;
        adAlphaPlayerView.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$onOpenGLComponentsInit$0", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        Log.m105918d("AdAlphaPlayerView", "setAlpha(1) called");
        adAlphaPlayerView.setAlpha(1.0f);
        if (adAlphaPlayerView.f316177o) {
            try {
                bVar.start();
            } catch (Throwable unused) {
                Log.m105918d("AdAlphaPlayerView", "adPlayer.start error");
            }
        }
        SnsMethodCalculate.markEndTimeMs("lambda$onOpenGLComponentsInit$0", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }
}
