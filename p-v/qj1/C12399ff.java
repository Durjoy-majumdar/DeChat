package qj1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import cj1.C0548h5;
import cj1.C54795n5;
import cj1.C54804r0;
import cl1.C0654b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget;
import com.tencent.p014mm.plugin.finder.service.C3601l1;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import d60.C58124b;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import er1.C58739j4;
import er1.C7919x;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C8777j5;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import jq3.C60905o;
import kg3.C76577a;
import kotlin.ResultKt;
import l31.C61212e;
import nk1.C11207i;
import o40.C61926c;
import ob0.C117747y;
import ok1.C62042e;
import org.json.JSONObject;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import p565ir.C60606n;
import p629ny.C76979h;
import p823sg.C101614i;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import q31.C118148a;
import qj1.C12677tg;
import qs1.C63325a;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C90363p0;
import te3.C49712hj1;
import te3.C51376tc1;
import te3.C51438ts0;
import te3.C64284cg;
import te3.C64414h71;
import te3.C64426ho2;
import te3.C64676r81;
import te3.C64780vo2;
import te3.C64837xq2;
import tf0.C64916p1;
import up1.C27696y;
import wc1.C15064b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;
import zp3.C79406f;

/* renamed from: qj1.ff */
public final class C12399ff extends C62660c implements View.OnClickListener {

    /* renamed from: A */
    public final TextView f35717A;

    /* renamed from: B */
    public final WeImageView f35718B;

    /* renamed from: C */
    public final FrameLayout f35719C;

    /* renamed from: D */
    public final View f35720D;

    /* renamed from: E */
    public final C13601g f35721E;

    /* renamed from: F */
    public String f35722F;

    /* renamed from: G */
    public String f35723G;

    /* renamed from: H */
    public final RelativeLayout f35724H;

    /* renamed from: I */
    public final View f35725I;

    /* renamed from: J */
    public final TextView f35726J;

    /* renamed from: K */
    public final TextView f35727K;

    /* renamed from: L */
    public final Set<Animator> f35728L;

    /* renamed from: M */
    public boolean f35729M;

    /* renamed from: N */
    public int f35730N;

    /* renamed from: P */
    public final int f35731P;

    /* renamed from: Q */
    public final int f35732Q;

    /* renamed from: R */
    public final int f35733R;

    /* renamed from: S */
    public final long f35734S;

    /* renamed from: T */
    public String f35735T;

    /* renamed from: U */
    public final C13601g f35736U;

    /* renamed from: V */
    public PAGView f35737V;

    /* renamed from: W */
    public int f35738W;

    /* renamed from: X */
    public boolean f35739X;

    /* renamed from: Y */
    public C8794p5<C51376tc1> f35740Y;

    /* renamed from: p */
    public final C58124b f35741p;

    /* renamed from: q */
    public final String f35742q = "PORTRAIT_ACTION_GOTO_PROFILE_TITLE";

    /* renamed from: r */
    public Context f35743r;

    /* renamed from: s */
    public final RelativeLayout f35744s;

    /* renamed from: t */
    public final RelativeLayout f35745t;

    /* renamed from: u */
    public final ImageView f35746u;

    /* renamed from: v */
    public final PAGView f35747v;

    /* renamed from: w */
    public final TextView f35748w;

    /* renamed from: x */
    public final TextView f35749x;

    /* renamed from: y */
    public final ImageView f35750y;

    /* renamed from: z */
    public final ImageView f35751z;

    /* renamed from: qj1.ff$a */
    public static final class C12400a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35752d;

