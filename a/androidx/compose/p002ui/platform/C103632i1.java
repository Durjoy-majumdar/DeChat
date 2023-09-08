package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import p436a1.C103232f;
import p436a1.C103235g0;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.i1 */
public final class C103632i1<T> {

    /* renamed from: a */
    public final C32227p<T, Matrix, C13598b0> f306086a;

    /* renamed from: b */
    public Matrix f306087b;

    /* renamed from: c */
    public Matrix f306088c;

    /* renamed from: d */
    public float[] f306089d;

    /* renamed from: e */
    public float[] f306090e;

    /* renamed from: f */
    public boolean f306091f = true;

    /* renamed from: g */
    public boolean f306092g = true;

    /* renamed from: h */
    public boolean f306093h = true;

    public C103632i1(C32227p<? super T, ? super Matrix, C13598b0> pVar) {
        C87412m.m108594g(pVar, "getMatrix");
        this.f306086a = pVar;
    }

    /* renamed from: a */
    public final float[] mo144741a(T t) {
        float[] fArr = this.f306090e;
        if (fArr == null) {
            fArr = C103235g0.m136668a((float[]) null, 1, (C8480h) null);
            this.f306090e = fArr;
        }
        if (this.f306092g) {
            this.f306093h = C103625g1.m137807a(mo144742b(t), fArr);
            this.f306092g = false;
        }
        if (this.f306093h) {
            return fArr;
        }
        return null;
    }

    /* renamed from: b */
    public final float[] mo144742b(T t) {
        float[] fArr = this.f306089d;
        if (fArr == null) {
            fArr = C103235g0.m136668a((float[]) null, 1, (C8480h) null);
            this.f306089d = fArr;
        }
        if (!this.f306091f) {
            return fArr;
        }
        Matrix matrix = this.f306087b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f306087b = matrix;
        }
        this.f306086a.invoke(t, matrix);
        Matrix matrix2 = this.f306088c;
        if (matrix2 == null || !C87412m.m108589b(matrix, matrix2)) {
            C103232f.m136645a(fArr, matrix);
            this.f306087b = matrix2;
            this.f306088c = matrix;
        }
        this.f306091f = false;
        return fArr;
    }

    /* renamed from: c */
    public final void mo144743c() {
        this.f306091f = true;
        this.f306092g = true;
    }
}
