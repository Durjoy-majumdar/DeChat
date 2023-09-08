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

/* renamed from: tr1.i */
public final class C78080i extends C75979a {

    /* renamed from: tr1.i$a */
    public static final class C78081a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C78080i f228864d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f228865e;

        /* renamed from: f */
        public final /* synthetic */ View f228866f;

        /* renamed from: g */
        public final /* synthetic */ ViewPropertyAnimator f228867g;

        public C78081a(C78080i iVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f228864d = iVar;
            this.f228865e = zVar;
            this.f228866f = view;
            this.f228867g = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            C75990e.m91287a(this.f228866f);
            this.f228867g.setListener((Animator.AnimatorListener) null);
            this.f228864d.mo17319h(this.f228865e);
            this.f228864d.f222787o.remove(this.f228865e);
            this.f228864d.mo106200F();
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animator");
            this.f228864d.getClass();
        }
    }

    /* renamed from: tr1.i$b */
    public static final class C78082b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C78080i f228868d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f228869e;

        /* renamed from: f */
        public final /* synthetic */ View f228870f;

        /* renamed from: g */
        public final /* synthetic */ ViewPropertyAnimator f228871g;

        public C78082b(C78080i iVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f228868d = iVar;
            this.f228869e = zVar;
            this.f228870f = view;
            this.f228871g = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animation");
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            C75990e.m91287a(this.f228870f);
            this.f228871g.setListener((Animator.AnimatorListener) null);
            this.f228868d.mo91176x(this.f228869e);
            this.f228868d.f222789q.remove(this.f228869e);
            this.f228868d.mo106200F();
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animator");
            this.f228868d.mo91174B(this.f228869e);
        }
    }

    /* renamed from: C */
    public void mo106197C(RecyclerView.C16631z zVar) {
        C87412m.m108591d(zVar);
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder!!.itemView");
        ViewPropertyAnimator animate = view.animate();
        this.f222787o.add(zVar);
        animate.alpha(1.0f).translationY(0.0f).setStartDelay(0).setDuration(260).setListener(new C78081a(this, zVar, view, animate)).start();
    }

    /* renamed from: D */
    public void mo106198D(RecyclerView.C16631z zVar) {
        C87412m.m108591d(zVar);
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder!!.itemView");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.3f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateRemoveImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ViewPropertyAnimator animate = view.animate();
        this.f222789q.add(zVar);
        animate.setDuration(200).alpha(0.0f).translationY(zVar.f44854d.getContext().getResources().getDimension(C0966R.dimen.f3755d6)).setStartDelay(0).setListener(new C78082b(this, zVar, view, animate)).start();
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
        aVar.mo10233c(Float.valueOf(0.56f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/animation/RefreshItemAnimation", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view3 = zVar.f44854d;
        view3.setTranslationY(-view3.getContext().getResources().getDimension(C0966R.dimen.f3755d6));
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
