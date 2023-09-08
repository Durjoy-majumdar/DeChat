package vd3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Random;
import kg3.C76577a;
import lg3.C76695c;

/* renamed from: vd3.d0 */
public class C111511d0 extends Drawable {

    /* renamed from: a */
    public Context f333864a;

    /* renamed from: b */
    public Drawable f333865b = null;

    /* renamed from: c */
    public int f333866c = 0;

    /* renamed from: d */
    public int f333867d = 0;

    /* renamed from: e */
    public Paint f333868e = new Paint(1);

    /* renamed from: f */
    public Interpolator f333869f = new LinearInterpolator();

    /* renamed from: g */
    public int f333870g;

    /* renamed from: h */
    public int f333871h;

    /* renamed from: i */
    public int f333872i;

    /* renamed from: j */
    public int f333873j;

    /* renamed from: k */
    public int f333874k;

    /* renamed from: l */
    public int f333875l;

    /* renamed from: m */
    public int f333876m;

    /* renamed from: n */
    public float f333877n;

    /* renamed from: o */
    public float f333878o;

    /* renamed from: p */
    public float f333879p;

    /* renamed from: q */
    public float f333880q;

    /* renamed from: r */
    public boolean f333881r;

    /* renamed from: s */
    public int f333882s;

    /* renamed from: t */
    public int f333883t;

    /* renamed from: u */
    public ValueAnimator f333884u;

    /* renamed from: v */
    public RectF f333885v;

