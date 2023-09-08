package sh1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import qh1.C62621b;
import rx3.C13598b0;
import wh1.C66114a;

/* renamed from: sh1.a */
public abstract class C63891a implements Animator.AnimatorListener {

    /* renamed from: d */
    public final Context f181103d;

    /* renamed from: e */
    public final String f181104e = ("Finder." + mo84333r());

    /* renamed from: f */
    public int f181105f;

    /* renamed from: g */
    public final int f181106g;

    /* renamed from: h */
    public Rect f181107h;

    /* renamed from: i */
    public Rect f181108i;

    /* renamed from: j */
    public C32224a<C13598b0> f181109j;

    /* renamed from: n */
    public View f181110n;

    /* renamed from: o */
    public AnimatorSet f181111o;

    public C63891a(Context context) {
        C87412m.m108594g(context, "context");
        this.f181103d = context;
        C66114a aVar = C66114a.f190029a;
        this.f181105f = C66114a.f190030b;
        this.f181106g = C66114a.f190031c;
    }

    /* renamed from: j */
    public void mo84325j(C62621b bVar) {
        C87412m.m108594g(bVar, "builder");
        Rect q = mo88660q();
        Rect s = mo88661s();
        float width = (((float) s.width()) * 1.0f) / ((float) q.width());
        float height = (((float) s.height()) * 1.0f) / ((float) q.height());
        float centerX = (float) (s.centerX() - q.centerX());
        float centerY = (float) (s.centerY() - q.centerY());
        String str = this.f181104e;
        Log.m105924i(str, "setTransitionAnimator sourceRect: " + q + "  targetRect: " + s + " scaleRatioX: " + width + "  scaleRatioY: " + height + "  translationX: " + centerX + "  translationY: " + centerY + ' ');
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f181110n, "scaleX", new float[]{1.0f, width});
        C87412m.m108593f(ofFloat, "ofFloat(transitionContai…aleX\", 1.0f, scaleRatioX)");
        bVar.mo87661a(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f181110n, "scaleY", new float[]{1.0f, height});
        C87412m.m108593f(ofFloat2, "ofFloat(transitionContai…aleY\", 1.0f, scaleRatioY)");
        bVar.mo87661a(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f181110n, "translationX", new float[]{0.0f, centerX});
        C87412m.m108593f(ofFloat3, "ofFloat(transitionContai…tionX\", 0f, translationX)");
        bVar.mo87661a(ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f181110n, "translationY", new float[]{0.0f, centerY});
        C87412m.m108593f(ofFloat4, "ofFloat(transitionContai…tionY\", 0f, translationY)");
        bVar.mo87661a(ofFloat4);
    }

    /* renamed from: k */
    public abstract void mo84326k();

    /* renamed from: l */
    public void mo88657l() {
        this.f181107h = mo84328n();
        this.f181108i = mo84327m();
        String str = this.f181104e;
        Log.m105924i(str, "targetRect = " + mo88661s());
        String str2 = this.f181104e;
        Log.m105924i(str2, "sourceRect = " + mo88660q());
        this.f181110n = mo84329o();
        mo84326k();
    }

    /* renamed from: m */
    public abstract Rect mo84327m();

    /* renamed from: n */
    public abstract Rect mo84328n();

    /* renamed from: o */
    public abstract View mo84329o();

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i(this.f181104e, "onAnimationEnd");
        C32224a<C13598b0> aVar = this.f181109j;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f181109j = null;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    /* renamed from: p */
    public abstract void mo84332p();

    /* renamed from: q */
    public Rect mo88660q() {
        Rect rect = this.f181108i;
        if (rect != null) {
            return rect;
        }
        C87412m.m108603p("sourceRect");
        throw null;
    }

    /* renamed from: r */
    public abstract String mo84333r();

    /* renamed from: s */
    public Rect mo88661s() {
        Rect rect = this.f181107h;
        if (rect != null) {
            return rect;
        }
        C87412m.m108603p("targetRect");
        throw null;
    }

    /* renamed from: t */
    public long mo84334t() {
        return 240;
    }

    /* renamed from: u */
    public void mo88662u(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        this.f181109j = aVar;
        C62621b bVar = new C62621b();
        mo84325j(bVar);
        ArrayList<ValueAnimator> arrayList = bVar.f177836a;
        C87412m.m108594g(arrayList, "animatorList");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(mo84334t());
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(arrayList);
        this.f181111o = animatorSet;
        animatorSet.addListener(this);
        animatorSet.start();
    }
}
