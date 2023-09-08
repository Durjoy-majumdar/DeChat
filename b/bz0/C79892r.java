package bz0;

import a14.C0000n0;
import az0.C39666f;
import bz0.C79890q;
import com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewPresenter$deletePlateNo$1", mo125469f = "CarLicensePlateListViewPresenter.kt", mo125470l = {128, 133, 136, 144}, mo125471m = "invokeSuspend")
/* renamed from: bz0.r */
public final class C79892r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f234066d;

    /* renamed from: e */
    public final /* synthetic */ String f234067e;

    /* renamed from: f */
    public final /* synthetic */ C79896s f234068f;

    /* renamed from: bz0.r$a */
    public static final class C79893a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79896s f234069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79893a(C79896s sVar) {
            super(0);
            this.f234069d = sVar;
        }

        public Object invoke() {
            C79890q qVar = this.f234069d.f234075b;
            if (qVar != null) {
                qVar.mo110054b(C79890q.C79891a.SYNC_DATA_MODIFICATION);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bz0.r$b */
    public static final class C79894b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79896s f234070d;

        /* renamed from: e */
        public final /* synthetic */ C39666f f234071e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79894b(C79896s sVar, C39666f fVar) {
            super(0);
            this.f234070d = sVar;
            this.f234071e = fVar;
        }

        public Object invoke() {
            C79890q qVar = this.f234070d.f234075b;
            if (qVar != null) {
                qVar.mo110055c(this.f234071e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bz0.r$c */
    public static final class C79895c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79896s f234072d;

        /* renamed from: e */
        public final /* synthetic */ String f234073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79895c(C79896s sVar, String str) {
            super(0);
            this.f234072d = sVar;
            this.f234073e = str;
        }

        public Object invoke() {
            ArrayList<String> arrayList;
            MMCarLicensePlateInfo mMCarLicensePlateInfo = this.f234072d.getViewModel().f248031d;
            if (!(mMCarLicensePlateInfo == null || (arrayList = mMCarLicensePlateInfo.f247996d) == null)) {
                arrayList.remove(this.f234073e);
            }
            C79896s sVar = this.f234072d;
            C79890q qVar = sVar.f234075b;
            if (qVar != null) {
                qVar.mo110053a(sVar.getViewModel().f248031d);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79892r(String str, C79896s sVar, C15601d<? super C79892r> dVar) {
        super(2, dVar);
        this.f234067e = str;
        this.f234068f = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C79892r(this.f234067e, this.f234068f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C79892r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f234066d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r5) goto L_0x0028
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x007a
        L_0x0016:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0065
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ f -> 0x0026 }
            goto L_0x0068
        L_0x0026:
            r7 = move-exception
            goto L_0x004f
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x003f
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r7)
            bz0.r$a r7 = new bz0.r$a
            bz0.s r1 = r6.f234068f
            r7.<init>(r1)
            r6.f234066d = r5
            java.lang.Object r7 = cz0.C86159b.m106676d(r7, r6)
            if (r7 != r0) goto L_0x003f
            return r0
        L_0x003f:
            az0.e r7 = new az0.e     // Catch:{ f -> 0x0026 }
            java.lang.String r1 = r6.f234067e     // Catch:{ f -> 0x0026 }
            r7.<init>(r1)     // Catch:{ f -> 0x0026 }
            r6.f234066d = r4     // Catch:{ f -> 0x0026 }
            java.lang.Object r7 = r7.mo62235e(r6)     // Catch:{ f -> 0x0026 }
            if (r7 != r0) goto L_0x0068
            return r0
        L_0x004f:
            int r1 = r7.f106439e
            r4 = -17501(0xffffffffffffbba3, float:NaN)
            if (r1 == r4) goto L_0x0068
            bz0.r$b r1 = new bz0.r$b
            bz0.s r2 = r6.f234068f
            r1.<init>(r2, r7)
            r6.f234066d = r3
            java.lang.Object r7 = cz0.C86159b.m106676d(r1, r6)
            if (r7 != r0) goto L_0x0065
            return r0
        L_0x0065:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x0068:
            bz0.r$c r7 = new bz0.r$c
            bz0.s r1 = r6.f234068f
            java.lang.String r3 = r6.f234067e
            r7.<init>(r1, r3)
            r6.f234066d = r2
            java.lang.Object r7 = cz0.C86159b.m106676d(r7, r6)
            if (r7 != r0) goto L_0x007a
            return r0
        L_0x007a:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bz0.C79892r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
