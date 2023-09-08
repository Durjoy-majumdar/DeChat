package f14;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f14.c */
public abstract class C58871c<T> extends C58904v {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168509a = AtomicReferenceFieldUpdater.newUpdater(C58871c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C58870b.f168508a;

    /* renamed from: a */
    public C58871c<?> mo84054a() {
        return this;
    }

    /* renamed from: b */
    public final Object mo84055b(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        Object obj3 = C58870b.f168508a;
        if (obj2 == obj3) {
            Object d = mo74562d(obj);
            obj2 = this._consensus;
            if (obj2 == obj3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168509a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, d)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                obj2 = z ? d : this._consensus;
            }
        }
        mo84056c(obj, obj2);
        return obj2;
    }

    /* renamed from: c */
    public abstract void mo84056c(T t, Object obj);

    /* renamed from: d */
    public abstract Object mo74562d(T t);
}
