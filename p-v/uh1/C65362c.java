package uh1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import f50.C58915a;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lt1.C61401a;
import ph1.C11940k;
import ph1.C62292g;
import ph1.C62295l;
import qh1.C62620a;
import qh1.C62621b;
import qt1.C12932c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sh1.C63893c;
import wh1.C66114a;

/* renamed from: uh1.c */
public class C65362c extends C63893c {

    /* renamed from: v */
    public C62295l f188138v;

    /* renamed from: w */
    public LiveVideoView f188139w;

    /* renamed from: x */
    public final C13601g f188140x;

    /* renamed from: uh1.c$a */
    public static final class C65363a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C65362c f188141d;

        /* renamed from: e */
        public final /* synthetic */ float f188142e;

        /* renamed from: f */
        public final /* synthetic */ float f188143f;

        public C65363a(C65362c cVar, float f, float f2) {
            this.f188141d = cVar;
            this.f188142e = f;
            this.f188143f = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C65362c cVar = this.f188141d;
            C62295l lVar = cVar.f188138v;
            if (lVar != null) {
                float f = this.f188142e;
                float f2 = this.f188143f;
                if (C66114a.f190029a.mo90154f(cVar.mo89463y())) {
                    lVar.setScaleX(1.0f - (floatValue * (1.0f - f)));
                } else {
                    lVar.setScaleY(1.0f - (floatValue * (1.0f - f2)));
                }
                String str = cVar.f181104e;
                Log.m105924i(str, "addTransition maskView scaleX = " + lVar.getScaleX() + " scaleY = " + lVar.getScaleY());
            }
        }
    }

    /* renamed from: uh1.c$b */
    public static final class C65364b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C65362c f188144d;

        public C65364b(C65362c cVar) {
            this.f188144d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int width = this.f188144d.mo88660q().width() - ((int) (((float) (this.f188144d.mo88660q().width() - this.f188144d.mo88661s().width())) * floatValue));
            int height = this.f188144d.mo88660q().height() - ((int) (floatValue * ((float) (this.f188144d.mo88660q().height() - this.f188144d.mo88661s().height()))));
            C62295l lVar = this.f188144d.f188138v;
            if (lVar != null) {
                lVar.mo87364a(width, height);
            }
        }
    }

    /* renamed from: uh1.c$c */
    public static final class C65365c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C65362c f188145d;

        public C65365c(C65362c cVar) {
            this.f188145d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout frameLayout = this.f188145d.f181118s;
            if (frameLayout != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                frameLayout.setBackgroundColor(((Integer) animatedValue).intValue());
            }
        }
    }

    /* renamed from: uh1.c$d */
    public static final class C65366d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65362c f188146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65366d(C65362c cVar) {
            super(0);
            this.f188146d = cVar;
        }

        public Object invoke() {
            ((WindowManager) ((C36570n) this.f188146d.f188140x).getValue()).removeView(this.f188146d.f181118s);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uh1.c$e */
    public static final class C65367e extends C58915a {

        /* renamed from: d */
        public final /* synthetic */ C65362c f188147d;

        /* renamed from: e */
        public final /* synthetic */ LiveVideoView f188148e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f188149f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<Boolean> f188150g;

        public C65367e(C65362c cVar, LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
            this.f188147d = cVar;
            this.f188148e = liveVideoView;
            this.f188149f = lVar;
            this.f188150g = aVar;
        }

        public void onNetStatus(Bundle bundle) {
        }

        public void onPlayEvent(int i, Bundle bundle) {
            super.onPlayEvent(i, bundle);
            if (i == 2009) {
                Log.m105924i("AbsTXLivePlayListener", "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            } else if (i == 2033) {
                Log.m105924i("AbsTXLivePlayListener", "switchInLiveRoom switch view success. #1");
                C65362c cVar = this.f188147d;
                LiveVideoView liveVideoView = this.f188148e;
                C32226l<Boolean, C13598b0> lVar = this.f188149f;
                C32224a<Boolean> aVar = this.f188150g;
                cVar.getClass();
                liveVideoView.post(new C65372f(cVar, liveVideoView, lVar, aVar));
            }
        }
    }

    /* renamed from: uh1.c$f */
    public static final class C65368f extends C62620a {

        /* renamed from: d */
        public final /* synthetic */ C65362c f188151d;

        /* renamed from: e */
        public final /* synthetic */ LiveVideoView f188152e;

        public C65368f(C65362c cVar, LiveVideoView liveVideoView) {
            this.f188151d = cVar;
            this.f188152e = liveVideoView;
        }

        public void onAnimationEnd(Animator animator) {
            C58924d dVar = this.f188151d.mo89463y().f177095g;
            if (dVar != null) {
                dVar.setPlayerView(this.f188152e);
            }
        }
    }

    /* renamed from: uh1.c$g */
    public static final class C65369g extends C87413o implements C32224a<WindowManager> {

        /* renamed from: d */
        public final /* synthetic */ Context f188153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65369g(Context context) {
            super(0);
            this.f188153d = context;
        }

        public Object invoke() {
            Object systemService = this.f188153d.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65362c(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f188140x = C36568h.m40985a(new C65369g(context));
    }

    /* renamed from: c */
    public void mo84318c(LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        C87412m.m108594g(liveVideoView, "renderView");
        C87412m.m108594g(lVar, "onFirstFrameRenderCallback");
        C87412m.m108594g(aVar, "isDetachInvokeFun");
        String str = this.f181104e;
        StringBuilder sb = new StringBuilder();
        sb.append("switchInLiveRoom isRunning:");
        AnimatorSet animatorSet = this.f181111o;
        C13598b0 b0Var = null;
        sb.append(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null);
        Log.m105924i(str, sb.toString());
        C12932c cVar = C11940k.f34875a;
        C12932c cVar2 = C11940k.f34875a;
        cVar2.mo12482c("switchInLiveRoom before");
        if (!this.f181117r || liveVideoView != this.f188139w) {
            C58924d dVar = mo89463y().f177095g;
            if (dVar != null) {
                dVar.setPlayListener(new C65367e(this, liveVideoView, lVar, aVar));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                lVar.invoke(Boolean.FALSE);
            }
            this.f188139w = liveVideoView;
            AnimatorSet animatorSet2 = this.f181111o;
            boolean z = true;
            if (animatorSet2 == null || !animatorSet2.isRunning()) {
                z = false;
            }
            if (z) {
                AnimatorSet animatorSet3 = this.f181111o;
                if (animatorSet3 != null) {
                    animatorSet3.addListener(new C65368f(this, liveVideoView));
                }
            } else {
                C58924d dVar2 = mo89463y().f177095g;
                if (dVar2 != null) {
                    dVar2.setPlayerView(liveVideoView);
                }
            }
            cVar2.mo11310b("switchInLiveRoom after");
            return;
        }
        lVar.invoke(Boolean.FALSE);
        Log.m105924i(this.f181104e, "switchInLiveRoom skipped by float view is detached.");
    }

    /* renamed from: j */
    public void mo84325j(C62621b bVar) {
        C87412m.m108594g(bVar, "builder");
        if (mo89463y().f177078k) {
            int color = this.f181103d.getResources().getColor(C0966R.color.ahe);
            int color2 = this.f181103d.getResources().getColor(C0966R.color.f3131gg);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C65370d(this));
            bVar.mo87661a(ofFloat);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(color2)});
            ofObject.addUpdateListener(new C65371e(this));
            bVar.mo87661a(ofObject);
            return;
        }
        super.mo84325j(bVar);
        int color3 = this.f181103d.getResources().getColor(C0966R.color.ahe);
        int color4 = this.f181103d.getResources().getColor(C0966R.color.f3131gg);
        C62295l lVar = this.f188138v;
        float f = 1.0f;
        float scaleX = lVar != null ? lVar.getScaleX() : 1.0f;
        C62295l lVar2 = this.f188138v;
        if (lVar2 != null) {
            f = lVar2.getScaleY();
        }
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color3), Integer.valueOf(color4)});
        ofObject2.addUpdateListener(new C65365c(this));
        bVar.mo87661a(ofObject2);
        if (C66114a.f190029a.mo90154f(mo89463y()) || mo88668x().f177089a == C61401a.FINDER) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat2.addUpdateListener(new C65363a(this, scaleX, f));
            bVar.mo87661a(ofFloat2);
            return;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat3.addUpdateListener(new C65364b(this));
        bVar.mo87661a(ofFloat3);
    }

    /* renamed from: k */
    public void mo84326k() {
        if (mo89463y().f177078k) {
            FrameLayout frameLayout = this.f181118s;
            WindowManager.LayoutParams a = C66114a.f190029a.mo90150a();
            a.height = this.f181106g;
            C13598b0 b0Var = C13598b0.f38549a;
            ((WindowManager) ((C36570n) this.f188140x).getValue()).addView(frameLayout, a);
            this.f181117r = false;
            return;
        }
        super.mo84326k();
    }

    /* renamed from: m */
    public Rect mo84327m() {
        int[] iArr = new int[2];
        C66114a aVar = C66114a.f190029a;
        View view = this.f181116q;
        C87412m.m108591d(view);
        aVar.mo90152d(view, iArr);
        if (mo89463y().f177089a != C61401a.FINDER) {
            View view2 = this.f181116q;
            C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view2;
            C62292g y = mo89463y();
            int i = iArr[0];
            y.f177096h = new Rect(i, iArr[1], viewGroup.getWidth() + i, iArr[1] + viewGroup.getHeight());
        } else if (mo89463y().f177094f >= 1.0f) {
            int i2 = (int) ((((float) this.f181105f) * 1.0f) / mo89463y().f177094f);
            int i3 = ((this.f181106g - i2) / 2) + iArr[1];
            mo89463y().f177096h = new Rect(0, i3, this.f181105f, i2 + i3);
        } else {
            mo89463y().f177096h = new Rect(0, 0, this.f181105f, this.f181106g);
        }
        return mo89463y().f177096h;
    }

    /* renamed from: n */
    public Rect mo84328n() {
        return (mo88668x().f177089a != C61401a.FINDER || C66114a.f190029a.mo90154f(mo88668x())) ? C66114a.m77925b(C66114a.f190029a, mo88668x(), (Point) null, 2, (Object) null) : mo84327m();
    }

    /* renamed from: p */
    public void mo84332p() {
        C13598b0 b0Var;
        Log.m105924i(this.f181104e, "detachFloatView view: " + this.f181118s + " isFloatWindowEnter: " + mo89463y().f177078k);
        this.f181117r = true;
        FrameLayout frameLayout = this.f181118s;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener((View.OnTouchListener) null);
        }
        if (!mo89463y().f177078k) {
            C62295l lVar = this.f188138v;
            C87412m.m108591d(lVar);
            Log.m105924i(this.f181104e, "detachMaskView videoView:" + lVar + " surfaceTexture:" + lVar.getSurfaceTexture());
            lVar.setSurfaceTextureListener(new C62295l.C62296a("detachMaskView", true));
            ViewParent parent = lVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(lVar);
            }
            if (viewGroup != null) {
                viewGroup.addView(lVar);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w(this.f181104e, "liveView is null.");
            }
            View view = this.f181116q;
            C87412m.m108591d(view);
            View rootView = view.getRootView();
            View findViewWithTag = rootView.findViewWithTag("fluent_view_tag");
            if (findViewWithTag != null) {
                findViewWithTag.setOnTouchListener((View.OnTouchListener) null);
            }
            ((ViewGroup) rootView).removeView(findViewWithTag);
        } else {
            C66114a aVar = C66114a.f190029a;
            try {
                new C65366d(this).invoke();
            } catch (Throwable th) {
                Log.m105921e("FinderLiveFluentUtil", "safeInvoke exception ", th);
            }
        }
        this.f188139w = null;
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchOutLiveDirector";
    }

    /* renamed from: t */
    public long mo84334t() {
        return (mo88668x().f177089a != C61401a.FINDER || C66114a.f190029a.mo90154f(mo88668x())) ? 240 : 0;
    }

    /* renamed from: v */
    public void mo84339v() {
        TextureView textureView = mo89463y().f177077j;
        textureView.setSurfaceTextureListener(new C62295l.C62296a("liveView surfaceTexture", false));
        String str = this.f181104e;
        Log.m105924i(str, "attachMaskView surfaceTexture:" + textureView.getSurfaceTexture());
        C62292g y = mo89463y();
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        C87412m.m108591d(surfaceTexture);
        y.f177076i = surfaceTexture;
        C62295l lVar = new C62295l(this.f181103d);
        SurfaceTexture surfaceTexture2 = textureView.getSurfaceTexture();
        C87412m.m108591d(surfaceTexture2);
        lVar.setSurfaceTexture(surfaceTexture2);
        if (mo89463y().f177078k) {
            int i = mo89463y().f177092d;
            int i2 = mo89463y().f177093e;
            lVar.f177097d = i;
            lVar.f177098e = i2;
            lVar.mo87364a(mo88660q().width(), mo88660q().height());
        } else if (C66114a.f190029a.mo90154f(mo89463y()) || mo88668x().f177089a == C61401a.FINDER) {
            lVar.setScaleX((mo89463y().f177094f * ((float) mo88660q().height())) / ((float) mo88660q().width()));
        } else {
            int i3 = mo89463y().f177092d;
            int i4 = mo89463y().f177093e;
            lVar.f177097d = i3;
            lVar.f177098e = i4;
            lVar.mo87364a(mo88660q().width(), mo88660q().height());
        }
        String str2 = this.f181104e;
        Log.m105924i(str2, "createTexture scaleX： " + lVar.getScaleX() + " scaleY: " + lVar.getScaleY() + " videoRate: " + mo89463y().f177094f + " with: " + mo88660q().width() + " height: " + mo88660q().height());
        this.f188138v = lVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.f181119t;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.addView(this.f188138v, layoutParams);
        }
        C66114a.f190029a.mo90155g(textureView);
    }

    /* renamed from: y */
    public final C62292g mo89463y() {
        return (C62292g) mo88668x();
    }
}
