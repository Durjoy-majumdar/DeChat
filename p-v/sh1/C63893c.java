package sh1;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C60192p2;
import j20.C117292a;
import java.util.ArrayList;
import ph1.C62294j;
import rh1.C63436b;
import rx3.C13598b0;
import vc1.C37715b;

/* renamed from: sh1.c */
public abstract class C63893c extends C63891a implements C63436b {

    /* renamed from: p */
    public C62294j f181115p;

    /* renamed from: q */
    public View f181116q;

    /* renamed from: r */
    public boolean f181117r;

    /* renamed from: s */
    public FrameLayout f181118s;

    /* renamed from: t */
    public RoundedCornerFrameLayout f181119t;

    /* renamed from: u */
    public ViewGroup f181120u;

    /* renamed from: sh1.c$a */
    public static final class C63894a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C63893c f181121d;

        public C63894a(C63893c cVar) {
            this.f181121d = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/fluent/director/base/BaseSwitchOutDirector$createTransitionContainerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Log.m105924i(this.f181121d.f181104e, "onTouch");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/fluent/director/base/BaseSwitchOutDirector$createTransitionContainerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63893c(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d */
    public void mo84319d(C62294j jVar) {
        C87412m.m108594g(jVar, "switchLiveParams");
        this.f181115p = jVar;
        this.f181116q = jVar.f177091c;
        mo88657l();
    }

    /* renamed from: e */
    public boolean mo84320e() {
        return this.f181117r;
    }

    /* renamed from: g */
    public void mo84322g() {
        AnimatorSet animatorSet = this.f181111o;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        mo84332p();
    }

    /* renamed from: h */
    public void mo84323h(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        mo88662u(aVar);
    }

    /* renamed from: k */
    public void mo84326k() {
        View view = this.f181116q;
        ViewGroup viewGroup = null;
        KeyEvent.Callback rootView = view != null ? view.getRootView() : null;
        if (rootView instanceof ViewGroup) {
            viewGroup = (ViewGroup) rootView;
        }
        this.f181120u = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f181105f, this.f181106g);
        ViewGroup viewGroup2 = this.f181120u;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f181118s, layoutParams);
        }
        this.f181117r = false;
    }

    /* renamed from: o */
    public View mo84329o() {
        FrameLayout frameLayout = new FrameLayout(this.f181103d);
        this.f181118s = frameLayout;
        frameLayout.setTag("fluent_view_tag");
        FrameLayout frameLayout2 = this.f181118s;
        if (frameLayout2 != null) {
            frameLayout2.setTag(((C60192p2) C86312j.m106911c(C60192p2.class)).mo85191Mh(), Long.valueOf(mo88668x().f177090b));
        }
        FrameLayout frameLayout3 = this.f181118s;
        if (frameLayout3 != null) {
            frameLayout3.setBackground(this.f181103d.getResources().getDrawable(mo88667w()));
        }
        FrameLayout frameLayout4 = this.f181118s;
        if (frameLayout4 != null) {
            frameLayout4.setOnTouchListener(new C63894a(this));
        }
        this.f181119t = new RoundedCornerFrameLayout(this.f181103d);
        mo84339v();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo88660q().width(), mo88660q().height());
        layoutParams.leftMargin = mo88660q().left;
        layoutParams.topMargin = mo88660q().top;
        FrameLayout frameLayout5 = this.f181118s;
        if (frameLayout5 != null) {
            frameLayout5.addView(this.f181119t, layoutParams);
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.f181119t;
        C87412m.m108591d(roundedCornerFrameLayout);
        return roundedCornerFrameLayout;
    }

    /* renamed from: p */
    public abstract void mo84332p();

    /* renamed from: v */
    public abstract void mo84339v();

    /* renamed from: w */
    public int mo88667w() {
        return C37715b.f99914a.mo61298a() ? C0966R.color.UN_BW_0_Alpha_0_3 : C0966R.color.BW_100_Alpha_0_3;
    }

    /* renamed from: x */
    public final C62294j mo88668x() {
        C62294j jVar = this.f181115p;
        if (jVar != null) {
            return jVar;
        }
        C87412m.m108603p("transitionParams");
        throw null;
    }
}
