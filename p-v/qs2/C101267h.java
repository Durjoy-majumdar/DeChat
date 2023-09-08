package qs2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: qs2.h */
public class C101267h extends C101287r {

    /* renamed from: Z */
    public String f296596Z;

    /* renamed from: a0 */
    public String f296597a0;

    /* renamed from: b0 */
    public long f296598b0;

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[disableWording:");
        stringBuffer.append(this.f296596Z);
        stringBuffer.append(", hbCoverId:");
        stringBuffer.append(this.f296597a0);
        stringBuffer.append(", disableTime:");
        stringBuffer.append(this.f296598b0);
        stringBuffer.append("]");
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
        return stringBuffer2;
    }
}
