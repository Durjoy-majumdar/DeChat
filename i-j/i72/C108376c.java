package i72;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i72.c */
public class C108376c {

    /* renamed from: a */
    public String f324477a = "default";

    /* renamed from: b */
    public long f324478b = Util.currentTicks();

    /* renamed from: c */
    public long f324479c = Util.currentTicks();

    /* renamed from: d */
    public long f324480d = 0;

    /* renamed from: e */
    public long f324481e = 0;

    public C108376c(String str) {
        this.f324477a = str;
    }

    /* renamed from: a */
    public void mo158893a(long j) {
        if (this.f324481e == 0) {
            this.f324478b = Util.currentTicks();
        }
        this.f324480d += j;
        this.f324481e++;
        this.f324479c = Util.currentTicks();
    }

    /* renamed from: b */
    public String mo158894b() {
        if (this.f324481e == 0) {
            return "";
        }
        double d = ((double) (this.f324479c - this.f324478b)) / 1000.0d;
        if (d == 0.0d) {
            d = 1.0d;
        }
        return ((((double) this.f324481e) * 1.0d) / d) + "";
    }

    /* renamed from: c */
    public String mo158895c() {
        long j = this.f324481e;
        if (j == 0) {
            return "";
        }
        double d = ((double) (this.f324479c - this.f324478b)) / 1000.0d;
        if (d == 0.0d) {
            d = 1.0d;
        }
        return String.format("CounterUtil %s tag %s count %s passed %.3f perValue %.3f/count counttime %.3f/s valuetime %.3f/s st:%s ed:%s diff%s", new Object[]{"", this.f324477a, Long.valueOf(j), Double.valueOf(d), Double.valueOf((((double) this.f324480d) * 1.0d) / ((double) this.f324481e)), Double.valueOf((((double) this.f324481e) * 1.0d) / d), Double.valueOf((((double) this.f324480d) * 1.0d) / d), Long.valueOf(this.f324478b), Long.valueOf(this.f324479c), Long.valueOf(this.f324479c - this.f324478b)});
    }

    /* renamed from: d */
    public void mo158896d() {
        this.f324480d = 0;
        this.f324481e = 0;
    }
}
