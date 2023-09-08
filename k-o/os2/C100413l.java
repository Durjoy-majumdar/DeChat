package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import te3.C101804kv2;

/* renamed from: os2.l */
public final class C100413l {

    /* renamed from: a */
    public final C101804kv2 f294169a;

    /* renamed from: b */
    public final C101804kv2 f294170b;

    /* renamed from: c */
    public final C101804kv2 f294171c;

    /* renamed from: d */
    public final C100418s f294172d;

    /* renamed from: e */
    public final int f294173e;

    public C100413l(C101804kv2 kv22, C101804kv2 kv23, C101804kv2 kv24, C100418s sVar, int i) {
        C87412m.m108594g(sVar, "playModeInfo");
        this.f294169a = kv22;
        this.f294170b = kv23;
        this.f294171c = kv24;
        this.f294172d = sVar;
        this.f294173e = i;
    }

    /* renamed from: a */
    public final C101804kv2 mo139876a() {
        SnsMethodCalculate.markStartTimeMs("getOneToOneHighMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        C101804kv2 kv22 = this.f294170b;
        SnsMethodCalculate.markEndTimeMs("getOneToOneHighMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        return kv22;
    }

    /* renamed from: b */
    public final C100418s mo139877b() {
        SnsMethodCalculate.markStartTimeMs("getPlayModeInfo", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        C100418s sVar = this.f294172d;
        SnsMethodCalculate.markEndTimeMs("getPlayModeInfo", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        return sVar;
    }

    /* renamed from: c */
    public final int mo139878c() {
        SnsMethodCalculate.markStartTimeMs("getVideoCompositeType", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        int i = this.f294173e;
        SnsMethodCalculate.markEndTimeMs("getVideoCompositeType", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        return i;
    }
}
