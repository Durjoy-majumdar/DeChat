package p1157t8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t8.d */
public class C110939d {

    /* renamed from: a */
    public float f331821a = 0.0f;

    /* renamed from: b */
    public float f331822b = 0.0f;

    /* renamed from: c */
    public float f331823c = 0.0f;

    /* renamed from: d */
    public float f331824d = 0.0f;

    /* renamed from: e */
    public final List<C110942c> f331825e;

    /* renamed from: t8.d$a */
    public static class C110940a extends C110942c {

        /* renamed from: h */
        public static final RectF f331826h = new RectF();

        /* renamed from: b */
        public float f331827b;

        /* renamed from: c */
        public float f331828c;

        /* renamed from: d */
        public float f331829d;

        /* renamed from: e */
        public float f331830e;

        /* renamed from: f */
        public float f331831f;

        /* renamed from: g */
        public float f331832g;

        public C110940a(float f, float f2, float f3, float f4) {
            this.f331827b = f;
            this.f331828c = f2;
            this.f331829d = f3;
            this.f331830e = f4;
        }

        /* renamed from: a */
        public void mo162627a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f331835a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f331826h;
            rectF.set(this.f331827b, this.f331828c, this.f331829d, this.f331830e);
            path.arcTo(rectF, this.f331831f, this.f331832g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: t8.d$b */
    public static class C110941b extends C110942c {

        /* renamed from: b */
        public float f331833b;

        /* renamed from: c */
        public float f331834c;

        /* renamed from: a */
        public void mo162627a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f331835a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f331833b, this.f331834c);
            path.transform(matrix);
        }
    }

    /* renamed from: t8.d$c */
    public static abstract class C110942c {

        /* renamed from: a */
        public final Matrix f331835a = new Matrix();

        /* renamed from: a */
        public abstract void mo162627a(Matrix matrix, Path path);
    }

    public C110939d() {
        ArrayList arrayList = new ArrayList();
        this.f331825e = arrayList;
        arrayList.clear();
    }

    /* renamed from: a */
    public void mo162625a(float f, float f2, float f3, float f4, float f5, float f6) {
        C110940a aVar = new C110940a(f, f2, f3, f4);
        aVar.f331831f = f5;
        aVar.f331832g = f6;
        ((ArrayList) this.f331825e).add(aVar);
        double d = (double) (f5 + f6);
        this.f331823c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f331824d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    /* renamed from: b */
    public void mo162626b(float f, float f2) {
        C110941b bVar = new C110941b();
        bVar.f331833b = f;
        bVar.f331834c = f2;
        ((ArrayList) this.f331825e).add(bVar);
        this.f331823c = f;
        this.f331824d = f2;
    }
}
