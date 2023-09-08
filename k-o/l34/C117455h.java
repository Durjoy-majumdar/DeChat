package l34;

import java.util.concurrent.TimeUnit;
import l34.C117456i;
import n34.C117603a;
import v34.C118647c;

/* renamed from: l34.h */
public class C117455h implements C117603a {

    /* renamed from: d */
    public long f351516d;

    /* renamed from: e */
    public long f351517e;

    /* renamed from: f */
    public long f351518f;

    /* renamed from: g */
    public final /* synthetic */ C117603a f351519g;

    /* renamed from: h */
    public final /* synthetic */ C118647c f351520h;

    /* renamed from: i */
    public final /* synthetic */ long f351521i;

    /* renamed from: j */
    public final /* synthetic */ C117456i.C117457a f351522j;

    public C117455h(C117456i.C117457a aVar, long j, long j2, C117603a aVar2, C118647c cVar, long j3) {
        this.f351522j = aVar;
        this.f351519g = aVar2;
        this.f351520h = cVar;
        this.f351521i = j3;
        this.f351517e = j;
        this.f351518f = j2;
    }

    public void call() {
        long j;
        this.f351519g.call();
        if (!this.f351520h.mo182164c()) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f351522j.mo182161a());
            long j2 = C117456i.f351523d;
            long j3 = this.f351517e;
            if (nanos + j2 >= j3) {
                long j4 = this.f351521i;
                if (nanos < j3 + j4 + j2) {
                    long j5 = this.f351518f;
                    long j6 = this.f351516d + 1;
                    this.f351516d = j6;
                    j = j5 + (j6 * j4);
                    this.f351517e = nanos;
                    this.f351520h.mo183373a(this.f351522j.mo182163e(this, j - nanos, TimeUnit.NANOSECONDS));
                }
            }
            long j7 = this.f351521i;
            long j8 = nanos + j7;
            long j9 = this.f351516d + 1;
            this.f351516d = j9;
            this.f351518f = j8 - (j7 * j9);
            j = j8;
            this.f351517e = nanos;
            this.f351520h.mo183373a(this.f351522j.mo182163e(this, j - nanos, TimeUnit.NANOSECONDS));
        }
    }
}
