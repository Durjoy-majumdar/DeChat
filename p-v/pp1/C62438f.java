package pp1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveProductRecordView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import jq3.C9507n;
import kotlin.ResultKt;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63965x;
import sp1.C64068b0;
import te3.C64370fp1;
import te3.z44;
import wc1.C15064b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C79406f;

/* renamed from: pp1.f */
public final class C62438f extends C9507n {

    /* renamed from: A */
    public final C13601g f177427A;

    /* renamed from: B */
    public final C13601g f177428B;

    /* renamed from: C */
    public final C13601g f177429C;

    /* renamed from: D */
    public final C13601g f177430D;

    /* renamed from: E */
    public final C13601g f177431E;

    /* renamed from: F */
    public final C13601g f177432F;

    /* renamed from: G */
    public final C13601g f177433G;

    /* renamed from: H */
    public final C13601g f177434H;

    /* renamed from: I */
    public final C13601g f177435I;

    /* renamed from: J */
    public final C13601g f177436J;

    /* renamed from: K */
    public final C13601g f177437K;

    /* renamed from: L */
    public final C13601g f177438L;

    /* renamed from: M */
    public final C13601g f177439M;

    /* renamed from: N */
    public C64068b0 f177440N;

    /* renamed from: P */
    public final C13601g f177441P;

    /* renamed from: Q */
    public final C13601g f177442Q;

    /* renamed from: R */
    public RecyclerView.C16613e<?> f177443R;

    /* renamed from: pp1.f$a */
    public static final class C62439a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C62439a f177444d = new C62439a();

        public C62439a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            C15064b.m14232g(C15064b.f41199a, view, false, 1, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pp1.f$b */
    public static final class C62440b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ View f177445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62440b(View view) {
            super(0);
            this.f177445d = view;
        }

        public Object invoke() {
            return this.f177445d.findViewById(C0966R.C0970id.ohm);
        }
    }

    /* renamed from: pp1.f$c */
    public static final class C62441c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62441c(View view) {
            super(0);
            this.f177446d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177446d.findViewById(C0966R.C0970id.nxz);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }

    /* renamed from: pp1.f$d */
    public static final class C62442d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ View f177447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62442d(View view) {
            super(0);
            this.f177447d = view;
        }

