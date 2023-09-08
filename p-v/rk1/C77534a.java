package rk1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p902gm.C75979a;
import p902gm.C75990e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rk1.a */
public final class C77534a extends C75979a {

    /* renamed from: t */
    public final C13601g f226053t = C36568h.m40985a(C36331c.f96696d);

    /* renamed from: rk1.a$c */
    public static final class C36331c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C36331c f96696d = new C36331c();

        public C36331c() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(-MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3757d9));
        }
    }

    /* renamed from: rk1.a$a */
    public static final class C77535a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C77534a f226054d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f226055e;

        /* renamed from: f */
        public final /* synthetic */ View f226056f;

        /* renamed from: g */
        public final /* synthetic */ AnimatorSet f226057g;

        public C77535a(C77534a aVar, RecyclerView.C16631z zVar, View view, AnimatorSet animatorSet) {
            this.f226054d = aVar;
            this.f226055e = zVar;
            this.f226056f = view;
            this.f226057g = animatorSet;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            C75990e.m91287a(this.f226056f);
            this.f226057g.removeListener(this);
            this.f226054d.mo17319h(this.f226055e);
            this.f226054d.f222787o.remove(this.f226055e);
            this.f226054d.mo106200F();
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            this.f226054d.getClass();
        }
    }

    /* renamed from: rk1.a$b */
    public static final class C77536b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C77534a f226058d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f226059e;

        /* renamed from: f */
        public final /* synthetic */ View f226060f;

        /* renamed from: g */
        public final /* synthetic */ AnimatorSet f226061g;

        public C77536b(C77534a aVar, RecyclerView.C16631z zVar, View view, AnimatorSet animatorSet) {
            this.f226058d = aVar;
            this.f226059e = zVar;
            this.f226060f = view;
            this.f226061g = animatorSet;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animator");
            onAnimationEnd(animator);
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animator");
            C75990e.m91287a(this.f226060f);
            this.f226061g.removeListener(this);
            this.f226058d.mo91176x(this.f226059e);
            this.f226058d.f222789q.remove(this.f226059e);
            this.f226058d.mo106200F();
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            this.f226058d.mo91174B(this.f226059e);
        }
    }

    /* renamed from: C */
    public void mo106197C(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int j = zVar.mo17363j();
        if (j < 1) {
            j = 1;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{((float) (j - 1)) * ((Number) ((C36570n) this.f226053t).getValue()).floatValue(), 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setDuration(500);
        animatorSet.addListener(new C77535a(this, zVar, view, animatorSet));
        this.f222787o.add(zVar);
        animatorSet.start();
    }

    /* renamed from: D */
    public void mo106198D(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        View view = zVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        Object tag = zVar.f44854d.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, ((float) (num != null ? num.intValue() : 0)) * ((Number) ((C36570n) this.f226053t).getValue()).floatValue()});
        ofFloat.setDuration(500);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(250);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C77536b(this, zVar, view, animatorSet));
        animatorSet.start();
        this.f222789q.add(zVar);
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
        return 260;
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        mo106204J(zVar);
        int j = zVar.mo17363j();
        if (j < 1) {
            j = 1;
        }
        zVar.f44854d.setTranslationY(((float) (j - 1)) * ((Number) ((C36570n) this.f226053t).getValue()).floatValue());
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/anim/FinderLiveMentionItemAnim", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/anim/FinderLiveMentionItemAnim", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222781i.add(zVar);
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        mo106204J(zVar);
        zVar.f44854d.setTranslationY(0.0f);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/anim/FinderLiveMentionItemAnim", "animateRemove", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/anim/FinderLiveMentionItemAnim", "animateRemove", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222780h.add(zVar);
        return true;
    }
}
