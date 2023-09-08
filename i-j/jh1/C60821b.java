package jh1;

import a14.C0000n0;
import a14.C53934p0;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import er1.C58739j4;
import fh1.C58999c1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nk1.C11207i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jh1.b */
public final class C60821b implements View.OnClickListener {

    /* renamed from: d */
    public final View f173231d;

    /* renamed from: e */
    public final C58999c1 f173232e;

    /* renamed from: f */
    public final String f173233f;

    /* renamed from: g */
    public View f173234g;

    /* renamed from: h */
    public View f173235h;

    /* renamed from: i */
    public View f173236i;

    /* renamed from: j */
    public TextView f173237j;

    /* renamed from: n */
    public TextView f173238n;

    /* renamed from: o */
    public WxRecyclerView f173239o;

    /* renamed from: p */
    public View f173240p;

    /* renamed from: q */
    public TextView f173241q;

    /* renamed from: r */
    public TextView f173242r;

    /* renamed from: s */
    public View f173243s;

    /* renamed from: t */
    public TextView f173244t;

    /* renamed from: u */
    public TextView f173245u;

    /* renamed from: v */
    public TextView f173246v;

    /* renamed from: w */
    public final C13601g f173247w = C36568h.m40985a(C60822a.f173248d);

    /* renamed from: jh1.b$a */
    public static final class C60822a extends C87413o implements C32224a<ArrayList<C9433z>> {

        /* renamed from: d */
        public static final C60822a f173248d = new C60822a();

        public C60822a() {
            super(0);
        }

        public Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: jh1.b$b */
    public static final class C60823b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ C60821b f173249d;

