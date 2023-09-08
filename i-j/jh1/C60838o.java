package jh1;

import a14.C0000n0;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7919x;
import fh1.C8036f1;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C9507n;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nj3.C76912y0;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49955j71;
import te3.C64538lx2;
import te3.C64646q31;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jh1.o */
public final class C60838o {

    /* renamed from: a */
    public final View f173315a;

    /* renamed from: b */
    public final C8036f1 f173316b;

    /* renamed from: c */
    public final String f173317c = "Finder.MileStoneMainWidget";

    /* renamed from: d */
    public boolean f173318d;

    /* renamed from: e */
    public final ArrayList<C64538lx2> f173319e = new ArrayList<>();

    /* renamed from: f */
    public TextView f173320f;

    /* renamed from: g */
    public TextView f173321g;

    /* renamed from: h */
    public RecyclerView f173322h;

    /* renamed from: jh1.o$a */
    public static final class C60839a extends C9507n {

        /* renamed from: A */
        public final TextView f173323A;

        /* renamed from: B */
        public final TextView f173324B;

        /* renamed from: C */
        public final TextView f173325C;

        /* renamed from: D */
        public final View f173326D;

        /* renamed from: E */
        public final TextView f173327E;

        /* renamed from: F */
        public final TextView f173328F;

        /* renamed from: G */
        public final View f173329G;

        /* renamed from: H */
        public final TextView f173330H;

        /* renamed from: I */
        public final TextView f173331I;

        /* renamed from: J */
        public final View f173332J;

        /* renamed from: K */
        public final View f173333K;

        /* renamed from: L */
        public final View f173334L;

        /* renamed from: M */
        public final View f173335M;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60839a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f173323A = (TextView) view.findViewById(C0966R.C0970id.kky);
            this.f173324B = (TextView) view.findViewById(C0966R.C0970id.of8);
            this.f173325C = (TextView) view.findViewById(C0966R.C0970id.fac);
            this.f173326D = view.findViewById(C0966R.C0970id.hdk);
            this.f173327E = (TextView) view.findViewById(C0966R.C0970id.oi_);
            this.f173328F = (TextView) view.findViewById(C0966R.C0970id.oia);
            this.f173329G = view.findViewById(C0966R.C0970id.ohb);
            this.f173330H = (TextView) view.findViewById(C0966R.C0970id.ohc);
            this.f173331I = (TextView) view.findViewById(C0966R.C0970id.og9);
            this.f173332J = view.findViewById(C0966R.C0970id.oca);
            this.f173333K = view.findViewById(C0966R.C0970id.f359403oj0);
            this.f173334L = view.findViewById(C0966R.C0970id.oif);
            this.f173335M = view.findViewById(C0966R.C0970id.jzn);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget$reserveLottery$$inlined$fail$default$1", mo125469f = "MileStoneMainWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: jh1.o$b */
    public static final class C60840b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f173336d;

