package iu3;

import java.util.concurrent.TimeUnit;

/* renamed from: iu3.e */
public class C117275e extends C117272b {
    public C117275e(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: d */
    public long mo181964d(C117277g gVar, TimeUnit timeUnit) {
        Object obj = gVar.f351130a.get("INCREMENT");
        long longValue = obj == null ? 1 : ((Long) obj).longValue();
        long j = 0;
        Object obj2 = gVar.f351130a.get("LAST_INCREMENT");
        if (obj2 != null) {
            j = ((Long) obj2).longValue();
        }
        long j2 = j + longValue;
        gVar.f351130a.put("LAST_INCREMENT", Long.valueOf(longValue));
        gVar.f351130a.put("INCREMENT", Long.valueOf(j2));
        return timeUnit.convert(j2, TimeUnit.MILLISECONDS);
    }
}
