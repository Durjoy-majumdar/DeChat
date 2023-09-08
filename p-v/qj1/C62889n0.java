package qj1;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53934p0;
import a70.C112760b;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import b50.C54405b;
import cj1.C54763g6;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.controller.C3135xf7c5b95d;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d50.C58112f;
import d50.C58114h;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import ei1.C58602a;
import er1.C7919x;
import f40.C86709a0;
import fe1.C58969q;
import fh1.C8044g;
import fh1.C8048h;
import fh1.C8061k;
import fh1.C8062l;
import fh1.C8064m;
import fh1.C8065n;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import il1.C60398g1;
import il1.C60413h1;
import il1.C60466o1;
import il1.C60557z1;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import k50.C60971a;
import nj3.C76912y0;
import nk1.C11207i;
import nk1.C61791o;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import qg1.C47826f;
import qo3.C12925w;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C48928bz0;
import te3.C64274c60;
import te3.C64586nn1;
import te3.C64756up2;
import te3.C64807wo2;
import w50.C65933h;
import wx3.C15601d;
import wx3.C66212f;
import xh1.C15685d;
import zj1.C16217b;

/* renamed from: qj1.n0 */
public final class C62889n0 extends C62660c implements View.OnClickListener {

    /* renamed from: A */
    public final ViewGroup f178442A;

    /* renamed from: B */
    public final View f178443B;

    /* renamed from: C */
    public final View f178444C;

    /* renamed from: D */
    public final RelativeLayout f178445D;

    /* renamed from: E */
    public final ViewGroup f178446E;

    /* renamed from: F */
    public final View f178447F;

    /* renamed from: G */
    public final View f178448G;

    /* renamed from: H */
    public final View f178449H;

    /* renamed from: I */
    public final View f178450I;

    /* renamed from: J */
    public final View f178451J;

    /* renamed from: K */
    public final View f178452K;

    /* renamed from: L */
    public final View f178453L;

    /* renamed from: M */
    public final View f178454M;

    /* renamed from: N */
    public final TextView f178455N;

    /* renamed from: P */
    public final View f178456P;

    /* renamed from: Q */
    public final TextView f178457Q;

    /* renamed from: Q0 */
    public int f178458Q0;

    /* renamed from: R */
    public final View f178459R;

    /* renamed from: R0 */
    public Map<String, String> f178460R0 = new LinkedHashMap();

    /* renamed from: S */
    public final ViewGroup f178461S;

    /* renamed from: T */
    public final View f178462T;

    /* renamed from: U */
    public final View f178463U;

    /* renamed from: V */
    public final View f178464V;

    /* renamed from: W */
    public final int f178465W = 1;

    /* renamed from: W0 */
    public View f178466W0;

    /* renamed from: X */
    public final int f178467X = 20010;

    /* renamed from: Y */
    public final C60413h1 f178468Y;

    /* renamed from: Z */
    public final C60557z1 f178469Z;

    /* renamed from: p */
    public final C58124b f178470p;

    /* renamed from: p0 */
    public final C60398g1 f178471p0;

    /* renamed from: q */
    public int f178472q;

    /* renamed from: r */
    public final LinearLayout f178473r;

    /* renamed from: s */
    public final ViewGroup f178474s;

    /* renamed from: t */
    public final View f178475t;

    /* renamed from: u */
    public final View f178476u;

    /* renamed from: v */
    public final ViewGroup f178477v;

    /* renamed from: w */
    public final TextView f178478w;

    /* renamed from: x */
    public final WeImageView f178479x;

    /* renamed from: x0 */
    public final C60466o1 f178480x0;

    /* renamed from: y */
    public final View f178481y;

    /* renamed from: y0 */
    public int f178482y0;

    /* renamed from: z */
    public final View f178483z;

    /* renamed from: qj1.n0$a */
    public static final class C12531a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62889n0 f36016d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f36017e;

        /* renamed from: qj1.n0$a$a */
        public static final class C12532a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ C62889n0 f36018d;

            /* renamed from: e */
            public final /* synthetic */ ViewGroup f36019e;

            /* renamed from: qj1.n0$a$a$a */
            public static final class C12533a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C62889n0 f36020d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C12533a(C62889n0 n0Var) {
                    super(0);
                    this.f36020d = n0Var;
                }

