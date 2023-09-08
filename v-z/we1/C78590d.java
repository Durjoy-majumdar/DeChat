package we1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.opensdk.utils.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p902gm.C75979a;

/* renamed from: we1.d */
public final class C78590d extends C75979a {

    /* renamed from: t */
    public final RecyclerView f230218t;

    /* renamed from: u */
    public RecyclerView.C16616j f230219u;

    /* renamed from: we1.d$a */
    public static final class C78591a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C78590d f230220d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f230221e;

        /* renamed from: f */
        public final /* synthetic */ ViewPropertyAnimator f230222f;

        public C78591a(C78590d dVar, RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator) {
            this.f230220d = dVar;
            this.f230221e = zVar;
            this.f230222f = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C78590d dVar = this.f230220d;
            View view = this.f230221e.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            dVar.mo108581K(view);
        }

        public void onAnimationEnd(Animator animator) {
            this.f230222f.setListener((Animator.AnimatorListener) null);
            this.f230220d.mo91176x(this.f230221e);
            this.f230220d.f222789q.remove(this.f230221e);
            this.f230220d.mo106200F();
            C78590d dVar = this.f230220d;
            View view = this.f230221e.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            dVar.mo108581K(view);
            Log.m99045i("RecyclerFadeInDownAnimator", "remove onAnimationEnd recover animate originAnimate: " + this.f230220d.f230219u);
            C78590d dVar2 = this.f230220d;
            dVar2.f230218t.setItemAnimator(dVar2.f230219u);
        }

        public void onAnimationStart(Animator animator) {
            this.f230220d.mo91174B(this.f230221e);
        }
    }

    public C78590d(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f230218t = recyclerView;
        this.f230219u = recyclerView.getItemAnimator();
    }

    /* renamed from: D */
    public void mo106198D(RecyclerView.C16631z zVar) {
        if (zVar != null) {
            ViewPropertyAnimator animate = zVar.f44854d.animate();
            animate.translationY(((float) (-zVar.f44854d.getHeight())) * 1.0f);
            animate.setDuration(300);
            animate.setInterpolator(animate.getInterpolator());
            animate.setListener(new C78591a(this, zVar, animate));
            animate.setStartDelay(mo17324m());
            animate.start();
        }
    }

    /* renamed from: K */
    public final void mo108581K(View view) {
        C87412m.m108594g(view, "v");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/live/RecyclerFadeInDownAnimator", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/live/RecyclerFadeInDownAnimator", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
        view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
        view.animate().setInterpolator((TimeInterpolator) null).setStartDelay(0);
    }
}
