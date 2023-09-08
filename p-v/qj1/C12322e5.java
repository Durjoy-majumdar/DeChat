package qj1;

import a14.C0000n0;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import cj1.C0536f1;
import cj1.C0540g1;
import cj1.C0555j3;
import cj1.C0567l3;
import cj1.C0581o5;
import cj1.C0588q5;
import cj1.C54795n5;
import cj1.C54845x3;
import cl1.C0668l;
import cl1.C0702z0;
import cl1.C54963d0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLayout;
import com.tencent.p014mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import com.tencent.p014mm.plugin.finder.view.C56589c7;
import com.tencent.p014mm.plugin.finder.view.C56594d7;
import com.tencent.p014mm.plugin.finder.view.C56600e7;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.file.XVFSFile;
import d14.C58052j1;
import d60.C58124b;
import de3.C75375u;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import ej1.C7692l;
import ej1.C7710r;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gg1.C32444a;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ht1.C98522w3;
import j20.C117292a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import jq3.C9507n;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kl1.C10333o;
import kl1.C10344t;
import kl1.C10346v;
import kl1.C10353y;
import kr0.C76630x0;
import ky2.C10432i;
import kz1.C46828m;
import l31.C61212e;
import my3.C61594j;
import ng1.C11161a;
import nj3.C76875f0;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import p50.C62193a;
import pe3.C89349b;
import qk1.C12806i0;
import rl1.C13022d0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C110826x0;
import sx3.C64175a0;
import sx3.C90363p0;
import te3.C22532vt0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C51828wg0;
import te3.C64295cs1;
import te3.C64311db1;
import te3.C64460j21;
import te3.C64669qy0;
import te3.C64797wa1;
import te3.C64874za1;
import te3.m74;
import vg1.C52891f;
import wk1.C15437l;
import wk1.C15439m;
import yg1.C16004c;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: qj1.e5 */
public final class C12322e5 extends C62660c implements C11161a {