                public Object invoke() {
                    this.f36020d.mo87829e1(true);
                    return C13598b0.f38549a;
                }
            }

            public C12532a(C62889n0 n0Var, ViewGroup viewGroup) {
                this.f36018d = n0Var;
                this.f36019e = viewGroup;
            }

            public void onAnimationEnd(Animator animator) {
                C8048h.C8053d dVar;
                C62889n0.m74012Z0(this.f36018d, false);
                C8048h hVar = (C8048h) this.f36018d.mo87685B0(C8048h.class);
                if (hVar != null) {
                    Context context = this.f36019e.getContext();
                    C87412m.m108593f(context, "root.context");
                    C62889n0 n0Var = this.f36018d;
                    int i = n0Var.f178482y0;
                    C12533a aVar = new C12533a(n0Var);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C8044g gVar = (C8044g) hVar.controller(C8044g.class);
                    linkedHashMap.put("switch_type", Integer.valueOf((gVar == null || !gVar.f26761n) ? 0 : 1));
                    ((C54108o) C86312j.m106911c(C54108o.class)).Rx0("live_anchor_gesture_features_switch", "view_exp", linkedHashMap);
                    C12925w wVar = new C12925w(context);
                    LayoutInflater from = LayoutInflater.from(context);
                    View view = wVar.f36927f;
                    C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    wVar.f36921B.addView(from.inflate(C0966R.C0971layout.f359702d41, (ViewGroup) view, false), 0, new FrameLayout.LayoutParams(-1, -1));
                    wVar.mo12461a();
                    View view2 = wVar.f36927f;
                    view2.setPadding(view2.getPaddingLeft(), wVar.f36927f.getPaddingTop(), wVar.f36927f.getPaddingRight(), wVar.f36927f.getPaddingBottom() + i);
                    wVar.f36937s = new C8061k(aVar, hVar);
                    wVar.f36927f.findViewById(C0966R.C0970id.bec).setOnClickListener(new C8062l(wVar));
                    C15685d dVar2 = C15685d.f42379a;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(C15685d.f42381c);
                    Log.m105924i("Finder.GestureEffectAnchorSettingController", "gestureInfoList size:" + arrayList.size());
                    View view3 = wVar.f36927f;
                    C87412m.m108593f(view3, "rootView");
                    C8048h.C8053d dVar3 = new C8048h.C8053d(hVar, view3, arrayList);
                    hVar.f26772j = dVar3;
                    View view4 = dVar3.f26781c;
                    if (view4 != null) {
                        view4.setOnClickListener(new C8064m(wVar));
                    }
                    WxRecyclerView wxRecyclerView = (WxRecyclerView) wVar.f36927f.findViewById(C0966R.C0970id.f357909nt3);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new C8048h.C8051c((C48928bz0) it.next()));
                    }
                    arrayList2.addAll(arrayList3);
                    wxRecyclerView.setAdapter(new WxRecyclerAdapter(new C3135xf7c5b95d(), arrayList2, false));
                    wxRecyclerView.setLayoutManager(new GridLayoutManager(context, Math.max(Math.min(arrayList2.size(), 3), 1)));
                    MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) wVar.f36927f.findViewById(C0966R.C0970id.kav);
                    mMSwitchBtn.setCheck(C8048h.f26771n.mo9138c(hVar.getStore().getLiveRoomData()));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ((C8048h.C8051c) it4.next()).f26774e = mMSwitchBtn.f220433y;
                    }
                    if (mMSwitchBtn.f220433y && (dVar = hVar.f26772j) != null) {
                        dVar.mo9140b();
                    }
                    mMSwitchBtn.setSwitchListener(new C8065n(hVar, mMSwitchBtn, context, arrayList2, wxRecyclerView));
                    wVar.mo5086o();
                }
            }
        }

        public C12531a(C62889n0 n0Var, ViewGroup viewGroup) {
            this.f36016d = n0Var;
            this.f36017e = viewGroup;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C16217b.f43438a.mo14745b(this.f36016d.mo87828d1(), false);
            this.f36016d.f178473r.animate().translationY((float) C75044y4.m89990b(this.f36017e.getContext()).y).setDuration(100).setListener(new C12532a(this.f36016d, this.f36017e)).start();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.n0$c */
    public static final class C12534c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36021d;

        public C12534c(ViewGroup viewGroup) {
            this.f36021d = viewGroup;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C86013q1.m106445f(C112760b.m154231g() + "resource_downloader");
            C76912y0.m92773l(this.f36021d.getContext(), "清除掉了！");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: qj1.n0$d */
    public static final class C12535d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62889n0 f36022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12535d(C62889n0 n0Var) {
            super(0);
            this.f36022d = n0Var;
        }

        public Object invoke() {
            this.f36022d.mo87829e1(true);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.FILTER, "", (String) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.n0$e */
    public static final class C12536e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62889n0 f36023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12536e(C62889n0 n0Var) {
            super(0);
            this.f36023d = n0Var;
        }

        public Object invoke() {
            this.f36023d.mo87829e1(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.n0$f */
    public static final class C12537f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62889n0 f36024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12537f(C62889n0 n0Var) {
            super(0);
            this.f36024d = n0Var;
        }

        public Object invoke() {
            this.f36024d.mo87829e1(true);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.BEAUTY, "", (String) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.n0$g */
    public static final class C12538g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62889n0 f36025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12538g(C62889n0 n0Var) {
            super(0);
            this.f36025d = n0Var;
        }

        public Object invoke() {
            this.f36025d.mo87829e1(true);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.MAKEUP, "", (String) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.n0$h */
    public static final class C12539h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62889n0 f36026d;

        /* renamed from: e */
        public final /* synthetic */ boolean f36027e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12539h(C62889n0 n0Var, boolean z) {
            super(0);
            this.f36026d = n0Var;
            this.f36027e = z;
        }

        public Object invoke() {
            C0073g0 g0Var = C0073g0.MAKEUP;
            Class cls = C54108o.class;
            C62889n0 n0Var = this.f36026d;
            n0Var.getClass();
            C16217b bVar = C16217b.f43438a;
            bVar.mo14746c(n0Var.mo87830f());
            bVar.mo14746c(n0Var.mo87823a());
            bVar.mo14746c(n0Var.mo87826c());
            bVar.mo14746c(n0Var.mo87828d1());
            bVar.mo14746c(n0Var.mo87834i());
            bVar.mo14746c(n0Var.mo87837q());
            bVar.mo14746c(n0Var.mo87835n());
            C62889n0 n0Var2 = this.f36026d;
            int i = n0Var2.f178458Q0;
            if (i != 2) {
                if (i == 4) {
                    if (n0Var2.mo87831f1()) {
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, C54763g6.C54764a.f153488a.mo75669a(1), (String) null, 4, (Object) null);
                    } else {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8600a((C8777j5) c2, 28, C54763g6.C54764a.f153488a.mo75669a(1), (String) null, 4, (Object) null);
                    }
                }
            } else if (n0Var2.mo87831f1()) {
                C7335d c3 = C86312j.m106911c(cls);
                C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c3, g0Var, C54763g6.C54764a.f153488a.mo75669a(2), (String) null, 4, (Object) null);
            } else {
                C7335d c4 = C86312j.m106911c(cls);
                C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c4, 28, C54763g6.C54764a.f153488a.mo75669a(2), (String) null, 4, (Object) null);
            }
            C62889n0 n0Var3 = this.f36026d;
            n0Var3.f178458Q0 = 0;
            n0Var3.f166287d.animate().translationY((float) C75044y4.m89990b(this.f36026d.f166287d.getContext()).y).setDuration(200).setListener(new C63098x0(this.f36026d, this.f36027e)).start();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.n0$b */
    public static final class C62890b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178484d;

        public C62890b(ViewGroup viewGroup) {
            this.f178484d = viewGroup;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            r0 = (r0 = (r0 = r0.f331275E).f331216b).f331212e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r9) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$2"
                java.lang.String r2 = "android/view/View$OnLongClickListener"
                java.lang.String r3 = "onLongClick"
                java.lang.String r4 = "(Landroid/view/View;)Z"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                c50.b r0 = r9.mo77626b()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0041
                s50.k r0 = r0.f173031q
                s50.u r0 = r0.f331238j
                if (r0 == 0) goto L_0x003c
                s50.c0 r0 = r0.f331275E
                if (r0 == 0) goto L_0x003c
                s50.c r0 = r0.f331216b
                if (r0 == 0) goto L_0x003c
                q00.g r0 = r0.f331212e
                if (r0 == 0) goto L_0x003c
                boolean r0 = r0.mo143254u()
                goto L_0x003d
            L_0x003c:
                r0 = 0
            L_0x003d:
                if (r0 != r1) goto L_0x0041
                r0 = 1
                goto L_0x0042
            L_0x0041:
                r0 = 0
            L_0x0042:
                if (r0 == 0) goto L_0x005b
                c50.b r9 = r9.mo77626b()
                if (r9 != 0) goto L_0x004b
                goto L_0x004e
            L_0x004b:
                r9.mo75573F0(r2)
            L_0x004e:
                android.view.ViewGroup r9 = r8.f178484d
                android.content.Context r9 = r9.getContext()
                java.lang.String r0 = "已停用遮挡"
                nj3.C76912y0.m92773l(r9, r0)
                goto L_0x0071
            L_0x005b:
                c50.b r9 = r9.mo77626b()
                if (r9 != 0) goto L_0x0062
                goto L_0x0065
            L_0x0062:
                r9.mo75573F0(r1)
            L_0x0065:
                android.view.ViewGroup r9 = r8.f178484d
                android.content.Context r9 = r9.getContext()
                java.lang.String r0 = "已启用遮挡"
                nj3.C76912y0.m92773l(r9, r0)
            L_0x0071:
                r2 = 1
                java.lang.String r4 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$2"
                java.lang.String r5 = "android/view/View$OnLongClickListener"
                java.lang.String r6 = "onLongClick"
                java.lang.String r7 = "(Landroid/view/View;)Z"
                r3 = r8
                j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62889n0.C62890b.onLongClick(android.view.View):boolean");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x028f, code lost:
        if (r10.getSex() == 1) goto L_0x0293;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62889n0(android.view.ViewGroup r23, d60.C58124b r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "root"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.f178470p = r2
            r2 = 2131303311(0x7f091b8f, float:1.8224733E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.f178473r = r2
            r3 = 2131303331(0x7f091ba3, float:1.8224773E38)
            android.view.View r3 = r1.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.f178474s = r3
            r4 = 2131303334(0x7f091ba6, float:1.822478E38)
            android.view.View r4 = r1.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            r4 = 2131303335(0x7f091ba7, float:1.8224781E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 2131314782(0x7f09485e, float:1.8247999E38)
            android.view.View r4 = r1.findViewById(r4)
            r0.f178475t = r4
            r4 = 2131314778(0x7f09485a, float:1.824799E38)
            android.view.View r4 = r1.findViewById(r4)
            r0.f178476u = r4
            r4 = 2131303328(0x7f091ba0, float:1.8224767E38)
            android.view.View r4 = r1.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f178477v = r4
            r5 = 2131303330(0x7f091ba2, float:1.8224771E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f178478w = r5
            r5 = 2131303329(0x7f091ba1, float:1.822477E38)
            android.view.View r5 = r1.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f178479x = r5
            r5 = 2131309281(0x7f0932e1, float:1.8236841E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.f178481y = r5
            r5 = 2131309280(0x7f0932e0, float:1.823684E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.f178483z = r5
            r5 = 2131303319(0x7f091b97, float:1.822475E38)
            android.view.View r5 = r1.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.f178442A = r5
            r6 = 2131303320(0x7f091b98, float:1.8224751E38)
            android.view.View r6 = r1.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            r6 = 2131303321(0x7f091b99, float:1.8224753E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6 = 2131302489(0x7f091859, float:1.8223066E38)
            android.view.View r6 = r1.findViewById(r6)
            r0.f178443B = r6
            r6 = 2131302484(0x7f091854, float:1.8223055E38)
            android.view.View r6 = r1.findViewById(r6)
            r0.f178444C = r6
            r6 = 2131303316(0x7f091b94, float:1.8224743E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r0.f178445D = r6
            r7 = 2131303313(0x7f091b91, float:1.8224737E38)
            android.view.View r7 = r1.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0.f178446E = r7
            r8 = 2131303314(0x7f091b92, float:1.8224739E38)
            android.view.View r8 = r1.findViewById(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            r8 = 2131303315(0x7f091b93, float:1.822474E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8 = 2131297717(0x7f0905b5, float:1.8213387E38)
            android.view.View r8 = r1.findViewById(r8)
            r0.f178447F = r8
            r8 = 2131297716(0x7f0905b4, float:1.8213385E38)
            android.view.View r8 = r1.findViewById(r8)
            r0.f178448G = r8
            r8 = 2131303325(0x7f091b9d, float:1.8224761E38)
            android.view.View r8 = r1.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = 2131303326(0x7f091b9e, float:1.8224763E38)
            android.view.View r9 = r1.findViewById(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r9
            r9 = 2131303327(0x7f091b9f, float:1.8224765E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9 = 2131308876(0x7f09314c, float:1.823602E38)
            android.view.View r9 = r1.findViewById(r9)
            r0.f178449H = r9
            r9 = 2131308875(0x7f09314b, float:1.8236018E38)
            android.view.View r9 = r1.findViewById(r9)
            r0.f178450I = r9
            r9 = 2131303322(0x7f091b9a, float:1.8224755E38)
            android.view.View r9 = r1.findViewById(r9)
            r0.f178451J = r9
            r10 = 2131305639(0x7f0924a7, float:1.8229455E38)
            android.view.View r10 = r1.findViewById(r10)
            r0.f178452K = r10
            r10 = 2131305640(0x7f0924a8, float:1.8229457E38)
            android.view.View r10 = r1.findViewById(r10)
            r0.f178453L = r10
            r10 = 2131303302(0x7f091b86, float:1.8224715E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r11 = 2131303300(0x7f091b84, float:1.822471E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r12 = 2131303275(0x7f091b6b, float:1.822466E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            r13 = 2131303310(0x7f091b8e, float:1.822473E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r14 = 2131303256(0x7f091b58, float:1.8224621E38)
            android.view.View r14 = r1.findViewById(r14)
            r0.f178454M = r14
            r15 = 2131303340(0x7f091bac, float:1.8224792E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0.f178455N = r15
            r15 = 2131304306(0x7f091f72, float:1.822675E38)
            android.view.View r15 = r1.findViewById(r15)
            r0.f178456P = r15
            r24 = r14
            r14 = 2131304307(0x7f091f73, float:1.8226753E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0.f178457Q = r14
            r14 = 2131303338(0x7f091baa, float:1.8224788E38)
            android.view.View r14 = r1.findViewById(r14)
            r0.f178459R = r14
            r14 = 2131303337(0x7f091ba9, float:1.8224786E38)
            android.view.View r14 = r1.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r0.f178461S = r14
            r16 = r14
            r14 = 2131303332(0x7f091ba4, float:1.8224775E38)
            android.view.View r14 = r1.findViewById(r14)
            r0.f178462T = r14
            r17 = r8
            r8 = 2131314756(0x7f094844, float:1.8247946E38)
            android.view.View r8 = r1.findViewById(r8)
            r0.f178463U = r8
            r8 = 2131314755(0x7f094843, float:1.8247944E38)
            android.view.View r8 = r1.findViewById(r8)
            r0.f178464V = r8
            r8 = 1
            r0.f178465W = r8
            r8 = 20010(0x4e2a, float:2.804E-41)
            r0.f178467X = r8
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r0.f178460R0 = r8
            boolean r8 = r22.mo82893g0()
            if (r8 != 0) goto L_0x024a
            android.content.Context r8 = r23.getContext()
            int r8 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r8)
            r0.f178482y0 = r8
            int r8 = r2.getPaddingLeft()
            r18 = r9
            int r9 = r2.getPaddingTop()
            r19 = r14
            int r14 = r2.getPaddingRight()
            int r20 = r2.getPaddingBottom()
            r21 = r15
            int r15 = r0.f178482y0
            int r15 = r20 + r15
            r2.setPadding(r8, r9, r14, r15)
            int r2 = r10.getPaddingLeft()
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingRight()
            int r14 = r10.getPaddingBottom()
            int r15 = r0.f178482y0
            int r14 = r14 + r15
            r10.setPadding(r2, r8, r9, r14)
            int r2 = r11.getPaddingLeft()
            int r8 = r11.getPaddingTop()
            int r9 = r11.getPaddingRight()
            int r14 = r11.getPaddingBottom()
            int r15 = r0.f178482y0
            int r14 = r14 + r15
            r11.setPadding(r2, r8, r9, r14)
            int r2 = r12.getPaddingLeft()
            int r8 = r12.getPaddingTop()
            int r9 = r12.getPaddingRight()
            int r14 = r12.getPaddingBottom()
            int r15 = r0.f178482y0
            int r14 = r14 + r15
            r12.setPadding(r2, r8, r9, r14)
            int r2 = r13.getPaddingLeft()
            int r8 = r13.getPaddingTop()
            int r9 = r13.getPaddingRight()
            int r14 = r13.getPaddingBottom()
            int r15 = r0.f178482y0
            int r14 = r14 + r15
            r13.setPadding(r2, r8, r9, r14)
            goto L_0x0250
        L_0x024a:
            r18 = r9
            r19 = r14
            r21 = r15
        L_0x0250:
            android.content.Context r2 = r23.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            float r2 = (float) r2
            r1.setTranslationY(r2)
            il1.h1 r2 = new il1.h1
            java.lang.String r8 = "filterPanel"
            gy3.C87412m.m108593f(r10, r8)
            r2.<init>(r10)
            r0.f178468Y = r2
            il1.z1 r8 = new il1.z1
            java.lang.String r9 = "elementPanel"
            gy3.C87412m.m108593f(r11, r9)
            r8.<init>(r11)
            r0.f178469Z = r8
            il1.g1 r9 = new il1.g1
            java.lang.String r10 = "beautyPowerfulPanel"
            gy3.C87412m.m108593f(r12, r10)
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            androidx.lifecycle.i0 r10 = r0.mo87696x0(r10)
            cl1.o r10 = (cl1.C54991o) r10
            fe1.q r10 = r10.f154259T2
            r11 = 0
            if (r10 == 0) goto L_0x0292
            int r10 = r10.getSex()
            r14 = 1
            if (r10 != r14) goto L_0x0292
            goto L_0x0293
        L_0x0292:
            r14 = 0
        L_0x0293:
            r9.<init>(r12, r14)
            r0.f178471p0 = r9
            il1.o1 r10 = new il1.o1
            java.lang.String r12 = "makeupPanel"
            gy3.C87412m.m108593f(r13, r12)
            r10.<init>(r13)
            r0.f178480x0 = r10
            r3.setOnClickListener(r0)
            r4.setOnClickListener(r0)
            r5.setOnClickListener(r0)
            r6.setOnClickListener(r0)
            r7.setOnClickListener(r0)
            r3 = r21
            r3.setOnClickListener(r0)
            r3 = r19
            r3.setOnClickListener(r0)
            qj1.n0$a r3 = new qj1.n0$a
            r3.<init>(r0, r1)
            r4 = r18
            r4.setOnClickListener(r3)
            boolean r3 = cj1.C54763g6.f153486b
            if (r3 == 0) goto L_0x02d1
            r3 = r17
            r3.setOnClickListener(r0)
            goto L_0x02e5
        L_0x02d1:
            r3 = r17
            zj1.b r4 = zj1.C16217b.f43438a
            java.lang.String r5 = "anchorlive.bottom.videosetting.makeup"
            r4.mo14745b(r5, r11)
            java.lang.String r5 = "startlive.bottom.videosetting.makeup"
            r4.mo14745b(r5, r11)
            r14 = r16
            r14.removeView(r3)
        L_0x02e5:
            r1.setOnClickListener(r0)
            r4 = r24
            r4.setOnClickListener(r0)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r4 != 0) goto L_0x02f9
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r4 != 0) goto L_0x02f9
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 == 0) goto L_0x0309
        L_0x02f9:
            qj1.n0$b r4 = new qj1.n0$b
            r4.<init>(r1)
            r3.setOnLongClickListener(r4)
            qj1.n0$c r3 = new qj1.n0$c
            r3.<init>(r1)
            r6.setOnLongClickListener(r3)
        L_0x0309:
            qj1.n0$d r1 = new qj1.n0$d
            r1.<init>(r0)
            r2.f172256n = r1
            qj1.n0$e r1 = new qj1.n0$e
            r1.<init>(r0)
            r8.f172612h = r1
            qj1.n0$f r1 = new qj1.n0$f
            r1.<init>(r0)
            r9.f172219e = r1
            qj1.n0$g r1 = new qj1.n0$g
            r1.<init>(r0)
            r10.f172382d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62889n0.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74012Z0(qj1.C62889n0 r4, boolean r5) {
        /*
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            r2 = 0
            if (r5 == 0) goto L_0x0038
            int r5 = r4.f178472q
            if (r5 != 0) goto L_0x0015
            d60.b r4 = r4.f178470p
            d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_RESTORE_POST_UI
            r0 = 2
            d60.C58124b.C7172a.m7372a(r4, r5, r2, r0, r2)
            goto L_0x009b
        L_0x0015:
            androidx.lifecycle.i0 r5 = r4.mo87696x0(r0)
            cl1.o r5 = (cl1.C54991o) r5
            r2 = 0
            r5.f154286Z = r2
            d60.b r5 = r4.f178470p
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r0)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154286Z
            r3.putBoolean(r1, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r5.statusChange(r2, r3)
            goto L_0x009b
        L_0x0038:
            int r5 = r4.f178472q
            if (r5 != 0) goto L_0x0079
            android.view.ViewGroup r4 = r4.f166287d
            android.content.Context r4 = r4.getContext()
            boolean r5 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r5 == 0) goto L_0x0049
            r2 = r4
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
        L_0x0049:
            if (r2 == 0) goto L_0x009b
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62444c(r2)
            java.lang.Class<xk1.d2> r0 = xk1.C66297d2.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r0)
            xk1.d2 r5 = (xk1.C66297d2) r5
            bl3.r$a r0 = r4.mo62444c(r2)
            java.lang.Class<xk1.d2> r1 = xk1.C66297d2.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            xk1.d2 r0 = (xk1.C66297d2) r0
            int r0 = r0.f190848d
            r5.f190867z = r0
            bl3.r$a r4 = r4.mo62444c(r2)
            java.lang.Class<xk1.d2> r5 = xk1.C66297d2.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            xk1.d2 r4 = (xk1.C66297d2) r4
            r4.mo90415e3()
            goto L_0x009b
        L_0x0079:
            androidx.lifecycle.i0 r5 = r4.mo87696x0(r0)
            cl1.o r5 = (cl1.C54991o) r5
            r2 = 1
            r5.f154286Z = r2
            d60.b r5 = r4.f178470p
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r0)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154286Z
            r3.putBoolean(r1, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r5.statusChange(r2, r3)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62889n0.m74012Z0(qj1.n0, boolean):void");
    }

    /* renamed from: a */
    public final String mo87823a() {
        return mo87831f1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty";
    }

    /* renamed from: a1 */
    public final void mo87824a1(boolean z) {
        int i = z ? 24057 : 24021;
        String str = z ? "anchorlive.bottom.videosetting.gesture" : "startlive.bottom.videosetting.gesture";
        String str2 = z ? "anchorlive.bottom.videosetting" : "startlive.bottom.videosetting";
        ArrayList arrayList = new ArrayList();
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = 6;
        nn12.f184506h = 1;
        nn12.f184507i = str;
        nn12.f184508j = str2;
        nn12.f184515t = 1;
        arrayList.add(nn12);
        C64586nn1 nn13 = new C64586nn1();
        nn13.f184506h = 2;
        nn13.f184507i = str2;
        arrayList.add(nn13);
        C16217b.f43438a.mo14749f(i, arrayList, "live_bottom_gesture_effect");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0063, code lost:
        r2 = r2.getLiveStatus();
     */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87825b1() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r2)
            cl1.o r3 = (cl1.C54991o) r3
            androidx.lifecycle.i0 r4 = r0.mo87696x0(r2)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.f154354q
            r4 = r4 | 256(0x100, float:3.59E-43)
            r3.f154354q = r4
            nk1.o r3 = nk1.C61791o.f175673a
            androidx.lifecycle.i0 r4 = r0.mo87696x0(r2)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.f154354q
            java.lang.String r5 = "closeCamera"
            r3.mo86722d(r5, r4)
            cj1.n5 r6 = r18.mo14476D0()
            if (r6 == 0) goto L_0x0052
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r1)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r7 = r3.f182392d
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            long r9 = r1.f154416j
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r2)
            cl1.o r1 = (cl1.C54991o) r1
            int r11 = r1.f154354q
            r12 = 256(0x100, double:1.265E-321)
            r14 = 0
            r15 = 0
            r16 = 48
            r17 = 0
            cj1.C54795n5.C54796a.m61727e(r6, r7, r9, r11, r12, r14, r15, r16, r17)
        L_0x0052:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r3 = 1
            r1.putBoolean(r2, r3)
            b50.b r2 = r18.mo87827c1()
            if (r2 == 0) goto L_0x006c
            d50.i r2 = r2.getLiveStatus()
            if (r2 == 0) goto L_0x006c
            boolean r2 = r2.f166264k
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            java.lang.String r4 = "PARAM_FINDER_LIVE_IS_SHARE_MODE"
            r1.putBoolean(r4, r2)
            d60.b r2 = r0.f178470p
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r2.statusChange(r4, r1)
            int r1 = r0.f178472q
            if (r1 != r3) goto L_0x00a1
            b50.b r1 = r18.mo87827c1()
            if (r1 == 0) goto L_0x00b0
            android.view.ViewGroup r2 = r0.f166287d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131233614(0x7f080b4e, float:1.808337E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            java.lang.String r3 = "root.context.resources.g…le.live_audio_mode_frame)"
            gy3.C87412m.m108593f(r2, r3)
            android.graphics.Bitmap r2 = o40.C61926c.m72686k(r2)
            r1.mo75187a(r2)
            goto L_0x00b0
        L_0x00a1:
            b50.b r1 = r18.mo87827c1()
            if (r1 == 0) goto L_0x00b0
            d50.i r1 = r1.getLiveStatus()
            if (r1 == 0) goto L_0x00b0
            r1.mo82889k()
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62889n0.mo87825b1():void");
    }

    /* renamed from: c */
    public final String mo87826c() {
        return mo87831f1() ? "anchorlive.bottom.videosetting.filter" : "startlive.bottom.videosetting.filter";
    }

    /* renamed from: c1 */
    public final C54405b mo87827c1() {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            return aVar.f173032r;
        }
        return null;
    }

    /* renamed from: d1 */
    public final String mo87828d1() {
        return mo87831f1() ? "anchorlive.bottom.videosetting.gesture" : "startlive.bottom.videosetting.gesture";
    }

    /* renamed from: e1 */
    public final void mo87829e1(boolean z) {
        C61926c.m72668M(new C12539h(this, z));
    }

    /* renamed from: f */
    public final String mo87830f() {
        return mo87831f1() ? "anchorlive.bottom.videosetting.makeup" : "startlive.bottom.videosetting.makeup";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getLiveStatus();
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87831f1() {
        /*
            r3 = this;
            b50.b r0 = r3.mo87827c1()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            d50.i r0 = r0.getLiveStatus()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo82885g()
            if (r0 != r1) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62889n0.mo87831f1():boolean");
    }

    /* renamed from: g1 */
    public final void mo87832g1(View view, C54067f0.C0066n nVar, String str) {
        if (view.getVisibility() == 0) {
            ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(nVar, this.f178460R0);
        }
        if (view.isShown() && str != null) {
            C16217b.f43438a.mo14751g(str);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final void mo87833h1() {
        C58115i liveStatus;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        ((C54991o) mo87696x0(cls2)).f154354q &= -257;
        C61791o.f175673a.mo86722d("openCamera", ((C54991o) mo87696x0(cls2)).f154354q);
        C54795n5 D0 = mo14476D0();
        if (D0 != null) {
            C54795n5.C54796a.m61727e(D0, ((C55001u) mo87696x0(cls)).f154420q.f182392d, ((C55001u) mo87696x0(cls)).f154416j, ((C54991o) mo87696x0(cls2)).f154354q, 256, 0, (C47826f.C47827a) null, 48, (Object) null);
        }
        boolean z = false;
        if (this.f178472q == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            this.f178470p.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH_COUNT_DOWN, bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        C54405b c1 = mo87827c1();
        if (!(c1 == null || (liveStatus = c1.getLiveStatus()) == null)) {
            z = liveStatus.f166264k;
        }
        bundle2.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z);
        this.f178470p.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH, bundle2);
    }

    /* renamed from: i */
    public final String mo87834i() {
        return mo87831f1() ? "anchorlive.bottom.videosetting.mirror" : "startlive.bottom.videosetting.mirror";
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f178468Y.mo85382f();
        C60557z1 z1Var = this.f178469Z;
        z1Var.getClass();
        z1Var.f172606b = C53930o0.m60555b();
        z1Var.f172609e.add(C60557z1.f172604i);
        ArrayList<C64807wo2> arrayList = z1Var.f172609e;
        C58602a aVar = C58602a.f167787a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(C58602a.f167788b);
        arrayList.addAll(arrayList2);
        z1Var.f172607c.setAdapter(z1Var.f172608d);
        C8048h.C8049a aVar2 = C8048h.f26771n;
        if (aVar2.mo9137b(mo87684A0()) && aVar2.mo9136a(mo87684A0())) {
            mo87824a1(true);
            mo87824a1(false);
            Log.m105924i("Finder.GestureEffectAnchorSettingController", "hasShowRedDot");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_GESTURE_EFFECT_BOOLEAN_SYNC, Boolean.TRUE);
        }
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel;
        String str;
        String str2;
        int i3;
        if (i == this.f178467X && intent != null && (captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO")) != null) {
            Boolean bool = captureVideoNormalModel.f272897h;
            C87412m.m108593f(bool, "model.photo");
            if (bool.booleanValue()) {
                str = captureVideoNormalModel.f272895f;
                C87412m.m108593f(str, "model.thumbPath");
                str2 = "";
            } else {
                String str3 = captureVideoNormalModel.f272894e;
                C87412m.m108593f(str3, "model.videoPath");
                String str4 = captureVideoNormalModel.f272895f;
                C87412m.m108593f(str4, "model.thumbPath");
                str2 = str3;
                str = str4;
            }
            C64756up2 up22 = new C64756up2();
            Boolean bool2 = captureVideoNormalModel.f272897h;
            C87412m.m108593f(bool2, "model.photo");
            if (bool2.booleanValue()) {
                up22.f185782d = str;
                i3 = 0;
            } else {
                up22.f185782d = null;
                C64274c60 c602 = new C64274c60();
                c602.f182415d = str2;
                c602.f182416e = str;
                C13598b0 b0Var = C13598b0.f38549a;
                up22.f185783e = c602;
                i3 = 1;
            }
            up22.f185784f = i3;
            C62042e eVar = C62042e.f176370a;
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            eVar.mo87060Z1(context, mo87684A0(), up22);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        int i = this.f178458Q0;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            mo87829e1(false);
        } else if (i == 2) {
            mo87829e1(true);
        } else if (i == 3) {
            mo87829e1(true);
        } else if (i == 4) {
            mo87829e1(true);
        } else if (i != 5) {
            return false;
        } else {
            mo87829e1(true);
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: n */
    public final String mo87835n() {
        return mo87831f1() ? "anchorlive.bottom.audiosetting.background" : "startlive.bottom.audiosetting.background";
    }

    public void onClick(View view) {
        C58112f fVar;
        C58112f fVar2;
        C58112f fVar3;
        C58112f fVar4;
        C58112f fVar5;
        View view2 = view;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        Class cls3 = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58112f fVar6 = null;
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        int i = 2;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.die) {
            C7335d c = C86312j.m106911c(cls3);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.FLIP, this.f178460R0, (String) null, 4, (Object) null);
            C58114h hVar = ((C55001u) mo87696x0(cls)).f154421r;
            if (hVar != null) {
                fVar6 = hVar.f166253d;
            }
            if (fVar6 != null) {
                C58114h hVar2 = ((C55001u) mo87696x0(cls)).f154421r;
                fVar6.f166227b = !((hVar2 == null || (fVar5 = hVar2.f166253d) == null) ? true : fVar5.f166227b);
            }
            this.f178470p.statusChange(C58124b.C58125b.SWITCH_CAMERA, new Bundle());
            C58114h hVar3 = ((C55001u) mo87696x0(cls)).f154421r;
            if ((hVar3 == null || (fVar4 = hVar3.f166253d) == null || !fVar4.f166227b) ? false : true) {
                this.f178479x.setIconColor(this.f166287d.getContext().getResources().getColor(C0966R.color.FG_0));
                this.f178478w.setTextColor(this.f166287d.getContext().getResources().getColor(C0966R.color.FG_1));
            } else {
                this.f178479x.setIconColor(this.f166287d.getContext().getResources().getColor(C0966R.color.FG_2));
                this.f178478w.setTextColor(this.f166287d.getContext().getResources().getColor(C0966R.color.FG_2));
            }
            if (this.f178470p.getLiveRole() == 1) {
                ((C54108o) C86312j.m106911c(cls3)).getClass();
                C54108o.f151869h.f151443Y.f151838o++;
                if (C60971a.C60973b.f173670a.mo85945b().f174704a != 0) {
                    i = 1;
                }
                C7335d c2 = C86312j.m106911c(cls3);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVE_ANCHOR_ACTION_EXCHANGE_CAMERA, String.valueOf(i), (String) null, 4, (Object) null);
            }
            C16217b.f43438a.mo14745b(mo87837q(), false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dib) {
            C7335d c3 = C86312j.m106911c(cls3);
            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c3, C54067f0.C0064m.IMAGE, this.f178460R0, (String) null, 4, (Object) null);
            C58114h hVar4 = ((C55001u) mo87696x0(cls)).f154421r;
            if ((hVar4 == null || (fVar3 = hVar4.f166253d) == null || !fVar3.f166227b) ? false : true) {
                C58114h hVar5 = ((C55001u) mo87696x0(cls)).f154421r;
                if ((hVar5 == null || (fVar2 = hVar5.f166253d) == null || !fVar2.f166230e) ? false : true) {
                    this.f178479x.animate().rotationY(180.0f).setDuration(200).start();
                } else {
                    this.f178479x.animate().rotationY(0.0f).setDuration(200).start();
                }
                C58114h hVar6 = ((C55001u) mo87696x0(cls)).f154421r;
                if (hVar6 != null) {
                    fVar6 = hVar6.f166253d;
                }
                if (fVar6 != null) {
                    C58114h hVar7 = ((C55001u) mo87696x0(cls)).f154421r;
                    fVar6.f166230e = !((hVar7 == null || (fVar = hVar7.f166253d) == null) ? true : fVar.f166230e);
                }
                C54405b c1 = mo87827c1();
                if (c1 != null) {
                    c1.mo75189c(FinderLiveService.f159376d.mo77650x());
                }
                C7335d c4 = C86312j.m106911c(cls3);
                C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c4, C0073g0.CLICK_MIRROR, "", (String) null, 4, (Object) null);
            } else {
                Log.m105924i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickMirror while using front camera, skip!");
                C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getResources().getString(C0966R.string.dwp), 0).show();
            }
            C16217b.f43438a.mo14745b(mo87834i(), false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.di9) {
            if (!((C54991o) mo87696x0(cls2)).f154313f2) {
                C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getString(C0966R.string.mo9), 0).show();
            } else {
                C7335d c5 = C86312j.m106911c(cls3);
                C87412m.m108593f(c5, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c5, C54067f0.C0064m.FILTER, this.f178460R0, (String) null, 4, (Object) null);
                this.f178458Q0 = 2;
                this.f178473r.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setDuration(100).setListener(new C63003u0(this)).start();
            }
            C16217b.f43438a.mo14745b(mo87826c(), false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ok_) {
            C60557z1.m70748b(this.f178469Z, 2, (String) null, (String) null, 0, 14, (Object) null);
            this.f178458Q0 = 5;
            this.f178473r.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setDuration(100).setListener(new C62986t0(this)).start();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.di6) {
            if (!((C54991o) mo87696x0(cls2)).f154308e2) {
                C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getString(C0966R.string.mo9), 0).show();
            } else {
                C7335d c6 = C86312j.m106911c(cls3);
                C87412m.m108593f(c6, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c6, C54067f0.C0064m.BEAUTY, this.f178460R0, (String) null, 4, (Object) null);
                this.f178458Q0 = 3;
                this.f178473r.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setDuration(100).setListener(new C62904o0(this)).start();
            }
            C16217b.f43438a.mo14745b(mo87823a(), false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.m0a) {
            if (!C65933h.f189549f) {
                C11207i.m11067c(this, (C66212f) null, (C53934p0) null, new C63042v0(this, (C15601d<? super C63042v0>) null), 3, (Object) null);
            } else {
                C7335d c7 = C86312j.m106911c(cls3);
                C87412m.m108593f(c7, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c7, C54067f0.C0064m.MAKEUP, this.f178460R0, (String) null, 4, (Object) null);
                this.f178458Q0 = 4;
                this.f178473r.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setDuration(100).setListener(new C63067w0(this)).start();
                C16217b.f43438a.mo14745b(mo87830f(), false);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.n9e) {
            C77407n nVar = new C77407n(this.f166287d.getContext(), 1, true);
            String string = !((C54991o) mo87696x0(cls2)).mo75960G3() ? this.f166287d.getContext().getResources().getString(C0966R.string.mll) : this.f166287d.getContext().getResources().getString(C0966R.string.mlj);
            C87412m.m108593f(string, "if (!business(LiveCommon…heet_title)\n            }");
            String string2 = !((C54991o) mo87696x0(cls2)).mo75960G3() ? this.f166287d.getContext().getResources().getString(C0966R.string.mlk) : this.f166287d.getContext().getResources().getString(C0966R.string.mli);
            C87412m.m108593f(string2, "if (!business(LiveCommon…sheet_item)\n            }");
            nVar.mo107568m(string, 17, 0);
            nVar.f225768g1.setTextColor(this.f166287d.getContext().getResources().getColor(C0966R.color.FG_2));
            nVar.f225771i = new C12592p0(this, string2);
            nVar.f225782p = new C12606q0(this);
            nVar.f225761d = new C62947r0(this);
            nVar.f225763e = new C62968s0(this);
            nVar.mo107573q();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.n8w) {
            mo87829e1(false);
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92772k(this.f166287d.getContext());
            } else {
                C62042e eVar = C62042e.f176370a;
                Context context = this.f166287d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                eVar.mo87006G0((MMActivity) context, this.f178467X);
            }
            C16217b.f43438a.mo14745b(mo87835n(), false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dih) {
            int i2 = this.f178458Q0;
            if (i2 == 3) {
                C7335d c8 = C86312j.m106911c(cls3);
                C87412m.m108593f(c8, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c8, C0073g0.BEAUTY, "", (String) null, 4, (Object) null);
                if (this.f178471p0.f172217c.getSuitMode()) {
                    mo87829e1(true);
                }
            } else if (i2 == 2) {
                C7335d c9 = C86312j.m106911c(cls3);
                C87412m.m108593f(c9, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c9, C0073g0.FILTER, "", (String) null, 4, (Object) null);
            } else if (i2 == 4) {
                C7335d c15 = C86312j.m106911c(cls3);
                C87412m.m108593f(c15, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c15, C0073g0.MAKEUP, "", (String) null, 4, (Object) null);
            } else {
                mo87829e1(false);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.n8p) {
            mo87829e1(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: q */
    public final String mo87837q() {
        return mo87831f1() ? "anchorlive.bottom.videosetting.switchcam" : "startlive.bottom.videosetting.switchcam";
    }

    /* renamed from: s */
    public final boolean mo87838s() {
        Class cls = C54991o.class;
        if ((!((C54991o) mo87696x0(cls)).f154313f2 || !C16217b.f43438a.mo14750f(mo87826c())) && ((!((C54991o) mo87696x0(cls)).f154308e2 || !C16217b.f43438a.mo14750f(mo87823a())) && (!C8048h.f26771n.mo9136a(mo87684A0()) || !C16217b.f43438a.mo14750f(mo87828d1())))) {
            C16217b bVar = C16217b.f43438a;
            return bVar.mo14750f(mo87830f()) || bVar.mo14750f(mo87834i()) || bVar.mo14750f(mo87837q()) || bVar.mo14750f(mo87835n());
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Bundle bundle2 = bundle;
        Class cls = C54108o.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        long j = 0;
        if (ordinal == 27) {
            C60557z1 z1Var = this.f178469Z;
            z1Var.getClass();
            C64807wo2 wo22 = C60557z1.f172604i;
            z1Var.mo85525c(new C60557z1.C60565f(wo22, ""));
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            FinderLiveService.f159392v = 0;
            finderLiveService.mo77614Q(new C60557z1.C60565f(wo22, ""));
        } else if (ordinal == 130) {
            this.f178472q = bundle2 != null ? bundle2.getInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 0) : 0;
            Class cls2 = C54991o.class;
            StringBuilder sb = new StringBuilder();
            sb.append("checkCameraOptionEnable business(LiveCommonSlice::class.java).exptFilterEnable:");
            sb.append(((C54991o) mo87696x0(cls2)).f154313f2);
            sb.append(" business(LiveCommonSlice::class.java).exptBeautyEnable:");
            sb.append(((C54991o) mo87696x0(cls2)).f154308e2);
            sb.append(" audioModeEnableBySwitchFlag:");
            C62042e eVar = C62042e.f176370a;
            C58969q qVar = ((C54991o) mo87696x0(cls2)).f154259T2;
            long j2 = qVar != null ? qVar.field_liveSwitchFlag : 0;
            eVar.getClass();
            sb.append(C61926c.m72696u((int) j2, 8));
            sb.append(" audioModeEnableByExpt:");
            sb.append(eVar.mo87076f());
            sb.append(" business(LiveCommonSlice::class.java).enableAudioMode():");
            sb.append(((C54991o) mo87696x0(cls2)).mo75960G3());
            Log.m105924i("Finder.FinderLiveAnchorCameraOptPanelPlugin", sb.toString());
            if (!((C54991o) mo87696x0(cls2)).f154313f2) {
                this.f178461S.removeView(this.f178442A);
            }
            if (!((C54991o) mo87696x0(cls2)).f154308e2) {
                this.f178461S.removeView(this.f178446E);
            }
            C58969q qVar2 = ((C54991o) mo87696x0(cls2)).f154259T2;
            if (qVar2 != null) {
                j = qVar2.field_liveSwitchFlag;
            }
            if (!C61926c.m72696u((int) j, 8) || !eVar.mo87076f() || !eVar.mo87030O0()) {
                this.f178461S.removeView(this.f178456P);
            }
            if (!C8048h.f26771n.mo9136a(mo87684A0())) {
                this.f178461S.removeView(this.f178451J);
            }
            C58602a aVar = C58602a.f167787a;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C58602a.f167788b);
            if (arrayList.isEmpty()) {
                this.f178461S.removeView(this.f178445D);
            }
            Log.m105924i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode audioModeEnable:" + ((C54991o) mo87696x0(cls2)).mo75960G3());
            TextView textView = this.f178455N;
            C87412m.m108593f(textView, "titleTv");
            C7919x.m8091a(textView);
            if (((C54991o) mo87696x0(cls2)).mo75960G3()) {
                View view = this.f178459R;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f178461S.setVisibility(8);
                this.f178455N.setText(this.f166287d.getContext().getString(C0966R.string.mob));
                this.f178457Q.setText(this.f166287d.getContext().getString(C0966R.string.mmq));
            } else {
                View view3 = this.f178459R;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f178461S.setVisibility(0);
                this.f178455N.setText(this.f166287d.getContext().getString(C0966R.string.mmp));
                this.f178457Q.setText(this.f166287d.getContext().getString(C0966R.string.mmr));
            }
            if (this.f178472q == 0) {
                this.f178460R0 = ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.BEFORE);
                C61926c.m72668M(new C63115y0(this));
                return;
            }
            this.f178460R0 = ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING);
            C61926c.m72668M(new C63115y0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.CLICK_FAIRY_STICK, jSONObject.toString(), (String) null, 4, (Object) null);
        } else if (ordinal == 131) {
            mo87829e1(false);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C60557z1 z1Var = this.f178469Z;
        C0000n0 n0Var = z1Var.f172606b;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        z1Var.f172606b = null;
    }
}
