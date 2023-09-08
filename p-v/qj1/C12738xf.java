package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import ak1.C54117x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cl1.C0654b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.RequestDisallowScrollView;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.plugin.finder.live.view.C3211e;
import com.tencent.p014mm.plugin.finder.live.view.C3214f;
import com.tencent.p014mm.plugin.finder.live.view.C3216g;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFoldTextView;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import er1.C58739j4;
import er1.C7878t0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import je1.C33558n2;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import l60.C99344b;
import ls3.C10649f;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import ob0.C117747y;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61130g;
import p204mr.C11078h;
import p204mr.C11080k;
import p629ny.C76979h;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import te3.C48682a91;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C51828wg0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64284cg;
import te3.C64686ro2;
import tf0.C64916p1;
import wx3.C15601d;
import x60.C102564a;
import yx3.C66704d;
import yx3.C91590f;
import z04.C112551y;
import zk1.C66880s0;

/* renamed from: qj1.xf */
public final class C12738xf extends C62660c {

    /* renamed from: A */
    public final TextView f36486A;

    /* renamed from: B */
    public final TextView f36487B;

    /* renamed from: C */
    public final ImageView f36488C;

    /* renamed from: D */
    public final ImageView f36489D;

    /* renamed from: E */
    public final View f36490E;

    /* renamed from: F */
    public final ImageView f36491F;

    /* renamed from: G */
    public final ViewGroup f36492G;

    /* renamed from: H */
    public final FinderLiveAfterPluginRecommendLiveView f36493H;

    /* renamed from: I */
    public final ViewGroup f36494I;

    /* renamed from: J */
    public final ProgressBar f36495J;

    /* renamed from: K */
    public long f36496K;

    /* renamed from: L */
    public boolean f36497L;

    /* renamed from: M */
    public boolean f36498M = true;

    /* renamed from: N */
    public C117747y f36499N;

    /* renamed from: P */
    public boolean f36500P;

    /* renamed from: Q */
    public int f36501Q;

    /* renamed from: R */
    public int f36502R;

    /* renamed from: p */
    public final C58124b f36503p;

    /* renamed from: q */
    public final RequestDisallowScrollView f36504q;

    /* renamed from: r */
    public final RelativeLayout f36505r;

    /* renamed from: s */
    public final TextView f36506s;

    /* renamed from: t */
    public final TextView f36507t;

    /* renamed from: u */
    public final ImageView f36508u;

    /* renamed from: v */
    public final TextView f36509v;

    /* renamed from: w */
    public final View f36510w;

    /* renamed from: x */
    public final TextView f36511x;

    /* renamed from: y */
    public final RelativeLayout f36512y;

    /* renamed from: z */
    public final LinearLayout f36513z;

    /* renamed from: qj1.xf$a */
    public static final class C12739a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36514d;