    /* renamed from: Q0 */
    public static final float f35496Q0 = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3743cv);

    /* renamed from: W */
    public static final C12334g f35497W = new C12334g((C8480h) null);

    /* renamed from: X */
    public static final float f35498X = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp);

    /* renamed from: Y */
    public static final int f35499Y = 1;

    /* renamed from: Z */
    public static final int f35500Z = 2;

    /* renamed from: p0 */
    public static final int f35501p0 = 3;

    /* renamed from: x0 */
    public static final Set<Integer> f35502x0 = C110826x0.m151017e(168, 158, 161);

    /* renamed from: y0 */
    public static final Set<Integer> f35503y0 = C110826x0.m151017e(165, 166, 154, 155, 156);

    /* renamed from: A */
    public final C13601g f35504A;

    /* renamed from: B */
    public boolean f35505B;

    /* renamed from: C */
    public final C12806i0 f35506C;

    /* renamed from: D */
    public final C13601g f35507D;

    /* renamed from: E */
    public final C13601g f35508E;

    /* renamed from: F */
    public boolean f35509F;

    /* renamed from: G */
    public boolean f35510G = true;

    /* renamed from: H */
    public long f35511H;

    /* renamed from: I */
    public int f35512I;

    /* renamed from: J */
    public int f35513J;

    /* renamed from: K */
    public boolean f35514K = true;

    /* renamed from: L */
    public View f35515L;

    /* renamed from: M */
    public volatile boolean f35516M;

    /* renamed from: N */
    public final C13601g f35517N;

    /* renamed from: P */
    public final C13601g f35518P;

    /* renamed from: Q */
    public boolean f35519Q;

    /* renamed from: R */
    public boolean f35520R;

    /* renamed from: S */
    public final C13601g f35521S;

    /* renamed from: T */
    public int f35522T;

    /* renamed from: U */
    public int f35523U;

    /* renamed from: V */
    public volatile long f35524V;

    /* renamed from: p */
    public final C58124b f35525p;

    /* renamed from: q */
    public final ViewGroup f35526q;

    /* renamed from: r */
    public final ViewGroup f35527r;

    /* renamed from: s */
    public final TextView f35528s;

    /* renamed from: t */
    public final View f35529t;

    /* renamed from: u */
    public final FinderMaxSizeLayout f35530u;

    /* renamed from: v */
    public Float f35531v;

    /* renamed from: w */
    public boolean f35532w;

    /* renamed from: x */
    public boolean f35533x;

    /* renamed from: y */
    public boolean f35534y;

    /* renamed from: z */
    public boolean f35535z;

    /* renamed from: qj1.e5$a */
    public static final class C12323a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C12322e5 f35536a;

        public C12323a(C12322e5 e5Var) {
            this.f35536a = e5Var;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            boolean isShown = this.f35536a.mo12024f1().isShown();
            if (isShown && !this.f35536a.f35516M) {
                this.f35536a.f35506C.notifyDataSetChanged();
            }
            this.f35536a.f35516M = isShown;
        }
    }

    /* renamed from: qj1.e5$a0 */
    public static final class C12324a0 extends C87413o implements C32226l<C0581o5, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f35537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12324a0(String str) {
            super(1);
            this.f35537d = str;
        }

        public Object invoke(Object obj) {
            C0581o5 o5Var = (C0581o5) obj;
            return Boolean.valueOf(Util.isEqual(o5Var.getContent(), this.f35537d) && Util.isEqual(o5Var.mo571e(), C75592q0.m90789s()));
        }
    }

    /* renamed from: qj1.e5$b0 */
    public static final class C12325b0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12325b0(C12322e5 e5Var) {
            super(0);
            this.f35538d = e5Var;
        }

        public Object invoke() {
            C12322e5 e5Var = this.f35538d;
            C12806i0 i0Var = e5Var.f35506C;
            List<C0581o5> list = ((C0702z0) e5Var.mo87696x0(C0702z0.class)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            i0Var.getClass();
            i0Var.f36654g.clear();
            i0Var.f36654g.addAll(list);
            this.f35538d.f35506C.notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$c */
    public static final class C12326c extends C87413o implements C32228q<C0581o5, View, C9507n, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12326c(C12322e5 e5Var) {
            super(3);
            this.f35539d = e5Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C0581o5 o5Var = (C0581o5) obj;
            View view = (View) obj2;
            C9507n nVar = (C9507n) obj3;
            C87412m.m108594g(o5Var, "msg");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(nVar, "holder");
            C52891f fVar = C52891f.f147704a;
            C0000n0 n0Var = nVar.f29679z;
            C45795b A0 = this.f35539d.mo87684A0();
            Context context = this.f35539d.f166287d.getContext();
            C87412m.m108593f(context, "this.root.context");
            fVar.mo73656f(n0Var, o5Var, view, A0, context);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$c0 */
    public static final class C12327c0 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12327c0 f35540d = new C12327c0();

        public C12327c0() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C62042e.f176370a.mo87027N0() ? 17 : 15);
        }
    }

    /* renamed from: qj1.e5$d */
    public static final class C12328d extends C87413o implements C32228q<C0581o5, View, C9507n, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12328d(C12322e5 e5Var) {
            super(3);
            this.f35541d = e5Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C0581o5 o5Var = (C0581o5) obj;
            View view = (View) obj2;
            C9507n nVar = (C9507n) obj3;
            C87412m.m108594g(o5Var, "msg");
            C87412m.m108594g(view, "likeRootView");
            C87412m.m108594g(nVar, "holder");
            if (view.getVisibility() == 0) {
                C52891f fVar = C52891f.f147704a;
                C0000n0 n0Var = nVar.f29679z;
                C45795b A0 = this.f35541d.mo87684A0();
                Context context = this.f35541d.f166287d.getContext();
                C87412m.m108593f(context, "this.root.context");
                fVar.mo73656f(n0Var, o5Var, view, A0, context);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$d0 */
    public static final class C12329d0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35542d;

        /* renamed from: e */
        public final /* synthetic */ int f35543e;

        public C12329d0(C12322e5 e5Var, int i) {
            this.f35542d = e5Var;
            this.f35543e = i;
        }

        public final void run() {
            this.f35542d.mo12021c1(Boolean.TRUE, this.f35543e);
            this.f35542d.getClass();
            C41573e3.f111902a.mo64658a();
            ((C0702z0) this.f35542d.mo87696x0(C0702z0.class)).f1681r = false;
        }
    }

    /* renamed from: qj1.e5$e */
    public static final class C12330e extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35544d;

        public C12330e(C12322e5 e5Var) {
            this.f35544d = e5Var;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            int i4;
            Class cls = C0702z0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = this.f35544d.mo12024f1().getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int E = ((LinearLayoutManager) layoutManager).mo16959E();
            ((C0702z0) this.f35544d.mo87696x0(cls)).f1677n = E;
            RecyclerView.LayoutManager layoutManager2 = this.f35544d.mo12024f1().getLayoutManager();
            C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((C0702z0) this.f35544d.mo87696x0(cls)).f1678o = ((LinearLayoutManager) layoutManager2).mo16957C();
            FinderLiveService.f159376d.getClass();
            if (E < FinderLiveService.f159350C - 1) {
                C12322e5 e5Var = this.f35544d;
                long j = (long) (E + 1);
                long j2 = e5Var.f35511H;
                if (j < j2) {
                    j = j2;
                }
                e5Var.f35511H = j;
            } else {
                C12322e5 e5Var2 = this.f35544d;
                e5Var2.f35511H = ((C54991o) e5Var2.mo87696x0(C54991o.class)).f154257T0;
            }
            boolean z = false;
            if (E == this.f35544d.f35506C.getItemCount() - 1) {
                this.f35544d.mo12027i1();
                this.f35544d.f35505B = false;
            }
            C0540g1 c3 = ((C16004c) this.f35544d.mo87684A0().mo71262a(C16004c.class)).mo14629c3();
            C45795b A0 = this.f35544d.mo87684A0();
            int i5 = ((C0702z0) this.f35544d.mo87696x0(cls)).f1678o;
            c3.getClass();
            C87412m.m108594g(A0, "buContext");
            long nowMilliSecond = Util.nowMilliSecond() - c3.f1311b;
            if (c3.f1315f) {
                c3.f1315f = Util.nowMilliSecond() - c3.f1311b < ((long) c3.mo590a());
            }
            boolean z2 = c3.f1315f && i5 >= (i4 = c3.f1312c) && i4 > 0;
            Log.m105926v("Finder.FinderLiveCommentStickyHelper", "checkSticky needSticky:" + z2 + " curVisiableFirstPosition:" + ((C0702z0) A0.mo71262a(cls)).f1678o + " targetStickyCommentMsgIndex:" + c3.f1312c);
            if (!z2) {
                if (c3.f1314e && !c3.f1316g && i5 < (i3 = c3.f1312c)) {
                    c3.f1314e = false;
                    C32227p<? super Integer, ? super Boolean, C13598b0> pVar = c3.f1317h;
                    if (pVar != null) {
                        pVar.invoke(Integer.valueOf(i3), Boolean.TRUE);
                    }
                }
                c3.f1316g = false;
            } else if (!c3.f1314e) {
                List<C0581o5> list = ((C0702z0) A0.mo71262a(cls)).f1672f;
                int i6 = c3.f1312c;
                int type = (i6 < 0 || i6 >= list.size()) ? Integer.MIN_VALUE : list.get(c3.f1312c).getType();
                if (type == 20031) {
                    z = true;
                }
                if (z) {
                    long j3 = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                    if (((long) c3.mo590a()) - nowMilliSecond >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                        j3 = ((long) c3.mo590a()) - nowMilliSecond;
                    }
                    Log.m105924i("Finder.FinderLiveCommentStickyHelper", "checkSticky do sticky stickyTime:" + j3 + " needStickyTime:" + c3.mo590a());
                    String content = list.get(c3.f1312c).getContent();
                    if (content != null) {
                        c3.f1316g = true;
                        c3.f1314e = true;
                        C32227p<? super String, ? super Integer, C13598b0> pVar2 = c3.f1318i;
                        if (pVar2 != null) {
                            pVar2.invoke(content, Integer.valueOf(c3.f1312c));
                        }
                    }
                    C61926c.m72666K(j3, new C0536f1(c3));
                } else {
                    Log.m105928w("Finder.FinderLiveCommentStickyHelper", "checkSticky unexpected else. targetStickyCommentMsgIndex:" + c3.f1312c + " targetMsgType:" + type);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: qj1.e5$e0 */
    public static final class C12331e0 extends C87413o implements C32226l<C0581o5, Boolean> {

        /* renamed from: d */
        public static final C12331e0 f35545d = new C12331e0();

        public C12331e0() {
            super(1);
        }

        public Object invoke(Object obj) {
            C0581o5 o5Var = (C0581o5) obj;
            C87412m.m108594g(o5Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(o5Var.getType() == 20019);
        }
    }

    /* renamed from: qj1.e5$f */
    public static final class C12332f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35546d;

        public C12332f(C12322e5 e5Var) {
            this.f35546d = e5Var;
        }

        public final void onClick(View view) {
            List<T> m0;
            T t;
            Class cls = C0702z0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12322e5 e5Var = this.f35546d;
            e5Var.f35505B = false;
            e5Var.mo12027i1();
            if (((C0702z0) this.f35546d.mo87696x0(cls)).f1681r) {
                List<C0581o5> list = ((C0702z0) this.f35546d.mo87696x0(cls)).f1672f;
                C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
                C61594j jVar = new C61594j(((C0702z0) this.f35546d.mo87696x0(cls)).f1677n, ((C0702z0) this.f35546d.mo87696x0(cls)).f1672f.size() - 1);
                synchronized (list) {
                    m0 = C110818d0.m150941m0(list, jVar);
                }
                synchronized (m0) {
                    Iterator<T> it = m0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        C0581o5 o5Var = (C0581o5) t;
                        C62042e eVar = C62042e.f176370a;
                        C87412m.m108593f(o5Var, LocaleUtil.ITALIAN);
                        if (eVar.mo87108q(o5Var)) {
                            break;
                        }
                    }
                }
                C0581o5 o5Var2 = (C0581o5) t;
                if (o5Var2 != null) {
                    C12322e5 e5Var2 = this.f35546d;
                    int indexOf = ((C0702z0) e5Var2.mo87696x0(cls)).f1672f.indexOf(o5Var2);
                    if (indexOf != -1) {
                        C7335d c = C86312j.m106911c(C54116w.class);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w wVar = (C54116w) c;
                        String e = o5Var2.mo571e();
                        if (e == null) {
                            e = "";
                        }
                        wVar.zy0(e, 0, "");
                        WxRecyclerView f1 = e5Var2.mo12024f1();
                        if (indexOf < 0) {
                            indexOf = 0;
                        }
                        int itemCount = e5Var2.f35506C.getItemCount() - 1;
                        if (indexOf > itemCount) {
                            indexOf = itemCount;
                        }
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(indexOf));
                        WxRecyclerView wxRecyclerView = f1;
                        C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$7", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                        f1.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$7", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                    } else {
                        C12322e5.m11876d1(e5Var2, (Boolean) null, 0, 3, (Object) null);
                    }
                }
                ((C0702z0) this.f35546d.mo87696x0(cls)).f1681r = false;
            } else {
                C12322e5.m11876d1(this.f35546d, (Boolean) null, 0, 3, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.e5$f0 */
    public static final class C12333f0 implements C54258u {

        /* renamed from: a */
        public final /* synthetic */ C12322e5 f35547a;

        /* renamed from: b */
        public final /* synthetic */ List<C0581o5> f35548b;

        /* renamed from: c */
        public final /* synthetic */ C8478d0 f35549c;

        public C12333f0(C12322e5 e5Var, List<C0581o5> list, C8478d0 d0Var) {
            this.f35547a = e5Var;
            this.f35548b = list;
            this.f35549c = d0Var;
        }

        /* renamed from: a */
        public void mo2860a(int i, int i2) {
            this.f35547a.f35506C.f36654g.clear();
            this.f35547a.f35506C.f36654g.addAll(this.f35548b);
            try {
                this.f35547a.f35506C.notifyItemRangeRemoved(i, i2);
            } catch (Exception e) {
                Log.m105924i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeRemoved, err = " + e.getMessage());
            }
        }

        /* renamed from: b */
        public void mo2861b(int i, int i2) {
            this.f35549c.f27483d = i2;
            this.f35547a.f35506C.f36654g.clear();
            this.f35547a.f35506C.f36654g.addAll(this.f35548b);
            try {
                this.f35547a.f35506C.notifyItemRangeInserted(i, i2);
            } catch (Exception e) {
                Log.m105924i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeInserted, err = " + e.getMessage());
            }
        }

        /* renamed from: c */
        public void mo2862c(int i, int i2, Object obj) {
            this.f35547a.f35506C.f36654g.clear();
            this.f35547a.f35506C.f36654g.addAll(this.f35548b);
            try {
                this.f35547a.f35506C.notifyItemRangeChanged(i, i2, 1);
            } catch (Exception e) {
                Log.m105924i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeChanged, err = " + e.getMessage());
            }
        }

        /* renamed from: d */
        public void mo2863d(int i, int i2) {
            try {
                this.f35547a.f35506C.notifyItemMoved(i, i2);
            } catch (Exception e) {
                Log.m105924i("Finder.LiveCommentPlugin", "[updateComments] notifyItemMoved, err = " + e.getMessage());
            }
        }
    }

    /* renamed from: qj1.e5$g */
    public static final class C12334g {
        public C12334g(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo12039a() {
            return (int) ((((double) C75044y4.m89990b(MMApplicationContext.getContext()).x) * 0.5d) - ((double) C12322e5.f35496Q0));
        }
    }

    /* renamed from: qj1.e5$g0 */
    public static final class C12335g0 extends C54248l.C54250b {

        /* renamed from: a */
        public final /* synthetic */ C12322e5 f35550a;

        /* renamed from: b */
        public final /* synthetic */ List<C0581o5> f35551b;

        public C12335g0(C12322e5 e5Var, List<C0581o5> list) {
            this.f35550a = e5Var;
            this.f35551b = list;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            C0581o5 o5Var = (C0581o5) C110818d0.m150917O(this.f35551b, i2);
            return !(o5Var instanceof C0588q5) || !((C0588q5) o5Var).mo569c();
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            return C87412m.m108589b(C110818d0.m150917O(this.f35550a.f35506C.f36654g, i), C110818d0.m150917O(this.f35551b, i2));
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f35551b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f35550a.f35506C.f36654g.size();
        }
    }

    /* renamed from: qj1.e5$h */
    public static final class C12336h implements C32227p<Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public SoftReference<C12322e5> f35552d;

        public C12336h(SoftReference<C12322e5> softReference) {
            this.f35552d = softReference;
        }

        public Object invoke(Object obj, Object obj2) {
            C12322e5 e5Var;
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            SoftReference<C12322e5> softReference = this.f35552d;
            if (!(softReference == null || (e5Var = softReference.get()) == null)) {
                boolean z = !booleanValue;
                e5Var.mo12024f1().post(new C12516m5(intValue, e5Var));
                if (!z) {
                    View view = e5Var.f35529t;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "unDoDescSticky", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "unDoDescSticky", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view3 = e5Var.f35529t;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500);
                    alphaAnimation.setAnimationListener(new C12542n5(e5Var));
                    view3.startAnimation(alphaAnimation);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$h0 */
    public static final class C12337h0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<C0581o5> f35553d;

        /* renamed from: e */
        public final /* synthetic */ C12322e5 f35554e;

        /* renamed from: qj1.e5$h0$a */
        public static final class C12338a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C12322e5 f35555d;

            public C12338a(C12322e5 e5Var) {
                this.f35555d = e5Var;
            }

            public final void run() {
                C12322e5.m11876d1(this.f35555d, (Boolean) null, 0, 3, (Object) null);
            }
        }

        public C12337h0(List<C0581o5> list, C12322e5 e5Var) {
            this.f35553d = list;
            this.f35554e = e5Var;
        }

        public final void run() {
            Class cls = C0702z0.class;
            ArrayList arrayList = new ArrayList();
            List<C0581o5> list = this.f35553d;
            synchronized (list) {
                arrayList.addAll(list);
            }
            this.f35554e.mo12034q1(arrayList);
            C12322e5 e5Var = this.f35554e;
            e5Var.f35511H = ((C0702z0) e5Var.mo87696x0(cls)).f1680q;
            boolean z = ((C0702z0) this.f35554e.mo87696x0(cls)).f1679p;
            int i = ((C0702z0) this.f35554e.mo87696x0(cls)).f1678o;
            long j = ((C54991o) this.f35554e.mo87696x0(C54991o.class)).f154257T0 - this.f35554e.f35511H;
            Log.m105924i("Finder.LiveCommentPlugin", "[updateMessagesOnViewAttach] readCount:" + this.f35554e.f35511H + ", unreadCount" + j + ",reachLast" + z + ", position" + i);
            if (this.f35554e.f35506C.getItemCount() <= 0) {
                return;
            }
            if (z) {
                this.f35554e.mo12024f1().post(new C12338a(this.f35554e));
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.f35554e.f35506C.getItemCount()) {
                i = this.f35554e.f35506C.getItemCount() - 1;
            }
            WxRecyclerView f1 = this.f35554e.mo12024f1();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            WxRecyclerView wxRecyclerView = f1;
            C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateMessagesOnViewAttach$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            f1.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateMessagesOnViewAttach$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            this.f35554e.mo12031n1(j);
        }
    }

    /* renamed from: qj1.e5$i */
    public static final class C12339i implements C32227p<String, Integer, C13598b0> {

        /* renamed from: d */
        public SoftReference<C12322e5> f35556d;

        public C12339i(SoftReference<C12322e5> softReference) {
            this.f35556d = softReference;
        }

        public Object invoke(Object obj, Object obj2) {
            C12322e5 e5Var;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g((String) obj, "content");
            SoftReference<C12322e5> softReference = this.f35556d;
            if (!(softReference == null || (e5Var = softReference.get()) == null)) {
                C7710r rVar = new C7710r(e5Var.mo87684A0());
                Context context = e5Var.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                C12806i0.C12807a aVar = new C12806i0.C12807a(e5Var.f35529t);
                C0581o5 o5Var = e5Var.f35506C.f36654g.get(intValue);
                C87412m.m108593f(o5Var, "commentAdapter.commentList[pos]");
                rVar.mo8830p(context, aVar, o5Var, intValue, true);
                View view = e5Var.f35529t;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "doDescSticky", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "doDescSticky", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e5Var.mo12024f1().post(new C12516m5(intValue, e5Var));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$j */
    public static final class C12340j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12340j(ViewGroup viewGroup) {
            super(0);
            this.f35557d = viewGroup;
        }

        public Object invoke() {
            return Integer.valueOf((int) this.f35557d.getContext().getResources().getDimension(C0966R.dimen.f3707bz));
        }
    }

    /* renamed from: qj1.e5$k */
    public static final class C12341k extends C87413o implements C32224a<C10333o> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35558d;

        /* renamed from: e */
        public final /* synthetic */ C12322e5 f35559e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12341k(ViewGroup viewGroup, C12322e5 e5Var) {
            super(0);
            this.f35558d = viewGroup;
            this.f35559e = e5Var;
        }

        public Object invoke() {
            View findViewById = this.f35558d.findViewById(C0966R.C0970id.f358113dh2);
            C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_bullet_comment)");
            return new C10333o((ViewGroup) findViewById, this.f35559e);
        }
    }

    /* renamed from: qj1.e5$l */
    public static final class C12342l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35560d;

        public C12342l(C12322e5 e5Var) {
            this.f35560d = e5Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderMaxSizeLayout finderMaxSizeLayout = this.f35560d.f35530u;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            finderMaxSizeLayout.mo3347b(((Integer) animatedValue).intValue(), false);
            this.f35560d.f35530u.requestLayout();
        }
    }

    /* renamed from: qj1.e5$m */
    public static final class C12343m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12343m(C12322e5 e5Var) {
            super(0);
            this.f35561d = e5Var;
        }

        public Object invoke() {
            this.f35561d.f35530u.requestLayout();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$n */
    public static final class C12344n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12344n(C12322e5 e5Var) {
            super(0);
            this.f35562d = e5Var;
        }

        public Object invoke() {
            this.f35562d.mo12024f1().setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e5$o */
    public static final class C12345o extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35563d;

        /* renamed from: e */
        public final /* synthetic */ C12322e5 f35564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12345o(ViewGroup viewGroup, C12322e5 e5Var) {
            super(0);
            this.f35563d = viewGroup;
            this.f35564e = e5Var;
        }

        public Object invoke() {
            View findViewById = this.f35563d.findViewById(C0966R.C0970id.djn);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
            WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById;
            wxRecyclerView.mo17043c(new C12421g5(this.f35564e));
            if (!this.f35564e.mo82893g0()) {
                wxRecyclerView.setOnTouchListener(new C12436h5(this.f35564e));
            }
            return wxRecyclerView;
        }
    }

    /* renamed from: qj1.e5$p */
    public static final class C12346p extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12346p(C12322e5 e5Var) {
            super(0);
            this.f35565d = e5Var;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C12447i5(this.f35565d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: qj1.e5$q */
    public static final class C12347q extends C87413o implements C32224a<C10346v> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35566d;

        /* renamed from: e */
        public final /* synthetic */ C12322e5 f35567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12347q(ViewGroup viewGroup, C12322e5 e5Var) {
            super(0);
            this.f35566d = viewGroup;
            this.f35567e = e5Var;
        }

        public Object invoke() {
            View findViewById = this.f35566d.findViewById(C0966R.C0970id.nuk);
            C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_hot_comment_ui)");
            return new C10346v((ViewGroup) findViewById, this.f35567e);
        }
    }

    /* renamed from: qj1.e5$r */
    public static final class C12348r<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35568d;

        public C12348r(C12322e5 e5Var) {
            this.f35568d = e5Var;
        }

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C12322e5 e5Var = this.f35568d;
            if (e5Var.mo82893g0()) {
                int i = FinderMaxSizeLayout.f15300n;
                e5Var.f35530u.mo3347b((int) (((double) C75044y4.m89990b(MMApplicationContext.getContext()).y) * 0.3d), true);
                return;
            }
            Log.m105924i("Finder.LiveCommentPlugin", "[commentHeightChange] reInitHeight change");
            ((C0702z0) e5Var.mo87684A0().mo71262a(C0702z0.class)).f1686w.postValue(null);
        }
    }

    /* renamed from: qj1.e5$s */
    public static final class C12349s<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35569d;

        public C12349s(C12322e5 e5Var) {
            this.f35569d = e5Var;
        }

        public void onChanged(Object obj) {
            C22532vt0 vt02 = (C22532vt0) obj;
            C10346v vVar = (C10346v) ((C36570n) this.f35569d.f35508E).getValue();
            C87412m.m108593f(vt02, LocaleUtil.ITALIAN);
            vVar.getClass();
            if (vt02.f64667g >= vt02.f64668h) {
                String str = vVar.f31514c;
                Log.m105924i(str, "[show] return. info = " + C61937h.m72709h(vt02));
                return;
            }
            String str2 = vt02.f64665e;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 10) {
                StringBuilder sb = new StringBuilder();
                String substring = str2.substring(0, 10);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("...");
                str2 = sb.toString();
            }
            if (!C87412m.m108589b(str2, ((TextView) ((C36570n) vVar.f31515d).getValue()).getText())) {
                vVar.mo10644e();
            }
            ((TextView) ((C36570n) vVar.f31515d).getValue()).setText(str2);
            int i = vt02.f64667g;
            if (C110823p.m151009y(vVar.f31518g, Integer.valueOf(i)) && i - 1 < 1) {
                i = 1;
            }
            if (vVar.f31523l.isEmpty()) {
                FinderLiveGiftTextView d = vVar.mo10643d();
                StringBuilder sb4 = new StringBuilder();
                sb4.append('x');
                sb4.append(i);
                d.setText(sb4.toString());
                vVar.mo10642c(vt02.f64667g + 1, vt02.f64668h);
                vVar.mo10643d().post(new C10353y(vVar));
                return;
            }
            List<Integer> list = vVar.f31523l;
            C87412m.m108593f(list, "cntQueue");
            Integer num = (Integer) C110818d0.m150923U(list);
            int i2 = vt02.f64668h;
            C87412m.m108593f(num, "currentToCnt");
            if (i2 >= num.intValue()) {
                int i3 = vt02.f64667g;
                int intValue = num.intValue() + 1;
                if (i3 < intValue) {
                    i3 = intValue;
                }
                vVar.mo10642c(i3, vt02.f64668h);
            }
        }
    }

    /* renamed from: qj1.e5$t */
    public static final class C12350t<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35570d;

        public C12350t(C12322e5 e5Var) {
            this.f35570d = e5Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
            if ((((cl1.C55001u) r5.mo71262a(cl1.C55001u.class)).f154420q.f182405s == 5) != false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0152, code lost:
            if (r7.f35523U >= r7.mo12026h1()) goto L_0x0154;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0071, code lost:
            r0 = r0.f169896a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0207  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x021b  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0258  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0293  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0320  */
        /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Integer r11 = (java.lang.Integer) r11
                java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
                qj1.e5 r1 = r10.f35570d
                boolean r1 = r1.mo82893g0()
                r2 = 1
                java.lang.String r3 = "Finder.LiveCommentPlugin"
                if (r1 == 0) goto L_0x0032
                java.lang.String r11 = "[commentHeightChange] isLandscape = true"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
                qj1.e5 r11 = r10.f35570d
                com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout r11 = r11.f35530u
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
                int r0 = r0.y
                double r0 = (double) r0
                r3 = 4599075939470750515(0x3fd3333333333333, double:0.3)
                double r0 = r0 * r3
                int r0 = (int) r0
                int r1 = com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLayout.f15300n
                r11.mo3347b(r0, r2)
                goto L_0x0331
            L_0x0032:
                er1.k r1 = er1.C45684k.f123488a
                qj1.e5 r4 = r10.f35570d
                fj1.b r4 = r4.mo87684A0()
                boolean r1 = r1.mo71181b(r4)
                qj1.e5 r4 = r10.f35570d
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r4 = r4.mo87696x0(r5)
                cl1.o r4 = (cl1.C54991o) r4
                boolean r4 = r4.mo75960G3()
                qj1.e5 r5 = r10.f35570d
                androidx.lifecycle.i0 r5 = r5.mo87696x0(r0)
                cl1.d0 r5 = (cl1.C54963d0) r5
                java.util.List r5 = r5.mo75929l3()
                int r5 = r5.size()
                r6 = 0
                if (r5 > 0) goto L_0x0080
                qj1.e5 r5 = r10.f35570d
                androidx.lifecycle.i0 r0 = r5.mo87696x0(r0)
                cl1.d0 r0 = (cl1.C54963d0) r0
                com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r0 = r0.f154077t
                java.lang.Object r0 = r0.getValue()
                gi1.c r0 = (gi1.C59464c) r0
                if (r0 == 0) goto L_0x007a
                java.util.LinkedList<gi1.a> r0 = r0.f169896a
                if (r0 == 0) goto L_0x007a
                int r0 = r0.size()
                goto L_0x007b
            L_0x007a:
                r0 = 0
            L_0x007b:
                if (r0 <= r2) goto L_0x007e
                goto L_0x0080
            L_0x007e:
                r0 = 0
                goto L_0x0081
            L_0x0080:
                r0 = 1
            L_0x0081:
                ok1.e r5 = ok1.C62042e.f176370a
                boolean r5 = r5.mo87030O0()
                if (r5 != 0) goto L_0x00b6
                if (r4 != 0) goto L_0x00b6
                i50.a r5 = i50.C60251a.f171781k1
                if (r5 == 0) goto L_0x0091
                r5 = 1
                goto L_0x0092
            L_0x0091:
                r5 = 0
            L_0x0092:
                if (r5 == 0) goto L_0x00b4
                qj1.e5 r5 = r10.f35570d
                fj1.b r5 = r5.mo87684A0()
                java.lang.String r7 = "liveData"
                gy3.C87412m.m108594g(r5, r7)
                java.lang.Class<cl1.u> r7 = cl1.C55001u.class
                androidx.lifecycle.i0 r5 = r5.mo71262a(r7)
                cl1.u r5 = (cl1.C55001u) r5
                te3.c21 r5 = r5.f154420q
                int r5 = r5.f182405s
                r7 = 5
                if (r5 != r7) goto L_0x00b0
                r5 = 1
                goto L_0x00b1
            L_0x00b0:
                r5 = 0
            L_0x00b1:
                if (r5 == 0) goto L_0x00b4
                goto L_0x00b6
            L_0x00b4:
                r5 = 0
                goto L_0x00b7
            L_0x00b6:
                r5 = 1
            L_0x00b7:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "[commentHeightChange] height = "
                r7.append(r8)
                r7.append(r11)
                java.lang.String r8 = "，screenHeight:"
                r7.append(r8)
                qj1.e5 r8 = r10.f35570d
                int r8 = r8.mo12026h1()
                r7.append(r8)
                java.lang.String r8 = ", isBoxLiveNow:"
                r7.append(r8)
                r7.append(r1)
                java.lang.String r8 = ", isAudioMode:"
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = ", isLinkMic:"
                r7.append(r4)
                r7.append(r0)
                java.lang.String r4 = ", isPortraitFullScreen:"
                r7.append(r4)
                r7.append(r5)
                java.lang.String r4 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                if (r11 == 0) goto L_0x0104
                int r4 = r11.intValue()
                if (r4 > 0) goto L_0x0104
                goto L_0x0331
            L_0x0104:
                qj1.e5 r4 = r10.f35570d
                if (r11 == 0) goto L_0x010d
                int r11 = r11.intValue()
                goto L_0x010f
            L_0x010d:
                int r11 = r4.f35523U
            L_0x010f:
                r4.f35523U = r11
                qj1.e5 r11 = r10.f35570d
                int r4 = r11.f35523U
                if (r4 > 0) goto L_0x011e
                java.lang.String r11 = "mLastPlayerViewBottom == 0, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
                goto L_0x0331
            L_0x011e:
                int r11 = r11.mo14483f0()
                if (r11 == 0) goto L_0x012b
                java.lang.String r11 = "clear Screen now, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
                goto L_0x0331
            L_0x012b:
                if (r1 == 0) goto L_0x0142
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                android.content.Context r11 = r11.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r4 = 2131165351(0x7f0700a7, float:1.7944917E38)
                float r11 = r11.getDimension(r4)
                int r11 = (int) r11
                goto L_0x0143
            L_0x0142:
                r11 = 0
            L_0x0143:
                r4 = 2131165346(0x7f0700a2, float:1.7944907E38)
                if (r0 != 0) goto L_0x0164
                if (r5 != 0) goto L_0x0154
                qj1.e5 r7 = r10.f35570d
                int r8 = r7.f35523U
                int r7 = r7.mo12026h1()
                if (r8 < r7) goto L_0x0164
            L_0x0154:
                qj1.e5 r7 = r10.f35570d
                r7.f35535z = r2
                int r7 = r7.mo12026h1()
                if (r5 == 0) goto L_0x0160
                r5 = 2
                goto L_0x0161
            L_0x0160:
                r5 = 3
            L_0x0161:
                int r7 = r7 / r5
                int r7 = r7 - r11
                goto L_0x0183
            L_0x0164:
                qj1.e5 r5 = r10.f35570d
                r5.f35535z = r6
                int r5 = r5.mo12026h1()
                qj1.e5 r7 = r10.f35570d
                int r8 = r7.f35523U
                int r5 = r5 - r8
                int r5 = r5 - r11
                android.view.ViewGroup r11 = r7.f166287d
                android.content.Context r11 = r11.getContext()
                android.content.res.Resources r11 = r11.getResources()
                float r11 = r11.getDimension(r4)
                int r11 = (int) r11
                int r7 = r5 - r11
            L_0x0183:
                qj1.e5 r11 = r10.f35570d
                int r11 = r11.mo12026h1()
                int r11 = r11 / 4
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "[commentHeightChange], mLastPlayerViewBottom = "
                r5.append(r8)
                qj1.e5 r8 = r10.f35570d
                int r8 = r8.f35523U
                r5.append(r8)
                java.lang.String r8 = ", mimTargetHeight = "
                r5.append(r8)
                r5.append(r11)
                java.lang.String r8 = ", targetHeight = "
                r5.append(r8)
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r9 = " -> "
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r5.<init>(r8)
                if (r7 >= r11) goto L_0x01cc
                r7 = r11
            L_0x01cc:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
                r5.append(r11)
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                android.content.Context r11 = r11.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r8 = 2131165359(0x7f0700af, float:1.7944933E38)
                float r11 = r11.getDimension(r8)
                int r11 = (int) r11
                int r7 = r7 - r11
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
                r5.append(r11)
                if (r0 == 0) goto L_0x021b
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                android.content.Context r11 = r11.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r0 = 2131165307(0x7f07007b, float:1.7944827E38)
                float r11 = r11.getDimension(r0)
                goto L_0x022b
            L_0x021b:
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                android.content.Context r11 = r11.getContext()
                android.content.res.Resources r11 = r11.getResources()
                float r11 = r11.getDimension(r4)
            L_0x022b:
                int r11 = (int) r11
                int r7 = r7 - r11
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
                r5.append(r11)
                qj1.e5 r11 = r10.f35570d
                java.lang.Class<qj1.dd> r0 = qj1.C62712dd.class
                qj1.c r11 = r11.mo87687E0(r0)
                qj1.dd r11 = (qj1.C62712dd) r11
                if (r11 == 0) goto L_0x0253
                int r11 = r11.mo14483f0()
                if (r11 != 0) goto L_0x0253
                r11 = 1
                goto L_0x0254
            L_0x0253:
                r11 = 0
            L_0x0254:
                java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
                if (r11 == 0) goto L_0x0293
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                gy3.C87412m.m108592e(r11, r0)
                android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
                qj1.e5 r0 = r10.f35570d
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r4 = 2131165281(0x7f070061, float:1.7944775E38)
                float r0 = r0.getDimension(r4)
                int r0 = (int) r0
                r11.bottomMargin = r0
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                r11.requestLayout()
                qj1.e5 r11 = r10.f35570d
                rx3.g r11 = r11.f35518P
                rx3.n r11 = (rx3.C36570n) r11
                java.lang.Object r11 = r11.getValue()
                java.lang.Number r11 = (java.lang.Number) r11
                int r6 = r11.intValue()
                goto L_0x02be
            L_0x0293:
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                gy3.C87412m.m108592e(r11, r0)
                android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
                qj1.e5 r0 = r10.f35570d
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131165324(0x7f07008c, float:1.7944862E38)
                float r0 = r0.getDimension(r2)
                int r0 = (int) r0
                r11.bottomMargin = r0
                qj1.e5 r11 = r10.f35570d
                android.view.ViewGroup r11 = r11.f166287d
                r11.requestLayout()
                r2 = 0
            L_0x02be:
                int r11 = r7 - r6
                java.lang.String r0 = java.lang.String.valueOf(r11)
                r5.append(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "[commentHeightChange] targetHeightChangLog: "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "[commentHeightChange] final targetHeight = "
                r0.append(r4)
                r0.append(r11)
                java.lang.String r4 = ", screenHeight = "
                r0.append(r4)
                qj1.e5 r4 = r10.f35570d
                int r4 = r4.mo12026h1()
                r0.append(r4)
                java.lang.String r4 = "， curBubbleVisible = $"
                r0.append(r4)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                qj1.e5 r0 = r10.f35570d
                r0.f35512I = r7
                r0.f35513J = r11
                com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout r0 = r0.f35530u
                r2 = r1 ^ 1
                r0.mo3347b(r11, r2)
                qj1.e5 r0 = r10.f35570d
                com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout r0 = r0.f35530u
                r0.requestLayout()
                qj1.e5 r0 = r10.f35570d
                int r2 = r0.f35522T
                if (r2 == r11) goto L_0x0331
                r0.f35522T = r11
                if (r1 == 0) goto L_0x0331
                java.lang.Class<lg1.h> r11 = lg1.C46854h.class
                qj1.c r11 = r0.mo87687E0(r11)
                lg1.h r11 = (lg1.C46854h) r11
                if (r11 == 0) goto L_0x0331
                r11.mo72062Z0()
            L_0x0331:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12322e5.C12350t.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: qj1.e5$u */
    public static final class C12351u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35571d;

        public C12351u(C12322e5 e5Var) {
            this.f35571d = e5Var;
        }

        public final void run() {
            ((C16004c) this.f35571d.mo87684A0().mo71262a(C16004c.class)).f43064j = C12322e5.f35497W.mo12039a();
        }
    }

    /* renamed from: qj1.e5$v */
    public static final class C12352v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35572d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f35573e;

        /* renamed from: f */
        public final /* synthetic */ Object f35574f;

        /* renamed from: g */
        public final /* synthetic */ long f35575g;

        public C12352v(C12322e5 e5Var, Bundle bundle, Object obj, long j) {
            this.f35572d = e5Var;
            this.f35573e = bundle;
            this.f35574f = obj;
            this.f35575g = j;
        }

        public final void run() {
            if (!this.f35572d.mo87688G0()) {
                C54795n5 D0 = this.f35572d.mo14476D0();
                if (D0 != null) {
                    D0.mo75705I(this.f35573e, this.f35574f, "PORTRAIT_ACTION_KEY_FINDER_USERNAME");
                    return;
                }
                return;
            }
            Log.m105924i("Finder.LiveCommentPlugin", "goToFinderProfileImpl delayMs:" + this.f35575g + ",isFinished!");
        }
    }

    /* renamed from: qj1.e5$w */
    public static final class C12353w extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12353w(ViewGroup viewGroup) {
            super(0);
            this.f35576d = viewGroup;
        }

        public Object invoke() {
            return Integer.valueOf((C74783i3.m89537a(this.f35576d.getContext()).f24705b - C75044y4.m89991c(this.f35576d.getContext())) - C75044y4.m89994f(this.f35576d.getContext()));
        }
    }

    /* renamed from: qj1.e5$x */
    public static final class C12354x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35577d;

        public C12354x(C12322e5 e5Var) {
            this.f35577d = e5Var;
        }

        public final void run() {
            ((C0702z0) this.f35577d.mo87684A0().mo71262a(C0702z0.class)).f1686w.postValue(null);
        }
    }

    /* renamed from: qj1.e5$y */
    public static final class C12355y implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<View> f35578d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<RelativeLayout> f35579e;

        /* renamed from: f */
        public final /* synthetic */ C75375u f35580f;

        public C12355y(C8479f0<View> f0Var, C8479f0<RelativeLayout> f0Var2, C75375u uVar) {
            this.f35578d = f0Var;
            this.f35579e = f0Var2;
            this.f35580f = uVar;
        }

        public final void run() {
            MMNeat7extView mMNeat7extView = (MMNeat7extView) ((View) this.f35578d.f27484d).findViewById(C0966R.C0970id.fsv);
            if (mMNeat7extView.getLineCount() > 1) {
                ViewParent parent = mMNeat7extView.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
                ((RelativeLayout) parent).setPadding(0, ((RelativeLayout) this.f35579e.f27484d).getPaddingTop(), ((RelativeLayout) this.f35579e.f27484d).getPaddingRight(), ((RelativeLayout) this.f35579e.f27484d).getPaddingBottom());
                mMNeat7extView.setSpacingAdd(5);
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.f35580f);
                valueOf.setSpan(new LeadingMarginSpan.Standard(0, C74942w4.m89784a(MMApplicationContext.getContext(), 6)), 0, this.f35580f.length(), 33);
                mMNeat7extView.mo104279b(valueOf);
            }
        }
    }

    /* renamed from: qj1.e5$z */
    public static final class C12356z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35581d;

        public C12356z(C12322e5 e5Var) {
            this.f35581d = e5Var;
        }

        public final void run() {
            this.f35581d.mo12032o1("", false);
        }
    }

    /* renamed from: qj1.e5$b */
    public static final class C12357b extends C87413o implements C32228q<C0581o5, View, C9507n, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12322e5 f35582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12357b(C12322e5 e5Var) {
            super(3);
            this.f35582d = e5Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C64460j21 j212;
            C13598b0 b0Var;
            C89349b bVar;
            int i;
            View view;
            C12322e5 e5Var;
            Class cls;
            String str;
            boolean z;
            C8479f0 f0Var;
            C76875f0 f0Var2;
            boolean z2;
            View view2;
            C12322e5 e5Var2;
            C0581o5 o5Var;
            Class cls2;
            String str2;
            boolean z3;
            C76875f0 f0Var3;
            C0581o5 o5Var2 = (C0581o5) obj;
            View view3 = (View) obj2;
            C9507n nVar = (C9507n) obj3;
            C87412m.m108594g(o5Var2, "msg");
            C87412m.m108594g(view3, "view");
            C87412m.m108594g(nVar, "holder");
            if (o5Var2.getType() == 10018 || ((C0668l) this.f35582d.mo87696x0(C0668l.class)).mo632i3()) {
                C49765hx0 i2 = o5Var2.mo579i();
                int i3 = i2 != null ? i2.f134926n : 1;
                boolean z4 = (i3 == 3 || i3 == 4) ? false : true;
                int type = o5Var2.getType();
                boolean z5 = type == 100000 || type == 20036;
                View findViewById = view3.findViewById(C0966R.C0970id.fss);
                View view4 = findViewById == null ? view3 : findViewById;
                C12322e5 e5Var3 = this.f35582d;
                Class cls3 = C54116w.class;
                Class cls4 = C98522w3.class;
                Class cls5 = C55001u.class;
                Class cls6 = C54991o.class;
                C87412m.m108594g(e5Var3, "<this>");
                C8479f0 f0Var4 = new C8479f0();
                C62042e eVar = C62042e.f176370a;
                boolean z6 = z4;
                if ((eVar.mo87027N0() || ((C54991o) e5Var3.mo87696x0(cls6)).f154190D) && (o5Var2.getType() == 1 || o5Var2.getType() == 20002 || o5Var2.getType() == 20035 || o5Var2.getType() == 1000066 || z5)) {
                    Class cls7 = cls6;
                    boolean z7 = z5;
                    String str3 = "buContext";
                    C8479f0 f0Var5 = f0Var4;
                    String e = o5Var2.mo571e();
                    C49765hx0 i4 = o5Var2.mo579i();
                    C89349b bVar2 = i4 != null ? i4.f134928p : null;
                    C41573e3 e3Var = C41573e3.f111902a;
                    e3Var.mo64658a();
                    if (view3.getTag(C0966R.C0970id.f358125n91) == null) {
                        Boolean bool = ((C54991o) e5Var3.mo87696x0(cls7)).f154262U0.get(e);
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = ((C54991o) e5Var3.mo87696x0(cls7)).f154267V0.get(e);
                        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        C54795n5 D0 = e5Var3.mo14476D0();
                        if (D0 != null) {
                            C12609q5 q5Var = r1;
                            cls2 = cls7;
                            C89349b bVar3 = bVar2;
                            boolean z8 = booleanValue;
                            str2 = str3;
                            e5Var2 = e5Var3;
                            C0581o5 o5Var3 = o5Var2;
                            view2 = view4;
                            o5Var = o5Var2;
                            z3 = false;
                            C12609q5 q5Var2 = new C12609q5(e5Var3, e, z8, booleanValue2, view3, o5Var3, nVar);
                            D0.mo75733f(e, 0, bVar3, q5Var);
                            C13598b0 b0Var2 = C13598b0.f38549a;
                            f0Var3 = null;
                        } else {
                            cls2 = cls7;
                            e5Var2 = e5Var3;
                            view2 = view4;
                            o5Var = o5Var2;
                            str2 = str3;
                            z3 = false;
                            f0Var3 = null;
                        }
                    } else {
                        cls2 = cls7;
                        e5Var2 = e5Var3;
                        view2 = view4;
                        o5Var = o5Var2;
                        str2 = str3;
                        z3 = false;
                        f0Var3 = null;
                        if (C87412m.m108589b(view3.getTag(C0966R.C0970id.f358125n91), Boolean.TRUE)) {
                            view3.setTag(C0966R.C0970id.f358125n91, (Object) null);
                        }
                    }
                    f0Var5.f27484d = view2.getBackground();
                    C45795b A0 = e5Var2.mo87684A0();
                    C87412m.m108594g(A0, str2);
                    View view5 = view2;
                    e3Var.mo64661d(new C56589c7(A0, o5Var, z7, z6, o5Var.mo571e()), new C12640r5(e5Var2, nVar, view3, o5Var, view2, f0Var5), new C62971s5(view5, f0Var5), new C41573e3.C41574a(view3, (C41573e3.C41575b) null, o5Var.mo579i(), ((C54991o) e5Var2.mo87696x0(cls2)).f154190D, false, false, (String) null, (String) null, 242, (C8480h) null), new C41573e3.C41576c(!z7, f0Var3, z3));
                    C12759y5.m12253a(view5, o5Var);
                } else if (((Boolean) ((C58052j1) ((C54991o) e5Var3.mo87696x0(cls6)).f154194E).getValue()).booleanValue() && (o5Var2.getType() == 1 || o5Var2.getType() == 20002 || o5Var2.getType() == 20035 || o5Var2.getType() == 1000066 || z5)) {
                    String e2 = o5Var2.mo571e();
                    C49765hx0 i5 = o5Var2.mo579i();
                    if (i5 != null) {
                        bVar = i5.f134928p;
                        i = C0966R.C0970id.f358125n91;
                    } else {
                        i = C0966R.C0970id.f358125n91;
                        bVar = null;
                    }
                    if (view3.getTag(i) == null) {
                        Boolean bool3 = ((C54991o) e5Var3.mo87696x0(cls6)).f154262U0.get(e2);
                        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                        Boolean bool4 = ((C54991o) e5Var3.mo87696x0(cls6)).f154267V0.get(e2);
                        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                        C54795n5 D02 = e5Var3.mo14476D0();
                        if (D02 != null) {
                            C12671t5 t5Var = r1;
                            z = z5;
                            str = "buContext";
                            f0Var = f0Var4;
                            cls = cls6;
                            e5Var = e5Var3;
                            view = view4;
                            C12671t5 t5Var2 = new C12671t5(e5Var3, e2, booleanValue3, booleanValue4, view3, o5Var2, nVar);
                            z2 = false;
                            D02.mo75733f(e2, 0, bVar, t5Var);
                            C13598b0 b0Var3 = C13598b0.f38549a;
                        } else {
                            cls = cls6;
                            e5Var = e5Var3;
                            view = view4;
                            z = z5;
                            str = "buContext";
                            z2 = false;
                            f0Var = f0Var4;
                        }
                        f0Var2 = null;
                    } else {
                        cls = cls6;
                        e5Var = e5Var3;
                        view = view4;
                        z = z5;
                        str = "buContext";
                        z2 = false;
                        f0Var = f0Var4;
                        f0Var2 = null;
                        if (C87412m.m108589b(view3.getTag(C0966R.C0970id.f358125n91), Boolean.TRUE)) {
                            view3.setTag(C0966R.C0970id.f358125n91, (Object) null);
                        }
                    }
                    C41573e3 e3Var2 = C41573e3.f111902a;
                    e3Var2.mo64658a();
                    f0Var.f27484d = view.getBackground();
                    C45795b A02 = e5Var.mo87684A0();
                    C87412m.m108594g(A02, str);
                    View view6 = view;
                    e3Var2.mo64661d(new C56594d7(A02, z, o5Var2, o5Var2.mo571e()), new C12698u5(e5Var, nVar, view3, o5Var2, view, f0Var), new C63045v5(view6, f0Var), new C41573e3.C41574a(view3, (C41573e3.C41575b) null, o5Var2.mo579i(), ((C54991o) e5Var.mo87696x0(cls)).f154190D, false, false, (String) null, (String) null, 242, (C8480h) null), new C41573e3.C41576c(!z, f0Var2, z2));
                    C12759y5.m12253a(view6, o5Var2);
                } else {
                    Class cls8 = cls6;
                    C12322e5 e5Var4 = e5Var3;
                    View view7 = view4;
                    C8479f0 f0Var6 = f0Var4;
                    C62193a.C62194a aVar = C62193a.f176816k1;
                    String str4 = "buContext";
                    if (!C62193a.f176817l1.containsKey(Long.valueOf(e5Var4.mo87686C0().f151977d.f157064e)) || ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e() || !(o5Var2.getType() == 1 || o5Var2.getType() == 20002 || o5Var2.getType() == 20035 || o5Var2.getType() == 1000066)) {
                        C12322e5 e5Var5 = e5Var4;
                        if (o5Var2.getType() == 10018) {
                            if (!(o5Var2 instanceof C0567l3)) {
                                o5Var2 = null;
                            }
                            if (o5Var2 != null) {
                                m74 m74 = new m74();
                                C64311db1 db12 = ((C0567l3) o5Var2).f1365f;
                                m74.f184219d = db12.f182661d;
                                m74.f184220e = db12.f182662e;
                                m74.f184221f = db12.f182663f;
                                m74.f184222g = db12.f182664g;
                                m74.f184223h = db12.f182665h;
                                m74.f184224i = db12.f182666i;
                                m74.f184225j = db12.f182667j;
                                m74.f184234v = db12.f182670p;
                                C13598b0 b0Var4 = C13598b0.f38549a;
                                C115669n.INSTANCE.mo175912v(((C98522w3) C86312j.m106911c(cls4)).mo3991CD(), 7);
                                Context context = view3.getContext();
                                C87412m.m108593f(context, "view.context");
                                ((C98522w3) C86312j.m106911c(cls4)).mo3994aU(context, m74, C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS, 11, C75592q0.m90789s(), new C62913o5());
                                b0Var = C13598b0.f38549a;
                            } else {
                                b0Var = null;
                            }
                            if (b0Var == null) {
                                Log.m105924i("Finder.LiveCommentPlugin", "msg is not FinderLiveLocationMsg");
                                C13598b0 b0Var5 = C13598b0.f38549a;
                            }
                        } else if (o5Var2.getType() == 10019) {
                            if (o5Var2 instanceof C54845x3) {
                                C54845x3 x3Var = (C54845x3) o5Var2;
                                String str5 = x3Var.f153750f.f144033e;
                                if (str5 != null) {
                                    if (!(!(str5.length() == 0))) {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        C58739j4 j4Var = C58739j4.f168176a;
                                        String str6 = ((C54991o) e5Var5.mo87696x0(cls8)).f154345o;
                                        Context context2 = e5Var5.f166287d.getContext();
                                        C87412m.m108593f(context2, "root.context");
                                        j4Var.mo83695X(str5, str6, context2, ((C54991o) e5Var5.mo87696x0(cls8)).f154325i1, String.valueOf(((C55001u) e5Var5.mo87696x0(cls5)).f154420q.f182392d), 1);
                                        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_comment_name_clk", e5Var5.f166287d, C90363p0.m113143b(new C13604l("is_biz_live", 1)), 25561);
                                        C7335d c = C86312j.m106911c(C54108o.class);
                                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                                        C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_ENTER_BIZ;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("bizusername", str5);
                                        C13598b0 b0Var6 = C13598b0.f38549a;
                                        C8777j5.C8778a.m8606g((C8777j5) c, mVar, linkedHashMap, (String) null, 4, (Object) null);
                                    }
                                }
                                C51828wg0 wg02 = x3Var.f153750f;
                                ((C54116w) C86312j.m106911c(cls3)).ly0(true, wg02.f144033e, wg02.f144032d);
                            }
                        } else if (o5Var2.getType() == 20040) {
                            if (!(o5Var2 instanceof C0555j3)) {
                                Log.m105920e("Finder.LiveCommentPlugin", "click jumpGame failed, wrong msgType :" + o5Var2.getType());
                            } else if (!eVar.mo87027N0() || eVar.mo87073d1(e5Var5.mo87684A0())) {
                                C0555j3 j3Var = (C0555j3) o5Var2;
                                C64295cs1 cs12 = j3Var.f1343f;
                                int i6 = cs12.f182562f;
                                if (i6 == 1) {
                                    C64669qy0 qy02 = cs12.f182563g;
                                    j212 = qy02 != null ? qy02.f185094e : null;
                                    C13598b0 b0Var7 = C13598b0.f38549a;
                                } else if (i6 != 2) {
                                    Log.m105920e("Finder.LiveCommentPlugin", "click jumpGame failed, wrong gameType:" + j3Var.f1343f.f182562f);
                                    C13598b0 b0Var8 = C13598b0.f38549a;
                                    j212 = null;
                                } else {
                                    C64874za1 za12 = cs12.f182564h;
                                    j212 = za12 != null ? za12.f186647e : null;
                                    C13598b0 b0Var9 = C13598b0.f38549a;
                                }
                                if ((j212 != null ? Boolean.valueOf(j212.f183764g) : null) != null && j212.f183764g) {
                                    int i7 = j212.f183761d;
                                    if (i7 == 1) {
                                        Intent intent = new Intent();
                                        intent.putExtra("rawUrl", j212.f183762e);
                                        C88144b.m109791i(e5Var5.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                                    } else if (i7 != 2) {
                                        Log.m105920e("Finder.LiveCommentPlugin", "click jumpGame failed, wrong clickType:" + Integer.valueOf(j212.f183761d));
                                    } else {
                                        C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
                                        Context context3 = e5Var5.f166287d.getContext();
                                        C86299o oVar = new C86299o();
                                        C64797wa1 wa12 = j212.f183763f;
                                        oVar.f250930b = wa12 != null ? wa12.f186065d : null;
                                        oVar.f250931c = wa12 != null ? wa12.f186068g : 0;
                                        oVar.f250934f = wa12 != null ? wa12.f186066e : null;
                                        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
                                        appBrandLaunchReferrer.f239396d = 9;
                                        C64797wa1 wa13 = j212.f183763f;
                                        appBrandLaunchReferrer.f239397e = wa13 != null ? wa13.f186065d : null;
                                        appBrandLaunchReferrer.f239407r = wa13 != null ? wa13.f186067f : null;
                                        oVar.f250947s = appBrandLaunchReferrer;
                                        oVar.f250939k = 1206;
                                        oVar.f250940l = C66785b.f191882e.mo90662O5() + XVFSFile.PATH_SEPARATOR_CHAR + ((C55001u) e5Var5.mo87696x0(cls5)).f154420q.f182392d;
                                        x0Var.mo106898tv(context3, oVar);
                                    }
                                    ((C54116w) C86312j.m106911c(cls3)).ky0(false, j3Var.f1343f.f182566j);
                                }
                            } else {
                                C46828m mVar2 = (C46828m) C86312j.m106911c(C46828m.class);
                                Context context4 = e5Var5.f166287d.getContext();
                                String str7 = ((C54991o) e5Var5.mo87696x0(cls8)).f154309e3;
                                if (str7 == null && (str7 = ((C55001u) e5Var5.mo87696x0(cls5)).f154420q.f182357C) == null) {
                                    str7 = "";
                                }
                                int i8 = ((C54991o) e5Var5.mo87696x0(cls8)).f154314f3;
                                Boolean bool5 = Boolean.FALSE;
                                mVar2.mo72034dg(context4, str7, i8, bool5, bool5, Long.valueOf(((C55001u) e5Var5.mo87696x0(cls5)).f154420q.f182392d));
                                ((C54991o) e5Var5.mo87696x0(cls8)).f154350p0 = false;
                                e5Var5.f166287d.postDelayed(new C12596p5(e5Var5), 200);
                            }
                        }
                    } else {
                        C41573e3 e3Var3 = C41573e3.f111902a;
                        e3Var3.mo64658a();
                        f0Var6.f27484d = view7.getBackground();
                        C45795b A03 = e5Var4.mo87684A0();
                        C87412m.m108594g(A03, str4);
                        View view8 = view7;
                        e3Var3.mo64661d(new C56600e7(o5Var2, A03), new C12727w5(e5Var4, nVar, view3, o5Var2, view7, f0Var6), new C63101x5(view8, f0Var6), new C41573e3.C41574a(view3, (C41573e3.C41575b) null, o5Var2.mo579i(), false, true, false, (String) null, (String) null, 226, (C8480h) null), new C41573e3.C41576c(!((C54991o) e5Var4.mo87696x0(cls8)).f154382x, (C76875f0) null, false));
                        C12759y5.m12253a(view8, o5Var2);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12322e5(ViewGroup viewGroup, C58124b bVar, ViewGroup viewGroup2) {
        super(viewGroup, bVar, (C49712hj1) null);
        double d;
        double d2;
        Class cls = C16004c.class;
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35525p = bVar;
        this.f35526q = viewGroup2;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fsx);
        C87412m.m108593f(findViewById, "root.findViewById(com.te…e_comment_list_tip_group)");
        ViewGroup viewGroup3 = (ViewGroup) findViewById;
        this.f35527r = viewGroup3;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fsy);
        C87412m.m108593f(findViewById2, "root.findViewById(com.te…live_comment_list_tip_tv)");
        this.f35528s = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f358564mt3);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.l…_float_sticky_content_tv)");
        this.f35529t = findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.djm);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.finder_live_comment_bound)");
        FinderMaxSizeLayout finderMaxSizeLayout = (FinderMaxSizeLayout) findViewById4;
        this.f35530u = finderMaxSizeLayout;
        this.f35504A = C36568h.m40985a(new C12345o(viewGroup, this));
        C12806i0 i0Var = new C12806i0(mo87684A0());
        this.f35506C = i0Var;
        this.f35507D = C36568h.m40985a(new C12341k(viewGroup, this));
        this.f35508E = C36568h.m40985a(new C12347q(viewGroup, this));
        C36568h.m40985a(C12327c0.f35540d);
        this.f35516M = true;
        this.f35517N = C36568h.m40985a(new C12346p(this));
        C62042e eVar = C62042e.f176370a;
        if (!eVar.mo87027N0() || ((C54979h1) mo87696x0(C54979h1.class)).f154134f || ((C13022d0) mo87696x0(C13022d0.class)).f37102r || ((C54963d0) mo87696x0(C54963d0.class)).mo75902I3()) {
            d2 = (double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y);
            d = 0.25d;
        } else {
            d2 = (double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y);
            d = 0.29d;
        }
        this.f35513J = (int) (d2 * d);
        if (mo82893g0()) {
            int a = f35497W.mo12039a();
            viewGroup.getLayoutParams().width = a;
            mo12024f1().getLayoutParams().width = a;
            Log.m105924i("Finder.LiveCommentPlugin", "init comment width = " + a);
            int i = FinderMaxSizeLayout.f15300n;
            finderMaxSizeLayout.mo3347b((int) (((double) C75044y4.m89990b(MMApplicationContext.getContext()).y) * 0.3d), true);
            ((C16004c) mo87684A0().mo71262a(cls)).f43064j = a;
        } else {
            int i2 = FinderMaxSizeLayout.f15300n;
            finderMaxSizeLayout.mo3347b((int) (((float) this.f35513J) + f35498X), true);
            Point b = C75044y4.m89990b(viewGroup.getContext());
            if (b.x >= (b.y / 3) * 2) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.width = b.x / 2;
                viewGroup.setLayoutParams(layoutParams);
            } else {
                int i3 = C75044y4.m89990b(MMApplicationContext.getContext()).x;
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int marginStart = i3 - ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((C16004c) mo87684A0().mo71262a(cls)).f43064j = marginStart - ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            }
        }
        this.f35512I = finderMaxSizeLayout.getMaxHeight();
        Log.m105924i("Finder.LiveCommentPlugin", "commentListWidth : " + ((C16004c) mo87684A0().mo71262a(cls)).f43064j);
        WxRecyclerView f1 = mo12024f1();
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        f1.setLayoutManager(new FinderLiveMsgLinearLayoutManager(context));
        mo12024f1().setAdapter(i0Var);
        C23564m.m28138h(mo12024f1(), new C12323a(this));
        i0Var.f36655h = new C12357b(this);
        i0Var.f36656i = new C12326c(this);
        i0Var.f36657j = new C12328d(this);
        mo12024f1().mo17043c(new C12330e(this));
        viewGroup3.setOnClickListener(new C12332f(this));
        eVar.mo87074e(this, true);
        this.f35518P = C36568h.m40985a(new C12340j(viewGroup));
        this.f35520R = true;
        this.f35521S = C36568h.m40985a(new C12353w(viewGroup));
    }

    /* renamed from: Z0 */
    public static final void m11875Z0(C12322e5 e5Var, boolean z) {
        e5Var.getClass();
        C104289g gVar = new C104289g();
        C62712dd ddVar = (C62712dd) e5Var.mo87687E0(C62712dd.class);
        int i = 0;
        int i2 = 1;
        boolean z2 = ddVar != null && ddVar.mo14483f0() == 0;
        boolean G3 = ((C54991o) e5Var.mo87696x0(C54991o.class)).mo75960G3();
        if (z2) {
            i = 2;
        } else if (G3) {
            i = 1;
        }
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87027N0()) {
            if (!z) {
                i2 = 2;
            }
            gVar.mo145953n("type", i2);
        } else {
            gVar.mo145953n("type", z ? 20 : 21);
        }
        gVar.mo145953n("comment_put_type", i);
        if (eVar.mo87027N0()) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_COMMENT_HEIGHT_CHANGE, gVar.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c2 = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c2, C54067f0.C54076o0.COMMENT_OPTION, gVar.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m11876d1(C12322e5 e5Var, Boolean bool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        e5Var.mo12021c1(bool, i);
    }

    /* renamed from: s1 */
    public static void m11877s1(C12322e5 e5Var, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        e5Var.getClass();
        C87412m.m108594g(list, "msgList");
        if (z) {
            if (!list.isEmpty()) {
                e5Var.mo12020b1();
            }
            if (!e5Var.f35516M) {
                if (e5Var.mo12024f1().isShown()) {
                    e5Var.f35516M = true;
                } else {
                    Log.m105924i("Finder.LiveCommentPlugin", "updateMessages return ,RecyclerView is invisible");
                    return;
                }
            } else if (!e5Var.mo12024f1().isShown()) {
                e5Var.f35516M = false;
                Log.m105924i("Finder.LiveCommentPlugin", "updateMessages return ,isMsgListViewVisible is not real.correct it");
                return;
            }
            Message obtainMessage = e5Var.mo12025g1().obtainMessage();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            obtainMessage.obj = arrayList;
            obtainMessage.arg1 = z2;
            int i2 = f35499Y;
            obtainMessage.what = i2;
            e5Var.mo12025g1().removeMessages(i2);
            e5Var.mo12025g1().sendMessage(obtainMessage);
            return;
        }
        Message obtainMessage2 = e5Var.mo12025g1().obtainMessage();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list);
        obtainMessage2.obj = arrayList2;
        obtainMessage2.arg1 = z2 ? 1 : 0;
        int i3 = f35500Z;
        obtainMessage2.what = i3;
        e5Var.mo12025g1().removeMessages(i3);
        e5Var.mo12025g1().sendMessage(obtainMessage2);
    }

    /* renamed from: I */
    public void mo10507I(int i) {
        if (!mo82893g0()) {
            return;
        }
        if (i == -2) {
            this.f35530u.mo3347b(i, false);
            return;
        }
        FinderMaxSizeLayout finderMaxSizeLayout = this.f35530u;
        int i2 = FinderMaxSizeLayout.f15300n;
        finderMaxSizeLayout.mo3347b(0, true);
    }

    /* renamed from: O0 */
    public void mo12017O0(Configuration configuration) {
        if (!mo82893g0()) {
            Point b = C75044y4.m89990b(this.f166287d.getContext());
            if (b.x >= (b.y / 3) * 2) {
                ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
                layoutParams.width = b.x / 2;
                this.f166287d.setLayoutParams(layoutParams);
                return;
            }
            int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
            ViewGroup.LayoutParams layoutParams2 = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int marginStart = i - ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
            ViewGroup.LayoutParams layoutParams3 = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((C16004c) mo87684A0().mo71262a(C16004c.class)).f43064j = marginStart - ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        }
    }

    /* renamed from: Q0 */
    public void mo12018Q0(Bundle bundle) {
        mo12024f1().post(new C12351u(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.widget.RelativeLayout} */
    /* JADX WARNING: type inference failed for: r0v18, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo10508R() {
        /*
            r13 = this;
            android.view.ViewGroup r0 = r13.f35526q
            java.lang.String r1 = "Finder.LiveCommentPlugin"
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "getCommentRootView rootParent null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.view.ViewGroup r0 = r13.f166287d
            return r0
        L_0x000e:
            android.view.View r2 = r13.f35515L
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = "getCommentRootView viewPagerRootView not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.view.View r0 = r13.f35515L
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r0, r1)
            return r0
        L_0x001f:
            r2 = 2131303253(0x7f091b55, float:1.8224615E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3 = 0
            if (r0 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            r0.setVisibility(r3)
        L_0x002f:
            android.view.ViewGroup r4 = r13.f35526q
            r5 = 2131303836(0x7f091d9c, float:1.8225798E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            boolean r5 = r13.mo82893g0()
            r6 = 12
            r7 = 2
            r8 = -2
            r9 = -1
            r10 = 0
            if (r5 == 0) goto L_0x0088
            if (r4 != 0) goto L_0x0088
            java.lang.String r2 = "bubbleContainer"
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r0 = "getCommentRootView getLandscapeRootView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.view.ViewGroup r0 = r13.f166287d
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x005f
            r10 = r0
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
        L_0x005f:
            if (r10 == 0) goto L_0x0066
            android.view.ViewGroup r0 = r13.f166287d
            r10.removeView(r0)
        L_0x0066:
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            android.view.ViewGroup r1 = r13.f166287d
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            android.view.ViewGroup r1 = r13.f166287d
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r9, r8)
            r2.removeRule(r7)
            r2.addRule(r6)
            r1.setLayoutParams(r2)
            android.view.ViewGroup r1 = r13.f166287d
            r0.addView(r1)
            goto L_0x0198
        L_0x0088:
            java.lang.String r0 = "getCommentRootView getPortraitRootView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r4 == 0) goto L_0x0196
            android.view.ViewGroup r0 = r13.f166287d
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x009c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x009d
        L_0x009c:
            r0 = r10
        L_0x009d:
            if (r0 == 0) goto L_0x00a4
            android.view.ViewGroup r1 = r13.f166287d
            r0.removeView(r1)
        L_0x00a4:
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x00af
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x00b0
        L_0x00af:
            r0 = r10
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r0.removeView(r4)
        L_0x00b5:
            com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout r0 = new com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout
            android.view.ViewGroup r1 = r13.f166287d
            android.content.Context r1 = r1.getContext()
            java.lang.String r5 = "root.context"
            gy3.C87412m.m108593f(r1, r5)
            r0.<init>(r1)
            r1 = 2131303928(0x7f091df8, float:1.8225984E38)
            android.view.View r1 = r4.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00d6
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x00d7
        L_0x00d6:
            r1 = r10
        L_0x00d7:
            boolean r5 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x00de
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x00df
        L_0x00de:
            r1 = r10
        L_0x00df:
            r5 = 16
            if (r1 == 0) goto L_0x00ed
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r11 = kg3.C76577a.m92151b(r11, r5)
            r1.bottomMargin = r11
        L_0x00ed:
            android.view.View r1 = r4.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L_0x00fa
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x00fb
        L_0x00fa:
            r1 = r10
        L_0x00fb:
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0102
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0103
        L_0x0102:
            r1 = r10
        L_0x0103:
            if (r1 == 0) goto L_0x011c
            r1.bottomMargin = r3
            android.view.ViewGroup r2 = r13.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r11 = 2131165356(0x7f0700ac, float:1.7944927E38)
            float r2 = r2.getDimension(r11)
            int r2 = (int) r2
            int r2 = -r2
            r1.rightMargin = r2
        L_0x011c:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r1.<init>((int) r9, (int) r8)
            r0.addView(r4, r1)
            androidx.constraintlayout.widget.a r1 = new androidx.constraintlayout.widget.a
            r1.<init>()
            r1.mo16716c(r0)
            int r2 = r4.getId()
            r11 = 1
            r1.mo16717d(r2, r11, r3, r11)
            int r2 = r4.getId()
            r1.mo16717d(r2, r7, r3, r7)
            int r2 = r4.getId()
            r12 = 4
            r1.mo16717d(r2, r12, r3, r12)
            r1.mo16714a(r0)
            r0.setConstraintSet(r10)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            r1.<init>((int) r9, (int) r8)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = kg3.C76577a.m92151b(r2, r6)
            r1.leftMargin = r2
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = kg3.C76577a.m92151b(r2, r5)
            r1.bottomMargin = r2
            android.view.ViewGroup r2 = r13.f166287d
            r0.addView(r2, r1)
            androidx.constraintlayout.widget.a r1 = new androidx.constraintlayout.widget.a
            r1.<init>()
            r1.mo16716c(r0)
            android.view.ViewGroup r2 = r13.f166287d
            int r2 = r2.getId()
            r1.mo16717d(r2, r11, r3, r11)
            android.view.ViewGroup r2 = r13.f166287d
            int r2 = r2.getId()
            r1.mo16717d(r2, r7, r3, r7)
            android.view.ViewGroup r2 = r13.f166287d
            int r2 = r2.getId()
            int r3 = r4.getId()
            r4 = 3
            r1.mo16717d(r2, r12, r3, r4)
            r1.mo16714a(r0)
            r0.setConstraintSet(r10)
            goto L_0x0198
        L_0x0196:
            android.view.ViewGroup r0 = r13.f166287d
        L_0x0198:
            r13.f35515L = r0
            gy3.C87412m.m108591d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12322e5.mo10508R():android.view.View");
    }

    /* renamed from: a1 */
    public final boolean mo12019a1(boolean z) {
        if (!this.f35520R && this.f35535z) {
            this.f35520R = true;
            this.f35519Q = false;
            int maxHeight = this.f35530u.getMaxHeight();
            int intValue = maxHeight - ((Number) ((C36570n) this.f35518P).getValue()).intValue();
            if (z) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{maxHeight, intValue});
                ofInt.setDuration(100);
                ofInt.addUpdateListener(new C12342l(this));
                ofInt.start();
            } else {
                this.f35530u.mo3347b(intValue, false);
                C61926c.m72668M(new C12343m(this));
            }
        }
        return !this.f35520R;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return mo82893g0() || this.f35514K;
    }

    /* renamed from: b1 */
    public final void mo12020b1() {
        Boolean bool = ((C54991o) mo87696x0(C54991o.class)).f154288Z1;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (this.f35510G != booleanValue) {
                boolean z = System.currentTimeMillis() - this.f35524V < 3000;
                this.f35510G = booleanValue;
                if (booleanValue) {
                    mo12032o1("", false);
                    m11876d1(this, Boolean.TRUE, 0, 2, (Object) null);
                    mo12024f1().setVisibility(0);
                } else if (z) {
                    C61926c.m72666K(3000, new C12344n(this));
                } else {
                    mo12024f1().setVisibility(8);
                    String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dje);
                    C87412m.m108593f(string, "context.resources.getStr…e_comment_anchor_disable)");
                    mo12032o1(string, true);
                }
                Log.m105924i("Finder.LiveCommentPlugin", "enableLiveRoomComment:" + booleanValue);
            }
        }
    }

    /* renamed from: c1 */
    public final void mo12021c1(Boolean bool, int i) {
        Boolean bool2 = bool;
        int i2 = i;
        if (C87412m.m108589b(bool2, Boolean.TRUE)) {
            if (1 <= i2 && i2 < 30) {
                int itemCount = this.f35506C.getItemCount() - 1;
                WxRecyclerView f1 = mo12024f1();
                if (itemCount < 0) {
                    itemCount = 0;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(itemCount));
                WxRecyclerView wxRecyclerView = f1;
                C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                f1.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f35511H = ((C54991o) mo87696x0(C54991o.class)).f154257T0;
            }
        }
        if (i2 >= 1) {
            WxRecyclerView f15 = mo12024f1();
            int itemCount2 = this.f35506C.getItemCount() - 1;
            if (itemCount2 < 0) {
                itemCount2 = 0;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(itemCount2));
            WxRecyclerView wxRecyclerView2 = f15;
            C117292a.m165358d(wxRecyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
            f15.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
        } else if (C87412m.m108589b(bool2, Boolean.FALSE)) {
            WxRecyclerView f16 = mo12024f1();
            int itemCount3 = this.f35506C.getItemCount() - 1;
            if (itemCount3 < 0) {
                itemCount3 = 0;
            }
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Integer.valueOf(itemCount3));
            WxRecyclerView wxRecyclerView3 = f16;
            C117292a.m165358d(wxRecyclerView3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
            f16.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
        this.f35511H = ((C54991o) mo87696x0(C54991o.class)).f154257T0;
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_GOTO_PROFILE_COMMENT")) {
            C12352v vVar = new C12352v(this, bundle, obj, j);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(vVar, j);
        }
    }

    /* renamed from: e1 */
    public final C10333o mo12023e1() {
        return (C10333o) ((C36570n) this.f35507D).getValue();
    }

    /* renamed from: f1 */
    public final WxRecyclerView mo12024f1() {
        return (WxRecyclerView) this.f35504A.getValue();
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (i == 0 && mo14483f0() != 0) {
            Log.m105924i("Finder.LiveCommentPlugin", "[commentHeightChange] commentPlugin visible change");
            this.f166287d.postDelayed(new C12354x(this), 100);
        }
        C32444a aVar = C32444a.f86121a;
        if (((Boolean) C32444a.f86043C2.mo60266n()).booleanValue()) {
            i = 8;
        }
        super.mo10792g(i);
    }

    /* renamed from: g1 */
    public final MMHandler mo12025g1() {
        return (MMHandler) ((C36570n) this.f35517N).getValue();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final int mo12026h1() {
        return ((Number) ((C36570n) this.f35521S).getValue()).intValue();
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        Class cls = C0702z0.class;
        Class cls2 = C16004c.class;
        super.mo8357i0();
        ((C16004c) mo87684A0().mo71262a(cls2)).mo14629c3().f1318i = new C12339i(new SoftReference(this));
        ((C16004c) mo87684A0().mo71262a(cls2)).mo14629c3().f1317h = new C12336h(new SoftReference(this));
        ((C55001u) mo87684A0().mo71262a(C55001u.class)).f154418o.observe(this, new C12348r(this));
        ((C0702z0) mo87684A0().mo71262a(cls)).f1684u.observe(this, new C12349s(this));
        ((C0702z0) mo87684A0().mo71262a(cls)).f1686w.observe(this, new C12350t(this));
    }

    /* renamed from: i1 */
    public final void mo12027i1() {
        this.f35527r.setVisibility(8);
    }

    /* renamed from: j1 */
    public final boolean mo12028j1() {
        RecyclerView.LayoutManager layoutManager = mo12024f1().getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) layoutManager).mo16958D() == this.f35506C.getItemCount() - 1;
    }

    /* renamed from: l1 */
    public final void mo12029l1() {
        Class cls = C0702z0.class;
        if (this.f35511H > 0) {
            ((C0702z0) mo87696x0(cls)).f1679p = mo12028j1();
            C0702z0 z0Var = (C0702z0) mo87696x0(cls);
            long j = ((C0702z0) mo87696x0(cls)).f1680q;
            long j2 = this.f35511H;
            if (j < j2) {
                j = j2;
            }
            z0Var.f1680q = j;
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        Log.m105924i("Finder.LiveCommentPlugin", "onAudienceMicUserChanged commentAdapter micEnable true");
        boolean z = true;
        C7692l.f26054m = true;
        if (linkedHashMap.size() <= 1) {
            z = false;
        }
        if (z) {
            mo12019a1(false);
        }
    }

    /* renamed from: m1 */
    public void mo12030m1() {
        try {
            this.f35506C.f36654g.clear();
            this.f35506C.notifyDataSetChanged();
        } catch (Exception e) {
            Log.m105924i("Finder.LiveCommentPlugin", "[reset] err = " + e.getMessage());
        }
    }

    /* renamed from: n1 */
    public final void mo12031n1(long j) {
        if (j <= 0 || !((C54991o) mo87696x0(C54991o.class)).f154370u) {
            mo12027i1();
            return;
        }
        this.f35527r.setVisibility(0);
        if (!((C0702z0) mo87696x0(C0702z0.class)).f1681r) {
            String valueOf = j <= 99 ? String.valueOf(j) : "99+";
            TextView textView = this.f35528s;
            String string = this.f166287d.getContext().getResources().getString(C0966R.string.f360644dz0);
            C87412m.m108593f(string, "root.context.resources.g…der_live_new_comment_tip)");
            String format = String.format(string, Arrays.copyOf(new Object[]{valueOf}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
            return;
        }
        TextView textView2 = this.f35528s;
        String string2 = this.f166287d.getContext().getResources().getString(C0966R.string.djg);
        C87412m.m108593f(string2, "root.context.resources.g…_live_comment_at_me_tips)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[0], 0));
        C87412m.m108593f(format2, "format(format, *args)");
        textView2.setText(format2);
    }

    /* renamed from: o1 */
    public final void mo12032o1(String str, boolean z) {
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = this.f166287d.findViewById(C0966R.C0970id.dec);
        if (z) {
            mo12023e1().f31495l.clear();
            mo12023e1().mo10634f(1);
            mo12027i1();
            this.f35505B = false;
            Context context = MMApplicationContext.getContext();
            C75375u uVar = new C75375u(context.getResources().getString(C0966R.string.dge, new Object[]{context.getResources().getString(C0966R.string.dje)}));
            String string = context.getResources().getString(C0966R.string.dgf);
            C87412m.m108593f(string, "context.resources.getStr…_annoucement_replacement)");
            Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, string, 0.0f, 0.0f, 6, (Object) null);
            float f = C15439m.f41885k;
            C15439m mVar = r6;
            C15439m mVar2 = new C15439m(string, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_8), C15439m.f41884j, 0.0f, 128, (C8480h) null);
            uVar.mo105705b(new C15437l(a, mVar), 0, string.length() + 0, 33);
            C8479f0 f0Var2 = new C8479f0();
            T parent = ((MMNeat7extView) ((View) f0Var.f27484d).findViewById(C0966R.C0970id.fsv)).getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            f0Var2.f27484d = (RelativeLayout) parent;
            ViewParent parent2 = ((MMNeat7extView) ((View) f0Var.f27484d).findViewById(C0966R.C0970id.fsv)).getParent();
            C87412m.m108592e(parent2, "null cannot be cast to non-null type android.widget.RelativeLayout");
            ((RelativeLayout) parent2).setPadding(0, ((RelativeLayout) f0Var2.f27484d).getPaddingTop(), ((RelativeLayout) f0Var2.f27484d).getPaddingRight(), ((RelativeLayout) f0Var2.f27484d).getPaddingBottom());
            ((MMNeat7extView) ((View) f0Var.f27484d).findViewById(C0966R.C0970id.fsv)).mo104279b(uVar);
            View view = (View) f0Var.f27484d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showOrHideBanComment", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showOrHideBanComment", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((View) f0Var.f27484d).post(new C12355y(f0Var, f0Var2, uVar));
            ((View) f0Var.f27484d).postDelayed(new C12356z(this), 3000);
            return;
        }
        mo12031n1(0);
        if (((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2) {
            C10333o e1 = mo12023e1();
            List<C0581o5> list = ((C0702z0) mo87696x0(C0702z0.class)).f1673g;
            C87412m.m108593f(list, "business(LiveMsgSlice::c…ss.java).bulletCommetList");
            e1.getClass();
            C61926c.m72668M(new C10344t(e1, list, true));
        }
        View view3 = (View) f0Var.f27484d;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showOrHideBanComment", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showOrHideBanComment", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: p1 */
    public final void mo12033p1(List<C0581o5> list) {
        Log.m105924i("Finder.LiveCommentPlugin", "updateCommentListInternal liveId:" + ((C55001u) mo87684A0().mo71262a(C55001u.class)).f154420q.f182392d + ",msgListCount:" + list.size());
        boolean z = !C41573e3.f111902a.mo64659b() && (!this.f35505B || mo12028j1());
        long j = ((C54991o) mo87696x0(C54991o.class)).f154257T0 - this.f35511H;
        int q1 = mo12034q1(list);
        if (this.f35506C.getItemCount() <= 0) {
            return;
        }
        if (z) {
            mo12024f1().post(new C12329d0(this, q1));
        } else if (j > 0) {
            mo12031n1(j);
        }
    }

    /* renamed from: q1 */
    public final int mo12034q1(List<C0581o5> list) {
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = -1;
        if (!mo12024f1().isShown()) {
            this.f35516M = false;
            Log.m105924i("Finder.LiveCommentPlugin", "[updateComments] RecyclerView is invisible, return");
            return d0Var.f27483d;
        }
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            int size = list.size();
            C61926c.m72700y(list, C12331e0.f35545d);
            int size2 = list.size();
            Log.m105924i("Finder.LiveCommentPlugin", "updateComments  before size:" + size + " afterSize:" + size2);
        }
        C54248l.m60949a(new C12335g0(this, list), false).mo75045a(new C12333f0(this, list, d0Var));
        return d0Var.f27483d;
    }

    /* renamed from: r1 */
    public final void mo12035r1(List<C0581o5> list, boolean z, boolean z2) {
        Class cls = C54991o.class;
        if (!(list == null || list.isEmpty()) && (C87412m.m108589b(((C54991o) mo87696x0(cls)).f154288Z1, Boolean.TRUE) || !z)) {
            mo12033p1(list);
        }
        if (!z2 && C87412m.m108589b(((C54991o) mo87696x0(cls)).f154288Z1, Boolean.TRUE) && ((C54991o) mo87696x0(cls)).f154287Z0 != 2) {
            C10333o e1 = mo12023e1();
            List<C0581o5> list2 = ((C0702z0) mo87696x0(C0702z0.class)).f1673g;
            C87412m.m108593f(list2, "business(LiveMsgSlice::c…ss.java).bulletCommetList");
            e1.getClass();
            C61926c.m72668M(new C10344t(e1, list2, true));
        }
        if (z && (!list.isEmpty())) {
            mo12020b1();
        }
    }

    /* renamed from: t1 */
    public final void mo12036t1(List<C0581o5> list) {
        Class cls = C0702z0.class;
        if ((list == null || list.isEmpty()) || ((C0702z0) mo87696x0(cls)).f1677n == -1) {
            Log.m105924i("Finder.LiveCommentPlugin", "[updateMessagesOnViewAttach] curVisiableFirstPosition:" + ((C0702z0) mo87696x0(cls)).f1678o);
            return;
        }
        mo12024f1().post(new C12337h0(list, this));
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C0702z0.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        boolean z = true;
        int i = 0;
        if (ordinal == 7) {
            if (((C54991o) mo87696x0(C54991o.class)).f154370u) {
                if (bundle == null || !bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW")) {
                    z = false;
                }
                if (z || mo82893g0()) {
                    List<C0581o5> list = ((C0702z0) mo87696x0(cls)).f1672f;
                    C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
                    mo12036t1(list);
                }
            }
            this.f35524V = System.currentTimeMillis();
        } else if (ordinal == 21) {
            mo12029l1();
        } else if (ordinal == 33) {
            mo12027i1();
            mo12024f1().postDelayed(new C12471j5(this), 100);
            this.f35505B = false;
        } else if (ordinal == 39) {
            if (bundle != null) {
                i = bundle.getBoolean("PARAM_IS_ENTERING_COMMENT");
            }
            this.f35514K = i ^ true;
        } else if (ordinal == 115) {
            if (bundle != null) {
                i = bundle.getInt("PARAM_FINDER_LIVE_COMMENT_MOVE_DISTANCE");
            }
            Log.m105924i("Finder.LiveCommentPlugin", "comment move distance:" + i + ",has change:" + this.f35509F);
            boolean z2 = this.f35509F;
            if ((!z2 && i > 0) || (z2 && i < 0)) {
                this.f35509F = !z2;
                ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += i;
                this.f166287d.requestLayout();
            }
        } else if (ordinal != 169) {
            switch (ordinal) {
                case 122:
                case 123:
                    if (bundle != null) {
                        String string = bundle.getString("PARAM_FINDER_LIVE_COMMENT");
                        if (string == null) {
                            string = "";
                        }
                        List<C0581o5> list2 = ((C0702z0) mo87696x0(cls)).f1672f;
                        C87412m.m108593f(list2, "business(LiveMsgSlice::class.java).msgList");
                        C64175a0.m75512t(list2, new C12324a0(string));
                        C61926c.m72668M(new C12325b0(this));
                        return;
                    }
                    return;
                case 124:
                    if (bundle != null) {
                        i = bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR");
                    }
                    if (i != 0) {
                        mo12029l1();
                        return;
                    }
                    List<C0581o5> list3 = ((C0702z0) mo87696x0(cls)).f1672f;
                    C87412m.m108593f(list3, "business(LiveMsgSlice::class.java).msgList");
                    mo12036t1(list3);
                    return;
                default:
                    return;
            }
        } else {
            boolean z3 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z4 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
            if (((C54963d0) mo87696x0(C54963d0.class)).mo75929l3().size() <= 0) {
                z = false;
            }
            Log.m105924i("Finder.LiveCommentPlugin", "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z3 + ", isShareMode:" + z4 + ", isLinkMic: " + z);
            if (!z3) {
                mo12019a1(false);
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C41573e3.f111902a.mo64658a();
        mo12029l1();
        this.f35514K = true;
        this.f35516M = true;
        mo12023e1().mo10634f(4);
        C0540g1 c3 = ((C16004c) mo87684A0().mo71262a(C16004c.class)).mo14629c3();
        c3.f1311b = MAlarmHandler.NEXT_FIRE_INTERVAL;
        c3.f1312c = -1;
        c3.f1313d = Long.MIN_VALUE;
        c3.f1314e = false;
        c3.f1315f = true;
        c3.f1318i = null;
        c3.f1317h = null;
        ((C10346v) ((C36570n) this.f35508E).getValue()).mo10644e();
    }
}
