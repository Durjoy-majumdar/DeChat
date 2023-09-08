package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: os2.s */
public final class C100418s {

    /* renamed from: a */
    public final int f294177a;

    /* renamed from: b */
    public final float f294178b;

    /* renamed from: c */
    public final float f294179c;

    /* renamed from: d */
    public final float f294180d;

    /* renamed from: e */
    public final C100419u f294181e;

    public C100418s(int i, float f, float f2, float f3, C100419u uVar) {
        this.f294177a = i;
        this.f294178b = f;
        this.f294179c = f2;
        this.f294180d = f3;
        this.f294181e = uVar;
    }

    /* renamed from: a */
    public final float mo139880a() {
        SnsMethodCalculate.markStartTimeMs("getLoopStartTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        float f = this.f294179c;
        SnsMethodCalculate.markEndTimeMs("getLoopStartTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        return f;
    }

    /* renamed from: b */
    public final C100419u mo139881b() {
        SnsMethodCalculate.markStartTimeMs("getPlayStateInfo", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        C100419u uVar = this.f294181e;
        SnsMethodCalculate.markEndTimeMs("getPlayStateInfo", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        return uVar;
    }
}
