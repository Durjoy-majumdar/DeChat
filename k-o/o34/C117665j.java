package o34;

import java.util.concurrent.TimeUnit;
import l34.C117453e;
import l34.C117455h;
import l34.C117456i;
import l34.C117458j;
import v34.C118647c;

/* renamed from: o34.j */
public final class C117665j implements C117453e.C88376a<Long> {

    /* renamed from: d */
    public final long f351940d;

    /* renamed from: e */
    public final long f351941e;

    /* renamed from: f */
    public final TimeUnit f351942f;

    /* renamed from: g */
    public final C117456i f351943g;

    public C117665j(long j, long j2, TimeUnit timeUnit, C117456i iVar) {
        this.f351940d = j;
        this.f351941e = j2;
        this.f351942f = timeUnit;
        this.f351943g = iVar;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117456i.C117457a createWorker = this.f351943g.createWorker();
        jVar.mo182166e(createWorker);
        C117664i iVar = new C117664i(this, jVar, createWorker);
        long j = this.f351940d;
        long j2 = this.f351941e;
        TimeUnit timeUnit = this.f351942f;
        createWorker.getClass();
        long nanos = timeUnit.toNanos(j2);
        long nanos2 = TimeUnit.MILLISECONDS.toNanos(createWorker.mo182161a());
        C118647c cVar = new C118647c();
        C117455h hVar = r3;
        C117455h hVar2 = new C117455h(createWorker, nanos2, nanos2 + timeUnit.toNanos(j), iVar, cVar, nanos);
        C118647c cVar2 = new C118647c();
        cVar.mo183373a(cVar2);
        cVar2.mo183373a(createWorker.mo182163e(hVar, j, timeUnit));
    }
}
