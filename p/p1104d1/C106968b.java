package p1104d1;

import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112545k;
import p436a1.C103272w;
import p436a1.C103274x;
import p835c1.C104231f;
import p835c1.C104233g;
import rx3.C90109v;

/* renamed from: d1.b */
public final class C106968b extends C106969c {

    /* renamed from: i */
    public final long f320194i;

    /* renamed from: j */
    public float f320195j = 1.0f;

    /* renamed from: n */
    public C103274x f320196n;

    /* renamed from: o */
    public final long f320197o = C112545k.f336974c;

    public C106968b(long j, C8480h hVar) {
        this.f320194i = j;
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        this.f320195j = f;
        return true;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        this.f320196n = xVar;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C106968b) && C103272w.m136781c(this.f320194i, ((C106968b) obj).f320194i);
    }

    /* renamed from: h */
    public long mo84458h() {
        return this.f320197o;
    }

    public int hashCode() {
        long j = this.f320194i;
        int i = C103272w.f304516h;
        return C90109v.m112737a(j);
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        C104231f.C104232a.m139087f(fVar, this.f320194i, 0, 0, this.f320195j, (C104233g) null, this.f320196n, 0, 86, (Object) null);
    }

    public String toString() {
        return "ColorPainter(color=" + C103272w.m136787i(this.f320194i) + ')';
    }
}
