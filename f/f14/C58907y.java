package f14;

import a14.C53851a;
import a14.C53865c0;
import fy3.C32226l;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;
import yx3.C66705e;

/* renamed from: f14.y */
public class C58907y<T> extends C53851a<T> implements C66705e {

    /* renamed from: f */
    public final C15601d<T> f168560f;

    public C58907y(C66212f fVar, C15601d<? super T> dVar) {
        super(fVar, true, true);
        this.f168560f = dVar;
    }

    public final C66705e getCallerFrame() {
        C15601d<T> dVar = this.f168560f;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    /* renamed from: i0 */
    public final boolean mo74535i0() {
        return true;
    }

    /* renamed from: v0 */
    public void mo74470v0(Object obj) {
        C15601d<T> dVar = this.f168560f;
        dVar.resumeWith(C53865c0.m60381a(obj, dVar));
    }

    /* renamed from: x */
    public void mo74511x(Object obj) {
        C58885i.m68733b(C66447b.m78392b(this.f168560f), C53865c0.m60381a(obj, this.f168560f), (C32226l) null, 2, (Object) null);
    }
}
