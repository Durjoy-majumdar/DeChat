package y20;

import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* renamed from: y20.b */
public class C53488b {

    /* renamed from: a */
    public final List<C38947d<C53487a>> f150407a = new LinkedList();

    /* renamed from: b */
    public final List<C53490c> f150408b = new LinkedList();

    /* renamed from: y20.b$d */
    public static class C38947d<T> extends WeakReference<T> {
        public C38947d(T t) {
            super(t);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C38947d)) {
                return false;
            }
            Object obj2 = ((C38947d) obj).get();
            Object obj3 = get();
            if (obj2 != obj3) {
                return obj3 != null && obj3.equals(obj2);
            }
            return true;
        }
    }

    /* renamed from: y20.b$b */
    public static final class C53489b {

        /* renamed from: a */
        public static C53488b f150409a = new C53488b((C38946a) null);
    }

    /* renamed from: y20.b$c */
    public interface C53490c {
        /* renamed from: a */
        void mo74162a(C53487a aVar);

        /* renamed from: b */
        void mo74163b(C53487a aVar);
    }

    public C53488b(C38946a aVar) {
    }

    /* renamed from: a */
    public boolean mo74159a(C53487a aVar) {
        if (mo74160b(aVar)) {
            return false;
        }
        synchronized (this.f150407a) {
            ((LinkedList) this.f150407a).add(new C38947d(aVar));
            synchronized (this) {
                for (C53490c a : this.f150408b) {
                    a.mo74162a(aVar);
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo74160b(C53487a aVar) {
        if (aVar == null) {
            return false;
        }
        synchronized (this.f150407a) {
            for (C38947d next : this.f150407a) {
                if (next != null) {
                    C53487a aVar2 = (C53487a) next.get();
                    if (aVar2 != null) {
                        if (aVar.equals(aVar2)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo74161c(C53487a aVar) {
        boolean remove;
        if (aVar == null) {
            return false;
        }
        synchronized (this.f150407a) {
            remove = ((LinkedList) this.f150407a).remove(new C38947d(aVar));
            synchronized (this) {
                for (C53490c b : this.f150408b) {
                    b.mo74163b(aVar);
                }
            }
        }
        return remove;
    }
}
