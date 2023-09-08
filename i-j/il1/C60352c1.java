package il1;

import al1.C54126g;
import al1.C54130j;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cj1.C54733a1;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import dk1.C58312g;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import qj1.C62660c;
import rx3.C13598b0;
import y50.C15936n0;

/* renamed from: il1.c1 */
public final class C60352c1 {

    /* renamed from: A */
    public final TextView f172026A;

    /* renamed from: B */
    public final View f172027B;

    /* renamed from: C */
    public final View f172028C;

    /* renamed from: D */
    public final TextView f172029D;

    /* renamed from: E */
    public final TextView f172030E;

    /* renamed from: F */
    public final View f172031F;

    /* renamed from: G */
    public final View f172032G;

    /* renamed from: H */
    public int f172033H;

    /* renamed from: I */
    public int f172034I;

    /* renamed from: J */
    public final MTimerHandler f172035J;

    /* renamed from: a */
    public final ViewGroup f172036a;

    /* renamed from: b */
    public final C58124b f172037b;

    /* renamed from: c */
    public final C62660c f172038c;

    /* renamed from: d */
    public final String f172039d = "FinderLiveBattleTopInfoWidget";

    /* renamed from: e */
    public final String f172040e = "finder_live_pk_result_win.pag";

    /* renamed from: f */
    public final String f172041f = "finder_live_pk_result_win_en.pag";

    /* renamed from: g */
    public final String f172042g = "finder_live_pk_result_draw.pag";

    /* renamed from: h */
    public final String f172043h = "finder_live_pk_result_draw_en.pag";

    /* renamed from: i */
    public final String f172044i = "finder_live_pk_result_win_streak.pag";

    /* renamed from: j */
    public final String f172045j = "finder_live_pk_result_win_streak_en.pag";

    /* renamed from: k */
    public final int f172046k = 1;

    /* renamed from: l */
    public final int f172047l;

    /* renamed from: m */
    public final PAGView f172048m;

    /* renamed from: n */
    public final PAGView f172049n;

    /* renamed from: o */
    public final TextView f172050o;

    /* renamed from: p */
    public final View f172051p;

    /* renamed from: q */
    public final View f172052q;

    /* renamed from: r */
    public final View f172053r;

    /* renamed from: s */
    public final View f172054s;

    /* renamed from: t */
    public final ImageView f172055t;

    /* renamed from: u */
    public final TextView f172056u;

    /* renamed from: v */
    public final View f172057v;

    /* renamed from: w */
    public final ImageView f172058w;

    /* renamed from: x */
    public final TextView f172059x;

    /* renamed from: y */
    public final PAGView f172060y;

    /* renamed from: z */
    public final View f172061z;

    /* renamed from: il1.c1$a */
    public static final class C60353a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C60352c1 f172062d;

        public C60353a(C60352c1 c1Var) {
            this.f172062d = c1Var;
        }

        public void onAnimationCancel(PAGView pAGView) {
        }

