package wx3;

import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import xx3.C15911a;
import yx3.C66705e;

/* renamed from: wx3.h */
public final class C66218h<T> implements C15601d<T>, C66705e {
    @Deprecated

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater<C66218h<?>, Object> f190254e = AtomicReferenceFieldUpdater.newUpdater(C66218h.class, Object.class, "result");

    /* renamed from: d */
    public final C15601d<T> f190255d;
    private volatile Object result;

    public C66218h(C15601d<? super T> dVar, Object obj) {
        C87412m.m108594g(dVar, "delegate");
        this.f190255d = dVar;
        this.result = obj;
    }

    /* renamed from: b */
    public final Object mo90314b() {
        boolean z;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        Object obj = this.result;
        C15911a aVar2 = C15911a.UNDECIDED;
        if (obj == aVar2) {
            AtomicReferenceFieldUpdater<C66218h<?>, Object> atomicReferenceFieldUpdater = f190254e;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, aVar2, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar2) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return aVar;
            }
            obj = this.result;
        }
        if (obj == C15911a.RESUMED) {
            return aVar;
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    public C66705e getCallerFrame() {
        C15601d<T> dVar = this.f190255d;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    public C66212f getContext() {
        return this.f190255d.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C15911a aVar = C15911a.UNDECIDED;
            boolean z = false;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<C66218h<?>, Object> atomicReferenceFieldUpdater = f190254e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                        if (atomicReferenceFieldUpdater.get(this) != aVar) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
                if (obj2 == aVar2) {
                    AtomicReferenceFieldUpdater<C66218h<?>, Object> atomicReferenceFieldUpdater2 = f190254e;
                    C15911a aVar3 = C15911a.RESUMED;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                            if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        this.f190255d.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f190255d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C66218h(C15601d<? super T> dVar) {
        this(dVar, C15911a.UNDECIDED);
        C87412m.m108594g(dVar, "delegate");
    }
}
