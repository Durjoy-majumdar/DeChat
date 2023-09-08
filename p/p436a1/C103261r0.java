package p436a1;

import android.graphics.Shader;
import gy3.C87412m;
import p1166z0.C112545k;

/* renamed from: a1.r0 */
public abstract class C103261r0 extends C103257q {

    /* renamed from: b */
    public Shader f304479b;

    /* renamed from: c */
    public long f304480c = C112545k.f336974c;

    public C103261r0() {
        int i = C112545k.f336975d;
    }

    /* renamed from: a */
    public final void mo143030a(long j, C103241i0 i0Var, float f) {
        C87412m.m108594g(i0Var, "p");
        Shader shader = this.f304479b;
        if (shader == null || !C112545k.m153755a(this.f304480c, j)) {
            shader = mo142983b(j);
            this.f304479b = shader;
            this.f304480c = j;
        }
        long a = i0Var.mo142987a();
        int i = C103272w.f304516h;
        long j2 = C103272w.f304510b;
        if (!C103272w.m136781c(a, j2)) {
            i0Var.mo142989c(j2);
        }
        if (!C87412m.m108589b(i0Var.mo142993g(), shader)) {
            i0Var.mo142997j(shader);
        }
        if (!(i0Var.getAlpha() == f)) {
            i0Var.setAlpha(f);
        }
    }

    /* renamed from: b */
    public abstract Shader mo142983b(long j);
}
