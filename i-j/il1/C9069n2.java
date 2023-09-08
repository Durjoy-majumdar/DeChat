package il1;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import nj3.C76912y0;
import q40.C12040d;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50689oj;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubAnnouncementSettingWidget$uploadCoverAndMod$1", mo125469f = "FinderLiveFansClubAnnouncementSettingWidget.kt", mo125470l = {361, 374}, mo125471m = "invokeSuspend")
/* renamed from: il1.n2 */
public final class C9069n2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f28619d;

    /* renamed from: e */
    public int f28620e;

    /* renamed from: f */
    public final /* synthetic */ C9030k2 f28621f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C89779i0> f28622g;

    /* renamed from: il1.n2$a */
    public static final class C9070a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28623d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C50689oj> f28624e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9070a(C9030k2 k2Var, C8479f0<C50689oj> f0Var) {
            super(0);
            this.f28623d = k2Var;
            this.f28624e = f0Var;
        }

        public Object invoke() {
            C76912y0.m92768g(this.f28623d.getContext(), this.f28623d.getContext().getResources().getString(C0966R.string.mfj));
            C9030k2 k2Var = this.f28623d;
            k2Var.f28540z = null;
            k2Var.f28517A = null;
            C32226l<C50689oj, C13598b0> backClickListener = k2Var.getBackClickListener();
            if (backClickListener != null) {
                backClickListener.invoke(this.f28624e.f27484d);
            }
            this.f28623d.mo9851f();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.n2$b */
    public static final class C9071b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12040d f28625d;

        /* renamed from: e */
        public final /* synthetic */ C9030k2 f28626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9071b(C12040d dVar, C9030k2 k2Var) {
            super(0);
            this.f28625d = dVar;
            this.f28626e = k2Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r1 != null) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r5 = this;
                q40.d r0 = r5.f28625d
                int r0 = r0.f35058f
                r1 = -200201(0xfffffffffffcf1f7, float:NaN)
                r2 = 2131827326(0x7f111a7e, float:1.9287561E38)
                if (r0 != r1) goto L_0x0064
                qo3.q r0 = new qo3.q
                il1.k2 r1 = r5.f28626e
                android.view.View r1 = r1.f28531q
                android.content.Context r1 = r1.getContext()
                r0.<init>(r1)
                q40.d r1 = r5.f28625d
                java.lang.String r1 = r1.f35059g
                r3 = 1
                if (r1 == 0) goto L_0x0030
                int r4 = r1.length()
                if (r4 <= 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r4 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r1 = 0
            L_0x002d:
                if (r1 == 0) goto L_0x0030
                goto L_0x0043
            L_0x0030:
                il1.k2 r1 = r5.f28626e
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "context.resources.getStr…_announcement_set_failed)"
                gy3.C87412m.m108593f(r1, r2)
            L_0x0043:
                r0.mo107595g(r1)
                r0.mo107589a(r3)
                il1.k2 r1 = r5.f28626e
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131827327(0x7f111a7f, float:1.9287563E38)
                java.lang.String r1 = r1.getString(r2)
                r0.mo107602n(r1)
                r0.mo107604p(r3)
                r0.mo107603o()
                goto L_0x007b
            L_0x0064:
                il1.k2 r0 = r5.f28626e
                android.content.Context r0 = r0.getContext()
                il1.k2 r1 = r5.f28626e
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r1 = r1.getString(r2)
                nj3.C76912y0.m92767f(r0, r1)
            L_0x007b:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C9069n2.C9071b.invoke():java.lang.Object");
        }
    }

    /* renamed from: il1.n2$c */
    public static final class C9072c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f28627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9072c(C8479f0<C89779i0> f0Var) {
            super(0);
            this.f28627d = f0Var;
        }

        public Object invoke() {
            C89779i0 i0Var = (C89779i0) this.f28627d.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9069n2(C9030k2 k2Var, C8479f0<C89779i0> f0Var, C15601d<? super C9069n2> dVar) {
        super(2, dVar);
        this.f28621f = k2Var;
        this.f28622g = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9069n2(this.f28621f, this.f28622g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9069n2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102 A[Catch:{ d -> 0x0027, all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0131 A[Catch:{ d -> 0x0027, all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c A[Catch:{ d -> 0x0027, all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d A[Catch:{ d -> 0x0027, all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0150 A[Catch:{ d -> 0x0027, all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015a A[Catch:{ d -> 0x0027, all -> 0x0024 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r8 = r18
            ak1.g0 r0 = ak1.C0073g0.FANS_CLUB
            java.lang.Class<cl1.o> r9 = cl1.C54991o.class
            java.lang.Class<ak1.o> r10 = ak1.C54108o.class
            xx3.a r11 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f28620e
            r12 = 27
            r2 = 2
            r14 = 1
            r15 = 0
            if (r1 == 0) goto L_0x003c
            if (r1 == r14) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            java.lang.Object r1 = r8.f28619d
            gy3.f0 r1 = (gy3.C8479f0) r1
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ d -> 0x0027 }
            r16 = r1
            r1 = r19
            goto L_0x012c
        L_0x0024:
            r0 = move-exception
            goto L_0x018c
        L_0x0027:
            r0 = move-exception
            goto L_0x0175
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.lang.Object r1 = r8.f28619d
            il1.k2 r1 = (il1.C9030k2) r1
            kotlin.ResultKt.throwOnFailure(r19)
            r3 = r19
            goto L_0x0078
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r19)
            il1.k2 r1 = r8.f28621f
            java.lang.String r3 = r1.f28517A
            if (r3 == 0) goto L_0x007c
            ok1.e r4 = ok1.C62042e.f176370a
            r8.f28619d = r1
            r8.f28620e = r14
            r4.getClass()
            wx3.h r4 = new wx3.h
            wx3.d r5 = xx3.C66447b.m78392b(r18)
            r4.<init>(r5)
            java.lang.Class<lr.b> r5 = p599lr.C61381b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            lr.b r5 = (p599lr.C61381b) r5
            qo1.g r5 = r5.mo78545UQ()
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            ok1.t r7 = new ok1.t
            r7.<init>(r4)
            r5.mo12411d(r3, r6, r7)
            java.lang.Object r3 = r4.mo90314b()
            if (r3 != r11) goto L_0x0078
            return r11
        L_0x0078:
            java.lang.String r3 = (java.lang.String) r3
            r1.f28540z = r3
        L_0x007c:
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            il1.k2 r1 = r8.f28621f
            te3.oj r1 = r1.f28521E
            if (r1 != 0) goto L_0x008c
            te3.oj r1 = new te3.oj
            r1.<init>()
        L_0x008c:
            r7.f27484d = r1
            il1.k2 r3 = r8.f28621f
            android.widget.TextView r3 = r3.f28532r
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.Integer r3 = z04.C66731x.m78731e(r3)
            if (r3 == 0) goto L_0x00a5
            int r3 = r3.intValue()
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r1.f139209d = r3
            T r1 = r7.f27484d
            te3.oj r1 = (te3.C50689oj) r1
            il1.k2 r3 = r8.f28621f
            com.tencent.mm.ui.widget.MMEditText r3 = r3.f28534t
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r1.f139210e = r3
            T r1 = r7.f27484d
            te3.oj r1 = (te3.C50689oj) r1
            il1.k2 r3 = r8.f28621f
            java.lang.String r4 = r3.f28540z
            r1.f139211f = r4
            java.lang.String r1 = "7"
            java.lang.String r3 = il1.C9030k2.m8784b(r3)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r4 = r4.mo77630e(r9)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 == 0) goto L_0x00dc
            boolean r4 = r4.mo75999e4()
            if (r4 != r14) goto L_0x00dc
            r4 = 1
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            if (r4 == 0) goto L_0x00e9
            di3.d r4 = di3.C86312j.m106911c(r10)
            ak1.o r4 = (ak1.C54108o) r4
            r4.mo9619wD(r0, r1, r3)
            goto L_0x00f2
        L_0x00e9:
            di3.d r4 = di3.C86312j.m106911c(r10)
            ak1.o r4 = (ak1.C54108o) r4
            r4.tw0(r12, r1, r3)
        L_0x00f2:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ d -> 0x0027 }
            java.lang.Class<cl1.x> r3 = cl1.C0696x.class
            androidx.lifecycle.i0 r1 = r1.mo77630e(r3)     // Catch:{ d -> 0x0027 }
            cl1.x r1 = (cl1.C0696x) r1     // Catch:{ d -> 0x0027 }
            if (r1 == 0) goto L_0x0131
            te3.ly0 r1 = r1.f1644g     // Catch:{ d -> 0x0027 }
            if (r1 == 0) goto L_0x0131
            T r3 = r7.f27484d     // Catch:{ d -> 0x0027 }
            te3.oj r3 = (te3.C50689oj) r3     // Catch:{ d -> 0x0027 }
            r1.f137713n = r3     // Catch:{ d -> 0x0027 }
            qg1.e r3 = new qg1.e     // Catch:{ d -> 0x0027 }
            r4 = 4
            r5 = 0
            r3.<init>((int) r4, (te3.C50326ly0) r1, (te3.C49712hj1) r5)     // Catch:{ d -> 0x0027 }
            r4 = 0
            r6 = 0
            r16 = 3
            r17 = 0
            r8.f28619d = r7     // Catch:{ d -> 0x0027 }
            r8.f28620e = r2     // Catch:{ d -> 0x0027 }
            r1 = r3
            r2 = r4
            r4 = r6
            r5 = r18
            r6 = r16
            r16 = r7
            r7 = r17
            java.lang.Object r1 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x0027 }
            if (r1 != r11) goto L_0x012c
            return r11
        L_0x012c:
            te3.rs0 r1 = (te3.C51148rs0) r1     // Catch:{ d -> 0x0027 }
        L_0x012e:
            r7 = r16
            goto L_0x0134
        L_0x0131:
            r16 = r7
            goto L_0x012e
        L_0x0134:
            java.lang.String r1 = "8"
            il1.k2 r2 = r8.f28621f     // Catch:{ d -> 0x0027 }
            java.lang.String r2 = il1.C9030k2.m8784b(r2)     // Catch:{ d -> 0x0027 }
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ d -> 0x0027 }
            androidx.lifecycle.i0 r3 = r3.mo77630e(r9)     // Catch:{ d -> 0x0027 }
            cl1.o r3 = (cl1.C54991o) r3     // Catch:{ d -> 0x0027 }
            if (r3 == 0) goto L_0x014d
            boolean r3 = r3.mo75999e4()     // Catch:{ d -> 0x0027 }
            if (r3 != r14) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r14 = 0
        L_0x014e:
            if (r14 == 0) goto L_0x015a
            di3.d r3 = di3.C86312j.m106911c(r10)     // Catch:{ d -> 0x0027 }
            ak1.o r3 = (ak1.C54108o) r3     // Catch:{ d -> 0x0027 }
            r3.mo9619wD(r0, r1, r2)     // Catch:{ d -> 0x0027 }
            goto L_0x0163
        L_0x015a:
            di3.d r0 = di3.C86312j.m106911c(r10)     // Catch:{ d -> 0x0027 }
            ak1.o r0 = (ak1.C54108o) r0     // Catch:{ d -> 0x0027 }
            r0.tw0(r12, r1, r2)     // Catch:{ d -> 0x0027 }
        L_0x0163:
            il1.n2$a r0 = new il1.n2$a     // Catch:{ d -> 0x0027 }
            il1.k2 r1 = r8.f28621f     // Catch:{ d -> 0x0027 }
            r0.<init>(r1, r7)     // Catch:{ d -> 0x0027 }
            o40.C61926c.m72668M(r0)     // Catch:{ d -> 0x0027 }
            il1.n2$c r0 = new il1.n2$c
            gy3.f0<qo3.i0> r1 = r8.f28622g
            r0.<init>(r1)
            goto L_0x0186
        L_0x0175:
            il1.n2$b r1 = new il1.n2$b     // Catch:{ all -> 0x0024 }
            il1.k2 r2 = r8.f28621f     // Catch:{ all -> 0x0024 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0024 }
            o40.C61926c.m72668M(r1)     // Catch:{ all -> 0x0024 }
            il1.n2$c r0 = new il1.n2$c
            gy3.f0<qo3.i0> r1 = r8.f28622g
            r0.<init>(r1)
        L_0x0186:
            o40.C61926c.m72668M(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x018c:
            il1.n2$c r1 = new il1.n2$c
            gy3.f0<qo3.i0> r2 = r8.f28622g
            r1.<init>(r2)
            o40.C61926c.m72668M(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9069n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
