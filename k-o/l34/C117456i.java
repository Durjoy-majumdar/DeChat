package l34;

import java.util.concurrent.TimeUnit;
import n34.C117603a;
import n34.C117605d;
import p34.C117956l;

/* renamed from: l34.i */
public abstract class C117456i {

    /* renamed from: d */
    public static final long f351523d = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: l34.i$a */
    public static abstract class C117457a implements C117459k {
        /* renamed from: a */
        public long mo182161a() {
            return System.currentTimeMillis();
        }

        /* renamed from: b */
        public abstract C117459k mo182162b(C117603a aVar);

        /* renamed from: e */
        public abstract C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit);
    }

    public abstract C117457a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends C117456i & C117459k> S when(C117605d<C117453e<C117453e<C117447c>>, C117447c> dVar) {
        return new C117956l(dVar, this);
    }
}
