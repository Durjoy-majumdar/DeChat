package bz0;

import a14.C0000n0;
import android.content.Intent;
import az0.C39666f;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateEditUI;
import cz0.C86159b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$trySubmitAndFinishActivity$1", mo125469f = "CarLicensePlateEditUI.kt", mo125470l = {164, 166, 169, 183}, mo125471m = "invokeSuspend")
/* renamed from: bz0.n */
public final class C79870n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f234023d;

    /* renamed from: e */
    public final /* synthetic */ CarLicensePlateEditUI f234024e;

    /* renamed from: f */
    public final /* synthetic */ String f234025f;

    /* renamed from: bz0.n$a */
    public static final class C79871a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C39666f f234026d;

        /* renamed from: e */
        public final /* synthetic */ CarLicensePlateEditUI f234027e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79871a(C39666f fVar, CarLicensePlateEditUI carLicensePlateEditUI) {
            super(0);
            this.f234026d = fVar;
            this.f234027e = carLicensePlateEditUI;
        }

        public Object invoke() {
            C39666f fVar = this.f234026d;
            if (fVar.f106439e == -17500) {
                this.f234027e.setResult(-2);
                this.f234027e.finish();
            } else {
                C86159b.m106674b(fVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bz0.n$b */
    public static final class C79872b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CarLicensePlateEditUI f234028d;

        /* renamed from: e */
        public final /* synthetic */ String f234029e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79872b(CarLicensePlateEditUI carLicensePlateEditUI, String str) {
            super(0);
            this.f234028d = carLicensePlateEditUI;
            this.f234029e = str;
        }

        public Object invoke() {
            CarLicensePlateEditUI carLicensePlateEditUI = this.f234028d;
            String str = this.f234029e;
            int i = CarLicensePlateEditUI.f248001i;
            carLicensePlateEditUI.getClass();
            carLicensePlateEditUI.setResult(-1, new Intent().putExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT", str));
            carLicensePlateEditUI.finish();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79870n(CarLicensePlateEditUI carLicensePlateEditUI, String str, C15601d<? super C79870n> dVar) {
        super(2, dVar);
        this.f234024e = carLicensePlateEditUI;
        this.f234025f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C79870n(this.f234024e, this.f234025f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C79870n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[Catch:{ f -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ f -> 0x0026 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f234023d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r5) goto L_0x0022
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0076
        L_0x0016:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0089
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ f -> 0x0026 }
            goto L_0x0064
        L_0x0026:
            r7 = move-exception
            goto L_0x0079
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r7 = r6.f234024e     // Catch:{ f -> 0x0026 }
            java.lang.String r7 = r7.f248005h     // Catch:{ f -> 0x0026 }
            if (r7 == 0) goto L_0x003a
            int r7 = r7.length()     // Catch:{ f -> 0x0026 }
            if (r7 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r7 = 0
            goto L_0x003b
        L_0x003a:
            r7 = 1
        L_0x003b:
            if (r7 == 0) goto L_0x004d
            az0.d r7 = new az0.d     // Catch:{ f -> 0x0026 }
            java.lang.String r1 = r6.f234025f     // Catch:{ f -> 0x0026 }
            r7.<init>(r1)     // Catch:{ f -> 0x0026 }
            r6.f234023d = r5     // Catch:{ f -> 0x0026 }
            java.lang.Object r7 = r7.mo62235e(r6)     // Catch:{ f -> 0x0026 }
            if (r7 != r0) goto L_0x0064
            return r0
        L_0x004d:
            az0.i r7 = new az0.i     // Catch:{ f -> 0x0026 }
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r1 = r6.f234024e     // Catch:{ f -> 0x0026 }
            java.lang.String r1 = r1.f248005h     // Catch:{ f -> 0x0026 }
            gy3.C87412m.m108591d(r1)     // Catch:{ f -> 0x0026 }
            java.lang.String r5 = r6.f234025f     // Catch:{ f -> 0x0026 }
            r7.<init>(r1, r5)     // Catch:{ f -> 0x0026 }
            r6.f234023d = r4     // Catch:{ f -> 0x0026 }
            java.lang.Object r7 = r7.mo62235e(r6)     // Catch:{ f -> 0x0026 }
            if (r7 != r0) goto L_0x0064
            return r0
        L_0x0064:
            bz0.n$b r7 = new bz0.n$b
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r1 = r6.f234024e
            java.lang.String r3 = r6.f234025f
            r7.<init>(r1, r3)
            r6.f234023d = r2
            java.lang.Object r7 = cz0.C86159b.m106676d(r7, r6)
            if (r7 != r0) goto L_0x0076
            return r0
        L_0x0076:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x0079:
            bz0.n$a r1 = new bz0.n$a
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r2 = r6.f234024e
            r1.<init>(r7, r2)
            r6.f234023d = r3
            java.lang.Object r7 = cz0.C86159b.m106676d(r1, r6)
            if (r7 != r0) goto L_0x0089
            return r0
        L_0x0089:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bz0.C79870n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
