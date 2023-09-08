package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import er1.C7919x;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49712hj1;

@C113200q(initialMode = 2)
/* renamed from: rs1.da */
public final class C13194da extends UIComponent {

    /* renamed from: v */
    public static final C13195a f37515v = new C13195a((C8480h) null);

    /* renamed from: d */
    public List<? extends View> f37516d;

    /* renamed from: e */
    public final C13601g f37517e;

    /* renamed from: f */
    public final C13601g f37518f = C36568h.m40985a(C13207m.f37542d);

    /* renamed from: g */
    public final C13601g f37519g = C36568h.m40985a(C13196b.f37531d);

    /* renamed from: h */
    public final C13601g f37520h = C36568h.m40985a(C13199e.f37534d);

    /* renamed from: i */
    public final C13601g f37521i = C36568h.m40985a(C13198d.f37533d);

    /* renamed from: j */
    public final C13601g f37522j = C36568h.m40985a(C13197c.f37532d);

    /* renamed from: n */
    public int f37523n;

    /* renamed from: o */
    public final C13601g f37524o = C36568h.m40985a(new C13208n(this));

    /* renamed from: p */
    public C60905o f37525p;

    /* renamed from: q */
    public float f37526q = 1.0f;

    /* renamed from: r */
    public AnimatorSet f37527r;

    /* renamed from: s */
    public long f37528s;

    /* renamed from: t */
    public MotionEvent f37529t;

    /* renamed from: u */
    public final C13601g f37530u = C36568h.m40985a(new C13206l(this));

