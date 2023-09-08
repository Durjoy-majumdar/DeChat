package e14;

import wx3.C15601d;
import wx3.C66212f;
import yx3.C66705e;

/* renamed from: e14.a0 */
public final class C58473a0<T> implements C15601d<T>, C66705e {

    /* renamed from: d */
    public final C15601d<T> f167453d;

    /* renamed from: e */
    public final C66212f f167454e;

    public C58473a0(C15601d<? super T> dVar, C66212f fVar) {
        this.f167453d = dVar;
        this.f167454e = fVar;
    }

    public C66705e getCallerFrame() {
        C15601d<T> dVar = this.f167453d;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    public C66212f getContext() {
        return this.f167454e;
    }

    public void resumeWith(Object obj) {
        this.f167453d.resumeWith(obj);
    }
}
