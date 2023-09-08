package f14;

import f14.C58877f;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f14.f */
public abstract class C58877f<N extends C58877f<N>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168514a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168515b;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<C58877f> cls2 = C58877f.class;
        f168514a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f168515b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public C58877f(N n) {
        this._prev = n;
    }

    /* renamed from: a */
    public static final Object m68710a(C58877f fVar) {
        return fVar._next;
    }

    /* renamed from: b */
    public abstract boolean mo84058b();

    /* renamed from: c */
    public final boolean mo84059c() {
        Object obj = this._next;
        return (obj == C58875e.f168512a ? null : (C58877f) obj) == null;
    }

    /* renamed from: d */
    public final void mo84060d() {
        while (true) {
            C58877f fVar = (C58877f) this._prev;
            while (fVar != null && fVar.mo84058b()) {
                fVar = (C58877f) fVar._prev;
            }
            Object obj = this._next;
            C58877f fVar2 = obj == C58875e.f168512a ? null : (C58877f) obj;
            C87412m.m108591d(fVar2);
            while (fVar2.mo84058b()) {
                Object obj2 = fVar2._next;
                fVar2 = obj2 == C58875e.f168512a ? null : (C58877f) obj2;
                C87412m.m108591d(fVar2);
            }
            fVar2._prev = fVar;
            if (fVar != null) {
                fVar._next = fVar2;
            }
            if (!fVar2.mo84058b() && (fVar == null || !fVar.mo84058b())) {
                return;
            }
        }
    }
}
