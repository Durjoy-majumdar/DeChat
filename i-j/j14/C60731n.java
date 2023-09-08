package j14;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: j14.n */
public final class C60731n {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f172972b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f172973c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f172974d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f172975e;

    /* renamed from: a */
    public final AtomicReferenceArray<C60725h> f172976a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C60731n> cls = C60731n.class;
        f172972b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f172973c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f172974d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f172975e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: a */
    public final C60725h mo85667a(C60725h hVar, boolean z) {
        if (z) {
            return mo85668b(hVar);
        }
        C60725h hVar2 = (C60725h) f172972b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return mo85668b(hVar2);
    }

    /* renamed from: b */
    public final C60725h mo85668b(C60725h hVar) {
        boolean z = true;
        if (hVar.f172961e.mo85664b() != 1) {
            z = false;
        }
        if (z) {
            f172975e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f172976a.get(i) != null) {
            Thread.yield();
        }
        this.f172976a.lazySet(i, hVar);
        f172973c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final int mo85669c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* renamed from: d */
    public final C60725h mo85670d() {
        C60725h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f172974d.compareAndSet(this, i, i + 1) && (andSet = this.f172976a.getAndSet(i2, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f172961e.mo85664b() != 1) {
                    z = false;
                }
                if (z) {
                    f172975e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: e */
    public final long mo85671e(C60731n nVar) {
        int i = nVar.consumerIndex;
        int i2 = nVar.producerIndex;
        AtomicReferenceArray<C60725h> atomicReferenceArray = nVar.f172976a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            C60725h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f172961e.mo85664b() == 1) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                            if (atomicReferenceArray.get(i3) != hVar) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        f172975e.decrementAndGet(nVar);
                        mo85667a(hVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return mo85672f(nVar, true);
    }

    /* renamed from: f */
    public final long mo85672f(C60731n nVar, boolean z) {
        C60725h hVar;
        boolean z2;
        do {
            hVar = (C60725h) nVar.lastScheduledTask;
            if (hVar != null) {
                z2 = true;
                if (z) {
                    if (!(hVar.f172961e.mo85664b() == 1)) {
                        return -2;
                    }
                }
                ((C60722e) C60729l.f172968e).getClass();
                long nanoTime = System.nanoTime() - hVar.f172960d;
                long j = C60729l.f172964a;
                if (nanoTime >= j) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f172972b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(nVar, hVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(nVar) != hVar) {
                                z2 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z2);
        mo85667a(hVar, false);
        return -1;
    }
}
