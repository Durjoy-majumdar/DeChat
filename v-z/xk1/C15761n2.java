package xk1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import te3.C49098d51;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$setLiveNoticeInfo$1$1", mo125469f = "FinderLivePostUIC.kt", mo125470l = {364, 367}, mo125471m = "invokeSuspend")
/* renamed from: xk1.n2 */
public final class C15761n2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f42488d;

    /* renamed from: e */
    public final /* synthetic */ C66297d2 f42489e;

    /* renamed from: f */
    public final /* synthetic */ C49098d51 f42490f;

    /* renamed from: g */
    public final /* synthetic */ C49098d51 f42491g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15761n2(C66297d2 d2Var, C49098d51 d512, C49098d51 d513, C15601d<? super C15761n2> dVar) {
        super(2, dVar);
        this.f42489e = d2Var;
        this.f42490f = d512;
        this.f42491g = d513;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15761n2(this.f42489e, this.f42490f, this.f42491g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15761n2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Class<cl1.t1> r1 = cl1.C0690t1.class
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f42488d
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0026
            if (r3 == r7) goto L_0x0022
            if (r3 != r6) goto L_0x001a
            kotlin.ResultKt.throwOnFailure(r23)
            r3 = r23
            goto L_0x0148
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r23)
            goto L_0x0032
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r23)
            r0.f42488d = r7
            java.lang.Object r3 = a14.C53965x0.m60607b(r4, r0)
            if (r3 != r2) goto L_0x0032
            return r2
        L_0x0032:
            il1.t r3 = new il1.t
            xk1.d2 r9 = r0.f42489e
            android.app.Activity r9 = r9.getContext()
            r3.<init>(r9)
            te3.d51 r9 = r0.f42490f
            r0.f42488d = r6
            wx3.h r10 = new wx3.h
            wx3.d r11 = xx3.C66447b.m78392b(r22)
            r10.<init>(r11)
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            r11.f27484d = r10
            qo3.w r12 = new qo3.w
            android.content.Context r13 = r3.getContext()
            r12.<init>(r13)
            il1.r r13 = new il1.r
            r13.<init>(r11)
            r12.f36937s = r13
            il1.s r13 = new il1.s
            r13.<init>(r11)
            android.content.Context r11 = r3.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r14 = 2131494748(0x7f0c075c, float:1.8613013E38)
            android.view.View r11 = r11.inflate(r14, r3, r8)
            r3.f28696d = r11
            if (r11 == 0) goto L_0x008c
            r14 = 2131298612(0x7f090934, float:1.8215202E38)
            android.view.View r11 = r11.findViewById(r14)
            android.widget.Button r11 = (android.widget.Button) r11
            if (r11 == 0) goto L_0x008c
            il1.p r14 = new il1.p
            r14.<init>(r3)
            r11.setOnClickListener(r14)
        L_0x008c:
            android.view.View r11 = r3.f28696d
            if (r11 == 0) goto L_0x00a3
            r14 = 2131300093(0x7f090efd, float:1.8218206E38)
            android.view.View r11 = r11.findViewById(r14)
            android.widget.Button r11 = (android.widget.Button) r11
            if (r11 == 0) goto L_0x00a3
            il1.q r14 = new il1.q
            r14.<init>(r3, r13)
            r11.setOnClickListener(r14)
        L_0x00a3:
            android.view.View r11 = r3.f28696d
            if (r11 == 0) goto L_0x00b7
            r13 = 2131315890(0x7f094cb2, float:1.8250246E38)
            android.view.View r11 = r11.findViewById(r13)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x00b7
            java.lang.String r13 = r9.f132121g
            r11.setText(r13)
        L_0x00b7:
            android.view.View r11 = r3.f28696d
            if (r11 == 0) goto L_0x00dc
            r13 = 2131315889(0x7f094cb1, float:1.8250244E38)
            android.view.View r11 = r11.findViewById(r13)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x00dc
            int r13 = r9.f132118d
            long r13 = (long) r13
            long r16 = r13 * r4
            er1.j4 r15 = er1.C58739j4.f168176a
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            java.lang.String r13 = er1.C58739j4.m68254u(r15, r16, r18, r19, r20, r21)
            r11.setText(r13)
        L_0x00dc:
            android.view.View r11 = r3.f28696d
            if (r11 == 0) goto L_0x0137
            r13 = 2131315895(0x7f094cb7, float:1.8250256E38)
            android.view.View r11 = r11.findViewById(r13)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x0137
            te3.nc3 r13 = r9.f132128q
            if (r13 == 0) goto L_0x00f5
            boolean r13 = r13.f138532d
            if (r13 != r7) goto L_0x00f5
            r13 = 1
            goto L_0x00f6
        L_0x00f5:
            r13 = 0
        L_0x00f6:
            if (r13 == 0) goto L_0x011b
            android.content.Context r13 = r3.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131827274(0x7f111a4a, float:1.9287456E38)
            java.lang.Object[] r15 = new java.lang.Object[r7]
            te3.nc3 r9 = r9.f132128q
            if (r9 == 0) goto L_0x010c
            int r9 = r9.f138537i
            goto L_0x010d
        L_0x010c:
            r9 = 0
        L_0x010d:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r15[r8] = r9
            java.lang.String r9 = r13.getString(r14, r15)
            r11.setText(r9)
            goto L_0x0137
        L_0x011b:
            android.content.Context r13 = r3.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131827273(0x7f111a49, float:1.9287454E38)
            java.lang.Object[] r15 = new java.lang.Object[r7]
            int r9 = r9.f132123i
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r15[r8] = r9
            java.lang.String r9 = r13.getString(r14, r15)
            r11.setText(r9)
        L_0x0137:
            android.view.View r9 = r3.f28696d
            r12.mo12471k(r9)
            r12.mo5086o()
            r3.f28697e = r12
            java.lang.Object r3 = r10.mo90314b()
            if (r3 != r2) goto L_0x0148
            return r2
        L_0x0148:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r3 = 0
            if (r2 != 0) goto L_0x0169
            xk1.d2 r1 = r0.f42489e
            fj1.b r1 = r1.f190866y
            if (r1 == 0) goto L_0x0160
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.o r1 = (cl1.C54991o) r1
            goto L_0x0161
        L_0x0160:
            r1 = r3
        L_0x0161:
            if (r1 != 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r1.f154340m3 = r3
        L_0x0166:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0169:
            xk1.d2 r2 = r0.f42489e
            android.view.View r2 = r2.f190859r
            if (r2 != 0) goto L_0x0170
            goto L_0x01b5
        L_0x0170:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$setLiveNoticeInfo$1$1"
            java.lang.String r12 = "invokeSuspend"
            java.lang.String r13 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r2
            r3 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$setLiveNoticeInfo$1$1"
            java.lang.String r11 = "invokeSuspend"
            java.lang.String r12 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x01b5:
            te3.d51 r2 = r0.f42491g
            int r2 = r2.f132118d
            long r2 = (long) r2
            long r2 = r2 * r4
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r4)
            int r3 = r2.get(r6)
            int r3 = r3 + r7
            r4 = 5
            int r4 = r2.get(r4)
            er1.j4 r5 = er1.C58739j4.f168176a
            r9 = 11
            int r9 = r2.get(r9)
            java.lang.String r9 = r5.mo83675C(r9)
            r10 = 12
            int r2 = r2.get(r10)
            java.lang.String r2 = r5.mo83675C(r2)
            xk1.d2 r5 = r0.f42489e
            android.widget.TextView r10 = r5.f190860s
            if (r10 != 0) goto L_0x01ef
            goto L_0x021b
        L_0x01ef:
            android.view.View r5 = r5.getRootView()
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r11 = 2131828285(0x7f111e3d, float:1.9289507E38)
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r3)
            r12[r8] = r13
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r4)
            r12[r7] = r3
            r12[r6] = r9
            r3 = 3
            r12[r3] = r2
            java.lang.String r2 = r5.getString(r11, r12)
            r10.setText(r2)
        L_0x021b:
            te3.d51 r2 = r0.f42490f
            java.lang.String r2 = r2.f132121g
            if (r2 == 0) goto L_0x024d
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0229
            r3 = 1
            goto L_0x022a
        L_0x0229:
            r3 = 0
        L_0x022a:
            if (r3 == 0) goto L_0x022d
            goto L_0x022e
        L_0x022d:
            r2 = 0
        L_0x022e:
            if (r2 == 0) goto L_0x024d
            xk1.d2 r3 = r0.f42489e
            bl3.r r4 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
            bl3.r$a r3 = r4.mo62444c(r3)
            java.lang.Class<xk1.y1> r4 = xk1.C15794y1.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            xk1.y1 r3 = (xk1.C15794y1) r3
            if (r3 == 0) goto L_0x024d
            com.tencent.mm.ui.widget.MMEditText r3 = r3.f42556d
            if (r3 == 0) goto L_0x024d
            r3.mo98046o(r2)
        L_0x024d:
            te3.d51 r2 = r0.f42490f
            te3.nc3 r2 = r2.f132128q
            if (r2 == 0) goto L_0x0259
            boolean r2 = r2.f138532d
            if (r2 != r7) goto L_0x0259
            r2 = 1
            goto L_0x025a
        L_0x0259:
            r2 = 0
        L_0x025a:
            if (r2 == 0) goto L_0x02f4
            xk1.d2 r2 = r0.f42489e
            fj1.b r2 = r2.f190866y
            if (r2 == 0) goto L_0x02c7
            androidx.lifecycle.i0 r2 = r2.mo71262a(r1)
            cl1.t1 r2 = (cl1.C0690t1) r2
            te3.d51 r3 = r0.f42490f
            java.lang.String r4 = "noticeInfo"
            gy3.C87412m.m108594g(r3, r4)
            te3.qw0 r4 = new te3.qw0
            r4.<init>()
            te3.xa1 r5 = new te3.xa1
            r5.<init>()
            te3.nc3 r9 = r3.f132128q
            if (r9 == 0) goto L_0x0285
            te3.i51 r9 = r9.f138538j
            if (r9 == 0) goto L_0x0285
            java.util.LinkedList<java.lang.String> r9 = r9.f135110e
            if (r9 != 0) goto L_0x028a
        L_0x0285:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
        L_0x028a:
            r5.f144557d = r9
            te3.nc3 r9 = r3.f132128q
            if (r9 == 0) goto L_0x0298
            te3.i51 r9 = r9.f138538j
            if (r9 == 0) goto L_0x0298
            java.util.LinkedList<java.lang.String> r9 = r9.f135111f
            if (r9 != 0) goto L_0x029d
        L_0x0298:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
        L_0x029d:
            r5.f144558e = r9
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.LinkedList<java.lang.String> r10 = r5.f144557d
            r9.addAll(r10)
            java.util.LinkedList<java.lang.String> r10 = r5.f144558e
            r9.addAll(r10)
            r5.f144559f = r9
            r4.f140582f = r5
            r4.f140580d = r6
            te3.nc3 r3 = r3.f132128q
            if (r3 == 0) goto L_0x02bb
            int r3 = r3.f138533e
            goto L_0x02bc
        L_0x02bb:
            r3 = 0
        L_0x02bc:
            r4.f140581e = r3
            r2.mo656j3(r4)
            int r3 = r2.mo650c3(r8)
            r2.f1629i = r3
        L_0x02c7:
            xk1.d2 r2 = r0.f42489e
            fj1.b r2 = r2.f190866y
            if (r2 == 0) goto L_0x02d5
            androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
            r3 = r1
            cl1.t1 r3 = (cl1.C0690t1) r3
            goto L_0x02d6
        L_0x02d5:
            r3 = 0
        L_0x02d6:
            if (r3 != 0) goto L_0x02d9
            goto L_0x02db
        L_0x02d9:
            r3.f1636s = r7
        L_0x02db:
            bl3.r r1 = bl3.C39818r.f106831a
            xk1.d2 r2 = r0.f42489e
            androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<xk1.z1> r2 = xk1.C15798z1.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            xk1.z1 r1 = (xk1.C15798z1) r1
            if (r1 == 0) goto L_0x02f4
            r1.mo14499e3()
        L_0x02f4:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C15761n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
