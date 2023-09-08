package gp3;

import hp3.C87581a;
import java.util.Iterator;
import mp3.C88819d;
import mp3.C88822g;
import op3.C117882j;

/* renamed from: gp3.c */
public abstract class C87316c<_Callback> extends C87314a<_Callback> {

    /* renamed from: gp3.c$a */
    public class C87317a implements C87581a<Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ C87315b f253061a;

        /* renamed from: b */
        public final /* synthetic */ C117882j f253062b;

        public C87317a(C87315b bVar, C117882j jVar) {
            this.f253061a = bVar;
            this.f253062b = jVar;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C87316c.this.mo121712o(this.f253061a.f253059e, this.f253062b);
            return voidR;
        }
    }

    public C87316c() {
    }

    /* renamed from: n */
    public final void mo121711n(C117882j jVar) {
        Iterator<C87315b> it = getQueueImpl().iterator();
        while (it.hasNext()) {
            C87315b next = it.next();
            if (next != null) {
                C88822g gVar = this.mSchedulerInvoker;
                C88819d current = C88819d.current();
                synchronized (gVar) {
                    gVar.f256224a = current;
                }
                this.mSchedulerInvoker.mo123215a(new C87317a(next, jVar), (Object) null, true);
            }
        }
    }

    /* renamed from: o */
    public abstract void mo121712o(_Callback _callback, C117882j jVar);

    public C87316c(C88819d dVar) {
        super(dVar);
    }
}
