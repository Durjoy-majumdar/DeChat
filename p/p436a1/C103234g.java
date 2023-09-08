package p436a1;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import gy3.C87412m;

/* renamed from: a1.g */
public final class C103234g implements C103241i0 {

    /* renamed from: a */
    public Paint f304439a = new Paint(7);

    /* renamed from: b */
    public int f304440b = 3;

    /* renamed from: c */
    public Shader f304441c;

    /* renamed from: d */
    public C103274x f304442d;

    /* renamed from: e */
    public C103244k0 f304443e;

    /* renamed from: a */
    public long mo142987a() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        return C103276y.m136791b(paint.getColor());
    }

    /* renamed from: b */
    public void mo142988b(C103274x xVar) {
        this.f304442d = xVar;
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        paint.setColorFilter(xVar != null ? xVar.f304519a : null);
    }

    /* renamed from: c */
    public void mo142989c(long j) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "$this$setNativeColor");
        paint.setColor(C103276y.m136796g(j));
    }

    /* renamed from: d */
    public void mo142990d(int i) {
        this.f304440b = i;
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C103225b1.f304430a.mo142980a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C103220a.m136601b(i)));
        }
    }

    /* renamed from: e */
    public void mo142991e(int i) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!(i == 0));
    }

    /* renamed from: f */
    public Paint mo142992f() {
        return this.f304439a;
    }

    /* renamed from: g */
    public Shader mo142993g() {
        return this.f304441c;
    }

    public float getAlpha() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        return ((float) paint.getAlpha()) / 255.0f;
    }

    /* renamed from: h */
    public C103274x mo142995h() {
        return this.f304442d;
    }

    /* renamed from: i */
    public int mo142996i() {
        return this.f304440b;
    }

    /* renamed from: j */
    public void mo142997j(Shader shader) {
        this.f304441c = shader;
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: k */
    public int mo142998k() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        return paint.isFilterBitmap() ? 1 : 0;
    }

    /* renamed from: l */
    public int mo142999l() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : C103236h.f304444a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: m */
    public int mo143000m() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : C103236h.f304445b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: n */
    public float mo143001n() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        return paint.getStrokeMiter();
    }

    /* renamed from: o */
    public float mo143002o() {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        return paint.getStrokeWidth();
    }

    /* renamed from: p */
    public void mo143003p(C103244k0 k0Var) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        C103242j jVar = (C103242j) k0Var;
        paint.setPathEffect((PathEffect) null);
        this.f304443e = k0Var;
    }

    /* renamed from: q */
    public void mo143004q(int i) {
        Paint.Cap cap;
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "$this$setNativeStrokeCap");
        boolean z = false;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                if (i == 0) {
                    z = true;
                }
                cap = z ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: r */
    public void mo143005r(int i) {
        Paint.Join join;
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "$this$setNativeStrokeJoin");
        boolean z = false;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i == 2) {
                join = Paint.Join.BEVEL;
            } else {
                if (i == 1) {
                    z = true;
                }
                join = z ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    /* renamed from: s */
    public void mo143006s(float f) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public void setAlpha(float f) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    /* renamed from: t */
    public void mo143008t(float f) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: u */
    public void mo143009u(int i) {
        Paint paint = this.f304439a;
        C87412m.m108594g(paint, "$this$setNativeStyle");
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        paint.setStyle(z ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
