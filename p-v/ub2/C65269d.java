package ub2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import p385u2.C111105a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ub2.d */
public final class C65269d extends RecyclerView.C0129l {

    /* renamed from: w */
    public static final float f187896w = ((float) C76577a.m92151b(MMApplicationContext.getContext(), 6));

    /* renamed from: x */
    public static final float f187897x = ((float) C76577a.m92151b(MMApplicationContext.getContext(), 28));

    /* renamed from: y */
    public static final String f187898y = "MicroMsg.LyricItemDecoration";

    /* renamed from: d */
    public final Context f187899d;

    /* renamed from: e */
    public final RecyclerView f187900e;

    /* renamed from: f */
    public final Paint f187901f;

    /* renamed from: g */
    public final Paint f187902g;

    /* renamed from: h */
    public final Paint f187903h;

    /* renamed from: i */
    public int f187904i = 2;

    /* renamed from: j */
    public int f187905j = 1;

    /* renamed from: n */
    public float f187906n;

    /* renamed from: o */
    public float f187907o;

    /* renamed from: p */
    public int f187908p;

    /* renamed from: q */
    public boolean f187909q;

    /* renamed from: r */
    public long f187910r;

    /* renamed from: s */
    public final C13601g f187911s;

    /* renamed from: t */
    public final C13601g f187912t;

    /* renamed from: u */
    public final C13601g f187913u;

    /* renamed from: v */
    public ValueAnimator f187914v;

    /* renamed from: ub2.d$a */
    public static final class C65270a extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public static final C65270a f187915d = new C65270a();

        public C65270a() {
            super(0);
        }

