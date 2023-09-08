package ai2;

import android.graphics.Matrix;
import ci2.C104380d;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C101769d70;
import te3.wr4;

/* renamed from: ai2.a */
public abstract class C92007a implements C92017j {

    /* renamed from: a */
    public C92011d f263402a;

    /* renamed from: b */
    public C104380d f263403b;

    /* renamed from: c */
    public final C104380d f263404c = new C104380d(2147483647L, false, 2, (C8480h) null);

    /* renamed from: d */
    public String f263405d;

    /* renamed from: e */
    public boolean f263406e = true;

    /* renamed from: f */
    public Matrix f263407f = new Matrix();

    public C92007a(C92011d dVar) {
        C87412m.m108594g(dVar, "dataType");
        this.f263402a = dVar;
    }

    /* renamed from: d */
    public final C104380d mo125862d() {
        return this.f263404c;
    }

    /* renamed from: e */
    public final C101769d70 mo125863e() {
        C101769d70 d702 = new C101769d70();
        d702.f298084d = this.f263404c.mo146049c();
        d702.f298085e = this.f263404c.mo146048b();
        return d702;
    }

    /* renamed from: f */
    public final wr4 mo125864f(Matrix matrix) {
        C87412m.m108594g(matrix, "matrix");
        float[] fArr = new float[9];
        wr4 wr4 = new wr4();
        matrix.getValues(fArr);
        for (int i = 0; i < 9; i++) {
            wr4.f144239d.add(Float.valueOf(fArr[i]));
        }
        return wr4;
    }

    /* renamed from: g */
    public final float[] mo125865g(wr4 wr4) {
        C87412m.m108594g(wr4, "viewMatrix");
        float[] fArr = new float[9];
        LinkedList<Float> linkedList = wr4.f144239d;
        C87412m.m108593f(linkedList, "viewMatrix.value");
        int i = 0;
        for (Float f : linkedList) {
            C87412m.m108593f(f, "data");
            fArr[i] = f.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: h */
    public final void mo125866h(boolean z) {
        this.f263406e = z;
    }
}
