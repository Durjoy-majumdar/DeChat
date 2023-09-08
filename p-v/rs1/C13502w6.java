package rs1;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderNpsSurveyView;
import com.tencent.p014mm.plugin.finder.feed.model.C2783g0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de1.C7290r;
import di3.C86312j;
import dp1.C7450q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hi3.C87515a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p185kq.C10383h;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C49855ij1;
import te3.C49999jj1;
import te3.C50668oe1;
import te3.C50816pe1;
import te3.C50949qe1;
import te3.C51096re1;
import wc1.C15064b;

@C113200q(initialMode = 2)
/* renamed from: rs1.w6 */
public final class C13502w6 extends UIComponent {

    /* renamed from: r */
    public static final C13503a f38267r = new C13503a((C8480h) null);

    /* renamed from: s */
    public static final Set<Long> f38268s = new LinkedHashSet();

    /* renamed from: t */
    public static final ConcurrentHashMap<Long, C50816pe1> f38269t = new ConcurrentHashMap<>();

    /* renamed from: u */
    public static ConcurrentHashMap<Long, C51096re1> f38270u = new ConcurrentHashMap<>();

    /* renamed from: v */
    public static final ConcurrentHashMap<Long, C13504b> f38271v = new ConcurrentHashMap<>();

    /* renamed from: d */
    public WeakReference<C60905o> f38272d;

    /* renamed from: e */
    public final MMHandler f38273e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public final MMHandler f38274f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public int f38275g;

    /* renamed from: h */
    public long f38276h;

    /* renamed from: i */
    public boolean f38277i = true;

    /* renamed from: j */
    public boolean f38278j = true;

    /* renamed from: n */
    public boolean f38279n = true;

    /* renamed from: o */
    public final ConcurrentHashMap<Integer, Integer> f38280o = new ConcurrentHashMap<>();

    /* renamed from: p */
    public boolean f38281p;

    /* renamed from: q */
    public long f38282q;

    /* renamed from: rs1.w6$a */
    public static final class C13503a {
        public C13503a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C13502w6 mo12927a(Context context) {
            C87412m.m108594g(context, "context");
            return (C13502w6) C39818r.f106831a.mo62443b(context).mo62449e(C13502w6.class);
        }
    }

    /* renamed from: rs1.w6$b */
    public static final class C13504b {

        /* renamed from: a */
        public C13505c f38283a;

        /* renamed from: b */
        public long f38284b;

        /* renamed from: c */
        public int f38285c;

        /* renamed from: d */
        public int f38286d;

        /* renamed from: e */
        public final List<Long> f38287e;

        /* renamed from: f */
        public final List<Long> f38288f;

        /* renamed from: g */
        public final Map<Long, Long> f38289g;

        /* renamed from: h */
        public C50949qe1 f38290h;

