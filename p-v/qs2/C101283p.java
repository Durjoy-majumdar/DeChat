package qs2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: qs2.p */
public class C101283p extends C101287r {

    /* renamed from: Z */
    public int f296667Z;

    /* renamed from: a0 */
    public int f296668a0;

    /* renamed from: b0 */
    public long f296669b0;

    /* renamed from: c0 */
    public String f296670c0;

    /* renamed from: d0 */
    public String f296671d0;

    /* renamed from: e0 */
    public String f296672e0;

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompSmartPhoneBtnInfo");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[sid:");
        stringBuffer.append(this.f296667Z);
        stringBuffer.append(", compId:");
        stringBuffer.append(this.f296668a0);
        stringBuffer.append(", aid:");
        stringBuffer.append(this.f296669b0);
        stringBuffer.append(", traceId:");
        stringBuffer.append(this.f296670c0);
        stringBuffer.append(", pageId:");
        stringBuffer.append(this.f296672e0);
        stringBuffer.append(", uxinfo:");
        stringBuffer.append(this.f296671d0);
        stringBuffer.append("]");
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompSmartPhoneBtnInfo");
        return stringBuffer2;
    }
}
