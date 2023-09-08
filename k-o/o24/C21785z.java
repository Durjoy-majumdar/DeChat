package o24;

import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o24.z */
public final class C21785z {

    /* renamed from: a */
    public static final C21784y f61738a = new C21784y(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f61739b;

    /* renamed from: c */
    public static final AtomicReference<C21784y>[] f61740c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f61739b = highestOneBit;
        AtomicReference<C21784y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f61740c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m24975a(C21784y yVar) {
        C87412m.m108594g(yVar, "segment");
        boolean z = true;
        if (!(yVar.f61736f == null && yVar.f61737g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!yVar.f61734d) {
            Thread currentThread = Thread.currentThread();
            C87412m.m108593f(currentThread, "Thread.currentThread()");
            AtomicReference<C21784y> atomicReference = f61740c[(int) (currentThread.getId() & (((long) f61739b) - 1))];
            C21784y yVar2 = atomicReference.get();
            if (yVar2 != f61738a) {
                int i = yVar2 != null ? yVar2.f61733c : 0;
                if (i < 65536) {
                    yVar.f61736f = yVar2;
                    yVar.f61732b = 0;
                    yVar.f61733c = i + 8192;
                    while (true) {
                        if (!atomicReference.compareAndSet(yVar2, yVar)) {
                            if (atomicReference.get() != yVar2) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z) {
                        yVar.f61736f = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final C21784y m24976b() {
        Thread currentThread = Thread.currentThread();
        C87412m.m108593f(currentThread, "Thread.currentThread()");
        AtomicReference<C21784y> atomicReference = f61740c[(int) (currentThread.getId() & (((long) f61739b) - 1))];
        C21784y yVar = f61738a;
        C21784y andSet = atomicReference.getAndSet(yVar);
        if (andSet == yVar) {
            return new C21784y();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new C21784y();
        }
        atomicReference.set(andSet.f61736f);
        andSet.f61736f = null;
        andSet.f61733c = 0;
        return andSet;
    }
}
