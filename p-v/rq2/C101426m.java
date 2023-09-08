package rq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import eb0.C31543z5;

/* renamed from: rq2.m */
public final class C101426m {

    /* renamed from: rq2.m$a */
    public static class C101427a {

        /* renamed from: a */
        public int f297075a;

        /* renamed from: b */
        public int f297076b;

        /* renamed from: c */
        public int f297077c;

        /* renamed from: d */
        public int f297078d;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil$DateTime");
            String str = "DateTime{day=" + this.f297075a + ", hour=" + this.f297076b + ", minute=" + this.f297077c + ", second=" + this.f297078d + '}' + '@' + hashCode();
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil$DateTime");
            return str;
        }
    }

    /* renamed from: a */
    public static String m133103a(int i) {
        SnsMethodCalculate.markStartTimeMs("fillDigital", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        if (i > 9 || i < 0) {
            String valueOf = String.valueOf(i);
            SnsMethodCalculate.markEndTimeMs("fillDigital", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
            return valueOf;
        }
        String str = "0" + i;
        SnsMethodCalculate.markEndTimeMs("fillDigital", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return str;
    }

    /* renamed from: b */
    public static long m133104b() {
        SnsMethodCalculate.markStartTimeMs("getServerTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        long c = C31543z5.m39453c();
        SnsMethodCalculate.markEndTimeMs("getServerTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return c;
    }

    /* renamed from: c */
    public static boolean m133105c(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("isCountDownTimeValid", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        long b = m133104b();
        if (j == 0) {
            j = b;
        }
        boolean z = false;
        if (j < 0 || j > b || j2 < b) {
            SnsMethodCalculate.markEndTimeMs("isCountDownTimeValid", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
            return false;
        }
        if (((int) ((j2 - b) / 86400000)) < 100) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isCountDownTimeValid", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return z;
    }

    /* renamed from: d */
    public static C101427a m133106d(long j, C101427a aVar) {
        SnsMethodCalculate.markStartTimeMs("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        if (aVar == null) {
            aVar = new C101427a();
        }
        int i = (int) (j / 86400000);
        aVar.f297075a = i;
        int i2 = (int) ((j - (((long) i) * 86400000)) / 3600000);
        aVar.f297076b = i2;
        int i3 = (int) (((j - (((long) i) * 86400000)) - (((long) i2) * 3600000)) / 60000);
        aVar.f297077c = i3;
        aVar.f297078d = (int) ((((j - (((long) i) * 86400000)) - (((long) i2) * 3600000)) - (((long) i3) * 60000)) / 1000);
        SnsMethodCalculate.markEndTimeMs("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return aVar;
    }
}
