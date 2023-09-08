package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8477a0;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13601g;
import rx3.C36568h;
import ub2.C14145k0;
import ub2.C65296l0;
import ub2.C65298m0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R#\u0010\u001e\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricPreludeView;", "Landroid/widget/FrameLayout;", "", "o", "Z", "getEnableAnim", "()Z", "setEnableAnim", "(Z)V", "enableAnim", "", "p", "J", "getPreludeLen", "()J", "setPreludeLen", "(J)V", "preludeLen", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "q", "Lrx3/g;", "getDotDownAnimator", "()Landroid/animation/ValueAnimator;", "dotDownAnimator", "r", "getDotUpAnimator", "dotUpAnimator", "s", "getAlphaAnimator", "alphaAnimator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView */
public final class MusicMvLyricPreludeView extends FrameLayout {

    /* renamed from: u */
    public static final float f163551u = ((float) C76577a.m92151b(MMApplicationContext.getContext(), 6));

    /* renamed from: v */
    public static final float f163552v = ((float) C76577a.m92151b(MMApplicationContext.getContext(), 21));

    /* renamed from: w */
    public static final String f163553w = "MicroMsg.MusicMvLyricPreludeView";

    /* renamed from: d */
    public final Paint f163554d;

    /* renamed from: e */
    public final Paint f163555e;

    /* renamed from: f */
    public final Paint f163556f;

    /* renamed from: g */
    public int f163557g = 2;

    /* renamed from: h */
    public int f163558h = 1;

    /* renamed from: i */
    public float f163559i;

    /* renamed from: j */
    public float f163560j;

    /* renamed from: n */
    public int f163561n;

    /* renamed from: o */
    public boolean f163562o;

    /* renamed from: p */
    public long f163563p;

    /* renamed from: q */
    public final C13601g f163564q;

    /* renamed from: r */
    public final C13601g f163565r;

    /* renamed from: s */
    public final C13601g f163566s;

    /* renamed from: t */
    public ValueAnimator f163567t;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView$a */
    public static final class C57095a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricPreludeView f163568d;

