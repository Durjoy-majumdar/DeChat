package mu3;

import java.util.Objects;
import ku3.C117409a;
import mu3.C117573d;
import mu3.C117577e;

/* renamed from: mu3.b */
public class C117560b implements C117573d.C117576d, C117577e.C117578a {

    /* renamed from: mu3.b$a */
    public interface C109641a {
    }

    public C117560b(C109641a aVar) {
    }

    /* renamed from: a */
    public void mo182292a(C117577e eVar) {
        eVar.f351736z = this;
        ((C117409a) eVar.f351581r).mo182101c(eVar);
    }

    /* renamed from: b */
    public void mo182293b(C109639a aVar, C117577e eVar) {
        eVar.f351736z = null;
        C117573d dVar = aVar.f328238b;
        if (!dVar.f351728e.get()) {
            synchronized (dVar) {
                C117577e pollFirst = dVar.f351732i.pollFirst();
                while (pollFirst != null && pollFirst.isCancelled()) {
                    pollFirst = dVar.f351732i.pollFirst();
                }
                if (pollFirst != null) {
                    C117573d.C117576d dVar2 = dVar.f351729f;
                    Objects.requireNonNull(dVar2);
                    dVar2.mo182292a(pollFirst);
                    return;
                }
                dVar.f351730g = false;
                dVar.mo182312e();
            }
        }
    }
}