        public C12400a(C12399ff ffVar) {
            this.f35752d = ffVar;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12399ff.m11970Z0(this.f35752d);
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            boolean i1 = this.f35752d.mo12084i1();
            wVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("jump_type", i1 ? "mmbiz_profile" : "findervideo_profile");
            C54116w.Ex0(wVar, C54067f0.C54076o0.BIZ_HEAD, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            if (!(!((C54991o) this.f35752d.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f35752d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2011);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ff$b */
    public static final class C12401b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35753d;

        public C12401b(C12399ff ffVar) {
            this.f35753d = ffVar;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12399ff.m11970Z0(this.f35753d);
            ((C54116w) C86312j.m106911c(C54116w.class)).Kx0(this.f35753d.mo12084i1());
            if (!(!((C54991o) this.f35753d.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f35753d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2012);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ff$c */
    public static final class C12402c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35754d;

        public C12402c(C12399ff ffVar) {
            this.f35754d = ffVar;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12399ff.m11970Z0(this.f35754d);
            ((C54116w) C86312j.m106911c(C54116w.class)).Kx0(this.f35754d.mo12084i1());
            if (!(!((C54991o) this.f35754d.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f35754d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2012);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ff$d */
    public static final class C12403d implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C12399ff f35755a;

        public C12403d(C12399ff ffVar) {
            this.f35755a = ffVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C90363p0.m113143b(new C13604l("live_follow_type", Integer.valueOf(this.f35755a.mo12083h1() ? 1 : 0)));
        }
    }

    /* renamed from: qj1.ff$e */
    public static final class C12404e implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f35756d;

        /* renamed from: e */
        public final /* synthetic */ float f35757e;

        /* renamed from: f */
        public final /* synthetic */ float f35758f;

        /* renamed from: g */
        public final /* synthetic */ float f35759g;

        /* renamed from: h */
        public final /* synthetic */ float f35760h;

        public C12404e(TextView textView, float f, float f2, float f3, float f4) {
            this.f35756d = textView;
            this.f35757e = f;
            this.f35758f = f2;
            this.f35759g = f3;
            this.f35760h = f4;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f35756d.setTextSize(0, this.f35757e);
            this.f35756d.setAlpha(this.f35758f);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                TextView textView = this.f35756d;
                float f = this.f35759g;
                float f2 = this.f35757e;
                float f3 = this.f35760h;
                float f4 = this.f35758f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setTextSize(0, f + ((f2 - f) * ((Float) animatedValue).floatValue()));
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                textView.setAlpha(f3 + ((f4 - f3) * ((Float) animatedValue2).floatValue()));
            }
        }
    }

    /* renamed from: qj1.ff$f */
    public static final class C12405f extends C87413o implements C32224a<FinderLiveFansClubTagWidget> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12405f(ViewGroup viewGroup) {
            super(0);
            this.f35761d = viewGroup;
        }

        public Object invoke() {
            return (FinderLiveFansClubTagWidget) this.f35761d.findViewById(C0966R.C0970id.cs4);
        }
    }

    /* renamed from: qj1.ff$g */
    public static final class C12406g extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12406g(C12399ff ffVar) {
            super(0);
            this.f35762d = ffVar;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C12479jf(this.f35762d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveTitlePlugin$mount$1", mo125469f = "FinderLiveTitlePlugin.kt", mo125470l = {274}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ff$h */
    public static final class C12407h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f35763d;

        /* renamed from: e */
        public final /* synthetic */ C12399ff f35764e;

        /* renamed from: qj1.ff$h$a */
        public static final class C12408a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C12399ff f35765d;

            public C12408a(C12399ff ffVar) {
                this.f35765d = ffVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                ((Boolean) obj).booleanValue();
                C12399ff ffVar = this.f35765d;
                ffVar.mo12088o1(ffVar.f35730N);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12407h(C12399ff ffVar, C15601d<? super C12407h> dVar) {
            super(2, dVar);
            this.f35764e = ffVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12407h(this.f35764e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C12407h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f35763d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<Boolean> u0Var = ((C54991o) this.f35764e.mo87696x0(C54991o.class)).f154189C3;
                C12408a aVar2 = new C12408a(this.f35764e);
                this.f35763d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* renamed from: qj1.ff$i */
    public static final class C12409i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35766d;

        /* renamed from: e */
        public final /* synthetic */ long f35767e;

        public C12409i(C12399ff ffVar, long j) {
            this.f35766d = ffVar;
            this.f35767e = j;
        }

        public final void run() {
            if (!this.f35766d.mo87688G0()) {
                this.f35766d.mo12082f1();
                return;
            }
            Log.m105924i("FinderLiveTitlePlugin", "goToFinderProfileImpl delayMs:" + this.f35767e + ",isFinished!");
        }
    }

    /* renamed from: qj1.ff$j */
    public static final class C12410j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35768d;

        public C12410j(C12399ff ffVar) {
            this.f35768d = ffVar;
        }

        public final void run() {
            C12399ff.m11972g1(this.f35768d, false, 1, (Object) null);
        }
    }

    /* renamed from: qj1.ff$k */
    public static final class C12411k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35769d;

        public C12411k(C12399ff ffVar) {
            this.f35769d = ffVar;
        }

        public final void onClick(View view) {
            C13598b0 b0Var;
            C60085d dVar;
            C60090e eVar;
            C0548h5.C0549a aVar;
            C64414h71 h712;
            C64916p1 p1Var;
            Class cls = C55001u.class;
            Class cls2 = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58969q b = C58961d.f168673a.mo84155b(((C54991o) this.f35769d.mo87696x0(cls2)).f154345o);
            if (b != null) {
                C12399ff ffVar = this.f35769d;
                ffVar.getClass();
                Class cls3 = C64916p1.class;
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(((C0654b) ffVar.mo87696x0(C0654b.class)).f1545g);
                boolean z = z1Var != null && z1Var.mo62927s3();
                boolean AV = ((C64916p1) C86312j.m106911c(cls3)).mo76650AV(b.getNickname());
                if (ffVar.mo12084i1()) {
                    if (!z) {
                        C62042e eVar2 = C62042e.f176370a;
                        Context context = ffVar.f35743r;
                        C87412m.m108593f(context, "context");
                        eVar2.mo87002F(context, ffVar.mo87684A0(), new C12452if(ffVar));
                    }
                } else if (!AV) {
                    boolean Q = C58739j4.f168176a.mo83688Q(b);
                    String O5 = ((C54991o) ffVar.mo87696x0(cls2)).mo75986U3().f183215f == 3 ? C66785b.f191882e.mo90662O5() : "";
                    Log.m105924i("FinderLiveTitlePlugin", "#followAnchor nickName:" + b.getNickname() + ", isPrivate:" + Q);
                    C7335d c = C86312j.m106911c(cls3);
                    C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                    C64916p1 p1Var2 = (C64916p1) c;
                    C39818r rVar = C39818r.f106831a;
                    Context context2 = ffVar.f166287d.getContext();
                    C87412m.m108593f(context2, "root.context");
                    C49712hj1 q3 = ((C60172g4) rVar.mo62443b(context2).mo62447c(C60172g4.class)).mo12861q3();
                    String username = b.getUsername();
                    long j = ((C55001u) ffVar.mo87696x0(cls)).f154416j;
                    C54795n5 D0 = ffVar.mo14476D0();
                    if (D0 != null) {
                        p1Var = p1Var2;
                        h712 = D0.mo75732e0(((C55001u) ffVar.mo87696x0(cls)).f154420q.f182392d);
                    } else {
                        p1Var = p1Var2;
                        h712 = null;
                    }
                    C64916p1.C64917a.m76440g(p1Var, q3, username, 1, j, Q, O5, h712, 1, (Integer) null, 256, (Object) null);
                }
                boolean I = C58739j4.f168176a.mo83680I(b);
                Log.m105924i("FinderLiveTitlePlugin", "followBtn click, nickName:" + b.getNickname() + ", isBlock" + I);
                if (I) {
                    String username2 = b.getUsername();
                    Log.m105924i("FinderLiveTitlePlugin", "[doBlockOpLog] ");
                    ffVar.f35740Y = new C12443hf();
                    ((C3601l1) C86312j.m106911c(C3601l1.class)).Hu0(username2, false, ffVar.f35740Y);
                }
                C62042e eVar3 = C62042e.f176370a;
                TextView textView = ffVar.f35717A;
                eVar3.getClass();
                C87412m.m108594g(textView, "view");
                textView.performHapticFeedback(1, 3);
                ffVar.mo12087m1(true, "#4", Boolean.TRUE, Boolean.FALSE);
                C58124b.C7172a.m7372a(ffVar.f35741p, C58124b.C58125b.CLICK_FOLLOW, (Bundle) null, 2, (Object) null);
                ffVar.mo12081e1().sendEmptyMessageDelayed(ffVar.f35732Q, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                ((C54116w) C86312j.m106911c(C54116w.class)).by0(C54067f0.C0070u.CLICK_2_FOLLOW, ffVar.mo12084i1());
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f35769d.f35717A.setVisibility(8);
                Log.m105924i("FinderLiveTitlePlugin", "no anchor finder contact ");
            }
            C0548h5 h5Var = C0548h5.f1327a;
            long j2 = ((C55001u) this.f35769d.mo87696x0(cls)).f154420q.f182392d;
            C101614i<Long, C0548h5.C0549a> iVar = C0548h5.f1328b;
            if (iVar.check(Long.valueOf(j2)) && (aVar = (C0548h5.C0549a) iVar.get(Long.valueOf(j2))) != null) {
                C7335d c2 = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C54067f0.C0064m mVar = C54067f0.C0064m.FOLLOW_ICON;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("follow_icon_expose_condition_sessionid", aVar.f1330b);
                C13598b0 b0Var2 = C13598b0.f38549a;
                C8777j5.C8778a.m8606g((C8777j5) c2, mVar, linkedHashMap, (String) null, 4, (Object) null);
            }
            if (!(!((C54991o) this.f35769d.mo87696x0(cls2)).mo75990Y3() || (dVar = (C60085d) this.f35769d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2008);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ff$l */
    public static final class C12412l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35770d;

        /* renamed from: e */
        public final /* synthetic */ boolean f35771e;

        public C12412l(C12399ff ffVar, boolean z) {
            this.f35770d = ffVar;
            this.f35771e = z;
        }

        public final void run() {
            Log.m105924i("FinderLiveTitlePlugin", "[showOrDismissAnimView] call true");
            C12399ff.m11973n1(this.f35770d, this.f35771e, true);
        }
    }

    /* renamed from: qj1.ff$m */
    public static final class C12413m implements View.OnClickListener {

        /* renamed from: d */
        public static final C12413m f35772d = new C12413m();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ff$n */
    public static final class C12414n extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35773d;

        /* renamed from: e */
        public final /* synthetic */ boolean f35774e;

        public C12414n(C12399ff ffVar, boolean z) {
            this.f35773d = ffVar;
            this.f35774e = z;
        }

        public void onAnimationCancel(PAGView pAGView) {
            Log.m105924i("FinderLiveTitlePlugin", "[showOrDismissAnimView] onAnimationCancel");
        }

        public void onAnimationEnd(PAGView pAGView) {
            Log.m105924i("FinderLiveTitlePlugin", "[showOrDismissAnimView] onAnimationEnd");
            C12399ff ffVar = this.f35773d;
            boolean z = this.f35774e;
            Boolean bool = Boolean.FALSE;
            ffVar.mo12087m1(z, "#5", bool, bool);
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
            this.f35773d.f35717A.setVisibility(4);
            this.f35773d.f35718B.setVisibility(4);
        }
    }

    /* renamed from: qj1.ff$o */
    public static final class C12415o extends C87413o implements C32227p<View, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12399ff f35775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12415o(C12399ff ffVar) {
            super(2);
            this.f35775d = ffVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C60085d dVar;
            C60090e eVar;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            if (!C58739j4.f168176a.mo83683L()) {
                Log.m105924i("FinderLiveTitlePlugin", "fansClubTag click " + booleanValue);
                if (booleanValue) {
                    C58124b.C7172a.m7372a(this.f35775d.f35741p, C58124b.C58125b.FINDER_LIVE_ANCHOR_FANS_CLUB, (Bundle) null, 2, (Object) null);
                } else {
                    C7335d c = C86312j.m106911c(C54116w.class);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w.Yx0((C54116w) c, C54067f0.C0069t0.JOIN_CLICK, (Boolean) null, C12677tg.C12678a.LIVE_HEADER_BTN, 2, (Object) null);
                    C58124b.C7172a.m7372a(this.f35775d.f35741p, C58124b.C58125b.FINDER_LIVE_ANCHOR_FANS_CLUB, (Bundle) null, 2, (Object) null);
                }
                if (!(!((C54991o) this.f35775d.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f35775d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                    eVar.mo84955a();
                    eVar.mo84957c(2022);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.ff$p */
    public static final class C12416p extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64780vo2 f35776d;

        /* renamed from: e */
        public final /* synthetic */ C12399ff f35777e;

        /* renamed from: f */
        public final /* synthetic */ C63325a f35778f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12416p(C64780vo2 vo22, C12399ff ffVar, C63325a aVar) {
            super(1);
            this.f35776d = vo22;
            this.f35777e = ffVar;
            this.f35778f = aVar;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C12508lf(this.f35776d, ((Boolean) obj).booleanValue(), this.f35777e, this.f35778f));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12399ff(ViewGroup viewGroup, C58124b bVar, C49712hj1 hj12) {
        super(viewGroup, bVar, hj12);
        ViewGroup viewGroup2 = viewGroup;
        C58124b bVar2 = bVar;
        C87412m.m108594g(viewGroup2, "root");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f35741p = bVar2;
        C79406f.m96347a(MMApplicationContext.getContext(), 9.0f);
        C79406f.m96347a(MMApplicationContext.getContext(), 10.0f);
        C79406f.m96347a(MMApplicationContext.getContext(), 11.0f);
        C79406f.m96347a(MMApplicationContext.getContext(), 20.0f);
        C79406f.m96347a(MMApplicationContext.getContext(), 42.0f);
        this.f35743r = viewGroup.getContext();
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.h__);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.name_layout)");
        this.f35744s = (RelativeLayout) findViewById;
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.ivh);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.rl_title_main_layout)");
        this.f35745t = (RelativeLayout) findViewById2;
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.fzi);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.l…e_title_info_avatar_icon)");
        ImageView imageView = (ImageView) findViewById3;
        this.f35746u = imageView;
        View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.m3e);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…e_info_avatar_decor_view)");
        this.f35747v = (PAGView) findViewById4;
        View findViewById5 = viewGroup2.findViewById(C0966R.C0970id.ivg);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.rl_title_biz_txv)");
        TextView textView = (TextView) findViewById5;
        this.f35748w = textView;
        View findViewById6 = viewGroup2.findViewById(C0966R.C0970id.fzk);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.live_title_info_name_tv)");
        TextView textView2 = (TextView) findViewById6;
        this.f35749x = textView2;
        View findViewById7 = viewGroup2.findViewById(C0966R.C0970id.fzl);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.live_title_info_tag_iv)");
        this.f35750y = (ImageView) findViewById7;
        View findViewById8 = viewGroup2.findViewById(C0966R.C0970id.o5_);
        ((ImageView) findViewById8).setOnClickListener(this);
        C87412m.m108593f(findViewById8, "root.findViewById<ImageV…@FinderLiveTitlePlugin) }");
        this.f35751z = (ImageView) findViewById8;
        View findViewById9 = viewGroup2.findViewById(C0966R.C0970id.f358569fu0);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.live_follow_btn)");
        TextView textView3 = (TextView) findViewById9;
        this.f35717A = textView3;
        View findViewById10 = viewGroup2.findViewById(C0966R.C0970id.f358571fu2);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.live_follow_btn_icon)");
        this.f35718B = (WeImageView) findViewById10;
        View findViewById11 = viewGroup2.findViewById(C0966R.C0970id.f358572fu3);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.live_follow_btn_layout)");
        this.f35719C = (FrameLayout) findViewById11;
        View findViewById12 = viewGroup2.findViewById(C0966R.C0970id.f358570fu1);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.live_follow_btn_bg)");
        this.f35720D = findViewById12;
        this.f35721E = C36568h.m40985a(new C12405f(viewGroup2));
        C75044y4.m89991c(viewGroup.getContext());
        View findViewById13 = viewGroup2.findViewById(C0966R.C0970id.n9l);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.f…_title_area_brand_layout)");
        this.f35724H = (RelativeLayout) findViewById13;
        View findViewById14 = viewGroup2.findViewById(C0966R.C0970id.n9j);
        C87412m.m108593f(findViewById14, "root.findViewById(R.id.f…live_title_area_brand_bg)");
        this.f35725I = findViewById14;
        View findViewById15 = viewGroup2.findViewById(C0966R.C0970id.n9m);
        C87412m.m108593f(findViewById15, "root.findViewById(R.id.f…e_title_area_brand_shine)");
        ImageView imageView2 = (ImageView) findViewById15;
        View findViewById16 = viewGroup2.findViewById(C0966R.C0970id.n9k);
        C87412m.m108593f(findViewById16, "root.findViewById(R.id.f…_title_area_brand_circle)");
        ImageView imageView3 = (ImageView) findViewById16;
        View findViewById17 = viewGroup2.findViewById(C0966R.C0970id.n6c);
        C87412m.m108593f(findViewById17, "root.findViewById(R.id.brand_bottom_text)");
        this.f35726J = (TextView) findViewById17;
        View findViewById18 = viewGroup2.findViewById(C0966R.C0970id.f359452nd1);
        C87412m.m108593f(findViewById18, "root.findViewById(R.id.txv_brand_desc)");
        this.f35727K = (TextView) findViewById18;
        this.f35728L = new LinkedHashSet();
        this.f35730N = 8;
        this.f35731P = 1;
        this.f35732Q = 2;
        this.f35733R = 3;
        this.f35734S = 500;
        this.f35735T = "finder_live_follow_anim.pag";
        this.f35736U = C36568h.m40985a(new C12406g(this));
        imageView.setOnClickListener(new C12400a(this));
        textView2.setOnClickListener(new C12401b(this));
        textView.setOnClickListener(new C12402c(this));
        imageView.setImageDrawable(this.f35743r.getResources().getDrawable(C0966R.C0969drawable.bfd));
        C15064b bVar3 = C15064b.f41199a;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        C15064b.m14230a(bVar3, context, textView2, 15.0f, 0.0f, 8, (Object) null);
        Context context2 = viewGroup.getContext();
        C87412m.m108593f(context2, "root.context");
        C15064b.m14230a(bVar3, context2, textView3, 10.0f, 0.0f, 8, (Object) null);
        if (mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C62042e.f176370a.mo87080g0(this) - ((int) this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3722cc)));
        }
        C62042e.f176370a.mo87071d(this);
        m11974v1(this, (String) null, false, 1, (Object) null);
        m11972g1(this, false, 1, (Object) null);
        mo12085j1(imageView, "finder_live_room_avatar", 8);
        mo12085j1(textView2, "finder_live_room_name", 8);
        mo12085j1(textView, "finder_live_room_bizname", 8);
        mo12085j1(textView3, "finder_live_room_follow", 40);
        ((C61212e) C86312j.m106911c(C61212e.class)).E60(textView3, new C12403d(this));
        this.f35738W = 8;
    }

    /* renamed from: Z0 */
    public static final void m11970Z0(C12399ff ffVar) {
        ffVar.getClass();
        Class cls = C58312g.class;
        C39818r rVar = C39818r.f106831a;
        Context context = ffVar.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(cls)).f166967e) {
            Log.m105924i("FinderLiveTitlePlugin", "onHeadClick inSideBarStatus");
            Context context2 = ffVar.f166287d.getContext();
            C87412m.m108593f(context2, "root.context");
            FinderLiveSideBar finderLiveSideBar = ((C58312g) rVar.mo62443b(context2).mo75002a(cls)).f166968f;
            if (finderLiveSideBar != null) {
                finderLiveSideBar.mo77737d();
            }
            Context context3 = ffVar.f166287d.getContext();
            C87412m.m108593f(context3, "root.context");
            ((C58312g) rVar.mo62443b(context3).mo75002a(cls)).f166971i.f166979h = 3;
        } else if (!C62042e.f176370a.mo87027N0()) {
            boolean g0 = ffVar.mo82893g0();
            Log.m105924i("FinderLiveTitlePlugin", "goToAnchorFinderProfile isLandscape:" + g0);
            if (g0) {
                C62660c.m73644Y0(ffVar, ffVar.f35742q, (Object) null, 0, 6, (Object) null);
            } else {
                ffVar.mo12082f1();
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            wVar.f151920U = true;
            C54116w.Ex0(wVar, C54067f0.C54076o0.EnterProfile, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            wVar.f151899C++;
        } else if (((Boolean) C32444a.f86058G1.mo60266n()).booleanValue()) {
            C58124b.C7172a.m7372a(ffVar.f35741p, C58124b.C58125b.FINDER_LIVE_ANCHOR_CAN_APPLAUD, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: b1 */
    public static final Animator m11971b1(float f, float f2, float f3, float f4, TextView textView) {
        TextView textView2 = textView;
        C12404e eVar = new C12404e(textView2, (float) C79406f.m96347a(MMApplicationContext.getContext(), f2), f4, (float) C79406f.m96347a(MMApplicationContext.getContext(), f), f3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C87412m.m108593f(ofFloat, "ofFloat(0f, 1f)");
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(eVar);
        ofFloat.addUpdateListener(eVar);
        ofFloat.start();
        return ofFloat;
    }

    /* renamed from: g1 */
    public static void m11972g1(C12399ff ffVar, boolean z, int i, Object obj) {
        C0548h5.C0549a aVar;
        ffVar.getClass();
        Class cls = C55001u.class;
        C58969q b = C58961d.f168673a.mo84155b(((C54991o) ffVar.mo87696x0(C54991o.class)).f154345o);
        String nickname = b != null ? b.getNickname() : "";
        boolean h1 = ffVar.mo12083h1();
        C0548h5 h5Var = C0548h5.f1327a;
        long j = ((C55001u) ffVar.mo87696x0(cls)).f154420q.f182392d;
        C101614i<Long, C0548h5.C0549a> iVar = C0548h5.f1328b;
        boolean check = iVar.check(Long.valueOf(j));
        Log.m105924i("Finder.FinderLiveShowFollowBtnLogic", "hadTriggerShow " + check);
        Log.m105924i("FinderLiveTitlePlugin", nickname + "  followStatus = " + h1 + ", hadTriggerShow:" + check);
        if (h1) {
            ffVar.mo12081e1().removeMessages(ffVar.f35731P);
            ffVar.mo12088o1(8);
            ffVar.mo12078a1(false);
        } else if (check) {
            long j2 = ((C55001u) ffVar.mo87696x0(cls)).f154420q.f182392d;
            if (iVar.check(Long.valueOf(j2)) && (aVar = (C0548h5.C0549a) iVar.get(Long.valueOf(j2))) != null) {
                C54067f0.C0066n nVar = C54067f0.C0066n.FOLLOW_ICON;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("follow_icon_expose_condition", String.valueOf(aVar.f1329a.ordinal()));
                linkedHashMap.put("follow_icon_expose_condition_sessionid", aVar.f1330b);
                C13598b0 b0Var = C13598b0.f38549a;
                ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(nVar, linkedHashMap);
            }
            ffVar.mo12087m1(false, "#1", Boolean.FALSE, Boolean.TRUE);
        } else {
            ffVar.mo12088o1(8);
            ffVar.mo12078a1(false);
            ffVar.mo12081e1().sendEmptyMessageDelayed(ffVar.f35733R, ffVar.f35734S);
        }
    }

    /* renamed from: n1 */
    public static final void m11973n1(C12399ff ffVar, boolean z, boolean z2) {
        Log.m105924i("FinderLiveTitlePlugin", "[showOrDismissAnimView] in " + z2);
        if (ffVar.f35737V == null) {
            ffVar.f35737V = new PAGView(ffVar.f166287d.getContext());
        }
        PAGView pAGView = ffVar.f35737V;
        if (pAGView == null) {
            return;
        }
        if (z2) {
            if (ffVar.f35719C.indexOfChild(pAGView) == -1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ffVar.f35720D.getWidth(), ffVar.f35720D.getHeight());
                layoutParams.gravity = 17;
                PAGView pAGView2 = ffVar.f35737V;
                if (pAGView2 != null) {
                    pAGView2.setLayoutParams(layoutParams);
                }
                ffVar.f35719C.addView(ffVar.f35737V);
            }
            PAGView pAGView3 = ffVar.f35737V;
            if (pAGView3 != null) {
                pAGView3.setComposition(PAGFile.Load(MMApplicationContext.getContext().getResources().getAssets(), ffVar.f35735T));
            }
            PAGView pAGView4 = ffVar.f35737V;
            if (pAGView4 != null) {
                pAGView4.addListener(new C12414n(ffVar, z));
            }
            PAGView pAGView5 = ffVar.f35737V;
            if (pAGView5 != null) {
                pAGView5.setProgress(0.0d);
            }
            PAGView pAGView6 = ffVar.f35737V;
            if (pAGView6 != null) {
                pAGView6.flush();
            }
            PAGView pAGView7 = ffVar.f35737V;
            if (pAGView7 != null) {
                pAGView7.play();
            }
        } else if (ffVar.f35719C.indexOfChild(pAGView) != -1) {
            pAGView.stop();
            ffVar.f35719C.removeView(pAGView);
        }
    }

    /* renamed from: v1 */
    public static void m11974v1(C12399ff ffVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ffVar.mo87686C0().f151977d.f157069j;
            C87412m.m108593f(str, LocaleUtil.ITALIAN);
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str == null) {
                str = ((C54991o) ffVar.mo87696x0(C54991o.class)).f154345o;
            }
        }
        if ((i & 2) != 0) {
            z = true;
        }
        ffVar.mo12095u1(str, z);
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
        boolean z2 = false;
        if (z) {
            this.f177939j = 65535;
            mo10792g(0);
            if (this.f35719C.getVisibility() != 8) {
                this.f35719C.setVisibility(4);
            }
            if (mo12080d1().getVisibility() != 8) {
                mo12080d1().setVisibility(4);
                return;
            }
            return;
        }
        mo12088o1(this.f35730N);
        mo12086l1(this.f35738W);
        if (mo12084i1()) {
            if (this.f35730N == 0) {
                z2 = true;
            }
            mo12078a1(z2);
        }
    }

    /* renamed from: P0 */
    public void mo12077P0(C117747y yVar, boolean z) {
        mo12079c1();
    }

    /* renamed from: a1 */
    public final void mo12078a1(boolean z) {
        Log.m105924i("FinderLiveTitlePlugin", "#animatorBizHighLight isBizHigh=" + z);
        if (!this.f35739X) {
            Log.m105924i("FinderLiveTitlePlugin", "#animatorBizHighLight before brand show. isBizHigh=" + z + " AnimationJob=" + null);
        } else if (mo12084i1() && this.f35729M != z) {
            this.f35729M = z;
            for (Animator cancel : this.f35728L) {
                cancel.cancel();
            }
            this.f35728L.clear();
            if (z) {
                this.f35728L.add(m11971b1(15.0f, 12.0f, 1.0f, 0.6f, this.f35749x));
                this.f35728L.add(m11971b1(12.0f, 15.0f, 0.6f, 1.0f, this.f35748w));
                return;
            }
            this.f35728L.add(m11971b1(12.0f, 15.0f, 0.6f, 1.0f, this.f35749x));
            this.f35728L.add(m11971b1(15.0f, 12.0f, 1.0f, 0.6f, this.f35748w));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c3, code lost:
        if (r6.f35719C.getVisibility() != 0) goto L_0x00c7;
     */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12079c1() {
        /*
            r6 = this;
            java.lang.Class<cl1.x> r0 = cl1.C0696x.class
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r2 = r1.mo87027N0()
            r3 = 8
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x006d
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r0)
            cl1.x r1 = (cl1.C0696x) r1
            te3.ly0 r1 = r1.f1644g
            if (r1 == 0) goto L_0x001e
            boolean r1 = r1.f137710h
            if (r1 != r5) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0068
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r0)
            cl1.x r1 = (cl1.C0696x) r1
            te3.ly0 r1 = r1.f1644g
            if (r1 == 0) goto L_0x0031
            boolean r1 = r1.f137707e
            if (r1 != r5) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x0068
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r0)
            cl1.x r0 = (cl1.C0696x) r0
            te3.ly0 r0 = r0.f1644g
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.f137706d
            if (r0 == 0) goto L_0x0051
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0049
            r4 = 1
        L_0x0049:
            r1 = r4 ^ 1
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 != 0) goto L_0x005e
        L_0x0051:
            android.content.Context r0 = r6.f35743r
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827331(0x7f111a83, float:1.9287572E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x005e:
            java.lang.String r1 = "business(LiveFansClubSli…ng.finder_live_fans_club)"
            gy3.C87412m.m108593f(r0, r1)
            r6.mo12091q1(r5, r0)
            goto L_0x00de
        L_0x0068:
            r6.mo12086l1(r3)
            goto L_0x00de
        L_0x006d:
            fj1.b r2 = r6.mo87684A0()
            boolean r1 = r1.mo87018K0(r2)
            if (r1 == 0) goto L_0x00c6
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r0)
            cl1.x r1 = (cl1.C0696x) r1
            te3.ly0 r1 = r1.f1644g
            if (r1 == 0) goto L_0x0087
            boolean r1 = r1.f137710h
            if (r1 != r5) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            if (r1 == 0) goto L_0x00c6
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r0)
            cl1.x r0 = (cl1.C0696x) r0
            te3.ly0 r0 = r0.f1644g
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.f137707e
            if (r0 != r5) goto L_0x009a
            r0 = 1
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            if (r0 == 0) goto L_0x00c6
            java.lang.Class<ky2.i> r0 = ky2.C10432i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ky2.i r0 = (ky2.C10432i) r0
            boolean r0 = r0.mo10750e()
            if (r0 != 0) goto L_0x00c6
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154287Z0
            if (r0 == r5) goto L_0x00c6
            boolean r0 = r6.mo12083h1()
            if (r0 == 0) goto L_0x00c6
            android.widget.FrameLayout r0 = r6.f35719C
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r5 = 0
        L_0x00c7:
            if (r5 == 0) goto L_0x00db
            android.content.Context r0 = r6.f35743r
            r1 = 2131827633(0x7f111bb1, float:1.9288184E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.getString(R.stri…nder_live_join_fans_club)"
            gy3.C87412m.m108593f(r0, r1)
            r6.mo12091q1(r4, r0)
            goto L_0x00de
        L_0x00db:
            r6.mo12086l1(r3)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12399ff.mo12079c1():void");
    }

    /* renamed from: d1 */
    public final FinderLiveFansClubTagWidget mo12080d1() {
        return (FinderLiveFansClubTagWidget) this.f35721E.getValue();
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, this.f35742q)) {
            C12409i iVar = new C12409i(this, j);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(iVar, j);
        }
    }

    /* renamed from: e1 */
    public final MMHandler mo12081e1() {
        return (MMHandler) this.f35736U.getValue();
    }

    /* renamed from: f1 */
    public final void mo12082f1() {
        Class cls = C54991o.class;
        if (mo12084i1()) {
            C58739j4 j4Var = C58739j4.f168176a;
            String str = mo87686C0().f151977d.f157078v;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = ((C0654b) mo87696x0(C0654b.class)).f1545g;
            }
            String str2 = ((C54991o) mo87696x0(cls)).f154345o;
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            j4Var.mo83695X(str, str2, context, ((C54991o) mo87696x0(cls)).f154325i1, String.valueOf(((C55001u) mo87696x0(C55001u.class)).f154420q.f182392d), 2);
            return;
        }
        C54804r0 r0Var = C54804r0.f153631a;
        Context context2 = this.f35743r;
        C45795b A0 = mo87684A0();
        String str3 = ((C54991o) mo87696x0(cls)).f154345o;
        C39818r rVar = C39818r.f106831a;
        Context context3 = this.f35743r;
        C87412m.m108593f(context3, "context");
        r0Var.mo75765g(context2, A0, true, str3, ((C60172g4) rVar.mo62443b(context3).mo62447c(C60172g4.class)).mo12861q3());
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (mo12084i1()) {
            mo12078a1(this.f35730N == 0);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: h1 */
    public final boolean mo12083h1() {
        return ((C0654b) mo87696x0(C0654b.class)).mo623c3();
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        C11207i.m11072h(this, (C66212f) null, (C53934p0) null, new C12407h(this, (C15601d<? super C12407h>) null), 3, (Object) null);
    }

    /* renamed from: i1 */
    public final boolean mo12084i1() {
        return ((C0654b) mo87696x0(C0654b.class)).f1544f || mo87686C0().f151977d.f157077u == 4;
    }

    /* renamed from: j1 */
    public final void mo12085j1(View view, String str, int i) {
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(view, str);
        if (this.f35741p.getLiveRole() == 0) {
            ((C61212e) C86312j.m106911c(cls)).mo86149PM(view, C90363p0.m113143b(new C13604l("is_biz_live", Integer.valueOf(mo12084i1() ? 1 : 0))));
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, i, 25561);
        }
    }

    /* renamed from: l1 */
    public final void mo12086l1(int i) {
        this.f35738W = i;
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            i = 8;
        }
        mo12080d1().setVisibility(i);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: m1 */
    public final void mo12087m1(boolean z, String str, Boolean bool, Boolean bool2) {
        Log.m105924i("FinderLiveTitlePlugin", "[setFollowBtnState] source:" + str + ", isFollow:" + z);
        mo12088o1(0);
        mo12078a1(true);
        this.f35717A.setVisibility(0);
        if (this.f35741p.getLiveRole() == 0) {
            ((C54116w) C86312j.m106911c(C54116w.class)).by0(C54067f0.C0070u.EXPOSE, mo12084i1());
        }
        Log.m105924i("FinderLiveTitlePlugin", "[showOrDismissAnimView] call false");
        m11973n1(this, z, false);
        if (!z) {
            mo12081e1().removeMessages(this.f35732Q);
            this.f35718B.setVisibility(0);
            this.f35717A.setTextColor(this.f35743r.getResources().getColor(C0966R.color.al9));
            this.f35717A.setPadding(0, 0, this.f166287d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3928j9), 0);
            this.f35717A.setText(this.f35743r.getString(C0966R.string.dmt));
            mo12092r1(mo12084i1());
            this.f35717A.setTextSize(0, (float) this.f166287d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.a7f));
            this.f35717A.setOnClickListener(new C12411k(this));
            if (!C87412m.m108589b(str, "#1")) {
                FrameLayout frameLayout = this.f35719C;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200);
                frameLayout.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        this.f35718B.setVisibility(4);
        this.f35717A.setOnClickListener((View.OnClickListener) null);
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            mo12088o1(0);
            mo12078a1(true);
            this.f35717A.post(new C12412l(this, z));
            return;
        }
        PAGView pAGView = this.f35737V;
        if (!(pAGView == null || this.f35719C.indexOfChild(pAGView) == -1)) {
            pAGView.stop();
            this.f35719C.removeView(pAGView);
        }
        if (this.f35719C.getWidth() > 0) {
            this.f35719C.getLayoutParams().width = this.f35719C.getWidth();
        }
        this.f35718B.setVisibility(8);
        this.f35720D.setBackground(this.f166287d.getContext().getDrawable(C0966R.C0969drawable.f5191ze));
        this.f35717A.setText(this.f35743r.getString(C0966R.string.fje));
        this.f35717A.setTextColor(this.f35743r.getResources().getColor(C0966R.color.f3581ye));
        this.f35717A.setTextSize(0, (float) this.f166287d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.a7g));
        this.f35717A.setPadding(0, 0, 0, 0);
        this.f35717A.setOnClickListener(C12413m.f35772d);
    }

    /* renamed from: o1 */
    public final void mo12088o1(int i) {
        Class cls = C58312g.class;
        boolean booleanValue = ((Boolean) ((C58052j1) ((C54991o) mo87696x0(C54991o.class)).f154189C3).getValue()).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" setFollowLayoutVisible ");
        sb.append(i);
        sb.append(" inSideBarStatus: ");
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        sb.append(((C58312g) rVar.mo62443b(context).mo75002a(cls)).f166967e);
        sb.append(", canShowFollowBtn:");
        sb.append(booleanValue);
        Log.m105924i("FinderLiveTitlePlugin", sb.toString());
        this.f35730N = i;
        Context context2 = this.f166287d.getContext();
        C87412m.m108593f(context2, "root.context");
        if (((C58312g) rVar.mo62443b(context2).mo75002a(cls)).f166967e || !booleanValue) {
            i = 8;
        }
        this.f35719C.setVisibility(i);
    }

    public void onClick(View view) {
        C64676r81 r812;
        C64426ho2 ho22;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.o5_ || (r812 = ((C55001u) mo87696x0(C55001u.class)).f154420q.f182387Y0) == null || (ho22 = r812.f185146f) == null)) {
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C64837xq2 xq22 = new C64837xq2();
            FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
            finderJumpInfo.lite_app_info = ho22;
            finderJumpInfo.jumpinfo_type = 6;
            xq22.f186379e = finderJumpInfo;
            xq22.f186380f = true;
            xq22.f186381g = true;
            xq22.f186382h = 1;
            C13598b0 b0Var = C13598b0.f38549a;
            C64916p1.C64917a.m76439f((C64916p1) c, context, xq22, (C86299o) null, (C60905o) null, 8, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p1 */
    public final void mo12090p1(View view, boolean z) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(AnimationUtils.loadAnimation(this.f166287d.getContext(), C0966R.C0968anim.f2432cv));
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            animationSet.addAnimation(alphaAnimation);
        }
        view.startAnimation(animationSet);
        Log.m105924i("FinderLiveTitlePlugin", "shakeIt view:" + view + ",withAlphaChange:" + z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (((ky2.C10432i) di3.C86312j.m106911c(ky2.C10432i.class)).mo10750e() == false) goto L_0x0057;
     */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12091q1(boolean r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.Class<cl1.x> r0 = cl1.C0696x.class
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r2 = r1.mo87027N0()
            if (r7 == r2) goto L_0x000b
            return
        L_0x000b:
            fj1.b r2 = r6.mo87684A0()
            boolean r1 = r1.mo87018K0(r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0056
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r0)
            cl1.x r1 = (cl1.C0696x) r1
            te3.ly0 r1 = r1.f1644g
            if (r1 == 0) goto L_0x0027
            boolean r1 = r1.f137710h
            if (r1 != r2) goto L_0x0027
            r1 = 1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 == 0) goto L_0x0056
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r0)
            cl1.x r1 = (cl1.C0696x) r1
            te3.ly0 r1 = r1.f1644g
            if (r1 == 0) goto L_0x003a
            boolean r1 = r1.f137707e
            if (r1 != r2) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 == 0) goto L_0x0056
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r0)
            cl1.x r0 = (cl1.C0696x) r0
            boolean r0 = r0.f1643f
            if (r0 == 0) goto L_0x0056
            java.lang.Class<ky2.i> r0 = ky2.C10432i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ky2.i r0 = (ky2.C10432i) r0
            boolean r0 = r0.mo10750e()
            if (r0 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.mo12080d1()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0092
            r6.mo12086l1(r3)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.mo12080d1()
            r0.mo3415a(r7, r8, r2)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r8 = r6.mo12080d1()
            qj1.ff$o r0 = new qj1.ff$o
            r0.<init>(r6)
            r8.setClickListener(r0)
            if (r7 != 0) goto L_0x0099
            java.lang.Class<ak1.w> r7 = ak1.C54116w.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            java.lang.String r8 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r7, r8)
            r0 = r7
            ak1.w r0 = (ak1.C54116w) r0
            ak1.f0$t0 r1 = ak1.C54067f0.C0069t0.JOIN_EXPOSE
            r2 = 0
            qj1.tg$a r3 = qj1.C12677tg.C12678a.LIVE_HEADER_BTN
            r4 = 2
            r5 = 0
            ak1.C54116w.Yx0(r0, r1, r2, r3, r4, r5)
            goto L_0x0099
        L_0x0092:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.mo12080d1()
            r0.mo3415a(r7, r8, r2)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12399ff.mo12091q1(boolean, java.lang.String):void");
    }

    /* renamed from: r1 */
    public final void mo12092r1(boolean z) {
        if (this.f35739X) {
            Log.m105924i("FinderLiveTitlePlugin", "#switchUiStyle isBizMode=" + z + " isAnchorFollowed: " + mo12083h1());
            C7919x.m8091a(this.f35717A);
            this.f35718B.setIconColor(this.f35743r.getResources().getColor(C0966R.color.f2975b6));
            this.f35748w.setVisibility(z ? 0 : 8);
            if (mo12083h1() || this.f35717A.getTextColors().getDefaultColor() != this.f35743r.getResources().getColor(C0966R.color.al9)) {
                this.f35720D.setBackground(this.f166287d.getContext().getDrawable(C0966R.C0969drawable.f5191ze));
                this.f35717A.setTextColor(this.f35743r.getResources().getColor(C0966R.color.f3581ye));
                return;
            }
            this.f35720D.setBackground(this.f166287d.getContext().getDrawable(C0966R.C0969drawable.f5190zc));
            this.f35717A.setTextColor(this.f35743r.getResources().getColor(C0966R.color.al9));
            return;
        }
        Log.m105924i("FinderLiveTitlePlugin", "#switchUiStyle before brand show. isBrandViewHasTry=" + this.f35739X + " AnimationJob=" + null);
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        if (C75044y4.m89991c(this.f166287d.getContext()) == 0) {
            C74942w4.m89784a(this.f166287d.getContext(), 16);
        }
        this.f35717A.post(new C12410j(this));
    }

    /* renamed from: s1 */
    public final void mo12093s1() {
        Log.m105924i("FinderLiveTitlePlugin", "#tryShowBrandView ,isBrandViewHasTry:" + this.f35739X + '!');
        if (!this.f35739X) {
            this.f35739X = true;
        }
    }

    /* renamed from: t1 */
    public final void mo12094t1(C64780vo2 vo22) {
        C63325a aVar = (C63325a) mo87696x0(C63325a.class);
        String str = vo22 != null ? vo22.f185964e : null;
        if (str == null || str.length() == 0) {
            Log.m105924i("FinderLiveTitlePlugin", "updateAvatarDecoration url is null or empty.");
            aVar.f179685f = vo22;
            this.f35747v.stop();
            this.f35747v.setVisibility(4);
            return;
        }
        if (C86013q1.m106450k(aVar.mo88226c3(vo22))) {
            Log.m105924i("FinderLiveTitlePlugin", "updateAvatarDecoration local decorations exist.");
            this.f35747v.setPath(aVar.mo88226c3(vo22));
            this.f35747v.setRepeatCount(-1);
            this.f35747v.play();
            aVar.f179685f = vo22;
        } else {
            Log.m105924i("FinderLiveTitlePlugin", "updateAvatarDecoration download decorations.");
            aVar.mo88227d3(vo22, new C12416p(vo22, this, aVar));
        }
        this.f35747v.setVisibility(0);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            boolean z = false;
            if (ordinal == 37) {
                mo12081e1().removeMessages(this.f35731P);
                boolean z2 = true;
                if (bundle == null || !bundle.getBoolean("PARAM_FINDER_LIVE_SHAKE_VIEW", false)) {
                    z2 = false;
                }
                if (z2) {
                    if (this.f35719C.getVisibility() != 0) {
                        mo12081e1().sendEmptyMessageDelayed(this.f35731P, 0);
                    }
                    if (this.f35719C.getVisibility() == 0) {
                        mo12090p1(this.f35719C, false);
                        return;
                    } else {
                        this.f35719C.getViewTreeObserver().addOnGlobalLayoutListener(new C12488kf(this));
                        return;
                    }
                } else {
                    mo12081e1().sendEmptyMessageDelayed(this.f35731P, 0);
                    return;
                }
            } else if (ordinal == 7) {
                Log.m105924i("FinderLiveTitlePlugin", "#statusChange START_LIVE");
                if (bundle != null) {
                    z = bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW");
                }
                if (z) {
                    mo12094t1(((C63325a) mo87696x0(C63325a.class)).f179685f);
                    return;
                }
                return;
            } else if (ordinal == 8) {
                mo12081e1().removeMessages(this.f35731P);
                return;
            } else if (!(ordinal == 27 || ordinal == 28)) {
                return;
            }
        }
        mo10792g(4);
    }

    /* renamed from: u1 */
    public final void mo12095u1(String str, boolean z) {
        String str2;
        String str3;
        int i;
        String str4;
        String str5 = str;
        boolean z2 = z;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C54991o.class;
        Class cls4 = C55001u.class;
        C87412m.m108594g(str5, "anchorUsername");
        C58969q b = ((C54991o) mo87696x0(cls3)).f154301c3 ? C58961d.f168673a.mo84155b(((C54991o) mo87696x0(cls3)).f154345o) : C58961d.f168673a.mo84155b(str5);
        if (b != null) {
            String str6 = mo87686C0().f151977d.f157079w;
            if (str6 == null) {
                str6 = "";
            }
            if (str6.length() == 0) {
                str6 = ((C0654b) mo87696x0(C0654b.class)).f1546h;
            }
            if (str6.length() == 0) {
                this.f35748w.setText(this.f35743r.getString(C0966R.string.e0g));
                str2 = "";
            } else {
                str2 = "";
                this.f35748w.setText(this.f35743r.getString(C0966R.string.e0h, new Object[]{str6}));
            }
            C51438ts0 ts02 = ((C55001u) mo87696x0(cls4)).f154420q.f182389Z0;
            if (!(ts02 != null && ts02.f142380d) || (str3 = ts02.f142381e) == null) {
                str3 = b.mo84196w1();
            }
            this.f35722F = str3;
            this.f35723G = b.mo84172g0();
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(this.f35723G, (C27696y) null, 2, (C8480h) null), this.f35746u, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            StringBuilder sb = new StringBuilder();
            sb.append("updateLiveTitle load avatar anchorUsername:");
            sb.append(str5);
            sb.append(',');
            sb.append(this.f35722F);
            sb.append(',');
            sb.append(this.f35723G);
            sb.append(",uniqueId:");
            sb.append(MD5Util.getMD5String(this.f35723G));
            sb.append(",showContent:");
            sb.append(z2);
            sb.append(",anchor_shop_tag:");
            C64676r81 r812 = ((C55001u) mo87696x0(cls4)).f154420q.f182387Y0;
            sb.append(r812 != null ? Integer.valueOf(r812.f185144d) : null);
            sb.append('(');
            C64676r81 r813 = ((C55001u) mo87696x0(cls4)).f154420q.f182387Y0;
            sb.append(r813 != null ? r813.f185145e : null);
            sb.append("),field_authInfo is null:");
            sb.append(b.field_authInfo == null);
            sb.append('!');
            Log.m105924i("FinderLiveTitlePlugin", sb.toString());
            this.f35749x.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f35743r, this.f35722F, this.f35749x.getTextSize()));
            C64676r81 r814 = ((C55001u) mo87696x0(cls4)).f154420q.f182387Y0;
            if (r814 != null && r814.f185144d == 1) {
                C64676r81 r815 = ((C55001u) mo87696x0(cls4)).f154420q.f182387Y0;
                String str7 = (r815 == null || (str4 = r815.f185145e) == null) ? str2 : str4;
                if (!C87412m.m108589b(this.f35751z.getTag(), str7)) {
                    this.f35751z.setTag(str7);
                    C7335d c = C86312j.m106911c(C60606n.class);
                    C87412m.m108593f(c, "getService(\n            …ava\n                    )");
                    C60606n nVar = (C60606n) c;
                    ImageView imageView = this.f35751z;
                    Context context = this.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    float p = C76577a.m92165p(context);
                    float r = C76577a.m92167r(context);
                    if (p > r) {
                        p = r;
                    }
                    nVar.mo84986Aw(imageView, str7, p, (C32226l<? super Bitmap, C13598b0>) null);
                }
            }
            FinderAuthInfo finderAuthInfo = b.field_authInfo;
            if (finderAuthInfo != null) {
                if (finderAuthInfo.authIconType > 0) {
                    TextView textView = this.f35749x;
                    textView.setPadding(textView.getPaddingLeft(), this.f35749x.getPaddingTop(), C74942w4.m89784a(this.f166287d.getContext(), 20), this.f35749x.getPaddingBottom());
                    this.f35750y.setVisibility(0);
                    C7335d c2 = C86312j.m106911c(C64916p1.class);
                    C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
                    C64916p1.C64917a.m76444k((C64916p1) c2, this.f35750y, b.field_authInfo, 0, (C64284cg) null, 8, (Object) null);
                } else {
                    TextView textView2 = this.f35749x;
                    textView2.setPadding(textView2.getPaddingLeft(), this.f35749x.getPaddingTop(), 0, this.f35749x.getPaddingBottom());
                    this.f35750y.setVisibility(8);
                }
                this.f35749x.setTag(C0966R.C0970id.f358034d41, Integer.valueOf(b.field_authInfo.authIconType));
                i = 0;
            } else {
                TextView textView3 = this.f35749x;
                i = 0;
                textView3.setPadding(textView3.getPaddingLeft(), this.f35749x.getPaddingTop(), 0, this.f35749x.getPaddingBottom());
                this.f35750y.setVisibility(8);
            }
            if (z2 && mo14483f0() != 0) {
                mo10792g(i);
            }
            mo12092r1(mo12084i1());
            if (!mo12084i1() || !this.f35719C.isShown()) {
                mo12078a1(false);
            } else {
                mo12078a1(true);
            }
        } else {
            Log.m105924i("FinderLiveTitlePlugin", "updateLiveTitle contact avatarUrl is null:" + true + " anchorUsername:" + str5 + ",liveData username:" + ((C54991o) mo87696x0(cls3)).f154345o + ",showContent:" + z2);
        }
        this.f35749x.requestLayout();
        mo12079c1();
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo12081e1().removeMessages(this.f35733R);
        mo12081e1().removeMessages(this.f35731P);
        mo12081e1().removeCallbacksAndMessages((Object) null);
        TextView textView = this.f35749x;
        textView.setPadding(textView.getPaddingLeft(), this.f35749x.getPaddingTop(), 0, this.f35749x.getPaddingBottom());
        this.f35751z.setVisibility(8);
        this.f35750y.setVisibility(8);
        mo12088o1(8);
        mo12078a1(false);
        mo12092r1(false);
        this.f35724H.setVisibility(8);
        this.f35727K.setVisibility(8);
        this.f35726J.setVisibility(8);
        this.f35744s.setTranslationY(0.0f);
        this.f35727K.setTranslationY(0.0f);
        this.f35745t.setPadding(0, 0, 0, 0);
        this.f35739X = false;
    }
}
