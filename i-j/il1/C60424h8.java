package il1;

import a14.C53851a;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C0668l;
import cl1.C54951d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.finder.live.cheer.CheerCountDownView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import l31.C61212e;
import l60.C99344b;
import nk1.C11207i;
import o40.C61926c;
import org.libpag.PAGView;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import qj1.C62660c;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import te3.C49712hj1;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import x60.C102564a;

/* renamed from: il1.h8 */
public final class C60424h8 extends C62660c {

    /* renamed from: A */
    public int f172276A;

    /* renamed from: B */
    public final Object f172277B;

    /* renamed from: C */
    public boolean f172278C;

    /* renamed from: D */
    public boolean f172279D;

    /* renamed from: E */
    public int f172280E;

    /* renamed from: F */
    public final int f172281F;

    /* renamed from: G */
    public Runnable f172282G;

    /* renamed from: H */
    public C53973z1 f172283H;

    /* renamed from: I */
    public C53973z1 f172284I;

    /* renamed from: p */
    public final C58124b f172285p;

    /* renamed from: q */
    public final C62660c f172286q;

    /* renamed from: r */
    public final String f172287r = "Finder.FinderLiveVisitorLikeWidget";

    /* renamed from: s */
    public final int f172288s;

    /* renamed from: t */
    public final FrameLayout f172289t;

    /* renamed from: u */
    public final ImageView f172290u;

    /* renamed from: v */
    public final PAGView f172291v;

    /* renamed from: w */
    public final TextView f172292w;

    /* renamed from: x */
    public final String f172293x;

    /* renamed from: y */
    public final CheerCountDownView f172294y;

    /* renamed from: z */
    public final ImageView f172295z;

    /* renamed from: il1.h8$a */
    public static final class C60425a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60424h8 f172296d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f172297e;

        /* renamed from: il1.h8$a$a */
        public static final class C60426a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60424h8 f172298d;

            /* renamed from: e */
            public final /* synthetic */ ViewGroup f172299e;

            public C60426a(C60424h8 h8Var, ViewGroup viewGroup) {
                this.f172298d = h8Var;
                this.f172299e = viewGroup;
            }

