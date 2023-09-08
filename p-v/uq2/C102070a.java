package uq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdAttitudePlayView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import org.libpag.PAGView;

/* renamed from: uq2.a */
public class C102070a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdAttitudePlayView f300579d;

    public C102070a(AdAttitudePlayView adAttitudePlayView) {
        this.f300579d = adAttitudePlayView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$2");
        AdAttitudePlayView adAttitudePlayView = this.f300579d;
        int i = AdAttitudePlayView.f274263F;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        PAGView pAGView = adAttitudePlayView.f274269d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        pAGView.play();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$2");
    }
}
