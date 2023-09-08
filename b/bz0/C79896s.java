package bz0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import az0.C39666f;
import az0.C79640g;
import bz0.C79890q;
import com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateEditUI;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListViewContract$ViewModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cz0.C86159b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: bz0.s */
public final class C79896s implements C79889p {

    /* renamed from: a */
    public final C79640g.C79641a f234074a;

    /* renamed from: b */
    public C79890q f234075b;

    /* renamed from: c */
    public CarLicensePlateListViewContract$ViewModel f234076c;

    @C91590f(mo125468c = "com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewPresenter$startEditUIForCreate$1", mo125469f = "CarLicensePlateListViewPresenter.kt", mo125470l = {89, 93}, mo125471m = "invokeSuspend")
    /* renamed from: bz0.s$a */
    public static final class C79897a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f234077d;

        /* renamed from: e */
        public final /* synthetic */ Activity f234078e;

        /* renamed from: f */
        public final /* synthetic */ C79896s f234079f;

        /* renamed from: bz0.s$a$a */
        public static final class C79898a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C79896s f234080d;

            /* renamed from: e */
            public final /* synthetic */ String f234081e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79898a(C79896s sVar, String str) {
                super(0);
                this.f234080d = sVar;
                this.f234081e = str;
            }

            public Object invoke() {
                this.f234080d.getViewModel().mo118134a(this.f234081e);
                C79896s sVar = this.f234080d;
                C79890q qVar = sVar.f234075b;
                if (qVar != null) {
                    qVar.mo110053a(sVar.getViewModel().f248031d);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79897a(Activity activity, C79896s sVar, C15601d<? super C79897a> dVar) {
            super(2, dVar);
            this.f234078e = activity;
            this.f234079f = sVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C79897a(this.f234078e, this.f234079f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C79897a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f234077d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Activity activity = this.f234078e;
                Intent intent = new Intent(this.f234078e, CarLicensePlateEditUI.class);
                this.f234077d = 1;
                obj = C86159b.m106675c(activity, intent, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Instrumentation.ActivityResult activityResult = (Instrumentation.ActivityResult) obj;
            C87412m.m108594g(activityResult, "<this>");
            int resultCode = activityResult.getResultCode();
            Intent resultData = activityResult.getResultData();
            Log.m105924i("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForCreate, get code:" + resultCode + ", data:" + resultData);
            String str = null;
            if (-1 == resultCode && resultData != null) {
                str = resultData.getStringExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT");
            }
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                C79898a aVar2 = new C79898a(this.f234079f, str);
                this.f234077d = 2;
                if (C86159b.m106676d(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewPresenter$syncDataFromServer$1", mo125469f = "CarLicensePlateListViewPresenter.kt", mo125470l = {59, 64, 66, 77}, mo125471m = "invokeSuspend")
    /* renamed from: bz0.s$b */
    public static final class C79899b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f234082d;

        /* renamed from: e */
        public final /* synthetic */ C79896s f234083e;

        /* renamed from: f */
        public final /* synthetic */ boolean f234084f;

        /* renamed from: bz0.s$b$a */
        public static final class C79900a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C79896s f234085d;

            /* renamed from: e */
            public final /* synthetic */ boolean f234086e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79900a(C79896s sVar, boolean z) {
                super(0);
                this.f234085d = sVar;
                this.f234086e = z;
            }

            public Object invoke() {
                C79890q qVar = this.f234085d.f234075b;
                if (qVar != null) {
                    qVar.mo110054b(this.f234086e ? C79890q.C79891a.FETCH_DATA_WITH_CACHE : C79890q.C79891a.FETCH_DATA_NO_CACHE);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: bz0.s$b$b */
        public static final class C79901b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C79896s f234087d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79901b(C79896s sVar) {
                super(0);
                this.f234087d = sVar;
            }

            public Object invoke() {
                C79896s sVar = this.f234087d;
                C79890q qVar = sVar.f234075b;
                if (qVar != null) {
                    qVar.mo110053a(sVar.getViewModel().f248031d);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: bz0.s$b$c */
        public static final class C79902c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C79896s f234088d;

            /* renamed from: e */
            public final /* synthetic */ C39666f f234089e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79902c(C79896s sVar, C39666f fVar) {
                super(0);
                this.f234088d = sVar;
                this.f234089e = fVar;
            }

            public Object invoke() {
                C79890q qVar = this.f234088d.f234075b;
                if (qVar != null) {
                    qVar.mo110055c(this.f234089e);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79899b(C79896s sVar, boolean z, C15601d<? super C79899b> dVar) {
            super(2, dVar);
            this.f234083e = sVar;
            this.f234084f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C79899b(this.f234083e, this.f234084f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C79899b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
            r1 = r1.f131893d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f234082d
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x002f
                if (r1 == r5) goto L_0x002b
                if (r1 == r4) goto L_0x0024
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00f2
            L_0x0017:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001f:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0105
            L_0x0024:
                kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ f -> 0x0028 }
                goto L_0x005e
            L_0x0028:
                r14 = move-exception
                goto L_0x00f5
            L_0x002b:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0044
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r14)
                bz0.s$b$a r14 = new bz0.s$b$a
                bz0.s r1 = r13.f234083e
                boolean r6 = r13.f234084f
                r14.<init>(r1, r6)
                r13.f234082d = r5
                java.lang.Object r14 = cz0.C86159b.m106676d(r14, r13)
                if (r14 != r0) goto L_0x0044
                return r0
            L_0x0044:
                az0.g r14 = new az0.g     // Catch:{ f -> 0x0028 }
                bz0.s r1 = r13.f234083e     // Catch:{ f -> 0x0028 }
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r1 = r1.getViewModel()     // Catch:{ f -> 0x0028 }
                java.lang.String r1 = r1.f248033f     // Catch:{ f -> 0x0028 }
                bz0.s r6 = r13.f234083e     // Catch:{ f -> 0x0028 }
                az0.g$a r6 = r6.f234074a     // Catch:{ f -> 0x0028 }
                r14.<init>(r1, r6)     // Catch:{ f -> 0x0028 }
                r13.f234082d = r4     // Catch:{ f -> 0x0028 }
                java.lang.Object r14 = r14.mo62235e(r13)     // Catch:{ f -> 0x0028 }
                if (r14 != r0) goto L_0x005e
                return r0
            L_0x005e:
                te3.fb2 r14 = (te3.C90410fb2) r14     // Catch:{ f -> 0x0028 }
                te3.cp4 r1 = r14.f259509d
                r3 = 0
                if (r1 == 0) goto L_0x0072
                java.util.LinkedList<te3.dp4> r1 = r1.f131893d
                if (r1 == 0) goto L_0x0072
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r5
                if (r1 != r5) goto L_0x0072
                r1 = 1
                goto L_0x0073
            L_0x0072:
                r1 = 0
            L_0x0073:
                if (r1 == 0) goto L_0x00cd
                bz0.s r1 = r13.f234083e
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r1 = r1.getViewModel()
                te3.cp4 r14 = r14.f259509d
                gy3.C87412m.m108591d(r14)
                com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo r4 = new com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 15
                r12 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                java.util.LinkedList<te3.dp4> r6 = r14.f131893d
                if (r6 == 0) goto L_0x00bc
                java.util.Iterator r6 = r6.iterator()
            L_0x0095:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x00bc
                java.lang.Object r7 = r6.next()
                te3.dp4 r7 = (te3.dp4) r7
                java.lang.String r8 = r7.f132471d
                if (r8 == 0) goto L_0x00ae
                int r8 = r8.length()
                if (r8 != 0) goto L_0x00ac
                goto L_0x00ae
            L_0x00ac:
                r8 = 0
                goto L_0x00af
            L_0x00ae:
                r8 = 1
            L_0x00af:
                if (r8 != 0) goto L_0x0095
                java.util.ArrayList<java.lang.String> r8 = r4.f247996d
                java.lang.String r7 = r7.f132471d
                gy3.C87412m.m108591d(r7)
                r8.add(r7)
                goto L_0x0095
            L_0x00bc:
                te3.dp4 r14 = r14.f131894e
                if (r14 == 0) goto L_0x00c3
                java.lang.String r14 = r14.f132471d
                goto L_0x00c4
            L_0x00c3:
                r14 = 0
            L_0x00c4:
                if (r14 != 0) goto L_0x00c8
                java.lang.String r14 = ""
            L_0x00c8:
                r4.f247997e = r14
                r1.f248031d = r4
                goto L_0x00e2
            L_0x00cd:
                bz0.s r14 = r13.f234083e
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r14 = r14.getViewModel()
                com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo r1 = new com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 15
                r9 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r14.f248031d = r1
            L_0x00e2:
                bz0.s$b$b r14 = new bz0.s$b$b
                bz0.s r1 = r13.f234083e
                r14.<init>(r1)
                r13.f234082d = r2
                java.lang.Object r14 = cz0.C86159b.m106676d(r14, r13)
                if (r14 != r0) goto L_0x00f2
                return r0
            L_0x00f2:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x00f5:
                bz0.s$b$c r1 = new bz0.s$b$c
                bz0.s r2 = r13.f234083e
                r1.<init>(r2, r14)
                r13.f234082d = r3
                java.lang.Object r14 = cz0.C86159b.m106676d(r1, r13)
                if (r14 != r0) goto L_0x0105
                return r0
            L_0x0105:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: bz0.C79896s.C79899b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C79896s(C79640g.C79641a aVar) {
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f234074a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo110057f();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a14.C0000n0 mo110058a() {
        /*
            r1 = this;
            bz0.q r0 = r1.f234075b
            if (r0 == 0) goto L_0x000a
            a14.n0 r0 = r0.mo110057f()
            if (r0 != 0) goto L_0x000e
        L_0x000a:
            a14.n0 r0 = a14.C53930o0.m60555b()
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bz0.C79896s.mo110058a():a14.n0");
    }

    /* renamed from: b */
    public void mo110059b() {
        mo110060c(new CarLicensePlateListViewContract$ViewModel((MMCarLicensePlateInfo) null, false, (String) null, 7, (C8480h) null));
    }

    /* renamed from: c */
    public void mo110060c(CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel) {
        C87412m.m108594g(carLicensePlateListViewContract$ViewModel, "model");
        this.f234076c = carLicensePlateListViewContract$ViewModel;
        if (!C87412m.m108589b((Object) null, getViewModel().f248031d)) {
            C79890q qVar = this.f234075b;
            if (qVar != null) {
                qVar.mo110053a(getViewModel().f248031d);
                return;
            }
            return;
        }
        mo110062e();
    }

    /* renamed from: d */
    public void mo110061d() {
        Activity d;
        C79890q qVar = this.f234075b;
        if (qVar == null || (d = qVar.mo110056d()) == null) {
            Log.m105920e("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForCreate get NULL activity");
        } else {
            C53895h.m60466d(mo110058a(), (C66212f) null, (C53934p0) null, new C79897a(d, this, (C15601d<? super C79897a>) null), 3, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo110062e() {
        C53895h.m60466d(mo110058a(), (C66212f) null, (C53934p0) null, new C79899b(this, !C87412m.m108589b((Object) null, getViewModel().f248031d), (C15601d<? super C79899b>) null), 3, (Object) null);
    }

    public CarLicensePlateListViewContract$ViewModel getViewModel() {
        CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f234076c;
        if (carLicensePlateListViewContract$ViewModel != null) {
            return carLicensePlateListViewContract$ViewModel;
        }
        C87412m.m108603p("_viewModel");
        throw null;
    }
}
