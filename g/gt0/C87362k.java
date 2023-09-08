package gt0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import p1042u.C118556h;
import p1042u.C90590d;
import p225rc.C89917h;

/* renamed from: gt0.k */
public final class C87362k extends RelativeLayout implements C87375o0 {

    /* renamed from: d */
    public int f253196d = 0;

    /* renamed from: e */
    public final C76063l f253197e;

    /* renamed from: f */
    public final MMHandler f253198f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public final C87354h0 f253199g = new C87354h0(this);

    /* renamed from: h */
    public final LinkedList<C87370k0> f253200h = new LinkedList<>();

    /* renamed from: i */
    public final View.OnClickListener f253201i;

    /* renamed from: j */
    public final Runnable f253202j;

    /* renamed from: n */
    public C87370k0 f253203n;

    /* renamed from: o */
    public C87370k0 f253204o;

    /* renamed from: p */
    public boolean f253205p;

    /* renamed from: q */
    public Set<C87373m0> f253206q;

    /* renamed from: r */
    public final Set<C87372l0> f253207r;

    /* renamed from: s */
    public final Set<C87372l0> f253208s;

    /* renamed from: t */
    public boolean f253209t;

    /* renamed from: u */
    public boolean f253210u;

    /* renamed from: v */
    public C87378p0 f253211v;

    /* renamed from: w */
    public boolean f253212w;

    /* renamed from: gt0.k$a */
    public class C87363a implements View.OnClickListener {
        public C87363a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87362k kVar = C87362k.this;
            if (view == kVar) {
                C87370k0 peekLast = kVar.f253200h.peekLast();
                if (peekLast == null) {
                    kVar.setVisibility(8);
                } else if (peekLast.mo36950k()) {
                    peekLast.onCancel();
                    kVar.mo121777a(peekLast);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gt0.k$b */
    public class C87364b implements Runnable {
        public C87364b() {
        }

        public void run() {
            C87362k.this.setBackgroundColor(0);
            C87362k.this.removeAllViews();
            C87362k.this.setVisibility(4);
        }
    }

    /* renamed from: gt0.k$c */
    public class C87365c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87370k0 f253215d;

        public C87365c(C87370k0 k0Var) {
            this.f253215d = k0Var;
        }

        public void run() {
            C87362k.this.mo121778b(this.f253215d);
        }
    }

    /* renamed from: gt0.k$d */
    public class C87366d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C87370k0 f253217a;

        public C87366d(C87370k0 k0Var) {
            this.f253217a = k0Var;
        }

        public void onAnimationEnd(Animation animation) {
            boolean z;
            Log.m105924i("MicroMsg.AppBrandDialogContainerLayout", "on dialogView start animation end");
            C87362k kVar = C87362k.this;
            if (!kVar.f253212w) {
                kVar.f253212w = true;
                z = true;
            } else {
                z = false;
            }
            int size = kVar.f253200h.size();
            C87370k0 k0Var = null;
            C87370k0 k0Var2 = size >= 1 ? kVar.f253200h.get(size - 1) : null;
            if (size >= 2) {
                k0Var = kVar.f253200h.get(size - 2);
            }
            C87378p0 p0Var = kVar.f253211v;
            if (p0Var != null) {
                p0Var.mo106271b(z, k0Var2, k0Var);
            }
            this.f253217a.mo36937b();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: gt0.k$e */
    public class C87367e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87370k0 f253219d;

        public C87367e(C87370k0 k0Var) {
            this.f253219d = k0Var;
        }

        public void run() {
            C87362k.this.mo121777a(this.f253219d);
        }
    }

    /* renamed from: gt0.k$f */
    public class C87368f extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f253221d;

        /* renamed from: e */
        public final /* synthetic */ C87370k0 f253222e;

        /* renamed from: gt0.k$f$a */
        public class C87369a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C87370k0 f253224d;

            public C87369a(C87370k0 k0Var) {
                this.f253224d = k0Var;
            }

            public void run() {
                C87368f fVar = C87368f.this;
                C87362k.this.removeView(fVar.f253221d);
                C87362k kVar = C87362k.this;
                kVar.f253209t = true;
                Iterator it = ((C90590d) kVar.f253207r).iterator();
                while (it.hasNext()) {
                    ((C87372l0) it.next()).mo22185a(C87368f.this.f253222e);
                }
                C87362k kVar2 = C87362k.this;
                kVar2.f253209t = false;
                if (!((C90590d) kVar2.f253208s).isEmpty()) {
                    C87362k kVar3 = C87362k.this;
                    ((C90590d) kVar3.f253207r).removeAll(kVar3.f253208s);
                    ((C90590d) C87362k.this.f253208s).clear();
                }
                C87370k0 k0Var = this.f253224d;
                if (k0Var != null) {
                    k0Var.mo36937b();
                }
            }
        }

