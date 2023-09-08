package p1158tg;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1093bh.C104090d;
import z20.C112571a;

/* renamed from: tg.a */
public class C110980a extends C110983b {

    /* renamed from: c */
    public ValueAnimator f332385c;

    /* renamed from: d */
    public C104090d f332386d;

    /* renamed from: e */
    public float f332387e;

    /* renamed from: f */
    public float f332388f;

    /* renamed from: g */
    public float f332389g;

    /* renamed from: h */
    public Rect f332390h;

    /* renamed from: i */
    public RectF f332391i;

    /* renamed from: j */
    public Matrix f332392j;

    /* renamed from: k */
    public long f332393k = 0;

    /* renamed from: l */
    public Animator.AnimatorListener f332394l;

    /* renamed from: tg.a$a */
    public class C110981a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public Matrix f332395d;

        /* renamed from: e */
        public Rect f332396e;

        public C110981a() {
            this.f332395d = new Matrix(C110980a.this.f332386d.mo145696g());
            this.f332396e = new Rect(C110980a.this.f332390h);
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
            float floatValue3 = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
            float floatValue4 = ((Float) valueAnimator.getAnimatedValue("background_alpha")).floatValue();
            C110980a.this.f332392j.reset();
            C110980a.this.f332392j.postTranslate(floatValue2, floatValue);
            RectF rectF = new RectF(this.f332396e);
            C110980a.this.f332392j.mapRect(rectF);
            rectF.round(C110980a.this.f332390h);
            C110980a aVar = C110980a.this;
            aVar.f332392j.postScale(floatValue3, floatValue3, (float) aVar.f332390h.centerX(), (float) C110980a.this.f332390h.centerY());
            Matrix matrix = new Matrix(this.f332395d);
            matrix.postConcat(C110980a.this.f332392j);
            C110980a.this.f332386d.mo145696g().set(matrix);
            C110980a.this.f332386d.f307928y.getClass();
            C112571a.f337051s.setAlpha((int) (((float) ((int) floatValue4)) * 0.9019608f));
            RectF rectF2 = new RectF(this.f332396e);
            C110980a.this.f332392j.mapRect(rectF2);
            rectF2.round(C110980a.this.f332390h);
            C110980a.this.f332386d.mo145704o();
        }
    }

    /* renamed from: tg.a$b */
    public class C110982b implements Animator.AnimatorListener {
        public C110982b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C110980a aVar = C110980a.this;
            aVar.f332399a = true;
            aVar.f332400b = false;
            aVar.f332393k = 0;
            aVar.f332386d.mo145725H();
            C110980a.this.f332386d.mo145705p();
            Animator.AnimatorListener animatorListener = C110980a.this.f332394l;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C110980a aVar = C110980a.this;
            aVar.f332386d.f307908J = true;
            aVar.f332399a = false;
            aVar.f332400b = true;
        }
    }

    public C110980a(C104090d dVar) {
        this.f332386d = dVar;
        this.f332392j = new Matrix();
        this.f332391i = new RectF();
    }

    /* renamed from: a */
    public void mo162647a() {
        Log.m105918d("MicroMsg.CropActionUpAnim", "[cancel]");
        this.f332400b = false;
        this.f332399a = true;
        ValueAnimator valueAnimator = this.f332385c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: b */
    public void mo162648b() {
        Log.m105924i("MicroMsg.CropActionUpAnim", "[play]");
        if (this.f332399a) {
            this.f332400b = false;
            this.f332399a = false;
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{1.0f, this.f332387e}), PropertyValuesHolder.ofFloat("deltaX", new float[]{0.0f, this.f332388f}), PropertyValuesHolder.ofFloat("deltaY", new float[]{0.0f, this.f332389g}), PropertyValuesHolder.ofFloat("background_alpha", new float[]{0.0f, 255.0f})});
            this.f332385c = ofPropertyValuesHolder;
            ofPropertyValuesHolder.addUpdateListener(new C110981a());
            this.f332385c.addListener(new C110982b());
            this.f332385c.setInterpolator(new LinearInterpolator());
            this.f332385c.setDuration((long) 200);
            this.f332385c.setStartDelay(this.f332393k);
            this.f332385c.start();
        }
    }
}