        /* renamed from: e */
        public final /* synthetic */ C60838o f173337e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60840b(C0287e eVar, C15601d dVar, C60838o oVar) {
            super(2, dVar);
            this.f173336d = eVar;
            this.f173337e = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60840b(this.f173336d, dVar, this.f173337e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60840b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = this.f173337e.f173317c;
            Log.m105928w(str, "reserveLottery failed. " + ((C0280a) ((C0281b) this.f173336d).f843b));
            C76912y0.m92767f(this.f173337e.f173315a.getContext(), this.f173337e.f173315a.getContext().getString(C0966R.string.ndr));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget$reserveLottery$$inlined$success$default$1", mo125469f = "MileStoneMainWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: jh1.o$c */
    public static final class C60841c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f173338d;

        /* renamed from: e */
        public final /* synthetic */ C60838o f173339e;

        /* renamed from: f */
        public final /* synthetic */ C64538lx2 f173340f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f173341g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60841c(C0287e eVar, C15601d dVar, C60838o oVar, C64538lx2 lx22, C8477a0 a0Var) {
            super(2, dVar);
            this.f173338d = eVar;
            this.f173339e = oVar;
            this.f173340f = lx22;
            this.f173341g = a0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60841c(this.f173338d, dVar, this.f173339e, this.f173340f, this.f173341g);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60841c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C49955j71 j712 = (C49955j71) ((C0288f) this.f173338d).f855b;
            Log.m105924i(this.f173339e.f173317c, "reserveLottery success, modify data");
            C64538lx2 lx22 = this.f173340f;
            if (lx22 != null) {
                lx22.f184171i = 1;
            }
            C76912y0.m92766e(this.f173339e.f173315a.getContext(), this.f173339e.f173315a.getContext().getString(C0966R.string.nds), C60843e.f173348a);
            this.f173341g.f27482d = true;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneMainWidget", mo125469f = "MileStoneMainWidget.kt", mo125470l = {282, 317, 324}, mo125471m = "reserveLottery")
    /* renamed from: jh1.o$d */
    public static final class C60842d extends C66704d {

        /* renamed from: d */
        public Object f173342d;

        /* renamed from: e */
        public Object f173343e;

        /* renamed from: f */
        public Object f173344f;

        /* renamed from: g */
        public /* synthetic */ Object f173345g;

        /* renamed from: h */
        public final /* synthetic */ C60838o f173346h;

        /* renamed from: i */
        public int f173347i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60842d(C60838o oVar, C15601d<? super C60842d> dVar) {
            super(dVar);
            this.f173346h = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f173345g = obj;
            this.f173347i |= Integer.MIN_VALUE;
            return this.f173346h.mo85755c((C64538lx2) null, this);
        }
    }

    /* renamed from: jh1.o$e */
    public static final class C60843e implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C60843e f173348a = new C60843e();

        /* renamed from: a */
        public final void mo596a(View view) {
            WeImageView weImageView;
            TextView textView;
            if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
                textView.setTextSize(1, 14.0f);
            }
            if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
                weImageView.setImageResource(C0966R.raw.icons_outlined_done);
            }
        }
    }

    public C60838o(View view, C8036f1 f1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(f1Var, "controller");
        this.f173315a = view;
        this.f173316b = f1Var;
    }

    /* renamed from: a */
    public static final boolean m71237a(C60838o oVar) {
        oVar.getClass();
        if (!C62042e.f176370a.mo87027N0()) {
            return true;
        }
        C76912y0.m92773l(oVar.f173315a.getContext(), oVar.f173315a.getContext().getResources().getString(C0966R.string.ne6));
        return false;
    }

