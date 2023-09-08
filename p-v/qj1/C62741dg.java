package qj1;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import al1.C54130j;
import android.animation.Animator;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.C0120a0;
import cl1.C0668l;
import cl1.C0700z;
import cl1.C54951d;
import cl1.C54963d0;
import cl1.C54985m;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.cheer.CheerCountDownView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C33359x8;
import il1.C60424h8;
import il1.C60443j8;
import il1.C60481o8;
import il1.C60491p4;
import il1.C60520s6;
import il1.C60526t5;
import il1.C60528t6;
import il1.C60532u8;
import il1.C60539w8;
import il1.C60556y8;
import il1.C8996g8;
import il1.C9117t8;
import j20.C117292a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import o40.C61926c;
import org.libpag.PAGView;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;
import rl1.C13021d;
import rx3.C13598b0;
import sp1.C13764a;
import sp1.C64107n0;
import sp1.C64117o0;
import sp1.C64121q0;
import sp1.C64123r0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C64740tw0;
import ug1.C14189a;
import us1.C14380b;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: qj1.dg */
public final class C62741dg extends C62660c {

    /* renamed from: A */
    public final C14380b f178119A;

    /* renamed from: B */
    public String f178120B;

    /* renamed from: p */
    public final C58124b f178121p;

    /* renamed from: q */
    public final String f178122q = "Finder.FinderLiveVisitorBottomOptionPlugin";

    /* renamed from: r */
    public C64121q0 f178123r;

    /* renamed from: s */
    public final C60532u8 f178124s;

    /* renamed from: t */
    public final C60424h8 f178125t;

    /* renamed from: u */
    public final C60526t5 f178126u;

    /* renamed from: v */
    public final C8996g8 f178127v;

    /* renamed from: w */
    public final C9117t8 f178128w;

    /* renamed from: x */
    public final C60528t6 f178129x;

    /* renamed from: y */
    public final C60556y8 f178130y;

    /* renamed from: z */
    public final C13021d f178131z;

    /* renamed from: qj1.dg$f */
    public static final class C12313f<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f35476d;

