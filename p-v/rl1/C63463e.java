package rl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bh0.C113174b;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.view.C4213y;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dj1.C7339i0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hl1.C59988k;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import l31.C61212e;
import nr3.C89059e;
import o40.C61926c;
import pe3.C89349b;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48914bw;
import te3.C48979cb1;
import te3.C50617o01;
import te3.C51633v21;
import te3.C52204z21;
import te3.C64240aq3;
import te3.C64405gx2;
import te3.C64432hx2;
import te3.C64457ix2;
import te3.C64641px2;
import wc1.C15064b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rl1.e */
public final class C63463e extends UIComponent implements View.OnClickListener {

    /* renamed from: A */
    public int f180025A;

    /* renamed from: B */
    public String f180026B = "";

    /* renamed from: C */
    public String f180027C = "";

    /* renamed from: D */
    public int f180028D = 1;

    /* renamed from: E */
    public int f180029E;

    /* renamed from: F */
    public byte[] f180030F;

    /* renamed from: G */
    public int f180031G;

    /* renamed from: H */
    public C50617o01 f180032H;

    /* renamed from: I */
    public C63465b f180033I = C63465b.Page_None;

    /* renamed from: J */
    public C63464a f180034J = C63464a.NONE;

    /* renamed from: d */
    public final C13601g f180035d = C36568h.m40985a(new C63467d(this));

    /* renamed from: e */
    public final C13601g f180036e = C36568h.m40985a(new C63482t(this));

    /* renamed from: f */
    public final C13601g f180037f = C36568h.m40985a(new C63473j(this));

    /* renamed from: g */
    public final C13601g f180038g = C36568h.m40985a(new C63468e(this));

    /* renamed from: h */
    public final C13601g f180039h = C36568h.m40985a(new C63479q(this));

    /* renamed from: i */
    public final C13601g f180040i = C36568h.m40985a(new C63469f(this));

    /* renamed from: j */
    public final C13601g f180041j = C36568h.m40985a(new C63472i(this));

    /* renamed from: n */
    public final C13601g f180042n = C36568h.m40985a(new C63470g(this));

    /* renamed from: o */
    public final C13601g f180043o = C36568h.m40985a(new C63471h(this));

    /* renamed from: p */
    public final C13601g f180044p = C36568h.m40985a(new C63466c(this));

    /* renamed from: q */
    public final C13601g f180045q = C36568h.m40985a(new C63474k(this));

    /* renamed from: r */
    public final C13601g f180046r = C36568h.m40985a(new C63476m(this));

    /* renamed from: s */
    public final C13601g f180047s = C36568h.m40985a(new C63475l(this));

    /* renamed from: t */
    public final C13601g f180048t = C36568h.m40985a(new C63480r(this));

    /* renamed from: u */
    public final C13601g f180049u = C36568h.m40985a(new C63481s(this));

    /* renamed from: v */
    public C4213y f180050v;

    /* renamed from: w */
    public C77398g f180051w;

    /* renamed from: x */
    public String f180052x = "";

    /* renamed from: y */
    public long f180053y;

    /* renamed from: z */
    public long f180054z;

    /* renamed from: rl1.e$n */
    public static final class C13031n implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C63463e f37126a;

        /* renamed from: b */
        public final /* synthetic */ C113174b f37127b;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryAudienceUIC$onActivityResult$1$1$1", mo125469f = "FinderLiveLotteryAudienceUIC.kt", mo125470l = {493}, mo125471m = "invokeSuspend")
        /* renamed from: rl1.e$n$a */
        public static final class C13032a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f37128d;

            /* renamed from: e */
            public final /* synthetic */ C63463e f37129e;

            /* renamed from: f */
            public final /* synthetic */ C113174b f37130f;

            /* renamed from: g */
            public final /* synthetic */ C52204z21 f37131g;

            /* renamed from: rl1.e$n$a$a */
            public static final class C13033a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C63463e f37132d;

                /* renamed from: e */
                public final /* synthetic */ C51633v21 f37133e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C13033a(C63463e eVar, C51633v21 v212) {
                    super(0);
                    this.f37132d = eVar;
                    this.f37133e = v212;
                }

