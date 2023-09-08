package yx3;

import gy3.C87412m;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;

/* renamed from: yx3.d */
public abstract class C66704d extends C91589a {
    private final C66212f _context;
    private transient C15601d<Object> intercepted;

    public C66704d(C15601d<Object> dVar, C66212f fVar) {
        super(dVar);
        this._context = fVar;
    }

    public C66212f getContext() {
        C66212f fVar = this._context;
        C87412m.m108591d(fVar);
        return fVar;
    }

    public final C15601d<Object> intercepted() {
        C15601d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C66212f context = getContext();
            int i = C66210e.f190250O0;
            C66210e eVar = (C66210e) context.get(C66210e.C66211a.f190251d);
            if (eVar == null || (dVar = eVar.mo74563c0(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    public void releaseIntercepted() {
        C15601d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C66212f context = getContext();
            int i = C66210e.f190250O0;
            C66212f.C66215b bVar = context.get(C66210e.C66211a.f190251d);
            C87412m.m108591d(bVar);
            ((C66210e) bVar).mo74566s(dVar);
        }
        this.intercepted = C16080c.f43229d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C66704d(C15601d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
