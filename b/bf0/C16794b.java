package bf0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;

/* renamed from: bf0.b */
public abstract class C16794b {

    /* renamed from: A */
    public int f45359A;

    /* renamed from: B */
    public boolean f45360B;

    /* renamed from: C */
    public boolean f45361C;

    /* renamed from: D */
    public boolean f45362D;

    /* renamed from: E */
    public VelocityTracker f45363E;

    /* renamed from: F */
    public float f45364F;

    /* renamed from: G */
    public float f45365G;

    /* renamed from: H */
    public float f45366H;

    /* renamed from: I */
    public float f45367I;

    /* renamed from: a */
    public final Matrix f45368a = new Matrix();

    /* renamed from: b */
    public final Paint f45369b = new Paint(1);

    /* renamed from: c */
    public Rect f45370c;

    /* renamed from: d */
    public long f45371d;

    /* renamed from: e */
    public float f45372e;

    /* renamed from: f */
    public float f45373f;

    /* renamed from: g */
    public float f45374g;

    /* renamed from: h */
    public float f45375h;

    /* renamed from: i */
    public float f45376i;

    /* renamed from: j */
    public float f45377j;

    /* renamed from: k */
    public Float f45378k;

    /* renamed from: l */
    public Float f45379l;

    /* renamed from: m */
    public Long f45380m;

    /* renamed from: n */
    public Long f45381n;

    /* renamed from: o */
    public float f45382o;

    /* renamed from: p */
    public float f45383p;

    /* renamed from: q */
    public float f45384q;

    /* renamed from: r */
    public Float f45385r;

    /* renamed from: s */
    public Long f45386s;

    /* renamed from: t */
    public long f45387t;

    /* renamed from: u */
    public Interpolator f45388u;

    /* renamed from: v */
    public float f45389v;

    /* renamed from: w */
    public float f45390w;

    /* renamed from: x */
    public float f45391x;

    /* renamed from: y */
    public float f45392y;

    /* renamed from: z */
    public float f45393z;

    /* renamed from: a */
    public static long m16438a(float f, float f2, float f3, Long l, Float f4, int i, int i2) {
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i3 != 0) {
            if (i3 > 0) {
                i = i2;
            }
            if (l == null || l.longValue() < 0) {
                float f5 = 2.0f * f3;
                double sqrt = Math.sqrt((double) (((((float) i) * f5) - (f5 * f)) + (f2 * f2)));
                double d = (double) f2;
                double d2 = (double) f3;
                double d3 = ((-sqrt) - d) / d2;
                if (d3 > 0.0d) {
                    return (long) d3;
                }
                double d4 = (sqrt - d) / d2;
                return d4 > 0.0d ? (long) d4 : MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
            double longValue = ((((double) ((((float) i) - f) - (f2 * ((float) l.longValue())))) - (((((double) f3) * 0.5d) * ((double) l.longValue())) * ((double) l.longValue()))) + ((double) (f4.floatValue() * ((float) l.longValue())))) / ((double) f4.floatValue());
            return longValue > 0.0d ? (long) longValue : MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        if (l != null) {
            f2 = f4.floatValue();
        }
        int i4 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i4 > 0) {
            i = i2;
        }
        if (i4 == 0) {
            return MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        double d5 = (double) ((((float) i) - f) / f2);
        return d5 > 0.0d ? (long) d5 : MAlarmHandler.NEXT_FIRE_INTERVAL;
    }

    /* renamed from: c */
    public static Long m16439c(Float f, float f2, float f3) {
        if (f != null) {
            long j = 0;
            if (f3 != 0.0f) {
                long floatValue = (long) ((f.floatValue() - f2) / f3);
                if (floatValue > 0) {
                    j = floatValue;
                }
                return Long.valueOf(j);
            } else if (f.floatValue() < f2) {
                return 0L;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final float mo17823b(long j, float f, float f2, float f3, Long l, Float f4) {
        if (l != null && j >= l.longValue()) {
            return f + (f2 * ((float) l.longValue())) + (f3 * 0.5f * ((float) l.longValue()) * ((float) l.longValue())) + (((float) (j - l.longValue())) * f4.floatValue());
        }
        float f5 = (float) j;
        return f + (f2 * f5) + (f3 * 0.5f * f5 * f5);
    }

    /* renamed from: d */
    public final void mo17824d(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.save();
        canvas.clipRect(this.f45370c);
        this.f45368a.reset();
        this.f45369b.setAlpha(this.f45359A);
        mo17820e(canvas, this.f45368a, this.f45369b, f, f2, f3, f4);
        canvas.restore();
    }

    /* renamed from: e */
    public abstract void mo17820e(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4);

    /* renamed from: f */
    public abstract int mo17821f();

    /* renamed from: g */
    public abstract int mo17822g();

    /* renamed from: h */
    public void mo17825h(Rect rect) {
        this.f45370c = rect;
        this.f45380m = m16439c(this.f45378k, this.f45374g, this.f45376i);
        this.f45381n = m16439c(this.f45379l, this.f45375h, this.f45377j);
        this.f45386s = m16439c(this.f45385r, this.f45383p, this.f45384q);
        if (this.f45389v == 0.0f) {
            long j = this.f45387t;
            this.f45389v = j >= 0 ? (float) j : 9.223372E18f;
            this.f45389v = Math.min((float) m16438a(this.f45372e, this.f45374g, this.f45376i, this.f45380m, this.f45378k, rect.left - mo17822g(), rect.right), this.f45389v);
            this.f45389v = Math.min((float) m16438a(this.f45373f, this.f45375h, this.f45377j, this.f45381n, this.f45379l, rect.top - mo17821f(), rect.bottom), this.f45389v);
        }
        this.f45369b.setAlpha(this.f45359A);
    }

    /* renamed from: i */
    public void mo17826i() {
        this.f45371d = 0;
        this.f45373f = 0.0f;
        this.f45372e = 0.0f;
        this.f45375h = 0.0f;
        this.f45374g = 0.0f;
        this.f45377j = 0.0f;
        this.f45376i = 0.0f;
        this.f45379l = null;
        this.f45378k = null;
        this.f45381n = null;
        this.f45380m = null;
        this.f45382o = 0.0f;
        this.f45383p = 0.0f;
        this.f45384q = 0.0f;
        this.f45385r = null;
        this.f45386s = null;
        this.f45387t = 0;
        this.f45389v = 0.0f;
        this.f45390w = 0.0f;
        this.f45388u = null;
        this.f45392y = 0.0f;
        this.f45391x = 0.0f;
        this.f45393z = 0.0f;
        this.f45359A = 255;
        this.f45360B = false;
        this.f45361C = false;
    }
}