        public C12739a(C12738xf xfVar) {
            this.f36514d = xfVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12738xf.m12229Z0(this.f36514d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.xf$b */
    public static final class C12740b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36515d;

        public C12740b(C12738xf xfVar) {
            this.f36515d = xfVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12738xf.m12229Z0(this.f36515d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.xf$c */
    public static final class C12741c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36516d;

        public C12741c(C12738xf xfVar) {
            this.f36516d = xfVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12738xf.m12229Z0(this.f36516d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.xf$d */
    public static final class C12742d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36517d;

        public C12742d(C12738xf xfVar) {
            this.f36517d = xfVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36517d.f36503p.statusChange(C58124b.C58125b.QUIT_LIVE, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.xf$e */
    public static final class C12743e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12743e(C12738xf xfVar) {
            super(0);
            this.f36518d = xfVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f36518d.f36504q.getHeight() + this.f36518d.f36504q.getScrollY() < this.f36518d.f36505r.getHeight());
        }
    }

    /* renamed from: qj1.xf$f */
    public static final class C12744f<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C12738xf f36519a;

        public C12744f(C12738xf xfVar) {
            this.f36519a = xfVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C12251ag((Bitmap) obj, this.f36519a));
        }
    }

    /* renamed from: qj1.xf$g */
    public static final class C12745g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36520d;

        public C12745g(C12738xf xfVar) {
            this.f36520d = xfVar;
        }

        public final void run() {
            this.f36520d.f36493H.mo3248a();
        }
    }

    /* renamed from: qj1.xf$h */
    public static final class C12746h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36521d;

        /* renamed from: e */
        public final /* synthetic */ View f36522e;

        public C12746h(C12738xf xfVar, View view) {
            this.f36521d = xfVar;
            this.f36522e = view;
        }

        public final void onClick(View view) {
            Class cls = C58312g.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f36521d.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            FinderLiveSideBar finderLiveSideBar = ((C58312g) rVar.mo62443b(context).mo75002a(cls)).f166968f;
            if (finderLiveSideBar != null) {
                finderLiveSideBar.mo77737d();
            }
            Context context2 = this.f36521d.f166287d.getContext();
            C87412m.m108593f(context2, "root.context");
            ((C58312g) rVar.mo62443b(context2).mo75002a(cls)).f166971i.f166979h = 3;
            View view2 = this.f36522e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorAfterPlugin", mo125469f = "FinderLiveVisitorAfterPlugin.kt", mo125470l = {570}, mo125471m = "updateBg")
    /* renamed from: qj1.xf$i */
    public static final class C12747i extends C66704d {

        /* renamed from: d */
        public Object f36523d;

        /* renamed from: e */
        public /* synthetic */ Object f36524e;

        /* renamed from: f */
        public final /* synthetic */ C12738xf f36525f;

        /* renamed from: g */
        public int f36526g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12747i(C12738xf xfVar, C15601d<? super C12747i> dVar) {
            super(dVar);
            this.f36525f = xfVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36524e = obj;
            this.f36526g |= Integer.MIN_VALUE;
            return this.f36525f.mo12284h1((String) null, (String) null, this);
        }
    }

    /* renamed from: qj1.xf$j */
    public static final class C12748j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f36527d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<FinderLiveFoldTextView> f36528e;

        /* renamed from: f */
        public final /* synthetic */ C12738xf f36529f;

        /* renamed from: g */
        public final /* synthetic */ String f36530g;

        public C12748j(View view, C8479f0<FinderLiveFoldTextView> f0Var, C12738xf xfVar, String str) {
            this.f36527d = view;
            this.f36528e = f0Var;
            this.f36529f = xfVar;
            this.f36530g = str;
        }

        public void onGlobalLayout() {
            this.f36527d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            String spannableString = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(this.f36529f.f166287d.getContext(), this.f36530g, 0.0f).toString();
            C87412m.m108593f(spannableString, "getService(ISpannableSer…ext, desc, 0f).toString()");
            ((FinderLiveFoldTextView) this.f36528e.f27484d).mo3269o(spannableString, 5, this.f36527d.getWidth(), true, (C32226l<? super CharSequence, ? extends C75375u>) null);
        }
    }

    /* renamed from: qj1.xf$k */
    public static final class C12749k implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<FinderLiveFoldTextView> f36531d;

        public C12749k(C8479f0<FinderLiveFoldTextView> f0Var) {
            this.f36531d = f0Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateDesc$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (!((FinderLiveFoldTextView) this.f36531d.f27484d).f15236V) {
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateDesc$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: qj1.xf$l */
    public static final class C12750l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderObject f36532d;

        /* renamed from: e */
        public final /* synthetic */ C12738xf f36533e;

        public C12750l(FinderObject finderObject, C12738xf xfVar) {
            this.f36532d = finderObject;
            this.f36533e = xfVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            C51828wg0 wg02;
            C51828wg0 wg03;
            Class cls = C10383h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C64273c21 c212 = this.f36532d.liveInfo;
            if (C61926c.m72696u(c212 != null ? c212.f182374S : 0, 64)) {
                C64273c21 c213 = this.f36532d.liveInfo;
                if (c213 == null || (wg03 = c213.f182380V) == null || (str = wg03.f144033e) == null) {
                    str = "";
                }
                if (c213 == null || (wg02 = c213.f182380V) == null || (str2 = wg02.f144032d) == null) {
                    str2 = "";
                }
                intent.putExtra("key_enter_live_param_bind_type", 4);
                intent.putExtra("key_enter_live_param_by_biz_username", str);
                intent.putExtra("key_enter_live_param_by_biz_nickname", str2);
            }
            ((C10383h) C86312j.m106911c(cls)).mo10697OK(((C10383h) C86312j.m106911c(cls)).mo10696E());
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f36532d);
            C64279c90 c902 = new C64279c90();
            FinderObject finderObject = this.f36532d;
            c902.f182444d = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            c902.f182445e = "";
            c902.f182446f = false;
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = 1;
            C64686ro2 ro22 = new C64686ro2();
            ro22.f185214e = 0;
            ro22.f185218i = finderObject;
            c902.f182450j = ro22;
            Context context = this.f36533e.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(context, intent, arrayList2, 0, c902, (C10649f.C10650a) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.xf$m */
    public static final class C12751m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36534d;

        /* renamed from: e */
        public final /* synthetic */ C49098d51 f36535e;

        /* renamed from: f */
        public final /* synthetic */ FinderObject f36536f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<TextView> f36537g;

        /* renamed from: qj1.xf$m$a */
        public static final class C12752a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C12738xf f36538d;

            public C12752a(C12738xf xfVar) {
                this.f36538d = xfVar;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (e0Var.mo107176v()) {
                    e0Var.mo107140d(4, this.f36538d.f166287d.getContext().getResources().getColor(C0966R.color.f2966ao), this.f36538d.f166287d.getContext().getResources().getString(C0966R.string.e08));
                }
            }
        }

        /* renamed from: qj1.xf$m$b */
        public static final class C12753b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C49098d51 f36539d;

            /* renamed from: e */
            public final /* synthetic */ String f36540e;

            /* renamed from: f */
            public final /* synthetic */ FinderObject f36541f;

            /* renamed from: g */
            public final /* synthetic */ C12738xf f36542g;

            /* renamed from: h */
            public final /* synthetic */ C8479f0<TextView> f36543h;

            public C12753b(C49098d51 d512, String str, FinderObject finderObject, C12738xf xfVar, C8479f0<TextView> f0Var) {
                this.f36539d = d512;
                this.f36540e = str;
                this.f36541f = finderObject;
                this.f36542g = xfVar;
                this.f36543h = f0Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
                r1 = r1.liveInfo;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onMMMenuItemSelected(android.view.MenuItem r30, int r31) {
                /*
                    r29 = this;
                    r0 = r29
                    int r1 = r30.getItemId()
                    r2 = 4
                    if (r1 != r2) goto L_0x0085
                    te3.d51 r1 = r0.f36539d
                    r2 = 1
                    r1.f132119e = r2
                    java.lang.Class<ak1.w> r1 = ak1.C54116w.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
                    gy3.C87412m.m108593f(r1, r2)
                    r3 = r1
                    mr.m r3 = (p204mr.C61568m) r3
                    ak1.k0 r4 = ak1.C0077k0.Cancle
                    java.lang.String r5 = r0.f36540e
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f36541f
                    if (r1 == 0) goto L_0x002b
                    te3.c21 r1 = r1.liveInfo
                    if (r1 == 0) goto L_0x002b
                    long r1 = r1.f182392d
                    goto L_0x002d
                L_0x002b:
                    r1 = 0
                L_0x002d:
                    r6 = r1
                    r8 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    te3.d51 r1 = r0.f36539d
                    java.lang.String r2 = r1.f132121g
                    if (r2 != 0) goto L_0x003b
                    java.lang.String r2 = ""
                L_0x003b:
                    r14 = r2
                    r15 = 0
                    java.lang.String r1 = r1.f132122h
                    r16 = r1
                    r17 = 0
                    r18 = 0
                    r20 = 0
                    r21 = 30176(0x75e0, float:4.2286E-41)
                    r22 = 0
                    java.lang.String r9 = "temp_30"
                    p204mr.C61568m.C61569a.m72263a(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22)
                    java.lang.String r1 = r0.f36540e
                    qj1.xf r2 = r0.f36542g
                    te3.d51 r3 = r0.f36539d
                    gy3.f0<android.widget.TextView> r4 = r0.f36543h
                    r28 = 2
                    r23 = r1
                    r24 = r2
                    r25 = r3
                    r26 = r4
                    r27 = r3
                    qj1.C12738xf.C12751m.m12252a(r23, r24, r25, r26, r27, r28)
                    qj1.xf r1 = r0.f36542g
                    android.view.ViewGroup r1 = r1.f166287d
                    android.content.Context r1 = r1.getContext()
                    qj1.xf r2 = r0.f36542g
                    android.view.ViewGroup r2 = r2.f166287d
                    android.content.Context r2 = r2.getContext()
                    r3 = 2131826250(0x7f11164a, float:1.928538E38)
                    java.lang.String r2 = r2.getString(r3)
                    r3 = 2131756010(0x7f1003ea, float:1.9142915E38)
                    nj3.C76912y0.m92769h(r1, r2, r3)
                L_0x0085:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qj1.C12738xf.C12751m.C12753b.onMMMenuItemSelected(android.view.MenuItem, int):void");
            }
        }

        public C12751m(C12738xf xfVar, C49098d51 d512, FinderObject finderObject, C8479f0<TextView> f0Var) {
            this.f36534d = xfVar;
            this.f36535e = d512;
            this.f36536f = finderObject;
            this.f36537g = f0Var;
        }

        /* renamed from: a */
        public static final void m12252a(String str, C12738xf xfVar, C49098d51 d512, C8479f0<TextView> f0Var, C49098d51 d513, int i) {
            C13598b0 b0Var;
            String str2 = str;
            C49098d51 d514 = d513;
            C2816v vVar = C2816v.f14072a;
            String str3 = d514.f132122h;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            C49098d51 d = vVar.mo2915d(str, str3);
            if (d != null) {
                d.f132119e = d514.f132119e;
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                String str5 = d514.f132122h;
                if (str5 != null) {
                    str4 = str5;
                }
                vVar.mo2912a(str, str4, d514);
            }
            String str6 = d514.f132122h;
            C87412m.m108591d(str6);
            FinderObject finderObject = ((C54991o) xfVar.mo87684A0().mo71262a(C54991o.class)).f154341n;
            C86709a0.m107524d().mo123460f(new C33558n2(str, str6, i, (C49712hj1) null, (String) null, 102, Long.valueOf(finderObject != null ? finderObject.f164794id : -1), 16, (C8480h) null));
            d514.f132119e = d514.f132119e;
            C12738xf xfVar2 = xfVar;
            C49098d51 d515 = d512;
            C8479f0<TextView> f0Var2 = f0Var;
            C12738xf.m12231l1(d512, f0Var, xfVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0070, code lost:
            r1 = r1.liveInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r28) {
            /*
                r27 = this;
                r6 = r27
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r28
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$2$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r27
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                qj1.xf r0 = r6.f36534d
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
                cl1.o r0 = (cl1.C54991o) r0
                java.lang.String r0 = r0.f154345o
                te3.d51 r1 = r6.f36535e
                int r2 = r1.f132119e
                r3 = 1
                if (r2 != r3) goto L_0x00a3
                r2 = 0
                r1.f132119e = r2
                qj1.xf r1 = r6.f36534d
                android.view.ViewGroup r1 = r1.f166287d
                android.content.Context r1 = r1.getContext()
                qj1.xf r2 = r6.f36534d
                android.view.ViewGroup r2 = r2.f166287d
                android.content.Context r2 = r2.getContext()
                r3 = 2131828242(0x7f111e12, float:1.928942E38)
                java.lang.String r2 = r2.getString(r3)
                nj3.C76912y0.m92773l(r1, r2)
                qj1.xf r8 = r6.f36534d
                te3.d51 r11 = r6.f36535e
                gy3.f0<android.widget.TextView> r10 = r6.f36537g
                r12 = 1
                r7 = r0
                r9 = r11
                m12252a(r7, r8, r9, r10, r11, r12)
                java.lang.Class<ak1.w> r1 = ak1.C54116w.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r7 = r1
                mr.m r7 = (p204mr.C61568m) r7
                ak1.k0 r8 = ak1.C0077k0.Book
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r6.f36536f
                if (r1 == 0) goto L_0x0077
                te3.c21 r1 = r1.liveInfo
                if (r1 == 0) goto L_0x0077
                long r1 = r1.f182392d
                goto L_0x0079
            L_0x0077:
                r1 = 0
            L_0x0079:
                r10 = r1
                r12 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                te3.d51 r1 = r6.f36535e
                java.lang.String r2 = r1.f132121g
                if (r2 != 0) goto L_0x0089
                java.lang.String r2 = ""
            L_0x0089:
                r18 = r2
                r19 = 0
                java.lang.String r1 = r1.f132122h
                r20 = r1
                r21 = 0
                r22 = 0
                r24 = 0
                r25 = 30176(0x75e0, float:4.2286E-41)
                r26 = 0
                java.lang.String r13 = "temp_30"
                r9 = r0
                p204mr.C61568m.C61569a.m72263a(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26)
                goto L_0x00ce
            L_0x00a3:
                qo3.n r1 = new qo3.n
                qj1.xf r2 = r6.f36534d
                android.view.ViewGroup r2 = r2.f166287d
                android.content.Context r2 = r2.getContext()
                r1.<init>((android.content.Context) r2, (int) r3, (boolean) r3)
                r1.mo107570o(r3)
                qj1.xf$m$a r2 = new qj1.xf$m$a
                qj1.xf r11 = r6.f36534d
                r2.<init>(r11)
                r1.f225771i = r2
                qj1.xf$m$b r2 = new qj1.xf$m$b
                te3.d51 r8 = r6.f36535e
                com.tencent.mm.protocal.protobuf.FinderObject r10 = r6.f36536f
                gy3.f0<android.widget.TextView> r12 = r6.f36537g
                r7 = r2
                r9 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                r1.f225782p = r2
                r1.mo107573q()
            L_0x00ce:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$2$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12738xf.C12751m.onClick(android.view.View):void");
        }
    }

    /* renamed from: qj1.xf$n */
    public static final class C12754n extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36544d;

        public C12754n(C12738xf xfVar) {
            this.f36544d = xfVar;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f36544d.f36490E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$anim$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$anim$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f36544d.mo12282f1(0);
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f36544d.f36490E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$anim$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$anim$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f36544d.mo12282f1(0);
        }
    }

    /* renamed from: qj1.xf$o */
    public static final class C12755o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C12738xf f36545d;

        public C12755o(C12738xf xfVar) {
            this.f36545d = xfVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f36545d.f36490E;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$anim$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$updateNextLiveInfo$anim$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12738xf(ViewGroup viewGroup, C58124b bVar, C49712hj1 hj12) {
        super(viewGroup, bVar, hj12);
        ViewGroup viewGroup2 = viewGroup;
        C58124b bVar2 = bVar;
        C87412m.m108594g(viewGroup2, "root");
        C87412m.m108594g(bVar2, "statueMonitor");
        this.f36503p = bVar2;
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.kbr);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.main_content_sv)");
        RequestDisallowScrollView requestDisallowScrollView = (RequestDisallowScrollView) findViewById;
        this.f36504q = requestDisallowScrollView;
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.kbq);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.main_content_inner)");
        this.f36505r = (RelativeLayout) findViewById2;
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.knx);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.title)");
        TextView textView = (TextView) findViewById3;
        this.f36506s = textView;
        View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.f357845c22);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.desc)");
        this.f36507t = (TextView) findViewById4;
        View findViewById5 = viewGroup2.findViewById(C0966R.C0970id.f5830pt);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.anchor_avatar)");
        ImageView imageView = (ImageView) findViewById5;
        this.f36508u = imageView;
        View findViewById6 = viewGroup2.findViewById(C0966R.C0970id.f5835py);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.anchor_name)");
        TextView textView2 = (TextView) findViewById6;
        this.f36509v = textView2;
        View findViewById7 = viewGroup2.findViewById(C0966R.C0970id.mko);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.v…anchor_profile_container)");
        this.f36510w = findViewById7;
        View findViewById8 = viewGroup2.findViewById(C0966R.C0970id.mkp);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.visit_anchor_profile_text)");
        TextView textView3 = (TextView) findViewById8;
        this.f36511x = textView3;
        View findViewById9 = viewGroup2.findViewById(C0966R.C0970id.frb);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.live_after_ui_root_group)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById9;
        this.f36512y = relativeLayout;
        View findViewById10 = viewGroup2.findViewById(C0966R.C0970id.f5833pw);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.anchor_ext_info_layout)");
        this.f36513z = (LinearLayout) findViewById10;
        View findViewById11 = viewGroup2.findViewById(C0966R.C0970id.f5831pu);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.anchor_ext_info_auth)");
        this.f36486A = (TextView) findViewById11;
        View findViewById12 = viewGroup2.findViewById(C0966R.C0970id.f5832pv);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.a…_info_friend_floow_count)");
        this.f36487B = (TextView) findViewById12;
        View findViewById13 = viewGroup2.findViewById(C0966R.C0970id.f5829ps);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.anchor_auth_icon)");
        this.f36488C = (ImageView) findViewById13;
        View findViewById14 = viewGroup2.findViewById(C0966R.C0970id.a36);
        C87412m.m108593f(findViewById14, "root.findViewById(R.id.back_icon)");
        ImageView imageView2 = (ImageView) findViewById14;
        this.f36489D = imageView2;
        View findViewById15 = viewGroup2.findViewById(C0966R.C0970id.duq);
        C87412m.m108593f(findViewById15, "root.findViewById(R.id.f…_live_notice_info_layout)");
        this.f36490E = findViewById15;
        View findViewById16 = viewGroup2.findViewById(C0966R.C0970id.mfk);
        C87412m.m108593f(findViewById16, "root.findViewById(R.id.live_after_ui_bg_view)");
        this.f36491F = (ImageView) findViewById16;
        View findViewById17 = viewGroup2.findViewById(C0966R.C0970id.crr);
        C87412m.m108593f(findViewById17, "root.findViewById(R.id.anchor_videos_area)");
        this.f36492G = (ViewGroup) findViewById17;
        View findViewById18 = viewGroup2.findViewById(C0966R.C0970id.mjt);
        C87412m.m108593f(findViewById18, "root.findViewById(R.id.to_profile_btn)");
        View findViewById19 = viewGroup2.findViewById(C0966R.C0970id.mlt);
        C87412m.m108593f(findViewById19, "root.findViewById(R.id.similar_live_area)");
        this.f36493H = (FinderLiveAfterPluginRecommendLiveView) findViewById19;
        View findViewById20 = viewGroup2.findViewById(C0966R.C0970id.f357560c71);
        C87412m.m108593f(findViewById20, "root.findViewById(R.id.bottom_more_content)");
        this.f36494I = (ViewGroup) findViewById20;
        View findViewById21 = viewGroup2.findViewById(C0966R.C0970id.f358619g33);
        C87412m.m108593f(findViewById21, "root.findViewById(R.id.loading_bar)");
        ProgressBar progressBar = (ProgressBar) findViewById21;
        this.f36495J = progressBar;
        new LifecycleScope("Finder.LiveVisitorAfterPlugin", this, 0, 4, (C8480h) null);
        textView3.setOnClickListener(new C12739a(this));
        ((ViewGroup) findViewById18).setOnClickListener(new C12740b(this));
        imageView.setOnClickListener(new C12741c(this));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += C75044y4.m89994f(MMApplicationContext.getContext());
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        relativeLayout.setVisibility(8);
        progressBar.setVisibility(8);
        imageView2.setImageDrawable(C74933u4.m89768e(viewGroup.getContext(), C0966R.raw.icons_filled_back, -1));
        imageView2.setOnClickListener(new C12742d(this));
        requestDisallowScrollView.setNeedRequestDisallowInterceptTouchEvent(new C12743e(this));
        viewGroup.setTranslationX((float) C75044y4.m89990b(viewGroup.getContext()).x);
        this.f36501Q = 8;
        this.f36502R = 8;
    }

    /* renamed from: Z0 */
    public static final void m12229Z0(C12738xf xfVar) {
        String str;
        Class cls = C0654b.class;
        Class cls2 = C54991o.class;
        if (((C0654b) xfVar.mo87696x0(cls)).f1544f) {
            str = ((C0654b) xfVar.mo87696x0(cls)).f1545g;
            C58739j4 j4Var = C58739j4.f168176a;
            String str2 = ((C54991o) xfVar.mo87696x0(cls2)).f154345o;
            Context context = xfVar.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            j4Var.mo83695X(str, str2, context, ((C54991o) xfVar.mo87696x0(cls2)).f154325i1, String.valueOf(((C55001u) xfVar.mo87696x0(C55001u.class)).f154420q.f182392d), 3);
        } else {
            str = ((C54991o) xfVar.mo87696x0(cls2)).f154345o;
            Intent intent = new Intent();
            intent.putExtra("finder_username", str);
            intent.putExtra("key_enter_profile_type", 11);
            Context context2 = xfVar.f166287d.getContext();
            C87412m.m108593f(context2, "root.context");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context2, intent);
        }
        ((C54116w) C86312j.m106911c(C54116w.class)).qy0(str);
    }

    /* renamed from: c1 */
    public static final void m12230c1(ImageView imageView, C12738xf xfVar, C100810g0 g0Var) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(g0Var, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        C12744f fVar = new C12744f(xfVar);
        b.getClass();
        b.f291320d = fVar;
        ((C99342a) b).mo85954d(imageView);
    }

    /* renamed from: l1 */
    public static final void m12231l1(C49098d51 d512, C8479f0<TextView> f0Var, C12738xf xfVar) {
        if (d512.f132119e == 1) {
            ((TextView) f0Var.f27484d).setText(xfVar.f166287d.getContext().getResources().getString(C0966R.string.d5s));
            ((TextView) f0Var.f27484d).setTextColor(xfVar.f166287d.getContext().getResources().getColor(C0966R.color.f2975b6));
            ((TextView) f0Var.f27484d).setBackground(xfVar.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.f5150yh));
            return;
        }
        ((TextView) f0Var.f27484d).setText(xfVar.f166287d.getContext().getResources().getString(C0966R.string.d5t));
        ((TextView) f0Var.f27484d).setTextColor(xfVar.f166287d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
        ((TextView) f0Var.f27484d).setBackground(xfVar.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.f5137xw));
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
        this.f36494I.setVisibility(z ? 4 : 0);
        if (!z) {
            this.f36493H.postDelayed(new C12745g(this), 200);
        }
        if (z) {
            View view = this.f36490E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "onClearForSideBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "onClearForSideBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f36492G.setVisibility(8);
            mo12283g1();
            return;
        }
        View view3 = this.f36490E;
        int i = this.f36501Q;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "onClearForSideBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "onClearForSideBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f36492G.setVisibility(this.f36502R);
    }

    /* renamed from: a1 */
    public final void mo12278a1() {
        Class cls = C54991o.class;
        C2816v vVar = C2816v.f14072a;
        String str = ((C54991o) mo87696x0(cls)).f154345o;
        if (str == null) {
            str = "";
        }
        C49098d51 c = vVar.mo2914c(str);
        if (c != null) {
            mo12286j1(c, (FinderObject) null);
        }
        C7335d c2 = C86312j.m106911c(C60200t1.class);
        C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
        C60200t1 t1Var = (C60200t1) c2;
        String str2 = ((C54991o) mo87696x0(cls)).f154345o;
        this.f36499N = C60200t1.C60201a.m70363a(t1Var, str2 == null ? "" : str2, 0, (C89349b) null, 0, (C49712hj1) null, 0, 0, false, 1, Long.valueOf(((C55001u) mo87696x0(C55001u.class)).f154416j), 104, (Object) null);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo12279b1(String str, int i, FinderAuthInfo finderAuthInfo) {
        Class cls = C0654b.class;
        if (((C0654b) mo87696x0(cls)).f1544f) {
            this.f36511x.setText(this.f166287d.getContext().getString(C0966R.string.e0h, new Object[]{((C0654b) mo87696x0(cls)).f1546h}));
        } else {
            this.f36511x.setText(this.f166287d.getContext().getString(C0966R.string.e_a));
        }
        if ((!Util.isNullOrNil(str) || i > 0) && !((C0654b) mo87696x0(cls)).f1544f) {
            Log.m105924i("Finder.LiveVisitorAfterPlugin", "authProfession:" + str + ", friendFollowCount:" + i);
            this.f36513z.setVisibility(0);
            if (!Util.isNullOrNil(str)) {
                String string = this.f166287d.getContext().getResources().getString(C0966R.string.mlm, new Object[]{str});
                C87412m.m108593f(string, "root.context.resources.g…uth_mark, authProfession)");
                this.f36486A.setText(string);
                this.f36486A.setVisibility(0);
            } else {
                this.f36486A.setVisibility(8);
            }
            if (i > 0) {
                String string2 = this.f166287d.getContext().getResources().getString(C0966R.string.da4, new Object[]{C7878t0.m8039h(i)});
                C87412m.m108593f(string2, "root.context.resources.g…umber(friendFollowCount))");
                this.f36487B.setText(string2);
                this.f36487B.setVisibility(0);
            } else {
                this.f36487B.setVisibility(8);
            }
        } else {
            this.f36513z.setVisibility(8);
        }
        if (finderAuthInfo != null) {
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1.C64917a.m76444k((C64916p1) c, this.f36488C, finderAuthInfo, 0, (C64284cg) null, 8, (Object) null);
        }
    }

    /* renamed from: d1 */
    public final void mo12280d1(C48682a91 a912) {
        if (!(this.f36493H.getVisibility() == 0)) {
            this.f36493H.setReportObj(this.f177937h);
            if (a912 == null) {
                this.f36493H.setVisibility(8);
                return;
            }
            this.f36493H.setVisibility(0);
            FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f36493H;
            finderLiveAfterPluginRecommendLiveView.getClass();
            finderLiveAfterPluginRecommendLiveView.f15203e.setReportObj(finderLiveAfterPluginRecommendLiveView.f15202d);
            finderLiveAfterPluginRecommendLiveView.f15204f.setReportObj(finderLiveAfterPluginRecommendLiveView.f15202d);
            ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("page_id", "1002");
            ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(C54067f0.C0066n.END_PAGE_LIVE_ITEM, hashMap);
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndRecommendLiveMoreExposed report23057, page_id = " + ((String) hashMap.get("page_id")) + '}');
            finderLiveAfterPluginRecommendLiveView.f15205g.setText(a912.f130379f);
            if (a912.f130381h.size() > 0) {
                finderLiveAfterPluginRecommendLiveView.f15203e.post(new C3211e(finderLiveAfterPluginRecommendLiveView, a912));
            } else {
                finderLiveAfterPluginRecommendLiveView.f15203e.setVisibility(4);
            }
            if (a912.f130381h.size() > 1) {
                finderLiveAfterPluginRecommendLiveView.f15204f.post(new C3214f(finderLiveAfterPluginRecommendLiveView, a912));
            } else {
                finderLiveAfterPluginRecommendLiveView.f15204f.setVisibility(4);
            }
            finderLiveAfterPluginRecommendLiveView.f15206h.setOnClickListener(new C3216g(finderLiveAfterPluginRecommendLiveView, a912.f130386p));
            finderLiveAfterPluginRecommendLiveView.f15207i.setText(C0966R.string.f360975ge2);
            finderLiveAfterPluginRecommendLiveView.f15208j = a912;
            finderLiveAfterPluginRecommendLiveView.mo3248a();
        }
    }

    /* renamed from: e1 */
    public final void mo12281e1(int i) {
        this.f36502R = i;
        this.f36492G.setVisibility(i);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            this.f36492G.setVisibility(8);
        }
    }

    /* renamed from: f1 */
    public final void mo12282f1(int i) {
        this.f36501Q = i;
        View view = this.f36490E;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "setNextLiveVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "setNextLiveVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            View view2 = this.f36490E;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "setNextLiveVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "setNextLiveVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 0) {
            ImageView imageView = this.f36489D;
            ViewParent parent = imageView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                imageView.post(new C12762yf(imageView, view));
            }
        }
        View findViewById = this.f166287d.findViewById(C0966R.C0970id.jkv);
        if (findViewById != null) {
            findViewById.setOnClickListener((View.OnClickListener) null);
            findViewById.setClickable(false);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "hideSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "hideSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f166287d.getVisibility() == 0) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
                mo12283g1();
                return;
            }
        }
        Log.m105924i("Finder.LiveVisitorAfterPlugin", "hide after maskview");
    }

    /* renamed from: g1 */
    public final void mo12283g1() {
        Log.m105924i("Finder.LiveVisitorAfterPlugin", "show after maskview");
        View findViewById = this.f166287d.findViewById(C0966R.C0970id.jkv);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "showSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "showSidebarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C12746h(this, findViewById));
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
        r0 = (r0 = r0.contact).username;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0187 A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018d A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12284h1(java.lang.String r24, java.lang.String r25, wx3.C15601d<? super rx3.C13598b0> r26) {
        /*
            r23 = this;
            r1 = r23
            r0 = r26
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.Class<cl1.b0> r5 = cl1.C54946b0.class
            boolean r6 = r0 instanceof qj1.C12738xf.C12747i
            if (r6 == 0) goto L_0x001f
            r6 = r0
            qj1.xf$i r6 = (qj1.C12738xf.C12747i) r6
            int r7 = r6.f36526g
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f36526g = r7
            goto L_0x0024
        L_0x001f:
            qj1.xf$i r6 = new qj1.xf$i
            r6.<init>(r1, r0)
        L_0x0024:
            r11 = r6
            java.lang.Object r0 = r11.f36524e
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r11.f36526g
            java.lang.String r14 = "Finder.LiveVisitorAfterPlugin"
            r15 = 0
            r13 = 1
            if (r7 == 0) goto L_0x004a
            if (r7 != r13) goto L_0x0042
            java.lang.Object r2 = r11.f36523d
            qj1.xf r2 = (qj1.C12738xf) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x003f }
            r3 = r2
            r2 = r0
            r0 = 1
            goto L_0x0177
        L_0x003f:
            r0 = move-exception
            goto L_0x01d6
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r0)
            nk1.b r0 = nk1.C11193b.f33003a
            androidx.lifecycle.i0 r7 = r1.mo87696x0(r4)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.mo75969L3()
            android.widget.ImageView r8 = r1.f36491F
            r9 = 0
            r10 = r25
            r0.mo11281b(r10, r7, r8, r9)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r7 = r0.mo62446e(r3)
            bl3.c r7 = r7.mo62447c(r2)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11872i2()
            pl1.f r8 = new pl1.f
            r12 = 2
            r13 = r24
            r8.<init>(r13, r9, r12, r9)
            android.widget.ImageView r12 = r1.f36508u
            pl1.e0$a r13 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r0 = r0.mo62446e(r3)
            bl3.c r0 = r0.mo62447c(r2)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r13)
            r7.mo85957c(r8, r12, r0)
            er1.j4 r16 = er1.C58739j4.f168176a
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r4)
            cl1.o r0 = (cl1.C54991o) r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
            if (r0 == 0) goto L_0x00a6
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.contact
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r0.username
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            r17 = r0
            goto L_0x00a8
        L_0x00a6:
            r17 = r10
        L_0x00a8:
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r4)
            cl1.o r0 = (cl1.C54991o) r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
            if (r0 == 0) goto L_0x00b8
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.contact
            if (r0 == 0) goto L_0x00b8
            java.lang.String r9 = r0.nickname
        L_0x00b8:
            r18 = r9
            r19 = 0
            r20 = 4
            r21 = 0
            java.lang.String r0 = er1.C58739j4.m68253s(r16, r17, r18, r19, r20, r21)
            android.widget.TextView r2 = r1.f36509v
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.view.ViewGroup r4 = r1.f166287d
            android.content.Context r4 = r4.getContext()
            android.text.SpannableString r0 = r3.mo107057T1(r4, r0)
            r2.setText(r0)
            android.widget.RelativeLayout r0 = r1.f36512y
            r0.setVisibility(r15)
            android.widget.ProgressBar r0 = r1.f36495J
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.f36506s
            androidx.lifecycle.i0 r3 = r1.mo87696x0(r5)
            cl1.b0 r3 = (cl1.C54946b0) r3
            java.lang.String r3 = r3.f153985i
            if (r3 == 0) goto L_0x00f4
            goto L_0x0101
        L_0x00f4:
            android.view.ViewGroup r3 = r1.f166287d
            android.content.Context r3 = r3.getContext()
            r4 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r3 = r3.getString(r4)
        L_0x0101:
            r0.setText(r3)
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r5)
            cl1.b0 r0 = (cl1.C54946b0) r0
            java.lang.String r0 = r0.f153986j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0125
            android.widget.TextView r0 = r1.f36507t
            r0.setVisibility(r15)
            android.widget.TextView r0 = r1.f36507t
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r5)
            cl1.b0 r2 = (cl1.C54946b0) r2
            java.lang.String r2 = r2.f153986j
            r0.setText(r2)
            goto L_0x012a
        L_0x0125:
            android.widget.TextView r0 = r1.f36507t
            r0.setVisibility(r2)
        L_0x012a:
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r5)
            cl1.b0 r0 = (cl1.C54946b0) r0
            java.lang.String r0 = r0.f153985i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01ee
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r5)
            cl1.b0 r0 = (cl1.C54946b0) r0
            java.lang.String r0 = r0.f153986j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01ee
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x003f }
            dj1.m r7 = new dj1.m     // Catch:{ all -> 0x003f }
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r0)     // Catch:{ all -> 0x003f }
            cl1.u r0 = (cl1.C55001u) r0     // Catch:{ all -> 0x003f }
            te3.c21 r0 = r0.f154420q     // Catch:{ all -> 0x003f }
            long r2 = r0.f182392d     // Catch:{ all -> 0x003f }
            r19 = 0
            java.lang.String r20 = ""
            r21 = 0
            r22 = 0
            r16 = r7
            r17 = r2
            r16.<init>(r17, r19, r20, r21, r22)     // Catch:{ all -> 0x003f }
            r8 = 0
            r10 = 0
            r12 = 3
            r13 = 0
            r11.f36523d = r1     // Catch:{ all -> 0x003f }
            r0 = 1
            r11.f36526g = r0     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = q40.C89456b.m111831a(r7, r8, r10, r11, r12, r13)     // Catch:{ all -> 0x003f }
            if (r2 != r6) goto L_0x0176
            return r6
        L_0x0176:
            r3 = r1
        L_0x0177:
            te3.vn0 r2 = (te3.C51713vn0) r2     // Catch:{ all -> 0x003f }
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86205v     // Catch:{ all -> 0x003f }
            java.lang.Object r4 = r4.mo60266n()     // Catch:{ all -> 0x003f }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x003f }
            int r4 = r4.intValue()     // Catch:{ all -> 0x003f }
            if (r4 != r0) goto L_0x0189
            r3.f36500P = r0     // Catch:{ all -> 0x003f }
        L_0x0189:
            te3.tr0 r2 = r2.f143579n     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x01cf
            r3.f36500P = r0     // Catch:{ all -> 0x003f }
            java.lang.String r0 = r2.f142364d     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r2.f142365e     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r4.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r6 = "updateBg: show abnormal close page, title:"
            r4.append(r6)     // Catch:{ all -> 0x003f }
            r4.append(r0)     // Catch:{ all -> 0x003f }
            java.lang.String r6 = ", wording:"
            r4.append(r6)     // Catch:{ all -> 0x003f }
            r4.append(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x003f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)     // Catch:{ all -> 0x003f }
            androidx.lifecycle.i0 r4 = r3.mo87696x0(r5)     // Catch:{ all -> 0x003f }
            cl1.b0 r4 = (cl1.C54946b0) r4     // Catch:{ all -> 0x003f }
            r4.f153985i = r0     // Catch:{ all -> 0x003f }
            androidx.lifecycle.i0 r4 = r3.mo87696x0(r5)     // Catch:{ all -> 0x003f }
            cl1.b0 r4 = (cl1.C54946b0) r4     // Catch:{ all -> 0x003f }
            r4.f153986j = r2     // Catch:{ all -> 0x003f }
            android.widget.TextView r4 = r3.f36506s     // Catch:{ all -> 0x003f }
            r4.setText(r0)     // Catch:{ all -> 0x003f }
            android.widget.TextView r0 = r3.f36507t     // Catch:{ all -> 0x003f }
            r0.setText(r2)     // Catch:{ all -> 0x003f }
            android.widget.TextView r0 = r3.f36507t     // Catch:{ all -> 0x003f }
            r0.setVisibility(r15)     // Catch:{ all -> 0x003f }
        L_0x01cf:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x003f }
            goto L_0x01e0
        L_0x01d6:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x01e0:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x01f1
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r3, r2)
            goto L_0x01f1
        L_0x01ee:
            r0 = 1
            r1.f36500P = r0
        L_0x01f1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12738xf.mo12284h1(java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f36493H;
        finderLiveAfterPluginRecommendLiveView.getClass();
        Context context = finderLiveAfterPluginRecommendLiveView.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C11078h Jk0 = ((C11080k) C86312j.m106911c(C11080k.class)).Jk0((AppCompatActivity) context);
        Jk0.mo11219e();
        finderLiveAfterPluginRecommendLiveView.f15209n = Jk0;
        finderLiveAfterPluginRecommendLiveView.mo3248a();
        this.f36504q.scrollTo(0, 0);
    }

    /* renamed from: i1 */
    public final void mo12285i1(String str) {
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = this.f36490E.findViewById(C0966R.C0970id.dk8);
        View findViewById = this.f36490E.findViewById(C0966R.C0970id.daj);
        C87412m.m108593f(findViewById, "nextLiveView.findViewByI…er_live_after_ui_desc_ll)");
        View findViewById2 = this.f36490E.findViewById(C0966R.C0970id.dk9);
        C87412m.m108593f(findViewById2, "nextLiveView.findViewByI…finder_live_desc_text_sv)");
        if (str == null || str.length() == 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "updateDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "updateDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((FinderLiveFoldTextView) f0Var.f27484d).setOnTouchListener((View.OnTouchListener) null);
        } else if (!C87412m.m108589b(str, ((FinderLiveFoldTextView) f0Var.f27484d).mo154968a())) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "updateDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin", "updateDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C12748j(findViewById, f0Var, this, str));
            findViewById2.setOnTouchListener(new C12749k(f0Var));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r6 = r2.liveInfo;
     */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12286j1(te3.C49098d51 r37, com.tencent.p014mm.protocal.protobuf.FinderObject r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            boolean r3 = r0.f36500P
            r4 = 8
            r5 = 0
            if (r3 == 0) goto L_0x0011
            r0.mo12282f1(r4)
            return r5
        L_0x0011:
            if (r1 != 0) goto L_0x0019
            if (r2 != 0) goto L_0x0019
            r0.mo12282f1(r4)
            return r5
        L_0x0019:
            r3 = 1
            if (r2 == 0) goto L_0x0034
            te3.c21 r6 = r2.liveInfo
            if (r6 == 0) goto L_0x0034
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            androidx.lifecycle.i0 r7 = r0.mo87696x0(r7)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r7 = r7.f182392d
            long r9 = r6.f182392d
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r6 == 0) goto L_0x0042
            java.lang.String r1 = "Finder.LiveVisitorAfterPlugin"
            java.lang.String r2 = "[updateNextLiveInfo] next live id is same to cureent id. return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r0.mo12282f1(r4)
            return r5
        L_0x0042:
            android.view.View r6 = r0.f36490E
            r7 = 2131304027(0x7f091e5b, float:1.8226185E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.View r7 = r0.f36490E
            r8 = 2131304048(0x7f091e70, float:1.8226228E38)
            android.view.View r7 = r7.findViewById(r8)
            gy3.f0 r8 = new gy3.f0
            r8.<init>()
            android.view.View r9 = r0.f36490E
            r10 = 2131304031(0x7f091e5f, float:1.8226193E38)
            android.view.View r9 = r9.findViewById(r10)
            r8.f27484d = r9
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.text.TextPaint r9 = r9.getPaint()
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r9, r10)
            r9 = 2
            java.lang.String r10 = ""
            if (r2 == 0) goto L_0x00eb
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.ViewGroup r1 = r0.f166287d
            android.content.Context r1 = r1.getContext()
            r5 = 2131828212(0x7f111df4, float:1.9289358E38)
            java.lang.String r1 = r1.getString(r5)
            r6.setText(r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setVisibility(r4)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r2.objectDesc
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = r1.description
            if (r1 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r10 = r1
        L_0x0096:
            r0.mo12285i1(r10)
            T r1 = r8.f27484d
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            r6 = 2131828210(0x7f111df2, float:1.9289354E38)
            java.lang.String r5 = r5.getString(r6)
            r1.setText(r5)
            T r1 = r8.f27484d
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099940(0x7f060124, float:1.7812247E38)
            int r5 = r5.getColor(r6)
            r1.setTextColor(r5)
            T r1 = r8.f27484d
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131232532(0x7f080714, float:1.8081176E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r1.setBackground(r5)
            T r1 = r8.f27484d
            android.widget.TextView r1 = (android.widget.TextView) r1
            qj1.xf$l r5 = new qj1.xf$l
            r5.<init>(r2, r0)
            r1.setOnClickListener(r5)
            goto L_0x0200
        L_0x00eb:
            if (r1 == 0) goto L_0x0200
            T r11 = r8.f27484d
            java.lang.String r12 = "confirmBtn"
            gy3.C87412m.m108593f(r11, r12)
            android.view.View r11 = (android.view.View) r11
            java.lang.Class<l31.e> r12 = l31.C61212e.class
            di3.d r13 = di3.C86312j.m106911c(r12)
            l31.e r13 = (l31.C61212e) r13
            java.lang.String r14 = "live_reserve_live_end"
            r13.o30(r11, r14)
            di3.d r13 = di3.C86312j.m106911c(r12)
            l31.e r13 = (l31.C61212e) r13
            r14 = 25653(0x6435, float:3.5948E-41)
            r13.mo86175pO(r11, r4, r14)
            di3.d r13 = di3.C86312j.m106911c(r12)
            l31.e r13 = (l31.C61212e) r13
            r14 = 32
            r15 = 25652(0x6434, float:3.5946E-41)
            r13.mo86175pO(r11, r14, r15)
            di3.d r13 = di3.C86312j.m106911c(r12)
            l31.e r13 = (l31.C61212e) r13
            rx3.l[] r14 = new rx3.C13604l[r9]
            rx3.l r15 = new rx3.l
            java.lang.String r9 = "comment_scene"
            java.lang.String r4 = "temp_30"
            r15.<init>(r9, r4)
            r14[r5] = r15
            java.lang.String r4 = r1.f132122h
            rx3.l r9 = new rx3.l
            java.lang.String r15 = "live_notice_id"
            r9.<init>(r15, r4)
            r14[r3] = r9
            java.util.Map r4 = sx3.C90364q0.m113147f(r14)
            ok1.e r9 = ok1.C62042e.f176370a
            fj1.b r14 = r36.mo87684A0()
            java.util.Map r9 = r9.mo87011I(r14)
            java.util.Map r4 = sx3.C90364q0.m113149h(r4, r9)
            r13.mo86149PM(r11, r4)
            di3.d r4 = di3.C86312j.m106911c(r12)
            l31.e r4 = (l31.C61212e) r4
            qj1.bg r9 = new qj1.bg
            r9.<init>(r1)
            r4.E60(r11, r9)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.ViewGroup r4 = r0.f166287d
            android.content.Context r4 = r4.getContext()
            r9 = 2131828211(0x7f111df3, float:1.9289356E38)
            java.lang.String r4 = r4.getString(r9)
            r6.setText(r4)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setVisibility(r5)
            int r4 = r1.f132118d
            long r11 = (long) r4
            r13 = 1000(0x3e8, double:4.94E-321)
            long r17 = r11 * r13
            android.view.ViewGroup r4 = r0.f166287d
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131826421(0x7f1116f5, float:1.9285726E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            er1.j4 r16 = er1.C58739j4.f168176a
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            java.lang.String r11 = er1.C58739j4.m68254u(r16, r17, r19, r20, r21, r22)
            r9[r5] = r11
            java.lang.String r4 = r4.getString(r6, r9)
            r7.setText(r4)
            java.lang.String r4 = r1.f132121g
            if (r4 != 0) goto L_0x01a6
            r4 = r10
        L_0x01a6:
            r0.mo12285i1(r4)
            m12231l1(r1, r8, r0)
            T r4 = r8.f27484d
            android.widget.TextView r4 = (android.widget.TextView) r4
            qj1.xf$m r5 = new qj1.xf$m
            r5.<init>(r0, r1, r2, r8)
            r4.setOnClickListener(r5)
            java.lang.Class<ak1.w> r2 = ak1.C54116w.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            r16 = r2
            mr.m r16 = (p204mr.C61568m) r16
            ak1.k0 r17 = ak1.C0077k0.ExposeProfile
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154345o
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            java.lang.String r4 = r1.f132121g
            if (r4 != 0) goto L_0x01e6
            r27 = r10
            goto L_0x01e8
        L_0x01e6:
            r27 = r4
        L_0x01e8:
            r28 = 0
            java.lang.String r1 = r1.f132122h
            r29 = r1
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 30176(0x75e0, float:4.2286E-41)
            r35 = 0
            java.lang.String r22 = "temp_30"
            r18 = r2
            p204mr.C61568m.C61569a.m72263a(r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)
        L_0x0200:
            android.view.View r1 = r0.f36490E
            int r1 = r1.getVisibility()
            r2 = 8
            if (r1 != r2) goto L_0x022d
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r4 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r1 = r1.setDuration(r4)
            qj1.xf$n r2 = new qj1.xf$n
            r2.<init>(r0)
            r1.addListener(r2)
            qj1.xf$o r2 = new qj1.xf$o
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            r1.start()
        L_0x022d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12738xf.mo12286j1(te3.d51, com.tencent.mm.protocal.protobuf.FinderObject):boolean");
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C11078h hVar = this.f36493H.f15209n;
        if (hVar != null) {
            hVar.mo11216c();
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        if (mo14483f0() == 0) {
            this.f36493H.mo3248a();
            mo12278a1();
        }
    }

    /* renamed from: v0 */
    public void mo12287v0() {
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f36493H;
        C11078h hVar = finderLiveAfterPluginRecommendLiveView.f15209n;
        if (hVar != null) {
            hVar.detach();
        }
        finderLiveAfterPluginRecommendLiveView.f15209n = null;
        if (!this.f36497L) {
            long currentTimeMillis = System.currentTimeMillis() - this.f36496K;
            ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
            C66880s0 a = C54117x.m60830a();
            int i = (a == null || !a.f192141n) ? 0 : 1;
            FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
            String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
            String str = "";
            if (E == null) {
                E = str;
            }
            finderBroadcastPageOutStruct.mo1025t(E);
            finderBroadcastPageOutStruct.mo1026u("1002");
            if (i != 0) {
                str = "194";
            } else {
                String gK = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
                if (gK != null) {
                    str = gK;
                }
            }
            finderBroadcastPageOutStruct.mo1024s(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_scan", i);
            jSONObject.put("stayTime", String.valueOf(currentTimeMillis));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …g())\n        }.toString()");
            finderBroadcastPageOutStruct.mo1027v(C112551y.m153814n(jSONObject2, ",", ";", false));
            finderBroadcastPageOutStruct.mo86054n();
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22947, contextid = " + finderBroadcastPageOutStruct.f9773i + ", page_id = " + finderBroadcastPageOutStruct.f9769e + ", commentScene = " + finderBroadcastPageOutStruct.f9777m + ", pg_udf_kv = " + finderBroadcastPageOutStruct.f9776l);
            this.f36497L = true;
        }
    }
}
