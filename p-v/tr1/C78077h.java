package tr1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p902gm.C75979a;
import p902gm.C75990e;

/* renamed from: tr1.h */
public final class C78077h extends C75979a {

    /* renamed from: tr1.h$a */
    public static final class C78078a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C78077h f228856d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f228857e;

        /* renamed from: f */
        public final /* synthetic */ View f228858f;

        /* renamed from: g */
        public final /* synthetic */ ViewPropertyAnimator f228859g;

        public C78078a(C78077h hVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f228856d = hVar;
            this.f228857e = zVar;
            this.f228858f = view;
            this.f228859g = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            C75990e.m91287a(this.f228858f);
            this.f228859g.setListener((Animator.AnimatorListener) null);
            this.f228856d.mo17319h(this.f228857e);
            this.f228856d.f222787o.remove(this.f228857e);
            this.f228856d.mo106200F();
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animator");
            this.f228856d.getClass();
        }
    }

    /* renamed from: tr1.h$b */
    public static final class C78079b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C78077h f228860d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f228861e;

        /* renamed from: f */
        public final /* synthetic */ View f228862f;

        /* renamed from: g */
        public final /* synthetic */ ViewPropertyAnimator f228863g;

        public C78079b(C78077h hVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f228860d = hVar;
            this.f228861e = zVar;
            this.f228862f = view;
            this.f228863g = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animation");
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            C75990e.m91287a(this.f228862f);
            this.f228863g.setListener((Animator.AnimatorListener) null);
            this.f228860d.mo91176x(this.f228861e);
            this.f228860d.f222789q.remove(this.f228861e);
            this.f228860d.mo106200F();
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animator");
            this.f228860d.mo91174B(this.f228861e);
        }
    }

    /* renamed from: C */
    public void mo106197C(RecyclerView.C16631z zVar) {
        C87412m.m108591d(zVar);
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder!!.itemView");
        ViewPropertyAnimator animate = view.animate();
        this.f222787o.add(zVar);
        animate.alpha(1.0f).setStartDelay(0).setDuration(260).setListener(new C78078a(this, zVar, view, animate)).start();
    }

    /* renamed from: D */
    public void mo106198D(RecyclerView.C16631z zVar) {
        C87412m.m108591d(zVar);
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder!!.itemView");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.3f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ViewPropertyAnimator animate = view.animate();
        this.f222789q.add(zVar);
        animate.setDuration(200).alpha(0.0f).translationY(zVar.f44854d.getContext().getResources().getDimension(C0966R.dimen.f3755d6)).setStartDelay(0).setListener(new C78079b(this, zVar, view, animate)).start();
    }

    /* renamed from: I */
    public long mo106203I() {
        return 0;
    }

    /* renamed from: l */
    public long mo17323l() {
        return 260;
    }

    /* renamed from: m */
    public long mo17324m() {
        return 200;
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        mo106204J(zVar);
        if (zVar.f44859i == -3) {
            return true;
        }
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/animation/RefreshFadeInAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222781i.add(zVar);
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        mo106204J(zVar);
        this.f222780h.add(zVar);
        return true;
    }
}