        public Object invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 0.07f});
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration(300);
            return ofFloat;
        }
    }

    /* renamed from: ub2.d$b */
    public static final class C65271b extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public static final C65271b f187916d = new C65271b();

        public C65271b() {
            super(0);
        }

        public Object invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.2f, 1.0f});
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(400);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            return ofFloat;
        }
    }

    /* renamed from: ub2.d$c */
    public static final class C65272c extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public static final C65272c f187917d = new C65272c();

        public C65272c() {
            super(0);
        }

        public Object invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f});
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(400);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            return ofFloat;
        }
    }

    /* renamed from: ub2.d$d */
    public static final class C65273d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C65269d f187918d;

        public C65273d(C65269d dVar) {
            this.f187918d = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C65269d dVar = this.f187918d;
            dVar.f187909q = false;
            dVar.f187900e.invalidate();
        }
    }

    /* renamed from: ub2.d$e */
    public static final class C65274e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f187919d;

        /* renamed from: e */
        public final /* synthetic */ C65269d f187920e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f187921f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f187922g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f187923h;

        public C65274e(int i, C65269d dVar, C8477a0 a0Var, C8477a0 a0Var2, C8477a0 a0Var3) {
            this.f187919d = i;
            this.f187920e = dVar;
            this.f187921f = a0Var;
            this.f187922g = a0Var2;
            this.f187923h = a0Var3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            int i = this.f187919d;
            if (intValue >= i - 300) {
                C65269d dVar = this.f187920e;
                dVar.f187908p = 2;
                if (!dVar.mo89395j().isStarted()) {
                    C8477a0 a0Var = this.f187921f;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        this.f187920e.mo89395j().cancel();
                        this.f187920e.mo89395j().start();
                        return;
                    }
                    return;
                }
                return;
            }
            float f = (float) intValue;
            float f2 = (float) 300;
            if (f >= ((((float) i) * 2.0f) / 3.0f) - f2) {
                C65269d dVar2 = this.f187920e;
                dVar2.f187908p = 1;
                if (!dVar2.mo89395j().isStarted()) {
                    C8477a0 a0Var2 = this.f187922g;
                    if (!a0Var2.f27482d) {
                        a0Var2.f27482d = true;
                        this.f187920e.mo89395j().cancel();
                        this.f187920e.mo89395j().start();
                    }
                }
            } else if (f >= (((float) i) / 3.0f) - f2) {
                C65269d dVar3 = this.f187920e;
                dVar3.f187908p = 0;
                if (!dVar3.mo89395j().isStarted()) {
                    C8477a0 a0Var3 = this.f187923h;
                    if (!a0Var3.f27482d) {
                        a0Var3.f27482d = true;
                        this.f187920e.mo89395j().cancel();
                        this.f187920e.mo89395j().start();
                    }
                }
            }
        }
    }

    /* renamed from: ub2.d$f */
    public static final class C65275f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C65269d f187924d;

        public C65275f(C65269d dVar) {
            this.f187924d = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C65269d dVar = this.f187924d;
            int i = dVar.f187908p;
            if (i == 1) {
                dVar.f187902g.setAlpha((int) (floatValue * ((float) 255)));
            } else if (i != 2) {
                dVar.f187903h.setAlpha((int) (floatValue * ((float) 255)));
            } else {
                dVar.f187901f.setAlpha((int) (floatValue * ((float) 255)));
            }
            this.f187924d.f187900e.invalidate();
        }
    }

    /* renamed from: ub2.d$g */
    public static final class C65276g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ long f187925d;

        /* renamed from: e */
        public final /* synthetic */ C65269d f187926e;

        public C65276g(long j, C65269d dVar) {
            this.f187925d = j;
            this.f187926e = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getCurrentPlayTime() > this.f187925d - ((long) 3000)) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f187926e.f187906n = C65269d.f187896w * floatValue;
            C65269d dVar = this.f187926e;
            dVar.f187904i = 2 - (((int) (((float) valueAnimator.getCurrentPlayTime()) / 400.0f)) % 3);
            dVar.f187900e.invalidate();
        }
    }

    /* renamed from: ub2.d$h */
    public static final class C65277h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ long f187927d;

        /* renamed from: e */
        public final /* synthetic */ C65269d f187928e;

        public C65277h(long j, C65269d dVar) {
            this.f187927d = j;
            this.f187928e = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getCurrentPlayTime() > this.f187927d - ((long) 3000)) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                this.f187928e.mo89397l(this.f187927d);
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f187928e.f187907o = C65269d.f187896w * floatValue;
            C65269d dVar = this.f187928e;
            int currentPlayTime = 1 - (((int) (((float) valueAnimator.getCurrentPlayTime()) / 400.0f)) % 3);
            dVar.f187905j = currentPlayTime;
            if (currentPlayTime < 0) {
                dVar.f187905j = currentPlayTime + 3;
            }
            dVar.f187900e.invalidate();
        }
    }

    public C65269d(Context context, RecyclerView recyclerView) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(recyclerView, "lyricRv");
        this.f187899d = context;
        this.f187900e = recyclerView;
        Paint paint = new Paint(1);
        this.f187901f = paint;
        Paint paint2 = new Paint(1);
        this.f187902g = paint2;
        Paint paint3 = new Paint(1);
        this.f187903h = paint3;
        float f = f187896w;
        this.f187906n = f;
        this.f187907o = f;
        this.f187908p = 2;
        this.f187911s = C36568h.m40985a(C65271b.f187916d);
        this.f187912t = C36568h.m40985a(C65272c.f187917d);
        this.f187913u = C36568h.m40985a(C65270a.f187915d);
        paint.setColor(C111105a.m151500b(context, C0966R.color.BW_100_Alpha_0_8));
        paint2.setColor(C111105a.m151500b(context, C0966R.color.BW_100_Alpha_0_8));
        paint3.setColor(C111105a.m151500b(context, C0966R.color.BW_100_Alpha_0_8));
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int N0 = recyclerView.mo17029N0(view);
        if (N0 != -1) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (N0 == 0) {
                int i = MusicMvLyricView.f163579J;
                rect.top = MusicMvLyricView.f163580K;
            } else if (N0 == itemCount - 1) {
                int i2 = MusicMvLyricView.f163579J;
                rect.top = MusicMvLyricView.f163579J;
                rect.bottom = MusicMvLyricView.f163580K;
            } else {
                int i3 = MusicMvLyricView.f163579J;
                rect.top = MusicMvLyricView.f163579J;
            }
        }
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (this.f187909q && recyclerView.getChildCount() > 0) {
            View childAt = recyclerView.getChildAt(0);
            if (recyclerView.mo17029N0(childAt) == 0) {
                float f = f187896w;
                float f2 = f187897x;
                canvas.drawCircle((f * 0.2f) + f, ((float) childAt.getTop()) - f2, mo89396k(0), this.f187901f);
                canvas.drawCircle((((float) 4) * f) + (f * 0.2f), ((float) childAt.getTop()) - f2, mo89396k(1), this.f187902g);
                canvas.drawCircle((((float) 7) * f) + (f * 0.2f), ((float) childAt.getTop()) - f2, mo89396k(2), this.f187903h);
            }
        }
    }

    /* renamed from: j */
    public final ValueAnimator mo89395j() {
        return (ValueAnimator) ((C36570n) this.f187913u).getValue();
    }

    /* renamed from: k */
    public final float mo89396k(int i) {
        return i == this.f187905j ? this.f187907o : i == this.f187904i ? this.f187906n : f187896w;
    }

    /* renamed from: l */
    public final void mo89397l(long j) {
        float f = f187896w;
        this.f187907o = f;
        this.f187906n = f;
        this.f187900e.invalidate();
        if (j > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            j = 3000;
        }
        int i = (int) j;
        this.f187914v = ValueAnimator.ofInt(new int[]{0, i});
        C8477a0 a0Var = new C8477a0();
        C8477a0 a0Var2 = new C8477a0();
        C8477a0 a0Var3 = new C8477a0();
        ValueAnimator valueAnimator = this.f187914v;
        C87412m.m108591d(valueAnimator);
        valueAnimator.setDuration((long) i);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addListener(new C65273d(this));
        valueAnimator.addUpdateListener(new C65274e(i, this, a0Var3, a0Var2, a0Var));
        valueAnimator.cancel();
        valueAnimator.start();
        mo89395j().addUpdateListener(new C65275f(this));
    }

    /* renamed from: m */
    public final void mo89398m(long j) {
        if (this.f187909q) {
            String str = f187898y;
            Log.m105924i(str, "startAnim " + hashCode() + "， has startAnim");
            return;
        }
        Log.m105924i(f187898y, "startAnim");
        this.f187909q = true;
        this.f187904i = 2;
        this.f187905j = 1;
        float f = f187896w;
        this.f187906n = f;
        this.f187907o = f;
        this.f187908p = 2;
        this.f187901f.setColor(C111105a.m151500b(this.f187899d, C0966R.color.BW_100_Alpha_0_8));
        this.f187902g.setColor(C111105a.m151500b(this.f187899d, C0966R.color.BW_100_Alpha_0_8));
        this.f187903h.setColor(C111105a.m151500b(this.f187899d, C0966R.color.BW_100_Alpha_0_8));
        long j2 = this.f187910r - j;
        if (j2 > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            ((ValueAnimator) ((C36570n) this.f187911s).getValue()).addUpdateListener(new C65276g(j2, this));
            ((ValueAnimator) ((C36570n) this.f187912t).getValue()).addUpdateListener(new C65277h(j2, this));
            ((ValueAnimator) ((C36570n) this.f187911s).getValue()).cancel();
            ((ValueAnimator) ((C36570n) this.f187911s).getValue()).start();
            ((ValueAnimator) ((C36570n) this.f187912t).getValue()).cancel();
            ((ValueAnimator) ((C36570n) this.f187912t).getValue()).start();
        } else if (j2 >= 3000) {
            mo89397l(j2);
        } else {
            this.f187909q = false;
        }
    }
}
