package p436a1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112535a;
import p1166z0.C112539e;
import p1166z0.C112541g;
import p1166z0.C112543i;

/* renamed from: a1.i */
public final class C103240i implements C27726j0 {

    /* renamed from: a */
    public final Path f304449a;

    /* renamed from: b */
    public final RectF f304450b;

    /* renamed from: c */
    public final float[] f304451c;

    /* renamed from: d */
    public final Matrix f304452d;

    public C103240i() {
        this((Path) null, 1, (C8480h) null);
    }

    public C103240i(Path path) {
        C87412m.m108594g(path, "internalPath");
        this.f304449a = path;
        this.f304450b = new RectF();
        this.f304451c = new float[8];
        this.f304452d = new Matrix();
    }

    /* renamed from: a */
    public void mo55575a(float f, float f2) {
        this.f304449a.moveTo(f, f2);
    }

    /* renamed from: b */
    public void mo55576b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f304449a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: c */
    public void mo55577c(float f, float f2) {
        this.f304449a.lineTo(f, f2);
    }

    public void close() {
        this.f304449a.close();
    }

    /* renamed from: d */
    public void mo55579d(float f, float f2, float f3, float f4) {
        this.f304449a.rQuadTo(f, f2, f3, f4);
    }

    /* renamed from: e */
    public void mo55580e(C112541g gVar) {
        C87412m.m108594g(gVar, "rect");
        if (!(!Float.isNaN(gVar.f336961a))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(gVar.f336962b))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(gVar.f336963c))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(gVar.f336964d)) {
            this.f304450b.set(new RectF(gVar.f336961a, gVar.f336962b, gVar.f336963c, gVar.f336964d));
            this.f304449a.addRect(this.f304450b, Path.Direction.CCW);
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    /* renamed from: f */
    public void mo55581f(long j) {
        this.f304452d.reset();
        this.f304452d.setTranslate(C112539e.m153738c(j), C112539e.m153739d(j));
        this.f304449a.transform(this.f304452d);
    }

    /* renamed from: g */
    public void mo55582g(C112543i iVar) {
        C87412m.m108594g(iVar, "roundRect");
        this.f304450b.set(iVar.f336965a, iVar.f336966b, iVar.f336967c, iVar.f336968d);
        this.f304451c[0] = C112535a.m153728b(iVar.f336969e);
        this.f304451c[1] = C112535a.m153729c(iVar.f336969e);
        this.f304451c[2] = C112535a.m153728b(iVar.f336970f);
        this.f304451c[3] = C112535a.m153729c(iVar.f336970f);
        this.f304451c[4] = C112535a.m153728b(iVar.f336971g);
        this.f304451c[5] = C112535a.m153729c(iVar.f336971g);
        this.f304451c[6] = C112535a.m153728b(iVar.f336972h);
        this.f304451c[7] = C112535a.m153729c(iVar.f336972h);
        this.f304449a.addRoundRect(this.f304450b, this.f304451c, Path.Direction.CCW);
    }

    /* renamed from: h */
    public boolean mo55583h() {
        return this.f304449a.isConvex();
    }

    /* renamed from: i */
    public void mo55584i(float f, float f2, float f3, float f4) {
        this.f304449a.quadTo(f, f2, f3, f4);
    }

    public boolean isEmpty() {
        return this.f304449a.isEmpty();
    }

    /* renamed from: j */
    public boolean mo55586j(C27726j0 j0Var, C27726j0 j0Var2, int i) {
        Path.Op op;
        C87412m.m108594g(j0Var, "path1");
        C87412m.m108594g(j0Var2, "path2");
        boolean z = false;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    op = z ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        Path path = this.f304449a;
        if (j0Var instanceof C103240i) {
            Path path2 = ((C103240i) j0Var).f304449a;
            if (j0Var2 instanceof C103240i) {
                return path.op(path2, ((C103240i) j0Var2).f304449a, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: k */
    public void mo55587k(float f, float f2) {
        this.f304449a.rLineTo(f, f2);
    }

    /* renamed from: l */
    public void mo55588l(float f, float f2) {
        this.f304449a.rMoveTo(f, f2);
    }

    /* renamed from: m */
    public void mo55589m(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f304449a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: n */
    public void mo143014n(C27726j0 j0Var, long j) {
        C87412m.m108594g(j0Var, "path");
        Path path = this.f304449a;
        if (j0Var instanceof C103240i) {
            path.addPath(((C103240i) j0Var).f304449a, C112539e.m153738c(j), C112539e.m153739d(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void reset() {
        this.f304449a.reset();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C103240i(Path path, int i, C8480h hVar) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
