package wq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import j03.C60698b;
import p329d3.C86165a;

/* renamed from: wq2.e */
public class C111833e implements ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d */
    public final /* synthetic */ C60698b f334851d;

    /* renamed from: e */
    public final /* synthetic */ AdAlphaPlayerView f334852e;

    public C111833e(AdAlphaPlayerView adAlphaPlayerView, C60698b bVar) {
        this.f334852e = adAlphaPlayerView;
        this.f334851d = bVar;
    }

    public void onPrepared(ITPPlayer iTPPlayer) {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$9");
        C111836h.m152498e("AdAlphaPlayerView", "onGLComponentsInited: videosize(" + this.f334851d.getVideoWidth() + ", " + this.f334851d.getVideoHeight() + ")");
        AdAlphaPlayerView adAlphaPlayerView = this.f334852e;
        int i = AdAlphaPlayerView.f316168r;
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        adAlphaPlayerView.f316176n = true;
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        AdAlphaPlayerView adAlphaPlayerView2 = this.f334852e;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C86165a<Void> aVar = adAlphaPlayerView2.f316178p;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (aVar != null) {
            AdAlphaPlayerView adAlphaPlayerView3 = this.f334852e;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C86165a<Void> aVar2 = adAlphaPlayerView3.f316178p;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            aVar2.accept(null);
            AdAlphaPlayerView adAlphaPlayerView4 = this.f334852e;
            SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            adAlphaPlayerView4.f316178p = null;
            SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$9");
    }
}
