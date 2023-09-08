package qh3;

import java.util.concurrent.atomic.AtomicInteger;
import qh3.C89661b;

/* renamed from: qh3.f */
public abstract class C89668f<Out, In> extends C89660a<Out> implements C89661b.C89662a<In> {

    /* renamed from: h */
    public C89661b.C89663b<In> f257899h;

    /* renamed from: i */
    public final AtomicInteger f257900i = new AtomicInteger(0);

    public C89668f(String str, C89661b.C89663b<In> bVar, Out out) {
        super(str, out);
        this.f257899h = bVar;
    }

    /* renamed from: a */
    public void mo123994a(C89661b.C89663b<In> bVar, In in) {
        mo123989f(Boolean.valueOf(!((Boolean) in).booleanValue()));
    }

    /* renamed from: d */
    public void mo123987d(C89661b.C89662a<Out> aVar) {
        if (this.f257900i.getAndIncrement() == 0) {
            this.f257899h.mo123986c(this);
        }
    }

    /* renamed from: e */
    public void mo123988e(C89661b.C89662a<Out> aVar) {
        if (this.f257900i.decrementAndGet() == 0) {
            this.f257899h.mo123985b(this);
        }
    }
}
