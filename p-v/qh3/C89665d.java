package qh3;

import java.util.concurrent.atomic.AtomicInteger;
import qh3.C89661b;

/* renamed from: qh3.d */
public abstract class C89665d<Out, In1, In2> extends C89660a<Out> implements C89661b.C89662a<In1> {

    /* renamed from: h */
    public C89661b.C89663b<In1> f257894h;

    /* renamed from: i */
    public C89661b.C89663b<In2> f257895i;

    /* renamed from: j */
    public C89661b.C89662a<In2> f257896j = new C89666a();

    /* renamed from: n */
    public final AtomicInteger f257897n = new AtomicInteger(0);

    /* renamed from: qh3.d$a */
    public class C89666a implements C89661b.C89662a<In2> {
        public C89666a() {
        }

        /* renamed from: a */
        public void mo123994a(C89661b.C89663b<In2> bVar, In2 in22) {
            C89665d dVar = C89665d.this;
            dVar.mo123989f(Boolean.valueOf(((Boolean) dVar.f257894h.get()).booleanValue() && ((Boolean) in22).booleanValue()));
        }
    }

    public C89665d(String str, C89661b.C89663b<In1> bVar, C89661b.C89663b<In2> bVar2, Out out) {
        super(str, out);
        this.f257894h = bVar;
        this.f257895i = bVar2;
    }

    /* renamed from: a */
    public void mo123994a(C89661b.C89663b<In1> bVar, In1 in12) {
        mo123989f(Boolean.valueOf(((Boolean) in12).booleanValue() && ((Boolean) this.f257895i.get()).booleanValue()));
    }

    /* renamed from: d */
    public void mo123987d(C89661b.C89662a<Out> aVar) {
        if (this.f257897n.getAndIncrement() == 0) {
            this.f257894h.mo123986c(this);
            this.f257895i.mo123986c(this.f257896j);
        }
    }

    /* renamed from: e */
    public void mo123988e(C89661b.C89662a<Out> aVar) {
        mo123985b(aVar);
        if (this.f257897n.decrementAndGet() == 0) {
            this.f257894h.mo123985b(this);
            this.f257895i.mo123985b(this.f257896j);
        }
    }
}