        public C60823b(C60821b bVar) {
            this.f173249d = bVar;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.left = 0;
            rect.right = 0;
            rect.top = 0;
            rect.bottom = (int) this.f173249d.f173231d.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.LiveMileStoneLotteryResultVoteDescPage$onClick$1", mo125469f = "LiveMileStoneLotteryResultVoteDescPage.kt", mo125470l = {160}, mo125471m = "invokeSuspend")
    /* renamed from: jh1.b$c */
    public static final class C60824c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f173250d;

        /* renamed from: e */
        public final /* synthetic */ C60821b f173251e;

        /* renamed from: jh1.b$c$a */
        public static final class C60825a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60821b f173252d;

            /* renamed from: e */
            public final /* synthetic */ View f173253e;

            /* renamed from: f */
            public final /* synthetic */ View f173254f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60825a(C60821b bVar, View view, View view2) {
                super(0);
                this.f173252d = bVar;
                this.f173253e = view;
                this.f173254f = view2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
                r2 = r2.f173258g;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r11 = this;
                    jh1.b r0 = r11.f173252d
                    java.lang.String r0 = r0.f173233f
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "on vote_desc back on beforePageAnimEnd!winnerContainner:"
                    r1.append(r2)
                    jh1.b r2 = r11.f173252d
                    fh1.c1 r2 = r2.f173232e
                    jh1.c r2 = r2.f168798o
                    r3 = 0
                    if (r2 == 0) goto L_0x0024
                    android.view.ViewGroup r2 = r2.f173258g
                    if (r2 == 0) goto L_0x0024
                    int r2 = r2.getVisibility()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    goto L_0x0025
                L_0x0024:
                    r2 = r3
                L_0x0025:
                    r1.append(r2)
                    java.lang.String r2 = ",participantContainner:"
                    r1.append(r2)
                    jh1.b r2 = r11.f173252d
                    fh1.c1 r2 = r2.f173232e
                    jh1.a r2 = r2.f168799p
                    if (r2 == 0) goto L_0x0042
                    android.view.ViewGroup r2 = r2.f173224g
                    if (r2 == 0) goto L_0x0042
                    int r2 = r2.getVisibility()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    goto L_0x0043
                L_0x0042:
                    r2 = r3
                L_0x0043:
                    r1.append(r2)
                    java.lang.String r2 = ",voteDescContainer:"
                    r1.append(r2)
                    jh1.b r2 = r11.f173252d
                    fh1.c1 r2 = r2.f173232e
                    jh1.b r2 = r2.f168800q
                    if (r2 == 0) goto L_0x005f
                    android.view.View r2 = r2.f173235h
                    if (r2 == 0) goto L_0x005f
                    int r2 = r2.getVisibility()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                L_0x005f:
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                    android.view.View r0 = r11.f173253e
                    r1 = 8
                    k20.a r10 = new k20.a
                    r10.<init>()
                    java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r10.mo10233c(r1)
                    java.lang.Object[] r3 = r10.mo10232b()
                    java.lang.String r4 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage$onClick$1$1$1"
                    java.lang.String r5 = "invoke"
                    java.lang.String r6 = "()V"
                    java.lang.String r7 = "android/view/View_EXEC_"
                    java.lang.String r8 = "setVisibility"
                    java.lang.String r9 = "(I)V"
                    r2 = r0
                    j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
                    r1 = 0
                    java.lang.Object r1 = r10.mo10231a(r1)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    r0.setVisibility(r1)
                    java.lang.String r3 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage$onClick$1$1$1"
                    java.lang.String r4 = "invoke"
                    java.lang.String r5 = "()V"
                    java.lang.String r6 = "android/view/View_EXEC_"
                    java.lang.String r7 = "setVisibility"
                    java.lang.String r8 = "(I)V"
                    j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
                    android.view.View r0 = r11.f173253e
                    r1 = 0
                    r0.setTranslationX(r1)
                    android.view.View r0 = r11.f173254f
                    r0.setTranslationX(r1)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: jh1.C60821b.C60824c.C60825a.invoke():java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60824c(C60821b bVar, C15601d<? super C60824c> dVar) {
            super(2, dVar);
            this.f173251e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60824c(this.f173251e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60824c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r7 = r7.f173258g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f173250d
                r2 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r2) goto L_0x000e
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x00bc
            L_0x000e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0016:
                kotlin.ResultKt.throwOnFailure(r13)
                jh1.b r13 = r12.f173251e
                android.view.View r5 = r13.f173235h
                android.view.View r6 = r13.f173234g
                r1 = 0
                if (r5 == 0) goto L_0x009b
                if (r6 == 0) goto L_0x009b
                java.lang.String r3 = r13.f173233f
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "on vote_desc back click, before animation,winnerContainner:"
                r4.append(r7)
                fh1.c1 r7 = r13.f173232e
                jh1.c r7 = r7.f168798o
                if (r7 == 0) goto L_0x0044
                android.view.ViewGroup r7 = r7.f173258g
                if (r7 == 0) goto L_0x0044
                int r7 = r7.getVisibility()
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r7)
                goto L_0x0045
            L_0x0044:
                r8 = r1
            L_0x0045:
                r4.append(r8)
                java.lang.String r7 = ",participantContainner:"
                r4.append(r7)
                fh1.c1 r7 = r13.f173232e
                jh1.a r7 = r7.f168799p
                if (r7 == 0) goto L_0x0061
                android.view.ViewGroup r7 = r7.f173224g
                if (r7 == 0) goto L_0x0061
                int r7 = r7.getVisibility()
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r7)
                goto L_0x0062
            L_0x0061:
                r8 = r1
            L_0x0062:
                r4.append(r8)
                java.lang.String r7 = ",voteDescContainer:"
                r4.append(r7)
                fh1.c1 r7 = r13.f173232e
                jh1.b r7 = r7.f168800q
                if (r7 == 0) goto L_0x007e
                android.view.View r7 = r7.f173235h
                if (r7 == 0) goto L_0x007e
                int r1 = r7.getVisibility()
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r1)
                r1 = r7
            L_0x007e:
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                jh1.j r3 = jh1.C9406j.f29357a
                java.lang.String r4 = r13.f173233f
                r7 = 0
                jh1.b$c$a r8 = new jh1.b$c$a
                r8.<init>(r13, r5, r6)
                r9 = 0
                r10 = 32
                r11 = 0
                jh1.C9406j.m9110b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x009b:
                if (r1 != 0) goto L_0x00be
                jh1.b r13 = r12.f173251e
                java.lang.String r1 = r13.f173233f
                java.lang.String r3 = "on vote_desc back click without animation!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                fh1.c1 r4 = r13.f173232e
                te3.p31 r6 = r4.f168804u
                if (r6 == 0) goto L_0x00be
                fh1.c1$a r5 = r4.f168807x
                r7 = 0
                r8 = 0
                fy3.l<? super java.lang.Boolean, rx3.b0> r9 = r4.f168806w
                r12.f173250d = r2
                r10 = r12
                java.lang.Object r13 = r4.mo84228F3(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L_0x00bc
                return r0
            L_0x00bc:
                rx3.b0 r13 = rx3.C13598b0.f38549a
            L_0x00be:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.C60821b.C60824c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C60821b(View view, C58999c1 c1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(c1Var, "controller");
        this.f173231d = view;
        this.f173232e = c1Var;
        this.f173233f = c1Var.f168796j;
    }

    /* renamed from: a */
    public final ArrayList<C9433z> mo85739a() {
        return (ArrayList) ((C36570n) this.f173247w).getValue();
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85740b() {
        /*
            r9 = this;
            android.view.View r0 = r9.f173235h
            r1 = 0
            if (r0 != 0) goto L_0x0017
            android.view.View r0 = r9.f173231d
            r2 = 2131308265(0x7f092ee9, float:1.823478E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0016
            r0.setOnClickListener(r9)
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            r9.f173235h = r0
            android.view.View r2 = r9.f173236i
            if (r2 != 0) goto L_0x002d
            if (r0 == 0) goto L_0x002c
            r2 = 2131316573(0x7f094f5d, float:1.8251631E38)
            android.view.View r2 = r0.findViewById(r2)
            if (r2 == 0) goto L_0x002c
            r2.setOnClickListener(r9)
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            r9.f173236i = r2
            android.widget.TextView r0 = r9.f173237j
            if (r0 != 0) goto L_0x0059
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x0058
            r2 = 2131316576(0x7f094f60, float:1.8251637E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0058
            wc1.b r2 = wc1.C15064b.f41199a
            android.content.Context r3 = r0.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            r5 = 1099431936(0x41880000, float:17.0)
            r6 = 0
            r7 = 8
            r8 = 0
            r4 = r0
            wc1.C15064b.m14230a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0059
        L_0x0058:
            r0 = r1
        L_0x0059:
            r9.f173237j = r0
            android.widget.TextView r0 = r9.f173238n
            if (r0 != 0) goto L_0x006e
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x006d
            r2 = 2131316613(0x7f094f85, float:1.8251712E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            r9.f173238n = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r9.f173239o
            if (r0 != 0) goto L_0x0093
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x0092
            r2 = 2131299535(0x7f090ccf, float:1.8217074E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            if (r0 == 0) goto L_0x0092
            int r2 = r0.getItemDecorationCount()
            if (r2 > 0) goto L_0x0093
            jh1.b$b r2 = new jh1.b$b
            r2.<init>(r9)
            r0.mo17085h0(r2)
            goto L_0x0093
        L_0x0092:
            r0 = r1
        L_0x0093:
            r9.f173239o = r0
            android.view.View r0 = r9.f173240p
            if (r0 != 0) goto L_0x00a6
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x00a5
            r2 = 2131316617(0x7f094f89, float:1.825172E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x00a6
        L_0x00a5:
            r0 = r1
        L_0x00a6:
            r9.f173240p = r0
            android.widget.TextView r0 = r9.f173241q
            if (r0 != 0) goto L_0x00bb
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x00ba
            r2 = 2131316616(0x7f094f88, float:1.8251719E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00bb
        L_0x00ba:
            r0 = r1
        L_0x00bb:
            r9.f173241q = r0
            android.widget.TextView r0 = r9.f173242r
            if (r0 != 0) goto L_0x00d0
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x00cf
            r2 = 2131296999(0x7f0902e7, float:1.821193E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00d0
        L_0x00cf:
            r0 = r1
        L_0x00d0:
            r9.f173242r = r0
            android.view.View r0 = r9.f173243s
            if (r0 != 0) goto L_0x00e3
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x00e2
            r2 = 2131299545(0x7f090cd9, float:1.8217094E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x00e3
        L_0x00e2:
            r0 = r1
        L_0x00e3:
            r9.f173243s = r0
            android.widget.TextView r0 = r9.f173244t
            if (r0 != 0) goto L_0x00f8
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x00f7
            r2 = 2131316009(0x7f094d29, float:1.8250487E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00f8
        L_0x00f7:
            r0 = r1
        L_0x00f8:
            r9.f173244t = r0
            android.widget.TextView r0 = r9.f173246v
            if (r0 != 0) goto L_0x010d
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x010c
            r2 = 2131316574(0x7f094f5e, float:1.8251633E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x010d
        L_0x010c:
            r0 = r1
        L_0x010d:
            r9.f173246v = r0
            android.widget.TextView r0 = r9.f173245u
            if (r0 != 0) goto L_0x0122
            android.view.View r0 = r9.f173235h
            if (r0 == 0) goto L_0x0123
            r1 = 2131316575(0x7f094f5f, float:1.8251635E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0123
        L_0x0122:
            r1 = r0
        L_0x0123:
            r9.f173245u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C60821b.mo85740b():void");
    }

    /* renamed from: c */
    public final void mo85741c(int i) {
        Integer num = null;
        if (C58739j4.f168176a.mo83692U()) {
            String str = this.f173233f;
            StringBuilder sb = new StringBuilder();
            sb.append("setVisible:");
            sb.append(i);
            sb.append(",voteDescContainer visibility:");
            View view = this.f173235h;
            if (view != null) {
                num = Integer.valueOf(view.getVisibility());
            }
            sb.append(num);
            Log.printInfoStack(str, sb.toString(), new Object[0]);
        } else {
            String str2 = this.f173233f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("setVisible:");
            sb4.append(i);
            sb4.append(",voteDescContainer visibility:");
            View view2 = this.f173235h;
            if (view2 != null) {
                num = Integer.valueOf(view2.getVisibility());
            }
            sb4.append(num);
            Log.m105924i(str2, sb4.toString());
        }
        if (this.f173235h == null) {
            mo85740b();
        }
        View view3 = this.f173235h;
        if (view3 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ojd) {
            C11207i.m11071g(this.f173232e, (C66212f) null, (C53934p0) null, new C60824c(this, (C15601d<? super C60824c>) null), 3, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