                public Object invoke() {
                    this.f37132d.mo88337f3(this.f37133e);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13032a(C63463e eVar, C113174b bVar, C52204z21 z212, C15601d<? super C13032a> dVar) {
                super(2, dVar);
                this.f37129e = eVar;
                this.f37130f = bVar;
                this.f37131g = z212;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13032a(this.f37129e, this.f37130f, this.f37131g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13032a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C13598b0 b0Var;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f37128d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C13064o0 o0Var = C13064o0.f37206a;
                    C63463e eVar = this.f37129e;
                    C48914bw bwVar = new C48914bw();
                    C113174b bVar = this.f37130f;
                    bwVar.f131337d = bVar.f338621n;
                    bwVar.f131338e = bVar.f338622o;
                    bwVar.f131339f = o0Var.mo12565d(bVar);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    C52204z21 z212 = this.f37131g;
                    C87412m.m108593f(z212, LocaleUtil.ITALIAN);
                    this.f37128d = 1;
                    obj = o0Var.mo12569h(eVar.f180053y, (byte[]) null, eVar.getActivity(), "claim addr:" + this.f37130f.f338620j, bwVar, z212, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C51633v21 v212 = (C51633v21) obj;
                if (v212 != null) {
                    C61926c.m72668M(new C13033a(this.f37129e, v212));
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    Log.m105920e("FinderLiveLotteryAudienceUIC", "claim addr:" + this.f37130f.f338620j + " but resp is null!");
                }
                return C13598b0.f38549a;
            }
        }

        public C13031n(C63463e eVar, C113174b bVar) {
            this.f37126a = eVar;
            this.f37127b = bVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            C52204z21 z212;
            if (z) {
                C63463e eVar = this.f37126a;
                C50617o01 o012 = eVar.f180032H;
                if (!(o012 == null || (z212 = o012.f138872d) == null)) {
                    if (C0317e.launch$default(eVar, C53872d1.f151119c, (C53934p0) null, new C13032a(eVar, this.f37127b, z212, (C15601d<? super C13032a>) null), 2, (Object) null) != null) {
                        return;
                    }
                }
                Log.m105920e("FinderLiveLotteryAudienceUIC", "post addr but lotteryInfo is empty!");
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: rl1.e$a */
    public enum C63464a {
        NONE,
        COUPON_NOT_USED,
        COUPON_USED
    }

    /* renamed from: rl1.e$b */
    public enum C63465b {
        Page_None,
        Page_Normal,
        Page_RedPacket,
        Pag_Coupon
    }

    /* renamed from: rl1.e$c */
    public static final class C63466c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180064d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63466c(C63463e eVar) {
            super(0);
            this.f180064d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180064d.findViewById(C0966R.C0970id.f6203g4);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$d */
    public static final class C63467d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63467d(C63463e eVar) {
            super(0);
            this.f180065d = eVar;
        }

        public Object invoke() {
            return (ImageView) this.f180065d.findViewById(C0966R.C0970id.aaa);
        }
    }

    /* renamed from: rl1.e$e */
    public static final class C63468e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63468e(C63463e eVar) {
            super(0);
            this.f180066d = eVar;
        }

        public Object invoke() {
            return this.f180066d.findViewById(C0966R.C0970id.aab);
        }
    }

    /* renamed from: rl1.e$f */
    public static final class C63469f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63469f(C63463e eVar) {
            super(0);
            this.f180067d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180067d.findViewById(C0966R.C0970id.n9q);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 17.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$g */
    public static final class C63470g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63470g(C63463e eVar) {
            super(0);
            this.f180068d = eVar;
        }

        public Object invoke() {
            return this.f180068d.findViewById(C0966R.C0970id.n6o);
        }
    }

    /* renamed from: rl1.e$h */
    public static final class C63471h extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63471h(C63463e eVar) {
            super(0);
            this.f180069d = eVar;
        }

        public Object invoke() {
            return (RecyclerView) this.f180069d.findViewById(C0966R.C0970id.n6p);
        }
    }

    /* renamed from: rl1.e$i */
    public static final class C63472i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63472i(C63463e eVar) {
            super(0);
            this.f180070d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180070d.findViewById(C0966R.C0970id.n7c);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$j */
    public static final class C63473j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63473j(C63463e eVar) {
            super(0);
            this.f180071d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180071d.findViewById(C0966R.C0970id.odj);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 17.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$k */
    public static final class C63474k extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63474k(C63463e eVar) {
            super(0);
            this.f180072d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180072d.findViewById(C0966R.C0970id.f6204ym);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$l */
    public static final class C63475l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63475l(C63463e eVar) {
            super(0);
            this.f180073d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180073d.findViewById(C0966R.C0970id.f6205yy);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$m */
    public static final class C63476m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63476m(C63463e eVar) {
            super(0);
            this.f180074d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180074d.findViewById(C0966R.C0970id.a88);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryAudienceUIC$onResume$1", mo125469f = "FinderLiveLotteryAudienceUIC.kt", mo125470l = {144}, mo125471m = "invokeSuspend")
    /* renamed from: rl1.e$o */
    public static final class C63477o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f180075d;

        /* renamed from: e */
        public final /* synthetic */ C63463e f180076e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63477o(C63463e eVar, C15601d<? super C63477o> dVar) {
            super(2, dVar);
            this.f180076e = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63477o(this.f180076e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63477o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            r1 = (r1 = r1.f138883r).f184913e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f180075d
                java.lang.String r2 = "FinderLiveLotteryAudienceUIC"
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0018
                if (r1 != r3) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0077
            L_0x0010:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r14)
                rl1.e r14 = r13.f180076e
                java.lang.String r6 = r14.f180027C
                r7 = 0
                long r8 = r14.f180054z
                long r10 = r14.f180053y
                te3.d82 r14 = new te3.d82
                r14.<init>()
                rl1.e r1 = r13.f180076e
                r14.f182655d = r3
                te3.o01 r1 = r1.f180032H
                if (r1 == 0) goto L_0x003c
                te3.px2 r1 = r1.f138883r
                if (r1 == 0) goto L_0x003c
                te3.aq3 r1 = r1.f184913e
                if (r1 == 0) goto L_0x003c
                pe3.b r1 = r1.f182137f
                goto L_0x003d
            L_0x003c:
                r1 = r4
            L_0x003d:
                r14.f182656e = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.Class<te3.a61> r1 = te3.C64224a61.class
                r13.f180075d = r3
                wx3.h r3 = new wx3.h
                wx3.d r5 = xx3.C66447b.m78392b(r13)
                r3.<init>(r5)
                java.lang.Class<ls3.h> r5 = ls3.C61398h.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                ls3.h r5 = (ls3.C61398h) r5
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                r12.add(r14)
                rx3.b0 r14 = rx3.C13598b0.f38549a
                ob0.b r14 = r5.xk0(r6, r7, r8, r10, r12)
                nr3.e r14 = r14.mo9225i()
                cl1.w0 r5 = new cl1.w0
                r5.<init>(r3, r1, r2)
                r14.mo123420E(r5)
                java.lang.Object r14 = r3.mo90314b()
                if (r14 != r0) goto L_0x0077
                return r0
            L_0x0077:
                te3.a61 r14 = (te3.C64224a61) r14
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "page resume,red packet is_received from:"
                r0.append(r1)
                rl1.e r1 = r13.f180076e
                te3.o01 r1 = r1.f180032H
                if (r1 == 0) goto L_0x0098
                te3.px2 r1 = r1.f138883r
                if (r1 == 0) goto L_0x0098
                te3.aq3 r1 = r1.f184913e
                if (r1 == 0) goto L_0x0098
                boolean r1 = r1.f182135d
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x0099
            L_0x0098:
                r1 = r4
            L_0x0099:
                r0.append(r1)
                java.lang.String r1 = " to "
                r0.append(r1)
                if (r14 == 0) goto L_0x00aa
                boolean r1 = r14.f182035d
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x00ab
            L_0x00aa:
                r1 = r4
            L_0x00ab:
                r0.append(r1)
                r1 = 33
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                if (r14 == 0) goto L_0x00e4
                rl1.e r0 = r13.f180076e
                te3.o01 r1 = r0.f180032H
                if (r1 == 0) goto L_0x00c8
                te3.px2 r2 = r1.f138883r
                if (r2 == 0) goto L_0x00c8
                te3.aq3 r4 = r2.f184913e
            L_0x00c8:
                if (r4 != 0) goto L_0x00cb
                goto L_0x00cf
            L_0x00cb:
                boolean r2 = r14.f182035d
                r4.f182135d = r2
            L_0x00cf:
                if (r1 == 0) goto L_0x00dd
                te3.px2 r1 = r1.f138883r
                if (r1 == 0) goto L_0x00dd
                te3.aq3 r1 = r1.f184913e
                if (r1 == 0) goto L_0x00dd
                java.lang.String r1 = r1.f182139h
                if (r1 != 0) goto L_0x00df
            L_0x00dd:
                java.lang.String r1 = ""
            L_0x00df:
                boolean r14 = r14.f182035d
                r0.mo88339i3(r1, r14)
            L_0x00e4:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: rl1.C63463e.C63477o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.FinderLiveLotteryAudienceUIC$onResume$2", mo125469f = "FinderLiveLotteryAudienceUIC.kt", mo125470l = {163}, mo125471m = "invokeSuspend")
    /* renamed from: rl1.e$p */
    public static final class C63478p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f180077d;

        /* renamed from: e */
        public final /* synthetic */ C63463e f180078e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63478p(C63463e eVar, C15601d<? super C63478p> dVar) {
            super(2, dVar);
            this.f180078e = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63478p(this.f180078e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63478p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: te3.s31} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r14.f180077d
                java.lang.String r2 = ""
                java.lang.String r3 = "FinderLiveLotteryAudienceUIC"
                r4 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r4) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x0081
            L_0x0011:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r15)
                rl1.e r15 = r14.f180078e
                java.lang.String r6 = r15.f180027C
                r7 = 0
                long r8 = r15.f180054z
                long r10 = r15.f180053y
                te3.d82 r15 = new te3.d82
                r15.<init>()
                rl1.e r1 = r14.f180078e
                r5 = 3
                r15.f182655d = r5
                te3.r31 r5 = new te3.r31
                r5.<init>()
                r5.f185102d = r4
                java.lang.String r1 = r1.f180052x
                r5.f185103e = r1
                r5.f185104f = r2
                r5.f185105g = r2
                byte[] r1 = r5.toByteArray()
                pe3.b r5 = new pe3.b
                r5.<init>(r1)
                r15.f182656e = r5
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.Class<te3.s31> r1 = te3.C64695s31.class
                r14.f180077d = r4
                wx3.h r13 = new wx3.h
                wx3.d r5 = xx3.C66447b.m78392b(r14)
                r13.<init>(r5)
                java.lang.Class<ls3.h> r5 = ls3.C61398h.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                ls3.h r5 = (ls3.C61398h) r5
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                r12.add(r15)
                rx3.b0 r15 = rx3.C13598b0.f38549a
                ob0.b r15 = r5.xk0(r6, r7, r8, r10, r12)
                nr3.e r15 = r15.mo9225i()
                cl1.w0 r5 = new cl1.w0
                r5.<init>(r13, r1, r3)
                r15.mo123420E(r5)
                java.lang.Object r15 = r13.mo90314b()
                if (r15 != r0) goto L_0x0081
                return r0
            L_0x0081:
                te3.s31 r15 = (te3.C64695s31) r15
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "page resume,coupon updateInfo:"
                r0.append(r1)
                if (r15 != 0) goto L_0x0090
                goto L_0x0091
            L_0x0090:
                r2 = r15
            L_0x0091:
                org.json.JSONObject r1 = o40.C61937h.m72703b(r2)
                r0.append(r1)
                r1 = 33
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                r0 = 0
                if (r15 == 0) goto L_0x00aa
                te3.wr2 r2 = r15.f185324e
                goto L_0x00ab
            L_0x00aa:
                r2 = r0
            L_0x00ab:
                if (r2 == 0) goto L_0x014b
                rl1.e r2 = r14.f180078e
                int r5 = r15.f185323d
                r6 = 2
                r7 = 0
                if (r5 != r6) goto L_0x00b7
                r5 = 1
                goto L_0x00b8
            L_0x00b7:
                r5 = 0
            L_0x00b8:
                r2.mo88340j3(r5)
                rl1.e r2 = r14.f180078e
                te3.o01 r2 = r2.f180032H
                if (r2 == 0) goto L_0x00cc
                te3.hx2 r5 = r2.f138882q
                if (r5 == 0) goto L_0x00cc
                te3.ix2 r5 = r5.f183565e
                if (r5 == 0) goto L_0x00cc
                te3.gx2 r5 = r5.f183747d
                goto L_0x00cd
            L_0x00cc:
                r5 = r0
            L_0x00cd:
                if (r5 != 0) goto L_0x00d0
                goto L_0x00d4
            L_0x00d0:
                int r6 = r15.f185323d
                r5.f183362e = r6
            L_0x00d4:
                if (r2 == 0) goto L_0x00e1
                te3.hx2 r5 = r2.f138882q
                if (r5 == 0) goto L_0x00e1
                te3.ix2 r5 = r5.f183565e
                if (r5 == 0) goto L_0x00e1
                te3.gx2 r5 = r5.f183747d
                goto L_0x00e2
            L_0x00e1:
                r5 = r0
            L_0x00e2:
                if (r5 != 0) goto L_0x00e5
                goto L_0x00ef
            L_0x00e5:
                te3.wr2 r6 = r15.f185324e
                if (r6 == 0) goto L_0x00ec
                pe3.b r6 = r6.f186193g
                goto L_0x00ed
            L_0x00ec:
                r6 = r0
            L_0x00ed:
                r5.f183364g = r6
            L_0x00ef:
                if (r2 == 0) goto L_0x00fc
                te3.hx2 r2 = r2.f138882q
                if (r2 == 0) goto L_0x00fc
                te3.ix2 r2 = r2.f183565e
                if (r2 == 0) goto L_0x00fc
                te3.gx2 r2 = r2.f183747d
                goto L_0x00fd
            L_0x00fc:
                r2 = r0
            L_0x00fd:
                if (r2 != 0) goto L_0x0100
                goto L_0x010a
            L_0x0100:
                te3.wr2 r5 = r15.f185324e
                if (r5 == 0) goto L_0x0107
                java.lang.String r5 = r5.f186192f
                goto L_0x0108
            L_0x0107:
                r5 = r0
            L_0x0108:
                r2.f183363f = r5
            L_0x010a:
                te3.wr2 r2 = r15.f185324e
                if (r2 == 0) goto L_0x0111
                java.lang.String r2 = r2.f186192f
                goto L_0x0112
            L_0x0111:
                r2 = r0
            L_0x0112:
                if (r2 == 0) goto L_0x011c
                int r2 = r2.length()
                if (r2 != 0) goto L_0x011b
                goto L_0x011c
            L_0x011b:
                r4 = 0
            L_0x011c:
                if (r4 != 0) goto L_0x012e
                rl1.e r1 = r14.f180078e
                android.widget.TextView r1 = r1.mo88335d3()
                te3.wr2 r15 = r15.f185324e
                if (r15 == 0) goto L_0x012a
                java.lang.String r0 = r15.f186192f
            L_0x012a:
                r1.setText(r0)
                goto L_0x014b
            L_0x012e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "page resume,button_text:"
                r2.append(r4)
                te3.wr2 r15 = r15.f185324e
                if (r15 == 0) goto L_0x013e
                java.lang.String r0 = r15.f186192f
            L_0x013e:
                r2.append(r0)
                r2.append(r1)
                java.lang.String r15 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r15)
            L_0x014b:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: rl1.C63463e.C63478p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: rl1.e$q */
    public static final class C63479q extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63479q(C63463e eVar) {
            super(0);
            this.f180079d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180079d.findViewById(C0966R.C0970id.aoz);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 22.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$r */
    public static final class C63480r extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63480r(C63463e eVar) {
            super(0);
            this.f180080d = eVar;
        }

        public Object invoke() {
            return this.f180080d.findViewById(C0966R.C0970id.f358243ap0);
        }
    }

    /* renamed from: rl1.e$s */
    public static final class C63481s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63481s(C63463e eVar) {
            super(0);
            this.f180081d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180081d.findViewById(C0966R.C0970id.a3e);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: rl1.e$t */
    public static final class C63482t extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C63463e f180082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63482t(C63463e eVar) {
            super(0);
            this.f180082d = eVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f180082d.findViewById(C0966R.C0970id.aok);
            C15064b bVar = C15064b.f41199a;
            Context context = textView.getContext();
            C87412m.m108593f(context, "context");
            C15064b.m14230a(bVar, context, textView, 17.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63463e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r6 = r10.f183564d;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m74808c3(rl1.C63463e r9, te3.C64432hx2 r10) {
        /*
            r9.getClass()
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62446e(r1)
            bl3.c r3 = r3.mo62447c(r0)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11872i2()
            pl1.f r4 = new pl1.f
            r5 = 0
            if (r10 == 0) goto L_0x0023
            te3.jx2 r6 = r10.f183564d
            if (r6 == 0) goto L_0x0023
            java.lang.String r6 = r6.f183858e
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            r7 = 2
            r4.<init>(r6, r5, r7, r5)
            rx3.g r6 = r9.f180035d
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.String r8 = "<get-avatarIv>(...)"
            gy3.C87412m.m108593f(r6, r8)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            pl1.e0$a r8 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r1 = r2.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r8)
            r3.mo85957c(r4, r6, r0)
            rx3.g r0 = r9.f180036e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-userNameTv>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r10 == 0) goto L_0x0062
            te3.jx2 r1 = r10.f183564d
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r1.f183857d
            goto L_0x0063
        L_0x0062:
            r1 = r5
        L_0x0063:
            r0.setText(r1)
            rx3.g r0 = r9.f180037f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-fillWording>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r10 == 0) goto L_0x007e
            te3.jx2 r1 = r10.f183564d
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = r1.f183859f
            goto L_0x007f
        L_0x007e:
            r1 = r5
        L_0x007f:
            r0.setText(r1)
            rx3.g r0 = r9.f180039h
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-rewardNameTv>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r10 == 0) goto L_0x009a
            te3.ix2 r1 = r10.f183565e
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = r1.f183748e
            goto L_0x009b
        L_0x009a:
            r1 = r5
        L_0x009b:
            r0.setText(r1)
            if (r10 == 0) goto L_0x00ab
            te3.ix2 r0 = r10.f183565e
            if (r0 == 0) goto L_0x00ab
            te3.gx2 r0 = r0.f183747d
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r0.f183361d
            goto L_0x00ac
        L_0x00ab:
            r0 = r5
        L_0x00ac:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r0 = 0
            goto L_0x00ba
        L_0x00b9:
            r0 = 1
        L_0x00ba:
            if (r0 == 0) goto L_0x00c6
            android.widget.TextView r0 = r9.mo88336e3()
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x00e2
        L_0x00c6:
            android.widget.TextView r0 = r9.mo88336e3()
            r0.setVisibility(r2)
            android.widget.TextView r0 = r9.mo88336e3()
            if (r10 == 0) goto L_0x00de
            te3.ix2 r3 = r10.f183565e
            if (r3 == 0) goto L_0x00de
            te3.gx2 r3 = r3.f183747d
            if (r3 == 0) goto L_0x00de
            java.lang.String r3 = r3.f183361d
            goto L_0x00df
        L_0x00de:
            r3 = r5
        L_0x00df:
            r0.setText(r3)
        L_0x00e2:
            android.widget.TextView r0 = r9.mo88335d3()
            if (r10 == 0) goto L_0x00f3
            te3.ix2 r3 = r10.f183565e
            if (r3 == 0) goto L_0x00f3
            te3.gx2 r3 = r3.f183747d
            if (r3 == 0) goto L_0x00f3
            java.lang.String r3 = r3.f183363f
            goto L_0x00f4
        L_0x00f3:
            r3 = r5
        L_0x00f4:
            r0.setText(r3)
            android.widget.TextView r0 = r9.mo88335d3()
            r0.setVisibility(r2)
            if (r10 == 0) goto L_0x010e
            te3.ix2 r0 = r10.f183565e
            if (r0 == 0) goto L_0x010e
            te3.gx2 r0 = r0.f183747d
            if (r0 == 0) goto L_0x010e
            boolean r0 = r0.f183365h
            if (r0 != r1) goto L_0x010e
            r0 = 1
            goto L_0x010f
        L_0x010e:
            r0 = 0
        L_0x010f:
            if (r0 == 0) goto L_0x013a
            android.widget.TextView r0 = r9.mo88335d3()
            r0.setBackground(r5)
            android.widget.TextView r0 = r9.mo88335d3()
            android.widget.TextView r1 = r9.mo88335d3()
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131100650(0x7f0603ea, float:1.7813687E38)
            int r1 = r1.getColor(r3, r5)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r9.mo88335d3()
            r0.setEnabled(r2)
            goto L_0x0178
        L_0x013a:
            android.widget.TextView r0 = r9.mo88335d3()
            r3 = 2131232499(0x7f0806f3, float:1.8081109E38)
            r0.setBackgroundResource(r3)
            android.widget.TextView r0 = r9.mo88335d3()
            android.widget.TextView r3 = r9.mo88335d3()
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099940(0x7f060124, float:1.7812247E38)
            int r3 = r3.getColor(r4, r5)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r9.mo88335d3()
            r0.setEnabled(r1)
            if (r10 == 0) goto L_0x0174
            te3.ix2 r0 = r10.f183565e
            if (r0 == 0) goto L_0x0174
            te3.gx2 r0 = r0.f183747d
            if (r0 == 0) goto L_0x0174
            int r0 = r0.f183362e
            if (r0 != r7) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            r9.mo88340j3(r1)
        L_0x0178:
            rx3.g r0 = r9.f180044p
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-anchorNameTv>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r10 == 0) goto L_0x0192
            te3.ex2 r1 = r10.f183566f
            if (r1 == 0) goto L_0x0192
            java.lang.String r1 = r1.f133161d
            if (r1 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            java.lang.String r1 = r9.f180026B
        L_0x0194:
            r0.setText(r1)
            rx3.g r0 = r9.f180045q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-lotteryCountTv>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r10 == 0) goto L_0x01b7
            te3.fx2 r1 = r10.f183567g
            if (r1 == 0) goto L_0x01b7
            int r1 = r1.f183252e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x01b8
        L_0x01b7:
            r1 = r5
        L_0x01b8:
            r0.setText(r1)
            rx3.g r0 = r9.f180046r
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-lotteryWayTv>(...)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r10 == 0) goto L_0x01d2
            te3.fx2 r1 = r10.f183567g
            if (r1 == 0) goto L_0x01d2
            java.lang.String r5 = r1.f183253f
        L_0x01d2:
            r0.setText(r5)
            rx3.g r9 = r9.f180047s
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.String r0 = "<get-lotteryDateTv>(...)"
            gy3.C87412m.m108593f(r9, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r10 == 0) goto L_0x01ee
            te3.fx2 r10 = r10.f183567g
            if (r10 == 0) goto L_0x01ee
            int r10 = r10.f183251d
            long r0 = (long) r10
            goto L_0x01f0
        L_0x01ee:
            r0 = 0
        L_0x01f0:
            java.lang.String r10 = "yyyy-MM-dd HH:mm"
            java.lang.String r10 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r10, r0)
            r9.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C63463e.m74808c3(rl1.e, te3.hx2):void");
    }

    /* renamed from: d3 */
    public final TextView mo88335d3() {
        Object value = ((C36570n) this.f180040i).getValue();
        C87412m.m108593f(value, "<get-claimBtn>(...)");
        return (TextView) value;
    }

    /* renamed from: e3 */
    public final TextView mo88336e3() {
        Object value = ((C36570n) this.f180041j).getValue();
        C87412m.m108593f(value, "<get-expiredWording>(...)");
        return (TextView) value;
    }

    /* renamed from: f3 */
    public final void mo88337f3(C51633v21 v212) {
        TextView d3 = mo88335d3();
        String str = v212.f143258f;
        if (str == null) {
            str = "";
        }
        d3.setText(str);
        if (v212.f143261i == 1) {
            mo88335d3().setText(mo88335d3().getContext().getResources().getString(C0966R.string.mno));
            mo88335d3().setBackground((Drawable) null);
            mo88335d3().setTextColor(mo88335d3().getContext().getResources().getColor(C0966R.color.amv, (Resources.Theme) null));
            mo88335d3().setEnabled(false);
        } else if (v212.f143259g == 0) {
            mo88335d3().setBackgroundResource(C0966R.C0969drawable.f5140y0);
            mo88335d3().setTextColor(mo88335d3().getContext().getResources().getColor(C0966R.color.f2975b6, (Resources.Theme) null));
            mo88335d3().setVisibility(0);
            mo88335d3().setEnabled(true);
            Object value = ((C36570n) this.f180042n).getValue();
            C87412m.m108593f(value, "<get-claimDetailGroup>(...)");
            View view = (View) value;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mo88335d3().setVisibility(8);
            Object value2 = ((C36570n) this.f180042n).getValue();
            C87412m.m108593f(value2, "<get-claimDetailGroup>(...)");
            View view3 = (View) value2;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Object value3 = ((C36570n) this.f180043o).getValue();
            C87412m.m108593f(value3, "<get-claimDetailRv>(...)");
            RecyclerView recyclerView = (RecyclerView) value3;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C48048j jVar = new C48048j();
            LinkedList<C48979cb1> linkedList = v212.f143262j;
            C87412m.m108593f(linkedList, "claimMethod.claim_info");
            jVar.f128896d.clear();
            if (!linkedList.isEmpty()) {
                jVar.f128896d.addAll(linkedList);
            }
            jVar.notifyDataSetChanged();
            recyclerView.setAdapter(jVar);
        }
    }

    /* renamed from: g3 */
    public final void mo88338g3(C63465b bVar) {
        Log.m105924i("FinderLiveLotteryAudienceUIC", "clickForPageChange " + bVar);
        this.f180033I = bVar;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a0r;
    }

    /* renamed from: i3 */
    public final void mo88339i3(String str, boolean z) {
        if (z) {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.nea);
        } else {
            if (str == null || str.length() == 0) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.ne_);
            }
        }
        C87412m.m108593f(str, "if (isReceived) {\n      …g\n            }\n        }");
        mo88335d3().setText(str);
        mo88335d3().setVisibility(0);
        if (z) {
            mo88335d3().setBackground((Drawable) null);
            mo88335d3().setTextColor(mo88335d3().getContext().getResources().getColor(C0966R.color.amv, (Resources.Theme) null));
            mo88335d3().setEnabled(false);
            return;
        }
        mo88335d3().setBackgroundResource(C0966R.C0969drawable.f5140y0);
        mo88335d3().setTextColor(mo88335d3().getContext().getResources().getColor(C0966R.color.f2975b6, (Resources.Theme) null));
        mo88335d3().setEnabled(true);
    }

    /* renamed from: j3 */
    public final void mo88340j3(boolean z) {
        Class cls = C54116w.class;
        C63464a aVar = z ? C63464a.COUPON_USED : C63464a.COUPON_NOT_USED;
        if (aVar != this.f180034J) {
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                ((C54116w) C86312j.m106911c(cls)).sy0(C54067f0.C0066n.LIVE_LOTTERY_PRIVATE_BUY, this.f180027C, String.valueOf(this.f180054z), this.f180052x, this.f180031G);
            } else if (ordinal == 2) {
                ((C54116w) C86312j.m106911c(cls)).sy0(C54067f0.C0066n.LIVE_LOTTERY_PRIVATE_REDEMPTION, this.f180027C, String.valueOf(this.f180054z), this.f180052x, this.f180031G);
            }
        }
        this.f180034J = aVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C113174b bVar;
        byte[] byteArrayExtra;
        if (i == 1001 && i2 == -1) {
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("launch_from_select_addr")) == null) {
                bVar = null;
            } else {
                bVar = new C113174b();
                bVar.parseFrom(byteArrayExtra);
            }
            if (bVar != null) {
                AppCompatActivity activity = getActivity();
                C87412m.m108594g(activity, "context");
                C77426q qVar = new C77426q(activity);
                qVar.mo107595g(activity.getResources().getString(C0966R.string.mn7));
                qVar.mo107602n(activity.getResources().getString(C0966R.string.mn6));
                qVar.mo107598j(activity.getResources().getString(C0966R.string.mn5));
                qVar.mo107597i(new C13062n0(qVar));
                qVar.mo107600l(new C13031n(this, bVar));
                qVar.mo107603o();
                this.f180051w = qVar.f225839c;
                return;
            }
            Log.m105920e("FinderLiveLotteryAudienceUIC", "request addr but result is empty!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r29) {
        /*
            r28 = this;
            r7 = r28
            r0 = r29
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r28
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x002e
            int r2 = r29.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            r3 = 2131304398(0x7f091fce, float:1.8226937E38)
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.lang.String r5 = "onClick"
            java.lang.String r6 = "android/view/View$OnClickListener"
            java.lang.String r9 = "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC"
            if (r2 != 0) goto L_0x003e
            goto L_0x02dc
        L_0x003e:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x02dc
            te3.o01 r2 = r7.f180032H
            if (r2 == 0) goto L_0x004f
            int r2 = r2.f138881p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0050
        L_0x004f:
            r2 = r1
        L_0x0050:
            java.lang.String r3 = "FinderLiveLotteryAudienceUIC"
            r10 = 2
            r11 = 1
            if (r2 != 0) goto L_0x0058
            goto L_0x01ac
        L_0x0058:
            int r13 = r2.intValue()
            if (r13 != r11) goto L_0x01ac
            rl1.e$b r0 = rl1.C63463e.C63465b.Pag_Coupon
            r7.mo88338g3(r0)
            te3.o01 r0 = r7.f180032H
            if (r0 == 0) goto L_0x0076
            te3.hx2 r2 = r0.f138882q
            if (r2 == 0) goto L_0x0076
            te3.ix2 r2 = r2.f183565e
            if (r2 == 0) goto L_0x0076
            te3.gx2 r2 = r2.f183747d
            if (r2 == 0) goto L_0x0076
            pe3.b r2 = r2.f183364g
            goto L_0x0077
        L_0x0076:
            r2 = r1
        L_0x0077:
            if (r0 == 0) goto L_0x008b
            te3.hx2 r0 = r0.f138882q
            if (r0 == 0) goto L_0x008b
            te3.ix2 r0 = r0.f183565e
            if (r0 == 0) goto L_0x008b
            te3.gx2 r0 = r0.f183747d
            if (r0 == 0) goto L_0x008b
            int r0 = r0.f183362e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x008b:
            if (r2 != 0) goto L_0x0097
            java.lang.String r0 = "setCouponClaimClick jumpInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            j20.C117292a.m165361g(r7, r9, r6, r5, r4)
            return
        L_0x0097:
            java.lang.String r3 = "safeParser"
            java.lang.String r13 = ""
            if (r1 != 0) goto L_0x009f
            goto L_0x014b
        L_0x009f:
            int r0 = r1.intValue()
            if (r0 != r11) goto L_0x014b
            di3.d r0 = di3.C86312j.m106911c(r8)
            r14 = r0
            ak1.w r14 = (ak1.C54116w) r14
            ak1.f0$m r15 = ak1.C54067f0.C0064m.LIVE_LOTTERY_PRIVATE_BUY
            java.lang.String r0 = r7.f180027C
            r29 = r13
            long r12 = r7.f180054z
            java.lang.String r17 = java.lang.String.valueOf(r12)
            java.lang.String r1 = r7.f180052x
            int r8 = r7.f180031G
            r16 = r0
            r18 = r1
            r19 = r8
            r14.ry0(r15, r16, r17, r18, r19)
            te3.l40 r1 = new te3.l40
            r1.<init>()
            byte[] r0 = r2.mo123703f()
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x00d4 }
            r12 = r29
            goto L_0x00e0
        L_0x00d4:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r8 = 0
            r0[r8] = r2
            r12 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r12, r0)
        L_0x00e0:
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "milestone_lottery_history::"
            r2.append(r3)
            java.lang.String r3 = r7.f180027C
            r2.append(r3)
            java.lang.String r3 = ":::"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "::"
            r2.append(r3)
            java.lang.String r26 = r2.toString()
            np1.v r21 = np1.C61881v.f175961a
            android.app.Activity r22 = r28.getContext()
            r24 = 1213(0x4bd, float:1.7E-42)
            java.lang.String r2 = "locClickId"
            gy3.C87412m.m108593f(r0, r2)
            r27 = 0
            r23 = r1
            r25 = r0
            di0.o r0 = r21.mo86811c(r22, r23, r24, r25, r26, r27)
            np1.b0 r2 = new np1.b0
            android.app.Activity r3 = r28.getContext()
            java.lang.String r8 = r0.f250930b
            java.lang.String r10 = "this.appId"
            gy3.C87412m.m108593f(r8, r10)
            java.lang.String r10 = r1.f184033f
            if (r10 != 0) goto L_0x012e
            r10 = r12
        L_0x012e:
            java.lang.String r1 = r1.f184034g
            if (r1 != 0) goto L_0x0134
            r13 = r12
            goto L_0x0135
        L_0x0134:
            r13 = r1
        L_0x0135:
            r2.<init>(r3, r8, r10, r13)
            r0.f250943o = r2
            java.lang.Class<kr0.x0> r1 = kr0.C76630x0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.x0 r1 = (kr0.C76630x0) r1
            android.app.Activity r2 = r28.getContext()
            r1.mo106898tv(r2, r0)
            goto L_0x02dc
        L_0x014b:
            r12 = r13
            if (r1 != 0) goto L_0x0150
            goto L_0x02dc
        L_0x0150:
            int r0 = r1.intValue()
            if (r0 != r10) goto L_0x02dc
            di3.d r0 = di3.C86312j.m106911c(r8)
            r13 = r0
            ak1.w r13 = (ak1.C54116w) r13
            ak1.f0$m r14 = ak1.C54067f0.C0064m.LIVE_LOTTERY_PRIVATE_REDEMPTION
            java.lang.String r15 = r7.f180027C
            long r0 = r7.f180054z
            java.lang.String r16 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r7.f180052x
            int r1 = r7.f180031G
            r17 = r0
            r18 = r1
            r13.ry0(r14, r15, r16, r17, r18)
            rn1.a r1 = rn1.C13091a.f37264a
            rx3.g r0 = r7.f180048t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r8 = "<get-root>(...)"
            gy3.C87412m.m108593f(r0, r8)
            android.view.View r0 = (android.view.View) r0
            android.content.Context r8 = r0.getContext()
            java.lang.String r0 = "root.context"
            gy3.C87412m.m108593f(r8, r0)
            te3.l60 r10 = new te3.l60
            r10.<init>()
            byte[] r0 = r2.mo123703f()
            r10.parseFrom(r0)     // Catch:{ Exception -> 0x0199 }
            goto L_0x01a3
        L_0x0199:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r13 = 0
            r0[r13] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r12, r0)
        L_0x01a3:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r0 = 1213(0x4bd, float:1.7E-42)
            r1.mo12595c(r8, r10, r0)
            goto L_0x02dc
        L_0x01ac:
            r13 = 0
            if (r2 != 0) goto L_0x01b0
            goto L_0x0218
        L_0x01b0:
            int r12 = r2.intValue()
            if (r12 != r10) goto L_0x0218
            rl1.e$b r2 = rl1.C63463e.C63465b.Page_RedPacket
            r7.mo88338g3(r2)
            te3.o01 r2 = r7.f180032H
            if (r2 == 0) goto L_0x01c9
            te3.px2 r2 = r2.f138883r
            if (r2 == 0) goto L_0x01c9
            te3.aq3 r2 = r2.f184913e
            if (r2 == 0) goto L_0x01c9
            java.lang.String r1 = r2.f182136e
        L_0x01c9:
            if (r1 == 0) goto L_0x01d3
            int r2 = r1.length()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01d3
        L_0x01d2:
            r11 = 0
        L_0x01d3:
            if (r11 == 0) goto L_0x01dc
            java.lang.String r0 = "claim red packet,but red packet uri is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x02dc
        L_0x01dc:
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r11 = r2
            tf0.p1 r11 = (tf0.C64916p1) r11
            android.content.Context r12 = r29.getContext()
            java.lang.String r0 = "v.context"
            gy3.C87412m.m108593f(r12, r0)
            te3.xq2 r13 = new te3.xq2
            r13.<init>()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r0.<init>()
            com.tencent.mm.protocal.protobuf.Html5Info r2 = new com.tencent.mm.protocal.protobuf.Html5Info
            r2.<init>()
            r2.url = r1
            r0.html5_info = r2
            r0.jumpinfo_type = r10
            r13.f186379e = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r14 = 0
            r15 = 0
            r16 = 8
            r17 = 0
            tf0.C64916p1.C64917a.m76439f(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02dc
        L_0x0218:
            if (r2 != 0) goto L_0x021c
            goto L_0x02dc
        L_0x021c:
            int r0 = r2.intValue()
            if (r0 != 0) goto L_0x02dc
            rl1.e$b r0 = rl1.C63463e.C63465b.Page_Normal
            r7.mo88338g3(r0)
            te3.o01 r0 = r7.f180032H
            if (r0 == 0) goto L_0x02dc
            te3.z21 r0 = r0.f138872d
            if (r0 == 0) goto L_0x02dc
            te3.v21 r2 = r0.f145653t
            if (r2 == 0) goto L_0x023a
            int r2 = r2.f143256d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x023b
        L_0x023a:
            r2 = r1
        L_0x023b:
            if (r2 != 0) goto L_0x023e
            goto L_0x0294
        L_0x023e:
            int r12 = r2.intValue()
            if (r12 != 0) goto L_0x0294
            int r0 = r7.f180028D
            if (r0 != r11) goto L_0x0251
            androidx.appcompat.app.AppCompatActivity r0 = r28.getActivity()
            r0.finish()
            goto L_0x02dc
        L_0x0251:
            if (r0 != r10) goto L_0x02dc
            java.lang.String r0 = r7.f180027C
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x025c
            goto L_0x025d
        L_0x025c:
            r11 = 0
        L_0x025d:
            if (r11 == 0) goto L_0x0261
            r14 = r0
            goto L_0x0262
        L_0x0261:
            r14 = r1
        L_0x0262:
            if (r14 == 0) goto L_0x02dc
            rl1.o0 r12 = rl1.C13064o0.f37206a
            androidx.appcompat.app.AppCompatActivity r13 = r28.getActivity()
            int r15 = r7.f180029E
            java.lang.String r0 = r7.f180052x
            long r1 = r7.f180053y
            r22 = 0
            r19 = 0
            r16 = r0
            r17 = r1
            r12.mo12564c(r13, r14, r15, r16, r17, r19)
            di3.d r0 = di3.C86312j.m106911c(r8)
            java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r16 = r0
            ak1.w r16 = (ak1.C54116w) r16
            ak1.f0$v0 r17 = ak1.C54067f0.C0071v0.CLICK_WIN_DETAIL_ENTER_PRIVATE_UI
            r20 = 0
            r21 = 12
            java.lang.String r18 = ""
            ak1.C54116w.my0(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02dc
        L_0x0294:
            if (r2 != 0) goto L_0x0297
            goto L_0x02bc
        L_0x0297:
            int r1 = r2.intValue()
            if (r1 != r11) goto L_0x02bc
            androidx.appcompat.app.AppCompatActivity r12 = r28.getActivity()
            r16 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r12, r0)
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.String r0 = "launch_from_select_addr"
            r15.putExtra(r0, r11)
            r17 = 0
            java.lang.String r13 = "address"
            java.lang.String r14 = ".ui.WalletSelectAddrUI"
            ke3.C88144b.m109796n(r12, r13, r14, r15, r16, r17)
            goto L_0x02dc
        L_0x02bc:
            if (r2 != 0) goto L_0x02bf
            goto L_0x02d7
        L_0x02bf:
            int r1 = r2.intValue()
            if (r1 != r10) goto L_0x02d7
            rl1.o0 r1 = rl1.C13064o0.f37206a
            androidx.appcompat.app.AppCompatActivity r2 = r28.getActivity()
            rl1.i r3 = new rl1.i
            r3.<init>(r7, r0)
            com.tencent.mm.plugin.finder.view.y r0 = r1.mo12563a(r2, r0, r3)
            r7.f180050v = r0
            goto L_0x02dc
        L_0x02d7:
            java.lang.String r0 = "onClaimClick but claim type is error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x02dc:
            j20.C117292a.m165361g(r7, r9, r6, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C63463e.onClick(android.view.View):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() instanceof MMActivity) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        Intent intent = getActivity().getIntent();
        this.f180054z = intent.getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0);
        this.f180053y = intent.getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0);
        String stringExtra = intent.getStringExtra("KEY_LOTTERY_ID");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f180052x = stringExtra;
        this.f180025A = intent.getIntExtra("KEY_SCENE", 0);
        String stringExtra2 = intent.getStringExtra("FINDER_NICKNAME");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.f180026B = stringExtra2;
        String stringExtra3 = intent.getStringExtra("KEY_LIVE_ANCHOR_USERNAME");
        if (stringExtra3 != null) {
            str = stringExtra3;
        }
        this.f180027C = str;
        this.f180028D = intent.getIntExtra("FROM_SCENE", 1);
        this.f180029E = intent.getIntExtra("PERSON_MSG_SCENE", 0);
        this.f180030F = intent.getByteArrayExtra("KEY_LIVE_COOKIES");
        this.f180031G = intent.getIntExtra("KEY_LOTTERY_HISTORY_SOURCE", 0);
        Log.m105924i("FinderLiveLotteryAudienceUIC", "source:" + this.f180031G + ",finderUserName:" + this.f180027C + '!');
        Class cls = C61212e.class;
        TextView textView = (TextView) findViewById(C0966R.C0970id.od5);
        C15064b bVar = C15064b.f41199a;
        Context context = textView.getContext();
        C87412m.m108593f(context, "context");
        C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.od6);
        Context context2 = textView2.getContext();
        C87412m.m108593f(context2, "context");
        String str2 = "context";
        C15064b.m14230a(bVar, context2, textView2, 14.0f, 0.0f, 8, (Object) null);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.od8);
        Context context3 = textView3.getContext();
        C87412m.m108593f(context3, str2);
        C15064b.m14230a(bVar, context3, textView3, 14.0f, 0.0f, 8, (Object) null);
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.od7);
        Context context4 = textView4.getContext();
        C87412m.m108593f(context4, str2);
        C15064b.m14230a(bVar, context4, textView4, 14.0f, 0.0f, 8, (Object) null);
        Object value = ((C36570n) this.f180038g).getValue();
        C87412m.m108593f(value, "<get-backBtn>(...)");
        ((View) value).setOnClickListener(new C13035f(this));
        ((C61212e) C86312j.m106911c(cls)).o30(mo88335d3(), "finder_live_lottery_call_anchor");
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(mo88335d3(), C59988k.f171146g2.mo84902a());
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(mo88335d3(), 8, 25561);
        C7339i0 i0Var = new C7339i0(this.f180025A, "", this.f180054z, this.f180053y, this.f180030F, "", this.f180052x, (C89349b) null, (C7339i0.C7340a) null);
        i0Var.mo85582k(getActivity(), getResources().getString(C0966R.string.ett), 500);
        C89059e i = i0Var.mo9225i();
        if (getActivity() instanceof MMActivity) {
            AppCompatActivity activity2 = getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i.mo11397F((MMActivity) activity2);
        }
        i.mo123420E(new C63483g(this));
        Object value2 = ((C36570n) this.f180048t).getValue();
        C87412m.m108593f(value2, "<get-root>(...)");
        ((View) value2).setPadding(0, C75044y4.m89994f(getActivity()), 0, 0);
        Object value3 = ((C36570n) this.f180049u).getValue();
        C87412m.m108593f(value3, "<get-tipsView>(...)");
        ((TextView) value3).setPadding(0, 0, 0, C75044y4.m89991c(getActivity()));
        C13064o0 o0Var = C13064o0.f37206a;
        Object value4 = ((C36570n) this.f180049u).getValue();
        C87412m.m108593f(value4, "<get-tipsView>(...)");
        o0Var.mo12568g((TextView) value4);
    }

    public void onDestroy() {
        super.onDestroy();
        C4213y yVar = this.f180050v;
        if (yVar != null) {
            yVar.mo5085n();
        }
        C77398g gVar = this.f180051w;
        if (gVar != null) {
            gVar.dismiss();
        }
    }

    public void onResume() {
        C64432hx2 hx22;
        C64457ix2 ix22;
        C64405gx2 gx22;
        C64432hx2 hx23;
        C64457ix2 ix23;
        C64405gx2 gx23;
        C64432hx2 hx24;
        C64457ix2 ix24;
        C64405gx2 gx24;
        C64432hx2 hx25;
        C64457ix2 ix25;
        C64405gx2 gx25;
        C64641px2 px22;
        C64240aq3 aq32;
        C63465b bVar = this.f180033I;
        boolean z = true;
        Integer num = null;
        if (bVar == C63465b.Page_RedPacket) {
            C50617o01 o012 = this.f180032H;
            if ((o012 != null ? o012.f138883r : null) != null) {
                if (o012 == null || (px22 = o012.f138883r) == null || (aq32 = px22.f184913e) == null || !aq32.f182135d) {
                    z = false;
                }
                if (!z) {
                    C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C63477o(this, (C15601d<? super C63477o>) null), 3, (Object) null);
                    return;
                } else {
                    Log.m105924i("FinderLiveLotteryAudienceUIC", "page resume,red packet is_received!");
                    return;
                }
            }
        }
        if (bVar == C63465b.Pag_Coupon) {
            C50617o01 o013 = this.f180032H;
            if ((o013 != null ? o013.f138882q : null) != null) {
                if (!((o013 == null || (hx25 = o013.f138882q) == null || (ix25 = hx25.f183565e) == null || (gx25 = ix25.f183747d) == null || !gx25.f183365h) ? false : true)) {
                    if (o013 == null || (hx24 = o013.f138882q) == null || (ix24 = hx24.f183565e) == null || (gx24 = ix24.f183747d) == null || gx24.f183362e != 2) {
                        z = false;
                    }
                    if (!z) {
                        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C63478p(this, (C15601d<? super C63478p>) null), 3, (Object) null);
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("page resume,coupon_is_expired:");
                C50617o01 o014 = this.f180032H;
                sb.append((o014 == null || (hx23 = o014.f138882q) == null || (ix23 = hx23.f183565e) == null || (gx23 = ix23.f183747d) == null) ? null : Boolean.valueOf(gx23.f183365h));
                sb.append(",coupon_status:");
                C50617o01 o015 = this.f180032H;
                if (!(o015 == null || (hx22 = o015.f138882q) == null || (ix22 = hx22.f183565e) == null || (gx22 = ix22.f183747d) == null)) {
                    num = Integer.valueOf(gx22.f183362e);
                }
                sb.append(num);
                sb.append('!');
                Log.m105924i("FinderLiveLotteryAudienceUIC", sb.toString());
                return;
            }
        }
        Log.m105924i("FinderLiveLotteryAudienceUIC", "page resume clickForPageChange:" + this.f180033I + '!');
    }
}
