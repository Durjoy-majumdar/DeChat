package mu3;

import java.util.Iterator;
import java.util.concurrent.Callable;
import lu3.C117479j;

/* renamed from: mu3.e */
public class C117577e<E> extends C117479j<E> {

    /* renamed from: y */
    public final C109639a f351735y;

    /* renamed from: z */
    public C117578a f351736z;

    /* renamed from: mu3.e$a */
    public interface C117578a {
    }

    public C117577e(Runnable runnable, long j, String str, boolean z) {
        super(runnable, j, z);
        C109639a aVar;
        ThreadLocal<C109639a> threadLocal = C109639a.f328233c;
        synchronized (C109639a.class) {
            aVar = C109639a.f328235e.get(str);
            aVar = aVar == null ? new C109639a(str) : aVar;
        }
        this.f351735y = aVar;
    }

    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        C117578a aVar = this.f351736z;
        if (aVar != null) {
            ((C117560b) aVar).getClass();
            C117573d dVar = this.f351735y.f328238b;
            synchronized (dVar) {
                if (dVar.f351731h.remove(this)) {
                    dVar.f351727d.removeMessages(1, this);
                }
                Iterator<C117577e> it = dVar.f351732i.iterator();
                while (it.hasNext()) {
                    C117577e next = it.next();
                    if (next == this) {
                        if (!next.isCancelled()) {
                            next.cancel(false);
                        }
                        it.remove();
                    }
                }
            }
        }
        return true;
    }

    public void run() {
        try {
            C109639a aVar = this.f351735y;
            ThreadLocal<C109639a> threadLocal = C109639a.f328233c;
            threadLocal.set(aVar);
            super.run();
            threadLocal.set((Object) null);
            C117578a aVar2 = this.f351736z;
            if (aVar2 != null) {
                ((C117560b) aVar2).mo182293b(this.f351735y, this);
            }
        } catch (Throwable th) {
            C109639a.f328233c.set((Object) null);
            C117578a aVar3 = this.f351736z;
            if (aVar3 != null) {
                ((C117560b) aVar3).mo182293b(this.f351735y, this);
            }
            throw th;
        }
    }

    public C117577e(Callable<E> callable, long j, String str, boolean z) {
        super(callable, j, z);
        C109639a aVar;
        ThreadLocal<C109639a> threadLocal = C109639a.f328233c;
        synchronized (C109639a.class) {
            aVar = C109639a.f328235e.get(str);
            aVar = aVar == null ? new C109639a(str) : aVar;
        }
        this.f351735y = aVar;
    }
}
