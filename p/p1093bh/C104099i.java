package p1093bh;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: bh.i */
public class C104099i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f307942d = 0;

    /* renamed from: e */
    public float f307943e;

    /* renamed from: f */
    public float f307944f = 0.0f;

    /* renamed from: g */
    public float f307945g;

    /* renamed from: h */
    public float f307946h = 0.0f;

    /* renamed from: i */
    public float f307947i;

    /* renamed from: j */
    public float f307948j;

    /* renamed from: n */
    public float f307949n;

    /* renamed from: o */
    public int f307950o;

    /* renamed from: p */
    public final /* synthetic */ float f307951p;

    /* renamed from: q */
    public final /* synthetic */ float f307952q;

    /* renamed from: r */
    public final /* synthetic */ C104090d f307953r;

    public C104099i(C104090d dVar, float f, float f2, float f3) {
        this.f307953r = dVar;
        this.f307951p = f;
        this.f307952q = f2;
        this.f307947i = f;
        this.f307948j = f2;
        this.f307949n = (float) Math.pow((double) f3, 0.0833333358168602d);
        this.f307950o = 0;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f307950o < 12) {
            Matrix g = this.f307953r.mo145696g();
            float f = this.f307949n;
            g.postScale(f, f, ((float) this.f307953r.f307922s.centerX()) + this.f307944f, ((float) this.f307953r.f307922s.centerY()) + this.f307946h);
            C104090d dVar = this.f307953r;
            Matrix matrix = dVar.f307921r;
            float f2 = this.f307949n;
            matrix.postScale(f2, f2, ((float) dVar.f307922s.centerX()) + this.f307944f, ((float) this.f307953r.f307922s.centerY()) + this.f307946h);
            this.f307950o++;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue("rotation")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("deltaX")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("deltaY")).intValue();
        this.f307953r.mo145696g().postRotate((float) (intValue - this.f307942d), this.f307951p + this.f307944f, this.f307952q + this.f307946h);
        this.f307953r.f307921r.postRotate((float) (intValue - this.f307942d), this.f307951p + this.f307944f, this.f307952q + this.f307946h);
        RectF rectF = new RectF();
        rectF.set(this.f307953r.f307922s);
        this.f307953r.f307921r.mapRect(rectF);
        float f3 = (float) intValue2;
        float f4 = this.f307947i + (f3 - this.f307943e);
        this.f307947i = f4;
        float f5 = (float) intValue3;
        this.f307948j += f5 - this.f307945g;
        this.f307944f = f4 - rectF.centerX();
        this.f307946h = this.f307948j - rectF.centerY();
        this.f307953r.mo145696g().postTranslate(this.f307944f, this.f307946h);
        this.f307953r.f307921r.postTranslate(this.f307944f, this.f307946h);
        this.f307953r.mo145704o();
        this.f307942d = intValue;
        this.f307943e = f3;
        this.f307945g = f5;
    }
}