        public C57095a(MusicMvLyricPreludeView musicMvLyricPreludeView) {
            this.f163568d = musicMvLyricPreludeView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f163568d.setEnableAnim(false);
            this.f163568d.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView$b */
    public static final class C57096b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f163569d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvLyricPreludeView f163570e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f163571f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f163572g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f163573h;

        public C57096b(int i, MusicMvLyricPreludeView musicMvLyricPreludeView, C8477a0 a0Var, C8477a0 a0Var2, C8477a0 a0Var3) {
            this.f163569d = i;
            this.f163570e = musicMvLyricPreludeView;
            this.f163571f = a0Var;
            this.f163572g = a0Var2;
            this.f163573h = a0Var3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            int i = this.f163569d;
            if (intValue >= i - 300) {
                MusicMvLyricPreludeView musicMvLyricPreludeView = this.f163570e;
                musicMvLyricPreludeView.f163561n = 2;
                if (!musicMvLyricPreludeView.getAlphaAnimator().isStarted()) {
                    C8477a0 a0Var = this.f163571f;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        this.f163570e.getAlphaAnimator().cancel();
                        this.f163570e.getAlphaAnimator().start();
                        return;
                    }
                    return;
                }
                return;
            }
            float f = (float) intValue;
            float f2 = (float) 300;
            if (f >= ((((float) i) * 2.0f) / 3.0f) - f2) {
                MusicMvLyricPreludeView musicMvLyricPreludeView2 = this.f163570e;
                musicMvLyricPreludeView2.f163561n = 1;
                if (!musicMvLyricPreludeView2.getAlphaAnimator().isStarted()) {
                    C8477a0 a0Var2 = this.f163572g;
                    if (!a0Var2.f27482d) {
                        a0Var2.f27482d = true;
                        this.f163570e.getAlphaAnimator().cancel();
                        this.f163570e.getAlphaAnimator().start();
                    }
                }
            } else if (f >= (((float) i) / 3.0f) - f2) {
                MusicMvLyricPreludeView musicMvLyricPreludeView3 = this.f163570e;
                musicMvLyricPreludeView3.f163561n = 0;
                if (!musicMvLyricPreludeView3.getAlphaAnimator().isStarted()) {
                    C8477a0 a0Var3 = this.f163573h;
                    if (!a0Var3.f27482d) {
                        a0Var3.f27482d = true;
                        this.f163570e.getAlphaAnimator().cancel();
                        this.f163570e.getAlphaAnimator().start();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView$c */
    public static final class C57097c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvLyricPreludeView f163574d;

        public C57097c(MusicMvLyricPreludeView musicMvLyricPreludeView) {
            this.f163574d = musicMvLyricPreludeView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            MusicMvLyricPreludeView musicMvLyricPreludeView = this.f163574d;
            int i = musicMvLyricPreludeView.f163561n;
            if (i == 1) {
                musicMvLyricPreludeView.f163555e.setAlpha((int) (floatValue * ((float) 255)));
            } else if (i != 2) {
                musicMvLyricPreludeView.f163556f.setAlpha((int) (floatValue * ((float) 255)));
            } else {
                musicMvLyricPreludeView.f163554d.setAlpha((int) (floatValue * ((float) 255)));
            }
            this.f163574d.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView$d */
    public static final class C57098d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ long f163575d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvLyricPreludeView f163576e;

        public C57098d(long j, MusicMvLyricPreludeView musicMvLyricPreludeView) {
            this.f163575d = j;
            this.f163576e = musicMvLyricPreludeView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getCurrentPlayTime() > this.f163575d - ((long) 3000)) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f163576e.f163559i = MusicMvLyricPreludeView.f163551u * floatValue;
            MusicMvLyricPreludeView musicMvLyricPreludeView = this.f163576e;
            musicMvLyricPreludeView.f163557g = 2 - (((int) (((float) valueAnimator.getCurrentPlayTime()) / 400.0f)) % 3);
            musicMvLyricPreludeView.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView$e */
    public static final class C57099e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ long f163577d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvLyricPreludeView f163578e;

        public C57099e(long j, MusicMvLyricPreludeView musicMvLyricPreludeView) {
            this.f163577d = j;
            this.f163578e = musicMvLyricPreludeView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getCurrentPlayTime() > this.f163577d - ((long) 3000)) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                MusicMvLyricPreludeView musicMvLyricPreludeView = this.f163578e;
                long j = this.f163577d;
                float f = MusicMvLyricPreludeView.f163551u;
                musicMvLyricPreludeView.mo80552e(j);
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f163578e.f163560j = MusicMvLyricPreludeView.f163551u * floatValue;
            MusicMvLyricPreludeView musicMvLyricPreludeView2 = this.f163578e;
            int currentPlayTime = 1 - (((int) (((float) valueAnimator.getCurrentPlayTime()) / 400.0f)) % 3);
            musicMvLyricPreludeView2.f163558h = currentPlayTime;
            if (currentPlayTime < 0) {
                musicMvLyricPreludeView2.f163558h = currentPlayTime + 3;
            }
            musicMvLyricPreludeView2.invalidate();
        }
    }

    static {
        C76577a.m92151b(MMApplicationContext.getContext(), 24);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvLyricPreludeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint(1);
        this.f163554d = paint;
        Paint paint2 = new Paint(1);
        this.f163555e = paint2;
        Paint paint3 = new Paint(1);
        this.f163556f = paint3;
        float f = f163551u;
        this.f163559i = f;
        this.f163560j = f;
        this.f163561n = 2;
        this.f163564q = C36568h.m40985a(C65296l0.f187954d);
        this.f163565r = C36568h.m40985a(C65298m0.f187956d);
        this.f163566s = C36568h.m40985a(C14145k0.f39576d);
        paint.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        paint2.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        paint3.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
    }

    /* access modifiers changed from: private */
    public final ValueAnimator getAlphaAnimator() {
        return (ValueAnimator) this.f163566s.getValue();
    }

    private final ValueAnimator getDotDownAnimator() {
        return (ValueAnimator) this.f163564q.getValue();
    }

    private final ValueAnimator getDotUpAnimator() {
        return (ValueAnimator) this.f163565r.getValue();
    }

    /* renamed from: b */
    public final float mo80549b(int i) {
        return i == this.f163558h ? this.f163560j : i == this.f163557g ? this.f163559i : f163551u;
    }

    /* renamed from: c */
    public final void mo80550c() {
        ValueAnimator valueAnimator;
        if (this.f163562o) {
            if (getDotDownAnimator().isStarted()) {
                getDotDownAnimator().pause();
            }
            if (getDotUpAnimator().isStarted()) {
                getDotUpAnimator().pause();
            }
            ValueAnimator valueAnimator2 = this.f163567t;
            boolean z = true;
            if (valueAnimator2 == null || !valueAnimator2.isStarted()) {
                z = false;
            }
            if (z && (valueAnimator = this.f163567t) != null) {
                valueAnimator.pause();
            }
            if (getAlphaAnimator().isStarted()) {
                getAlphaAnimator().pause();
            }
        }
    }

    /* renamed from: d */
    public final void mo80551d() {
        ValueAnimator valueAnimator;
        if (this.f163562o) {
            if (getDotDownAnimator().isPaused()) {
                getDotDownAnimator().resume();
            }
            if (getDotUpAnimator().isPaused()) {
                getDotUpAnimator().resume();
            }
            ValueAnimator valueAnimator2 = this.f163567t;
            boolean z = true;
            if (valueAnimator2 == null || !valueAnimator2.isPaused()) {
                z = false;
            }
            if (z && (valueAnimator = this.f163567t) != null) {
                valueAnimator.resume();
            }
            if (getAlphaAnimator().isPaused()) {
                getAlphaAnimator().resume();
            }
        }
    }

    /* renamed from: e */
    public final void mo80552e(long j) {
        Log.m105924i(f163553w, "startAlphaAnim");
        float f = f163551u;
        this.f163560j = f;
        this.f163559i = f;
        invalidate();
        if (j > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            j = 3000;
        }
        int i = (int) j;
        this.f163567t = ValueAnimator.ofInt(new int[]{0, i});
        C8477a0 a0Var = new C8477a0();
        C8477a0 a0Var2 = new C8477a0();
        C8477a0 a0Var3 = new C8477a0();
        ValueAnimator valueAnimator = this.f163567t;
        C87412m.m108591d(valueAnimator);
        valueAnimator.setDuration((long) i);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addListener(new C57095a(this));
        valueAnimator.addUpdateListener(new C57096b(i, this, a0Var3, a0Var2, a0Var));
        valueAnimator.cancel();
        valueAnimator.start();
        getAlphaAnimator().addUpdateListener(new C57097c(this));
    }

    /* renamed from: f */
    public final void mo80553f(long j) {
        if (this.f163562o) {
            String str = f163553w;
            Log.m105924i(str, "startAnim " + hashCode() + "， has startAnim");
            return;
        }
        this.f163562o = true;
        this.f163557g = 2;
        this.f163558h = 1;
        float f = f163551u;
        this.f163559i = f;
        this.f163560j = f;
        this.f163561n = 2;
        this.f163554d.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        this.f163555e.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        this.f163556f.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        long j2 = this.f163563p - j;
        String str2 = f163553w;
        Log.m105924i(str2, "startAnim " + hashCode() + "， remaining:" + j2);
        if (j2 > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            getDotDownAnimator().addUpdateListener(new C57098d(j2, this));
            getDotUpAnimator().addUpdateListener(new C57099e(j2, this));
            getDotDownAnimator().cancel();
            getDotDownAnimator().start();
            getDotUpAnimator().cancel();
            getDotUpAnimator().start();
        } else if (j2 >= 3000) {
            mo80552e(j2);
        } else {
            this.f163562o = false;
        }
    }

    public final boolean getEnableAnim() {
        return this.f163562o;
    }

    public final long getPreludeLen() {
        return this.f163563p;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f163562o) {
            float f = f163551u;
            float f2 = f163552v;
            canvas.drawCircle((f * 0.2f) + f, f2, mo80549b(0), this.f163554d);
            canvas.drawCircle((((float) 4) * f) + (f * 0.2f), f2, mo80549b(1), this.f163555e);
            canvas.drawCircle((((float) 7) * f) + (f * 0.2f), f2, mo80549b(2), this.f163556f);
        }
    }

    public final void setEnableAnim(boolean z) {
        this.f163562o = z;
    }

    public final void setPreludeLen(long j) {
        this.f163563p = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvLyricPreludeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint(1);
        this.f163554d = paint;
        Paint paint2 = new Paint(1);
        this.f163555e = paint2;
        Paint paint3 = new Paint(1);
        this.f163556f = paint3;
        float f = f163551u;
        this.f163559i = f;
        this.f163560j = f;
        this.f163561n = 2;
        this.f163564q = C36568h.m40985a(C65296l0.f187954d);
        this.f163565r = C36568h.m40985a(C65298m0.f187956d);
        this.f163566s = C36568h.m40985a(C14145k0.f39576d);
        paint.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        paint2.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
        paint3.setColor(C111105a.m151500b(getContext(), C0966R.color.BW_100_Alpha_0_8));
    }
}
