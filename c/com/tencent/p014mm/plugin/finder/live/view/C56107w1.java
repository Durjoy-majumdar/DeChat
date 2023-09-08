package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54108o;
import android.view.View;
import cl1.C54974f1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C47883u;
import rx3.C13598b0;
import te3.C64370fp1;
import te3.C64857yh3;

/* renamed from: com.tencent.mm.plugin.finder.live.view.w1 */
public final class C56107w1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveProductRecordView f159973d;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.w1$a */
    public static final class C56108a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C64370fp1 f159974a;

        /* renamed from: b */
        public final /* synthetic */ FinderLiveProductRecordView f159975b;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.w1$a$a */
        public static final class C56109a extends C87413o implements C32227p<Boolean, Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveProductRecordView f159976d;

            /* renamed from: e */
            public final /* synthetic */ C64370fp1 f159977e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56109a(FinderLiveProductRecordView finderLiveProductRecordView, C64370fp1 fp12) {
                super(2);
                this.f159976d = finderLiveProductRecordView;
                this.f159977e = fp12;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Number) obj2).longValue();
                if (booleanValue) {
                    C54974f1 f1Var = (C54974f1) FinderLiveService.f159376d.mo77630e(C54974f1.class);
                    if (f1Var != null) {
                        f1Var.mo75934c3((C64370fp1) null);
                    }
                    FinderLiveProductRecordView.m64006d(this.f159976d, this.f159977e, 0);
                    FinderLiveProductRecordView finderLiveProductRecordView = this.f159976d;
                    C64370fp1 fp12 = finderLiveProductRecordView.f159800h;
                    if (fp12 != null) {
                        FinderLiveProductRecordView.m64005c(finderLiveProductRecordView, 105, fp12.f183176d, new C56105v1(fp12, finderLiveProductRecordView));
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C56108a(C64370fp1 fp12, FinderLiveProductRecordView finderLiveProductRecordView) {
            this.f159974a = fp12;
            this.f159975b = finderLiveProductRecordView;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                C64857yh3 yh32 = this.f159974a.f183160E;
                int i = yh32 != null ? yh32.f186534f : 0;
                if (i > 0) {
                    int i2 = FinderLiveProductRecordView.f159795r;
                    if (((long) (C31543z5.m39455e() - i)) < 5) {
                        C7335d c = C86312j.m106911c(C54108o.class);
                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                        C54108o.Ux0((C54108o) c, 7, 1, 0, 0, 12, (Object) null);
                        FinderLiveProductRecordView.m64007e(this.f159975b, C0966R.string.e3b);
                        return;
                    }
                }
                FinderLiveProductRecordView finderLiveProductRecordView = this.f159975b;
                C64370fp1 fp12 = this.f159974a;
                FinderLiveProductRecordView.m64005c(finderLiveProductRecordView, 106, fp12.f183176d, new C56109a(finderLiveProductRecordView, fp12));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.w1$b */
    public static final class C56110b extends C87413o implements C32227p<Boolean, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64370fp1 f159978d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveProductRecordView f159979e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56110b(C64370fp1 fp12, FinderLiveProductRecordView finderLiveProductRecordView) {
            super(2);
            this.f159978d = fp12;
            this.f159979e = finderLiveProductRecordView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
            r1 = r1.f154420q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            /*
                r3 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                java.lang.Number r5 = (java.lang.Number) r5
                r5.longValue()
                if (r4 == 0) goto L_0x004c
                te3.fp1 r4 = r3.f159978d
                te3.yh3 r5 = new te3.yh3
                r5.<init>()
                int r0 = eb0.C31543z5.m39455e()
                r5.f186534f = r0
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.u> r1 = cl1.C55001u.class
                androidx.lifecycle.i0 r1 = r0.mo77630e(r1)
                cl1.u r1 = (cl1.C55001u) r1
                if (r1 == 0) goto L_0x002d
                te3.c21 r1 = r1.f154420q
                if (r1 == 0) goto L_0x002d
                long r1 = r1.f182392d
                goto L_0x002f
            L_0x002d:
                r1 = 0
            L_0x002f:
                r5.f186532d = r1
                r4.f183160E = r5
                java.lang.Class<cl1.f1> r4 = cl1.C54974f1.class
                androidx.lifecycle.i0 r4 = r0.mo77630e(r4)
                cl1.f1 r4 = (cl1.C54974f1) r4
                if (r4 != 0) goto L_0x003e
                goto L_0x0043
            L_0x003e:
                te3.fp1 r5 = r3.f159978d
                r4.mo75934c3(r5)
            L_0x0043:
                com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r4 = r3.f159979e
                te3.fp1 r5 = r3.f159978d
                r0 = 1000(0x3e8, float:1.401E-42)
                com.tencent.p014mm.plugin.finder.live.view.FinderLiveProductRecordView.m64006d(r4, r5, r0)
            L_0x004c:
                rx3.b0 r4 = rx3.C13598b0.f38549a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56107w1.C56110b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C56107w1(FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f159973d = finderLiveProductRecordView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0036, code lost:
        r0 = r0.f154113E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordLaunchView$2$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.Class<ak1.o> r10 = ak1.C54108o.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            java.lang.String r0 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r10, r0)
            r1 = r10
            ak1.o r1 = (ak1.C54108o) r1
            r2 = 4
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
            androidx.lifecycle.i0 r0 = r10.mo77630e(r0)
            cl1.h1 r0 = (cl1.C54979h1) r0
            if (r0 == 0) goto L_0x003e
            te3.gj1 r0 = r0.f154113E
            if (r0 == 0) goto L_0x003e
            int r0 = r0.f183344e
            r3 = r0
            goto L_0x0040
        L_0x003e:
            r0 = 0
            r3 = 0
        L_0x0040:
            r4 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            ak1.C54108o.Ux0(r1, r2, r3, r4, r6, r7, r8)
            java.lang.Class<cl1.f1> r0 = cl1.C54974f1.class
            androidx.lifecycle.i0 r10 = r10.mo77630e(r0)
            cl1.f1 r10 = (cl1.C54974f1) r10
            if (r10 == 0) goto L_0x0080
            te3.fp1 r10 = r10.f154098g
            if (r10 == 0) goto L_0x0080
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r0 = r9.f159973d
            qo3.q r1 = new qo3.q
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            android.content.Context r2 = r0.getContext()
            r3 = 2131828533(0x7f111f35, float:1.929001E38)
            java.lang.String r2 = r2.getString(r3)
            r1.mo107595g(r2)
            r2 = 1
            r1.mo107589a(r2)
            com.tencent.mm.plugin.finder.live.view.w1$a r2 = new com.tencent.mm.plugin.finder.live.view.w1$a
            r2.<init>(r10, r0)
            r1.mo107590b(r2)
            r1.mo107603o()
            goto L_0x0092
        L_0x0080:
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r10 = r9.f159973d
            te3.fp1 r0 = r10.f159800h
            if (r0 == 0) goto L_0x0092
            r1 = 105(0x69, float:1.47E-43)
            long r2 = r0.f183176d
            com.tencent.mm.plugin.finder.live.view.w1$b r4 = new com.tencent.mm.plugin.finder.live.view.w1$b
            r4.<init>(r0, r10)
            com.tencent.p014mm.plugin.finder.live.view.FinderLiveProductRecordView.m64005c(r10, r1, r2, r4)
        L_0x0092:
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordLaunchView$2$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r9, r10, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56107w1.onClick(android.view.View):void");
    }
}