        public void onAnimationEnd(PAGView pAGView) {
            Class cls = C54991o.class;
            Class cls2 = C54963d0.class;
            String str = this.f172062d.f172039d;
            Log.m105924i(str, "onAnimationEnd status:" + this.f172062d.f172033H);
            C60352c1 c1Var = this.f172062d;
            int i = c1Var.f172033H;
            c1Var.getClass();
            if (i == 0) {
                this.f172062d.f172048m.setVisibility(8);
                View view = this.f172062d.f172051p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f172062d.f172061z;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f172062d.f172027B;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f172062d.f172028C;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C54733a1 a1Var = ((C54963d0) this.f172062d.f172038c.mo87696x0(cls2)).f154051E;
                C54126g gVar = null;
                C54126g c = a1Var != null ? a1Var.mo75624c(((C54991o) this.f172062d.f172038c.mo87696x0(cls)).f154345o) : null;
                C54733a1 a1Var2 = ((C54963d0) this.f172062d.f172038c.mo87696x0(cls2)).f154051E;
                if (a1Var2 != null) {
                    gVar = a1Var2.mo75623b(((C54991o) this.f172062d.f172038c.mo87696x0(cls)).f154345o);
                }
                this.f172062d.mo85318b(c, gVar, true);
            }
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
            String str = this.f172062d.f172039d;
            Log.m105924i(str, "onAnimationStart status:" + this.f172062d.f172033H);
            C60352c1 c1Var = this.f172062d;
            int i = c1Var.f172033H;
            c1Var.getClass();
            if (i == 0) {
                View view = this.f172062d.f172053r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationStart", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationStart", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view2 = this.f172062d.f172053r;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationStart", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$1", "onAnimationStart", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f172062d.f172053r.animate().alpha(1.0f).setListener((Animator.AnimatorListener) null).setDuration(500).setInterpolator(new AccelerateInterpolator()).start();
                C60352c1 c1Var2 = this.f172062d;
                c1Var2.f172036a.postDelayed(new C60388e1(c1Var2), 2500);
            }
        }
    }

    /* renamed from: il1.c1$b */
    public static final class C60354b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C60352c1 f172063d;

        public C60354b(C60352c1 c1Var) {
            this.f172063d = c1Var;
        }

        public final boolean onTimerExpired() {
            Class cls = C54963d0.class;
            C54733a1 a1Var = ((C54963d0) this.f172063d.f172038c.mo87696x0(cls)).f154051E;
            int i = 0;
            if ((a1Var != null ? a1Var.f153390c : 0) != 0) {
                C54733a1 a1Var2 = ((C54963d0) this.f172063d.f172038c.mo87696x0(cls)).f154051E;
                if (!(a1Var2 != null && a1Var2.f153392e == 2)) {
                    return false;
                }
                C54733a1 a1Var3 = ((C54963d0) this.f172063d.f172038c.mo87696x0(cls)).f154051E;
                if ((a1Var3 != null ? a1Var3.f153390c : 0) <= 0) {
                    return false;
                }
                C60352c1 c1Var = this.f172063d;
                Log.m105924i(c1Var.f172039d, "coundDown");
                C54733a1 a1Var4 = ((C54963d0) c1Var.f172038c.mo87696x0(cls)).f154051E;
                if (a1Var4 != null) {
                    int i2 = a1Var4.f153390c - 1;
                    a1Var4.f153390c = i2;
                    if (i2 < 10) {
                        TextView textView = c1Var.f172026A;
                        StringBuilder sb = new StringBuilder();
                        sb.append('0');
                        sb.append(a1Var4.f153390c);
                        textView.setText(sb.toString());
                        c1Var.f172026A.setScaleX(1.5f);
                        c1Var.f172026A.setScaleY(1.5f);
                        c1Var.f172026A.animate().scaleX(1.0f).scaleY(1.0f).start();
                    } else {
                        TextView textView2 = c1Var.f172026A;
                        C15936n0.C15937a aVar = C15936n0.f42815a;
                        C54733a1 a1Var5 = ((C54963d0) c1Var.f172038c.mo87696x0(cls)).f154051E;
                        if (a1Var5 != null) {
                            i = a1Var5.f153390c;
                        }
                        textView2.setText(aVar.mo14587b(i, XVFSFile.PATH_SEPARATOR));
                    }
                }
                return true;
            } else if (!C62042e.f176370a.mo87030O0()) {
                return false;
            } else {
                C60352c1 c1Var2 = this.f172063d;
                Log.m105924i(c1Var2.f172039d, "showCounting");
                View view = c1Var2.f172028C;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = c1Var2.f172027B;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return false;
            }
        }
    }

    /* renamed from: il1.c1$c */
    public static final class C60355c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60352c1 f172064d;

        /* renamed from: e */
        public final /* synthetic */ C54126g f172065e;

        /* renamed from: f */
        public final /* synthetic */ C54126g f172066f;

        /* renamed from: g */
        public final /* synthetic */ boolean f172067g;

        public C60355c(C60352c1 c1Var, C54126g gVar, C54126g gVar2, boolean z) {
            this.f172064d = c1Var;
            this.f172065e = gVar;
            this.f172066f = gVar2;
            this.f172067g = z;
        }

        public final void run() {
            C13598b0 b0Var;
            int right = this.f172064d.f172032G.getRight();
            C60352c1 c1Var = this.f172064d;
            int i = right + c1Var.f172047l;
            int left = c1Var.f172031F.getLeft();
            int measuredWidth = this.f172064d.f172060y.getMeasuredWidth() <= 0 ? this.f172064d.f172047l : this.f172064d.f172060y.getMeasuredWidth();
            C54126g gVar = this.f172065e;
            C54126g gVar2 = this.f172066f;
            C60352c1 c1Var2 = this.f172064d;
            if (gVar == null || gVar2 == null) {
                b0Var = null;
            } else {
                long j = gVar.f151974b + gVar2.f151974b;
                String str = c1Var2.f172039d;
                Log.m105924i(str, "updateBattleBar: rewardTotal:" + j + ", self.wecoinHot:" + gVar.f151974b);
                if (j == 0) {
                    ViewGroup.LayoutParams layoutParams = c1Var2.f172060y.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((((C75044y4.m89990b(c1Var2.f172036a.getContext()).x / 2) - measuredWidth) - 0) + C74942w4.m89784a(c1Var2.f172036a.getContext(), 8));
                    ViewGroup.LayoutParams layoutParams2 = c1Var2.f172052q.getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((C75044y4.m89990b(c1Var2.f172036a.getContext()).x / 2) - 0);
                } else {
                    float f = (((float) gVar.f151974b) / ((float) j)) * ((float) C75044y4.m89990b(c1Var2.f172036a.getContext()).x);
                    float f2 = (float) i;
                    if (f < f2) {
                        f = f2;
                    }
                    float f3 = (float) left;
                    if (f > f3) {
                        f = f3;
                    }
                    ViewGroup.LayoutParams layoutParams3 = c1Var2.f172060y.getLayoutParams();
                    C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    int i2 = (int) (f - ((float) 0));
                    ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart((i2 - measuredWidth) + C74942w4.m89784a(c1Var2.f172036a.getContext(), 8));
                    ViewGroup.LayoutParams layoutParams4 = c1Var2.f172052q.getLayoutParams();
                    C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(i2);
                }
                c1Var2.f172051p.requestLayout();
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                boolean z = this.f172067g;
                C60352c1 c1Var3 = this.f172064d;
                if (z) {
                    ViewGroup.LayoutParams layoutParams5 = c1Var3.f172060y.getLayoutParams();
                    C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart((((C75044y4.m89990b(c1Var3.f172036a.getContext()).x / 2) - measuredWidth) - 0) + C74942w4.m89784a(c1Var3.f172036a.getContext(), 8));
                    ViewGroup.LayoutParams layoutParams6 = c1Var3.f172052q.getLayoutParams();
                    C87412m.m108592e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart((C75044y4.m89990b(c1Var3.f172036a.getContext()).x / 2) - 0);
                    c1Var3.f172051p.requestLayout();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60352c1(android.view.ViewGroup r11, d60.C58124b r12, qj1.C62660c r13) {
        /*
            r10 = this;
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "statusMonitor"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "basePlugin"
            gy3.C87412m.m108594g(r13, r0)
            r10.<init>()
            r10.f172036a = r11
            r10.f172037b = r12
            r10.f172038c = r13
            java.lang.String r12 = "FinderLiveBattleTopInfoWidget"
            r10.f172039d = r12
            java.lang.String r12 = "finder_live_pk_result_win.pag"
            r10.f172040e = r12
            java.lang.String r12 = "finder_live_pk_result_win_en.pag"
            r10.f172041f = r12
            java.lang.String r12 = "finder_live_pk_result_draw.pag"
            r10.f172042g = r12
            java.lang.String r12 = "finder_live_pk_result_draw_en.pag"
            r10.f172043h = r12
            java.lang.String r12 = "finder_live_pk_result_win_streak.pag"
            r10.f172044i = r12
            java.lang.String r12 = "finder_live_pk_result_win_streak_en.pag"
            r10.f172045j = r12
            r12 = 1
            r10.f172046k = r12
            android.content.Context r13 = r11.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r0 = 2131165353(0x7f0700a9, float:1.794492E38)
            float r13 = r13.getDimension(r0)
            int r13 = (int) r13
            r10.f172047l = r13
            r13 = 2131303176(0x7f091b08, float:1.8224459E38)
            android.view.View r13 = r11.findViewById(r13)
            java.lang.String r0 = "root.findViewById(R.id.f…er_live_battle_start_pag)"
            gy3.C87412m.m108593f(r13, r0)
            org.libpag.PAGView r13 = (org.libpag.PAGView) r13
            r10.f172048m = r13
            r0 = 2131303163(0x7f091afb, float:1.8224433E38)
            android.view.View r0 = r11.findViewById(r0)
            java.lang.String r1 = "root.findViewById(R.id.finder_live_battle_end_pag)"
            gy3.C87412m.m108593f(r0, r1)
            org.libpag.PAGView r0 = (org.libpag.PAGView) r0
            r10.f172049n = r0
            r0 = 2131303162(0x7f091afa, float:1.822443E38)
            android.view.View r0 = r11.findViewById(r0)
            java.lang.String r1 = "root.findViewById(R.id.f…r_live_battle_end_cnt_tv)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f172050o = r0
            r1 = 2131303191(0x7f091b17, float:1.822449E38)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…ve_battle_top_status_bar)"
            gy3.C87412m.m108593f(r1, r2)
            r10.f172051p = r1
            r1 = 2131303194(0x7f091b1a, float:1.8224495E38)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r2 = "root.findViewById(R.id.f…tle_top_status_bar_other)"
            gy3.C87412m.m108593f(r1, r2)
            r10.f172052q = r1
            r1 = 2131303180(0x7f091b0c, float:1.8224467E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f172053r = r1
            r1 = 2131303178(0x7f091b0a, float:1.8224463E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f172054s = r1
            r2 = 2131303177(0x7f091b09, float:1.822446E38)
            android.view.View r2 = r11.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r10.f172055t = r2
            r2 = 2131303179(0x7f091b0b, float:1.8224465E38)
            android.view.View r2 = r11.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.f172056u = r2
            r2 = 2131303174(0x7f091b06, float:1.8224455E38)
            android.view.View r2 = r11.findViewById(r2)
            r10.f172057v = r2
            r3 = 2131303173(0x7f091b05, float:1.8224453E38)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r10.f172058w = r3
            r3 = 2131303175(0x7f091b07, float:1.8224457E38)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f172059x = r3
            r3 = 2131303193(0x7f091b19, float:1.8224493E38)
            android.view.View r3 = r11.findViewById(r3)
            java.lang.String r4 = "root.findViewById(R.id.f…ttle_top_status_bar_icon)"
            gy3.C87412m.m108593f(r3, r4)
            org.libpag.PAGView r3 = (org.libpag.PAGView) r3
            r10.f172060y = r3
            r4 = 2131303196(0x7f091b1c, float:1.82245E38)
            android.view.View r4 = r11.findViewById(r4)
            java.lang.String r5 = "root.findViewById(R.id.f…er_live_battle_top_timer)"
            gy3.C87412m.m108593f(r4, r5)
            r10.f172061z = r4
            r4 = 2131303198(0x7f091b1e, float:1.8224504E38)
            android.view.View r4 = r11.findViewById(r4)
            java.lang.String r5 = "root.findViewById(R.id.f…live_battle_top_timer_tv)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r10.f172026A = r4
            r5 = 2131303197(0x7f091b1d, float:1.8224502E38)
            android.view.View r5 = r11.findViewById(r5)
            java.lang.String r6 = "root.findViewById(R.id.f…e_battle_top_timer_group)"
            gy3.C87412m.m108593f(r5, r6)
            r10.f172027B = r5
            r5 = 2131303183(0x7f091b0f, float:1.8224473E38)
            android.view.View r5 = r11.findViewById(r5)
            java.lang.String r6 = "root.findViewById(R.id.f…attle_top_counting_group)"
            gy3.C87412m.m108593f(r5, r6)
            r10.f172028C = r5
            r5 = 2131303189(0x7f091b15, float:1.8224485E38)
            android.view.View r5 = r11.findViewById(r5)
            java.lang.String r6 = "root.findViewById(R.id.f…_battle_top_info_self_tv)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r10.f172029D = r5
            r6 = 2131303186(0x7f091b12, float:1.822448E38)
            android.view.View r6 = r11.findViewById(r6)
            java.lang.String r7 = "root.findViewById(R.id.f…battle_top_info_other_tv)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r10.f172030E = r6
            r7 = 2131303184(0x7f091b10, float:1.8224475E38)
            android.view.View r7 = r11.findViewById(r7)
            java.lang.String r8 = "root.findViewById(R.id.f…ve_battle_top_info_other)"
            gy3.C87412m.m108593f(r7, r8)
            r10.f172031F = r7
            r7 = 2131303187(0x7f091b13, float:1.8224481E38)
            android.view.View r7 = r11.findViewById(r7)
            java.lang.String r8 = "root.findViewById(R.id.f…ive_battle_top_info_self)"
            gy3.C87412m.m108593f(r7, r8)
            r10.f172032G = r7
            r7 = 0
            r10.f172033H = r7
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            il1.c1$b r9 = new il1.c1$b
            r9.<init>(r10)
            r8.<init>(r9, r12)
            r10.f172035J = r8
            android.content.Context r8 = r11.getContext()
            android.content.res.AssetManager r8 = r8.getAssets()
            java.lang.String r9 = "finder_live_pk_start.pag"
            org.libpag.PAGFile r8 = org.libpag.PAGFile.Load(r8, r9)
            r13.setComposition(r8)
            il1.c1$a r8 = new il1.c1$a
            r8.<init>(r10)
            r13.addListener(r8)
            android.content.Context r13 = r11.getContext()
            android.content.res.AssetManager r13 = r13.getAssets()
            java.lang.String r8 = "finder_live_pk_fire_ball.pag"
            org.libpag.PAGFile r13 = org.libpag.PAGFile.Load(r13, r8)
            r3.setComposition(r13)
            r3.setRepeatCount(r7)
            r3.play()
            r13 = 1069547520(0x3fc00000, float:1.5)
            r3.setScaleY(r13)
            r3.setScaleX(r13)
            android.content.Context r13 = r11.getContext()
            android.graphics.Point r13 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r13)
            int r13 = r13.x
            int r13 = r13 / 2
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r3 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r7 = 0
            if (r3 == 0) goto L_0x01c2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x01c3
        L_0x01c2:
            r1 = r7
        L_0x01c3:
            if (r1 != 0) goto L_0x01c6
            goto L_0x01ce
        L_0x01c6:
            int r3 = r13 * 7
            int r3 = r3 / 25
            int r3 = r3 + r13
            r1.setMarginEnd(r3)
        L_0x01ce:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x01d9
            r7 = r1
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x01d9:
            if (r7 != 0) goto L_0x01dc
            goto L_0x01e4
        L_0x01dc:
            int r1 = r13 * 7
            int r1 = r1 / 25
            int r13 = r13 + r1
            r7.setMarginStart(r13)
        L_0x01e4:
            wc1.b r13 = wc1.C15064b.f41199a
            android.content.Context r1 = r11.getContext()
            java.lang.String r2 = "root.context"
            gy3.C87412m.m108593f(r1, r2)
            r3 = 1093664768(0x41300000, float:11.0)
            float r1 = r13.mo14078c(r1, r3)
            r5.setTextSize(r12, r1)
            r6.setTextSize(r12, r1)
            android.content.Context r11 = r11.getContext()
            gy3.C87412m.m108593f(r11, r2)
            r1 = 1095342490(0x4149999a, float:12.6)
            float r11 = r13.mo14078c(r11, r1)
            r4.setTextSize(r12, r11)
            r11 = 1105199104(0x41e00000, float:28.0)
            r0.setTextSize(r12, r11)
            ok1.e r11 = ok1.C62042e.f176370a
            r11.mo87033P1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60352c1.<init>(android.view.ViewGroup, d60.b, qj1.c):void");
    }

    /* renamed from: a */
    public final void mo85317a(int i) {
        this.f172034I = i;
        C39818r rVar = C39818r.f106831a;
        Context context = this.f172036a.getContext();
        C87412m.m108593f(context, "root.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            i = 8;
        }
        String str = this.f172039d;
        Log.m105924i(str, "battle setVisible: " + i);
        this.f172036a.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo85318b(C54126g gVar, C54126g gVar2, boolean z) {
        String str = this.f172039d;
        Log.m105924i(str, "updateBattleBar: selfBattleInfo:" + gVar + " otherBattleInfo:" + gVar2 + " needInit:" + z);
        this.f172051p.post(new C60355c(this, gVar, gVar2, z));
    }

    /* renamed from: c */
    public final void mo85319c() {
        String str;
        Class cls = C54991o.class;
        Class cls2 = C54963d0.class;
        C54733a1 a1Var = ((C54963d0) this.f172038c.mo87696x0(cls2)).f154051E;
        C54126g gVar = null;
        C54126g c = a1Var != null ? a1Var.mo75624c(((C54991o) this.f172038c.mo87696x0(cls)).f154345o) : null;
        C54733a1 a1Var2 = ((C54963d0) this.f172038c.mo87696x0(cls2)).f154051E;
        if (a1Var2 != null) {
            gVar = a1Var2.mo75623b(((C54991o) this.f172038c.mo87696x0(cls)).f154345o);
        }
        String str2 = this.f172039d;
        Log.m105924i(str2, "updateBattleInfo: selfBattleInfo:" + c + " otherBattleInfo:" + gVar);
        long j = 0;
        this.f172029D.setText(String.valueOf(c != null ? c.f151974b : 0));
        TextView textView = this.f172030E;
        if (gVar != null) {
            j = gVar.f151974b;
        }
        textView.setText(String.valueOf(j));
        this.f172032G.setContentDescription(this.f172036a.getContext().getResources().getString(C0966R.string.f360468n14, new Object[]{this.f172029D.getText()}));
        View view = this.f172031F;
        Resources resources = this.f172036a.getContext().getResources();
        Object[] objArr = new Object[2];
        C54130j jVar = ((C54963d0) this.f172038c.mo87696x0(cls2)).f154073p;
        if (jVar == null || (str = jVar.f152000d) == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = this.f172030E.getText();
        view.setContentDescription(resources.getString(C0966R.string.n15, objArr));
        mo85318b(c, gVar, false);
    }
}
