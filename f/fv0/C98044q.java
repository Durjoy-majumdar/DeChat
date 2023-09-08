package fv0;

import com.tencent.wcdb.support.CancellationSignal;
import fy3.C32224a;
import rx3.C13598b0;
import wy0.C102506a;
import wy0.C102522u;
import zt3.C119157j;

/* renamed from: fv0.q */
public final class C98044q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f287463d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f287464e;

    /* renamed from: fv0.q$a */
    public static final class C98045a implements C102522u {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f287465a;

        /* renamed from: fv0.q$a$a */
        public static final class C98046a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C32224a<C13598b0> f287466d;

            public C98046a(C32224a<C13598b0> aVar) {
                this.f287466d = aVar;
            }

            public final void run() {
                this.f287466d.invoke();
            }
        }

        public C98045a(C32224a<C13598b0> aVar) {
            this.f287465a = aVar;
        }

        /* renamed from: a */
        public void mo137337a(long j, long j2) {
        }

        /* renamed from: b */
        public void mo137338b(boolean z, long j, int i, int i2) {
            ((C119157j) C119157j.f356862d).mo183895z(new C98046a(this.f287465a));
        }
    }

    public C98044q(CancellationSignal cancellationSignal, C32224a<C13598b0> aVar) {
        this.f287463d = cancellationSignal;
        this.f287464e = aVar;
    }

    public final void run() {
        C102506a.f301832a.mo142124j(new C98045a(this.f287464e), this.f287463d);
    }
}
