package fp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;

/* renamed from: fp2.g */
public final class C32156g {
    /* renamed from: a */
    public static final boolean m39639a() {
        SnsMethodCalculate.markStartTimeMs("supportLandingPageWithMagicBrush", "com.tencent.mm.plugin.sns.ad.magicbrush.SnsAdMagicBrushSwitch");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_ad_landing_page_magic_brush, 0);
            Log.m105924i("SnsAdMagicBrushSwitch", "SnsAdMagicBrushSwitch:: the switch value is " + Qe);
            boolean z = Qe > 0;
            SnsMethodCalculate.markEndTimeMs("supportLandingPageWithMagicBrush", "com.tencent.mm.plugin.sns.ad.magicbrush.SnsAdMagicBrushSwitch");
            return z;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("supportLandingPageWithMagicBrush", "com.tencent.mm.plugin.sns.ad.magicbrush.SnsAdMagicBrushSwitch");
            return false;
        }
    }
}
