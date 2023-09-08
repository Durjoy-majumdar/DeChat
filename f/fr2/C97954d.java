package fr2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: fr2.d */
public class C97954d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShakeCoverView f287315d;

    public C97954d(ShakeCoverView shakeCoverView) {
        this.f287315d = shakeCoverView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$1");
        ShakeCoverView.m120067a(this.f287315d).setPath("assets://sns/sns_ad_shake_icon_anim.pag");
        ShakeCoverView.m120067a(this.f287315d).setScaleMode(3);
        ShakeCoverView.m120067a(this.f287315d).setRepeatCount(0);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$1");
    }
}