    /* renamed from: rs1.da$a */
    public static final class C13195a {
        public C13195a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo12692a(androidx.recyclerview.widget.RecyclerView r7) {
            /*
                r6 = this;
                java.lang.String r0 = "recyclerView"
                gy3.C87412m.m108594g(r7, r0)
                android.content.Context r0 = r7.getContext()
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r0, r1)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r7.getLayoutManager()
                boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
                r3 = 0
                if (r2 == 0) goto L_0x001a
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r1 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r1
                goto L_0x001b
            L_0x001a:
                r1 = r3
            L_0x001b:
                r2 = 1065353216(0x3f800000, float:1.0)
                r4 = 0
                if (r1 == 0) goto L_0x0051
                int r1 = r1.mo16957C()
                androidx.recyclerview.widget.RecyclerView$z r7 = r7.mo17024J0(r1, r4)
                boolean r1 = r7 instanceof jq3.C60905o
                if (r1 == 0) goto L_0x002f
                jq3.o r7 = (jq3.C60905o) r7
                goto L_0x0030
            L_0x002f:
                r7 = r3
            L_0x0030:
                if (r7 == 0) goto L_0x0051
                r1 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r7 = r7.mo85812D(r1)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r7 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r7
                if (r7 == 0) goto L_0x0042
                gr1.o2 r7 = r7.getVideoView()
                goto L_0x0043
            L_0x0042:
                r7 = r3
            L_0x0043:
                boolean r1 = r7 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r1 == 0) goto L_0x004a
                r3 = r7
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
            L_0x004a:
                if (r3 == 0) goto L_0x0051
                float r7 = r3.getPlaySpeedRatio()
                goto L_0x0053
            L_0x0051:
                r7 = 1065353216(0x3f800000, float:1.0)
            L_0x0053:
                r1 = 1056964608(0x3f000000, float:0.5)
                r3 = 1
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 != 0) goto L_0x005c
                r1 = 1
                goto L_0x005d
            L_0x005c:
                r1 = 0
            L_0x005d:
                if (r1 == 0) goto L_0x006c
                r7 = 2131832854(0x7f113016, float:1.9298774E38)
                java.lang.String r7 = r0.getString(r7)
                java.lang.String r0 = "context.getString(R.stri…ega_video_play_speed_0_5)"
                gy3.C87412m.m108593f(r7, r0)
                goto L_0x00b7
            L_0x006c:
                int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r1 != 0) goto L_0x0072
                r1 = 1
                goto L_0x0073
            L_0x0072:
                r1 = 0
            L_0x0073:
                java.lang.String r2 = "context.getString(R.stri…ga_video_play_speed_text)"
                r5 = 2131832860(0x7f11301c, float:1.9298786E38)
                if (r1 == 0) goto L_0x0082
                java.lang.String r7 = r0.getString(r5)
                gy3.C87412m.m108593f(r7, r2)
                goto L_0x00b7
            L_0x0082:
                r1 = 1069547520(0x3fc00000, float:1.5)
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 != 0) goto L_0x008a
                r1 = 1
                goto L_0x008b
            L_0x008a:
                r1 = 0
            L_0x008b:
                if (r1 == 0) goto L_0x009a
                r7 = 2131832856(0x7f113018, float:1.9298778E38)
                java.lang.String r7 = r0.getString(r7)
                java.lang.String r0 = "context.getString(R.stri…ega_video_play_speed_1_5)"
                gy3.C87412m.m108593f(r7, r0)
                goto L_0x00b7
            L_0x009a:
                r1 = 1073741824(0x40000000, float:2.0)
                int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r7 != 0) goto L_0x00a1
                r4 = 1
            L_0x00a1:
                if (r4 == 0) goto L_0x00b0
                r7 = 2131832857(0x7f113019, float:1.929878E38)
                java.lang.String r7 = r0.getString(r7)
                java.lang.String r0 = "context.getString(R.stri….mega_video_play_speed_2)"
                gy3.C87412m.m108593f(r7, r0)
                goto L_0x00b7
            L_0x00b0:
                java.lang.String r7 = r0.getString(r5)
                gy3.C87412m.m108593f(r7, r2)
            L_0x00b7:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13194da.C13195a.mo12692a(androidx.recyclerview.widget.RecyclerView):java.lang.String");
        }
    }

    /* renamed from: rs1.da$b */
    public static final class C13196b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13196b f37531d = new C13196b();

        public C13196b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a84));
        }
    }

    /* renamed from: rs1.da$c */
    public static final class C13197c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13197c f37532d = new C13197c();

        public C13197c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a86));
        }
    }

    /* renamed from: rs1.da$d */
    public static final class C13198d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13198d f37533d = new C13198d();

        public C13198d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3705bx));
        }
    }

    /* renamed from: rs1.da$e */
    public static final class C13199e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13199e f37534d = new C13199e();

        public C13199e() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3758d_));
        }
    }

    /* renamed from: rs1.da$f */
    public static final class C13200f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f37535d;

        public C13200f(View view) {
            this.f37535d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f37535d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf((valueAnimator.getAnimatedFraction() * 0.7f) + 0.1f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: rs1.da$g */
    public static final class C13201g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f37536d;

        public C13201g(View view) {
            this.f37536d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f37536d;
            float animatedFraction = 0.8f - (valueAnimator.getAnimatedFraction() * 0.7f);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(animatedFraction));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: rs1.da$h */
    public static final class C13202h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f37537d;

        public C13202h(View view) {
            this.f37537d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f37537d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf((valueAnimator.getAnimatedFraction() * 0.7f) + 0.1f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: rs1.da$i */
    public static final class C13203i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f37538d;

        public C13203i(View view) {
            this.f37538d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f37538d;
            float animatedFraction = 0.8f - (valueAnimator.getAnimatedFraction() * 0.7f);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(animatedFraction));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedPlayAnim$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: rs1.da$j */
    public static final class C13204j extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C13194da f37539d;

        public C13204j(C13194da daVar) {
            this.f37539d = daVar;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f37539d.mo12690i3().getVisibility() == 0) {
                AnimatorSet animatorSet = this.f37539d.f37527r;
                if (animatorSet != null) {
                    animatorSet.setStartDelay(300);
                }
                AnimatorSet animatorSet2 = this.f37539d.f37527r;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
            }
        }
    }

    /* renamed from: rs1.da$k */
    public static final class C13205k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f37540d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13205k(AppCompatActivity appCompatActivity) {
            super(0);
            this.f37540d = appCompatActivity;
        }

        public Object invoke() {
            View inflate = C85868k2.m106137b(this.f37540d).inflate(C0966R.C0971layout.abl, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.jz5);
            if (textView != null) {
                textView.setTag(Float.valueOf(0.5f));
            }
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.jz6);
            if (textView2 != null) {
                textView2.setTag(Float.valueOf(1.0f));
            }
            TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.jz7);
            if (textView3 != null) {
                textView3.setTag(Float.valueOf(1.5f));
            }
            TextView textView4 = (TextView) inflate.findViewById(C0966R.C0970id.jz8);
            if (textView4 != null) {
                textView4.setTag(Float.valueOf(2.0f));
            }
            return inflate;
        }
    }

    /* renamed from: rs1.da$l */
    public static final class C13206l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13194da f37541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13206l(C13194da daVar) {
            super(0);
            this.f37541d = daVar;
        }

        public Object invoke() {
            View inflate = C85868k2.m106137b(this.f37541d.getContext()).inflate(C0966R.C0971layout.f7196wj, (ViewGroup) null);
            View findViewById = inflate.findViewById(C0966R.C0970id.l5q);
            C87412m.m108593f(findViewById, "findViewById<TextView>(R…inder_speed_play_hint_tv)");
            C7919x.m8091a((TextView) findViewById);
            return inflate;
        }
    }

    /* renamed from: rs1.da$m */
    public static final class C13207m extends C87413o implements C32224a<ArrayList<Float>> {

        /* renamed from: d */
        public static final C13207m f37542d = new C13207m();

        public C13207m() {
            super(0);
        }

        public Object invoke() {
            return C64197v.m75534c(Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f));
        }
    }

    /* renamed from: rs1.da$n */
    public static final class C13208n extends C87413o implements C32224a<Vibrator> {

        /* renamed from: d */
        public final /* synthetic */ C13194da f37543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13208n(C13194da daVar) {
            super(0);
            this.f37543d = daVar;
        }

        public Object invoke() {
            Object systemService = this.f37543d.getContext().getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                return (Vibrator) systemService;
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13194da(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37517e = C36568h.m40985a(new C13205k(appCompatActivity));
    }

    /* renamed from: j3 */
    public static void m12604j3(C13194da daVar, boolean z, boolean z2, float f, int i, Object obj) {
        int i2;
        C13194da daVar2 = daVar;
        boolean z3 = (i & 1) != 0 ? true : z;
        boolean z4 = (i & 2) != 0 ? true : z2;
        float f2 = (i & 4) != 0 ? 0.0f : f;
        List<? extends View> list = daVar2.f37516d;
        if (list != null) {
            for (View view : list) {
                if (z4) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideSpeedControlArea", "(ZZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideSpeedControlArea", "(ZZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (z3) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    View view3 = view;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideSpeedControlArea", "(ZZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideSpeedControlArea", "(ZZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.animate().alpha(1.0f).setDuration(300).setListener(new C13221ea(view)).start();
                }
            }
            View findViewById = daVar.mo12689g3().findViewById(C0966R.C0970id.hx5);
            C49712hj1 hj12 = null;
            if (findViewById != null) {
                if (z3) {
                    int height = daVar2.f37523n == -90 ? -findViewById.getHeight() : findViewById.getHeight();
                    if (daVar.getContext().getResources().getConfiguration().orientation == 2) {
                        i2 = findViewById.getWidth();
                        height = 0;
                    } else {
                        i2 = 0;
                    }
                    findViewById.animate().translationY((float) height).translationX((float) i2).setDuration(300).setListener(new C13237fa(daVar2, findViewById)).start();
                } else {
                    View decorView = daVar.getActivity().getWindow().getDecorView();
                    ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(daVar.mo12689g3());
                    }
                }
            }
            daVar2.f37516d = null;
            daVar2.f37523n = 0;
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f3 = C13442s8.f38060Q0.mo12873f(daVar.getActivity());
            if (f3 != null) {
                hj12 = f3.mo12861q3();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("speedplay_click_result", (int) (((float) 2) * f2));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(hj12, "speedplayresult", 1, jSONObject);
        }
    }

    /* renamed from: k3 */
    public static void m12605k3(C13194da daVar, List list, FinderThumbPlayerProxy finderThumbPlayerProxy, int i, boolean z, C32224a aVar, int i2, Object obj) {
        JSONObject jSONObject;
        float f;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            aVar = null;
        }
        daVar.getClass();
        C87412m.m108594g(list, "viewsToHide");
        C87412m.m108594g(finderThumbPlayerProxy, "targetVideoView");
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f2 = C13442s8.f38060Q0.mo12873f(daVar.getActivity());
        C49712hj1 q3 = f2 != null ? f2.mo12861q3() : null;
        if (z) {
            jSONObject = new JSONObject();
            jSONObject.put("ref_eid", "transpose_video_card");
            C13598b0 b0Var = C13598b0.f38549a;
        } else {
            jSONObject = null;
        }
        f2Var.mo8577a(q3, "speedplay", 1, jSONObject);
        daVar.f37516d = list;
        daVar.f37523n = i;
        List<TextView> f3 = C64197v.m75537f((TextView) daVar.mo12689g3().findViewById(C0966R.C0970id.jz5), (TextView) daVar.mo12689g3().findViewById(C0966R.C0970id.jz6), (TextView) daVar.mo12689g3().findViewById(C0966R.C0970id.jz7), (TextView) daVar.mo12689g3().findViewById(C0966R.C0970id.jz8));
        C63556ia iaVar = new C63556ia(f3, finderThumbPlayerProxy, daVar, aVar);
        float playSpeedRatio = finderThumbPlayerProxy.getPlaySpeedRatio();
        for (TextView textView : f3) {
            Object tag = textView != null ? textView.getTag() : null;
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Float");
            if (Float.compare(playSpeedRatio, ((Float) tag).floatValue()) == 0) {
                textView.setTextColor(daVar.getContext().getResources().getColor(C0966R.color.f2939n));
            } else {
                textView.setTextColor(-1);
            }
            textView.setOnClickListener(iaVar);
        }
        List<? extends View> list2 = daVar.f37516d;
        if (list2 != null) {
            for (View view : list2) {
                view.animate().alpha(0.0f).setDuration(300).setListener(new C13247ga(view)).start();
            }
        }
        View decorView = daVar.getActivity().getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(daVar.mo12689g3(), new FrameLayout.LayoutParams(-1, -1));
        }
        LinearLayout linearLayout = (LinearLayout) daVar.mo12689g3().findViewById(C0966R.C0970id.hx5);
        if (linearLayout != null) {
            if (daVar.getContext().getResources().getConfiguration().orientation == 2) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 8388613;
                layoutParams2.width = daVar.mo12688f3();
                layoutParams2.height = -1;
                linearLayout.requestLayout();
                linearLayout.setPadding(0, 0, 0, ((Number) ((C36570n) daVar.f37520h).getValue()).intValue());
                linearLayout.setOrientation(1);
                linearLayout.setTranslationX((float) daVar.mo12688f3());
                linearLayout.setTranslationY(0.0f);
                linearLayout.animate().translationY(0.0f).translationX(0.0f).setDuration(300).setListener((Animator.AnimatorListener) null).start();
            } else {
                ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 80;
                layoutParams4.width = -1;
                layoutParams4.height = daVar.mo12688f3();
                linearLayout.requestLayout();
                linearLayout.setTranslationX(0.0f);
                linearLayout.setOrientation(0);
                if (i == -90) {
                    ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                    C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams5).gravity = 48;
                    linearLayout.setPadding(0, ((Number) ((C36570n) daVar.f37520h).getValue()).intValue(), 0, 0);
                    for (TextView textView2 : f3) {
                        if (textView2 != null) {
                            textView2.setRotation((float) i);
                        }
                        ViewGroup.LayoutParams layoutParams6 = textView2 != null ? textView2.getLayoutParams() : null;
                        if (layoutParams6 != null) {
                            layoutParams6.width = ((Number) ((C36570n) daVar.f37522j).getValue()).intValue();
                        }
                        ViewGroup.LayoutParams layoutParams7 = textView2 != null ? textView2.getLayoutParams() : null;
                        if (layoutParams7 != null) {
                            layoutParams7.height = ((Number) ((C36570n) daVar.f37521i).getValue()).intValue();
                        }
                    }
                    f = -((float) daVar.mo12688f3());
                } else {
                    ViewGroup.LayoutParams layoutParams8 = linearLayout.getLayoutParams();
                    C87412m.m108592e(layoutParams8, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams8).gravity = 80;
                    linearLayout.setPadding(0, 0, 0, ((Number) ((C36570n) daVar.f37520h).getValue()).intValue());
                    linearLayout.setRotation(0.0f);
                    for (TextView textView3 : f3) {
                        if (textView3 != null) {
                            textView3.setRotation((float) i);
                        }
                        ViewGroup.LayoutParams layoutParams9 = textView3 != null ? textView3.getLayoutParams() : null;
                        if (layoutParams9 != null) {
                            layoutParams9.width = i == 0 ? ((Number) ((C36570n) daVar.f37521i).getValue()).intValue() : ((Number) ((C36570n) daVar.f37522j).getValue()).intValue();
                        }
                        ViewGroup.LayoutParams layoutParams10 = textView3 != null ? textView3.getLayoutParams() : null;
                        if (layoutParams10 != null) {
                            layoutParams10.height = i == 0 ? ((Number) ((C36570n) daVar.f37522j).getValue()).intValue() : ((Number) ((C36570n) daVar.f37521i).getValue()).intValue();
                        }
                        if (textView3 != null) {
                            textView3.requestLayout();
                        }
                    }
                    f = (float) daVar.mo12688f3();
                }
                linearLayout.setTranslationY(f);
                linearLayout.animate().translationY(0.0f).translationX(0.0f).setDuration(300).setListener((Animator.AnimatorListener) null).start();
            }
        }
        daVar.mo12689g3().setOnClickListener(new C13265ha(daVar));
    }

    /* renamed from: c3 */
    public final void mo12685c3(FinderThumbPlayerProxy finderThumbPlayerProxy) {
        float f;
        C87412m.m108594g(finderThumbPlayerProxy, "targetVideoView");
        int indexOf = ((ArrayList) ((C36570n) this.f37518f).getValue()).indexOf(Float.valueOf(finderThumbPlayerProxy.getPlaySpeedRatio()));
        if (indexOf == -1) {
            f = 1.0f;
        } else {
            int i = indexOf + 1;
            if (i >= ((ArrayList) ((C36570n) this.f37518f).getValue()).size()) {
                i = 0;
            }
            Object obj = ((ArrayList) ((C36570n) this.f37518f).getValue()).get(i);
            C87412m.m108593f(obj, "{\n            var nextIn…List[nextIndex]\n        }");
            f = ((Number) obj).floatValue();
        }
        finderThumbPlayerProxy.setPlaySpeed(f);
        boolean z = f == 0.5f;
        int i2 = C0966R.raw.icons_outlined_channels_play_quickly_1;
        if (z) {
            i2 = C0966R.raw.icons_outlined_channels_play_quickly_0_5;
        } else {
            if (!(f == 1.0f)) {
                if (f == 1.5f) {
                    i2 = C0966R.raw.icons_outlined_channels_play_quickly_1_5;
                } else {
                    if (f == 2.0f) {
                        i2 = C0966R.raw.icons_outlined_channels_play_quickly_2;
                    }
                }
            }
        }
        WeImageView weImageView = (WeImageView) getActivity().findViewById(C0966R.C0970id.nag);
        if (weImageView != null) {
            weImageView.setImageResource(i2);
        }
        WeImageView weImageView2 = (WeImageView) getActivity().findViewById(C0966R.C0970id.hx6);
        if (weImageView2 != null) {
            weImageView2.setImageResource(i2);
        }
        C76912y0.makeText((Context) getActivity(), (CharSequence) getContext().getString(C0966R.string.mpc, new Object[]{Float.valueOf(f)}), 0).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.mo85811C();
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12686d3() {
        /*
            r17 = this;
            r0 = r17
            jq3.o r1 = r0.f37525p
            r2 = 0
            if (r1 == 0) goto L_0x0012
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo85811C()
            if (r1 == 0) goto L_0x0012
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r3 == 0) goto L_0x001a
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r1 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r1
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            r3 = 1
            if (r1 == 0) goto L_0x0020
            r1.f162357A = r3
        L_0x0020:
            android.app.Activity r1 = r17.getContext()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            r4 = 0
            if (r1 == 0) goto L_0x0051
            android.app.Activity r1 = r17.getContext()
            r5 = 2131316254(0x7f094e1e, float:1.8250984E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.plugin.finder.view.FinderViewPager r1 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r1
            if (r1 != 0) goto L_0x0039
            goto L_0x0051
        L_0x0039:
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99411h1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            r1.setEnableViewPagerScroll(r3)
        L_0x0051:
            jq3.o r1 = r0.f37525p
            if (r1 == 0) goto L_0x0065
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r1 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
            if (r1 == 0) goto L_0x0065
            gr1.o2 r1 = r1.getVideoView()
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r3 == 0) goto L_0x006d
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r1
            goto L_0x006e
        L_0x006d:
            r1 = r2
        L_0x006e:
            if (r1 == 0) goto L_0x0075
            float r3 = r0.f37526q
            r1.setPlaySpeed(r3)
        L_0x0075:
            r0.mo12691l3(r4)
            android.view.View r1 = r17.mo12690i3()
            android.view.ViewParent r1 = r1.getParent()
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0087
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0088
        L_0x0087:
            r1 = r2
        L_0x0088:
            if (r1 == 0) goto L_0x0091
            android.view.View r3 = r17.mo12690i3()
            r1.removeView(r3)
        L_0x0091:
            jq3.o r1 = r0.f37525p
            r5 = 0
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r1.f173503E
            cm1.i2 r1 = (cm1.C0740i2) r1
            if (r1 == 0) goto L_0x00a2
            long r7 = r1.getItemId()
            goto L_0x00a3
        L_0x00a2:
            r7 = r5
        L_0x00a3:
            r0.f37525p = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f37526q = r1
            android.view.View r1 = r17.mo12687e3()
            if (r1 != 0) goto L_0x00b0
            goto L_0x00f0
        L_0x00b0:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r9)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r12 = "finishSpeedPlay"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r11 = "finishSpeedPlay"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x00f0:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0199
            android.view.MotionEvent r1 = r0.f37529t
            if (r1 == 0) goto L_0x0199
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            android.app.Activity r3 = r17.getContext()
            rs1.s8 r1 = r1.mo12873f(r3)
            if (r1 == 0) goto L_0x0108
            te3.hj1 r2 = r1.mo12861q3()
        L_0x0108:
            android.view.MotionEvent r1 = r0.f37529t
            if (r1 == 0) goto L_0x0115
            float r1 = r1.getX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0119
        L_0x0115:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L_0x0119:
            android.view.MotionEvent r3 = r0.f37529t
            if (r3 == 0) goto L_0x0126
            float r3 = r3.getY()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x012a
        L_0x0126:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x012a:
            float r1 = r1.floatValue()
            android.app.Activity r4 = r17.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            float r4 = (float) r4
            float r1 = r1 / r4
            r4 = 100
            float r4 = (float) r4
            float r1 = r1 * r4
            int r1 = (int) r1
            float r3 = r3.floatValue()
            android.app.Activity r5 = r17.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.heightPixels
            float r5 = (float) r5
            float r3 = r3 / r5
            float r3 = r3 * r4
            int r3 = (int) r3
            dp1.f2 r4 = dp1.C7435f2.f25626a
            r5 = 4
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            java.lang.String r8 = "feedid"
            r6.put(r8, r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r0.f37528s
            long r7 = r7 - r9
            java.lang.String r9 = "push_time"
            r6.put(r9, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r1 = 95
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = r7.toString()
            java.lang.String r3 = "push_area"
            r6.put(r3, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            java.lang.String r1 = "video_card"
            r4.mo8577a(r2, r1, r5, r6)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13194da.mo12686d3():void");
    }

    /* renamed from: e3 */
    public final View mo12687e3() {
        C13392r4 r4Var = (C13392r4) C39818r.f106831a.mo62444c(getActivity()).mo62449e(C13392r4.class);
        if (r4Var != null) {
            View view = r4Var.f37938e;
            if (view == null) {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return getActivity().findViewById(C0966R.C0970id.egf);
    }

    /* renamed from: f3 */
    public final int mo12688f3() {
        return ((Number) ((C36570n) this.f37519g).getValue()).intValue();
    }

    /* renamed from: g3 */
    public final View mo12689g3() {
        return (View) ((C36570n) this.f37517e).getValue();
    }

    /* renamed from: i3 */
    public final View mo12690i3() {
        return (View) ((C36570n) this.f37530u).getValue();
    }

    /* renamed from: l3 */
    public final void mo12691l3(boolean z) {
        View i3 = mo12690i3();
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(i3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(i3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z) {
            AnimatorSet animatorSet = this.f37527r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            View findViewById = mo12690i3().findViewById(C0966R.C0970id.l6n);
            View findViewById2 = mo12690i3().findViewById(C0966R.C0970id.l6z);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.1f));
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(0.1f));
            View view = findViewById2;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showSpeedPlayAnim", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C13200f(findViewById));
            ofFloat.setDuration(250);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.addUpdateListener(new C13201g(findViewById));
            ofFloat2.setStartDelay(250);
            ofFloat2.setDuration(250);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat3.addUpdateListener(new C13202h(findViewById2));
            ofFloat3.setStartDelay(400);
            ofFloat3.setDuration(250);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat4.addUpdateListener(new C13203i(findViewById2));
            ofFloat4.setStartDelay(650);
            ofFloat4.setDuration(250);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
            animatorSet2.addListener(new C13204j(this));
            this.f37527r = animatorSet2;
            animatorSet2.start();
            return;
        }
        AnimatorSet animatorSet3 = this.f37527r;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.f37527r = null;
    }

    public boolean onBackPressed() {
        if (this.f37516d == null) {
            return super.onBackPressed();
        }
        m12604j3(this, false, false, 0.0f, 7, (Object) null);
        return true;
    }
}