        public Object invoke() {
            return this.f177447d.findViewById(C0966R.C0970id.nxy);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.holder.FinderLiveShoppingViewHolder$parseShowBox$1", mo125469f = "FinderLiveShoppingViewHolder.kt", mo125470l = {150}, mo125471m = "invokeSuspend")
    /* renamed from: pp1.f$e */
    public static final class C62443e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f177448d;

        /* renamed from: e */
        public final /* synthetic */ C62438f f177449e;

        /* renamed from: f */
        public final /* synthetic */ C63965x f177450f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f177451g;

        /* renamed from: pp1.f$e$a */
        public static final class C62444a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62438f f177452d;

            /* renamed from: e */
            public final /* synthetic */ C63965x f177453e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62444a(C62438f fVar, C63965x xVar) {
                super(0);
                this.f177452d = fVar;
                this.f177453e = xVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:29:0x0131  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r23 = this;
                    r0 = r23
                    pp1.f r1 = r0.f177452d
                    androidx.recyclerview.widget.RecyclerView$e<?> r1 = r1.f177443R
                    boolean r2 = r1 instanceof op1.C62084h
                    if (r2 == 0) goto L_0x000d
                    op1.h r1 = (op1.C62084h) r1
                    goto L_0x000e
                L_0x000d:
                    r1 = 0
                L_0x000e:
                    r12 = r1
                    if (r12 == 0) goto L_0x0151
                    sk1.x r1 = r0.f177453e
                    te3.fp1 r11 = r1.f181346s
                    java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                    java.lang.Class<cl1.u> r2 = cl1.C55001u.class
                    java.lang.String r3 = "product"
                    gy3.C87412m.m108594g(r11, r3)
                    java.util.HashMap<java.lang.Long, qp1.j$a> r3 = qp1.C63315j.f179661d
                    fj1.b r3 = r12.f176533g
                    androidx.lifecycle.i0 r3 = r3.mo71262a(r2)
                    cl1.u r3 = (cl1.C55001u) r3
                    te3.c21 r3 = r3.f154420q
                    long r3 = r3.f182392d
                    fj1.b r5 = r12.f176533g
                    androidx.lifecycle.i0 r5 = r5.mo71262a(r2)
                    cl1.u r5 = (cl1.C55001u) r5
                    long r5 = r5.f154416j
                    fj1.b r7 = r12.f176533g
                    androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
                    cl1.u r7 = (cl1.C55001u) r7
                    java.lang.String r7 = r7.f154423t
                    fj1.b r8 = r12.f176533g
                    androidx.lifecycle.i0 r8 = r8.mo71262a(r1)
                    cl1.o r8 = (cl1.C54991o) r8
                    java.lang.String r8 = r8.f154345o
                    fj1.b r9 = r12.f176533g
                    androidx.lifecycle.i0 r2 = r9.mo71262a(r2)
                    cl1.u r2 = (cl1.C55001u) r2
                    byte[] r9 = r2.f154417n
                    fj1.b r2 = r12.f176533g
                    androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
                    cl1.o r1 = (cl1.C54991o) r1
                    java.lang.String r10 = r1.f154357q3
                    java.lang.String r1 = "nonceId"
                    gy3.C87412m.m108594g(r7, r1)
                    java.lang.String r1 = "anchorUsername"
                    gy3.C87412m.m108594g(r8, r1)
                    long r1 = r11.f183176d
                    java.util.HashMap<java.lang.Long, qp1.j$a> r14 = qp1.C63315j.f179661d
                    java.lang.Long r13 = java.lang.Long.valueOf(r1)
                    java.lang.Object r13 = r14.get(r13)
                    qp1.j$a r13 = (qp1.C63315j.C63316a) r13
                    if (r13 != 0) goto L_0x0096
                    qp1.j$a r15 = new qp1.j$a
                    r16 = 0
                    r17 = 0
                    r19 = 0
                    r20 = 14
                    r21 = 0
                    r13 = r15
                    r22 = r12
                    r0 = r14
                    r12 = r15
                    r14 = r1
                    r13.<init>(r14, r16, r17, r19, r20, r21)
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r0.put(r1, r12)
                    r13 = r12
                    goto L_0x0099
                L_0x0096:
                    r22 = r12
                    r0 = r14
                L_0x0099:
                    long r1 = java.lang.System.currentTimeMillis()
                    ok1.e r12 = ok1.C62042e.f176370a
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r15 = "canRefresh note:"
                    r14.append(r15)
                    r14.append(r13)
                    java.lang.String r15 = ",curTime:"
                    r14.append(r15)
                    r14.append(r1)
                    r15 = 44
                    r14.append(r15)
                    r15 = r9
                    r16 = r10
                    long r9 = r13.f179667c
                    long r9 = r1 - r9
                    r14.append(r9)
                    java.lang.String r9 = r14.toString()
                    java.lang.String r10 = "ProductRefreshPresenter"
                    r12.mo86998D1(r10, r9)
                    boolean r9 = r13.f179668d
                    r12 = 1
                    if (r9 == 0) goto L_0x00d4
                    r9 = r15
                    r0 = 0
                    goto L_0x010f
                L_0x00d4:
                    r9 = r15
                    long r14 = r13.f179667c
                    long r14 = r1 - r14
                    r18 = 5000(0x1388, double:2.4703E-320)
                    int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                    if (r20 <= 0) goto L_0x00fc
                    long r1 = r13.f179665a
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.lang.Object r0 = r0.get(r1)
                    qp1.j$a r0 = (qp1.C63315j.C63316a) r0
                    if (r0 == 0) goto L_0x00f9
                    r0.f179666b = r12
                    long r1 = java.lang.System.currentTimeMillis()
                    r0.f179667c = r1
                    r1 = 0
                    r0.f179668d = r1
                    goto L_0x00fa
                L_0x00f9:
                    r1 = 0
                L_0x00fa:
                    r0 = 0
                    goto L_0x010d
                L_0x00fc:
                    r0 = 0
                    r17 = 500(0x1f4, double:2.47E-321)
                    int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
                    if (r19 <= 0) goto L_0x010f
                    int r14 = r13.f179666b
                    r15 = 5
                    if (r14 > r15) goto L_0x010f
                    int r14 = r14 + r12
                    r13.f179666b = r14
                    r13.f179667c = r1
                L_0x010d:
                    r1 = 1
                    goto L_0x0110
                L_0x010f:
                    r1 = 0
                L_0x0110:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r14 = "refreshProduct "
                    r2.append(r14)
                    java.lang.String r14 = r11.f183177e
                    r2.append(r14)
                    java.lang.String r14 = " canRefresh:"
                    r2.append(r14)
                    r2.append(r1)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
                    if (r1 != 0) goto L_0x0131
                    goto L_0x0151
                L_0x0131:
                    r13.f179668d = r12
                    zt3.t r1 = zt3.C119157j.f356862d
                    qp1.i r14 = new qp1.i
                    r2 = r14
                    r10 = r16
                    r15 = 1
                    r12 = r22
                    r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)
                    int r2 = r13.f179666b
                    int r2 = r2 - r15
                    if (r2 >= 0) goto L_0x0146
                    goto L_0x0147
                L_0x0146:
                    r0 = r2
                L_0x0147:
                    long r2 = (long) r0
                    r4 = 1000(0x3e8, double:4.94E-321)
                    long r2 = r2 * r4
                    zt3.j r1 = (zt3.C119157j) r1
                    r1.mo183878i(r14, r2)
                L_0x0151:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: pp1.C62438f.C62443e.C62444a.invoke():java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62443e(C62438f fVar, C63965x xVar, C8478d0 d0Var, C15601d<? super C62443e> dVar) {
            super(2, dVar);
            this.f177449e = fVar;
            this.f177450f = xVar;
            this.f177451g = d0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62443e(this.f177449e, this.f177450f, this.f177451g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62443e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f177448d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C62438f fVar = this.f177449e;
                C64068b0 b0Var = fVar.f177440N;
                if (b0Var != null) {
                    C64370fp1 fp12 = this.f177450f.f181346s;
                    LinearLayout linearLayout = (LinearLayout) ((C36570n) fVar.f177438L).getValue();
                    C87412m.m108593f(linearLayout, "promoteGroup");
                    int i2 = this.f177451g.f27483d;
                    C62444a aVar2 = new C62444a(this.f177449e, this.f177450f);
                    this.f177448d = 1;
                    if (b0Var.mo88820c("MicroMsg.FinderLiveShoppingViewHolder", fp12, true, linearLayout, i2, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pp1.f$f */
    public static final class C62445f extends C87413o implements C32224a<FinderLiveShoppingPriceView> {

        /* renamed from: d */
        public final /* synthetic */ View f177454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62445f(View view) {
            super(0);
            this.f177454d = view;
        }

        public Object invoke() {
            return (FinderLiveShoppingPriceView) this.f177454d.findViewById(C0966R.C0970id.i2k);
        }
    }

    /* renamed from: pp1.f$g */
    public static final class C62446g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62446g(View view) {
            super(0);
            this.f177455d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177455d.findViewById(C0966R.C0970id.i3e);
            textView.setTextSize(2, 14.0f);
            return textView;
        }
    }

    /* renamed from: pp1.f$h */
    public static final class C62447h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ View f177456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62447h(View view) {
            super(0);
            this.f177456d = view;
        }

        public Object invoke() {
            return (ImageView) this.f177456d.findViewById(C0966R.C0970id.i3t);
        }
    }

    /* renamed from: pp1.f$i */
    public static final class C62448i extends C87413o implements C32224a<FinderLiveProductRecordView> {

        /* renamed from: d */
        public final /* synthetic */ View f177457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62448i(View view) {
            super(0);
            this.f177457d = view;
        }

        public Object invoke() {
            return (FinderLiveProductRecordView) this.f177457d.findViewById(C0966R.C0970id.f358966i41);
        }
    }

    /* renamed from: pp1.f$j */
    public static final class C62449j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62449j(View view) {
            super(0);
            this.f177458d = view;
        }

        public Object invoke() {
            View findViewById = this.f177458d.findViewById(C0966R.C0970id.f358967i42);
            View view = this.f177458d;
            TextView textView = (TextView) findViewById;
            C15064b bVar = C15064b.f41199a;
            Context context = view.getContext();
            C87412m.m108593f(context, "itemView.context");
            C15064b.m14230a(bVar, context, textView, 10.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.f$k */
    public static final class C62450k extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62450k(View view) {
            super(0);
            this.f177459d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177459d.findViewById(C0966R.C0970id.f358968i43);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }

    /* renamed from: pp1.f$l */
    public static final class C62451l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62451l(View view) {
            super(0);
            this.f177460d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177460d.findViewById(C0966R.C0970id.i45);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }

    /* renamed from: pp1.f$m */
    public static final class C62452m extends C87413o implements C32224a<FinderLiveShopPromoteContainer> {

        /* renamed from: d */
        public final /* synthetic */ View f177461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62452m(View view) {
            super(0);
            this.f177461d = view;
        }

        public Object invoke() {
            return (FinderLiveShopPromoteContainer) this.f177461d.findViewById(C0966R.C0970id.i8b);
        }
    }

    /* renamed from: pp1.f$n */
    public static final class C62453n extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ View f177462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62453n(View view) {
            super(0);
            this.f177462d = view;
        }

        public Object invoke() {
            return (LinearLayout) this.f177462d.findViewById(C0966R.C0970id.muo);
        }
    }

    /* renamed from: pp1.f$o */
    public static final class C62454o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62454o(View view) {
            super(0);
            this.f177463d = view;
        }

        public Object invoke() {
            return (TextView) this.f177463d.findViewById(C0966R.C0970id.i3z);
        }
    }

    /* renamed from: pp1.f$p */
    public static final class C62455p extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ View f177464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62455p(View view) {
            super(0);
            this.f177464d = view;
        }

        public Object invoke() {
            return this.f177464d.findViewById(C0966R.C0970id.i44);
        }
    }

    /* renamed from: pp1.f$q */
    public static final class C62456q extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ View f177465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62456q(View view) {
            super(0);
            this.f177465d = view;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177465d.findViewById(C0966R.C0970id.i39);
            textView.setTextSize(2, 14.0f);
            C62042e.m72803Q1(C62042e.f176370a, textView, 0, 0, 6, (Object) null);
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62438f(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f177427A = C36568h.m40985a(new C62447h(view));
        this.f177428B = C36568h.m40985a(new C62449j(view));
        this.f177429C = C36568h.m40985a(new C62446g(view));
        this.f177430D = C36568h.m40985a(new C62445f(view));
        this.f177431E = C36568h.m40985a(new C62456q(view));
        this.f177432F = C36568h.m40985a(new C62454o(view));
        this.f177433G = C36568h.m40985a(new C62451l(view));
        this.f177434H = C36568h.m40985a(new C62450k(view));
        this.f177435I = C36568h.m40985a(new C62441c(view));
        this.f177436J = C36568h.m40985a(new C62442d(view));
        this.f177437K = C36568h.m40985a(new C62455p(view));
        this.f177438L = C36568h.m40985a(new C62453n(view));
        this.f177439M = C36568h.m40985a(new C62448i(view));
        this.f177441P = C36568h.m40985a(new C62452m(view));
        this.f177442Q = C36568h.m40985a(new C62440b(view));
        MapExpandKt.visitChild(view, C62439a.f177444d);
    }

    /* renamed from: B */
    public final FinderLiveShoppingPriceView mo87485B() {
        return (FinderLiveShoppingPriceView) ((C36570n) this.f177430D).getValue();
    }

    /* renamed from: C */
    public final TextView mo87486C() {
        return (TextView) ((C36570n) this.f177429C).getValue();
    }

    /* renamed from: D */
    public final FinderLiveProductRecordView mo87487D() {
        return (FinderLiveProductRecordView) ((C36570n) this.f177439M).getValue();
    }

    /* renamed from: E */
    public final TextView mo87488E() {
        return (TextView) ((C36570n) this.f177428B).getValue();
    }

    /* renamed from: F */
    public final TextView mo87489F() {
        return (TextView) ((C36570n) this.f177434H).getValue();
    }

    /* renamed from: G */
    public final TextView mo87490G() {
        return (TextView) ((C36570n) this.f177431E).getValue();
    }

    /* renamed from: H */
    public final void mo87491H(C63965x xVar) {
        C87412m.m108594g(xVar, "item");
        LinkedList<z44> linkedList = xVar.f181346s.f183165J;
        if (linkedList == null || linkedList.isEmpty()) {
            C64068b0 b0Var = this.f177440N;
            if (b0Var != null) {
                LinearLayout linearLayout = (LinearLayout) ((C36570n) this.f177438L).getValue();
                C87412m.m108593f(linearLayout, "promoteGroup");
                b0Var.mo88819b("MicroMsg.FinderLiveShoppingViewHolder", linearLayout);
                return;
            }
            return;
        }
        int measuredWidth = ((LinearLayout) ((C36570n) this.f177438L).getValue()).getMeasuredWidth();
        C8478d0 d0Var = new C8478d0();
        if (measuredWidth <= 0) {
            measuredWidth = (int) ((((float) C75044y4.m89990b(this.f44854d.getContext()).x) - this.f44854d.getContext().getResources().getDimension(C0966R.dimen.f3754d5)) - ((float) C79406f.m96347a(MMApplicationContext.getContext(), 100.0f)));
        }
        d0Var.f27483d = measuredWidth;
        if (this.f177440N == null) {
            Context context = this.f44854d.getContext();
            C87412m.m108593f(context, "itemView.context");
            this.f177440N = new C64068b0(context);
        }
        C0000n0 n0Var = this.f29679z;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C62443e(this, xVar, d0Var, (C15601d<? super C62443e>) null), 3, (Object) null);
        }
    }

    /* renamed from: I */
    public final void mo87492I(boolean z, boolean z2, C64370fp1 fp12, C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        ((FinderLiveShopPromoteContainer) ((C36570n) this.f177441P).getValue()).mo78796j(z, z2, "MicroMsg.FinderLiveShoppingViewHolder desc:" + mo87486C().getText() + ",id:" + mo87488E().getText() + ",platformId:" + mo87489F().getText(), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0127  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.C56321b mo87493z(sk1.C63965x r20) {
        /*
            r19 = this;
            r0 = r19
            r3 = r20
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r3, r1)
            android.view.View r1 = r0.f44854d
            android.content.Context r2 = r1.getContext()
            te3.fp1 r1 = r3.f181346s
            int r1 = r1.f183168M
            r5 = 1
            if (r1 == 0) goto L_0x0020
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r1 = r19.mo87487D()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0036
        L_0x0020:
            te3.bs4 r1 = r3.f181343K
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r1.f131295f
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 == 0) goto L_0x0033
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            if (r1 != 0) goto L_0x0038
        L_0x0036:
            r7 = 1
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r1 = r19.mo87487D()
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0045
            r8 = 1
            goto L_0x0046
        L_0x0045:
            r8 = 0
        L_0x0046:
            te3.fp1 r1 = r3.f181346s
            int r1 = r1.f183173S
            if (r1 == 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            android.content.res.Resources r1 = r2.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r10 = 2
            if (r1 != r10) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            r1 = 2131166522(0x7f07053a, float:1.7947292E38)
            int r1 = kg3.C76577a.m92155f(r2, r1)
            r11 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r11 = kg3.C76577a.m92155f(r2, r11)
            int r1 = r1 + r11
            r11 = 2131166521(0x7f070539, float:1.794729E38)
            int r11 = kg3.C76577a.m92155f(r2, r11)
            r12 = 2131166520(0x7f070538, float:1.7947288E38)
            int r12 = kg3.C76577a.m92155f(r2, r12)
            r13 = 2131166519(0x7f070537, float:1.7947286E38)
            int r13 = kg3.C76577a.m92155f(r2, r13)
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r14 = r19.mo87487D()
            int r14 = r14.getVisibility()
            if (r14 != 0) goto L_0x009c
            r14 = 2131166527(0x7f07053f, float:1.7947302E38)
            int r14 = kg3.C76577a.m92155f(r2, r14)
            r15 = 2131166526(0x7f07053e, float:1.79473E38)
            int r15 = kg3.C76577a.m92155f(r2, r15)
            int r14 = r14 + r15
            goto L_0x009d
        L_0x009c:
            r14 = 0
        L_0x009d:
            if (r5 == 0) goto L_0x00a6
            android.graphics.Point r15 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r15 = r15.y
            goto L_0x00aa
        L_0x00a6:
            int r15 = kg3.C76577a.m92145A(r2)
        L_0x00aa:
            float r15 = (float) r15
            r16 = 4
            if (r5 == 0) goto L_0x00b2
            r17 = 4
            goto L_0x00b4
        L_0x00b2:
            r17 = 2
        L_0x00b4:
            int r17 = r17 * r1
            int r17 = r17 + r12
            int r17 = r17 + r11
            int r17 = r17 + r13
            int r4 = r17 + r14
            float r4 = (float) r4
            float r4 = r15 - r4
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r6 = r19.mo87485B()
            r18 = r15
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r15 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f160998q
            r6.mo78824b(r10, r3, r15)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r6 = r19.mo87485B()
            r15 = 0
            r6.measure(r15, r15)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r6 = r19.mo87485B()
            int r6 = r6.getMeasuredWidth()
            float r6 = (float) r6
            r15 = 8
            r10 = 2131311348(0x7f093af4, float:1.8241034E38)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0127
            rx3.g r1 = r0.f177442Q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r3 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x00fc
            r4 = r1
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x011c
            r4.removeRule(r15)
            r1 = 3
            r4.addRule(r1, r10)
            r1 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r1 = kg3.C76577a.m92155f(r2, r1)
            r4.topMargin = r1
            rx3.g r1 = r0.f177442Q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setLayoutParams(r4)
        L_0x011c:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r1 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f160997p
            r1.f161007c = r8
            r1.f161008d = r8
            r1.f161010f = r7
            r1.f161012h = r9
            goto L_0x017f
        L_0x0127:
            rx3.g r4 = r0.f177442Q
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x013c
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x013d
        L_0x013c:
            r4 = 0
        L_0x013d:
            if (r4 == 0) goto L_0x0156
            r6 = 3
            r4.removeRule(r6)
            r4.addRule(r15, r10)
            r6 = 0
            r4.topMargin = r6
            rx3.g r6 = r0.f177442Q
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setLayoutParams(r4)
        L_0x0156:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r4 = r19.mo87485B()
            if (r5 == 0) goto L_0x015e
            r10 = 4
            goto L_0x015f
        L_0x015e:
            r10 = 2
        L_0x015f:
            int r1 = r1 * r10
            int r1 = r1 + r12
            int r1 = r1 + r11
            int r1 = r1 + r13
            int r1 = r1 + r14
            float r1 = (float) r1
            float r5 = r18 - r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 1099431936(0x41880000, float:17.0)
            int r1 = kg3.C76577a.m92150a(r1, r6)
            float r10 = (float) r1
            r1 = r4
            r3 = r20
            r4 = r5
            r5 = r8
            r6 = r8
            r8 = r9
            r9 = r10
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r1 = r1.mo78823a(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x017f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.C62438f.mo87493z(sk1.x):com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b");
    }
}