        public C13504b(C13505c cVar, long j, int i, int i2, List<Long> list, List<Long> list2, Map<Long, Long> map, C50949qe1 qe12, int i3, C8480h hVar) {
            i = (i3 & 4) != 0 ? 0 : i;
            i2 = (i3 & 8) != 0 ? 0 : i2;
            list = (i3 & 16) != 0 ? new ArrayList<>() : list;
            list2 = (i3 & 32) != 0 ? new ArrayList<>() : list2;
            map = (i3 & 64) != 0 ? new LinkedHashMap<>() : map;
            qe12 = (i3 & 128) != 0 ? null : qe12;
            C87412m.m108594g(cVar, "showState");
            C87412m.m108594g(list, "shownQuestionIdList");
            C87412m.m108594g(list2, "selectedAnswerIdList");
            C87412m.m108594g(map, "questionShowTimeMap");
            this.f38283a = cVar;
            this.f38284b = j;
            this.f38285c = i;
            this.f38286d = i2;
            this.f38287e = list;
            this.f38288f = list2;
            this.f38289g = map;
            this.f38290h = qe12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13504b)) {
                return false;
            }
            C13504b bVar = (C13504b) obj;
            return this.f38283a == bVar.f38283a && this.f38284b == bVar.f38284b && this.f38285c == bVar.f38285c && this.f38286d == bVar.f38286d && C87412m.m108589b(this.f38287e, bVar.f38287e) && C87412m.m108589b(this.f38288f, bVar.f38288f) && C87412m.m108589b(this.f38289g, bVar.f38289g) && C87412m.m108589b(this.f38290h, bVar.f38290h);
        }

        public int hashCode() {
            long j = this.f38284b;
            int hashCode = ((((((((((((this.f38283a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f38285c) * 31) + this.f38286d) * 31) + this.f38287e.hashCode()) * 31) + this.f38288f.hashCode()) * 31) + this.f38289g.hashCode()) * 31;
            C50949qe1 qe12 = this.f38290h;
            return hashCode + (qe12 == null ? 0 : qe12.hashCode());
        }

        public String toString() {
            return "NpsShowInfo(showState=" + this.f38283a + ", startShowTime=" + this.f38284b + ", showCount=" + this.f38285c + ", index=" + this.f38286d + ", shownQuestionIdList=" + this.f38287e + ", selectedAnswerIdList=" + this.f38288f + ", questionShowTimeMap=" + this.f38289g + ", showingQuestion=" + this.f38290h + ')';
        }
    }

    /* renamed from: rs1.w6$c */
    public enum C13505c {
        HIDE,
        SHOWING_HEADER,
        SHOWING_CONTENT,
        SHOWING_SCORE
    }

    /* renamed from: rs1.w6$d */
    public static final class C13506d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38296d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f38297e;

        public C13506d(C13502w6 w6Var, C60905o oVar) {
            this.f38296d = w6Var;
            this.f38297e = oVar;
        }

        public final void run() {
            this.f38296d.mo12922k3(this.f38297e, (C32224a<C13598b0>) null);
        }
    }

    /* renamed from: rs1.w6$e */
    public static final class C13507e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38298d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f38299e;

        public C13507e(C13502w6 w6Var, C60905o oVar) {
            this.f38298d = w6Var;
            this.f38299e = oVar;
        }

        public final void run() {
            this.f38298d.mo12921j3(this.f38299e, (C32224a<C13598b0>) null);
        }
    }

    /* renamed from: rs1.w6$f */
    public static final class C13508f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38300d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f38301e;

        public C13508f(C13502w6 w6Var, C60905o oVar) {
            this.f38300d = w6Var;
            this.f38301e = oVar;
        }

        public final void run() {
            this.f38300d.mo12923l3(this.f38301e, (C32224a<C13598b0>) null);
        }
    }

    /* renamed from: rs1.w6$g */
    public static final class C13509g extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f38302d;

        /* renamed from: e */
        public final /* synthetic */ int f38303e;

        /* renamed from: f */
        public final /* synthetic */ View f38304f;

        /* renamed from: g */
        public final /* synthetic */ View f38305g;

        /* renamed from: h */
        public final /* synthetic */ C13502w6 f38306h;

        /* renamed from: i */
        public final /* synthetic */ C60905o f38307i;

        /* renamed from: j */
        public final /* synthetic */ C32224a<C13598b0> f38308j;

        public C13509g(View view, int i, View view2, View view3, C13502w6 w6Var, C60905o oVar, C32224a<C13598b0> aVar) {
            this.f38302d = view;
            this.f38303e = i;
            this.f38304f = view2;
            this.f38305g = view3;
            this.f38306h = w6Var;
            this.f38307i = oVar;
            this.f38308j = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f38302d;
            view.setTranslationY(view.getTranslationY() - ((float) this.f38303e));
            View view2 = this.f38304f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f38304f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view6 = this.f38305g;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f38305g;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Float.valueOf(1.0f));
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view8.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideContentLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f38306h.mo12913T3(this.f38307i, C13505c.HIDE);
            C32224a<C13598b0> aVar5 = this.f38308j;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
    }

    /* renamed from: rs1.w6$h */
    public static final class C13510h extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f38309d;

        /* renamed from: e */
        public final /* synthetic */ int f38310e;

        /* renamed from: f */
        public final /* synthetic */ View f38311f;

        /* renamed from: g */
        public final /* synthetic */ C13502w6 f38312g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f38313h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f38314i;

        public C13510h(View view, int i, View view2, C13502w6 w6Var, C60905o oVar, C32224a<C13598b0> aVar) {
            this.f38309d = view;
            this.f38310e = i;
            this.f38311f = view2;
            this.f38312g = w6Var;
            this.f38313h = oVar;
            this.f38314i = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f38309d;
            view.setTranslationY(view.getTranslationY() - ((float) this.f38310e));
            View view2 = this.f38311f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideHeaderLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideHeaderLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = this.f38311f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideHeaderLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideHeaderLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f38312g.mo12913T3(this.f38313h, C13505c.HIDE);
            C32224a<C13598b0> aVar3 = this.f38314i;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }
    }

    /* renamed from: rs1.w6$i */
    public static final class C13511i extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f38315d;

        /* renamed from: e */
        public final /* synthetic */ int f38316e;

        /* renamed from: f */
        public final /* synthetic */ View f38317f;

        /* renamed from: g */
        public final /* synthetic */ C13502w6 f38318g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f38319h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f38320i;

        public C13511i(View view, int i, View view2, C13502w6 w6Var, C60905o oVar, C32224a<C13598b0> aVar) {
            this.f38315d = view;
            this.f38316e = i;
            this.f38317f = view2;
            this.f38318g = w6Var;
            this.f38319h = oVar;
            this.f38320i = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f38315d;
            view.setTranslationY(view.getTranslationY() - ((float) this.f38316e));
            View view2 = this.f38317f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideScoreLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideScoreLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = this.f38317f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideScoreLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$hideScoreLayout$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f38318g.mo12913T3(this.f38319h, C13505c.HIDE);
            C32224a<C13598b0> aVar3 = this.f38320i;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }
    }

    /* renamed from: rs1.w6$j */
    public static final class C13512j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f38321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13512j(C32224a<C13598b0> aVar) {
            super(0);
            this.f38321d = aVar;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f38321d;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.w6$k */
    public static final class C13513k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f38322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13513k(C32224a<C13598b0> aVar) {
            super(0);
            this.f38322d = aVar;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f38322d;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.w6$l */
    public static final class C13514l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38323d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f38324e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f38325f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13514l(C13502w6 w6Var, C60905o oVar, C32224a<C13598b0> aVar) {
            super(0);
            this.f38323d = w6Var;
            this.f38324e = oVar;
            this.f38325f = aVar;
        }

        public Object invoke() {
            this.f38323d.mo12913T3(this.f38324e, C13505c.SHOWING_CONTENT);
            C32224a<C13598b0> aVar = this.f38325f;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.w6$m */
    public static final class C13515m extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f38326d;

        public C13515m(C32224a<C13598b0> aVar) {
            this.f38326d = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            C32224a<C13598b0> aVar = this.f38326d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: rs1.w6$n */
    public static final class C13516n extends C87413o implements C32226l<C2783g0, CharSequence> {

        /* renamed from: d */
        public static final C13516n f38327d = new C13516n();

        public C13516n() {
            super(1);
        }

        public Object invoke(Object obj) {
            C2783g0 g0Var = (C2783g0) obj;
            C87412m.m108594g(g0Var, LocaleUtil.ITALIAN);
            return String.valueOf(g0Var.f139111e);
        }
    }

    /* renamed from: rs1.w6$o */
    public static final class C13517o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38328d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f38329e;

        /* renamed from: f */
        public final /* synthetic */ C50949qe1 f38330f;

        /* renamed from: g */
        public final /* synthetic */ C50668oe1 f38331g;

        /* renamed from: h */
        public final /* synthetic */ View f38332h;

        /* renamed from: i */
        public final /* synthetic */ View f38333i;

        public C13517o(C13502w6 w6Var, C60905o oVar, C50949qe1 qe12, C50668oe1 oe12, View view, View view2) {
            this.f38328d = w6Var;
            this.f38329e = oVar;
            this.f38330f = qe12;
            this.f38331g = oe12;
            this.f38332h = view;
            this.f38333i = view2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13502w6 w6Var = this.f38328d;
            C60905o oVar = this.f38329e;
            C50949qe1 qe12 = this.f38330f;
            C50668oe1 oe12 = this.f38331g;
            C13503a aVar = C13502w6.f38267r;
            w6Var.mo12915V3(oVar, qe12, oe12, false);
            C13502w6 w6Var2 = this.f38328d;
            View view2 = this.f38332h;
            C87412m.m108593f(view2, "dislikeLayout");
            C13502w6.m12822X3(w6Var2, view2, true, (String) null, false, 4, (Object) null);
            this.f38332h.setEnabled(false);
            this.f38333i.setEnabled(false);
            C13502w6 w6Var3 = this.f38328d;
            C60905o oVar2 = this.f38329e;
            C50949qe1 qe13 = this.f38330f;
            C50668oe1 oe13 = this.f38331g;
            String string = oVar2.f173499A.getString(C0966R.string.hsm);
            C87412m.m108593f(string, "holder.context.getString…you_dont_like_this_video)");
            C13502w6.m12823c3(w6Var3, oVar2, qe13, oe13, string);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.w6$p */
    public static final class C13518p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38334d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f38335e;

        /* renamed from: f */
        public final /* synthetic */ C50949qe1 f38336f;

        /* renamed from: g */
        public final /* synthetic */ C50668oe1 f38337g;

        /* renamed from: h */
        public final /* synthetic */ View f38338h;

        /* renamed from: i */
        public final /* synthetic */ View f38339i;

        public C13518p(C13502w6 w6Var, C60905o oVar, C50949qe1 qe12, C50668oe1 oe12, View view, View view2) {
            this.f38334d = w6Var;
            this.f38335e = oVar;
            this.f38336f = qe12;
            this.f38337g = oe12;
            this.f38338h = view;
            this.f38339i = view2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13502w6 w6Var = this.f38334d;
            C60905o oVar = this.f38335e;
            C50949qe1 qe12 = this.f38336f;
            C50668oe1 oe12 = this.f38337g;
            C13503a aVar = C13502w6.f38267r;
            w6Var.mo12915V3(oVar, qe12, oe12, false);
            C13502w6 w6Var2 = this.f38334d;
            View view2 = this.f38338h;
            C87412m.m108593f(view2, "likeLayout");
            C13502w6.m12822X3(w6Var2, view2, true, (String) null, true, 4, (Object) null);
            this.f38339i.setEnabled(false);
            this.f38338h.setEnabled(false);
            C13502w6 w6Var3 = this.f38334d;
            C60905o oVar2 = this.f38335e;
            C50949qe1 qe13 = this.f38336f;
            C50668oe1 oe13 = this.f38337g;
            String string = oVar2.f173499A.getString(C0966R.string.m5n);
            C87412m.m108593f(string, "holder.context.getString…ason_you_like_this_video)");
            C13502w6.m12823c3(w6Var3, oVar2, qe13, oe13, string);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.w6$q */
    public static final class C13519q implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeImageView f38340d;

        /* renamed from: e */
        public final /* synthetic */ List<View> f38341e;

        /* renamed from: f */
        public final /* synthetic */ C13502w6 f38342f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f38343g;

        /* renamed from: h */
        public final /* synthetic */ C50949qe1 f38344h;

        /* renamed from: i */
        public final /* synthetic */ C50668oe1 f38345i;

        /* renamed from: j */
        public final /* synthetic */ int f38346j;

        public C13519q(WeImageView weImageView, List<View> list, C13502w6 w6Var, C60905o oVar, C50949qe1 qe12, C50668oe1 oe12, int i) {
            this.f38340d = weImageView;
            this.f38341e = list;
            this.f38342f = w6Var;
            this.f38343g = oVar;
            this.f38344h = qe12;
            this.f38345i = oe12;
            this.f38346j = i;
        }

        /* JADX WARNING: type inference failed for: r4v4, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshScoreLayout$1$starView$1$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = r7.f38340d
                r0 = 0
                r8.setClickable(r0)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = r7.f38340d
                r8.setFocusable(r0)
                java.util.List<android.view.View> r8 = r7.f38341e
                int r1 = r7.f38346j
                jq3.o r2 = r7.f38343g
                java.util.Iterator r8 = r8.iterator()
                r3 = 0
            L_0x0031:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L_0x0065
                java.lang.Object r4 = r8.next()
                int r5 = r3 + 1
                r6 = 0
                if (r3 < 0) goto L_0x0061
                android.view.View r4 = (android.view.View) r4
                if (r3 <= r1) goto L_0x0045
                goto L_0x005f
            L_0x0045:
                boolean r3 = r4 instanceof com.tencent.p014mm.p136ui.widget.imageview.WeImageView
                if (r3 == 0) goto L_0x004c
                r6 = r4
                com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            L_0x004c:
                if (r6 != 0) goto L_0x004f
                goto L_0x005f
            L_0x004f:
                android.content.Context r3 = r2.f173499A
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131099943(0x7f060127, float:1.7812253E38)
                int r3 = r3.getColor(r4)
                r6.setIconColor(r3)
            L_0x005f:
                r3 = r5
                goto L_0x0031
            L_0x0061:
                sx3.C64197v.m75542k()
                throw r6
            L_0x0065:
                rs1.w6 r8 = r7.f38342f
                jq3.o r1 = r7.f38343g
                te3.qe1 r2 = r7.f38344h
                te3.oe1 r3 = r7.f38345i
                java.lang.String r4 = "answer"
                gy3.C87412m.m108593f(r3, r4)
                rs1.w6$a r5 = rs1.C13502w6.f38267r
                r8.mo12915V3(r1, r2, r3, r0)
                rs1.w6 r8 = r7.f38342f
                jq3.o r0 = r7.f38343g
                te3.qe1 r1 = r7.f38344h
                te3.oe1 r2 = r7.f38345i
                gy3.C87412m.m108593f(r2, r4)
                java.lang.String r3 = ""
                rs1.C13502w6.m12823c3(r8, r0, r1, r2, r3)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshScoreLayout$1$starView$1$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13502w6.C13519q.onClick(android.view.View):void");
        }
    }

    /* renamed from: rs1.w6$r */
    public static final class C13520r extends C87413o implements C32226l<BaseFinderFeed, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13502w6 f38347d;

        /* renamed from: e */
        public final /* synthetic */ boolean f38348e;

        /* renamed from: f */
        public final /* synthetic */ C50949qe1 f38349f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13520r(C13502w6 w6Var, boolean z, C50949qe1 qe12) {
            super(1);
            this.f38347d = w6Var;
            this.f38348e = z;
            this.f38349f = qe12;
        }

        public Object invoke(Object obj) {
            boolean z;
            long j;
            C13504b bVar;
            Iterator<T> it;
            long j2;
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
            C13502w6 w6Var = this.f38347d;
            boolean z2 = this.f38348e;
            C50949qe1 qe12 = this.f38349f;
            w6Var.getClass();
            Class cls = C10383h.class;
            long itemId = baseFinderFeed.getItemId();
            C51096re1 re12 = C13502w6.f38270u.get(Long.valueOf(itemId));
            C50816pe1 pe12 = C13502w6.f38269t.get(Long.valueOf(itemId));
            long j3 = pe12 != null ? pe12.f139721d : 0;
            int i = re12 != null ? re12.f140854e : 0;
            long j4 = re12 != null ? re12.f140853d : 0;
            C13504b bVar2 = C13502w6.f38271v.get(Long.valueOf(itemId));
            if (bVar2 == null) {
                bVar2 = new C13504b(C13505c.HIDE, 0, 0, w6Var.f38275g, (List) null, (List) null, (Map) null, (C50949qe1) null, 244, (C8480h) null);
            }
            C13504b bVar3 = bVar2;
            BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
            Long l = bVar3.f38289g.get(Long.valueOf(qe12.f140257d));
            long longValue = l != null ? l.longValue() : 0;
            if (!z2) {
                z = z2;
                j = System.currentTimeMillis();
            } else {
                z = z2;
                j = 0;
            }
            C49855ij1 ij12 = new C49855ij1();
            boolean z3 = z;
            ij12.f135385d = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(itemId);
            ij12.f135386e = bVar3.f38286d + 1;
            ij12.f135387f = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j4);
            ij12.f135388g = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j3);
            ij12.f135389h = bVar3.f38285c;
            LinkedList<C49999jj1> linkedList = new LinkedList<>();
            Iterator<T> it4 = bVar3.f38287e.iterator();
            int i2 = 0;
            while (true) {
                C49712hj1 hj12 = null;
                if (it4.hasNext()) {
                    T next = it4.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        long longValue2 = ((Number) next).longValue();
                        Long l2 = (Long) C110818d0.m150917O(bVar3.f38288f, i2);
                        if (l2 != null) {
                            long longValue3 = l2.longValue();
                            it = it4;
                            bVar = bVar3;
                            j2 = longValue3;
                        } else {
                            it = it4;
                            bVar = bVar3;
                            j2 = 0;
                        }
                        C49999jj1 jj12 = new C49999jj1();
                        Iterator<T> it5 = it;
                        jj12.f136152d = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(longValue2);
                        jj12.f136153e = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j2);
                        linkedList.add(jj12);
                        bVar3 = bVar;
                        i2 = i3;
                        it4 = it5;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                } else {
                    ij12.f135390i = linkedList;
                    ij12.f135391j = i;
                    ij12.f135392n = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(longValue);
                    ij12.f135393o = ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j);
                    String jSONObject = ij12.toJSON().toString();
                    C87412m.m108593f(jSONObject, "info.toJSON().toString()");
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(w6Var.getActivity());
                    if (f != null) {
                        hj12 = f.mo12861q3();
                    }
                    C7450q.f25643a.mo8595c(hj12, baseFinderFeed2, z3 ? 47 : 48, jSONObject);
                    Log.m105924i("Finder.FinderNpsSurveyUIC", "report NPS: " + jSONObject);
                    return C13598b0.f38549a;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13502w6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: J3 */
    public static void m12820J3(C13502w6 w6Var, C60905o oVar, float f, long j, C32224a aVar, int i, Object obj) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationYBy;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationYBy2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator translationYBy3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator listener;
        if ((i & 8) != 0) {
            aVar = null;
        }
        w6Var.getClass();
        View D = oVar.mo85812D(C0966R.C0970id.d97);
        View D2 = oVar.mo85812D(C0966R.C0970id.e6u);
        View D3 = oVar.mo85812D(C0966R.C0970id.crv);
        if (!(D == null || (animate3 = D.animate()) == null || (translationYBy3 = animate3.translationYBy(f)) == null || (duration3 = translationYBy3.setDuration(j)) == null || (listener = duration3.setListener(new C13218e7(aVar))) == null)) {
            listener.start();
        }
        if (!(D2 == null || (animate2 = D2.animate()) == null || (translationYBy2 = animate2.translationYBy(f)) == null || (duration2 = translationYBy2.setDuration(j)) == null)) {
            duration2.start();
        }
        if (D3 != null && (animate = D3.animate()) != null && (translationYBy = animate.translationYBy(f)) != null && (duration = translationYBy.setDuration(j)) != null) {
            duration.start();
        }
    }

    /* renamed from: Q3 */
    public static C50816pe1 m12821Q3(C13502w6 w6Var, C60905o oVar, C32226l lVar, int i, Object obj) {
        C50816pe1 pe12 = null;
        if ((i & 2) != 0) {
            lVar = null;
        }
        BaseFinderFeed P3 = w6Var.mo12911P3(oVar, (C32226l<? super BaseFinderFeed, C13598b0>) null);
        if (!(P3 == null || (pe12 = f38269t.get(Long.valueOf(P3.getItemId()))) == null || lVar == null)) {
            lVar.invoke(pe12);
        }
        return pe12;
    }

    /* renamed from: X3 */
    public static /* synthetic */ void m12822X3(C13502w6 w6Var, View view, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        w6Var.mo12916W3(view, z, str, z2);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12823c3(rs1.C13502w6 r25, jq3.C60905o r26, te3.C50949qe1 r27, te3.C50668oe1 r28, java.lang.String r29) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            r25.getClass()
            int r3 = r2.f139115i
            r4 = 1
            if (r3 == r4) goto L_0x0197
            r5 = 2
            if (r3 == r5) goto L_0x0013
            goto L_0x019c
        L_0x0013:
            long r2 = r2.f139116j
            r6 = 0
            te3.pe1 r7 = m12821Q3(r0, r1, r6, r5, r6)
            r8 = 0
            if (r7 != 0) goto L_0x001f
            r9 = r6
            goto L_0x0047
        L_0x001f:
            java.util.LinkedList<te3.qe1> r7 = r7.f139722e
            java.lang.String r9 = "surveyInfo.questions"
            gy3.C87412m.m108593f(r7, r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0044
            java.lang.Object r9 = r7.next()
            r10 = r9
            te3.qe1 r10 = (te3.C50949qe1) r10
            long r10 = r10.f140257d
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0040
            r10 = 1
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == 0) goto L_0x002b
            goto L_0x0045
        L_0x0044:
            r9 = r6
        L_0x0045:
            te3.qe1 r9 = (te3.C50949qe1) r9
        L_0x0047:
            if (r9 == 0) goto L_0x0191
            r2 = r27
            int r2 = r2.f140260g
            int r3 = r9.f140260g
            if (r2 != r4) goto L_0x0188
            if (r3 != r5) goto L_0x0188
            android.view.View r2 = r25.mo12920i3(r26)
            if (r2 == 0) goto L_0x019c
            r3 = 2131304814(0x7f09216e, float:1.8227781E38)
            android.view.View r3 = r2.findViewById(r3)
            r13 = r3
            android.widget.TextView r13 = (android.widget.TextView) r13
            r3 = 2131304809(0x7f092169, float:1.8227771E38)
            android.view.View r7 = r2.findViewById(r3)
            r3 = 2131304812(0x7f09216c, float:1.8227777E38)
            android.view.View r16 = r2.findViewById(r3)
            rs1.x6 r2 = new rs1.x6
            r10 = r2
            r11 = r7
            r12 = r16
            r14 = r9
            r15 = r29
            r10.<init>(r11, r12, r13, r14, r15)
            android.view.View r3 = r25.mo12917e3(r26)
            if (r3 == 0) goto L_0x019c
            r0.mo12907L3(r1, r9)
            r0.mo12908M3(r3, r9)
            java.util.LinkedList<te3.oe1> r5 = r9.f140259f
            java.util.Iterator r5 = r5.iterator()
        L_0x008f:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00a4
            java.lang.Object r10 = r5.next()
            te3.oe1 r10 = (te3.C50668oe1) r10
            java.lang.String r11 = "answer"
            gy3.C87412m.m108593f(r10, r11)
            r0.mo12915V3(r1, r9, r10, r4)
            goto L_0x008f
        L_0x00a4:
            android.view.ViewParent r4 = r3.getParent()
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x00af
            r6 = r4
            android.view.View r6 = (android.view.View) r6
        L_0x00af:
            if (r6 == 0) goto L_0x019c
            android.view.ViewPropertyAnimator r4 = r3.animate()
            r4.cancel()
            int r4 = r0.mo12919g3(r3)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r9)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r20 = "popupContentLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r5.mo10231a(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r19 = "popupContentLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r5 = 1065353216(0x3f800000, float:1.0)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9.mo10233c(r5)
            java.lang.Object[] r18 = r9.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r20 = "popupContentLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setAlpha"
            java.lang.String r24 = "(F)V"
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r9.mo10231a(r8)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r3.setAlpha(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r19 = "popupContentLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            float r3 = r6.getTranslationY()
            float r4 = (float) r4
            float r3 = r3 + r4
            r6.setTranslationY(r3)
            r5 = 300(0x12c, double:1.48E-321)
            rs1.d7 r8 = new rs1.d7
            r8.<init>(r0, r1, r2)
            r0 = r25
            r1 = r26
            r2 = r4
            r3 = r5
            r5 = r8
            r0.mo12906K3(r1, r2, r3, r5)
            r0 = 300(0x12c, double:1.48E-321)
            r2 = 0
            if (r7 == 0) goto L_0x0170
            android.view.ViewPropertyAnimator r3 = r7.animate()
            if (r3 == 0) goto L_0x0170
            android.view.ViewPropertyAnimator r3 = r3.alpha(r2)
            if (r3 == 0) goto L_0x0170
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r0)
            if (r3 == 0) goto L_0x0170
            r3.start()
        L_0x0170:
            if (r16 == 0) goto L_0x019c
            android.view.ViewPropertyAnimator r3 = r16.animate()
            if (r3 == 0) goto L_0x019c
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            if (r2 == 0) goto L_0x019c
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            if (r0 == 0) goto L_0x019c
            r0.start()
            goto L_0x019c
        L_0x0188:
            rs1.y6 r2 = new rs1.y6
            r2.<init>(r0, r1, r9)
            r0.mo12924m3(r1, r2)
            goto L_0x019c
        L_0x0191:
            r2 = r27
            r25.mo12918f3(r26, r27)
            goto L_0x019c
        L_0x0197:
            r2 = r27
            r25.mo12918f3(r26, r27)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13502w6.m12823c3(rs1.w6, jq3.o, te3.qe1, te3.oe1, java.lang.String):void");
    }

    /* renamed from: d3 */
    public static final boolean m12824d3(C13502w6 w6Var, C60905o oVar) {
        BaseFinderFeed P3 = w6Var.mo12911P3(oVar, (C32226l<? super BaseFinderFeed, C13598b0>) null);
        boolean z = false;
        if (P3 == null) {
            return false;
        }
        C51096re1 re12 = f38270u.get(Long.valueOf(P3.getItemId()));
        boolean contains = f38268s.contains(Long.valueOf(P3.getItemId()));
        FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) C39818r.f106831a.mo62443b(w6Var.getContext()).mo62449e(FinderDescPanelUIC.class);
        boolean z2 = finderDescPanelUIC != null ? finderDescPanelUIC.f18623g : false;
        boolean z3 = re12 != null && !contains && !z2;
        StringBuilder sb = new StringBuilder();
        sb.append("isNeedShowSurvey ret=");
        sb.append(z3);
        sb.append(" isMatchedConfig=");
        if (re12 != null) {
            z = true;
        }
        sb.append(z);
        sb.append(" shown=");
        sb.append(contains);
        sb.append(" isDescPanelShown=");
        sb.append(z2);
        sb.append(" mediaType=");
        sb.append(P3.mo3513o().getMediaType());
        Log.m105924i("Finder.FinderNpsSurveyUIC", sb.toString());
        return z3;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12903F3(jq3.C60905o r13, te3.C50949qe1 r14, fy3.C32224a<rx3.C13598b0> r15) {
        /*
            r12 = this;
            rs1.w6$c r0 = rs1.C13502w6.C13505c.SHOWING_HEADER
            r12.mo12913T3(r13, r0)
            android.view.View r0 = r12.mo12920i3(r13)
            if (r0 == 0) goto L_0x0118
            r12.mo12907L3(r13, r14)
            r12.mo12909N3(r13, r14, r0)
            java.util.LinkedList<te3.oe1> r1 = r14.f140259f
            java.lang.String r2 = "question.answers"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            r4 = 0
            r5 = 1
            r9 = 0
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r1.next()
            r6 = r3
            te3.oe1 r6 = (te3.C50668oe1) r6
            int r6 = r6.f139112f
            r7 = 2
            if (r6 != r7) goto L_0x0033
            r6 = 1
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            if (r6 == 0) goto L_0x001c
            goto L_0x0038
        L_0x0037:
            r3 = r4
        L_0x0038:
            te3.oe1 r3 = (te3.C50668oe1) r3
            java.util.LinkedList<te3.oe1> r1 = r14.f140259f
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r1.next()
            r6 = r2
            te3.oe1 r6 = (te3.C50668oe1) r6
            int r6 = r6.f139112f
            r7 = 3
            if (r6 != r7) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0043
            goto L_0x005c
        L_0x005b:
            r2 = r4
        L_0x005c:
            te3.oe1 r2 = (te3.C50668oe1) r2
            if (r3 == 0) goto L_0x0063
            r12.mo12915V3(r13, r14, r3, r5)
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r12.mo12915V3(r13, r14, r2, r5)
        L_0x0068:
            android.view.ViewParent r14 = r0.getParent()
            boolean r1 = r14 instanceof android.view.View
            if (r1 == 0) goto L_0x0073
            r4 = r14
            android.view.View r4 = (android.view.View) r4
        L_0x0073:
            r14 = r4
            if (r14 == 0) goto L_0x0118
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            int r10 = r12.mo12919g3(r0)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.mo10233c(r1)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r4 = "popupHeaderLayout"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r3 = "popupHeaderLayout"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r11.mo10233c(r1)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r4 = "popupHeaderLayout"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.mo10231a(r9)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r3 = "popupHeaderLayout"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            float r0 = r14.getTranslationY()
            float r3 = (float) r10
            float r0 = r0 + r3
            r14.setTranslationY(r0)
            r4 = 300(0x12c, double:1.48E-321)
            rs1.w6$j r6 = new rs1.w6$j
            r6.<init>(r15)
            r1 = r12
            r2 = r13
            r1.mo12906K3(r2, r3, r4, r6)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13502w6.mo12903F3(jq3.o, te3.qe1, fy3.a):void");
    }

    /* renamed from: G3 */
    public final void mo12904G3(C60905o oVar, C50949qe1 qe12, C32224a<C13598b0> aVar) {
        mo12913T3(oVar, C13505c.SHOWING_SCORE);
        View R3 = mo12912R3(oVar);
        if (R3 != null) {
            mo12907L3(oVar, qe12);
            mo12910O3(oVar, qe12, R3);
            LinkedList<C50668oe1> linkedList = qe12.f140259f;
            C87412m.m108593f(linkedList, "question.answers");
            for (C50668oe1 oe12 : linkedList) {
                C87412m.m108593f(oe12, "answer");
                mo12915V3(oVar, qe12, oe12, true);
            }
            ViewParent parent = R3.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                R3.animate().cancel();
                int g3 = mo12919g3(R3);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(R3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupScoreSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                R3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(R3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupScoreSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                float f = (float) g3;
                view.setTranslationY(view.getTranslationY() + f);
                mo12906K3(oVar, f, 300, new C13513k(aVar));
            }
        }
    }

    /* renamed from: I3 */
    public final void mo12905I3(C60905o oVar, C50949qe1 qe12, C32224a<C13598b0> aVar) {
        C60905o oVar2 = oVar;
        C50949qe1 qe13 = qe12;
        View i3 = mo12920i3(oVar);
        View e3 = mo12917e3(oVar);
        if (i3 != null && e3 != null) {
            mo12907L3(oVar, qe12);
            mo12909N3(oVar2, qe13, i3);
            mo12908M3(e3, qe13);
            Iterator<C50668oe1> it = qe13.f140259f.iterator();
            while (it.hasNext()) {
                C50668oe1 next = it.next();
                C87412m.m108593f(next, "answer");
                mo12915V3(oVar2, qe13, next, true);
            }
            ViewParent parent = e3.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                i3.animate().cancel();
                e3.animate().cancel();
                int g3 = mo12919g3(i3) + mo12919g3(e3);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = i3;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Float.valueOf(1.0f));
                View view3 = i3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                i3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view4 = e3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(Float.valueOf(1.0f));
                View view5 = e3;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                e3.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                float f = (float) g3;
                view.setTranslationY(view.getTranslationY() + f);
                mo12906K3(oVar, f, 300, new C13514l(this, oVar2, aVar));
            }
        }
    }

    /* renamed from: K3 */
    public final void mo12906K3(C60905o oVar, float f, long j, C32224a<C13598b0> aVar) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationYBy;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationYBy2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator translationYBy3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator listener;
        View D = oVar.mo85812D(C0966R.C0970id.d97);
        View D2 = oVar.mo85812D(C0966R.C0970id.e6u);
        View D3 = oVar.mo85812D(C0966R.C0970id.crv);
        if (!(D == null || (animate3 = D.animate()) == null || (translationYBy3 = animate3.translationYBy(-f)) == null || (duration3 = translationYBy3.setDuration(j)) == null || (listener = duration3.setListener(new C13515m(aVar))) == null)) {
            listener.start();
        }
        if (!(D2 == null || (animate2 = D2.animate()) == null || (translationYBy2 = animate2.translationYBy(-f)) == null || (duration2 = translationYBy2.setDuration(j)) == null)) {
            duration2.start();
        }
        if (D3 != null && (animate = D3.animate()) != null && (translationYBy = animate.translationYBy(-f)) != null && (duration = translationYBy.setDuration(j)) != null) {
            duration.start();
        }
    }

    /* renamed from: L3 */
    public final void mo12907L3(C60905o oVar, C50949qe1 qe12) {
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        C13504b U3 = mo12914U3(oVar);
        U3.f38290h = qe12;
        if (!U3.f38287e.contains(Long.valueOf(qe12.f140257d))) {
            U3.f38287e.add(Long.valueOf(qe12.f140257d));
        }
        U3.f38289g.put(Long.valueOf(qe12.f140257d), Long.valueOf(System.currentTimeMillis()));
        f38271v.put(Long.valueOf(i2Var.getItemId()), U3);
    }

    /* renamed from: M3 */
    public final void mo12908M3(View view, C50949qe1 qe12) {
        LinkedList<C50668oe1> linkedList = qe12.f140259f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshContentData", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshContentData", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        C87412m.m108593f(linkedList, "answerList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C50668oe1 oe12 : linkedList) {
            C87412m.m108593f(oe12, LocaleUtil.ITALIAN);
            arrayList.add(new C2783g0(qe12, oe12));
        }
        Log.m105924i("Finder.FinderNpsSurveyUIC", "refreshContentData answerList = " + C110818d0.m150921S(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C13516n.f38327d, 31, (Object) null));
        ((FinderNpsSurveyView) view.findViewById(C0966R.C0970id.kad)).setAnswerList(arrayList);
    }

    /* renamed from: N3 */
    public final void mo12909N3(C60905o oVar, C50949qe1 qe12, View view) {
        T t;
        C13598b0 b0Var;
        T t2;
        C13598b0 b0Var2;
        boolean z;
        boolean z2;
        C50949qe1 qe13 = qe12;
        View view2 = view;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        View view3 = view2;
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        TextView textView = (TextView) view3.findViewById(C0966R.C0970id.f358287e80);
        View findViewById = view3.findViewById(C0966R.C0970id.e7w);
        View findViewById2 = view3.findViewById(C0966R.C0970id.e7z);
        LinkedList<C50668oe1> linkedList = qe13.f140259f;
        C87412m.m108593f(linkedList, "question.answers");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C50668oe1) t).f139112f == 2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C50668oe1 oe12 = (C50668oe1) t;
        if (oe12 != null) {
            String str = oe12.f139111e;
            if (str == null) {
                str = getContext().getString(C0966R.string.eqc);
            }
            C87412m.m108593f(str, "it.answer_title ?: conte…ng.finder_survey_dislike)");
            findViewById.setEnabled(true);
            mo12916W3(findViewById, false, str, false);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view4 = findViewById;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = findViewById;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C13517o oVar2 = r0;
            C13517o oVar3 = new C13517o(this, oVar, qe12, oe12, findViewById, findViewById2);
            findViewById.setOnClickListener(oVar2);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = findViewById;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LinkedList<C50668oe1> linkedList2 = qe13.f140259f;
        C87412m.m108593f(linkedList2, "question.answers");
        Iterator<T> it4 = linkedList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it4.next();
            if (((C50668oe1) t2).f139112f == 3) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C50668oe1 oe13 = (C50668oe1) t2;
        if (oe13 != null) {
            String str2 = oe13.f139111e;
            if (str2 == null) {
                str2 = getContext().getString(C0966R.string.eqd);
            }
            C87412m.m108593f(str2, "goodAnswer.answer_title …tring.finder_survey_like)");
            findViewById2.setEnabled(true);
            mo12916W3(findViewById2, false, str2, true);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(Float.valueOf(1.0f));
            View view7 = findViewById2;
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view8 = findViewById2;
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new C13518p(this, oVar, qe12, oe13, findViewById2, findViewById));
            b0Var2 = C13598b0.f38549a;
        } else {
            b0Var2 = null;
        }
        if (b0Var2 == null) {
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view9 = findViewById2;
            C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        String str3 = qe13.f140258e;
        if (str3 == null) {
            str3 = oVar.f173499A.getString(C0966R.string.c0b);
        }
        textView.setText(str3);
    }

    /* renamed from: O3 */
    public final void mo12910O3(C60905o oVar, C50949qe1 qe12, View view) {
        C60905o oVar2 = oVar;
        C50949qe1 qe13 = qe12;
        View view2 = view;
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f358287e80);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.nfb);
        ArrayList arrayList = new ArrayList();
        linearLayout.removeAllViews();
        LinkedList<C50668oe1> linkedList = qe13.f140259f;
        C87412m.m108593f(linkedList, "question.answers");
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                C50668oe1 oe12 = (C50668oe1) next;
                WeImageView weImageView = new WeImageView(oVar2.f173499A);
                int dimensionPixelOffset = oVar2.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dimensionPixelOffset, dimensionPixelOffset);
                marginLayoutParams.rightMargin = oVar2.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);
                weImageView.setLayoutParams(marginLayoutParams);
                weImageView.setImageDrawable(C87515a.m108835e(oVar2.f173499A.getResources(), C0966R.raw.icons_filled_star, 0.0f));
                weImageView.setIconColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2936si));
                weImageView.setTag(oe12);
                weImageView.setClickable(true);
                weImageView.setFocusable(true);
                C13519q qVar = r0;
                C13519q qVar2 = new C13519q(weImageView, arrayList, this, oVar, qe12, oe12, i);
                weImageView.setOnClickListener(qVar);
                linearLayout.addView(weImageView);
                arrayList.add(weImageView);
                oVar2 = oVar;
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String str = qe13.f140258e;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    /* renamed from: P3 */
    public final BaseFinderFeed mo12911P3(C60905o oVar, C32226l<? super BaseFinderFeed, C13598b0> lVar) {
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return null;
        }
        if (lVar != null) {
            lVar.invoke(baseFinderFeed);
        }
        return baseFinderFeed;
    }

    /* renamed from: R3 */
    public final View mo12912R3(C60905o oVar) {
        View inflate;
        View D = oVar.mo85812D(C0966R.C0970id.nf7);
        if (D != null) {
            return D;
        }
        ViewStub viewStub = (ViewStub) oVar.mo85812D(C0966R.C0970id.nf8);
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            return null;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "scoreLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        View view = inflate;
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "scoreLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }

    /* renamed from: T3 */
    public final void mo12913T3(C60905o oVar, C13505c cVar) {
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        C13504b U3 = mo12914U3(oVar);
        C87412m.m108594g(cVar, "<set-?>");
        U3.f38283a = cVar;
        if (cVar == C13505c.HIDE) {
            U3.f38290h = null;
        }
        f38271v.put(Long.valueOf(i2Var.getItemId()), U3);
    }

    /* renamed from: U3 */
    public final C13504b mo12914U3(C60905o oVar) {
        C13504b bVar = f38271v.get(Long.valueOf(((C0740i2) oVar.f173503E).getItemId()));
        if (bVar == null) {
            bVar = new C13504b(C13505c.HIDE, 0, 0, this.f38275g, (List) null, (List) null, (Map) null, (C50949qe1) null, 244, (C8480h) null);
        }
        return bVar;
    }

    /* renamed from: V3 */
    public final void mo12915V3(C60905o oVar, C50949qe1 qe12, C50668oe1 oe12, boolean z) {
        if (!z) {
            C0740i2 i2Var = (C0740i2) oVar.f173503E;
            C13504b U3 = mo12914U3(oVar);
            if (!U3.f38288f.contains(Long.valueOf(oe12.f139110d))) {
                U3.f38288f.add(Long.valueOf(oe12.f139110d));
            }
            f38271v.put(Long.valueOf(i2Var.getItemId()), U3);
        }
        mo12911P3(oVar, new C13520r(this, z, qe12));
    }

    /* renamed from: W3 */
    public final void mo12916W3(View view, boolean z, String str, boolean z2) {
        Context context = view.getContext();
        WeImageView weImageView = (WeImageView) view.findViewById(z2 ? C0966R.C0970id.f358286md3 : C0966R.C0970id.f358285md2);
        TextView textView = (TextView) view.findViewById(z2 ? C0966R.C0970id.md5 : C0966R.C0970id.md4);
        C15064b bVar = C15064b.f41199a;
        C15064b.m14232g(bVar, view, false, 1, (Object) null);
        C87412m.m108593f(weImageView, "icon");
        C15064b.m14232g(bVar, weImageView, false, 1, (Object) null);
        textView.setTextSize(1, 12.0f);
        if (z) {
            weImageView.setIconColor(context.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            textView.setTextColor(context.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            view.setBackgroundResource(C0966R.C0969drawable.f5105wy);
        } else {
            weImageView.setIconColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
            textView.setTextColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
            view.setBackgroundResource(C0966R.C0969drawable.f5104wx);
        }
        if (!Util.isNullOrNil(str)) {
            textView.setText(str);
        }
    }

    /* renamed from: e3 */
    public final View mo12917e3(C60905o oVar) {
        View inflate;
        View D = oVar.mo85812D(C0966R.C0970id.mct);
        if (D != null) {
            return D;
        }
        ViewStub viewStub = (ViewStub) oVar.mo85812D(C0966R.C0970id.mcu);
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            return null;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "contentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "contentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FinderNpsSurveyView finderNpsSurveyView = (FinderNpsSurveyView) inflate.findViewById(C0966R.C0970id.kad);
        if (finderNpsSurveyView == null) {
            return inflate;
        }
        finderNpsSurveyView.setItemClickListener(new C13111a7(this, oVar, finderNpsSurveyView));
        return inflate;
    }

    /* renamed from: f3 */
    public final void mo12918f3(C60905o oVar, C50949qe1 qe12) {
        int i = qe12.f140260g;
        if (i == 1) {
            this.f38273e.postDelayed(new C13506d(this, oVar), 1000);
        } else if (i == 2) {
            int i2 = qe12.f140261h;
            if (i2 == 1) {
                this.f38273e.postDelayed(new C13507e(this, oVar), 1000);
            } else if (i2 == 2) {
                this.f38273e.postDelayed(new C13508f(this, oVar), 1000);
            }
        }
    }

    /* renamed from: g3 */
    public final int mo12919g3(View view) {
        int height = view.getHeight();
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (height > 0 || view2 == null) {
            return height;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new Point(view.getMeasuredWidth(), view.getMeasuredHeight()).y;
    }

    /* renamed from: i3 */
    public final View mo12920i3(C60905o oVar) {
        View view;
        View D = oVar.mo85812D(C0966R.C0970id.mcv);
        if (D != null) {
            return D;
        }
        ViewStub viewStub = (ViewStub) oVar.mo85812D(C0966R.C0970id.mcw);
        if (viewStub == null || (view = viewStub.inflate()) == null) {
            view = null;
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "headerLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "headerLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById = view.findViewById(C0966R.C0970id.e7w);
            View findViewById2 = view.findViewById(C0966R.C0970id.e7z);
            ((TextView) view.findViewById(C0966R.C0970id.f358287e80)).setTextSize(1, 15.0f);
            C87412m.m108593f(findViewById, "dislikeLayout");
            m12822X3(this, findViewById, false, (String) null, false, 4, (Object) null);
            C87412m.m108593f(findViewById2, "likeLayout");
            m12822X3(this, findViewById2, false, (String) null, true, 4, (Object) null);
        }
        return view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r9 = r0;
        r0 = new rs1.C13502w6.C13509g(r11, r12, r10, r9, r16, r17, r18);
     */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12921j3(jq3.C60905o r17, fy3.C32224a<rx3.C13598b0> r18) {
        /*
            r16 = this;
            r8 = r16
            android.view.View r9 = r16.mo12920i3(r17)
            android.view.View r10 = r16.mo12917e3(r17)
            if (r9 == 0) goto L_0x0089
            if (r10 == 0) goto L_0x0089
            android.view.ViewParent r0 = r9.getParent()
            android.view.ViewParent r1 = r10.getParent()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            android.view.ViewParent r0 = r9.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0028
            android.view.View r0 = (android.view.View) r0
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r11 = r0
            if (r11 == 0) goto L_0x0089
            int r0 = r8.mo12919g3(r9)
            int r1 = r8.mo12919g3(r10)
            int r12 = r0 + r1
            float r2 = (float) r12
            r3 = 300(0x12c, double:1.48E-321)
            r5 = 0
            r6 = 8
            r7 = 0
            r0 = r16
            r1 = r17
            m12820J3(r0, r1, r2, r3, r5, r6, r7)
            android.view.ViewPropertyAnimator r0 = r9.animate()
            r13 = 300(0x12c, double:1.48E-321)
            r15 = 0
            if (r0 == 0) goto L_0x0074
            android.view.ViewPropertyAnimator r0 = r0.alpha(r15)
            if (r0 == 0) goto L_0x0074
            android.view.ViewPropertyAnimator r7 = r0.setDuration(r13)
            if (r7 == 0) goto L_0x0074
            rs1.w6$g r6 = new rs1.w6$g
            r0 = r6
            r1 = r11
            r2 = r12
            r3 = r10
            r4 = r9
            r5 = r16
            r9 = r6
            r6 = r17
            r11 = r7
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.view.ViewPropertyAnimator r0 = r11.setListener(r9)
            if (r0 == 0) goto L_0x0074
            r0.start()
        L_0x0074:
            android.view.ViewPropertyAnimator r0 = r10.animate()
            if (r0 == 0) goto L_0x0089
            android.view.ViewPropertyAnimator r0 = r0.alpha(r15)
            if (r0 == 0) goto L_0x0089
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r13)
            if (r0 == 0) goto L_0x0089
            r0.start()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13502w6.mo12921j3(jq3.o, fy3.a):void");
    }

    /* renamed from: k3 */
    public final void mo12922k3(C60905o oVar, C32224a<C13598b0> aVar) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        View i3 = mo12920i3(oVar);
        if (i3 != null) {
            ViewParent parent = i3.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                int g3 = mo12919g3(i3);
                m12820J3(this, oVar, (float) g3, 300, (C32224a) null, 8, (Object) null);
                ViewPropertyAnimator animate = i3.animate();
                if (animate != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300)) != null && (listener = duration.setListener(new C13510h(view, g3, i3, this, oVar, aVar))) != null) {
                    listener.start();
                }
            }
        }
    }

    /* renamed from: l3 */
    public final void mo12923l3(C60905o oVar, C32224a<C13598b0> aVar) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        View R3 = mo12912R3(oVar);
        if (R3 != null) {
            ViewParent parent = R3.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                int g3 = mo12919g3(R3);
                m12820J3(this, oVar, (float) g3, 300, (C32224a) null, 8, (Object) null);
                ViewPropertyAnimator animate = R3.animate();
                if (animate != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300)) != null && (listener = duration.setListener(new C13511i(view, g3, R3, this, oVar, aVar))) != null) {
                    listener.start();
                }
            }
        }
    }

    /* renamed from: m3 */
    public final void mo12924m3(C60905o oVar, C32224a<C13598b0> aVar) {
        Log.m105924i("Finder.FinderNpsSurveyUIC", "hideSurveyLayout showState=" + mo12914U3(oVar).f38283a);
        int ordinal = mo12914U3(oVar).f38283a.ordinal();
        if (ordinal == 1) {
            mo12922k3(oVar, aVar);
        } else if (ordinal == 2) {
            mo12921j3(oVar, aVar);
        } else if (ordinal == 3) {
            mo12923l3(oVar, aVar);
        }
    }

    /* renamed from: n3 */
    public final void mo12925n3(C60905o oVar) {
        mo12913T3(oVar, C13505c.HIDE);
        View D = oVar.mo85812D(C0966R.C0970id.e6u);
        if (D != null) {
            D.setTranslationY(0.0f);
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.crv);
        if (D2 != null) {
            D2.setTranslationY(0.0f);
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.d97);
        if (D3 != null) {
            D3.setTranslationY(0.0f);
        }
        View D4 = oVar.mo85812D(C0966R.C0970id.mcv);
        if (D4 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D5 = oVar.mo85812D(C0966R.C0970id.mct);
        if (D5 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view = D5;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: o3 */
    public final boolean mo12926o3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        return mo12914U3(oVar).f38283a != C13505c.HIDE;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f38273e.removeCallbacksAndMessages((Object) null);
    }

    public void onResume() {
        C60905o oVar;
        super.onResume();
        WeakReference<C60905o> weakReference = this.f38272d;
        if (weakReference != null && (oVar = weakReference.get()) != null && !mo12926o3(oVar)) {
            mo12925n3(oVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13502w6(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
