package dh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: dh3.f */
public final class C7330f implements C116617e {

    /* renamed from: a */
    public final C32224a<Long> f25442a;

    /* renamed from: b */
    public final C32224a<Long> f25443b;

    /* renamed from: c */
    public final String f25444c = "TimeCompareCondition";

    public C7330f(C32224a<Long> aVar, C32224a<Long> aVar2) {
        C87412m.m108594g(aVar, "getOldTime");
        C87412m.m108594g(aVar2, "getNewTime");
        this.f25442a = aVar;
        this.f25443b = aVar2;
    }

    /* renamed from: a */
    public boolean mo8501a() {
        long longValue = this.f25442a.invoke().longValue();
        long longValue2 = this.f25443b.invoke().longValue();
        boolean z = longValue == 0 || this.f25443b.invoke().longValue() > longValue;
        String str = this.f25444c;
        Log.m105918d(str, "oldTime:" + longValue + ", newTime:" + longValue2 + ", canUpdate:" + z);
        return z;
    }
}
