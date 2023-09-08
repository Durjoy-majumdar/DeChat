package p1157t8;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p1157t8.C110939d;
import p1162x2.C112022d;

/* renamed from: t8.c */
public class C110938c extends Drawable implements C112022d {

    /* renamed from: A */
    public Paint.Style f331797A;

    /* renamed from: B */
    public PorterDuffColorFilter f331798B;

    /* renamed from: C */
    public PorterDuff.Mode f331799C;

    /* renamed from: D */
    public ColorStateList f331800D;

    /* renamed from: d */
    public final Paint f331801d = new Paint();

    /* renamed from: e */
    public final Matrix[] f331802e = new Matrix[4];

    /* renamed from: f */
    public final Matrix[] f331803f = new Matrix[4];

    /* renamed from: g */
    public final C110939d[] f331804g = new C110939d[4];

    /* renamed from: h */
    public final Matrix f331805h = new Matrix();

    /* renamed from: i */
    public final Path f331806i = new Path();

    /* renamed from: j */
    public final PointF f331807j = new PointF();

    /* renamed from: n */
    public final C110939d f331808n = new C110939d();

    /* renamed from: o */
    public final Region f331809o = new Region();

    /* renamed from: p */
    public final Region f331810p = new Region();

    /* renamed from: q */
    public final float[] f331811q = new float[2];

    /* renamed from: r */
    public final float[] f331812r = new float[2];

    /* renamed from: s */
    public C110943e f331813s = null;

    /* renamed from: t */
    public boolean f331814t;

    /* renamed from: u */
    public float f331815u;

    /* renamed from: v */
    public int f331816v;

    /* renamed from: w */
    public int f331817w;

    /* renamed from: x */
    public int f331818x;

    /* renamed from: y */
    public int f331819y;

    /* renamed from: z */
    public float f331820z;

    public C110938c(C110943e eVar) {
        this.f331814t = false;
        this.f331815u = 1.0f;
        this.f331816v = -16777216;
        this.f331817w = 5;
        this.f331818x = 10;
        this.f331819y = 255;
        this.f331820z = 1.0f;
        this.f331797A = Paint.Style.FILL_AND_STROKE;
        this.f331799C = PorterDuff.Mode.SRC_IN;
        this.f331800D = null;
        this.f331813s = eVar;
        for (int i = 0; i < 4; i++) {
            this.f331802e[i] = new Matrix();
            this.f331803f[i] = new Matrix();
            this.f331804g[i] = new C110939d();
        }
    }

    /* renamed from: a */
    public final float mo162613a(int i, int i2, int i3) {
        mo162614b(i, i2, i3, this.f331807j);
        PointF pointF = this.f331807j;
        float f = pointF.x;
        float f2 = pointF.y;
        mo162614b((i + 1) % 4, i2, i3, pointF);
        PointF pointF2 = this.f331807j;
        return (float) Math.atan2((double) (pointF2.y - f2), (double) (pointF2.x - f));
    }

