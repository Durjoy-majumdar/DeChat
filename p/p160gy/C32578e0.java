package p160gy;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86301e;
import ei3.C86522b;
import p166hy.C8827c0;

@C86522b
/* renamed from: gy.e0 */
public class C32578e0 extends C86301e implements C8827c0 {
    /* renamed from: qh */
    public String mo9660qh(String str) {
        SnsMethodCalculate.markStartTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        String o = AdLandingPageEggCardHelper.m119904o(str);
        SnsMethodCalculate.markEndTimeMs("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        return o;
    }
}
