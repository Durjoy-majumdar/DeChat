package p298c6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import p298c6.C23690b;
import p298c6.C23713g;

/* renamed from: c6.h */
public class C23780h {

    /* renamed from: g */
    public static HashSet<String> f68139g;

    /* renamed from: a */
    public Canvas f68140a;

    /* renamed from: b */
    public C23713g f68141b;

    /* renamed from: c */
    public C23788h f68142c;

    /* renamed from: d */
    public Stack<C23788h> f68143d;

    /* renamed from: e */
    public Stack<C23713g.C23747j0> f68144e;

    /* renamed from: f */
    public Stack<Matrix> f68145f;

    /* renamed from: c6.h$b */
    public class C23782b implements C23713g.C23774x {

        /* renamed from: a */
        public List<C23783c> f68146a = new ArrayList();

        /* renamed from: b */
        public float f68147b;

        /* renamed from: c */
        public float f68148c;

        /* renamed from: d */
        public C23783c f68149d = null;

        /* renamed from: e */
        public boolean f68150e = false;

        /* renamed from: f */
        public boolean f68151f = true;

        /* renamed from: g */
        public int f68152g = -1;

        /* renamed from: h */
        public boolean f68153h;

        public C23782b(C23713g.C23772w wVar) {
            if (wVar != null) {
                wVar.mo37301h(this);
                if (this.f68153h) {
                    this.f68149d.mo37349b(this.f68146a.get(this.f68152g));
                    this.f68146a.set(this.f68152g, this.f68149d);
                    this.f68153h = false;
                }
                C23783c cVar = this.f68149d;
                if (cVar != null) {
                    this.f68146a.add(cVar);
                }
            }
        }

        /* renamed from: a */
        public void mo37293a(float f, float f2) {
            if (this.f68153h) {
                this.f68149d.mo37349b(this.f68146a.get(this.f68152g));
                this.f68146a.set(this.f68152g, this.f68149d);
                this.f68153h = false;
            }
            C23783c cVar = this.f68149d;
            if (cVar != null) {
                this.f68146a.add(cVar);
            }
            this.f68147b = f;
            this.f68148c = f2;
            this.f68149d = new C23783c(C23780h.this, f, f2, 0.0f, 0.0f);
            this.f68152g = this.f68146a.size();
        }

        /* renamed from: b */
        public void mo37294b(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f68151f || this.f68150e) {
                this.f68149d.mo37348a(f, f2);
                this.f68146a.add(this.f68149d);
                this.f68150e = false;
            }
            this.f68149d = new C23783c(C23780h.this, f5, f6, f5 - f3, f6 - f4);
            this.f68153h = false;
        }

        /* renamed from: c */
        public void mo37295c(float f, float f2) {
            this.f68149d.mo37348a(f, f2);
            this.f68146a.add(this.f68149d);
            C23780h hVar = C23780h.this;
            C23783c cVar = this.f68149d;
            this.f68149d = new C23783c(hVar, f, f2, f - cVar.f68155a, f2 - cVar.f68156b);
            this.f68153h = false;
        }

        public void close() {
            this.f68146a.add(this.f68149d);
            mo37295c(this.f68147b, this.f68148c);
            this.f68153h = true;
        }

