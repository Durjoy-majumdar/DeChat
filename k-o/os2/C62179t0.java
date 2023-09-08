package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: os2.t0 */
public final class C62179t0 {

    /* renamed from: a */
    public final String f176783a;

    /* renamed from: b */
    public final String f176784b;

    /* renamed from: c */
    public final float f176785c;

    public C62179t0(String str, String str2, float f) {
        this.f176783a = str;
        this.f176784b = str2;
        this.f176785c = f;
    }

    /* renamed from: a */
    public final String mo87234a() {
        SnsMethodCalculate.markStartTimeMs("getTagIcon", "com.tencent.mm.plugin.sns.storage.TagInfo");
        String str = this.f176783a;
        SnsMethodCalculate.markEndTimeMs("getTagIcon", "com.tencent.mm.plugin.sns.storage.TagInfo");
        return str;
    }

    /* renamed from: b */
    public final String mo87235b() {
        SnsMethodCalculate.markStartTimeMs("getTagText", "com.tencent.mm.plugin.sns.storage.TagInfo");
        String str = this.f176784b;
        SnsMethodCalculate.markEndTimeMs("getTagText", "com.tencent.mm.plugin.sns.storage.TagInfo");
        return str;
    }
}
