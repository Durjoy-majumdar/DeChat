package f14;

import f14.C58908z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: f14.z */
public abstract class C58908z<S extends C58908z<S>> extends C58877f<S> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f168561d = AtomicIntegerFieldUpdater.newUpdater(C58908z.class, "cleanedAndPointers");

    /* renamed from: c */
    public final long f168562c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public C58908z(long j, S s, int i) {
        super(s);
        this.f168562c = j;
        this.cleanedAndPointers = i << 16;
    }

    /* renamed from: b */
    public boolean mo84058b() {
        return this.cleanedAndPointers == mo84103f() && !mo84059c();
    }

    /* renamed from: e */
    public final boolean mo84102e() {
        return f168561d.addAndGet(this, -65536) == mo84103f() && !mo84059c();
    }

    /* renamed from: f */
    public abstract int mo84103f();

    /* renamed from: g */
    public final boolean mo84104g() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != mo84103f() || mo84059c())) {
                return false;
            }
        } while (!f168561d.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
