package androidx.compose.foundation.lazy.layout;

import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109894x0;
import p631o1.C109899z;
import p631o1.C61911a;
import rx3.C13598b0;

/* renamed from: androidx.compose.foundation.lazy.layout.n */
public final class C103590n implements C103589m, C109827a0 {

    /* renamed from: d */
    public final C103581i f305922d;

    /* renamed from: e */
    public final C109894x0 f305923e;

    /* renamed from: f */
    public final HashMap<Integer, C109854n0[]> f305924f = new HashMap<>();

    public C103590n(C103581i iVar, C109894x0 x0Var) {
        C87412m.m108594g(iVar, "itemContentFactory");
        C87412m.m108594g(x0Var, "subcomposeMeasureScope");
        this.f305922d = iVar;
        this.f305923e = x0Var;
    }

    /* renamed from: F */
    public long mo143031F(float f) {
        return this.f305923e.mo143031F(f);
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return this.f305923e.mo143032M(f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return this.f305923e.mo143033O(j);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return this.f305923e.mo143034T(f);
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return this.f305923e.mo143035d0(f);
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return this.f305923e.mo143036g0(j);
    }

    public float getDensity() {
        return this.f305923e.getDensity();
    }

    public float getFontScale() {
        return this.f305923e.getFontScale();
    }

    public C33183o getLayoutDirection() {
        return this.f305923e.getLayoutDirection();
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return this.f305923e.mo143039m(i);
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return this.f305923e.mo143040q(j);
    }

    /* renamed from: r */
    public C109854n0[] mo144571r(int i, long j) {
        C109854n0[] n0VarArr = this.f305924f.get(Integer.valueOf(i));
        if (n0VarArr != null) {
            return n0VarArr;
        }
        Object f = this.f305922d.f305902b.invoke().mo75150f(i);
        List<C109893x> q0 = this.f305923e.mo161192q0(f, this.f305922d.mo144567a(i, f));
        int size = q0.size();
        C109854n0[] n0VarArr2 = new C109854n0[size];
        for (int i2 = 0; i2 < size; i2++) {
            n0VarArr2[i2] = q0.get(i2).mo161155K(j);
        }
        this.f305924f.put(Integer.valueOf(i), n0VarArr2);
        return n0VarArr2;
    }

    /* renamed from: t */
    public C109899z mo144573t(int i, int i2, Map<C61911a, Integer> map, C32226l<? super C109854n0.C109855a, C13598b0> lVar) {
        C87412m.m108594g(map, "alignmentLines");
        C87412m.m108594g(lVar, "placementBlock");
        return this.f305923e.mo144573t(i, i2, map, lVar);
    }
}
