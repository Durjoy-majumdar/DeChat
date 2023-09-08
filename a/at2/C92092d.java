package at2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: at2.d */
public final class C92092d {

    /* renamed from: a */
    public final String f263641a;

    /* renamed from: b */
    public final String f263642b;

    public C92092d(String str, String str2) {
        C87412m.m108594g(str, "key");
        this.f263641a = str;
        this.f263642b = str2;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
        String str = "PickItem(key='" + this.f263641a + "', label=" + this.f263642b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
        return str;
    }
}
