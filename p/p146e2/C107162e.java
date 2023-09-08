package p146e2;

import android.graphics.Shader;
import android.text.TextPaint;
import gy3.C87412m;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p436a1.C103257q;
import p436a1.C103261r0;
import p436a1.C103264s0;
import p436a1.C103272w;
import p436a1.C103273w0;
import p436a1.C103276y;
import p544h2.C108014f;

/* renamed from: e2.e */
public final class C107162e extends TextPaint {

    /* renamed from: a */
    public C108014f f320748a = C108014f.f323457b;

    /* renamed from: b */
    public C103264s0 f320749b;

    /* renamed from: c */
    public C103257q f320750c;

    /* renamed from: d */
    public C112545k f320751d;

    public C107162e(int i, float f) {
        super(i);
        this.density = f;
        C103264s0 s0Var = C103264s0.f304481d;
        this.f320749b = C103264s0.f304481d;
    }

    /* renamed from: a */
    public final void mo157588a(C103257q qVar, long j) {
        if (qVar == null) {
            setShader((Shader) null);
            return;
        }
        boolean z = false;
        if (C87412m.m108589b(this.f320750c, qVar)) {
            C112545k kVar = this.f320751d;
            if (kVar == null ? false : C112545k.m153755a(kVar.f336976a, j)) {
                return;
            }
        }
        this.f320750c = qVar;
        this.f320751d = new C112545k(j);
        if (qVar instanceof C103273w0) {
            setShader((Shader) null);
            mo157589b(((C103273w0) qVar).f304518b);
        } else if (qVar instanceof C103261r0) {
            int i = C112545k.f336975d;
            if (j != C112545k.f336974c) {
                z = true;
            }
            if (z) {
                setShader(((C103261r0) qVar).mo142983b(j));
            }
        }
    }

    /* renamed from: b */
    public final void mo157589b(long j) {
        int g;
        int i = C103272w.f304516h;
        if ((j != C103272w.f304515g) && getColor() != (g = C103276y.m136796g(j))) {
            setColor(g);
        }
    }

    /* renamed from: c */
    public final void mo157590c(C103264s0 s0Var) {
        if (s0Var == null) {
            C103264s0 s0Var2 = C103264s0.f304481d;
            s0Var = C103264s0.f304481d;
        }
        if (!C87412m.m108589b(this.f320749b, s0Var)) {
            this.f320749b = s0Var;
            C103264s0 s0Var3 = C103264s0.f304481d;
            if (C87412m.m108589b(s0Var, C103264s0.f304481d)) {
                clearShadowLayer();
                return;
            }
            C103264s0 s0Var4 = this.f320749b;
            setShadowLayer(s0Var4.f304484c, C112539e.m153738c(s0Var4.f304483b), C112539e.m153739d(this.f320749b.f304483b), C103276y.m136796g(this.f320749b.f304482a));
        }
    }

    /* renamed from: d */
    public final void mo157591d(C108014f fVar) {
        if (fVar == null) {
            fVar = C108014f.f323457b;
        }
        if (!C87412m.m108589b(this.f320748a, fVar)) {
            this.f320748a = fVar;
            setUnderlineText(fVar.mo158410a(C108014f.f323458c));
            setStrikeThruText(this.f320748a.mo158410a(C108014f.f323459d));
        }
    }
}
