package o34;

import java.util.concurrent.TimeUnit;
import l34.C117453e;
import l34.C117456i;
import l34.C117458j;

/* renamed from: o34.h */
public final class C117663h implements C117453e.C88376a<Long> {

    /* renamed from: d */
    public final long f351934d;

    /* renamed from: e */
    public final TimeUnit f351935e;

    /* renamed from: f */
    public final C117456i f351936f;

    public C117663h(long j, TimeUnit timeUnit, C117456i iVar) {
        this.f351934d = j;
        this.f351935e = timeUnit;
        this.f351936f = iVar;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117456i.C117457a createWorker = this.f351936f.createWorker();
        jVar.mo182166e(createWorker);
        createWorker.mo182163e(new C117662g(this, jVar), this.f351934d, this.f351935e);
    }
}