        public C87368f(View view, C87370k0 k0Var) {
            this.f253221d = view;
            this.f253222e = k0Var;
        }

        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            boolean z;
            Log.m105924i("MicroMsg.AppBrandDialogContainerLayout", "on dialogView exit animation end");
            C87362k kVar = C87362k.this;
            int size = kVar.f253200h.size();
            if (1 == size) {
                kVar.f253212w = false;
                z = true;
            } else {
                z = false;
            }
            C87370k0 k0Var = size >= 1 ? kVar.f253200h.get(size - 1) : null;
            C87370k0 k0Var2 = size >= 2 ? kVar.f253200h.get(size - 2) : null;
            C87378p0 p0Var = kVar.f253211v;
            if (p0Var != null) {
                p0Var.mo106270a(z, k0Var, k0Var2);
            }
            View view = this.f253221d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C87362k.this.f253200h.remove(this.f253222e);
            C87362k kVar2 = C87362k.this;
            kVar2.f253203n = null;
            kVar2.post(new C87369a(k0Var2));
        }
    }

    public C87362k(Context context, C76063l lVar) {
        super(context);
        C87363a aVar = new C87363a();
        this.f253201i = aVar;
        this.f253202j = new C87364b();
        this.f253205p = false;
        this.f253206q = new C90590d();
        this.f253207r = new C90590d();
        this.f253208s = new C90590d();
        this.f253209t = false;
        this.f253210u = true;
        this.f253211v = null;
        this.f253212w = false;
        setVisibility(4);
        setBackgroundColor(0);
        setOnClickListener(aVar);
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            this.f253196d = windowManager.getDefaultDisplay().getRotation();
        }
        lVar = lVar == null ? new C76063l() : lVar;
        lVar.getClass();
        C76062j jVar = lVar.f222910a;
        jVar.getClass();
        jVar.f222909b.put(this, new C76061i(jVar, this));
        this.f253197e = lVar;
    }

    /* renamed from: a */
    public void mo121777a(C87370k0 k0Var) {
        AnimatorSet animatorSet;
        if (k0Var != null && k0Var.getContentView() != null) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.f253198f.post(new C87367e(k0Var));
            } else if (k0Var.getContentView().getParent() == this && this.f253203n != k0Var) {
                this.f253203n = k0Var;
                if (this.f253204o == k0Var) {
                    this.f253204o = null;
                }
                View contentView = k0Var.getContentView();
                contentView.animate().cancel();
                contentView.clearAnimation();
                if (k0Var.getPosition() == 2) {
                    AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                    animatorSet = new AnimatorSet();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(contentView, "translationY", new float[]{0.0f, (float) contentView.getHeight()}).setDuration(200);
                    duration.setInterpolator(accelerateInterpolator);
                    animatorSet.playTogether(new Animator[]{duration});
                } else {
                    Interpolator loadInterpolator = AnimationUtils.loadInterpolator(contentView.getContext(), C0966R.C0968anim.f2363ay);
                    Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(contentView.getContext(), C0966R.C0968anim.f2362ax);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(contentView, "scaleX", new float[]{1.0f, 0.9f}).setDuration(220);
                    duration2.setInterpolator(loadInterpolator);
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(contentView, "scaleY", new float[]{1.0f, 0.9f}).setDuration(220);
                    duration3.setInterpolator(loadInterpolator);
                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(contentView, "alpha", new float[]{1.0f, 0.0f}).setDuration(150);
                    duration4.setInterpolator(loadInterpolator2);
                    animatorSet2.playTogether(new Animator[]{duration2, duration3, duration4});
                    animatorSet = animatorSet2;
                }
                animatorSet.addListener(new C87368f(contentView, k0Var));
                animatorSet.start();
                if (this.f253200h.size() <= 1) {
                    this.f253199g.mo121765a(0, this.f253202j);
                }
                if (!((C90590d) this.f253206q).isEmpty() && this.f253205p) {
                    Iterator it = ((C90590d) this.f253206q).iterator();
                    while (it.hasNext()) {
                        ((C87373m0) it.next()).mo116214a(Boolean.FALSE);
                    }
                }
                this.f253205p = false;
            }
        }
    }

    /* renamed from: b */
    public void mo121778b(C87370k0 k0Var) {
        RelativeLayout.LayoutParams layoutParams;
        ValueAnimator valueAnimator;
        if (k0Var != null) {
            Log.m105925i("MicroMsg.AppBrandDialogContainerLayout", "showDialog dialog[%s] tid[%d]", k0Var.getClass().getName(), Long.valueOf(Thread.currentThread().getId()));
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.f253198f.post(new C87365c(k0Var));
                return;
            }
            C89917h.m112458a(getContext());
            ValueAnimator valueAnimator2 = this.f253199g.f253179c;
            if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = this.f253199g.f253179c) != null) {
                valueAnimator.cancel();
            }
            View contentView = k0Var.getContentView();
            if (contentView == null) {
                Log.m105929w("MicroMsg.AppBrandDialogContainerLayout", "showDialog NULL dialogView from dialog[%s], stack=%s", k0Var, android.util.Log.getStackTraceString(new Throwable()));
                return;
            }
            if (contentView.getParent() != this) {
                if (contentView.getParent() != null) {
                    ((ViewGroup) contentView.getParent()).removeView(contentView);
                }
                if (k0Var.getPosition() == 2) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else {
                    layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(13);
                }
                addView(contentView, layoutParams);
                if (this.f253204o != k0Var) {
                    contentView.clearAnimation();
                    Animation loadAnimation = k0Var.getPosition() == 2 ? AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2421cm) : AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2349ad);
                    loadAnimation.setAnimationListener(new C87366d(k0Var));
                    contentView.startAnimation(loadAnimation);
                }
                this.f253204o = k0Var;
            }
            if (contentView.getVisibility() != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = contentView;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout", "showDialog", "(Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout", "showDialog", "(Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            contentView.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(0).scaleX(1.0f).scaleY(1.0f).start();
            contentView.setOnClickListener(this.f253201i);
            this.f253200h.add(k0Var);
            k0Var.mo36949j(this);
            setVisibility(0);
            if (this.f253210u) {
                bringToFront();
            }
            this.f253199g.mo121765a(Color.argb(127, 0, 0, 0), (Runnable) null);
            if (!((C90590d) this.f253206q).isEmpty() && !this.f253205p) {
                Iterator it = ((C90590d) this.f253206q).iterator();
                while (true) {
                    C118556h.C118557a aVar2 = (C118556h.C118557a) it;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    ((C87373m0) aVar2.next()).mo116214a(Boolean.TRUE);
                }
            }
            this.f253205p = true;
        }
    }

    /* renamed from: c */
    public void mo121779c(C87372l0 l0Var) {
        if (l0Var != null) {
            if (!this.f253209t) {
                ((C90590d) this.f253207r).remove(l0Var);
            } else {
                ((C90590d) this.f253208s).add(l0Var);
            }
        }
    }

    /* renamed from: d */
    public void mo121780d(C87372l0 l0Var) {
        if (l0Var != null) {
            ((C90590d) this.f253207r).add(l0Var);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean mo121782e() {
        C87370k0 peekLast = this.f253200h.peekLast();
        if (peekLast == null) {
            setVisibility(8);
            return false;
        } else if (peekLast.mo36953w() || !peekLast.mo36951m()) {
            return true;
        } else {
            peekLast.onCancel();
            mo121777a(peekLast);
            return true;
        }
    }

    /* renamed from: f */
    public void mo121783f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f253199g.f253179c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = this.f253199g.f253179c) != null) {
            valueAnimator.cancel();
        }
        if (!this.f253200h.isEmpty()) {
            while (!this.f253200h.isEmpty()) {
                C87370k0 pollFirst = this.f253200h.pollFirst();
                if (!(pollFirst == null || pollFirst.getContentView() == null)) {
                    View contentView = pollFirst.getContentView();
                    contentView.animate().cancel();
                    contentView.clearAnimation();
                }
            }
        }
        this.f253203n = null;
        this.f253204o = null;
        this.f253209t = false;
        ((C90590d) this.f253207r).clear();
        ((C90590d) this.f253208s).clear();
        removeAllViewsInLayout();
        this.f253198f.removeCallbacksAndMessages((Object) null);
        ((C87364b) this.f253202j).run();
    }

    public C87370k0 getCurrentDialog() {
        return this.f253200h.peekLast();
    }

    public C76063l getShareContext() {
        return this.f253197e;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int rotation;
        super.onConfigurationChanged(configuration);
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null && this.f253196d != (rotation = windowManager.getDefaultDisplay().getRotation())) {
            this.f253196d = rotation;
            Iterator<C87370k0> it = this.f253200h.iterator();
            while (it.hasNext()) {
                it.next().mo36936A(this.f253196d);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (this.f253200h.size() == 0) {
            this.f253199g.mo121765a(0, this.f253202j);
        }
    }

    public void setListener(C87378p0 p0Var) {
        this.f253211v = p0Var;
    }

    public void setShouldBringSelfToFrontWhenDialogShown(boolean z) {
        this.f253210u = z;
    }
}
