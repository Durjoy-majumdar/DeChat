package a14;

import gy3.C8480h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a14.y */
public class C53969y {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f151213b = AtomicIntegerFieldUpdater.newUpdater(C53969y.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f151214a;

    public C53969y(Throwable th, boolean z) {
        this.f151214a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean mo74643a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f151214a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53969y(Throwable th, boolean z, int i, C8480h hVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
