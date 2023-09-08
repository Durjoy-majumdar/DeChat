package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: os2.u */
public final class C100419u {

    /* renamed from: a */
    public final float f294182a;

    /* renamed from: b */
    public final C62176t f294183b;

    /* renamed from: c */
    public final C62176t f294184c;

    /* renamed from: d */
    public final C62176t f294185d;

    /* renamed from: e */
    public final C62176t f294186e;

    /* renamed from: f */
    public final C62176t f294187f;

    public C100419u(float f, C62176t tVar, C62176t tVar2, C62176t tVar3, C62176t tVar4, C62176t tVar5) {
        C87412m.m108594g(tVar, "breakState");
        C87412m.m108594g(tVar2, "stopState");
        C87412m.m108594g(tVar3, "likeState");
        C87412m.m108594g(tVar4, "commentState");
        this.f294182a = f;
        this.f294183b = tVar;
        this.f294184c = tVar2;
        this.f294185d = tVar3;
        this.f294186e = tVar4;
        this.f294187f = tVar5;
    }

    /* renamed from: a */
    public final C62176t mo139882a() {
        SnsMethodCalculate.markStartTimeMs("getBreakState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        C62176t tVar = this.f294183b;
        SnsMethodCalculate.markEndTimeMs("getBreakState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        return tVar;
    }

    /* renamed from: b */
    public final C62176t mo139883b() {
        SnsMethodCalculate.markStartTimeMs("getCancelLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        C62176t tVar = this.f294187f;
        SnsMethodCalculate.markEndTimeMs("getCancelLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        return tVar;
    }

    /* renamed from: c */
    public final C62176t mo139884c() {
        SnsMethodCalculate.markStartTimeMs("getStopState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        C62176t tVar = this.f294184c;
        SnsMethodCalculate.markEndTimeMs("getStopState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        return tVar;
    }
}
