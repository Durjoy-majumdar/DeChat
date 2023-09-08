package w11;

import ac3.C103355g1;
import android.opengl.GLES20;
import e43.C107225c;
import e43.C107226d;
import p11.C110101a;
import p11.C110103c;
import q00.C110264g;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: w11.a */
public final class C111706a implements C110103c<C38008b, Object> {

    /* renamed from: a */
    public C111707c f334381a;

    /* renamed from: a */
    public Object mo161500a(C15601d<? super C13598b0> dVar) {
        C111707c cVar = this.f334381a;
        if (cVar != null) {
            synchronized (cVar) {
                C107226d dVar2 = cVar.f334382a;
                if (dVar2 != null) {
                    dVar2.mo157686a();
                }
                cVar.f334382a = null;
                GLES20.glDeleteProgram(cVar.f334383b);
                C107225c cVar2 = C107225c.f320827a;
                C107225c.f320828b = null;
                C107225c.f320829c = false;
            }
        }
        this.f334381a = null;
        return C13598b0.f38549a;
    }

    /* renamed from: b */
    public Object mo161501b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: c */
    public Object mo161502c(C110101a aVar, C15601d dVar) {
        C38008b bVar = (C38008b) aVar;
        if (this.f334381a == null) {
            C107225c.f320827a.mo157685b(C110264g.C110266c.SEGMENT_GLASS);
            C111707c cVar = new C111707c();
            this.f334381a = cVar;
            C107226d dVar2 = cVar.f334382a;
            if (dVar2 != null && dVar2.f320836f) {
                dVar2.f320836f = false;
                C103355g1 g1Var = dVar2.f320835e;
                if (g1Var != null) {
                    g1Var.mo143229I(false);
                }
            }
        }
        bVar.getClass();
        throw null;
    }
}
