package e14;

import a14.C0000n0;
import a14.C53876e0;
import a14.C53930o0;
import a14.C53934p0;
import c14.C54624g;
import c14.C54629k;
import c14.C54646u;
import c14.C54647v;
import c14.C54649x;
import d14.C45252f;
import d14.C45253g;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;

/* renamed from: e14.g */
public abstract class C58482g<T> implements C58506s<T> {

    /* renamed from: d */
    public final C66212f f167473d;

    /* renamed from: e */
    public final int f167474e;

    /* renamed from: f */
    public final C54624g f167475f;

    public C58482g(C66212f fVar, int i, C54624g gVar) {
        this.f167473d = fVar;
        this.f167474e = i;
        this.f167475f = gVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<? super C13598b0> dVar) {
        Object f = C53930o0.m60559f(new C58480e(gVar, this, (C15601d<? super C58480e>) null), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }

    /* renamed from: c */
    public C45252f<T> mo82831c(C66212f fVar, int i, C54624g gVar) {
        C66212f plus = fVar.plus(this.f167473d);
        if (gVar == C54624g.SUSPEND) {
            int i2 = this.f167474e;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            gVar = this.f167475f;
        }
        return (C87412m.m108589b(plus, this.f167473d) && i == this.f167474e && gVar == this.f167475f) ? this : mo82813h(plus, i, gVar);
    }

    /* renamed from: f */
    public String mo82816f() {
        return null;
    }

    /* renamed from: g */
    public abstract Object mo82812g(C54647v<? super T> vVar, C15601d<? super C13598b0> dVar);

    /* renamed from: h */
    public abstract C58482g<T> mo82813h(C66212f fVar, int i, C54624g gVar);

    /* renamed from: i */
    public C45252f<T> mo82817i() {
        return null;
    }

    /* renamed from: j */
    public C54649x<T> mo82818j(C0000n0 n0Var) {
        C66212f fVar = this.f167473d;
        int i = this.f167474e;
        if (i == -3) {
            i = -2;
        }
        C54624g gVar = this.f167475f;
        C53934p0 p0Var = C53934p0.ATOMIC;
        C58481f fVar2 = new C58481f(this, (C15601d<? super C58481f>) null);
        C54646u uVar = new C54646u(C53876e0.m60398b(n0Var, fVar), C54629k.m61479a(i, gVar, (C32226l) null, 4, (Object) null));
        uVar.mo74473y0(p0Var, uVar, fVar2);
        return uVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f = mo82816f();
        if (f != null) {
            arrayList.add(f);
        }
        if (this.f167473d != C66217g.f190253d) {
            arrayList.add("context=" + this.f167473d);
        }
        if (this.f167474e != -3) {
            arrayList.add("capacity=" + this.f167474e);
        }
        if (this.f167475f != C54624g.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f167475f);
        }
        return getClass().getSimpleName() + '[' + C110818d0.m150921S(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ']';
    }
}
