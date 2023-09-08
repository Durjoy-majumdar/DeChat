package rf1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de1.C7290r;
import df1.C58259c;
import er1.C58784w3;
import fy3.C32224a;
import go1.C8366a;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import mf1.C10817f1;
import org.json.JSONObject;
import pf1.C11916o;
import pf1.C11917o0;
import pf1.C11918p;
import pf1.C11920q;
import pf1.C11922r;
import pf1.C11930y;
import rs1.C13448t;
import rx3.C13598b0;
import te3.uc4;

/* renamed from: rf1.a */
public abstract class C12982a implements C12992d {

    /* renamed from: a */
    public View f37012a;

    /* renamed from: b */
    public String f37013b = "";

    /* renamed from: c */
    public long f37014c;

    /* renamed from: d */
    public C11920q f37015d;

    /* renamed from: e */
    public C60905o f37016e;

    /* renamed from: f */
    public uc4 f37017f;

    /* renamed from: g */
    public int f37018g;

    /* renamed from: h */
    public int f37019h;

    /* renamed from: i */
    public C11917o0 f37020i;

    /* renamed from: j */
    public C11930y f37021j;

    /* renamed from: k */
    public C12982a f37022k;

    /* renamed from: l */
    public boolean f37023l;

    /* renamed from: m */
    public boolean f37024m = true;

    /* renamed from: n */
    public boolean f37025n;

    /* renamed from: rf1.a$a */
    public static final class C12983a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C12982a f37026d;

        /* renamed from: e */
        public final /* synthetic */ View f37027e;