    /* renamed from: b */
    public final void mo162614b(int i, int i2, int i3, PointF pointF) {
        if (i == 1) {
            pointF.set((float) i2, 0.0f);
        } else if (i == 2) {
            pointF.set((float) i2, (float) i3);
        } else if (i != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i3);
        }
    }

    /* renamed from: c */
    public final void mo162615c(int i, int i2, Path path) {
        C110937b bVar;
        int i3 = i;
        int i4 = i2;
        Path path2 = path;
        path.rewind();
        if (this.f331813s != null) {
            int i5 = 0;
            while (i5 < 4) {
                mo162614b(i5, i3, i4, this.f331807j);
                int i6 = ((i5 - 1) + 4) % 4;
                mo162614b(i6, i3, i4, this.f331807j);
                PointF pointF = this.f331807j;
                float f = pointF.x;
                float f2 = pointF.y;
                int i7 = i5 + 1;
                mo162614b(i7 % 4, i3, i4, pointF);
                PointF pointF2 = this.f331807j;
                float f3 = pointF2.x;
                float f4 = pointF2.y;
                mo162614b(i5, i3, i4, pointF2);
                PointF pointF3 = this.f331807j;
                float f5 = pointF3.x;
                float f6 = pointF3.y;
                Math.atan2((double) (f2 - f6), (double) (f - f5));
                Math.atan2((double) (f4 - f6), (double) (f3 - f5));
                if (i5 == 1) {
                    this.f331813s.getClass();
                } else if (i5 == 2) {
                    this.f331813s.getClass();
                } else if (i5 != 3) {
                    this.f331813s.getClass();
                } else {
                    this.f331813s.getClass();
                }
                C110939d dVar = this.f331804g[i5];
                this.f331802e[i5].reset();
                Matrix matrix = this.f331802e[i5];
                PointF pointF4 = this.f331807j;
                matrix.setTranslate(pointF4.x, pointF4.y);
                this.f331802e[i5].preRotate((float) Math.toDegrees((double) (mo162613a(i6, i3, i4) + 1.5707964f)));
                float[] fArr = this.f331811q;
                C110939d dVar2 = this.f331804g[i5];
                fArr[0] = dVar2.f331823c;
                fArr[1] = dVar2.f331824d;
                this.f331802e[i5].mapPoints(fArr);
                float a = mo162613a(i5, i3, i4);
                this.f331803f[i5].reset();
                Matrix matrix2 = this.f331803f[i5];
                float[] fArr2 = this.f331811q;
                matrix2.setTranslate(fArr2[0], fArr2[1]);
                this.f331803f[i5].preRotate((float) Math.toDegrees((double) a));
                i5 = i7;
            }
            int i8 = 0;
            while (i8 < 4) {
                float[] fArr3 = this.f331811q;
                C110939d dVar3 = this.f331804g[i8];
                fArr3[0] = dVar3.f331821a;
                fArr3[1] = dVar3.f331822b;
                this.f331802e[i8].mapPoints(fArr3);
                if (i8 == 0) {
                    float[] fArr4 = this.f331811q;
                    path2.moveTo(fArr4[0], fArr4[1]);
                } else {
                    float[] fArr5 = this.f331811q;
                    path2.lineTo(fArr5[0], fArr5[1]);
                }
                C110939d dVar4 = this.f331804g[i8];
                Matrix matrix3 = this.f331802e[i8];
                int size = ((ArrayList) dVar4.f331825e).size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((C110939d.C110942c) ((ArrayList) dVar4.f331825e).get(i9)).mo162627a(matrix3, path2);
                }
                int i15 = i8 + 1;
                int i16 = i15 % 4;
                float[] fArr6 = this.f331811q;
                C110939d dVar5 = this.f331804g[i8];
                fArr6[0] = dVar5.f331823c;
                fArr6[1] = dVar5.f331824d;
                this.f331802e[i8].mapPoints(fArr6);
                float[] fArr7 = this.f331812r;
                C110939d dVar6 = this.f331804g[i16];
                fArr7[0] = dVar6.f331821a;
                fArr7[1] = dVar6.f331822b;
                this.f331802e[i16].mapPoints(fArr7);
                float[] fArr8 = this.f331811q;
                float f7 = fArr8[0];
                float[] fArr9 = this.f331812r;
                float hypot = (float) Math.hypot((double) (f7 - fArr9[0]), (double) (fArr8[1] - fArr9[1]));
                C110939d dVar7 = this.f331808n;
                dVar7.f331821a = 0.0f;
                dVar7.f331822b = 0.0f;
                dVar7.f331823c = 0.0f;
                dVar7.f331824d = 0.0f;
                ((ArrayList) dVar7.f331825e).clear();
                if (i8 == 1) {
                    this.f331813s.getClass();
                    bVar = C110943e.f331836b;
                } else if (i8 == 2) {
                    this.f331813s.getClass();
                    bVar = C110943e.f331836b;
                } else if (i8 != 3) {
                    bVar = this.f331813s.f331837a;
                } else {
                    this.f331813s.getClass();
                    bVar = C110943e.f331836b;
                }
                bVar.mo146302a(hypot, this.f331815u, this.f331808n);
                C110939d dVar8 = this.f331808n;
                Matrix matrix4 = this.f331803f[i8];
                int size2 = ((ArrayList) dVar8.f331825e).size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ((C110939d.C110942c) ((ArrayList) dVar8.f331825e).get(i17)).mo162627a(matrix4, path2);
                }
                i8 = i15;
            }
            path.close();
        }
        if (this.f331820z != 1.0f) {
            this.f331805h.reset();
            Matrix matrix5 = this.f331805h;
            float f8 = this.f331820z;
            matrix5.setScale(f8, f8, (float) (i3 / 2), (float) (i4 / 2));
            path2.transform(this.f331805h);
        }
    }

    /* renamed from: d */
    public final void mo162616d() {
        ColorStateList colorStateList = this.f331800D;
        if (colorStateList == null || this.f331799C == null) {
            this.f331798B = null;
        } else {
            this.f331798B = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f331799C);
        }
    }

    public void draw(Canvas canvas) {
        this.f331801d.setColorFilter(this.f331798B);
        int alpha = this.f331801d.getAlpha();
        Paint paint = this.f331801d;
        int i = this.f331819y;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.f331801d.setStrokeWidth(0.0f);
        this.f331801d.setStyle(this.f331797A);
        int i2 = this.f331817w;
        if (i2 > 0 && this.f331814t) {
            this.f331801d.setShadowLayer((float) this.f331818x, 0.0f, (float) i2, this.f331816v);
        }
        if (this.f331813s != null) {
            mo162615c(canvas.getWidth(), canvas.getHeight(), this.f331806i);
            canvas.drawPath(this.f331806i, this.f331801d);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f331801d);
        }
        this.f331801d.setAlpha(alpha);
    }

    public int getOpacity() {
        return -3;
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.f331809o.set(bounds);
        mo162615c(bounds.width(), bounds.height(), this.f331806i);
        this.f331810p.setPath(this.f331806i, this.f331809o);
        this.f331809o.op(this.f331810p, Region.Op.DIFFERENCE);
        return this.f331809o;
    }

    public void setAlpha(int i) {
        this.f331819y = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f331801d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f331800D = colorStateList;
        mo162616d();
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f331799C = mode;
        mo162616d();
        invalidateSelf();
    }
}
