package com.tencent.p014mm.plugin.sns.p104ad.timeline.video.online;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f03.C97787h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qq2.C101234a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView */
public class CardOnlineVideoView extends OnlineVideoView {

    /* renamed from: I1 */
    public String f274182I1;

    /* renamed from: J1 */
    public volatile int f274183J1 = 0;

    /* renamed from: K1 */
    public View f274184K1;

    public CardOnlineVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f274184K1 = findViewById(C0966R.C0970id.l86);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    /* renamed from: D */
    public void mo130402D() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        Log.m105918d("SnsAd.CardOnlineVideoView", "onDestroy is called " + this.f274182I1 + ", hashcode " + hashCode());
        super.mo130402D();
        this.f274183J1 = 0;
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    /* renamed from: E */
    public void mo130403E() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f274183J1 = 1;
        mo130405c0();
        super.mo130403E();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    /* renamed from: K */
    public void mo130404K() {
        SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f274183J1 = 1;
        super.mo130404K();
        mo130405c0();
        mo132329U(true);
        SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    /* renamed from: c0 */
    public void mo130405c0() {
        SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        View view = this.f274184K1;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/video/online/CardOnlineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/timeline/video/online/CardOnlineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public String getMediaId() {
        SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        String str = this.f274182I1;
        SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        return str;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        super.onAttachedToWindow();
        Log.m105918d("SnsAd.CardOnlineVideoView", "the online video view is attached to window, hashcode " + hashCode());
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        super.onDetachedFromWindow();
        Log.m105918d("SnsAd.CardOnlineVideoView", "the online video view detached from window, hashcode " + hashCode());
        SnsMethodCalculate.markStartTimeMs("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        Log.m105918d("SnsAd.CardOnlineVideoView", "asyncStop is called " + this.f274182I1 + ", hashcode " + hashCode());
        this.f274182I1 = "";
        if (this.f274183J1 == 2 || this.f274183J1 == 0) {
            SnsMethodCalculate.markEndTimeMs("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        } else {
            C97787h hVar = this.f277172S0;
            if (hVar != null) {
                hVar.stop();
                this.f277172S0 = null;
            }
            if (this.f277155F != null) {
                this.f277155F.mo132418q();
                this.f277155F.mo132405d();
                this.f277155F = null;
            }
            mo132356s();
            this.f274183J1 = 2;
            ((C119157j) C119157j.f356862d).mo183875f(new C101234a(this));
            SnsMethodCalculate.markEndTimeMs("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public void setMediaId(String str) {
        SnsMethodCalculate.markStartTimeMs("setMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f274182I1 = str;
        SnsMethodCalculate.markEndTimeMs("setMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public CardOnlineVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f274184K1 = findViewById(C0966R.C0970id.l86);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }
}
