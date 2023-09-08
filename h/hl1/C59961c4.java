package hl1;

import a14.C0000n0;
import android.app.Activity;
import cl1.C54979h1;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinerLiveVisitorLivingUICHelperKt$watchShoppingAvailable$1", mo125469f = "FinerLiveVisitorLivingUICHelper.kt", mo125470l = {73}, mo125471m = "invokeSuspend")
/* renamed from: hl1.c4 */
public final class C59961c4 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f171095d;

    /* renamed from: e */
    public final /* synthetic */ C59988k f171096e;

    /* renamed from: f */
    public final /* synthetic */ Activity f171097f;

    /* renamed from: hl1.c4$a */
    public static final class C59962a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171098d;

        /* renamed from: e */
        public final /* synthetic */ Activity f171099e;

        public C59962a(C59988k kVar, Activity activity) {
            this.f171098d = kVar;
            this.f171099e = activity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r11, wx3.C15601d r12) {
            /*
                r10 = this;
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                hl1.k r12 = r10.f171098d
                java.lang.String r12 = r12.f171222i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "watchShoppingAvailable shoppingAvailableState "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                if (r11 == 0) goto L_0x00cc
                hl1.k r11 = r10.f171098d
                android.app.Activity r12 = r10.f171099e
                java.lang.String r0 = "<this>"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "activity"
                gy3.C87412m.m108594g(r12, r0)
                rx3.g r0 = r11.f171176P
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00cc
                qj1.pe r0 = r11.f171173N
                if (r0 != 0) goto L_0x00cc
                am3.a r0 = r11.f171178Q
                r1 = 1
                if (r0 == 0) goto L_0x0053
                am3.a$b r0 = r0.f152059c
                gy3.C87412m.m108591d(r0)
                boolean r0 = r0.f152069e
                if (r0 != r1) goto L_0x0053
                r0 = 1
                goto L_0x0054
            L_0x0053:
                r0 = 0
            L_0x0054:
                if (r0 != 0) goto L_0x00cc
                am3.a r0 = r11.f171178Q
                if (r0 == 0) goto L_0x0062
                java.util.concurrent.Future<?> r0 = r0.f152060d
                gy3.C87412m.m108591d(r0)
                r0.cancel(r1)
            L_0x0062:
                r0 = 2131303420(0x7f091bfc, float:1.8224954E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
                if (r0 != 0) goto L_0x0084
                ft1.a r1 = ft1.C59319a.f169618b
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 60
                r9 = 0
                java.lang.String r2 = "liveInitContentViewError"
                o40.C11348f.C11349a.m11178b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                java.lang.String r11 = r11.f171222i
                java.lang.String r12 = "asyncInflateShoppingPlugin root is empty!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
                goto L_0x00cc
            L_0x0084:
                am3.a r1 = new am3.a
                r1.<init>(r12)
                r2 = 2131495208(0x7f0c0928, float:1.8613946E38)
                r3 = 0
                hl1.a4 r4 = new hl1.a4
                r4.<init>(r11, r0, r12)
                java.lang.String r12 = r11.f171222i
                d3.f<am3.a$a> r5 = am3.C54139a.f152056f
                java.lang.Object r5 = r5.mo157419a()
                am3.a$a r5 = (am3.C54139a.C54140a) r5
                if (r5 != 0) goto L_0x00a3
                am3.a$a r5 = new am3.a$a
                r5.<init>()
            L_0x00a3:
                r5.f152062a = r1
                r5.f152064c = r2
                r5.f152063b = r0
                r5.f152066e = r4
                r5.f152067f = r3
                am3.a$b r0 = new am3.a$b
                r0.<init>(r5)
                r1.f152059c = r0
                zt3.t r2 = zt3.C119157j.f356862d
                zt3.j r2 = (zt3.C119157j) r2
                if (r12 != 0) goto L_0x00bf
                lu3.c r12 = r2.mo183870a(r0)
                goto L_0x00c8
            L_0x00bf:
                r2.getClass()
                r3 = 0
                lu3.c r12 = r2.mo183889t(r0, r3, r12)
            L_0x00c8:
                r1.f152060d = r12
                r11.f171178Q = r1
            L_0x00cc:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: hl1.C59961c4.C59962a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59961c4(C59988k kVar, Activity activity, C15601d<? super C59961c4> dVar) {
        super(2, dVar);
        this.f171096e = kVar;
        this.f171097f = activity;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59961c4(this.f171096e, this.f171097f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C59961c4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f171095d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58087u0<Boolean> u0Var = ((C54979h1) this.f171096e.mo83051g(C54979h1.class)).f154136h;
            C59962a aVar2 = new C59962a(this.f171096e, this.f171097f);
            this.f171095d = 1;
            if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
