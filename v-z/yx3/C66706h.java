package yx3;

import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: yx3.h */
public abstract class C66706h extends C91589a {
    public C66706h(C15601d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C66217g.f190253d)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C66212f getContext() {
        return C66217g.f190253d;
    }
}
