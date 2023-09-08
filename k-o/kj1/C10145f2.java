package kj1;

import android.content.Context;
import cl1.C0657g1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import kj1.C10125e1;
import lj1.C10535c;
import rx3.C13598b0;
import te3.C51068r71;
import wj1.C15410a;
import yj1.C16019a;

/* renamed from: kj1.f2 */
public final class C10145f2 extends C10535c {

    /* renamed from: h */
    public final String f31068h = "audience.more.morefunction.rewardlimit";

    /* renamed from: i */
    public boolean f31069i;

    /* renamed from: kj1.f2$a */
    public static final class C10146a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f31070d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f31071e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10146a(C8477a0 a0Var, C4191v0 v0Var) {
            super(0);
            this.f31070d = a0Var;
            this.f31071e = v0Var;
        }

        public Object invoke() {
            this.f31070d.f27482d = false;
            C4191v0 v0Var = this.f31071e;
            v0Var.f18469o = true;
            v0Var.mo5072g();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kj1.f2$b */
    public static final class C10147b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f31072d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10147b(C8477a0 a0Var, C10125e1 e1Var) {
            super(0);
            this.f31072d = a0Var;
            this.f31073e = e1Var;
        }

        public Object invoke() {
            this.f31072d.f27482d = true;
            C10125e1 e1Var = this.f31073e;
            C87412m.m108594g(e1Var, "<this>");
            new C10187l2(e1Var, 2).mo10560v(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kj1.f2$c */
    public static final class C10148c implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f31074a;

        /* renamed from: b */
        public final /* synthetic */ C10145f2 f31075b;

        /* renamed from: c */
        public final /* synthetic */ C10125e1 f31076c;

        public C10148c(C8477a0 a0Var, C10145f2 f2Var, C10125e1 e1Var) {
            this.f31074a = a0Var;
            this.f31075b = f2Var;
            this.f31076c = e1Var;
        }

        public final void onDismiss() {
            C10125e1.C10127b bVar;
            C10125e1.C10126a aVar;
            C15410a aVar2;
            if (!(!this.f31074a.f27482d || !this.f31075b.f31069i || (bVar = this.f31076c.f30988g) == null || (aVar = bVar.f31008a) == null || (aVar2 = (C15410a) aVar.getPlugin(C15410a.class)) == null)) {
                if (aVar2.f41807q == null) {
                    Context context = aVar2.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    aVar2.f41807q = new C16019a(context, aVar2);
                }
                C16019a aVar3 = aVar2.f41807q;
                if (aVar3 != null) {
                    aVar3.mo3431p();
                }
            }
            this.f31075b.mo10802d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10145f2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31068h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C51068r71 r712 = ((C0657g1) this.f31809a.mo10534b(C0657g1.class)).f1556h;
        return r712 != null && r712.f140741d == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0105, code lost:
        r4 = r4.f31008a;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10520n(kj1.C10125e1 r21, com.tencent.p014mm.plugin.finder.view.C4191v0 r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            java.lang.Class<cl1.g1> r2 = cl1.C0657g1.class
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "bottomSheet"
            gy3.C87412m.m108594g(r1, r3)
            android.view.View r7 = r1.f18463f
            androidx.lifecycle.i0 r3 = r0.mo10534b(r2)
            cl1.g1 r3 = (cl1.C0657g1) r3
            te3.r71 r3 = r3.f1556h
            gy3.a0 r11 = new gy3.a0
            r11.<init>()
            r4 = 1
            r11.f27482d = r4
            r5 = 2131312420(0x7f093f24, float:1.8243208E38)
            android.view.View r5 = r7.findViewById(r5)
            r6 = 2131312421(0x7f093f25, float:1.824321E38)
            android.view.View r6 = r7.findViewById(r6)
            r8 = 2131315332(0x7f094a84, float:1.8249114E38)
            android.view.View r8 = r7.findViewById(r8)
            boolean r9 = r20.mo10519k()
            r10 = 0
            if (r9 == 0) goto L_0x0158
            kj1.d1 r9 = kj1.C10119d1.f30943a
            r12 = 4
            r13 = 3
            r9.mo10530a(r12, r10, r13, r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.mo10233c(r9)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r15 = "addItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r4.mo10231a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r14 = "addItem"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r4.mo10233c(r5)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r15 = "addItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r6
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r4.mo10231a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6.setVisibility(r4)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r14 = "addItem"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r4.mo10233c(r5)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r15 = "addItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r8
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r4.mo10231a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r8.setVisibility(r4)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r14 = "addItem"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            kj1.e1$b r4 = r0.f30988g
            if (r4 == 0) goto L_0x0112
            kj1.e1$a r4 = r4.f31008a
            if (r4 == 0) goto L_0x0112
            java.lang.Class<wj1.a> r5 = wj1.C15410a.class
            qj1.c r4 = r4.getPlugin(r5)
            wj1.a r4 = (wj1.C15410a) r4
            goto L_0x0113
        L_0x0112:
            r4 = 0
        L_0x0113:
            r6 = r4
            if (r3 != 0) goto L_0x0120
            androidx.lifecycle.i0 r2 = r0.mo10534b(r2)
            cl1.g1 r2 = (cl1.C0657g1) r2
            te3.r71 r2 = r2.f1556h
            r8 = r2
            goto L_0x0121
        L_0x0120:
            r8 = r3
        L_0x0121:
            java.lang.String r2 = r0.f30980a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "showConsumeManagerWidget restrictConsumeDialogData: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r6 == 0) goto L_0x0216
            if (r8 == 0) goto L_0x0216
            kj1.e1$b r2 = r0.f30988g
            if (r2 != 0) goto L_0x0142
            goto L_0x0216
        L_0x0142:
            yj1.e r3 = new yj1.e
            com.tencent.mm.ui.MMActivity r5 = r0.f30985d
            kj1.f2$a r9 = new kj1.f2$a
            r9.<init>(r11, r1)
            kj1.f2$b r10 = new kj1.f2$b
            r10.<init>(r11, r0)
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.f31017j = r3
            goto L_0x0216
        L_0x0158:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r15 = "addItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r14 = "addItem"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r15 = "addItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r6
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r14 = "addItem"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r15 = "addItem"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r8
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption"
            java.lang.String r14 = "addItem"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0216:
            kj1.f2$c r2 = new kj1.f2$c
            r3 = r20
            r2.<init>(r11, r3, r0)
            r1.f18472r = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10145f2.mo10520n(kj1.e1, com.tencent.mm.plugin.finder.view.v0):void");
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.opd);
    }
}