            public final void run() {
                C60424h8 h8Var = this.f172298d;
                ViewGroup viewGroup = this.f172299e;
                h8Var.getClass();
                viewGroup.animate().setDuration(100).scaleX(1.0f).scaleY(1.0f).start();
            }
        }

        public C60425a(C60424h8 h8Var, ViewGroup viewGroup) {
            this.f172296d = h8Var;
            this.f172297e = viewGroup;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C60085d dVar;
            C60090e eVar;
            C53934p0 p0Var = C53934p0.UNDISPATCHED;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLikeWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f172296d.f172292w.setVisibility(4);
                MMHandlerThread.removeRunnable(this.f172296d.f172282G);
                C60424h8 h8Var = this.f172296d;
                ViewGroup viewGroup = this.f172297e;
                h8Var.getClass();
                viewGroup.animate().setDuration(100).scaleX(1.5f).scaleY(1.5f).start();
                C60424h8 h8Var2 = this.f172296d;
                String str = h8Var2.f172287r;
                Log.m105924i(str, "[ken_startPostLike] likeCount+1 = " + (h8Var2.f172276A + 1) + ", MAX_LIKE_ONE_TIME = " + h8Var2.f172288s);
                h8Var2.f172283H = C11207i.m11072h(h8Var2, (C66212f) null, p0Var, new C60495p8(h8Var2, (C15601d<? super C60495p8>) null), 1, (Object) null);
                C60424h8 h8Var3 = this.f172296d;
                C53973z1 z1Var = h8Var3.f172284I;
                if (z1Var != null && ((C53851a) z1Var).mo74466a()) {
                    Log.m105924i(h8Var3.f172287r, "[startUpLoadLike] upload like job is running");
                } else {
                    h8Var3.f172284I = C11207i.m11072h(h8Var3, (C66212f) null, (C53934p0) null, new C60498q8(h8Var3, (C15601d<? super C60498q8>) null), 3, (Object) null);
                }
                this.f172296d.f172290u.setAlpha(0.3f);
                this.f172296d.f172294y.setAlpha(0.0f);
            } else if (actionMasked == 1 || actionMasked == 3) {
                ViewGroup viewGroup2 = this.f172297e;
                viewGroup2.postDelayed(new C60426a(this.f172296d, viewGroup2), 100);
                MMHandlerThread.postToMainThreadDelayed(this.f172296d.f172282G, 200);
                C60424h8 h8Var4 = this.f172296d;
                Log.m105924i(h8Var4.f172287r, "[ken_stopPostLike]");
                C11207i.m11072h(h8Var4, (C66212f) null, p0Var, new C60504r8(h8Var4, (C15601d<? super C60504r8>) null), 1, (Object) null);
                this.f172296d.f172290u.setAlpha(1.0f);
                C60424h8 h8Var5 = this.f172296d;
                C61926c.m72668M(new C60443j8(h8Var5, h8Var5.f172279D));
                if (!(!((C54991o) this.f172296d.f172286q.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f172296d.f172286q.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                    eVar.mo84955a();
                    eVar.mo84957c(2009);
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorLikeWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: il1.h8$b */
    public static final class C60427b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60424h8 f172300d;

        public C60427b(C60424h8 h8Var) {
            this.f172300d = h8Var;
        }

        public final void run() {
            this.f172300d.f172292w.setVisibility(0);
            if (!((C54951d) this.f172300d.f172286q.mo87696x0(C54951d.class)).mo75869e3()) {
                this.f172300d.f172294y.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: il1.h8$c */
    public static final class C60428c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60424h8 f172301d;

        public C60428c(C60424h8 h8Var) {
            this.f172301d = h8Var;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CheerCountDownView cheerCountDownView = this.f172301d.f172294y;
            C53973z1 z1Var = cheerCountDownView.f159293h;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            cheerCountDownView.f159295j = 360.0f;
            this.f172301d.f172294y.setVisibility(8);
        }
    }

    /* renamed from: il1.h8$d */
    public static final class C60429d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60424h8 f172302d;

        public C60429d(C60424h8 h8Var) {
            this.f172302d = h8Var;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f172302d.f172295z.setVisibility(8);
        }
    }

    /* renamed from: il1.h8$e */
    public static final class C60430e<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C60424h8 f172303a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f172304b;

        public C60430e(C60424h8 h8Var, C32226l<? super Boolean, C13598b0> lVar) {
            this.f172303a = h8Var;
            this.f172304b = lVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C60521s8((Bitmap) obj, this.f172303a, this.f172304b));
        }
    }

    /* renamed from: il1.h8$f */
    public static final class C60431f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60424h8 f172305d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f172306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60431f(C60424h8 h8Var, C32226l<? super Boolean, C13598b0> lVar) {
            super(0);
            this.f172305d = h8Var;
            this.f172306e = lVar;
        }

        public Object invoke() {
            C60424h8 h8Var = this.f172305d;
            h8Var.f172290u.setImageDrawable(C74933u4.m89768e(h8Var.f166287d.getContext(), C0966R.raw.icons_filled_call_good, this.f172305d.f172281F));
            C32226l<Boolean, C13598b0> lVar = this.f172306e;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60424h8(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        Integer num = null;
        this.f172285p = bVar;
        this.f172286q = cVar;
        C32444a aVar = C32444a.f86121a;
        Integer n = C32444a.f86220y2.mo60266n();
        boolean z = true;
        Integer num2 = n.intValue() > 0 ? n : num;
        this.f172288s = num2 != null ? num2.intValue() : 9;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.dp7);
        this.f172289t = frameLayout;
        ((RelativeLayout) viewGroup.findViewById(C0966R.C0970id.dp6)).setContentDescription(viewGroup.getContext().getString(C0966R.string.dq5));
        this.f172290u = (ImageView) viewGroup.findViewById(C0966R.C0970id.dp8);
        this.f172291v = (PAGView) viewGroup.findViewById(C0966R.C0970id.dp9);
        ViewParent parent = viewGroup.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f172292w = (TextView) ((ViewGroup) parent).findViewById(C0966R.C0970id.dp_);
        this.f172293x = "finder_live_clap_anim.pag";
        this.f172294y = (CheerCountDownView) viewGroup.findViewById(C0966R.C0970id.nei);
        this.f172295z = (ImageView) viewGroup.findViewById(C0966R.C0970id.nef);
        this.f172277B = viewGroup.getContext().getSystemService("vibrator");
        this.f172278C = C32444a.f86170m0.mo60266n().intValue() != 0 ? false : z;
        this.f172281F = viewGroup.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8);
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(frameLayout, "finder_live_room_like");
        mo10792g(8);
        frameLayout.setOnTouchListener(new C60425a(this, viewGroup));
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f172282G = new C60427b(this);
    }

    /* renamed from: Z0 */
    public final void mo85396Z0(boolean z) {
        if (this.f172294y.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.f172294y.animate().alpha(0.0f).setDuration(1000).setListener(new C60428c(this)).start();
            this.f172295z.animate().alpha(0.0f).setDuration(1000).setListener(new C60429d(this)).start();
            return;
        }
        CheerCountDownView cheerCountDownView = this.f172294y;
        C53973z1 z1Var = cheerCountDownView.f159293h;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        cheerCountDownView.f159295j = 360.0f;
        this.f172295z.setVisibility(8);
        this.f172294y.setVisibility(8);
    }

    /* renamed from: a1 */
    public final void mo85397a1(String str, C32226l<? super Boolean, C13598b0> lVar) {
        String str2 = this.f172287r;
        Log.m105924i(str2, "updateCheerIcon:" + str);
        if (this.f172279D) {
            Log.m105924i(this.f172287r, "applaud mode ,return");
            return;
        }
        if (!(str == null || str.length() == 0)) {
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(str, C27696y.THUMB_IMAGE));
            C60430e eVar = new C60430e(this, lVar);
            a.getClass();
            a.f291320d = eVar;
            a.mo85951a();
            return;
        }
        C61926c.m72668M(new C60431f(this, lVar));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo85398b1() {
        Object obj = this.f172277B;
        if (!(obj instanceof Vibrator)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ((Vibrator) obj).vibrate(VibrationEffect.createOneShot(10, 255));
        } else {
            ((Vibrator) obj).vibrate(10);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo10792g(8);
        mo85396Z0(false);
    }
}