    /* renamed from: b */
    public final void mo85754b(C64646q31 q312, boolean z, boolean z2) {
        Integer num;
        boolean z3;
        C64646q31 q313 = q312;
        C87412m.m108594g(q313, "metaInfo");
        View findViewById = this.f173315a.findViewById(C0966R.C0970id.f358703oh1);
        View findViewById2 = this.f173315a.findViewById(C0966R.C0970id.ogb);
        View findViewById3 = this.f173315a.findViewById(C0966R.C0970id.oji);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            num = 0;
            z3 = false;
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            num = 0;
            z3 = false;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(z3)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z2) {
            C8036f1 f1Var = this.f173316b;
            C87412m.m108593f(findViewById2, "lotteryContent");
            C87412m.m108593f(findViewById, "mainContent");
            f1Var.mo9119F3(findViewById2, findViewById, z3);
        }
        Log.m105924i(this.f173317c, "initViews " + this.f173318d);
        LinearLayoutManager linearLayoutManager = null;
        if (!this.f173318d) {
            this.f173318d = true;
            View findViewById4 = this.f173315a.findViewById(C0966R.C0970id.be4);
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new C60844p(this));
            }
            View findViewById5 = this.f173315a.findViewById(C0966R.C0970id.f358703oh1);
            this.f173320f = findViewById5 != null ? (TextView) findViewById5.findViewById(C0966R.C0970id.kpm) : null;
            this.f173321g = findViewById5 != null ? (TextView) findViewById5.findViewById(C0966R.C0970id.c2h) : null;
            this.f173322h = findViewById5 != null ? (RecyclerView) findViewById5.findViewById(C0966R.C0970id.oga) : null;
            TextView textView = this.f173320f;
            if (textView != null) {
                C7919x.m8091a(textView);
            }
            RecyclerView recyclerView = this.f173322h;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setNestedScrollingEnabled(z3);
                recyclerView.setAdapter(new C60845q(this));
            }
        }
        mo85756d(q312);
        if (z) {
            LinkedList<C64538lx2> linkedList = q313.f184942d;
            C87412m.m108593f(linkedList, "metaInfo.infos");
            Iterator<C64538lx2> it = linkedList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i2 = it.next().f184169g;
                if (i2 == 2 || i2 == 3) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.m105924i(this.f173317c, "autoScroll index:" + i);
                RecyclerView recyclerView2 = this.f173322h;
                RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                if (linearLayoutManager2 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(num);
                    aVar4.mo10233c(Integer.valueOf(i));
                    C117292a.m165358d(linearLayoutManager2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager2.mo16973V(((Integer) aVar4.mo10231a(z3 ? 1 : 0)).intValue(), ((Integer) aVar4.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            Log.m105924i(this.f173317c, "autoScroll index:" + i + " invalid");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo85755c(te3.C64538lx2 r19, wx3.C15601d<? super java.lang.Boolean> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            boolean r4 = r2 instanceof jh1.C60838o.C60842d
            if (r4 == 0) goto L_0x001b
            r4 = r2
            jh1.o$d r4 = (jh1.C60838o.C60842d) r4
            int r5 = r4.f173347i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f173347i = r5
            goto L_0x0020
        L_0x001b:
            jh1.o$d r4 = new jh1.o$d
            r4.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r4.f173345g
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f173347i
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x006b
            if (r6 == r9) goto L_0x0058
            if (r6 == r8) goto L_0x0047
            if (r6 != r7) goto L_0x003f
            java.lang.Object r1 = r4.f173343e
            bi1.e r1 = (bi1.C0287e) r1
            java.lang.Object r1 = r4.f173342d
            gy3.a0 r1 = (gy3.C8477a0) r1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0199
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r1 = r4.f173344f
            bi1.e r1 = (bi1.C0287e) r1
            java.lang.Object r3 = r4.f173343e
            gy3.a0 r3 = (gy3.C8477a0) r3
            java.lang.Object r6 = r4.f173342d
            jh1.o r6 = (jh1.C60838o) r6
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0178
        L_0x0058:
            java.lang.Object r1 = r4.f173344f
            gy3.a0 r1 = (gy3.C8477a0) r1
            java.lang.Object r3 = r4.f173343e
            te3.lx2 r3 = (te3.C64538lx2) r3
            java.lang.Object r6 = r4.f173342d
            jh1.o r6 = (jh1.C60838o) r6
            kotlin.ResultKt.throwOnFailure(r2)
            r15 = r3
            r3 = r1
            goto L_0x014f
        L_0x006b:
            kotlin.ResultKt.throwOnFailure(r2)
            if (r1 == 0) goto L_0x0073
            java.lang.String r2 = r1.f184170h
            goto L_0x0074
        L_0x0073:
            r2 = r10
        L_0x0074:
            if (r2 == 0) goto L_0x007f
            int r2 = r2.length()
            if (r2 != 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r2 = 0
            goto L_0x0080
        L_0x007f:
            r2 = 1
        L_0x0080:
            if (r2 == 0) goto L_0x008c
            java.lang.String r1 = r0.f173317c
            java.lang.String r2 = "reserveLottery notice_id empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L_0x008c:
            gy3.a0 r2 = new gy3.a0
            r2.<init>()
            java.lang.String r6 = r0.f173317c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "reserveLottery noticeId:"
            r11.append(r12)
            if (r1 == 0) goto L_0x00a2
            java.lang.String r12 = r1.f184170h
            goto L_0x00a3
        L_0x00a2:
            r12 = r10
        L_0x00a3:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            te3.i71 r6 = new te3.i71
            r6.<init>()
            je1.h2 r11 = je1.C46523h2.f125330a
            r12 = 7047(0x1b87, float:9.875E-42)
            te3.ig0 r11 = r11.mo71859a(r12)
            r6.f135144d = r11
            fh1.f1 r11 = r0.f173316b
            java.lang.Class<cl1.o> r13 = cl1.C54991o.class
            androidx.lifecycle.i0 r11 = r11.business(r13)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154345o
            r6.f135145e = r11
            fh1.f1 r11 = r0.f173316b
            androidx.lifecycle.i0 r11 = r11.business(r3)
            cl1.u r11 = (cl1.C55001u) r11
            byte[] r11 = r11.f154417n
            pe3.b r11 = pe3.C89349b.m111674a(r11)
            r6.f135146f = r11
            zc1.b r11 = zc1.C66785b.f191882e
            java.lang.String r11 = r11.mo90662O5()
            r6.f135147g = r11
            if (r1 == 0) goto L_0x00e8
            java.lang.String r11 = r1.f184170h
            if (r11 != 0) goto L_0x00ea
        L_0x00e8:
            java.lang.String r11 = ""
        L_0x00ea:
            r6.f135148h = r11
            fh1.f1 r11 = r0.f173316b
            androidx.lifecycle.i0 r11 = r11.business(r3)
            cl1.u r11 = (cl1.C55001u) r11
            long r13 = r11.f154416j
            r6.f135149i = r13
            fh1.f1 r11 = r0.f173316b
            androidx.lifecycle.i0 r11 = r11.business(r3)
            cl1.u r11 = (cl1.C55001u) r11
            te3.c21 r11 = r11.f154420q
            long r13 = r11.f182392d
            r6.f135150j = r13
            fh1.f1 r11 = r0.f173316b
            androidx.lifecycle.i0 r3 = r11.business(r3)
            cl1.u r3 = (cl1.C55001u) r3
            java.lang.String r3 = r3.f154423t
            r6.f135151n = r3
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            r3.f127069d = r12
            java.lang.String r11 = "/cgi-bin/micromsg-bin/finderlivereservemilestonelottery"
            r3.f127068c = r11
            r3.f127066a = r6
            te3.j71 r6 = new te3.j71
            r6.<init>()
            r3.f127067b = r6
            ob0.c r3 = r3.mo72403a()
            java.lang.Class<ht1.s1> r6 = ht1.C8802s1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.s1 r6 = (ht1.C8802s1) r6
            ob0.b r6 = r6.mo9632ui()
            r6.mo123453j(r3)
            r4.f173342d = r0
            r4.f173343e = r1
            r4.f173344f = r2
            r4.f173347i = r9
            java.lang.Object r3 = bi1.C0283d.m245c(r6, r10, r4, r9, r10)
            if (r3 != r5) goto L_0x0148
            return r5
        L_0x0148:
            r6 = r0
            r15 = r1
            r17 = r3
            r3 = r2
            r2 = r17
        L_0x014f:
            r1 = r2
            bi1.e r1 = (bi1.C0287e) r1
            boolean r2 = r1 instanceof bi1.C0288f
            if (r2 == 0) goto L_0x0178
            wx3.f r2 = r1.f854a
            if (r2 != 0) goto L_0x015e
            wx3.f r2 = r4.getContext()
        L_0x015e:
            jh1.o$c r9 = new jh1.o$c
            r13 = 0
            r11 = r9
            r12 = r1
            r14 = r6
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r4.f173342d = r6
            r4.f173343e = r3
            r4.f173344f = r1
            r4.f173347i = r8
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r9, r4)
            if (r2 != r5) goto L_0x0178
            return r5
        L_0x0178:
            boolean r2 = r1 instanceof bi1.C0281b
            if (r2 == 0) goto L_0x019a
            wx3.f r2 = r1.f854a
            if (r2 != 0) goto L_0x0184
            wx3.f r2 = r4.getContext()
        L_0x0184:
            jh1.o$b r8 = new jh1.o$b
            r8.<init>(r1, r10, r6)
            r4.f173342d = r3
            r4.f173343e = r1
            r4.f173344f = r10
            r4.f173347i = r7
            java.lang.Object r1 = a14.C53895h.m60469g(r2, r8, r4)
            if (r1 != r5) goto L_0x0198
            return r5
        L_0x0198:
            r1 = r3
        L_0x0199:
            r3 = r1
        L_0x019a:
            boolean r1 = r3.f27482d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60838o.mo85755c(te3.lx2, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final void mo85756d(C64646q31 q312) {
        RecyclerView.C16613e adapter;
        C87412m.m108594g(q312, "metaInfo");
        TextView textView = this.f173320f;
        String str = "";
        if (textView != null) {
            String str2 = q312.f184946h;
            if (str2 == null) {
                str2 = str;
            }
            textView.setText(str2);
        }
        TextView textView2 = this.f173321g;
        if (textView2 != null) {
            String str3 = q312.f184947i;
            if (str3 != null) {
                str = str3;
            }
            textView2.setText(str);
        }
        this.f173319e.clear();
        this.f173319e.addAll(q312.f184942d);
        RecyclerView recyclerView = this.f173322h;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