        public C12983a(C12982a aVar, View view) {
            this.f37026d = aVar;
            this.f37027e = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f37026d.f37025n = false;
            View view = this.f37027e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: rf1.a$b */
    public static final class C12984b extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f37028d;

        public C12984b(View view) {
            this.f37028d = view;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f37028d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f37028d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: rf1.a$c */
    public static final class C12985c extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C12982a f37029d;

        /* renamed from: e */
        public final /* synthetic */ View f37030e;

        /* renamed from: f */
        public final /* synthetic */ View f37031f;

        public C12985c(C12982a aVar, View view, View view2) {
            this.f37029d = aVar;
            this.f37030e = view;
            this.f37031f = view2;
        }

        public void onAnimationEnd(Animator animator) {
            this.f37029d.f37025n = false;
            View view = this.f37030e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f37031f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: rf1.a$d */
    public static final class C12986d extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C12982a f37032d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f37033e;

        public C12986d(C12982a aVar, C32224a<C13598b0> aVar2) {
            this.f37032d = aVar;
            this.f37033e = aVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f37032d.f37023l = false;
            C32224a<C13598b0> aVar = this.f37033e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f37032d.f37023l = false;
            C32224a<C13598b0> aVar = this.f37033e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: rf1.a$e */
    public static final class C12987e extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C12982a f37034d;

        /* renamed from: e */
        public final /* synthetic */ View f37035e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f37036f;

        public C12987e(C12982a aVar, View view, C32224a<C13598b0> aVar2) {
            this.f37034d = aVar;
            this.f37035e = view;
            this.f37036f = aVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f37034d.f37023l = false;
            View view = this.f37035e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f37035e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C32224a<C13598b0> aVar3 = this.f37036f;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f37034d.f37023l = false;
            View view = this.f37035e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f37035e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C32224a<C13598b0> aVar3 = this.f37036f;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }
    }

    /* renamed from: rf1.a$f */
    public static final class C12988f extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C12982a f37037d;

        /* renamed from: e */
        public final /* synthetic */ View f37038e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f37039f;

        /* renamed from: g */
        public final /* synthetic */ int f37040g;

        /* renamed from: h */
        public final /* synthetic */ int f37041h;

        public C12988f(C12982a aVar, View view, C32224a<C13598b0> aVar2, int i, int i2) {
            this.f37037d = aVar;
            this.f37038e = view;
            this.f37039f = aVar2;
            this.f37040g = i;
            this.f37041h = i2;
        }

        public void onAnimationEnd(Animator animator) {
            C12982a aVar = this.f37037d;
            View view = this.f37038e;
            aVar.getClass();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            View view2 = this.f37038e;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i = this.f37040g;
            int i2 = this.f37041h;
            layoutParams.width = i;
            layoutParams.height = i2;
            view2.setLayoutParams(layoutParams);
            C32224a<C13598b0> aVar2 = this.f37039f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }

    /* renamed from: rf1.a$g */
    public static final class C12989g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f37042d;

        /* renamed from: e */
        public final /* synthetic */ Rect f37043e;

        /* renamed from: f */
        public final /* synthetic */ Rect f37044f;

        /* renamed from: g */
        public final /* synthetic */ int f37045g;

        /* renamed from: h */
        public final /* synthetic */ int f37046h;

        /* renamed from: i */
        public final /* synthetic */ int f37047i;

        /* renamed from: j */
        public final /* synthetic */ int f37048j;

        /* renamed from: n */
        public final /* synthetic */ int f37049n;

        /* renamed from: o */
        public final /* synthetic */ int f37050o;

        public C12989g(View view, Rect rect, Rect rect2, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f37042d = view;
            this.f37043e = rect;
            this.f37044f = rect2;
            this.f37045g = i;
            this.f37046h = i2;
            this.f37047i = i3;
            this.f37048j = i4;
            this.f37049n = i5;
            this.f37050o = i6;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            if (f != null) {
                float floatValue = f.floatValue();
                this.f37042d.getGlobalVisibleRect(this.f37043e);
                Rect rect = this.f37043e;
                rect.left = (int) (((float) rect.left) - this.f37042d.getTranslationX());
                Rect rect2 = this.f37043e;
                rect2.right = (int) (((float) rect2.right) - this.f37042d.getTranslationX());
                Rect rect3 = this.f37043e;
                rect3.top = (int) (((float) rect3.top) - this.f37042d.getTranslationY());
                Rect rect4 = this.f37043e;
                rect4.bottom = (int) (((float) rect4.bottom) - this.f37042d.getTranslationY());
                Rect rect5 = this.f37043e;
                int i = rect5.left;
                Rect rect6 = this.f37044f;
                int i2 = rect5.bottom - rect6.bottom;
                float f2 = (((float) this.f37045g) * floatValue) - ((float) (i - rect6.left));
                float f3 = (((float) this.f37046h) * floatValue) - ((float) i2);
                this.f37042d.setTranslationX(f2);
                this.f37042d.setTranslationY(f3);
                int i3 = this.f37047i;
                float f4 = ((float) i3) + (((float) (this.f37048j - i3)) * floatValue);
                int i4 = this.f37049n;
                float f5 = ((float) i4) + (((float) (this.f37050o - i4)) * floatValue);
                View view = this.f37042d;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) f4;
                layoutParams.height = (int) f5;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m12428w(C12982a aVar, View view, View view2, long j, C32224a aVar2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = 500;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                aVar2 = null;
            }
            aVar.mo12513v(view, view2, j2, aVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformView");
    }

    /* renamed from: a */
    public void mo12507a(C60905o oVar, View view, C11920q qVar, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        if (this.f37024m) {
            C10817f1 f1Var = qVar.f34823A;
            if (f1Var != null) {
                f1Var.f32317a = false;
            }
            Object obj = oVar.f173503E;
            BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && C58784w3.f168295a.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                Log.m105924i("Finder.BaseAdFeedJumperUIC", "onRealHide feedId=" + baseFinderFeed.getItemId());
            }
            C11917o0 o0Var = this.f37020i;
            if (o0Var != null) {
                o0Var.mo11788j(oVar, view, qVar);
            }
            mo11048j(view, z, aVar);
        }
    }

    /* renamed from: c */
    public void mo11081c(C60905o oVar, View view, C11920q qVar, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        if (this.f37024m) {
            Object obj = oVar.f173503E;
            BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && C58784w3.f168295a.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                Log.m105924i("Finder.BaseAdFeedJumperUIC", "onRealShow feedId=" + baseFinderFeed.getItemId());
            }
            C10817f1 f1Var = qVar.f34823A;
            if (f1Var != null) {
                f1Var.f32317a = true;
            }
            C11917o0 o0Var = this.f37020i;
            if (o0Var != null) {
                o0Var.mo11772h(oVar, view, qVar);
            }
            mo11045u(view, z, aVar);
        }
    }

    /* renamed from: d */
    public final void mo12508d(boolean z, boolean z2) {
        C11920q qVar;
        T t;
        C11920q qVar2;
        FinderJumpInfo finderJumpInfo;
        LinkedList<uc4> linkedList;
        boolean z3;
        boolean z4;
        if (!this.f37025n) {
            C60905o oVar = this.f37016e;
            T t2 = null;
            View D = oVar != null ? oVar.mo85812D(C0966R.C0970id.bsh) : null;
            if (D != null) {
                C60905o oVar2 = this.f37016e;
                View D2 = oVar2 != null ? oVar2.mo85812D(C0966R.C0970id.f358047fm0) : null;
                if (D2 != null && (qVar = this.f37015d) != null) {
                    LinkedList<uc4> linkedList2 = qVar.f34827a.style;
                    C87412m.m108593f(linkedList2, "infoEx.jumpInfo.style");
                    Iterator<T> it = linkedList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (qVar.f34841o == ((uc4) t).f142760f) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            break;
                        }
                    }
                    uc4 uc4 = (uc4) t;
                    boolean z5 = D.getVisibility() == 0;
                    C11920q qVar3 = this.f37015d;
                    C12982a aVar = qVar3 != null ? qVar3.f34828b : null;
                    if (!(aVar == null || (qVar2 = aVar.f37015d) == null || (finderJumpInfo = qVar2.f34827a) == null || (linkedList = finderJumpInfo.style) == null)) {
                        Iterator<T> it4 = linkedList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            T next = it4.next();
                            uc4 uc42 = (uc4) next;
                            C11920q qVar4 = aVar.f37015d;
                            if (qVar4 == null || qVar4.f34841o != uc42.f142760f) {
                                z3 = false;
                                continue;
                            } else {
                                z3 = true;
                                continue;
                            }
                            if (z3) {
                                t2 = next;
                                break;
                            }
                        }
                        t2 = (uc4) t2;
                    }
                    boolean z6 = (t2 != null ? t2.f142747D : 0) == 0;
                    if (z || z5 != z6) {
                        if (z) {
                            z6 = (uc4 != null ? uc4.f142747D : 0) == 0;
                        }
                        if (!z2) {
                            int i = 8;
                            int i2 = z6 ? 0 : 8;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(Integer.valueOf(i2));
                            C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(Float.valueOf(1.0f));
                            C117292a.m165358d(D, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            D.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            if (!z6) {
                                i = 0;
                            }
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(Integer.valueOf(i));
                            View view = D2;
                            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(Float.valueOf(1.0f));
                            View view2 = D2;
                            C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            D2.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        } else if (z5 != z6) {
                            this.f37025n = true;
                            if (z6) {
                                C9556a aVar6 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar6.mo10233c(0);
                                View view3 = D;
                                C117292a.m165358d(view3, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                D.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                D.animate().alpha(1.0f).setDuration(200).setListener(new C12983a(this, D)).start();
                                C9556a aVar7 = new C9556a();
                                aVar7.mo10233c(0);
                                View view4 = D2;
                                C117292a.m165358d(view4, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                D2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                C9556a aVar8 = new C9556a();
                                aVar8.mo10233c(Float.valueOf(1.0f));
                                View view5 = D2;
                                C117292a.m165358d(view5, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                D2.setAlpha(((Float) aVar8.mo10231a(0)).floatValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                D2.animate().alpha(0.0f).setDuration(200).setListener(new C12984b(D2)).start();
                                return;
                            }
                            D.animate().alpha(0.0f).setDuration(200).setListener(new C12985c(this, D, D2)).start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo12509e(long j, View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        if (this.f37024m) {
            if (z) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f37023l = true;
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(j);
                C87412m.m108593f(duration, "ofFloat(jumpView, \"alpha…1f).setDuration(duration)");
                duration.addListener(new C12986d(this, aVar));
                duration.start();
                return;
            }
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            C117292a.m165358d(view, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f */
    public final void mo12510f(long j, View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        if (this.f37024m) {
            if (z) {
                this.f37023l = true;
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(j);
                C87412m.m108593f(duration, "ofFloat(jumpView, \"alpha…0f).setDuration(duration)");
                duration.addListener(new C12987e(this, view, aVar));
                duration.start();
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view3 = view;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        int i = finderJumpInfo.business_type;
        return i != 1 ? i != 3 ? i != 8 ? i != 18 ? i != 25 ? C8366a.JUMPER : C8366a.ORIGIN_AUTHOR_TEMPLATE : C8366a.MUSIC_TOPIC : C8366a.RED_PACK_COVER : C8366a.HOT_SPOT : C8366a.SHOPPING_CART;
    }

    /* renamed from: h */
    public final String mo12511h(String str, String str2) {
        return !Util.isNullOrNil(str) ? str : str2;
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        String str = qVar.f34827a.wording;
        return str != null && str.length() > 0;
    }

    /* renamed from: j */
    public void mo11048j(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12510f(250, view, z, aVar);
        mo12508d(false, z);
    }

    /* renamed from: k */
    public void mo11089k(C60905o oVar, C11922r rVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(rVar, "action");
    }

    /* renamed from: l */
    public void mo11090l(C60905o oVar, View view, C11920q qVar) {
        C11917o0 o0Var;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        BaseFinderFeed baseFinderFeed = qVar.f34830d;
        boolean z = true;
        if (baseFinderFeed == null || !baseFinderFeed.mo3479M()) {
            z = false;
        }
        if (!z && (o0Var = this.f37020i) != null) {
            o0Var.mo11785d(oVar, view, qVar);
        }
    }

    /* renamed from: m */
    public void mo11100m(C60905o oVar, View view, C11920q qVar) {
        String str;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        BaseFinderFeed baseFinderFeed = qVar.f34830d;
        if (baseFinderFeed != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108591d(baseFinderFeed);
            if (w3Var.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                C11917o0 o0Var = this.f37020i;
                if (o0Var == null) {
                    str = "null";
                } else {
                    C87412m.m108591d(o0Var);
                    str = o0Var.getClass().getSimpleName();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("viewEventHandler", str);
                C11918p pVar = qVar.f34832f;
                C11916o oVar2 = pVar instanceof C11916o ? (C11916o) pVar : null;
                long j = oVar2 != null ? oVar2.f34786i : 0;
                C39818r rVar = C39818r.f106831a;
                Context context = view.getContext();
                C87412m.m108593f(context, "jumpView.context");
                C13448t tVar = (C13448t) rVar.mo62443b(context).mo62449e(C13448t.class);
                if (tVar != null) {
                    tVar.mo12876c3(this.f37014c, "observer.onJumpViewFocus", jSONObject, j);
                }
            }
        }
        C11917o0 o0Var2 = this.f37020i;
        if (o0Var2 != null) {
            o0Var2.mo11768b(oVar, view, qVar);
        }
    }

    /* renamed from: n */
    public void mo11101n(C60905o oVar, View view, C11920q qVar) {
        String str;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        BaseFinderFeed baseFinderFeed = qVar.f34830d;
        if (baseFinderFeed != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108591d(baseFinderFeed);
            if (w3Var.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                C11917o0 o0Var = this.f37020i;
                if (o0Var == null) {
                    str = "null";
                } else {
                    C87412m.m108591d(o0Var);
                    str = o0Var.getClass().getSimpleName();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("viewEventHandler", str);
                C11918p pVar = qVar.f34832f;
                C11916o oVar2 = pVar instanceof C11916o ? (C11916o) pVar : null;
                long j = oVar2 != null ? oVar2.f34786i : 0;
                C39818r rVar = C39818r.f106831a;
                Context context = view.getContext();
                C87412m.m108593f(context, "jumpView.context");
                C13448t tVar = (C13448t) rVar.mo62443b(context).mo62449e(C13448t.class);
                if (tVar != null) {
                    tVar.mo12876c3(this.f37014c, "observer.onJumpViewUnFocus", jSONObject, j);
                }
            }
        }
        C11917o0 o0Var2 = this.f37020i;
        if (o0Var2 != null) {
            o0Var2.mo11770f(oVar, view, qVar);
        }
    }

    /* renamed from: o */
    public void mo11052o(C60905o oVar, View view, C11920q qVar, C58259c.C58260a aVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(aVar, "event");
        C11917o0 o0Var = this.f37020i;
        if (o0Var != null) {
            o0Var.mo11773l(oVar, view, qVar, aVar);
        }
    }

    /* renamed from: p */
    public void mo11053p(C60905o oVar, View view, C11920q qVar, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: q */
    public void mo11082q(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: r */
    public void mo11091r(C60905o oVar, View view, C11920q qVar, String str) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C11917o0 o0Var = this.f37020i;
        if (o0Var != null) {
            o0Var.mo11784a(oVar, view, qVar);
        }
    }

    /* renamed from: s */
    public void mo11092s(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: t */
    public void mo12512t(int i) {
        this.f37024m = i == 0;
        View view = this.f37012a;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "setJumpViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "setJumpViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: u */
    public void mo11045u(View view, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "jumpView");
        mo12509e(250, view, z, aVar);
        mo12508d(true, z);
    }

    /* renamed from: v */
    public final void mo12513v(View view, View view2, long j, C32224a<C13598b0> aVar) {
        View view3 = view;
        View view4 = view2;
        C87412m.m108594g(view3, "fromView");
        C87412m.m108594g(view4, "toView");
        Rect rect = new Rect();
        view3.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view4.getGlobalVisibleRect(rect2);
        int i = rect2.left - rect.left;
        int i2 = rect2.bottom - rect.bottom;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i3 = layoutParams != null ? layoutParams.width : measuredWidth;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int i4 = layoutParams2 != null ? layoutParams2.height : measuredHeight;
        int measuredWidth2 = view2.getMeasuredWidth();
        int measuredHeight2 = view2.getMeasuredHeight();
        view3.setPivotX(0.0f);
        view3.setPivotY((float) view.getMeasuredHeight());
        Rect rect3 = new Rect();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(j);
        C12988f fVar = r0;
        C12988f fVar2 = new C12988f(this, view, aVar, i3, i4);
        duration.addListener(fVar);
        C12989g gVar = r0;
        C12989g gVar2 = new C12989g(view, rect3, rect, i, i2, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2);
        duration.addUpdateListener(gVar);
        duration.start();
    }
}