    /* renamed from: vd3.d0$a */
    public class C111512a implements ValueAnimator.AnimatorUpdateListener {
        public C111512a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C111511d0 d0Var = C111511d0.this;
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d0Var.getClass();
            C111511d0.this.invalidateSelf();
        }
    }

    public C111511d0(Context context) {
        new AccelerateDecelerateInterpolator();
        new Random(System.currentTimeMillis());
        this.f333876m = 0;
        this.f333877n = -90.0f;
        this.f333878o = 0.0f;
        this.f333879p = 0.0f;
        this.f333880q = 5.0f;
        this.f333881r = false;
        this.f333883t = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 100.0f});
        this.f333884u = ofFloat;
        ofFloat.setInterpolator(this.f333869f);
        this.f333884u.addUpdateListener(new C111512a());
        this.f333885v = new RectF();
        this.f333864a = context;
        this.f333866c = C76577a.m92153d(context, C0966R.color.akw);
        this.f333867d = C76577a.m92153d(context, C0966R.color.a7b);
        this.f333865b = context.getResources().getDrawable(C76695c.m92341b() ? C0966R.raw.voiceinput_icon_button_care : C0966R.raw.voiceinput_icon_button);
        C76577a.m92155f(context, C0966R.dimen.f357080at1);
        C76577a.m92155f(context, C0966R.dimen.f357079at0);
        C76577a.m92155f(context, C0966R.dimen.asq);
        this.f333876m = C76577a.m92155f(context, C0966R.dimen.asv);
        this.f333871h = C76577a.m92153d(context, C0966R.color.aid);
        C76577a.m92155f(context, C0966R.dimen.ass);
        this.f333874k = C76577a.m92155f(context, C0966R.dimen.asr);
        this.f333875l = C76577a.m92153d(context, C0966R.color.aie);
        this.f333882s = C76577a.m92155f(context, C0966R.dimen.asu);
        this.f333872i = C76577a.m92155f(context, C0966R.dimen.asu);
        this.f333873j = C76577a.m92155f(context, C0966R.dimen.ast);
        this.f333870g = C76577a.m92155f(context, C0966R.dimen.f357081at2);
    }

    /* renamed from: a */
    public final boolean mo163194a(Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    /* renamed from: b */
    public void mo163195b() {
        Log.m105919d("MicroMsg.VoiceInputDrawable", "disableState %s", Integer.valueOf(this.f333883t));
        this.f333883t = 5;
        this.f333884u.cancel();
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo163196c() {
        Log.m105919d("MicroMsg.VoiceInputDrawable", "longClickState %s", Integer.valueOf(this.f333883t));
        this.f333883t = 7;
        this.f333884u.cancel();
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo163197d() {
        Log.m105919d("MicroMsg.VoiceInputDrawable", "readyPressState %s", Integer.valueOf(this.f333883t));
        this.f333883t = 6;
        this.f333884u.cancel();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        int i = this.f333883t;
        if ((i == 6 || i == 7) && !mo163194a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            this.f333868e.setShader((Shader) null);
            this.f333868e.setStyle(Paint.Style.FILL);
            this.f333868e.setColor(this.f333871h);
            if (this.f333883t == 7) {
                if (this.f333881r) {
                    this.f333882s -= 4;
                } else {
                    this.f333882s += 4;
                }
                int min = Math.min(Math.max(this.f333872i, this.f333882s), this.f333873j);
                this.f333882s = min;
                canvas.drawCircle((float) width, (float) height, (float) min, this.f333868e);
            } else {
                canvas.drawCircle((float) width, (float) height, (float) this.f333872i, this.f333868e);
            }
        }
        if (this.f333865b != null && !mo163194a(canvas)) {
            if (this.f333883t == 5) {
                this.f333865b.setColorFilter(this.f333867d, PorterDuff.Mode.SRC_ATOP);
            } else {
                this.f333865b.setColorFilter(this.f333866c, PorterDuff.Mode.SRC_ATOP);
            }
            int width2 = canvas.getWidth() / 2;
            int height2 = canvas.getHeight() / 2;
            Drawable drawable = this.f333865b;
            int i2 = this.f333876m;
            drawable.setBounds(width2 - i2, height2 - i2, width2 + i2, height2 + i2);
            this.f333865b.draw(canvas);
        }
        if (this.f333883t == 4 && canvas != null) {
            this.f333868e.setColor(this.f333866c);
            this.f333868e.setStrokeWidth((float) this.f333870g);
            this.f333868e.setStyle(Paint.Style.STROKE);
            this.f333868e.clearShadowLayer();
            this.f333868e.setShader((Shader) null);
            this.f333885v.left = (float) ((canvas.getWidth() / 2) - this.f333874k);
            this.f333885v.top = (float) ((canvas.getHeight() / 2) - this.f333874k);
            this.f333885v.right = (float) ((canvas.getWidth() / 2) + this.f333874k);
            this.f333885v.bottom = (float) ((canvas.getHeight() / 2) + this.f333874k);
            canvas.drawArc(this.f333885v, this.f333877n, this.f333879p, false, this.f333868e);
            this.f333877n += this.f333878o;
            float f = this.f333879p;
            float f2 = this.f333880q;
            float f3 = f + f2;
            this.f333879p = f3;
            if (f3 >= 360.0f) {
                this.f333880q = -f2;
                this.f333878o = 5.0f;
            } else if (f3 <= 0.0f) {
                this.f333880q = -f2;
                this.f333878o = 0.0f;
                this.f333877n = -90.0f;
                this.f333879p = 0.0f;
            }
        }
        int i3 = this.f333883t;
        if ((i3 == 6 || i3 == 7) && !mo163194a(canvas)) {
            this.f333868e.setStyle(Paint.Style.FILL);
            this.f333868e.setColor(this.f333875l);
            canvas.drawCircle((float) (canvas.getWidth() >> 1), (float) (canvas.getHeight() >> 1), (float) this.f333876m, this.f333868e);
        }
    }

    /* renamed from: e */
    public void mo163199e() {
        Log.m105919d("MicroMsg.VoiceInputDrawable", "readyState %s", Integer.valueOf(this.f333883t));
        this.f333883t = 2;
        this.f333884u.cancel();
        this.f333877n = -90.0f;
        this.f333878o = 0.0f;
        this.f333879p = 0.0f;
        this.f333880q = 5.0f;
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo163200f() {
        Log.m105919d("MicroMsg.VoiceInputDrawable", "recognizingState %s", Integer.valueOf(this.f333883t));
        this.f333883t = 4;
        this.f333884u.cancel();
        this.f333884u.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f333884u.setDuration(1000);
        this.f333884u.setRepeatCount(-1);
        this.f333884u.start();
    }

    /* renamed from: g */
    public void mo163201g(int i, boolean z) {
        boolean z2 = false;
        Log.m105919d("MicroMsg.VoiceInputDrawable", "recordingStartState() called with: maxAmplitudeRate = [%s] fromLongCkick = %s", Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            this.f333883t = 3;
        }
        if (i < 28) {
            z2 = true;
        }
        this.f333881r = z2;
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f333876m * 2;
    }

    public int getIntrinsicWidth() {
        Context context = this.f333864a;
        if (context == null) {
            return 0;
        }
        return C76577a.m92145A(context);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void mo163205h(int i) {
        boolean z = true;
        Log.m105919d("MicroMsg.VoiceInputDrawable", "recordingState() called with: maxAmplitudeRate = [%s]", Integer.valueOf(i));
        if (i >= 28) {
            z = false;
        }
        this.f333881r = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