        public C12313f(C62741dg dgVar) {
            this.f35476d = dgVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f35476d.f178127v.mo9805a();
        }
    }

    /* renamed from: qj1.dg$a */
    public static final class C62742a implements C107204q {

        /* renamed from: a */
        public static final C62742a f178132a = new C62742a();

        /* renamed from: a */
        public final C107179f0 mo12075a(View view, C107179f0 f0Var) {
            return C107207u.m145167h(view, f0Var);
        }
    }

    /* renamed from: qj1.dg$b */
    public static final class C62743b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f178133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62743b(C62741dg dgVar) {
            super(1);
            this.f178133d = dgVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f178133d.f178120B = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.dg$c */
    public static final class C62744c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f178134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62744c(C62741dg dgVar) {
            super(1);
            this.f178134d = dgVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f178134d.f178120B = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.dg$d */
    public static final class C62745d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f178135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62745d(C62741dg dgVar) {
            super(0);
            this.f178135d = dgVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
            if (r5 == null) goto L_0x0056;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                qj1.dg r0 = r11.f178135d
                il1.u8 r0 = r0.f178124s
                java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
                qj1.c r2 = r0.f172538f
                androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
                cl1.d0 r2 = (cl1.C54963d0) r2
                boolean r2 = r2.mo75914V3()
                if (r2 == 0) goto L_0x0056
                qj1.c r2 = r0.f172538f
                androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
                cl1.d0 r2 = (cl1.C54963d0) r2
                java.util.List<al1.j> r2 = r2.f154074q
                java.lang.String r3 = "basePlugin.business(Live…).audienceLinkMicUserList"
                gy3.C87412m.m108593f(r2, r3)
                monitor-enter(r2)
                java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0053 }
            L_0x0028:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0053 }
                r5 = 0
                if (r4 == 0) goto L_0x004f
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0053 }
                r6 = r4
                al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x0053 }
                if (r6 == 0) goto L_0x003a
                java.lang.String r5 = r6.f151997a     // Catch:{ all -> 0x0053 }
            L_0x003a:
                qj1.c r6 = r0.f172538f     // Catch:{ all -> 0x0053 }
                java.lang.Class<cl1.o> r7 = cl1.C54991o.class
                androidx.lifecycle.i0 r6 = r6.mo87696x0(r7)     // Catch:{ all -> 0x0053 }
                cl1.o r6 = (cl1.C54991o) r6     // Catch:{ all -> 0x0053 }
                java.lang.String r6 = r6.mo76015n4()     // Catch:{ all -> 0x0053 }
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0053 }
                if (r5 == 0) goto L_0x0028
                r5 = r4
            L_0x004f:
                monitor-exit(r2)
                if (r5 != 0) goto L_0x0064
                goto L_0x0056
            L_0x0053:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0056:
                qj1.c r2 = r0.f172538f
                androidx.lifecycle.i0 r1 = r2.mo87696x0(r1)
                cl1.d0 r1 = (cl1.C54963d0) r1
                boolean r1 = r1.mo75913U3()
                if (r1 == 0) goto L_0x0091
            L_0x0064:
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f172542j
                android.view.ViewGroup r2 = r0.f172536d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131099927(0x7f060117, float:1.7812221E38)
                int r2 = r2.getColor(r3)
                r1.setIconColor(r2)
                android.view.View r1 = r0.f172541i
                android.view.ViewGroup r0 = r0.f172536d
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131232769(0x7f080801, float:1.8081657E38)
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
                r1.setBackground(r0)
                goto L_0x0105
            L_0x0091:
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f172542j
                android.view.ViewGroup r2 = r0.f172536d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131099704(0x7f060038, float:1.7811769E38)
                int r2 = r2.getColor(r3)
                r1.setIconColor(r2)
                android.view.View r1 = r0.f172541i
                android.view.ViewGroup r2 = r0.f172536d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131232768(0x7f080800, float:1.8081655E38)
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
                r1.setBackground(r2)
                android.view.View r0 = r0.f172543n
                if (r0 != 0) goto L_0x00c2
                goto L_0x0105
            L_0x00c2:
                r1 = 8
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.mo10233c(r1)
                java.lang.Object[] r4 = r2.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget"
                java.lang.String r6 = "checkLinkMicGroup"
                java.lang.String r7 = "()V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r0
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                r1 = 0
                java.lang.Object r1 = r2.mo10231a(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r4 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget"
                java.lang.String r5 = "checkLinkMicGroup"
                java.lang.String r6 = "()V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            L_0x0105:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62741dg.C62745d.invoke():java.lang.Object");
        }
    }

    /* renamed from: qj1.dg$e */
    public static final class C62746e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f178136d;

        public C62746e(C62741dg dgVar) {
            this.f178136d = dgVar;
        }

        public final void run() {
            C60491p4 p4Var;
            C63084w6 w6Var = (C63084w6) this.f178136d.mo87687E0(C63084w6.class);
            if (w6Var != null && (p4Var = w6Var.f179023q) != null) {
                p4Var.mo85451g();
            }
        }
    }

    /* renamed from: qj1.dg$g */
    public static final class C62747g<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f178137d;

        public C62747g(C62741dg dgVar) {
            this.f178137d = dgVar;
        }

        public void onChanged(Object obj) {
            boolean z;
            long j;
            int i;
            int i2;
            C54985m.C54987c cVar = (C54985m.C54987c) obj;
            Class cls = C54991o.class;
            if (cVar != null && cVar.f154169b) {
                ((C54991o) this.f178137d.mo87696x0(cls)).f154278X1.f1589e = 2;
                C62741dg dgVar = this.f178137d;
                C64740tw0 tw02 = cVar.f154168a;
                dgVar.mo87751d1(new C54985m.C0671b(tw02.f185685d, tw02.f185686e, tw02.f185687f ? 1 : 0));
            } else {
                ((C54991o) this.f178137d.mo87696x0(cls)).f154278X1.f1589e = 0;
                C62741dg dgVar2 = this.f178137d;
                dgVar2.mo87751d1(((C54985m) dgVar2.mo87696x0(C54985m.class)).f154166q);
            }
            C60424h8 h8Var = this.f178137d.f178125t;
            Log.m105924i(h8Var.f172287r, "showCheerAnimation data: " + cVar);
            C13598b0 b0Var = null;
            if (cVar != null) {
                if (cVar.f154169b) {
                    LinkedList<String> linkedList = cVar.f154168a.f185690i;
                    C87412m.m108593f(linkedList, "it.animationInfo.color");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (String str : linkedList) {
                        try {
                            i2 = Color.parseColor(str);
                        } catch (Throwable unused) {
                            Log.m105920e(h8Var.f172287r, "changeCheerLikeBg exception: " + str);
                            i2 = 0;
                        }
                        arrayList.add(Integer.valueOf(i2));
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BR_TL, C110818d0.m150952x0(arrayList));
                    gradientDrawable.setGradientType(0);
                    gradientDrawable.setShape(1);
                    h8Var.f172295z.setImageDrawable(gradientDrawable);
                    boolean z2 = h8Var.f172294y.getVisibility() == 8;
                    CheerCountDownView cheerCountDownView = h8Var.f172294y;
                    C53973z1 z1Var = cheerCountDownView.f159293h;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    cheerCountDownView.f159295j = 360.0f;
                    CheerCountDownView cheerCountDownView2 = h8Var.f172294y;
                    LinkedList<String> linkedList2 = cVar.f154168a.f185690i;
                    C87412m.m108593f(linkedList2, "");
                    Collections.reverse(linkedList2);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    cheerCountDownView2.getClass();
                    cheerCountDownView2.f159296n = 3.0f;
                    cheerCountDownView2.mo77562a();
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (String str2 : linkedList2) {
                        try {
                            i = Color.parseColor(str2);
                        } catch (Throwable unused2) {
                            Log.m105920e("CheerCountDownView", "setCheerCountDown exception: " + str2);
                            i = 0;
                        }
                        arrayList2.add(Integer.valueOf(i));
                    }
                    cheerCountDownView2.f159291f = C110818d0.m150952x0(arrayList2);
                    cheerCountDownView2.requestLayout();
                    CheerCountDownView cheerCountDownView3 = h8Var.f172294y;
                    long j2 = cVar.f154168a.f185692n * 1000;
                    C60481o8 o8Var = new C60481o8(h8Var);
                    cheerCountDownView3.getClass();
                    Log.m105920e("CheerCountDownView", "startCountDown duration: " + j2 + " lineWidth: " + cheerCountDownView3.f159296n);
                    if (j2 <= 0) {
                        j = 1000;
                    } else {
                        cheerCountDownView3.f159295j = 360.0f;
                        j = 1000;
                        cheerCountDownView3.f159293h = C53895h.m60466d(cheerCountDownView3.f159292g, (C66212f) null, (C53934p0) null, new C14189a(j2, cheerCountDownView3, o8Var, (C15601d<? super C14189a>) null), 3, (Object) null);
                    }
                    if (((C54951d) h8Var.f172286q.mo87696x0(C54951d.class)).mo75869e3()) {
                        h8Var.f172295z.setAlpha(0.0f);
                        h8Var.f172294y.setAlpha(0.0f);
                    } else if (z2) {
                        h8Var.f172295z.setAlpha(0.0f);
                        h8Var.f172294y.setAlpha(0.0f);
                        h8Var.f172295z.animate().alpha(1.0f).setDuration(j).setListener((Animator.AnimatorListener) null).start();
                        h8Var.f172294y.animate().alpha(1.0f).setDuration(j).setListener((Animator.AnimatorListener) null).start();
                    } else {
                        h8Var.f172294y.setAlpha(1.0f);
                        h8Var.f172295z.setAlpha(1.0f);
                    }
                    h8Var.f172294y.setVisibility(0);
                    h8Var.f172295z.setVisibility(0);
                    z = true;
                } else {
                    z = true;
                    h8Var.mo85396Z0(true);
                }
                b0Var = C13598b0.f38549a;
            } else {
                z = true;
            }
            if (b0Var == null) {
                h8Var.mo85396Z0(z);
            }
        }
    }

    /* renamed from: qj1.dg$h */
    public static final class C62748h<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62741dg f178138d;

        /* renamed from: qj1.dg$h$a */
        public /* synthetic */ class C62749a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f178139a;

            static {
                int[] iArr = new int[C54951d.C54952a.values().length];
                iArr[4] = 1;
                iArr[2] = 2;
                iArr[1] = 3;
                iArr[3] = 4;
                f178139a = iArr;
            }
        }

        public C62748h(C62741dg dgVar) {
            this.f178138d = dgVar;
        }

        public void onChanged(Object obj) {
            C54951d.C54952a aVar = (C54951d.C54952a) obj;
            String str = this.f178138d.f178122q;
            Log.m105924i(str, "onVideoPlayStateChange: " + aVar);
            int i = aVar == null ? -1 : C62749a.f178139a[aVar.ordinal()];
            if (i == 1 || i == 2) {
                C60424h8 h8Var = this.f178138d.f178125t;
                h8Var.f172295z.setAlpha(1.0f);
                h8Var.f172294y.setAlpha(1.0f);
            } else if (i == 3 || i == 4) {
                C60424h8 h8Var2 = this.f178138d.f178125t;
                h8Var2.f172295z.setAlpha(0.0f);
                h8Var2.f172294y.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62741dg(ViewGroup viewGroup, C58124b bVar, ViewGroup viewGroup2) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(viewGroup2, "rootParent");
        this.f178121p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.jjn);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.s…pping_entrance_container)");
        this.f178123r = new C64107n0((ViewGroup) findViewById, bVar, this);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fou);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.link_entrance_container)");
        this.f178124s = new C60532u8((ViewGroup) findViewById2, bVar, this);
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.ks4);
        C87412m.m108593f(findViewById3, "rootParent.findViewById(…visitor_like_entrance_ui)");
        C60424h8 h8Var = new C60424h8((ViewGroup) findViewById3, bVar, this);
        this.f178125t = h8Var;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.mtw);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.multi_stream_container)");
        this.f178126u = new C60526t5((ViewGroup) findViewById4, bVar, this);
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.eph);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.gift_entrance_container)");
        this.f178127v = new C8996g8((ViewGroup) findViewById5, bVar, this);
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.dr4);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…money_entrance_container)");
        this.f178128w = new C9117t8((ViewGroup) findViewById6, bVar, this);
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.dld);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.f…_team_entrance_container)");
        this.f178129x = new C60528t6((ViewGroup) findViewById7, bVar, this);
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.le8);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.vr_entrance_container)");
        this.f178130y = new C60556y8((ViewGroup) findViewById8, bVar, this);
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.g7p);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.lottery_entrance_container)");
        this.f178131z = new C13021d((ViewGroup) findViewById9, bVar, this);
        View findViewById10 = viewGroup.findViewById(C0966R.C0970id.nhb);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.vote_entrance)");
        this.f178119A = new C14380b((ViewGroup) findViewById10, bVar, this);
        this.f178120B = ((C54991o) mo87696x0(C54991o.class)).f154278X1.f1587c;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C62742a aVar = C62742a.f178132a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145236u(viewGroup, aVar);
        h8Var.mo85397a1(this.f178120B, new C62743b(this));
        mo87751d1(((C54985m) mo87696x0(C54985m.class)).f154166q);
    }

    /* renamed from: U0 */
    public void mo12048U0() {
        if (((C54991o) mo87696x0(C54991o.class)).f154190D) {
            Log.m105924i(this.f178122q, "init anchor shop entrance");
            View findViewById = this.f166287d.findViewById(C0966R.C0970id.jjn);
            C87412m.m108593f(findViewById, "root.findViewById(R.id.s…pping_entrance_container)");
            this.f178123r = new C13764a((ViewGroup) findViewById, this.f178121p, this);
        }
        ((C54985m) mo87696x0(C54985m.class)).f154164o.observe(this, new C62747g(this));
        ((C54951d) mo87696x0(C54951d.class)).f154007o.observe(this, new C62748h(this));
    }

    /* renamed from: Z0 */
    public final void mo87747Z0(boolean z) {
        Class cls = C54991o.class;
        String str = ((C54991o) mo87696x0(cls)).f154278X1.f1587c;
        String str2 = this.f178122q;
        Log.m105924i(str2, "checkCheerIcon, new:" + str + " old:" + this.f178120B);
        if (((C54991o) mo87696x0(cls)).f154278X1.f1588d == 0) {
            this.f178125t.mo85397a1("", (C32226l<? super Boolean, C13598b0>) null);
            this.f178120B = null;
        } else if (!Util.isEqual(this.f178120B, str) || z) {
            this.f178120B = str;
            this.f178125t.mo85397a1(str, new C62744c(this));
        }
    }

    /* renamed from: a1 */
    public final void mo87748a1() {
        C61926c.m72668M(new C62745d(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [sp1.q0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x022d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87749b1(boolean r10) {
        /*
            r9 = this;
            java.lang.Class<cl1.l> r0 = cl1.C0668l.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            sp1.q0 r2 = r9.f178123r
            androidx.lifecycle.i0 r3 = r9.mo87696x0(r0)
            cl1.l r3 = (cl1.C0668l) r3
            boolean r3 = r3.mo632i3()
            r2.mo13128f(r3)
            androidx.lifecycle.i0 r2 = r9.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154190D
            r3 = 0
            r4 = 8
            if (r2 == 0) goto L_0x002b
            rl1.d r2 = r9.f178131z
            r2.mo12531d(r3)
            us1.b r2 = r9.f178119A
            r2.mo13684a(r3)
            goto L_0x0035
        L_0x002b:
            rl1.d r2 = r9.f178131z
            r2.mo12531d(r4)
            us1.b r2 = r9.f178119A
            r2.mo13684a(r4)
        L_0x0035:
            il1.u8 r2 = r9.f178124s
            androidx.lifecycle.i0 r5 = r9.mo87696x0(r1)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.f154287Z0
            r6 = 1
            if (r5 == r6) goto L_0x0044
            r5 = 1
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            r2.mo85499c(r5)
            il1.g8 r2 = r9.f178127v
            androidx.lifecycle.i0 r5 = r9.mo87696x0(r1)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.f154287Z0
            if (r5 == r6) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r2.mo9806b(r5)
            il1.h8 r2 = r9.f178125t
            qj1.c r5 = r2.f172286q
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154190D
            if (r5 != 0) goto L_0x0078
            qj1.c r5 = r2.f172286q
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154178A
            if (r5 == 0) goto L_0x0078
            r2.mo10792g(r3)
            goto L_0x007b
        L_0x0078:
            r2.mo10792g(r4)
        L_0x007b:
            il1.y8 r2 = r9.f178130y
            androidx.lifecycle.i0 r5 = r9.mo87696x0(r0)
            cl1.l r5 = (cl1.C0668l) r5
            boolean r5 = r5.mo632i3()
            if (r5 == 0) goto L_0x00c0
            qj1.c r5 = r2.f172603f
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154190D
            if (r5 != 0) goto L_0x00c0
            qj1.c r5 = r2.f172603f
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r1)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo76007j4()
            if (r5 == 0) goto L_0x00c0
            android.view.ViewGroup r5 = r2.f172601d
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L_0x00ba
            java.lang.Class<ak1.w> r5 = ak1.C54116w.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ak1.w r5 = (ak1.C54116w) r5
            java.lang.String r7 = java.lang.String.valueOf(r6)
            r5.Cy0(r7)
        L_0x00ba:
            android.view.ViewGroup r2 = r2.f172601d
            r2.setVisibility(r3)
            goto L_0x00c5
        L_0x00c0:
            android.view.ViewGroup r2 = r2.f172601d
            r2.setVisibility(r4)
        L_0x00c5:
            il1.t5 r2 = r9.f178126u
            androidx.lifecycle.i0 r5 = r9.mo87696x0(r0)
            cl1.l r5 = (cl1.C0668l) r5
            boolean r5 = r5.mo632i3()
            r2.mo85493a(r5)
            androidx.lifecycle.i0 r2 = r9.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75997d4()
            if (r2 != 0) goto L_0x016a
            il1.y8 r2 = r9.f178130y
            android.view.ViewGroup r2 = r2.f172601d
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00ec
            r2 = 1
            goto L_0x00ed
        L_0x00ec:
            r2 = 0
        L_0x00ed:
            if (r2 != 0) goto L_0x0163
            il1.t5 r2 = r9.f178126u
            android.view.ViewGroup r2 = r2.f172514a
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            if (r2 != 0) goto L_0x0163
            il1.t6 r2 = r9.f178129x
            android.view.ViewGroup r2 = r2.f172521a
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x010a
            r2 = 1
            goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            if (r2 != 0) goto L_0x0163
            sp1.q0 r2 = r9.f178123r
            boolean r2 = r2.isVisible()
            if (r2 != 0) goto L_0x0163
            il1.u8 r2 = r9.f178124s
            android.view.ViewGroup r2 = r2.f172536d
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0121
            r2 = 1
            goto L_0x0122
        L_0x0121:
            r2 = 0
        L_0x0122:
            if (r2 != 0) goto L_0x0163
            il1.h8 r2 = r9.f178125t
            android.view.ViewGroup r2 = r2.f166287d
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0130
            r2 = 1
            goto L_0x0131
        L_0x0130:
            r2 = 0
        L_0x0131:
            if (r2 != 0) goto L_0x0163
            il1.g8 r2 = r9.f178127v
            android.view.ViewGroup r2 = r2.f28427a
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x013f
            r2 = 1
            goto L_0x0140
        L_0x013f:
            r2 = 0
        L_0x0140:
            if (r2 != 0) goto L_0x0163
            rl1.d r2 = r9.f178131z
            android.view.ViewGroup r2 = r2.f37084a
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x014e
            r2 = 1
            goto L_0x014f
        L_0x014e:
            r2 = 0
        L_0x014f:
            if (r2 != 0) goto L_0x0163
            us1.b r2 = r9.f178119A
            android.view.ViewGroup r2 = r2.f39942a
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            if (r2 == 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r2 = 0
            goto L_0x0164
        L_0x0163:
            r2 = 1
        L_0x0164:
            if (r2 == 0) goto L_0x016a
            r9.mo10792g(r3)
            goto L_0x016d
        L_0x016a:
            r9.mo10792g(r4)
        L_0x016d:
            zt3.t r2 = zt3.C119157j.f356862d
            qj1.dg$e r5 = new qj1.dg$e
            r5.<init>(r9)
            r7 = 200(0xc8, double:9.9E-322)
            zt3.j r2 = (zt3.C119157j) r2
            r2.getClass()
            r2.mo183892w(r5, r7, r3)
            if (r10 == 0) goto L_0x01e0
            java.lang.String r10 = r9.f178122q
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "bottom options [shopping:"
            r2.append(r5)
            sp1.q0 r5 = r9.f178123r
            boolean r5 = r5.isVisible()
            r2.append(r5)
            java.lang.String r5 = ", linkMic:"
            r2.append(r5)
            il1.u8 r5 = r9.f178124s
            android.view.ViewGroup r5 = r5.f172536d
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x01a6
            r5 = 1
            goto L_0x01a7
        L_0x01a6:
            r5 = 0
        L_0x01a7:
            r2.append(r5)
            java.lang.String r5 = ", gift:"
            r2.append(r5)
            il1.g8 r5 = r9.f178127v
            android.view.ViewGroup r5 = r5.f28427a
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x01bb
            r5 = 1
            goto L_0x01bc
        L_0x01bb:
            r5 = 0
        L_0x01bc:
            r2.append(r5)
            java.lang.String r5 = ", like:"
            r2.append(r5)
            il1.h8 r5 = r9.f178125t
            android.view.ViewGroup r5 = r5.f166287d
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x01d0
            r5 = 1
            goto L_0x01d1
        L_0x01d0:
            r5 = 0
        L_0x01d1:
            r2.append(r5)
            r5 = 93
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
        L_0x01e0:
            java.lang.Class<cl1.j> r10 = cl1.C39975j.class
            androidx.lifecycle.i0 r10 = r9.mo87696x0(r10)
            cl1.j r10 = (cl1.C39975j) r10
            boolean r10 = r10.mo62578e3()
            r2 = 0
            if (r10 == 0) goto L_0x0284
            androidx.lifecycle.i0 r10 = r9.mo87696x0(r0)
            cl1.l r10 = (cl1.C0668l) r10
            boolean r10 = r10.mo632i3()
            if (r10 == 0) goto L_0x0284
            sp1.q0 r10 = r9.f178123r
            r10.mo13129g(r4)
            il1.t5 r10 = r9.f178126u
            android.view.ViewGroup r10 = r10.f172514a
            r10.setVisibility(r4)
            il1.t5 r10 = r9.f178126u
            r10.f172517d = r6
            rl1.d r10 = r9.f178131z
            r10.mo12531d(r4)
            us1.b r10 = r9.f178119A
            r10.mo13684a(r4)
            il1.u8 r10 = r9.f178124s
            r10.mo85500d(r4)
            il1.g8 r10 = r9.f178127v
            r10.getClass()
            java.lang.Class<ky2.i> r0 = ky2.C10432i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ky2.i r0 = (ky2.C10432i) r0
            boolean r0 = r0.mo10750e()
            if (r0 != 0) goto L_0x0269
            zc1.b r0 = zc1.C66785b.f191882e
            bd1.b r0 = zc1.C66783a.C66784a.m78800c(r0, r3, r6, r2)
            if (r0 == 0) goto L_0x023c
            boolean r0 = r0.mo75252n2()
            if (r0 != r6) goto L_0x023c
            r3 = 1
        L_0x023c:
            if (r3 == 0) goto L_0x023f
            goto L_0x0269
        L_0x023f:
            ok1.e r0 = ok1.C62042e.f176370a
            qj1.c r3 = r10.f28429c
            fj1.b r3 = r3.mo87684A0()
            boolean r0 = r0.mo87057Y0(r3)
            if (r0 != 0) goto L_0x0263
            qj1.c r0 = r10.f28429c
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75963I3()
            if (r0 == 0) goto L_0x0263
            qj1.c r0 = r10.f28429c
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
            cl1.o r0 = (cl1.C54991o) r0
        L_0x0263:
            android.view.ViewGroup r10 = r10.f28427a
            r10.setVisibility(r4)
            goto L_0x0276
        L_0x0269:
            android.view.ViewGroup r10 = r10.f28427a
            r10.setVisibility(r4)
            java.lang.String r10 = "Finder.FinderLiveVisitorGiftWidget"
            java.lang.String r0 = "setVisible return for isTeenMode or accountLimit"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0276:
            il1.y8 r10 = r9.f178130y
            android.view.ViewGroup r10 = r10.f172601d
            r10.setVisibility(r4)
            il1.t6 r10 = r9.f178129x
            android.view.ViewGroup r10 = r10.f172521a
            r10.setVisibility(r4)
        L_0x0284:
            sp1.q0 r10 = r9.f178123r
            boolean r0 = r10 instanceof sp1.C64123r0
            if (r0 == 0) goto L_0x028d
            r2 = r10
            sp1.r0 r2 = (sp1.C64123r0) r2
        L_0x028d:
            if (r2 == 0) goto L_0x0292
            r2.mo88854a()
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62741dg.mo87749b1(boolean):void");
    }

    /* renamed from: c1 */
    public final void mo87750c1(int i) {
        this.f178124s.mo85498b(i);
    }

    /* renamed from: d1 */
    public final void mo87751d1(C54985m.C0671b bVar) {
        Class cls = C54991o.class;
        String str = this.f178122q;
        Log.m105924i(str, "updateCheerInfos " + bVar);
        if (bVar != null) {
            ((C54991o) mo87696x0(cls)).mo75972M4(bVar.f1580a, bVar.f1581b, bVar.f1582c);
            C63049v9 v9Var = (C63049v9) mo87687E0(C63049v9.class);
            if (v9Var != null) {
                v9Var.mo87991f1(((C54991o) mo87696x0(cls)).f154278X1.f1586b);
            }
            mo87747Z0(false);
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        C64121q0 q0Var = this.f178123r;
        C64123r0 r0Var = q0Var instanceof C64123r0 ? (C64123r0) q0Var : null;
        if (r0Var != null) {
            r0Var.mo88855c(this.f166287d.getVisibility());
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        C64121q0 q0Var = this.f178123r;
        C64107n0 n0Var = q0Var instanceof C64107n0 ? (C64107n0) q0Var : null;
        if (n0Var != null) {
            View i = n0Var.mo88858i();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(i, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget", "onMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(i, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget", "onMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C64117o0 o0Var = C64107n0.f181767k;
            o0Var.f181788d = new SoftReference<>(n0Var);
            o0Var.f181789e = new SoftReference<>(n0Var.f181770c);
            o0Var.f181790f = new SoftReference<>(n0Var.f181768a);
            n0Var.f181768a.getViewTreeObserver().removeOnGlobalLayoutListener(o0Var);
            n0Var.f181768a.getViewTreeObserver().addOnGlobalLayoutListener(o0Var);
        }
        C60528t6 t6Var = this.f178129x;
        ((C54991o) t6Var.f172523c.mo87696x0(C54991o.class)).f154290Z3.observe(t6Var.f172523c, new C60520s6(t6Var));
        ((C0700z) mo87696x0(C0700z.class)).f1665q.observe(this, new C12313f(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        T t;
        Class cls = C54991o.class;
        C87412m.m108594g(linkedHashMap, "micUserMap");
        List<C54130j> list = ((C54963d0) mo87696x0(C54963d0.class)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) mo87696x0(cls)).mo76015n4())) {
                    break;
                }
            }
        }
        if (t == null) {
            this.f178128w.mo9932a(8);
        } else if (!((C54991o) mo87696x0(cls)).mo75965J3() || ((C54991o) mo87696x0(cls)).mo75986U3().f183215f != 1) {
            this.f178128w.mo9932a(8);
        } else {
            this.f178128w.mo9932a(0);
        }
    }

    /* renamed from: o0 */
    public void mo82895o0(int i, int i2, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (i2 == hashCode()) {
            C60532u8 u8Var = this.f178124s;
            u8Var.getClass();
            if (i == 80) {
                if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                    String str = u8Var.f172539g;
                    Log.m105924i(str, "FinderLive request permission " + i + " failed");
                    C76879j.m92709C(u8Var.f172536d.getContext(), u8Var.f172536d.getContext().getResources().getString(C0966R.string.f361130hi2), u8Var.f172536d.getContext().getResources().getString(C0966R.string.hif), u8Var.f172536d.getContext().getResources().getString(C0966R.string.fyd), u8Var.f172536d.getContext().getResources().getString(C0966R.string.f7926wf), false, new C60539w8(u8Var), C33359x8.f90411d);
                    return;
                }
                Log.m105924i(u8Var.f172539g, "onRequestPermissionsResult microphone granted");
                u8Var.mo85498b(u8Var.f172544o);
            }
        }
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            mo12048U0();
        } else if (ordinal == 118) {
            this.f178124s.mo85499c(!((C54991o) mo87696x0(cls)).mo76004h4());
            this.f178127v.mo9806b(!((C54991o) mo87696x0(cls)).mo76004h4());
            this.f178126u.mo85493a(((C0668l) mo87696x0(C0668l.class)).mo632i3());
        } else if (ordinal == 218) {
            mo87749b1(true);
        } else if (ordinal == 142) {
            C60424h8 h8Var = this.f178125t;
            Animation loadAnimation = AnimationUtils.loadAnimation(h8Var.f166287d.getContext(), C0966R.C0968anim.f2339a4);
            ViewGroup viewGroup = h8Var.f166287d;
            if (viewGroup != null) {
                viewGroup.startAnimation(loadAnimation);
            }
        } else if (ordinal == 143) {
            C60424h8 h8Var2 = this.f178125t;
            h8Var2.getClass();
            C61926c.m72668M(new C60443j8(h8Var2, true));
        }
    }

    /* renamed from: v0 */
    public void mo12287v0() {
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178120B = null;
        C64121q0 q0Var = this.f178123r;
        if (q0Var instanceof C64107n0) {
            C87412m.m108592e(q0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.FinderLiveVisitorShoppingEntranceWidget");
            C64107n0 n0Var = (C64107n0) q0Var;
            C64117o0 o0Var = C64107n0.f181767k;
            o0Var.f181788d = null;
            o0Var.f181789e = null;
            o0Var.f181790f = null;
            n0Var.mo88858i().animate().cancel();
            PAGView pAGView = n0Var.f181772e;
            if (pAGView != null) {
                n0Var.mo88859j(pAGView);
            }
            n0Var.f181777j.stop();
            n0Var.mo13129g(8);
        } else if (q0Var instanceof C13764a) {
            C87412m.m108592e(q0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.FinderLiveAnchorShoppingEntranceWidget");
            ((C13764a) q0Var).f38875h.stop();
        }
        this.f178126u.f172517d = true;
        this.f178125t.mo3211w0();
    }
}
