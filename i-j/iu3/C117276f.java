package iu3;

import java.util.concurrent.TimeUnit;

/* renamed from: iu3.f */
public class C117276f extends C117272b {
    public C117276f(long j, float f, int i, int i2) {
        super(i, i2);
    }

    /* renamed from: d */
    public long mo181964d(C117277g gVar, TimeUnit timeUnit) {
        Object obj = gVar.f351130a.get("incrementCount");
        int intValue = obj == null ? 1 : ((Integer) obj).intValue();
        gVar.f351130a.put("incrementCount", Integer.valueOf(intValue + 1));
        return timeUnit.convert((long) (((float) 1000) + (((float) intValue) * 500.0f)), TimeUnit.MILLISECONDS);
    }
}