        /* renamed from: d */
        public void mo37297d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.f68150e = true;
            this.f68151f = false;
            C23783c cVar = this.f68149d;
            C23780h.m28476a(cVar.f68155a, cVar.f68156b, f, f2, f3, z, z2, f4, f5, this);
            this.f68151f = true;
            this.f68153h = false;
        }

        /* renamed from: e */
        public void mo37298e(float f, float f2, float f3, float f4) {
            this.f68149d.mo37348a(f, f2);
            this.f68146a.add(this.f68149d);
            this.f68149d = new C23783c(C23780h.this, f3, f4, f3 - f, f4 - f2);
            this.f68153h = false;
        }
    }

    /* renamed from: c6.h$c */
    public class C23783c {

        /* renamed from: a */
        public float f68155a;

        /* renamed from: b */
        public float f68156b;

        /* renamed from: c */
        public float f68157c = 0.0f;

        /* renamed from: d */
        public float f68158d = 0.0f;

        /* renamed from: e */
        public boolean f68159e = false;

        public C23783c(C23780h hVar, float f, float f2, float f3, float f4) {
            this.f68155a = f;
            this.f68156b = f2;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                this.f68157c = (float) (((double) f3) / sqrt);
                this.f68158d = (float) (((double) f4) / sqrt);
            }
        }

        /* renamed from: a */
        public void mo37348a(float f, float f2) {
            float f3 = f - this.f68155a;
            float f4 = f2 - this.f68156b;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                f3 = (float) (((double) f3) / sqrt);
                f4 = (float) (((double) f4) / sqrt);
            }
            float f5 = this.f68157c;
            if (f3 == (-f5) && f4 == (-this.f68158d)) {
                this.f68159e = true;
                this.f68157c = -f4;
                this.f68158d = f3;
                return;
            }
            this.f68157c = f5 + f3;
            this.f68158d += f4;
        }

        /* renamed from: b */
        public void mo37349b(C23783c cVar) {
            float f = cVar.f68157c;
            float f2 = this.f68157c;
            if (f == (-f2)) {
                float f3 = cVar.f68158d;
                if (f3 == (-this.f68158d)) {
                    this.f68159e = true;
                    this.f68157c = -f3;
                    this.f68158d = cVar.f68157c;
                    return;
                }
            }
            this.f68157c = f2 + f;
            this.f68158d += cVar.f68158d;
        }

        public String toString() {
            return "(" + this.f68155a + "," + this.f68156b + " " + this.f68157c + "," + this.f68158d + ")";
        }
    }

    /* renamed from: c6.h$d */
    public static class C23784d implements C23713g.C23774x {

        /* renamed from: a */
        public Path f68160a = new Path();

        /* renamed from: b */
        public float f68161b;

        /* renamed from: c */
        public float f68162c;

        public C23784d(C23713g.C23772w wVar) {
            if (wVar != null) {
                wVar.mo37301h(this);
            }
        }

        /* renamed from: a */
        public void mo37293a(float f, float f2) {
            this.f68160a.moveTo(f, f2);
            this.f68161b = f;
            this.f68162c = f2;
        }

        /* renamed from: b */
        public void mo37294b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f68160a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f68161b = f5;
            this.f68162c = f6;
        }

        /* renamed from: c */
        public void mo37295c(float f, float f2) {
            this.f68160a.lineTo(f, f2);
            this.f68161b = f;
            this.f68162c = f2;
        }

        public void close() {
            this.f68160a.close();
        }

        /* renamed from: d */
        public void mo37297d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            C23780h.m28476a(this.f68161b, this.f68162c, f, f2, f3, z, z2, f4, f5, this);
            this.f68161b = f4;
            this.f68162c = f5;
        }

        /* renamed from: e */
        public void mo37298e(float f, float f2, float f3, float f4) {
            this.f68160a.quadTo(f, f2, f3, f4);
            this.f68161b = f3;
            this.f68162c = f4;
        }
    }

    /* renamed from: c6.h$e */
    public class C23785e extends C23786f {

        /* renamed from: d */
        public Path f68163d;

        public C23785e(Path path, float f, float f2) {
            super(f, f2);
            this.f68163d = path;
        }

        /* renamed from: b */
        public void mo37351b(String str) {
            if (C23780h.this.mo37323V()) {
                C23780h hVar = C23780h.this;
                C23788h hVar2 = hVar.f68142c;
                if (hVar2.f68173b) {
                    hVar.f68140a.drawTextOnPath(str, this.f68163d, this.f68165a, this.f68166b, hVar2.f68175d);
                }
                C23780h hVar3 = C23780h.this;
                C23788h hVar4 = hVar3.f68142c;
                if (hVar4.f68174c) {
                    hVar3.f68140a.drawTextOnPath(str, this.f68163d, this.f68165a, this.f68166b, hVar4.f68176e);
                }
            }
            this.f68165a += C23780h.this.f68142c.f68175d.measureText(str);
        }
    }

    /* renamed from: c6.h$f */
    public class C23786f extends C23790j {

        /* renamed from: a */
        public float f68165a;

        /* renamed from: b */
        public float f68166b;

        public C23786f(float f, float f2) {
            super(C23780h.this, (C23781a) null);
            this.f68165a = f;
            this.f68166b = f2;
        }

        /* renamed from: b */
        public void mo37351b(String str) {
            if (C23780h.this.mo37323V()) {
                C23780h hVar = C23780h.this;
                C23788h hVar2 = hVar.f68142c;
                if (hVar2.f68173b) {
                    hVar.f68140a.drawText(str, this.f68165a, this.f68166b, hVar2.f68175d);
                }
                C23780h hVar3 = C23780h.this;
                C23788h hVar4 = hVar3.f68142c;
                if (hVar4.f68174c) {
                    hVar3.f68140a.drawText(str, this.f68165a, this.f68166b, hVar4.f68176e);
                }
            }
            this.f68165a += C23780h.this.f68142c.f68175d.measureText(str);
        }
    }

    /* renamed from: c6.h$g */
    public class C23787g extends C23790j {

        /* renamed from: a */
        public float f68168a;

        /* renamed from: b */
        public float f68169b;

        /* renamed from: c */
        public Path f68170c;

        public C23787g(float f, float f2, Path path) {
            super(C23780h.this, (C23781a) null);
            this.f68168a = f;
            this.f68169b = f2;
            this.f68170c = path;
        }

        /* renamed from: a */
        public boolean mo37352a(C23713g.C23777y0 y0Var) {
            if (!(y0Var instanceof C23713g.C23779z0)) {
                return true;
            }
            String.format("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        /* renamed from: b */
        public void mo37351b(String str) {
            if (C23780h.this.mo37323V()) {
                Path path = new Path();
                C23780h.this.f68142c.f68175d.getTextPath(str, 0, str.length(), this.f68168a, this.f68169b, path);
                this.f68170c.addPath(path);
            }
            this.f68168a += C23780h.this.f68142c.f68175d.measureText(str);
        }
    }

    /* renamed from: c6.h$i */
    public class C23789i extends C23790j {

        /* renamed from: a */
        public float f68180a;

        /* renamed from: b */
        public float f68181b;

        /* renamed from: c */
        public RectF f68182c = new RectF();

        public C23789i(float f, float f2) {
            super(C23780h.this, (C23781a) null);
            this.f68180a = f;
            this.f68181b = f2;
        }

        /* renamed from: a */
        public boolean mo37352a(C23713g.C23777y0 y0Var) {
            if (!(y0Var instanceof C23713g.C23779z0)) {
                return true;
            }
            C23713g.C23779z0 z0Var = (C23713g.C23779z0) y0Var;
            C23713g.C23755n0 f = y0Var.f68085a.mo37263f(z0Var.f68136o);
            if (f == null) {
                String.format("TextPath path reference '%s' not found", new Object[]{z0Var.f68136o});
                return false;
            }
            C23713g.C23770v vVar = (C23713g.C23770v) f;
            Path path = new C23784d(vVar.f68120o).f68160a;
            Matrix matrix = vVar.f68074n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f68182c.union(rectF);
            return false;
        }

        /* renamed from: b */
        public void mo37351b(String str) {
            if (C23780h.this.mo37323V()) {
                Rect rect = new Rect();
                C23780h.this.f68142c.f68175d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f68180a, this.f68181b);
                this.f68182c.union(rectF);
            }
            this.f68180a += C23780h.this.f68142c.f68175d.measureText(str);
        }
    }

    /* renamed from: c6.h$j */
    public abstract class C23790j {
        public C23790j(C23780h hVar, C23781a aVar) {
        }

        /* renamed from: a */
        public boolean mo37352a(C23713g.C23777y0 y0Var) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo37351b(String str);
    }

    /* renamed from: c6.h$k */
    public class C23791k extends C23790j {

        /* renamed from: a */
        public float f68184a = 0.0f;

        public C23791k(C23781a aVar) {
            super(C23780h.this, (C23781a) null);
        }

        /* renamed from: b */
        public void mo37351b(String str) {
            this.f68184a += C23780h.this.f68142c.f68175d.measureText(str);
        }
    }

    public C23780h(Canvas canvas, float f) {
        this.f68140a = canvas;
    }

    /* renamed from: a */
    public static void m28476a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, C23713g.C23774x xVar) {
        C23713g.C23774x xVar2;
        float f8;
        float f9;
        float f15 = f5;
        boolean z3 = z2;
        float f16 = f6;
        float f17 = f7;
        C23713g.C23774x xVar3 = xVar;
        if (f != f16 || f2 != f17) {
            if (f3 == 0.0f) {
                f9 = f16;
                f8 = f17;
                xVar2 = xVar;
            } else if (f4 == 0.0f) {
                f9 = f16;
                f8 = f17;
                xVar2 = xVar3;
            } else {
                float abs = Math.abs(f3);
                float abs2 = Math.abs(f4);
                double radians = Math.toRadians(((double) f15) % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d = ((double) (f - f16)) / 2.0d;
                double d2 = ((double) (f2 - f17)) / 2.0d;
                double d3 = (cos * d) + (sin * d2);
                double d4 = ((-sin) * d) + (d2 * cos);
                double d5 = (double) (abs * abs);
                double d6 = (double) (abs2 * abs2);
                double d7 = d3 * d3;
                double d8 = d4 * d4;
                double d9 = (d7 / d5) + (d8 / d6);
                if (d9 > 0.99999d) {
                    double sqrt = Math.sqrt(d9) * 1.00001d;
                    abs = (float) (((double) abs) * sqrt);
                    abs2 = (float) (sqrt * ((double) abs2));
                    d5 = (double) (abs * abs);
                    d6 = (double) (abs2 * abs2);
                }
                double d15 = sin;
                double d16 = z == z2 ? -1.0d : 1.0d;
                double d17 = d5 * d6;
                double d18 = d5 * d8;
                double d19 = d6 * d7;
                double d25 = ((d17 - d18) - d19) / (d18 + d19);
                if (d25 < 0.0d) {
                    d25 = 0.0d;
                }
                double sqrt2 = d16 * Math.sqrt(d25);
                double d26 = (double) abs;
                double d27 = (double) abs2;
                double d28 = ((d26 * d4) / d27) * sqrt2;
                float f18 = abs2;
                double d29 = sqrt2 * (-((d27 * d3) / d26));
                float f19 = abs;
                double d35 = (((double) (f + f16)) / 2.0d) + ((cos * d28) - (d15 * d29));
                double d36 = (((double) (f2 + f7)) / 2.0d) + (d15 * d28) + (cos * d29);
                double d37 = (d3 - d28) / d26;
                double d38 = (d4 - d29) / d27;
                double d39 = ((-d3) - d28) / d26;
                double d44 = ((-d4) - d29) / d27;
                double d45 = (d37 * d37) + (d38 * d38);
                double acos = (d38 < 0.0d ? -1.0d : 1.0d) * Math.acos(d37 / Math.sqrt(d45));
                double sqrt3 = ((d37 * d39) + (d38 * d44)) / Math.sqrt(d45 * ((d39 * d39) + (d44 * d44)));
                double acos2 = ((d37 * d44) - (d38 * d39) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
                int i = (acos2 > 0.0d ? 1 : (acos2 == 0.0d ? 0 : -1));
                if (i == 0) {
                    xVar.mo37295c(f16, f7);
                    return;
                }
                float f25 = f7;
                C23713g.C23774x xVar4 = xVar;
                if (!z2 && i > 0) {
                    acos2 -= 6.283185307179586d;
                } else if (z2 && acos2 < 0.0d) {
                    acos2 += 6.283185307179586d;
                }
                double d46 = acos2 % 6.283185307179586d;
                double d47 = acos % 6.283185307179586d;
                int ceil = (int) Math.ceil((Math.abs(d46) * 2.0d) / 3.141592653589793d);
                double d48 = d46 / ((double) ceil);
                double d49 = d48 / 2.0d;
                double sin2 = (Math.sin(d49) * 1.3333333333333333d) / (Math.cos(d49) + 1.0d);
                int i2 = ceil * 6;
                float[] fArr = new float[i2];
                int i3 = 0;
                int i4 = 0;
                while (i3 < ceil) {
                    double d54 = (((double) i3) * d48) + d47;
                    double cos2 = Math.cos(d54);
                    double sin3 = Math.sin(d54);
                    int i5 = i4 + 1;
                    int i6 = ceil;
                    fArr[i4] = (float) (cos2 - (sin2 * sin3));
                    int i7 = i5 + 1;
                    fArr[i5] = (float) (sin3 + (cos2 * sin2));
                    double d55 = d54 + d48;
                    double cos3 = Math.cos(d55);
                    double sin4 = Math.sin(d55);
                    int i8 = i7 + 1;
                    double d56 = d48;
                    fArr[i7] = (float) ((sin2 * sin4) + cos3);
                    int i9 = i8 + 1;
                    fArr[i8] = (float) (sin4 - (sin2 * cos3));
                    int i15 = i9 + 1;
                    fArr[i9] = (float) cos3;
                    fArr[i15] = (float) sin4;
                    i3++;
                    float f26 = f6;
                    float f27 = f7;
                    C23713g.C23774x xVar5 = xVar;
                    i2 = i2;
                    ceil = i6;
                    i4 = i15 + 1;
                    d48 = d56;
                }
                int i16 = i2;
                Matrix matrix = new Matrix();
                matrix.postScale(f19, f18);
                matrix.postRotate(f5);
                matrix.postTranslate((float) d35, (float) d36);
                matrix.mapPoints(fArr);
                fArr[i16 - 2] = f6;
                fArr[i16 - 1] = f7;
                int i17 = i16;
                for (int i18 = 0; i18 < i17; i18 += 6) {
                    xVar.mo37294b(fArr[i18], fArr[i18 + 1], fArr[i18 + 2], fArr[i18 + 3], fArr[i18 + 4], fArr[i18 + 5]);
                }
                return;
            }
            xVar2.mo37295c(f9, f8);
        }
    }

    /* renamed from: i */
    public static int m28477i(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: A */
    public final Path mo37302A(C23713g.C23718b0 b0Var) {
        float f;
        float f2;
        Path path;
        C23713g.C23718b0 b0Var2 = b0Var;
        C23713g.C23758p pVar = b0Var2.f67949s;
        if (pVar == null && b0Var2.f67950t == null) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            if (pVar == null) {
                f2 = b0Var2.f67950t.mo37288e(this);
            } else if (b0Var2.f67950t == null) {
                f2 = pVar.mo37287d(this);
            } else {
                f2 = pVar.mo37287d(this);
                f = b0Var2.f67950t.mo37288e(this);
            }
            f = f2;
        }
        float min = Math.min(f2, b0Var2.f67947q.mo37287d(this) / 2.0f);
        float min2 = Math.min(f, b0Var2.f67948r.mo37288e(this) / 2.0f);
        C23713g.C23758p pVar2 = b0Var2.f67945o;
        float d = pVar2 != null ? pVar2.mo37287d(this) : 0.0f;
        C23713g.C23758p pVar3 = b0Var2.f67946p;
        float e = pVar3 != null ? pVar3.mo37288e(this) : 0.0f;
        float d2 = b0Var2.f67947q.mo37287d(this);
        float e2 = b0Var2.f67948r.mo37288e(this);
        if (b0Var2.f68073h == null) {
            b0Var2.f68073h = new C23713g.C23717b(d, e, d2, e2);
        }
        float f3 = d + d2;
        float f4 = e + e2;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(d, e);
            path.lineTo(f3, e);
            path.lineTo(f3, f4);
            path.lineTo(d, f4);
            path.lineTo(d, e);
        } else {
            float f5 = min * 0.5522848f;
            float f6 = 0.5522848f * min2;
            float f7 = e + min2;
            path2.moveTo(d, f7);
            float f8 = f7 - f6;
            float f9 = d + min;
            float f15 = f9 - f5;
            path2.cubicTo(d, f8, f15, e, f9, e);
            float f16 = f3 - min;
            path2.lineTo(f16, e);
            float f17 = f16 + f5;
            float f18 = f7;
            path2.cubicTo(f17, e, f3, f8, f3, f18);
            float f19 = f4 - min2;
            path2.lineTo(f3, f19);
            float f25 = f19 + f6;
            path = path2;
            path2.cubicTo(f3, f25, f17, f4, f16, f4);
            path.lineTo(f9, f4);
            path.cubicTo(f15, f4, d, f25, d, f19);
            path.lineTo(d, f18);
        }
        path.close();
        return path;
    }

    /* renamed from: B */
    public final C23713g.C23717b mo37303B(C23713g.C23758p pVar, C23713g.C23758p pVar2, C23713g.C23758p pVar3, C23713g.C23758p pVar4) {
        float f = 0.0f;
        float d = pVar != null ? pVar.mo37287d(this) : 0.0f;
        if (pVar2 != null) {
            f = pVar2.mo37288e(this);
        }
        C23788h hVar = this.f68142c;
        C23713g.C23717b bVar = hVar.f68178g;
        if (bVar == null) {
            bVar = hVar.f68177f;
        }
        return new C23713g.C23717b(d, f, pVar3 != null ? pVar3.mo37287d(this) : bVar.f67943c, pVar4 != null ? pVar4.mo37288e(this) : bVar.f67944d);
    }

    /* renamed from: C */
    public final Path mo37304C(C23713g.C23749k0 k0Var, boolean z) {
        Path path;
        Path b;
        this.f68143d.push(this.f68142c);
        C23788h hVar = new C23788h(this, this.f68142c);
        this.f68142c = hVar;
        mo37321T(hVar, k0Var);
        if (!mo37332k() || !mo37323V()) {
            this.f68142c = this.f68143d.pop();
            return null;
        }
        if (k0Var instanceof C23713g.C23736e1) {
            if (!z) {
                String.format("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C23713g.C23736e1 e1Var = (C23713g.C23736e1) k0Var;
            C23713g.C23755n0 f = k0Var.f68085a.mo37263f(e1Var.f68037p);
            if (f == null) {
                String.format("Use reference '%s' not found", new Object[]{e1Var.f68037p});
                this.f68142c = this.f68143d.pop();
                return null;
            } else if (!(f instanceof C23713g.C23749k0)) {
                this.f68142c = this.f68143d.pop();
                return null;
            } else {
                path = mo37304C((C23713g.C23749k0) f, false);
                if (path == null) {
                    return null;
                }
                if (e1Var.f68073h == null) {
                    e1Var.f68073h = mo37325c(path);
                }
                Matrix matrix = e1Var.f68080o;
                if (matrix != null) {
                    path.transform(matrix);
                }
            }
        } else if (k0Var instanceof C23713g.C23750l) {
            C23713g.C23750l lVar = (C23713g.C23750l) k0Var;
            if (k0Var instanceof C23713g.C23770v) {
                path = new C23784d(((C23713g.C23770v) k0Var).f68120o).f68160a;
                if (k0Var.f68073h == null) {
                    k0Var.f68073h = mo37325c(path);
                }
            } else {
                path = k0Var instanceof C23713g.C23718b0 ? mo37302A((C23713g.C23718b0) k0Var) : k0Var instanceof C23713g.C23723d ? mo37345x((C23713g.C23723d) k0Var) : k0Var instanceof C23713g.C23744i ? mo37346y((C23713g.C23744i) k0Var) : k0Var instanceof C23713g.C23778z ? mo37347z((C23713g.C23778z) k0Var) : null;
            }
            if (path == null) {
                return null;
            }
            if (lVar.f68073h == null) {
                lVar.f68073h = mo37325c(path);
            }
            Matrix matrix2 = lVar.f68074n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(mo37343v());
        } else if (k0Var instanceof C23713g.C23773w0) {
            C23713g.C23773w0 w0Var = (C23713g.C23773w0) k0Var;
            List<C23713g.C23758p> list = w0Var.f67937o;
            float f2 = 0.0f;
            float d = (list == null || ((ArrayList) list).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) w0Var.f67937o).get(0)).mo37287d(this);
            List<C23713g.C23758p> list2 = w0Var.f67938p;
            float e = (list2 == null || ((ArrayList) list2).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) w0Var.f67938p).get(0)).mo37288e(this);
            List<C23713g.C23758p> list3 = w0Var.f67939q;
            float d2 = (list3 == null || ((ArrayList) list3).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) w0Var.f67939q).get(0)).mo37287d(this);
            List<C23713g.C23758p> list4 = w0Var.f67940r;
            if (!(list4 == null || ((ArrayList) list4).size() == 0)) {
                f2 = ((C23713g.C23758p) ((ArrayList) w0Var.f67940r).get(0)).mo37288e(this);
            }
            if (this.f68142c.f68172a.f67967A != C23713g.C23727e0.C23729f.Start) {
                float d3 = mo37326d(w0Var);
                if (this.f68142c.f68172a.f67967A == C23713g.C23727e0.C23729f.Middle) {
                    d3 /= 2.0f;
                }
                d -= d3;
            }
            if (w0Var.f68073h == null) {
                C23789i iVar = new C23789i(d, e);
                mo37335n(w0Var, iVar);
                RectF rectF = iVar.f68182c;
                w0Var.f68073h = new C23713g.C23717b(rectF.left, rectF.top, rectF.width(), iVar.f68182c.height());
            }
            Path path2 = new Path();
            mo37335n(w0Var, new C23787g(d + d2, e + f2, path2));
            Matrix matrix3 = w0Var.f68126s;
            if (matrix3 != null) {
                path2.transform(matrix3);
            }
            path2.setFillType(mo37343v());
            path = path2;
        } else {
            String.format("Invalid %s element found in clipPath definition", new Object[]{k0Var.mo37264o()});
            return null;
        }
        if (!(this.f68142c.f68172a.f67977K == null || (b = mo37324b(k0Var, k0Var.f68073h)) == null)) {
            path.op(b, Path.Op.INTERSECT);
        }
        this.f68142c = this.f68143d.pop();
        return path;
    }

    /* renamed from: D */
    public final void mo37305D(C23713g.C23749k0 k0Var) {
        mo37306E(k0Var, k0Var.f68073h);
    }

    /* renamed from: E */
    public final void mo37306E(C23713g.C23749k0 k0Var, C23713g.C23717b bVar) {
        if (this.f68142c.f68172a.f67979M != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f68140a.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f68140a.saveLayer((RectF) null, paint2, 31);
            C23713g.C23764s sVar = (C23713g.C23764s) this.f68141b.mo37263f(this.f68142c.f68172a.f67979M);
            mo37313L(sVar, k0Var, bVar);
            this.f68140a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f68140a.saveLayer((RectF) null, paint3, 31);
            mo37313L(sVar, k0Var, bVar);
            this.f68140a.restore();
            this.f68140a.restore();
        }
        mo37316O();
    }

    /* renamed from: F */
    public final boolean mo37307F() {
        C23713g.C23755n0 f;
        if (!(this.f68142c.f68172a.f67998s.floatValue() < 1.0f || this.f68142c.f68172a.f67979M != null)) {
            return false;
        }
        Canvas canvas = this.f68140a;
        int floatValue = (int) (this.f68142c.f68172a.f67998s.floatValue() * 256.0f);
        if (floatValue < 0) {
            floatValue = 0;
        } else if (floatValue > 255) {
            floatValue = 255;
        }
        canvas.saveLayerAlpha((RectF) null, floatValue, 31);
        this.f68143d.push(this.f68142c);
        C23788h hVar = new C23788h(this, this.f68142c);
        this.f68142c = hVar;
        String str = hVar.f68172a.f67979M;
        if (str != null && ((f = this.f68141b.mo37263f(str)) == null || !(f instanceof C23713g.C23764s))) {
            String.format("Mask reference '%s' not found", new Object[]{this.f68142c.f68172a.f67979M});
            this.f68142c.f68172a.f67979M = null;
        }
        return true;
    }

    /* renamed from: G */
    public final void mo37308G(C23713g.C23738f0 f0Var, C23713g.C23717b bVar, C23713g.C23717b bVar2, C23709e eVar) {
        if (bVar.f67943c != 0.0f && bVar.f67944d != 0.0f) {
            if (eVar == null && (eVar = f0Var.f68095o) == null) {
                eVar = C23709e.f67912d;
            }
            mo37321T(this.f68142c, f0Var);
            if (mo37332k()) {
                C23788h hVar = this.f68142c;
                hVar.f68177f = bVar;
                if (!hVar.f68172a.f67968B.booleanValue()) {
                    C23713g.C23717b bVar3 = this.f68142c.f68177f;
                    mo37314M(bVar3.f67941a, bVar3.f67942b, bVar3.f67943c, bVar3.f67944d);
                }
                mo37328f(f0Var, this.f68142c.f68177f);
                if (bVar2 != null) {
                    this.f68140a.concat(mo37327e(this.f68142c.f68177f, bVar2, eVar));
                    this.f68142c.f68178g = f0Var.f68111p;
                } else {
                    Canvas canvas = this.f68140a;
                    C23713g.C23717b bVar4 = this.f68142c.f68177f;
                    canvas.translate(bVar4.f67941a, bVar4.f67942b);
                }
                boolean F = mo37307F();
                mo37322U();
                mo37310I(f0Var, true);
                if (F) {
                    mo37306E(f0Var, f0Var.f68073h);
                }
                mo37319R(f0Var);
            }
        }
    }

    /* renamed from: H */
    public final void mo37309H(C23713g.C23755n0 n0Var) {
        C23713g.C23758p pVar;
        String str;
        int indexOf;
        Set<String> k;
        C23713g.C23758p pVar2;
        Boolean bool;
        C23713g.C23727e0.C23731a aVar = C23713g.C23727e0.C23731a.EvenOdd;
        if (!(n0Var instanceof C23713g.C23766t)) {
            mo37317P();
            if ((n0Var instanceof C23713g.C23751l0) && (bool = ((C23713g.C23751l0) n0Var).f68076d) != null) {
                this.f68142c.f68179h = bool.booleanValue();
            }
            if (n0Var instanceof C23713g.C23738f0) {
                C23713g.C23738f0 f0Var = (C23713g.C23738f0) n0Var;
                mo37308G(f0Var, mo37303B(f0Var.f68045q, f0Var.f68046r, f0Var.f68047s, f0Var.f68048t), f0Var.f68111p, f0Var.f68095o);
            } else {
                Bitmap bitmap = null;
                int i = 0;
                float f = 0.0f;
                if (n0Var instanceof C23713g.C23736e1) {
                    C23713g.C23736e1 e1Var = (C23713g.C23736e1) n0Var;
                    C23713g.C23725d1 d1Var = C23713g.C23725d1.percent;
                    C23713g.C23758p pVar3 = e1Var.f68040s;
                    if ((pVar3 == null || !pVar3.mo37290g()) && ((pVar2 = e1Var.f68041t) == null || !pVar2.mo37290g())) {
                        mo37321T(this.f68142c, e1Var);
                        if (mo37332k()) {
                            C23713g.C23755n0 f2 = e1Var.f68085a.mo37263f(e1Var.f68037p);
                            if (f2 == null) {
                                String.format("Use reference '%s' not found", new Object[]{e1Var.f68037p});
                            } else {
                                Matrix matrix = e1Var.f68080o;
                                if (matrix != null) {
                                    this.f68140a.concat(matrix);
                                }
                                C23713g.C23758p pVar4 = e1Var.f68038q;
                                float d = pVar4 != null ? pVar4.mo37287d(this) : 0.0f;
                                C23713g.C23758p pVar5 = e1Var.f68039r;
                                this.f68140a.translate(d, pVar5 != null ? pVar5.mo37288e(this) : 0.0f);
                                mo37328f(e1Var, e1Var.f68073h);
                                boolean F = mo37307F();
                                this.f68144e.push(e1Var);
                                this.f68145f.push(this.f68140a.getMatrix());
                                if (f2 instanceof C23713g.C23738f0) {
                                    C23713g.C23738f0 f0Var2 = (C23713g.C23738f0) f2;
                                    C23713g.C23717b B = mo37303B((C23713g.C23758p) null, (C23713g.C23758p) null, e1Var.f68040s, e1Var.f68041t);
                                    mo37317P();
                                    mo37308G(f0Var2, B, f0Var2.f68111p, f0Var2.f68095o);
                                    mo37316O();
                                } else if (f2 instanceof C23713g.C23767t0) {
                                    C23713g.C23758p pVar6 = e1Var.f68040s;
                                    if (pVar6 == null) {
                                        pVar6 = new C23713g.C23758p(100.0f, d1Var);
                                    }
                                    C23713g.C23758p pVar7 = e1Var.f68041t;
                                    if (pVar7 == null) {
                                        pVar7 = new C23713g.C23758p(100.0f, d1Var);
                                    }
                                    C23713g.C23717b B2 = mo37303B((C23713g.C23758p) null, (C23713g.C23758p) null, pVar6, pVar7);
                                    mo37317P();
                                    C23713g.C23767t0 t0Var = (C23713g.C23767t0) f2;
                                    if (!(B2.f67943c == 0.0f || B2.f67944d == 0.0f)) {
                                        C23709e eVar = t0Var.f68095o;
                                        if (eVar == null) {
                                            eVar = C23709e.f67912d;
                                        }
                                        mo37321T(this.f68142c, t0Var);
                                        C23788h hVar = this.f68142c;
                                        hVar.f68177f = B2;
                                        if (!hVar.f68172a.f67968B.booleanValue()) {
                                            C23713g.C23717b bVar = this.f68142c.f68177f;
                                            mo37314M(bVar.f67941a, bVar.f67942b, bVar.f67943c, bVar.f67944d);
                                        }
                                        C23713g.C23717b bVar2 = t0Var.f68111p;
                                        if (bVar2 != null) {
                                            this.f68140a.concat(mo37327e(this.f68142c.f68177f, bVar2, eVar));
                                            this.f68142c.f68178g = t0Var.f68111p;
                                        } else {
                                            Canvas canvas = this.f68140a;
                                            C23713g.C23717b bVar3 = this.f68142c.f68177f;
                                            canvas.translate(bVar3.f67941a, bVar3.f67942b);
                                        }
                                        boolean F2 = mo37307F();
                                        mo37310I(t0Var, true);
                                        if (F2) {
                                            mo37306E(t0Var, t0Var.f68073h);
                                        }
                                        mo37319R(t0Var);
                                    }
                                    mo37316O();
                                } else {
                                    mo37309H(f2);
                                }
                                this.f68144e.pop();
                                this.f68145f.pop();
                                if (F) {
                                    mo37306E(e1Var, e1Var.f68073h);
                                }
                                mo37319R(e1Var);
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23765s0) {
                    C23713g.C23765s0 s0Var = (C23713g.C23765s0) n0Var;
                    mo37321T(this.f68142c, s0Var);
                    if (mo37332k()) {
                        Matrix matrix2 = s0Var.f68080o;
                        if (matrix2 != null) {
                            this.f68140a.concat(matrix2);
                        }
                        mo37328f(s0Var, s0Var.f68073h);
                        boolean F3 = mo37307F();
                        String language = Locale.getDefault().getLanguage();
                        Iterator<C23713g.C23755n0> it = s0Var.f68050i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C23713g.C23755n0 next = it.next();
                            if (next instanceof C23713g.C23741g0) {
                                C23713g.C23741g0 g0Var = (C23713g.C23741g0) next;
                                if (g0Var.mo37276h() == null && ((k = g0Var.mo37279k()) == null || (!k.isEmpty() && k.contains(language)))) {
                                    Set<String> e = g0Var.mo37273e();
                                    if (e != null) {
                                        if (f68139g == null) {
                                            synchronized (C23780h.class) {
                                                HashSet<String> hashSet = new HashSet<>();
                                                f68139g = hashSet;
                                                hashSet.add("Structure");
                                                f68139g.add("BasicStructure");
                                                f68139g.add("ConditionalProcessing");
                                                f68139g.add("Image");
                                                f68139g.add("Style");
                                                f68139g.add("ViewportAttribute");
                                                f68139g.add("Shape");
                                                f68139g.add("BasicText");
                                                f68139g.add("PaintAttribute");
                                                f68139g.add("BasicPaintAttribute");
                                                f68139g.add("OpacityAttribute");
                                                f68139g.add("BasicGraphicsAttribute");
                                                f68139g.add("Marker");
                                                f68139g.add("Gradient");
                                                f68139g.add("Pattern");
                                                f68139g.add("Clip");
                                                f68139g.add("BasicClip");
                                                f68139g.add("Mask");
                                                f68139g.add("View");
                                            }
                                        }
                                        if (e.isEmpty()) {
                                            continue;
                                        } else if (!f68139g.containsAll(e)) {
                                            continue;
                                        }
                                    }
                                    Set<String> j = g0Var.mo37278j();
                                    if (j == null) {
                                        Set<String> n = g0Var.mo37281n();
                                        if (n == null) {
                                            mo37309H(next);
                                            break;
                                        }
                                        n.isEmpty();
                                    } else {
                                        j.isEmpty();
                                    }
                                }
                            }
                        }
                        if (F3) {
                            mo37306E(s0Var, s0Var.f68073h);
                        }
                        mo37319R(s0Var);
                    }
                } else if (n0Var instanceof C23713g.C23752m) {
                    C23713g.C23752m mVar = (C23713g.C23752m) n0Var;
                    mVar.mo37264o();
                    mo37321T(this.f68142c, mVar);
                    if (mo37332k()) {
                        Matrix matrix3 = mVar.f68080o;
                        if (matrix3 != null) {
                            this.f68140a.concat(matrix3);
                        }
                        mo37328f(mVar, mVar.f68073h);
                        boolean F4 = mo37307F();
                        mo37310I(mVar, true);
                        if (F4) {
                            mo37306E(mVar, mVar.f68073h);
                        }
                        mo37319R(mVar);
                    }
                } else if (n0Var instanceof C23713g.C23756o) {
                    C23713g.C23756o oVar = (C23713g.C23756o) n0Var;
                    C23713g.C23758p pVar8 = oVar.f68090s;
                    if (!(pVar8 == null || pVar8.mo37290g() || (pVar = oVar.f68091t) == null || pVar.mo37290g() || (str = oVar.f68087p) == null)) {
                        C23709e eVar2 = oVar.f68095o;
                        if (eVar2 == null) {
                            eVar2 = C23709e.f67912d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception unused) {
                            }
                        }
                        if (bitmap != null) {
                            C23713g.C23717b bVar4 = new C23713g.C23717b(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                            mo37321T(this.f68142c, oVar);
                            if (mo37332k() && mo37323V()) {
                                Matrix matrix4 = oVar.f68092u;
                                if (matrix4 != null) {
                                    this.f68140a.concat(matrix4);
                                }
                                C23713g.C23758p pVar9 = oVar.f68088q;
                                float d2 = pVar9 != null ? pVar9.mo37287d(this) : 0.0f;
                                C23713g.C23758p pVar10 = oVar.f68089r;
                                float e2 = pVar10 != null ? pVar10.mo37288e(this) : 0.0f;
                                float d3 = oVar.f68090s.mo37287d(this);
                                float d4 = oVar.f68091t.mo37287d(this);
                                C23788h hVar2 = this.f68142c;
                                hVar2.f68177f = new C23713g.C23717b(d2, e2, d3, d4);
                                if (!hVar2.f68172a.f67968B.booleanValue()) {
                                    C23713g.C23717b bVar5 = this.f68142c.f68177f;
                                    mo37314M(bVar5.f67941a, bVar5.f67942b, bVar5.f67943c, bVar5.f67944d);
                                }
                                oVar.f68073h = this.f68142c.f68177f;
                                mo37319R(oVar);
                                mo37328f(oVar, oVar.f68073h);
                                boolean F5 = mo37307F();
                                mo37322U();
                                this.f68140a.save();
                                this.f68140a.concat(mo37327e(this.f68142c.f68177f, bVar4, eVar2));
                                if (this.f68142c.f68172a.f67985T != C23713g.C23727e0.C23728e.optimizeSpeed) {
                                    i = 2;
                                }
                                this.f68140a.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(i));
                                this.f68140a.restore();
                                if (F5) {
                                    mo37306E(oVar, oVar.f68073h);
                                }
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23770v) {
                    C23713g.C23770v vVar = (C23713g.C23770v) n0Var;
                    if (vVar.f68120o != null) {
                        mo37321T(this.f68142c, vVar);
                        if (mo37332k() && mo37323V()) {
                            C23788h hVar3 = this.f68142c;
                            if (hVar3.f68174c || hVar3.f68173b) {
                                Matrix matrix5 = vVar.f68074n;
                                if (matrix5 != null) {
                                    this.f68140a.concat(matrix5);
                                }
                                Path path = new C23784d(vVar.f68120o).f68160a;
                                if (vVar.f68073h == null) {
                                    vVar.f68073h = mo37325c(path);
                                }
                                mo37319R(vVar);
                                mo37329g(vVar);
                                mo37328f(vVar, vVar.f68073h);
                                boolean F6 = mo37307F();
                                C23788h hVar4 = this.f68142c;
                                if (hVar4.f68173b) {
                                    C23713g.C23727e0.C23731a aVar2 = hVar4.f68172a.f67988f;
                                    path.setFillType((aVar2 == null || aVar2 != aVar) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    mo37333l(vVar, path);
                                }
                                if (this.f68142c.f68174c) {
                                    mo37334m(path);
                                }
                                mo37312K(vVar);
                                if (F6) {
                                    mo37306E(vVar, vVar.f68073h);
                                }
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23718b0) {
                    C23713g.C23718b0 b0Var = (C23713g.C23718b0) n0Var;
                    C23713g.C23758p pVar11 = b0Var.f67947q;
                    if (pVar11 != null && b0Var.f67948r != null && !pVar11.mo37290g() && !b0Var.f67948r.mo37290g()) {
                        mo37321T(this.f68142c, b0Var);
                        if (mo37332k() && mo37323V()) {
                            Matrix matrix6 = b0Var.f68074n;
                            if (matrix6 != null) {
                                this.f68140a.concat(matrix6);
                            }
                            Path A = mo37302A(b0Var);
                            mo37319R(b0Var);
                            mo37329g(b0Var);
                            mo37328f(b0Var, b0Var.f68073h);
                            boolean F7 = mo37307F();
                            if (this.f68142c.f68173b) {
                                mo37333l(b0Var, A);
                            }
                            if (this.f68142c.f68174c) {
                                mo37334m(A);
                            }
                            if (F7) {
                                mo37306E(b0Var, b0Var.f68073h);
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23723d) {
                    C23713g.C23723d dVar = (C23713g.C23723d) n0Var;
                    C23713g.C23758p pVar12 = dVar.f67958q;
                    if (pVar12 != null && !pVar12.mo37290g()) {
                        mo37321T(this.f68142c, dVar);
                        if (mo37332k() && mo37323V()) {
                            Matrix matrix7 = dVar.f68074n;
                            if (matrix7 != null) {
                                this.f68140a.concat(matrix7);
                            }
                            Path x = mo37345x(dVar);
                            mo37319R(dVar);
                            mo37329g(dVar);
                            mo37328f(dVar, dVar.f68073h);
                            boolean F8 = mo37307F();
                            if (this.f68142c.f68173b) {
                                mo37333l(dVar, x);
                            }
                            if (this.f68142c.f68174c) {
                                mo37334m(x);
                            }
                            if (F8) {
                                mo37306E(dVar, dVar.f68073h);
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23744i) {
                    C23713g.C23744i iVar = (C23713g.C23744i) n0Var;
                    C23713g.C23758p pVar13 = iVar.f68058q;
                    if (pVar13 != null && iVar.f68059r != null && !pVar13.mo37290g() && !iVar.f68059r.mo37290g()) {
                        mo37321T(this.f68142c, iVar);
                        if (mo37332k() && mo37323V()) {
                            Matrix matrix8 = iVar.f68074n;
                            if (matrix8 != null) {
                                this.f68140a.concat(matrix8);
                            }
                            Path y = mo37346y(iVar);
                            mo37319R(iVar);
                            mo37329g(iVar);
                            mo37328f(iVar, iVar.f68073h);
                            boolean F9 = mo37307F();
                            if (this.f68142c.f68173b) {
                                mo37333l(iVar, y);
                            }
                            if (this.f68142c.f68174c) {
                                mo37334m(y);
                            }
                            if (F9) {
                                mo37306E(iVar, iVar.f68073h);
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23760q) {
                    C23713g.C23760q qVar = (C23713g.C23760q) n0Var;
                    mo37321T(this.f68142c, qVar);
                    if (mo37332k() && mo37323V() && this.f68142c.f68174c) {
                        Matrix matrix9 = qVar.f68074n;
                        if (matrix9 != null) {
                            this.f68140a.concat(matrix9);
                        }
                        C23713g.C23758p pVar14 = qVar.f68096o;
                        float d5 = pVar14 == null ? 0.0f : pVar14.mo37287d(this);
                        C23713g.C23758p pVar15 = qVar.f68097p;
                        float e3 = pVar15 == null ? 0.0f : pVar15.mo37288e(this);
                        C23713g.C23758p pVar16 = qVar.f68098q;
                        float d6 = pVar16 == null ? 0.0f : pVar16.mo37287d(this);
                        C23713g.C23758p pVar17 = qVar.f68099r;
                        if (pVar17 != null) {
                            f = pVar17.mo37288e(this);
                        }
                        if (qVar.f68073h == null) {
                            qVar.f68073h = new C23713g.C23717b(Math.min(d5, d6), Math.min(e3, f), Math.abs(d6 - d5), Math.abs(f - e3));
                        }
                        Path path2 = new Path();
                        path2.moveTo(d5, e3);
                        path2.lineTo(d6, f);
                        mo37319R(qVar);
                        mo37329g(qVar);
                        mo37328f(qVar, qVar.f68073h);
                        boolean F10 = mo37307F();
                        mo37334m(path2);
                        mo37312K(qVar);
                        if (F10) {
                            mo37306E(qVar, qVar.f68073h);
                        }
                    }
                } else if (n0Var instanceof C23713g.C23715a0) {
                    C23713g.C23715a0 a0Var = (C23713g.C23715a0) n0Var;
                    mo37321T(this.f68142c, a0Var);
                    if (mo37332k() && mo37323V()) {
                        C23788h hVar5 = this.f68142c;
                        if (hVar5.f68174c || hVar5.f68173b) {
                            Matrix matrix10 = a0Var.f68074n;
                            if (matrix10 != null) {
                                this.f68140a.concat(matrix10);
                            }
                            if (a0Var.f68135o.length >= 2) {
                                Path z = mo37347z(a0Var);
                                mo37319R(a0Var);
                                mo37329g(a0Var);
                                mo37328f(a0Var, a0Var.f68073h);
                                boolean F11 = mo37307F();
                                if (this.f68142c.f68173b) {
                                    mo37333l(a0Var, z);
                                }
                                if (this.f68142c.f68174c) {
                                    mo37334m(z);
                                }
                                mo37312K(a0Var);
                                if (F11) {
                                    mo37306E(a0Var, a0Var.f68073h);
                                }
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23778z) {
                    C23713g.C23778z zVar = (C23713g.C23778z) n0Var;
                    mo37321T(this.f68142c, zVar);
                    if (mo37332k() && mo37323V()) {
                        C23788h hVar6 = this.f68142c;
                        if (hVar6.f68174c || hVar6.f68173b) {
                            Matrix matrix11 = zVar.f68074n;
                            if (matrix11 != null) {
                                this.f68140a.concat(matrix11);
                            }
                            if (zVar.f68135o.length >= 2) {
                                Path z2 = mo37347z(zVar);
                                mo37319R(zVar);
                                C23713g.C23727e0.C23731a aVar3 = this.f68142c.f68172a.f67988f;
                                z2.setFillType((aVar3 == null || aVar3 != aVar) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                mo37329g(zVar);
                                mo37328f(zVar, zVar.f68073h);
                                boolean F12 = mo37307F();
                                if (this.f68142c.f68173b) {
                                    mo37333l(zVar, z2);
                                }
                                if (this.f68142c.f68174c) {
                                    mo37334m(z2);
                                }
                                mo37312K(zVar);
                                if (F12) {
                                    mo37306E(zVar, zVar.f68073h);
                                }
                            }
                        }
                    }
                } else if (n0Var instanceof C23713g.C23773w0) {
                    C23713g.C23773w0 w0Var = (C23713g.C23773w0) n0Var;
                    mo37321T(this.f68142c, w0Var);
                    if (mo37332k()) {
                        Matrix matrix12 = w0Var.f68126s;
                        if (matrix12 != null) {
                            this.f68140a.concat(matrix12);
                        }
                        List<C23713g.C23758p> list = w0Var.f67937o;
                        float d7 = (list == null || ((ArrayList) list).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) w0Var.f67937o).get(0)).mo37287d(this);
                        List<C23713g.C23758p> list2 = w0Var.f67938p;
                        float e4 = (list2 == null || ((ArrayList) list2).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) w0Var.f67938p).get(0)).mo37288e(this);
                        List<C23713g.C23758p> list3 = w0Var.f67939q;
                        float d8 = (list3 == null || ((ArrayList) list3).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) w0Var.f67939q).get(0)).mo37287d(this);
                        List<C23713g.C23758p> list4 = w0Var.f67940r;
                        if (!(list4 == null || ((ArrayList) list4).size() == 0)) {
                            f = ((C23713g.C23758p) ((ArrayList) w0Var.f67940r).get(0)).mo37288e(this);
                        }
                        C23713g.C23727e0.C23729f u = mo37342u();
                        if (u != C23713g.C23727e0.C23729f.Start) {
                            float d9 = mo37326d(w0Var);
                            if (u == C23713g.C23727e0.C23729f.Middle) {
                                d9 /= 2.0f;
                            }
                            d7 -= d9;
                        }
                        if (w0Var.f68073h == null) {
                            C23789i iVar2 = new C23789i(d7, e4);
                            mo37335n(w0Var, iVar2);
                            RectF rectF = iVar2.f68182c;
                            w0Var.f68073h = new C23713g.C23717b(rectF.left, rectF.top, rectF.width(), iVar2.f68182c.height());
                        }
                        mo37319R(w0Var);
                        mo37329g(w0Var);
                        mo37328f(w0Var, w0Var.f68073h);
                        boolean F13 = mo37307F();
                        mo37335n(w0Var, new C23786f(d7 + d8, e4 + f));
                        if (F13) {
                            mo37306E(w0Var, w0Var.f68073h);
                        }
                    }
                }
            }
            mo37316O();
        }
    }

    /* renamed from: I */
    public final void mo37310I(C23713g.C23747j0 j0Var, boolean z) {
        if (z) {
            this.f68144e.push(j0Var);
            this.f68145f.push(this.f68140a.getMatrix());
        }
        for (C23713g.C23755n0 H : j0Var.mo37267d()) {
            mo37309H(H);
        }
        if (z) {
            this.f68144e.pop();
            this.f68145f.pop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0102, code lost:
        r1 = 0.0f - r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0103 A[PHI: r1 
      PHI: (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:59:0x00f8, B:62:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0141  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37311J(p298c6.C23713g.C23762r r12, p298c6.C23780h.C23783c r13) {
        /*
            r11 = this;
            r11.mo37317P()
            java.lang.Float r0 = r12.f68110v
            r1 = 0
            if (r0 == 0) goto L_0x0033
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002c
            float r0 = r13.f68157c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            float r2 = r13.f68158d
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
        L_0x001e:
            float r2 = r13.f68158d
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0034
        L_0x002c:
            java.lang.Float r0 = r12.f68110v
            float r0 = r0.floatValue()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            boolean r2 = r12.f68105q
            if (r2 == 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0047
        L_0x003b:
            c6.h$h r2 = r11.f68142c
            c6.g$e0 r2 = r2.f68172a
            c6.g$p r2 = r2.f67992j
            r3 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2.mo37284a(r3)
        L_0x0047:
            c6.h$h r3 = r11.mo37340s(r12)
            r11.f68142c = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.f68155a
            float r13 = r13.f68156b
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            c6.g$p r13 = r12.f68106r
            if (r13 == 0) goto L_0x0068
            float r13 = r13.mo37287d(r11)
            goto L_0x0069
        L_0x0068:
            r13 = 0
        L_0x0069:
            c6.g$p r0 = r12.f68107s
            if (r0 == 0) goto L_0x0072
            float r0 = r0.mo37288e(r11)
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            c6.g$p r2 = r12.f68108t
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x007e
            float r2 = r2.mo37287d(r11)
            goto L_0x0080
        L_0x007e:
            r2 = 1077936128(0x40400000, float:3.0)
        L_0x0080:
            c6.g$p r5 = r12.f68109u
            if (r5 == 0) goto L_0x0088
            float r4 = r5.mo37288e(r11)
        L_0x0088:
            c6.g$b r5 = r12.f68111p
            if (r5 == 0) goto L_0x011e
            float r6 = r5.f67943c
            float r6 = r2 / r6
            float r5 = r5.f67944d
            float r5 = r4 / r5
            c6.e r7 = r12.f68095o
            if (r7 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            c6.e r7 = p298c6.C23709e.f67912d
        L_0x009b:
            c6.e r8 = p298c6.C23709e.f67911c
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b4
            c6.e$b r8 = r7.f67914b
            c6.e$b r9 = p298c6.C23709e.C23711b.slice
            if (r8 != r9) goto L_0x00ae
            float r5 = java.lang.Math.max(r6, r5)
            goto L_0x00b2
        L_0x00ae:
            float r5 = java.lang.Math.min(r6, r5)
        L_0x00b2:
            r6 = r5
            r5 = r6
        L_0x00b4:
            float r13 = -r13
            float r13 = r13 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f68140a
            r13.concat(r3)
            c6.g$b r13 = r12.f68111p
            float r0 = r13.f67943c
            float r0 = r0 * r6
            float r13 = r13.f67944d
            float r13 = r13 * r5
            c6.e$a r8 = r7.f67913a
            int r8 = r8.ordinal()
            r9 = 2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 == r9) goto L_0x00ed
            r9 = 3
            if (r8 == r9) goto L_0x00ea
            r9 = 5
            if (r8 == r9) goto L_0x00ed
            r9 = 6
            if (r8 == r9) goto L_0x00ea
            r9 = 8
            if (r8 == r9) goto L_0x00ed
            r9 = 9
            if (r8 == r9) goto L_0x00ea
            r0 = 0
            goto L_0x00f2
        L_0x00ea:
            float r0 = r2 - r0
            goto L_0x00f0
        L_0x00ed:
            float r0 = r2 - r0
            float r0 = r0 / r10
        L_0x00f0:
            float r0 = r1 - r0
        L_0x00f2:
            c6.e$a r7 = r7.f67913a
            int r7 = r7.ordinal()
            switch(r7) {
                case 4: goto L_0x00ff;
                case 5: goto L_0x00ff;
                case 6: goto L_0x00ff;
                case 7: goto L_0x00fc;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00fc;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x0103
        L_0x00fc:
            float r13 = r4 - r13
            goto L_0x0102
        L_0x00ff:
            float r13 = r4 - r13
            float r13 = r13 / r10
        L_0x0102:
            float r1 = r1 - r13
        L_0x0103:
            c6.h$h r13 = r11.f68142c
            c6.g$e0 r13 = r13.f68172a
            java.lang.Boolean r13 = r13.f67968B
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0112
            r11.mo37314M(r0, r1, r2, r4)
        L_0x0112:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r13 = r11.f68140a
            r13.concat(r3)
            goto L_0x0137
        L_0x011e:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f68140a
            r13.concat(r3)
            c6.h$h r13 = r11.f68142c
            c6.g$e0 r13 = r13.f68172a
            java.lang.Boolean r13 = r13.f67968B
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0137
            r11.mo37314M(r1, r1, r2, r4)
        L_0x0137:
            boolean r13 = r11.mo37307F()
            r0 = 0
            r11.mo37310I(r12, r0)
            if (r13 == 0) goto L_0x0146
            c6.g$b r13 = r12.f68073h
            r11.mo37306E(r12, r13)
        L_0x0146:
            r11.mo37316O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23780h.mo37311J(c6.g$r, c6.h$c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0187 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0188  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37312K(p298c6.C23713g.C23750l r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            c6.h$h r1 = r6.f68142c
            c6.g$e0 r1 = r1.f68172a
            java.lang.String r2 = r1.f67970D
            if (r2 != 0) goto L_0x0015
            java.lang.String r3 = r1.f67971E
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r1.f67972F
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r1 = "Marker reference '%s' not found"
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0034
            c6.g r3 = r0.f68085a
            c6.g$n0 r2 = r3.mo37263f(r2)
            if (r2 == 0) goto L_0x0027
            c6.g$r r2 = (p298c6.C23713g.C23762r) r2
            r10 = r2
            goto L_0x0035
        L_0x0027:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            c6.h$h r3 = r6.f68142c
            c6.g$e0 r3 = r3.f68172a
            java.lang.String r3 = r3.f67970D
            r2[r8] = r3
            java.lang.String.format(r1, r2)
        L_0x0034:
            r10 = 0
        L_0x0035:
            c6.h$h r2 = r6.f68142c
            c6.g$e0 r2 = r2.f68172a
            java.lang.String r2 = r2.f67971E
            if (r2 == 0) goto L_0x0056
            c6.g r3 = r0.f68085a
            c6.g$n0 r2 = r3.mo37263f(r2)
            if (r2 == 0) goto L_0x0049
            c6.g$r r2 = (p298c6.C23713g.C23762r) r2
            r11 = r2
            goto L_0x0057
        L_0x0049:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            c6.h$h r3 = r6.f68142c
            c6.g$e0 r3 = r3.f68172a
            java.lang.String r3 = r3.f67971E
            r2[r8] = r3
            java.lang.String.format(r1, r2)
        L_0x0056:
            r11 = 0
        L_0x0057:
            c6.h$h r2 = r6.f68142c
            c6.g$e0 r2 = r2.f68172a
            java.lang.String r2 = r2.f67972F
            if (r2 == 0) goto L_0x0078
            c6.g r3 = r0.f68085a
            c6.g$n0 r2 = r3.mo37263f(r2)
            if (r2 == 0) goto L_0x006b
            c6.g$r r2 = (p298c6.C23713g.C23762r) r2
            r12 = r2
            goto L_0x0079
        L_0x006b:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            c6.h$h r3 = r6.f68142c
            c6.g$e0 r3 = r3.f68172a
            java.lang.String r3 = r3.f67972F
            r2[r8] = r3
            java.lang.String.format(r1, r2)
        L_0x0078:
            r12 = 0
        L_0x0079:
            boolean r1 = r0 instanceof p298c6.C23713g.C23770v
            r13 = 2
            if (r1 == 0) goto L_0x008b
            c6.h$b r1 = new c6.h$b
            c6.g$v r0 = (p298c6.C23713g.C23770v) r0
            c6.g$w r0 = r0.f68120o
            r1.<init>(r0)
            java.util.List<c6.h$c> r0 = r1.f68146a
            goto L_0x017e
        L_0x008b:
            boolean r1 = r0 instanceof p298c6.C23713g.C23760q
            if (r1 == 0) goto L_0x00e8
            c6.g$q r0 = (p298c6.C23713g.C23760q) r0
            c6.g$p r1 = r0.f68096o
            if (r1 == 0) goto L_0x009b
            float r1 = r1.mo37287d(r6)
            r2 = r1
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            c6.g$p r1 = r0.f68097p
            if (r1 == 0) goto L_0x00a6
            float r1 = r1.mo37288e(r6)
            r3 = r1
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            c6.g$p r1 = r0.f68098q
            if (r1 == 0) goto L_0x00b1
            float r1 = r1.mo37287d(r6)
            r15 = r1
            goto L_0x00b2
        L_0x00b1:
            r15 = 0
        L_0x00b2:
            c6.g$p r0 = r0.f68099r
            if (r0 == 0) goto L_0x00bd
            float r0 = r0.mo37288e(r6)
            r16 = r0
            goto L_0x00bf
        L_0x00bd:
            r16 = 0
        L_0x00bf:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r13)
            c6.h$c r4 = new c6.h$c
            float r17 = r15 - r2
            float r18 = r16 - r3
            r0 = r4
            r1 = r22
            r14 = r4
            r4 = r17
            r7 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r14)
            c6.h$c r14 = new c6.h$c
            r0 = r14
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r14)
            r0 = r7
            goto L_0x017e
        L_0x00e8:
            r7 = r0
            c6.g$z r7 = (p298c6.C23713g.C23778z) r7
            float[] r0 = r7.f68135o
            int r14 = r0.length
            if (r14 >= r13) goto L_0x00f3
            r0 = 0
            goto L_0x017e
        L_0x00f3:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            c6.h$c r16 = new c6.h$c
            float[] r0 = r7.f68135o
            r2 = r0[r8]
            r3 = r0[r9]
            r4 = 0
            r5 = 0
            r0 = r16
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 0
            r2 = 0
            r5 = 2
        L_0x010c:
            if (r5 >= r14) goto L_0x013f
            float[] r1 = r7.f68135o
            r4 = r1[r5]
            int r2 = r5 + 1
            r3 = r1[r2]
            r0.mo37348a(r4, r3)
            r15.add(r0)
            c6.h$c r16 = new c6.h$c
            float r1 = r0.f68155a
            float r17 = r4 - r1
            float r0 = r0.f68156b
            float r18 = r3 - r0
            r0 = r16
            r1 = r22
            r2 = r4
            r19 = r3
            r20 = r4
            r4 = r17
            r17 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            int r5 = r17 + 2
            r2 = r19
            r1 = r20
            goto L_0x010c
        L_0x013f:
            boolean r3 = r7 instanceof p298c6.C23713g.C23715a0
            if (r3 == 0) goto L_0x017a
            float[] r3 = r7.f68135o
            r4 = r3[r8]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x017d
            r3 = r3[r9]
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x017d
            r0.mo37348a(r4, r3)
            r15.add(r0)
            c6.h$c r7 = new c6.h$c
            float r1 = r0.f68155a
            float r5 = r4 - r1
            float r0 = r0.f68156b
            float r14 = r3 - r0
            r0 = r7
            r1 = r22
            r2 = r4
            r4 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r15.get(r8)
            c6.h$c r0 = (p298c6.C23780h.C23783c) r0
            r7.mo37349b(r0)
            r15.add(r7)
            r15.set(r8, r7)
            goto L_0x017d
        L_0x017a:
            r15.add(r0)
        L_0x017d:
            r0 = r15
        L_0x017e:
            if (r0 != 0) goto L_0x0181
            return
        L_0x0181:
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0188
            return
        L_0x0188:
            c6.h$h r2 = r6.f68142c
            c6.g$e0 r2 = r2.f68172a
            r3 = 0
            r2.f67972F = r3
            r2.f67971E = r3
            r2.f67970D = r3
            if (r10 == 0) goto L_0x019e
            java.lang.Object r2 = r0.get(r8)
            c6.h$c r2 = (p298c6.C23780h.C23783c) r2
            r6.mo37311J(r10, r2)
        L_0x019e:
            if (r11 == 0) goto L_0x020b
            int r2 = r0.size()
            if (r2 <= r13) goto L_0x020b
            java.lang.Object r2 = r0.get(r8)
            c6.h$c r2 = (p298c6.C23780h.C23783c) r2
            java.lang.Object r3 = r0.get(r9)
            c6.h$c r3 = (p298c6.C23780h.C23783c) r3
            r4 = 1
            r21 = r3
            r3 = r2
            r2 = r21
        L_0x01b8:
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x020b
            int r4 = r4 + 1
            java.lang.Object r5 = r0.get(r4)
            c6.h$c r5 = (p298c6.C23780h.C23783c) r5
            boolean r7 = r2.f68159e
            if (r7 == 0) goto L_0x0204
            float r7 = r2.f68157c
            float r8 = r2.f68158d
            float r10 = r2.f68155a
            float r13 = r3.f68155a
            float r13 = r10 - r13
            float r14 = r2.f68156b
            float r3 = r3.f68156b
            float r3 = r14 - r3
            float r13 = r13 * r7
            float r3 = r3 * r8
            float r13 = r13 + r3
            r3 = 0
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 != 0) goto L_0x01ed
            float r13 = r5.f68155a
            float r13 = r13 - r10
            float r10 = r5.f68156b
            float r10 = r10 - r14
            float r13 = r13 * r7
            float r10 = r10 * r8
            float r13 = r13 + r10
        L_0x01ed:
            int r10 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x01f2
            goto L_0x0205
        L_0x01f2:
            if (r10 != 0) goto L_0x01fd
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0205
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x01fd
            goto L_0x0205
        L_0x01fd:
            float r7 = -r7
            r2.f68157c = r7
            float r7 = -r8
            r2.f68158d = r7
            goto L_0x0205
        L_0x0204:
            r3 = 0
        L_0x0205:
            r6.mo37311J(r11, r2)
            r3 = r2
            r2 = r5
            goto L_0x01b8
        L_0x020b:
            if (r12 == 0) goto L_0x0217
            int r1 = r1 - r9
            java.lang.Object r0 = r0.get(r1)
            c6.h$c r0 = (p298c6.C23780h.C23783c) r0
            r6.mo37311J(r12, r0)
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23780h.mo37312K(c6.g$l):void");
    }

    /* renamed from: L */
    public final void mo37313L(C23713g.C23764s sVar, C23713g.C23749k0 k0Var, C23713g.C23717b bVar) {
        float f;
        float f2;
        Boolean bool = sVar.f68112o;
        boolean z = true;
        if (bool != null && bool.booleanValue()) {
            C23713g.C23758p pVar = sVar.f68114q;
            f2 = pVar != null ? pVar.mo37287d(this) : bVar.f67943c;
            C23713g.C23758p pVar2 = sVar.f68115r;
            f = pVar2 != null ? pVar2.mo37288e(this) : bVar.f67944d;
        } else {
            C23713g.C23758p pVar3 = sVar.f68114q;
            float f3 = 1.2f;
            float c = pVar3 != null ? pVar3.mo37286c(this, 1.0f) : 1.2f;
            C23713g.C23758p pVar4 = sVar.f68115r;
            if (pVar4 != null) {
                f3 = pVar4.mo37286c(this, 1.0f);
            }
            f2 = c * bVar.f67943c;
            f = f3 * bVar.f67944d;
        }
        if (f2 != 0.0f && f != 0.0f) {
            mo37317P();
            C23788h s = mo37340s(sVar);
            this.f68142c = s;
            s.f68172a.f67998s = Float.valueOf(1.0f);
            boolean F = mo37307F();
            this.f68140a.save();
            Boolean bool2 = sVar.f68113p;
            if (bool2 != null && !bool2.booleanValue()) {
                z = false;
            }
            if (!z) {
                this.f68140a.translate(bVar.f67941a, bVar.f67942b);
                this.f68140a.scale(bVar.f67943c, bVar.f67944d);
            }
            mo37310I(sVar, false);
            this.f68140a.restore();
            if (F) {
                mo37306E(k0Var, bVar);
            }
            mo37316O();
        }
    }

    /* renamed from: M */
    public final void mo37314M(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C23713g.C23720c cVar = this.f68142c.f68172a.f67969C;
        if (cVar != null) {
            f += cVar.f67954d.mo37287d(this);
            f2 += this.f68142c.f68172a.f67969C.f67951a.mo37288e(this);
            f5 -= this.f68142c.f68172a.f67969C.f67952b.mo37287d(this);
            f6 -= this.f68142c.f68172a.f67969C.f67953c.mo37288e(this);
        }
        this.f68140a.clipRect(f, f2, f5, f6);
    }

    /* renamed from: N */
    public final void mo37315N(C23788h hVar, boolean z, C23713g.C23757o0 o0Var) {
        int i;
        C23713g.C23727e0 e0Var = hVar.f68172a;
        float floatValue = (z ? e0Var.f67989g : e0Var.f67991i).floatValue();
        if (o0Var instanceof C23713g.C23737f) {
            i = ((C23713g.C23737f) o0Var).f68044d;
        } else if (o0Var instanceof C23713g.C23740g) {
            i = hVar.f68172a.f67999t.f68044d;
        } else {
            return;
        }
        int i2 = m28477i(i, floatValue);
        if (z) {
            hVar.f68175d.setColor(i2);
        } else {
            hVar.f68176e.setColor(i2);
        }
    }

    /* renamed from: O */
    public final void mo37316O() {
        this.f68140a.restore();
        this.f68142c = this.f68143d.pop();
    }

    /* renamed from: P */
    public final void mo37317P() {
        this.f68140a.save();
        this.f68143d.push(this.f68142c);
        this.f68142c = new C23788h(this, this.f68142c);
    }

    /* renamed from: Q */
    public final String mo37318Q(String str, boolean z, boolean z2) {
        if (this.f68142c.f68179h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: R */
    public final void mo37319R(C23713g.C23749k0 k0Var) {
        if (k0Var.f68086b != null && k0Var.f68073h != null) {
            Matrix matrix = new Matrix();
            if (this.f68145f.peek().invert(matrix)) {
                C23713g.C23717b bVar = k0Var.f68073h;
                float f = bVar.f67941a;
                float f2 = bVar.f67942b;
                float f3 = bVar.f67943c + f;
                float f4 = f2 + bVar.f67944d;
                float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                matrix.preConcat(this.f68140a.getMatrix());
                matrix.mapPoints(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                RectF rectF = new RectF(f5, f6, f5, f6);
                for (int i = 2; i <= 6; i += 2) {
                    float f7 = fArr[i];
                    if (f7 < rectF.left) {
                        rectF.left = f7;
                    }
                    if (f7 > rectF.right) {
                        rectF.right = f7;
                    }
                    float f8 = fArr[i + 1];
                    if (f8 < rectF.top) {
                        rectF.top = f8;
                    }
                    if (f8 > rectF.bottom) {
                        rectF.bottom = f8;
                    }
                }
                C23713g.C23749k0 k0Var2 = (C23713g.C23749k0) this.f68144e.peek();
                C23713g.C23717b bVar2 = k0Var2.f68073h;
                if (bVar2 == null) {
                    float f9 = rectF.left;
                    float f15 = rectF.top;
                    k0Var2.f68073h = new C23713g.C23717b(f9, f15, rectF.right - f9, rectF.bottom - f15);
                    return;
                }
                float f16 = rectF.left;
                float f17 = rectF.top;
                float f18 = rectF.right - f16;
                float f19 = rectF.bottom - f17;
                if (f16 < bVar2.f67941a) {
                    bVar2.f67941a = f16;
                }
                if (f17 < bVar2.f67942b) {
                    bVar2.f67942b = f17;
                }
                float f25 = f16 + f18;
                float f26 = bVar2.f67941a;
                if (f25 > bVar2.f67943c + f26) {
                    bVar2.f67943c = f25 - f26;
                }
                float f27 = f17 + f19;
                float f28 = bVar2.f67942b;
                if (f27 > bVar2.f67944d + f28) {
                    bVar2.f67944d = f27 - f28;
                }
            }
        }
    }

    /* renamed from: S */
    public final void mo37320S(C23788h hVar, C23713g.C23727e0 e0Var) {
        if (mo37344w(e0Var, 4096)) {
            hVar.f68172a.f67999t = e0Var.f67999t;
        }
        if (mo37344w(e0Var, 2048)) {
            hVar.f68172a.f67998s = e0Var.f67998s;
        }
        boolean z = false;
        if (mo37344w(e0Var, 1)) {
            hVar.f68172a.f67987e = e0Var.f67987e;
            C23713g.C23757o0 o0Var = e0Var.f67987e;
            hVar.f68173b = (o0Var == null || o0Var == C23713g.C23737f.f68043f) ? false : true;
        }
        if (mo37344w(e0Var, 4)) {
            hVar.f68172a.f67989g = e0Var.f67989g;
        }
        if (mo37344w(e0Var, 6149)) {
            mo37315N(hVar, true, hVar.f68172a.f67987e);
        }
        if (mo37344w(e0Var, 2)) {
            hVar.f68172a.f67988f = e0Var.f67988f;
        }
        if (mo37344w(e0Var, 8)) {
            hVar.f68172a.f67990h = e0Var.f67990h;
            C23713g.C23757o0 o0Var2 = e0Var.f67990h;
            hVar.f68174c = (o0Var2 == null || o0Var2 == C23713g.C23737f.f68043f) ? false : true;
        }
        if (mo37344w(e0Var, 16)) {
            hVar.f68172a.f67991i = e0Var.f67991i;
        }
        if (mo37344w(e0Var, 6168)) {
            mo37315N(hVar, false, hVar.f68172a.f67990h);
        }
        if (mo37344w(e0Var, 34359738368L)) {
            hVar.f68172a.f67984S = e0Var.f67984S;
        }
        if (mo37344w(e0Var, 32)) {
            C23713g.C23727e0 e0Var2 = hVar.f68172a;
            C23713g.C23758p pVar = e0Var.f67992j;
            e0Var2.f67992j = pVar;
            hVar.f68176e.setStrokeWidth(pVar.mo37285b(this));
        }
        if (mo37344w(e0Var, 64)) {
            hVar.f68172a.f67993n = e0Var.f67993n;
            int ordinal = e0Var.f67993n.ordinal();
            if (ordinal == 0) {
                hVar.f68176e.setStrokeCap(Paint.Cap.BUTT);
            } else if (ordinal == 1) {
                hVar.f68176e.setStrokeCap(Paint.Cap.ROUND);
            } else if (ordinal == 2) {
                hVar.f68176e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (mo37344w(e0Var, 128)) {
            hVar.f68172a.f67994o = e0Var.f67994o;
            int ordinal2 = e0Var.f67994o.ordinal();
            if (ordinal2 == 0) {
                hVar.f68176e.setStrokeJoin(Paint.Join.MITER);
            } else if (ordinal2 == 1) {
                hVar.f68176e.setStrokeJoin(Paint.Join.ROUND);
            } else if (ordinal2 == 2) {
                hVar.f68176e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (mo37344w(e0Var, 256)) {
            hVar.f68172a.f67995p = e0Var.f67995p;
            hVar.f68176e.setStrokeMiter(e0Var.f67995p.floatValue());
        }
        if (mo37344w(e0Var, 512)) {
            hVar.f68172a.f67996q = e0Var.f67996q;
        }
        if (mo37344w(e0Var, 1024)) {
            hVar.f68172a.f67997r = e0Var.f67997r;
        }
        Typeface typeface = null;
        if (mo37344w(e0Var, 1536)) {
            C23713g.C23758p[] pVarArr = hVar.f68172a.f67996q;
            if (pVarArr == null) {
                hVar.f68176e.setPathEffect((PathEffect) null);
            } else {
                int length = pVarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float b = hVar.f68172a.f67996q[i2 % length].mo37285b(this);
                    fArr[i2] = b;
                    f += b;
                }
                if (f == 0.0f) {
                    hVar.f68176e.setPathEffect((PathEffect) null);
                } else {
                    float b2 = hVar.f68172a.f67997r.mo37285b(this);
                    if (b2 < 0.0f) {
                        b2 = (b2 % f) + f;
                    }
                    hVar.f68176e.setPathEffect(new DashPathEffect(fArr, b2));
                }
            }
        }
        if (mo37344w(e0Var, 16384)) {
            float textSize = this.f68142c.f68175d.getTextSize();
            hVar.f68172a.f68001v = e0Var.f68001v;
            hVar.f68175d.setTextSize(e0Var.f68001v.mo37286c(this, textSize));
            hVar.f68176e.setTextSize(e0Var.f68001v.mo37286c(this, textSize));
        }
        if (mo37344w(e0Var, 8192)) {
            hVar.f68172a.f68000u = e0Var.f68000u;
        }
        if (mo37344w(e0Var, 32768)) {
            if (e0Var.f68002w.intValue() == -1 && hVar.f68172a.f68002w.intValue() > 100) {
                C23713g.C23727e0 e0Var3 = hVar.f68172a;
                e0Var3.f68002w = Integer.valueOf(e0Var3.f68002w.intValue() - 100);
            } else if (e0Var.f68002w.intValue() != 1 || hVar.f68172a.f68002w.intValue() >= 900) {
                hVar.f68172a.f68002w = e0Var.f68002w;
            } else {
                C23713g.C23727e0 e0Var4 = hVar.f68172a;
                e0Var4.f68002w = Integer.valueOf(e0Var4.f68002w.intValue() + 100);
            }
        }
        if (mo37344w(e0Var, 65536)) {
            hVar.f68172a.f68003x = e0Var.f68003x;
        }
        if (mo37344w(e0Var, 106496)) {
            List<String> list = hVar.f68172a.f68000u;
            if (list != null && this.f68141b != null) {
                for (String h : list) {
                    C23713g.C23727e0 e0Var5 = hVar.f68172a;
                    typeface = mo37330h(h, e0Var5.f68002w, e0Var5.f68003x);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                C23713g.C23727e0 e0Var6 = hVar.f68172a;
                typeface = mo37330h("serif", e0Var6.f68002w, e0Var6.f68003x);
            }
            hVar.f68175d.setTypeface(typeface);
            hVar.f68176e.setTypeface(typeface);
        }
        if (mo37344w(e0Var, 131072)) {
            hVar.f68172a.f68004y = e0Var.f68004y;
            Paint paint = hVar.f68175d;
            C23713g.C23727e0.C23730g gVar = e0Var.f68004y;
            C23713g.C23727e0.C23730g gVar2 = C23713g.C23727e0.C23730g.LineThrough;
            paint.setStrikeThruText(gVar == gVar2);
            Paint paint2 = hVar.f68175d;
            C23713g.C23727e0.C23730g gVar3 = e0Var.f68004y;
            C23713g.C23727e0.C23730g gVar4 = C23713g.C23727e0.C23730g.Underline;
            paint2.setUnderlineText(gVar3 == gVar4);
            hVar.f68176e.setStrikeThruText(e0Var.f68004y == gVar2);
            Paint paint3 = hVar.f68176e;
            if (e0Var.f68004y == gVar4) {
                z = true;
            }
            paint3.setUnderlineText(z);
        }
        if (mo37344w(e0Var, 68719476736L)) {
            hVar.f68172a.f68005z = e0Var.f68005z;
        }
        if (mo37344w(e0Var, 262144)) {
            hVar.f68172a.f67967A = e0Var.f67967A;
        }
        if (mo37344w(e0Var, 524288)) {
            hVar.f68172a.f67968B = e0Var.f67968B;
        }
        if (mo37344w(e0Var, 2097152)) {
            hVar.f68172a.f67970D = e0Var.f67970D;
        }
        if (mo37344w(e0Var, 4194304)) {
            hVar.f68172a.f67971E = e0Var.f67971E;
        }
        if (mo37344w(e0Var, 8388608)) {
            hVar.f68172a.f67972F = e0Var.f67972F;
        }
        if (mo37344w(e0Var, 16777216)) {
            hVar.f68172a.f67973G = e0Var.f67973G;
        }
        if (mo37344w(e0Var, 33554432)) {
            hVar.f68172a.f67974H = e0Var.f67974H;
        }
        if (mo37344w(e0Var, 1048576)) {
            hVar.f68172a.f67969C = e0Var.f67969C;
        }
        if (mo37344w(e0Var, 268435456)) {
            hVar.f68172a.f67977K = e0Var.f67977K;
        }
        if (mo37344w(e0Var, 536870912)) {
            hVar.f68172a.f67978L = e0Var.f67978L;
        }
        if (mo37344w(e0Var, 1073741824)) {
            hVar.f68172a.f67979M = e0Var.f67979M;
        }
        if (mo37344w(e0Var, 67108864)) {
            hVar.f68172a.f67975I = e0Var.f67975I;
        }
        if (mo37344w(e0Var, 134217728)) {
            hVar.f68172a.f67976J = e0Var.f67976J;
        }
        if (mo37344w(e0Var, 8589934592L)) {
            hVar.f68172a.f67982Q = e0Var.f67982Q;
        }
        if (mo37344w(e0Var, 17179869184L)) {
            hVar.f68172a.f67983R = e0Var.f67983R;
        }
        if (mo37344w(e0Var, 137438953472L)) {
            hVar.f68172a.f67985T = e0Var.f67985T;
        }
    }

    /* renamed from: T */
    public final void mo37321T(C23788h hVar, C23713g.C23751l0 l0Var) {
        boolean z = false;
        boolean z2 = l0Var.f68086b == null;
        C23713g.C23727e0 e0Var = hVar.f68172a;
        Boolean bool = Boolean.TRUE;
        e0Var.f67973G = bool;
        if (!z2) {
            bool = Boolean.FALSE;
        }
        e0Var.f67968B = bool;
        e0Var.f67969C = null;
        e0Var.f67977K = null;
        e0Var.f67998s = Float.valueOf(1.0f);
        e0Var.f67975I = C23713g.C23737f.f68042e;
        e0Var.f67976J = Float.valueOf(1.0f);
        e0Var.f67979M = null;
        e0Var.f67980N = null;
        e0Var.f67981P = Float.valueOf(1.0f);
        e0Var.f67982Q = null;
        e0Var.f67983R = Float.valueOf(1.0f);
        e0Var.f67984S = C23713g.C23727e0.C23735i.None;
        C23713g.C23727e0 e0Var2 = l0Var.f68077e;
        if (e0Var2 != null) {
            mo37320S(hVar, e0Var2);
        }
        List<C23690b.C16851p> list = this.f68141b.f67935b.f45541a;
        if (list == null || ((ArrayList) list).isEmpty()) {
            z = true;
        }
        if (!z) {
            Iterator it = ((ArrayList) this.f68141b.f67935b.f45541a).iterator();
            while (it.hasNext()) {
                C23690b.C16851p pVar = (C23690b.C16851p) it.next();
                if (C23690b.m28347g((C23690b.C23705q) null, pVar.f45538a, l0Var)) {
                    mo37320S(hVar, pVar.f45539b);
                }
            }
        }
        C23713g.C23727e0 e0Var3 = l0Var.f68078f;
        if (e0Var3 != null) {
            mo37320S(hVar, e0Var3);
        }
    }

    /* renamed from: U */
    public final void mo37322U() {
        int i;
        C23713g.C23727e0 e0Var = this.f68142c.f68172a;
        C23713g.C23757o0 o0Var = e0Var.f67982Q;
        if (o0Var instanceof C23713g.C23737f) {
            i = ((C23713g.C23737f) o0Var).f68044d;
        } else if (o0Var instanceof C23713g.C23740g) {
            i = e0Var.f67999t.f68044d;
        } else {
            return;
        }
        Float f = e0Var.f67983R;
        if (f != null) {
            i = m28477i(i, f.floatValue());
        }
        this.f68140a.drawColor(i);
    }

    /* renamed from: V */
    public final boolean mo37323V() {
        Boolean bool = this.f68142c.f68172a.f67974H;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: b */
    public final Path mo37324b(C23713g.C23749k0 k0Var, C23713g.C23717b bVar) {
        Path C;
        C23713g.C23755n0 f = k0Var.f68085a.mo37263f(this.f68142c.f68172a.f67977K);
        boolean z = false;
        if (f == null) {
            String.format("ClipPath reference '%s' not found", new Object[]{this.f68142c.f68172a.f67977K});
            return null;
        }
        C23713g.C23726e eVar = (C23713g.C23726e) f;
        this.f68143d.push(this.f68142c);
        this.f68142c = mo37340s(eVar);
        Boolean bool = eVar.f67966p;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(bVar.f67941a, bVar.f67942b);
            matrix.preScale(bVar.f67943c, bVar.f67944d);
        }
        Matrix matrix2 = eVar.f68080o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C23713g.C23755n0 next : eVar.f68050i) {
            if ((next instanceof C23713g.C23749k0) && (C = mo37304C((C23713g.C23749k0) next, true)) != null) {
                path.op(C, Path.Op.UNION);
            }
        }
        if (this.f68142c.f68172a.f67977K != null) {
            if (eVar.f68073h == null) {
                eVar.f68073h = mo37325c(path);
            }
            Path b = mo37324b(eVar, eVar.f68073h);
            if (b != null) {
                path.op(b, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f68142c = this.f68143d.pop();
        return path;
    }

    /* renamed from: c */
    public final C23713g.C23717b mo37325c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C23713g.C23717b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: d */
    public final float mo37326d(C23713g.C23777y0 y0Var) {
        C23791k kVar = new C23791k((C23781a) null);
        mo37335n(y0Var, kVar);
        return kVar.f68184a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r6 != 9) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r4 = r4 - r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[PHI: r4 
      PHI: (r4v2 float) = (r4v1 float), (r4v3 float) binds: [B:28:0x0074, B:31:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix mo37327e(p298c6.C23713g.C23717b r10, p298c6.C23713g.C23717b r11, p298c6.C23709e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L_0x008e
            c6.e$a r1 = r12.f67913a
            if (r1 != 0) goto L_0x000d
            goto L_0x008e
        L_0x000d:
            float r1 = r10.f67943c
            float r2 = r11.f67943c
            float r1 = r1 / r2
            float r2 = r10.f67944d
            float r3 = r11.f67944d
            float r2 = r2 / r3
            float r3 = r11.f67941a
            float r3 = -r3
            float r4 = r11.f67942b
            float r4 = -r4
            c6.e r5 = p298c6.C23709e.f67911c
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0033
            float r11 = r10.f67941a
            float r10 = r10.f67942b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L_0x0033:
            c6.e$b r5 = r12.f67914b
            c6.e$b r6 = p298c6.C23709e.C23711b.slice
            if (r5 != r6) goto L_0x003e
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0042
        L_0x003e:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0042:
            float r2 = r10.f67943c
            float r2 = r2 / r1
            float r5 = r10.f67944d
            float r5 = r5 / r1
            c6.e$a r6 = r12.f67913a
            int r6 = r6.ordinal()
            r7 = 2
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L_0x0069
            r7 = 3
            if (r6 == r7) goto L_0x0065
            r7 = 5
            if (r6 == r7) goto L_0x0069
            r7 = 6
            if (r6 == r7) goto L_0x0065
            r7 = 8
            if (r6 == r7) goto L_0x0069
            r7 = 9
            if (r6 == r7) goto L_0x0065
            goto L_0x006e
        L_0x0065:
            float r6 = r11.f67943c
            float r6 = r6 - r2
            goto L_0x006d
        L_0x0069:
            float r6 = r11.f67943c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L_0x006d:
            float r3 = r3 - r6
        L_0x006e:
            c6.e$a r12 = r12.f67913a
            int r12 = r12.ordinal()
            switch(r12) {
                case 4: goto L_0x007c;
                case 5: goto L_0x007c;
                case 6: goto L_0x007c;
                case 7: goto L_0x0078;
                case 8: goto L_0x0078;
                case 9: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x0081
        L_0x0078:
            float r11 = r11.f67944d
            float r11 = r11 - r5
            goto L_0x0080
        L_0x007c:
            float r11 = r11.f67944d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L_0x0080:
            float r4 = r4 - r11
        L_0x0081:
            float r11 = r10.f67941a
            float r10 = r10.f67942b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23780h.mo37327e(c6.g$b, c6.g$b, c6.e):android.graphics.Matrix");
    }

    /* renamed from: f */
    public final void mo37328f(C23713g.C23749k0 k0Var, C23713g.C23717b bVar) {
        Path b;
        if (this.f68142c.f68172a.f67977K != null && (b = mo37324b(k0Var, bVar)) != null) {
            this.f68140a.clipPath(b);
        }
    }

    /* renamed from: g */
    public final void mo37329g(C23713g.C23749k0 k0Var) {
        C23713g.C23757o0 o0Var = this.f68142c.f68172a.f67987e;
        if (o0Var instanceof C23713g.C23768u) {
            mo37331j(true, k0Var.f68073h, (C23713g.C23768u) o0Var);
        }
        C23713g.C23757o0 o0Var2 = this.f68142c.f68172a.f67990h;
        if (o0Var2 instanceof C23713g.C23768u) {
            mo37331j(false, k0Var.f68073h, (C23713g.C23768u) o0Var2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r6.equals("monospace") == false) goto L_0x0029;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo37330h(java.lang.String r6, java.lang.Integer r7, p298c6.C23713g.C23727e0.C16855b r8) {
        /*
            r5 = this;
            c6.g$e0$b r0 = p298c6.C23713g.C23727e0.C16855b.Italic
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L_0x0008
            r8 = 1
            goto L_0x0009
        L_0x0008:
            r8 = 0
        L_0x0009:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r7 <= r0) goto L_0x0019
            if (r8 == 0) goto L_0x0017
            r7 = 3
            goto L_0x001e
        L_0x0017:
            r7 = 1
            goto L_0x001e
        L_0x0019:
            if (r8 == 0) goto L_0x001d
            r7 = 2
            goto L_0x001e
        L_0x001d:
            r7 = 0
        L_0x001e:
            r6.getClass()
            r8 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0055;
                case -1431958525: goto L_0x004c;
                case -1081737434: goto L_0x0041;
                case 109326717: goto L_0x0036;
                case 1126973893: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = -1
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r1 = 3
            goto L_0x005f
        L_0x0041:
            java.lang.String r0 = "fantasy"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r1 = 2
            goto L_0x005f
        L_0x004c:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005f
            goto L_0x0029
        L_0x0055:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r1 = 0
        L_0x005f:
            switch(r1) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0079;
                case 2: goto L_0x0072;
                case 3: goto L_0x006b;
                case 4: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6 = 0
            goto L_0x0086
        L_0x0064:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x006b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0072:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0079:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0080:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
        L_0x0086:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p298c6.C23780h.mo37330h(java.lang.String, java.lang.Integer, c6.g$e0$b):android.graphics.Typeface");
    }

    /* renamed from: j */
    public final void mo37331j(boolean z, C23713g.C23717b bVar, C23713g.C23768u uVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z2 = z;
        C23713g.C23717b bVar2 = bVar;
        C23713g.C23768u uVar2 = uVar;
        C23713g.C23748k kVar = C23713g.C23748k.repeat;
        C23713g.C23748k kVar2 = C23713g.C23748k.reflect;
        C23713g.C23755n0 f8 = this.f68141b.mo37263f(uVar2.f68116d);
        boolean z3 = true;
        if (f8 == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z2 ? "Fill" : "Stroke";
            objArr[1] = uVar2.f68116d;
            String.format("%s reference '%s' not found", objArr);
            C23713g.C23757o0 o0Var = uVar2.f68117e;
            if (o0Var != null) {
                mo37315N(this.f68142c, z2, o0Var);
            } else if (z2) {
                this.f68142c.f68173b = false;
            } else {
                this.f68142c.f68174c = false;
            }
        } else if (f8 instanceof C23713g.C23753m0) {
            C23713g.C23753m0 m0Var = (C23713g.C23753m0) f8;
            String str = m0Var.f68069l;
            if (str != null) {
                mo37337p(m0Var, str);
            }
            Boolean bool = m0Var.f68066i;
            boolean z4 = bool != null && bool.booleanValue();
            C23788h hVar = this.f68142c;
            Paint paint = z2 ? hVar.f68175d : hVar.f68176e;
            if (z4) {
                C23713g.C23717b bVar3 = hVar.f68178g;
                if (bVar3 == null) {
                    bVar3 = hVar.f68177f;
                }
                C23713g.C23758p pVar = m0Var.f68081m;
                f7 = pVar != null ? pVar.mo37287d(this) : 0.0f;
                C23713g.C23758p pVar2 = m0Var.f68082n;
                float e = pVar2 != null ? pVar2.mo37288e(this) : 0.0f;
                C23713g.C23758p pVar3 = m0Var.f68083o;
                float d = pVar3 != null ? pVar3.mo37287d(this) : bVar3.f67943c;
                C23713g.C23758p pVar4 = m0Var.f68084p;
                f6 = e;
                f5 = d;
                f4 = pVar4 != null ? pVar4.mo37288e(this) : 0.0f;
            } else {
                C23713g.C23758p pVar5 = m0Var.f68081m;
                f7 = pVar5 != null ? pVar5.mo37286c(this, 1.0f) : 0.0f;
                C23713g.C23758p pVar6 = m0Var.f68082n;
                float c = pVar6 != null ? pVar6.mo37286c(this, 1.0f) : 0.0f;
                C23713g.C23758p pVar7 = m0Var.f68083o;
                float c2 = pVar7 != null ? pVar7.mo37286c(this, 1.0f) : 1.0f;
                C23713g.C23758p pVar8 = m0Var.f68084p;
                f6 = c;
                f4 = pVar8 != null ? pVar8.mo37286c(this, 1.0f) : 0.0f;
                f5 = c2;
            }
            float f9 = f7;
            mo37317P();
            this.f68142c = mo37340s(m0Var);
            Matrix matrix = new Matrix();
            if (!z4) {
                matrix.preTranslate(bVar2.f67941a, bVar2.f67942b);
                matrix.preScale(bVar2.f67943c, bVar2.f67944d);
            }
            Matrix matrix2 = m0Var.f68067j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = m0Var.f68065h.size();
            if (size == 0) {
                mo37316O();
                if (z2) {
                    this.f68142c.f68173b = false;
                } else {
                    this.f68142c.f68174c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                Iterator<C23713g.C23755n0> it = m0Var.f68065h.iterator();
                float f15 = -1.0f;
                int i = 0;
                while (it.hasNext()) {
                    C23713g.C23724d0 d0Var = (C23713g.C23724d0) it.next();
                    Float f16 = d0Var.f67959h;
                    float floatValue = f16 != null ? f16.floatValue() : 0.0f;
                    if (i == 0 || floatValue >= f15) {
                        fArr[i] = floatValue;
                        f15 = floatValue;
                    } else {
                        fArr[i] = f15;
                    }
                    mo37317P();
                    mo37321T(this.f68142c, d0Var);
                    C23713g.C23727e0 e0Var = this.f68142c.f68172a;
                    C23713g.C23737f fVar = (C23713g.C23737f) e0Var.f67975I;
                    if (fVar == null) {
                        fVar = C23713g.C23737f.f68042e;
                    }
                    iArr[i] = m28477i(fVar.f68044d, e0Var.f67976J.floatValue());
                    i++;
                    mo37316O();
                }
                if ((f9 == f5 && f6 == f4) || size == 1) {
                    mo37316O();
                    paint.setColor(iArr[size - 1]);
                    return;
                }
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                C23713g.C23748k kVar3 = m0Var.f68068k;
                if (kVar3 != null) {
                    if (kVar3 == kVar2) {
                        tileMode = Shader.TileMode.MIRROR;
                    } else if (kVar3 == kVar) {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                }
                mo37316O();
                LinearGradient linearGradient = new LinearGradient(f9, f6, f5, f4, iArr, fArr, tileMode);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                int floatValue2 = (int) (this.f68142c.f68172a.f67989g.floatValue() * 256.0f);
                paint.setAlpha(floatValue2 < 0 ? 0 : floatValue2 > 255 ? 255 : floatValue2);
            }
        } else if (f8 instanceof C23713g.C23761q0) {
            C23713g.C23761q0 q0Var = (C23713g.C23761q0) f8;
            String str2 = q0Var.f68069l;
            if (str2 != null) {
                mo37337p(q0Var, str2);
            }
            Boolean bool2 = q0Var.f68066i;
            boolean z5 = bool2 != null && bool2.booleanValue();
            C23788h hVar2 = this.f68142c;
            Paint paint2 = z2 ? hVar2.f68175d : hVar2.f68176e;
            if (z5) {
                C23713g.C23758p pVar9 = new C23713g.C23758p(50.0f, C23713g.C23725d1.percent);
                C23713g.C23758p pVar10 = q0Var.f68100m;
                float d2 = pVar10 != null ? pVar10.mo37287d(this) : pVar9.mo37287d(this);
                C23713g.C23758p pVar11 = q0Var.f68101n;
                float e2 = pVar11 != null ? pVar11.mo37288e(this) : pVar9.mo37288e(this);
                C23713g.C23758p pVar12 = q0Var.f68102o;
                f = pVar12 != null ? pVar12.mo37285b(this) : pVar9.mo37285b(this);
                f3 = d2;
                f2 = e2;
            } else {
                C23713g.C23758p pVar13 = q0Var.f68100m;
                float f17 = 0.5f;
                float c3 = pVar13 != null ? pVar13.mo37286c(this, 1.0f) : 0.5f;
                C23713g.C23758p pVar14 = q0Var.f68101n;
                float c4 = pVar14 != null ? pVar14.mo37286c(this, 1.0f) : 0.5f;
                C23713g.C23758p pVar15 = q0Var.f68102o;
                if (pVar15 != null) {
                    f17 = pVar15.mo37286c(this, 1.0f);
                }
                f3 = c3;
                f = f17;
                f2 = c4;
            }
            mo37317P();
            this.f68142c = mo37340s(q0Var);
            Matrix matrix3 = new Matrix();
            if (!z5) {
                matrix3.preTranslate(bVar2.f67941a, bVar2.f67942b);
                matrix3.preScale(bVar2.f67943c, bVar2.f67944d);
            }
            Matrix matrix4 = q0Var.f68067j;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = q0Var.f68065h.size();
            if (size2 == 0) {
                mo37316O();
                if (z2) {
                    this.f68142c.f68173b = false;
                } else {
                    this.f68142c.f68174c = false;
                }
            } else {
                int[] iArr2 = new int[size2];
                float[] fArr2 = new float[size2];
                Iterator<C23713g.C23755n0> it4 = q0Var.f68065h.iterator();
                float f18 = -1.0f;
                int i2 = 0;
                while (it4.hasNext()) {
                    C23713g.C23724d0 d0Var2 = (C23713g.C23724d0) it4.next();
                    Float f19 = d0Var2.f67959h;
                    float floatValue3 = f19 != null ? f19.floatValue() : 0.0f;
                    if (i2 == 0 || floatValue3 >= f18) {
                        fArr2[i2] = floatValue3;
                        f18 = floatValue3;
                    } else {
                        fArr2[i2] = f18;
                    }
                    mo37317P();
                    mo37321T(this.f68142c, d0Var2);
                    C23713g.C23727e0 e0Var2 = this.f68142c.f68172a;
                    C23713g.C23737f fVar2 = (C23713g.C23737f) e0Var2.f67975I;
                    if (fVar2 == null) {
                        fVar2 = C23713g.C23737f.f68042e;
                    }
                    iArr2[i2] = m28477i(fVar2.f68044d, e0Var2.f67976J.floatValue());
                    i2++;
                    mo37316O();
                }
                if (f == 0.0f || size2 == 1) {
                    mo37316O();
                    paint2.setColor(iArr2[size2 - 1]);
                    return;
                }
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                C23713g.C23748k kVar4 = q0Var.f68068k;
                if (kVar4 != null) {
                    if (kVar4 == kVar2) {
                        tileMode2 = Shader.TileMode.MIRROR;
                    } else if (kVar4 == kVar) {
                        tileMode2 = Shader.TileMode.REPEAT;
                    }
                }
                mo37316O();
                RadialGradient radialGradient = new RadialGradient(f3, f2, f, iArr2, fArr2, tileMode2);
                radialGradient.setLocalMatrix(matrix3);
                paint2.setShader(radialGradient);
                int floatValue4 = (int) (this.f68142c.f68172a.f67989g.floatValue() * 256.0f);
                if (floatValue4 < 0) {
                    floatValue4 = 0;
                } else if (floatValue4 > 255) {
                    floatValue4 = 255;
                }
                paint2.setAlpha(floatValue4);
            }
        } else if (f8 instanceof C23713g.C23721c0) {
            C23713g.C23721c0 c0Var = (C23713g.C23721c0) f8;
            if (z2) {
                if (mo37344w(c0Var.f68077e, 2147483648L)) {
                    C23788h hVar3 = this.f68142c;
                    C23713g.C23727e0 e0Var3 = hVar3.f68172a;
                    C23713g.C23757o0 o0Var2 = c0Var.f68077e.f67980N;
                    e0Var3.f67987e = o0Var2;
                    if (o0Var2 == null) {
                        z3 = false;
                    }
                    hVar3.f68173b = z3;
                }
                if (mo37344w(c0Var.f68077e, 4294967296L)) {
                    this.f68142c.f68172a.f67989g = c0Var.f68077e.f67981P;
                }
                if (mo37344w(c0Var.f68077e, 6442450944L)) {
                    C23788h hVar4 = this.f68142c;
                    mo37315N(hVar4, z2, hVar4.f68172a.f67987e);
                    return;
                }
                return;
            }
            if (mo37344w(c0Var.f68077e, 2147483648L)) {
                C23788h hVar5 = this.f68142c;
                C23713g.C23727e0 e0Var4 = hVar5.f68172a;
                C23713g.C23757o0 o0Var3 = c0Var.f68077e.f67980N;
                e0Var4.f67990h = o0Var3;
                if (o0Var3 == null) {
                    z3 = false;
                }
                hVar5.f68174c = z3;
            }
            if (mo37344w(c0Var.f68077e, 4294967296L)) {
                this.f68142c.f68172a.f67991i = c0Var.f68077e.f67981P;
            }
            if (mo37344w(c0Var.f68077e, 6442450944L)) {
                C23788h hVar6 = this.f68142c;
                mo37315N(hVar6, z2, hVar6.f68172a.f67990h);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo37332k() {
        Boolean bool = this.f68142c.f68172a.f67973G;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: l */
    public final void mo37333l(C23713g.C23749k0 k0Var, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C23713g.C23749k0 k0Var2 = k0Var;
        Path path2 = path;
        C23713g.C23757o0 o0Var = this.f68142c.f68172a.f67987e;
        if (o0Var instanceof C23713g.C23768u) {
            C23713g.C23755n0 f6 = this.f68141b.mo37263f(((C23713g.C23768u) o0Var).f68116d);
            if (f6 instanceof C23713g.C23776y) {
                C23713g.C23776y yVar = (C23713g.C23776y) f6;
                Boolean bool = yVar.f68127q;
                boolean z = bool != null && bool.booleanValue();
                String str = yVar.f68134x;
                if (str != null) {
                    mo37339r(yVar, str);
                }
                if (z) {
                    C23713g.C23758p pVar = yVar.f68130t;
                    f4 = pVar != null ? pVar.mo37287d(this) : 0.0f;
                    C23713g.C23758p pVar2 = yVar.f68131u;
                    f3 = pVar2 != null ? pVar2.mo37288e(this) : 0.0f;
                    C23713g.C23758p pVar3 = yVar.f68132v;
                    f2 = pVar3 != null ? pVar3.mo37287d(this) : 0.0f;
                    C23713g.C23758p pVar4 = yVar.f68133w;
                    f = pVar4 != null ? pVar4.mo37288e(this) : 0.0f;
                } else {
                    C23713g.C23758p pVar5 = yVar.f68130t;
                    float c = pVar5 != null ? pVar5.mo37286c(this, 1.0f) : 0.0f;
                    C23713g.C23758p pVar6 = yVar.f68131u;
                    float c2 = pVar6 != null ? pVar6.mo37286c(this, 1.0f) : 0.0f;
                    C23713g.C23758p pVar7 = yVar.f68132v;
                    float c3 = pVar7 != null ? pVar7.mo37286c(this, 1.0f) : 0.0f;
                    C23713g.C23758p pVar8 = yVar.f68133w;
                    float c4 = pVar8 != null ? pVar8.mo37286c(this, 1.0f) : 0.0f;
                    C23713g.C23717b bVar = k0Var2.f68073h;
                    float f7 = bVar.f67941a;
                    float f8 = bVar.f67943c;
                    f4 = (c * f8) + f7;
                    float f9 = bVar.f67942b;
                    float f15 = bVar.f67944d;
                    float f16 = c3 * f8;
                    f = c4 * f15;
                    f3 = (c2 * f15) + f9;
                    f2 = f16;
                }
                if (f2 != 0.0f && f != 0.0f) {
                    C23709e eVar = yVar.f68095o;
                    if (eVar == null) {
                        eVar = C23709e.f67912d;
                    }
                    mo37317P();
                    this.f68140a.clipPath(path2);
                    C23788h hVar = new C23788h(this);
                    mo37320S(hVar, C23713g.C23727e0.m28387a());
                    hVar.f68172a.f67968B = Boolean.FALSE;
                    mo37341t(yVar, hVar);
                    this.f68142c = hVar;
                    C23713g.C23717b bVar2 = k0Var2.f68073h;
                    Matrix matrix = yVar.f68129s;
                    if (matrix != null) {
                        this.f68140a.concat(matrix);
                        Matrix matrix2 = new Matrix();
                        if (yVar.f68129s.invert(matrix2)) {
                            C23713g.C23717b bVar3 = k0Var2.f68073h;
                            float f17 = bVar3.f67941a;
                            float f18 = bVar3.f67942b;
                            float f19 = bVar3.f67943c + f17;
                            float f25 = f18 + bVar3.f67944d;
                            float[] fArr = {f17, f18, f19, f18, f19, f25, f17, f25};
                            matrix2.mapPoints(fArr);
                            float f26 = fArr[0];
                            float f27 = fArr[1];
                            RectF rectF = new RectF(f26, f27, f26, f27);
                            for (int i = 2; i <= 6; i += 2) {
                                float f28 = fArr[i];
                                if (f28 < rectF.left) {
                                    rectF.left = f28;
                                }
                                if (f28 > rectF.right) {
                                    rectF.right = f28;
                                }
                                float f29 = fArr[i + 1];
                                if (f29 < rectF.top) {
                                    rectF.top = f29;
                                }
                                if (f29 > rectF.bottom) {
                                    rectF.bottom = f29;
                                }
                            }
                            float f35 = rectF.left;
                            float f36 = rectF.top;
                            bVar2 = new C23713g.C23717b(f35, f36, rectF.right - f35, rectF.bottom - f36);
                        }
                    }
                    float floor = f4 + (((float) Math.floor((double) ((bVar2.f67941a - f4) / f2))) * f2);
                    float f37 = bVar2.f67941a + bVar2.f67943c;
                    float f38 = bVar2.f67942b + bVar2.f67944d;
                    C23713g.C23717b bVar4 = new C23713g.C23717b(0.0f, 0.0f, f2, f);
                    boolean F = mo37307F();
                    for (float floor2 = f3 + (((float) Math.floor((double) ((bVar2.f67942b - f3) / f))) * f); floor2 < f38; floor2 += f) {
                        float f39 = floor;
                        while (f39 < f37) {
                            bVar4.f67941a = f39;
                            bVar4.f67942b = floor2;
                            mo37317P();
                            if (!this.f68142c.f68172a.f67968B.booleanValue()) {
                                f5 = floor;
                                mo37314M(bVar4.f67941a, bVar4.f67942b, bVar4.f67943c, bVar4.f67944d);
                            } else {
                                f5 = floor;
                            }
                            C23713g.C23717b bVar5 = yVar.f68111p;
                            if (bVar5 != null) {
                                this.f68140a.concat(mo37327e(bVar4, bVar5, eVar));
                            } else {
                                Boolean bool2 = yVar.f68128r;
                                boolean z2 = bool2 == null || bool2.booleanValue();
                                this.f68140a.translate(f39, floor2);
                                if (!z2) {
                                    Canvas canvas = this.f68140a;
                                    C23713g.C23717b bVar6 = k0Var2.f68073h;
                                    canvas.scale(bVar6.f67943c, bVar6.f67944d);
                                }
                            }
                            for (C23713g.C23755n0 H : yVar.f68050i) {
                                mo37309H(H);
                            }
                            mo37316O();
                            f39 += f2;
                            floor = f5;
                        }
                        float f44 = floor;
                    }
                    if (F) {
                        mo37305D(yVar);
                    }
                    mo37316O();
                    return;
                }
                return;
            }
        }
        this.f68140a.drawPath(path2, this.f68142c.f68175d);
    }

    /* renamed from: m */
    public final void mo37334m(Path path) {
        C23788h hVar = this.f68142c;
        if (hVar.f68172a.f67984S == C23713g.C23727e0.C23735i.NonScalingStroke) {
            Matrix matrix = this.f68140a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f68140a.setMatrix(new Matrix());
            Shader shader = this.f68142c.f68176e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f68140a.drawPath(path2, this.f68142c.f68176e);
            this.f68140a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f68140a.drawPath(path, hVar.f68176e);
    }

    /* renamed from: n */
    public final void mo37335n(C23713g.C23777y0 y0Var, C23790j jVar) {
        float f;
        float f2;
        float f3;
        C23713g.C23727e0.C23729f u;
        if (mo37332k()) {
            Iterator<C23713g.C23755n0> it = y0Var.f68050i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C23713g.C23755n0 next = it.next();
                if (next instanceof C23713g.C23722c1) {
                    jVar.mo37351b(mo37318Q(((C23713g.C23722c1) next).f67955c, z, !it.hasNext()));
                } else {
                    C23713g.C23727e0.C23729f fVar = C23713g.C23727e0.C23729f.Middle;
                    C23713g.C23727e0.C23729f fVar2 = C23713g.C23727e0.C23729f.Start;
                    if (jVar.mo37352a((C23713g.C23777y0) next)) {
                        float f4 = 0.0f;
                        if (next instanceof C23713g.C23779z0) {
                            mo37317P();
                            C23713g.C23779z0 z0Var = (C23713g.C23779z0) next;
                            mo37321T(this.f68142c, z0Var);
                            if (mo37332k() && mo37323V()) {
                                C23713g.C23755n0 f5 = z0Var.f68085a.mo37263f(z0Var.f68136o);
                                if (f5 == null) {
                                    String.format("TextPath reference '%s' not found", new Object[]{z0Var.f68136o});
                                } else {
                                    C23713g.C23770v vVar = (C23713g.C23770v) f5;
                                    Path path = new C23784d(vVar.f68120o).f68160a;
                                    Matrix matrix = vVar.f68074n;
                                    if (matrix != null) {
                                        path.transform(matrix);
                                    }
                                    PathMeasure pathMeasure = new PathMeasure(path, false);
                                    C23713g.C23758p pVar = z0Var.f68137p;
                                    float c = pVar != null ? pVar.mo37286c(this, pathMeasure.getLength()) : 0.0f;
                                    C23713g.C23727e0.C23729f u2 = mo37342u();
                                    if (u2 != fVar2) {
                                        float d = mo37326d(z0Var);
                                        if (u2 == fVar) {
                                            d /= 2.0f;
                                        }
                                        c -= d;
                                    }
                                    mo37329g((C23713g.C23749k0) z0Var.f68138q);
                                    boolean F = mo37307F();
                                    mo37335n(z0Var, new C23785e(path, c, 0.0f));
                                    if (F) {
                                        mo37306E(z0Var, z0Var.f68073h);
                                    }
                                }
                            }
                            mo37316O();
                        } else if (next instanceof C23713g.C23771v0) {
                            mo37317P();
                            C23713g.C23771v0 v0Var = (C23713g.C23771v0) next;
                            mo37321T(this.f68142c, v0Var);
                            if (mo37332k()) {
                                List<C23713g.C23758p> list = v0Var.f67937o;
                                boolean z2 = list != null && ((ArrayList) list).size() > 0;
                                boolean z3 = jVar instanceof C23786f;
                                if (z3) {
                                    f3 = !z2 ? ((C23786f) jVar).f68165a : ((C23713g.C23758p) ((ArrayList) v0Var.f67937o).get(0)).mo37287d(this);
                                    List<C23713g.C23758p> list2 = v0Var.f67938p;
                                    f2 = (list2 == null || ((ArrayList) list2).size() == 0) ? ((C23786f) jVar).f68166b : ((C23713g.C23758p) ((ArrayList) v0Var.f67938p).get(0)).mo37288e(this);
                                    List<C23713g.C23758p> list3 = v0Var.f67939q;
                                    f = (list3 == null || ((ArrayList) list3).size() == 0) ? 0.0f : ((C23713g.C23758p) ((ArrayList) v0Var.f67939q).get(0)).mo37287d(this);
                                    List<C23713g.C23758p> list4 = v0Var.f67940r;
                                    if (!(list4 == null || ((ArrayList) list4).size() == 0)) {
                                        f4 = ((C23713g.C23758p) ((ArrayList) v0Var.f67940r).get(0)).mo37288e(this);
                                    }
                                } else {
                                    f3 = 0.0f;
                                    f2 = 0.0f;
                                    f = 0.0f;
                                }
                                if (z2 && (u = mo37342u()) != fVar2) {
                                    float d2 = mo37326d(v0Var);
                                    if (u == fVar) {
                                        d2 /= 2.0f;
                                    }
                                    f3 -= d2;
                                }
                                mo37329g((C23713g.C23749k0) v0Var.f68121s);
                                if (z3) {
                                    C23786f fVar3 = (C23786f) jVar;
                                    fVar3.f68165a = f3 + f;
                                    fVar3.f68166b = f2 + f4;
                                }
                                boolean F2 = mo37307F();
                                mo37335n(v0Var, jVar);
                                if (F2) {
                                    mo37306E(v0Var, v0Var.f68073h);
                                }
                            }
                            mo37316O();
                        } else if (next instanceof C23713g.C23769u0) {
                            mo37317P();
                            C23713g.C23769u0 u0Var = (C23713g.C23769u0) next;
                            mo37321T(this.f68142c, u0Var);
                            if (mo37332k()) {
                                mo37329g((C23713g.C23749k0) u0Var.f68119p);
                                C23713g.C23755n0 f6 = next.f68085a.mo37263f(u0Var.f68118o);
                                if (f6 == null || !(f6 instanceof C23713g.C23777y0)) {
                                    String.format("Tref reference '%s' not found", new Object[]{u0Var.f68118o});
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    mo37336o((C23713g.C23777y0) f6, sb);
                                    if (sb.length() > 0) {
                                        jVar.mo37351b(sb.toString());
                                    }
                                }
                            }
                            mo37316O();
                        }
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: o */
    public final void mo37336o(C23713g.C23777y0 y0Var, StringBuilder sb) {
        Iterator<C23713g.C23755n0> it = y0Var.f68050i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C23713g.C23755n0 next = it.next();
            if (next instanceof C23713g.C23777y0) {
                mo37336o((C23713g.C23777y0) next, sb);
            } else if (next instanceof C23713g.C23722c1) {
                sb.append(mo37318Q(((C23713g.C23722c1) next).f67955c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: p */
    public final void mo37337p(C23713g.C23746j jVar, String str) {
        C23713g.C23755n0 f = jVar.f68085a.mo37263f(str);
        if (f == null) {
            String.format("Gradient reference '%s' not found", new Object[]{str});
        } else if (!(f instanceof C23713g.C23746j)) {
            String.format("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (f == jVar) {
            String.format("Circular reference in gradient href attribute '%s'", new Object[]{str});
        } else {
            C23713g.C23746j jVar2 = (C23713g.C23746j) f;
            if (jVar.f68066i == null) {
                jVar.f68066i = jVar2.f68066i;
            }
            if (jVar.f68067j == null) {
                jVar.f68067j = jVar2.f68067j;
            }
            if (jVar.f68068k == null) {
                jVar.f68068k = jVar2.f68068k;
            }
            if (jVar.f68065h.isEmpty()) {
                jVar.f68065h = jVar2.f68065h;
            }
            try {
                if (jVar instanceof C23713g.C23753m0) {
                    C23713g.C23753m0 m0Var = (C23713g.C23753m0) jVar;
                    C23713g.C23753m0 m0Var2 = (C23713g.C23753m0) f;
                    if (m0Var.f68081m == null) {
                        m0Var.f68081m = m0Var2.f68081m;
                    }
                    if (m0Var.f68082n == null) {
                        m0Var.f68082n = m0Var2.f68082n;
                    }
                    if (m0Var.f68083o == null) {
                        m0Var.f68083o = m0Var2.f68083o;
                    }
                    if (m0Var.f68084p == null) {
                        m0Var.f68084p = m0Var2.f68084p;
                    }
                } else {
                    mo37338q((C23713g.C23761q0) jVar, (C23713g.C23761q0) f);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = jVar2.f68069l;
            if (str2 != null) {
                mo37337p(jVar, str2);
            }
        }
    }

    /* renamed from: q */
    public final void mo37338q(C23713g.C23761q0 q0Var, C23713g.C23761q0 q0Var2) {
        if (q0Var.f68100m == null) {
            q0Var.f68100m = q0Var2.f68100m;
        }
        if (q0Var.f68101n == null) {
            q0Var.f68101n = q0Var2.f68101n;
        }
        if (q0Var.f68102o == null) {
            q0Var.f68102o = q0Var2.f68102o;
        }
        if (q0Var.f68103p == null) {
            q0Var.f68103p = q0Var2.f68103p;
        }
        if (q0Var.f68104q == null) {
            q0Var.f68104q = q0Var2.f68104q;
        }
    }

    /* renamed from: r */
    public final void mo37339r(C23713g.C23776y yVar, String str) {
        C23713g.C23755n0 f = yVar.f68085a.mo37263f(str);
        if (f == null) {
            String.format("Pattern reference '%s' not found", new Object[]{str});
        } else if (!(f instanceof C23713g.C23776y)) {
            String.format("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (f == yVar) {
            String.format("Circular reference in pattern href attribute '%s'", new Object[]{str});
        } else {
            C23713g.C23776y yVar2 = (C23713g.C23776y) f;
            if (yVar.f68127q == null) {
                yVar.f68127q = yVar2.f68127q;
            }
            if (yVar.f68128r == null) {
                yVar.f68128r = yVar2.f68128r;
            }
            if (yVar.f68129s == null) {
                yVar.f68129s = yVar2.f68129s;
            }
            if (yVar.f68130t == null) {
                yVar.f68130t = yVar2.f68130t;
            }
            if (yVar.f68131u == null) {
                yVar.f68131u = yVar2.f68131u;
            }
            if (yVar.f68132v == null) {
                yVar.f68132v = yVar2.f68132v;
            }
            if (yVar.f68133w == null) {
                yVar.f68133w = yVar2.f68133w;
            }
            if (yVar.f68050i.isEmpty()) {
                yVar.f68050i = yVar2.f68050i;
            }
            if (yVar.f68111p == null) {
                yVar.f68111p = yVar2.f68111p;
            }
            if (yVar.f68095o == null) {
                yVar.f68095o = yVar2.f68095o;
            }
            String str2 = yVar2.f68134x;
            if (str2 != null) {
                mo37339r(yVar, str2);
            }
        }
    }

    /* renamed from: s */
    public final C23788h mo37340s(C23713g.C23755n0 n0Var) {
        C23788h hVar = new C23788h(this);
        mo37320S(hVar, C23713g.C23727e0.m28387a());
        mo37341t(n0Var, hVar);
        return hVar;
    }

    /* renamed from: t */
    public final C23788h mo37341t(C23713g.C23755n0 n0Var, C23788h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n0Var instanceof C23713g.C23751l0) {
                arrayList.add(0, (C23713g.C23751l0) n0Var);
            }
            C23713g.C23747j0 j0Var = n0Var.f68086b;
            if (j0Var == null) {
                break;
            }
            n0Var = (C23713g.C23755n0) j0Var;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo37321T(hVar, (C23713g.C23751l0) it.next());
        }
        C23788h hVar2 = this.f68142c;
        hVar.f68178g = hVar2.f68178g;
        hVar.f68177f = hVar2.f68177f;
        return hVar;
    }

    /* renamed from: u */
    public final C23713g.C23727e0.C23729f mo37342u() {
        C23713g.C23727e0.C23729f fVar;
        C23713g.C23727e0 e0Var = this.f68142c.f68172a;
        if (e0Var.f68005z == C23713g.C23727e0.C23734h.LTR || (fVar = e0Var.f67967A) == C23713g.C23727e0.C23729f.Middle) {
            return e0Var.f67967A;
        }
        C23713g.C23727e0.C23729f fVar2 = C23713g.C23727e0.C23729f.Start;
        return fVar == fVar2 ? C23713g.C23727e0.C23729f.End : fVar2;
    }

    /* renamed from: v */
    public final Path.FillType mo37343v() {
        C23713g.C23727e0.C23731a aVar = this.f68142c.f68172a.f67978L;
        return (aVar == null || aVar != C23713g.C23727e0.C23731a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: w */
    public final boolean mo37344w(C23713g.C23727e0 e0Var, long j) {
        return (e0Var.f67986d & j) != 0;
    }

    /* renamed from: x */
    public final Path mo37345x(C23713g.C23723d dVar) {
        C23713g.C23723d dVar2 = dVar;
        C23713g.C23758p pVar = dVar2.f67956o;
        float f = 0.0f;
        float d = pVar != null ? pVar.mo37287d(this) : 0.0f;
        C23713g.C23758p pVar2 = dVar2.f67957p;
        if (pVar2 != null) {
            f = pVar2.mo37288e(this);
        }
        float b = dVar2.f67958q.mo37285b(this);
        float f2 = d - b;
        float f3 = f - b;
        float f4 = d + b;
        float f5 = f + b;
        if (dVar2.f68073h == null) {
            float f6 = 2.0f * b;
            dVar2.f68073h = new C23713g.C23717b(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * b;
        Path path = new Path();
        path.moveTo(d, f3);
        float f8 = d + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f15 = f + f7;
        path2.cubicTo(f4, f15, f8, f5, d, f5);
        float f16 = d - f7;
        path2.cubicTo(f16, f5, f2, f15, f2, f);
        path2.cubicTo(f2, f9, f16, f3, d, f3);
        path.close();
        return path;
    }

    /* renamed from: y */
    public final Path mo37346y(C23713g.C23744i iVar) {
        C23713g.C23744i iVar2 = iVar;
        C23713g.C23758p pVar = iVar2.f68056o;
        float f = 0.0f;
        float d = pVar != null ? pVar.mo37287d(this) : 0.0f;
        C23713g.C23758p pVar2 = iVar2.f68057p;
        if (pVar2 != null) {
            f = pVar2.mo37288e(this);
        }
        float d2 = iVar2.f68058q.mo37287d(this);
        float e = iVar2.f68059r.mo37288e(this);
        float f2 = d - d2;
        float f3 = f - e;
        float f4 = d + d2;
        float f5 = f + e;
        if (iVar2.f68073h == null) {
            iVar2.f68073h = new C23713g.C23717b(f2, f3, d2 * 2.0f, 2.0f * e);
        }
        float f6 = d2 * 0.5522848f;
        float f7 = 0.5522848f * e;
        Path path = new Path();
        path.moveTo(d, f3);
        float f8 = d + f6;
        float f9 = f - f7;
        Path path2 = path;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f15 = f7 + f;
        Path path3 = path2;
        path3.cubicTo(f4, f15, f8, f5, d, f5);
        float f16 = d - f6;
        path3.cubicTo(f16, f5, f2, f15, f2, f);
        path3.cubicTo(f2, f9, f16, f3, d, f3);
        path2.close();
        return path2;
    }

    /* renamed from: z */
    public final Path mo37347z(C23713g.C23778z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f68135o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = zVar.f68135o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (zVar instanceof C23713g.C23715a0) {
            path.close();
        }
        if (zVar.f68073h == null) {
            zVar.f68073h = mo37325c(path);
        }
        return path;
    }

    /* renamed from: c6.h$h */
    public class C23788h {

        /* renamed from: a */
        public C23713g.C23727e0 f68172a;

        /* renamed from: b */
        public boolean f68173b;

        /* renamed from: c */
        public boolean f68174c;

        /* renamed from: d */
        public Paint f68175d;

        /* renamed from: e */
        public Paint f68176e;

        /* renamed from: f */
        public C23713g.C23717b f68177f;

        /* renamed from: g */
        public C23713g.C23717b f68178g;

        /* renamed from: h */
        public boolean f68179h;

        public C23788h(C23780h hVar) {
            Paint paint = new Paint();
            this.f68175d = paint;
            paint.setFlags(193);
            this.f68175d.setHinting(0);
            this.f68175d.setStyle(Paint.Style.FILL);
            this.f68175d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f68176e = paint2;
            paint2.setFlags(193);
            this.f68176e.setHinting(0);
            this.f68176e.setStyle(Paint.Style.STROKE);
            this.f68176e.setTypeface(Typeface.DEFAULT);
            this.f68172a = C23713g.C23727e0.m28387a();
        }

        public C23788h(C23780h hVar, C23788h hVar2) {
            this.f68173b = hVar2.f68173b;
            this.f68174c = hVar2.f68174c;
            this.f68175d = new Paint(hVar2.f68175d);
            this.f68176e = new Paint(hVar2.f68176e);
            C23713g.C23717b bVar = hVar2.f68177f;
            if (bVar != null) {
                this.f68177f = new C23713g.C23717b(bVar);
            }
            C23713g.C23717b bVar2 = hVar2.f68178g;
            if (bVar2 != null) {
                this.f68178g = new C23713g.C23717b(bVar2);
            }
            this.f68179h = hVar2.f68179h;
            try {
                this.f68172a = (C23713g.C23727e0) hVar2.f68172a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f68172a = C23713g.C23727e0.m28387a();
            }
        }
    }
}
