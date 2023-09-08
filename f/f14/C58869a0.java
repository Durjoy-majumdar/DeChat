package f14;

import f14.C58908z;

/* renamed from: f14.a0 */
public final class C58869a0<S extends C58908z<S>> {
    /* renamed from: a */
    public static final S m68703a(Object obj) {
        if (obj == C58875e.f168512a) {
            throw new IllegalStateException("Does not contain segment".toString());
        } else if (obj != null) {
            return (C58908z) obj;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
    }
}
