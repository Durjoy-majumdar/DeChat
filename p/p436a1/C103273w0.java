package p436a1;

import android.graphics.Shader;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C90109v;

/* renamed from: a1.w0 */
public final class C103273w0 extends C103257q {

    /* renamed from: b */
    public final long f304518b;

    public C103273w0(long j, C8480h hVar) {
        this.f304518b = j;
    }

    /* renamed from: a */
    public void mo143030a(long j, C103241i0 i0Var, float f) {
        long j2;
        C87412m.m108594g(i0Var, "p");
        i0Var.setAlpha(1.0f);
        if (!(f == 1.0f)) {
            long j3 = this.f304518b;
            j2 = C103272w.m136780b(j3, C103272w.m136782d(j3) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = this.f304518b;
        }
        i0Var.mo142989c(j2);
        if (i0Var.mo142993g() != null) {
            i0Var.mo142997j((Shader) null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C103273w0) && C103272w.m136781c(this.f304518b, ((C103273w0) obj).f304518b);
    }

    public int hashCode() {
        long j = this.f304518b;
        int i = C103272w.f304516h;
        return C90109v.m112737a(j);
    }

    public String toString() {
        return "SolidColor(value=" + C103272w.m136787i(this.f304518b) + ')';
    }
}
