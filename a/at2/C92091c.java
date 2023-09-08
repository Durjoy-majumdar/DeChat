package at2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.List;

/* renamed from: at2.c */
public final class C92091c {

    /* renamed from: a */
    public final String f263637a;

    /* renamed from: b */
    public final String f263638b;

    /* renamed from: c */
    public final C92091c f263639c;

    /* renamed from: d */
    public final List<C92091c> f263640d;

    public C92091c(String str, String str2, List<C92091c> list, C92091c cVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "label");
        this.f263637a = str;
        this.f263638b = str2;
        this.f263639c = cVar;
        this.f263640d = list;
    }

    /* renamed from: a */
    public final List<C92091c> mo126080a() {
        SnsMethodCalculate.markStartTimeMs("getChildNodes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        List<C92091c> list = this.f263640d;
        SnsMethodCalculate.markEndTimeMs("getChildNodes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return list;
    }

    /* renamed from: b */
    public final String mo126081b() {
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        String str = this.f263637a;
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return str;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        StringBuilder sb = new StringBuilder();
        sb.append("PickDataNode(key='");
        sb.append(this.f263637a);
        sb.append("', label='");
        sb.append(this.f263638b);
        sb.append("', childNodes=");
        List<C92091c> list = this.f263640d;
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        sb.append(", parentNode=");
        sb.append(this.f263639c);
        sb.append(')');
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return sb4;
    }
}
