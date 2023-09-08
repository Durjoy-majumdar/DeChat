package kj1;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53953u0;
import a14.C53973z1;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kj1.C10125e1;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49214e11;
import wx3.C15601d;
import wx3.C66217g;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.w0 */
public final class C10252w0 {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.LivingShareQrCodeOptionKt$doGetQRCode$1", mo125469f = "LivingShareQrCodeOption.kt", mo125470l = {98}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.w0$a */
    public static final class C10253a extends C91594j implements C32227p<C0000n0, C15601d<? super C49214e11>, Object> {

        /* renamed from: d */
        public int f31281d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31282e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10253a(C10125e1 e1Var, C15601d<? super C10253a> dVar) {
            super(2, dVar);
            this.f31282e = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10253a(this.f31282e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10253a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31281d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C10125e1 e1Var = this.f31282e;
                this.f31281d = 1;
                obj = C10252w0.m10205b(e1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.LivingShareQrCodeOptionKt$getQRCodeInfo$$inlined$fail$default$1", mo125469f = "LivingShareQrCodeOption.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.w0$b */
    public static final class C10254b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f31283d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31284e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10254b(C0287e eVar, C15601d dVar, C10125e1 e1Var) {
            super(2, dVar);
            this.f31283d = eVar;
            this.f31284e = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10254b(this.f31283d, dVar, this.f31284e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10254b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = this.f31284e.f30980a;
            Log.m105924i(str, "result qrcode error: " + ((C0280a) ((C0281b) this.f31283d).f843b));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.LivingShareQrCodeOptionKt$getQRCodeInfo$$inlined$success$default$1", mo125469f = "LivingShareQrCodeOption.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.w0$c */
    public static final class C10255c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f31285d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0 f31286e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10255c(C0287e eVar, C15601d dVar, C8479f0 f0Var) {
            super(2, dVar);
            this.f31285d = eVar;
            this.f31286e = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10255c(this.f31285d, dVar, this.f31286e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10255c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f31286e.f27484d = (C49214e11) ((C0288f) this.f31285d).f855b;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.LivingShareQrCodeOptionKt", mo125469f = "LivingShareQrCodeOption.kt", mo125470l = {105, 115, 122}, mo125471m = "getQRCodeInfo")
    /* renamed from: kj1.w0$d */
    public static final class C10256d extends C66704d {

        /* renamed from: d */
        public Object f31287d;

        /* renamed from: e */
        public Object f31288e;

        /* renamed from: f */
        public Object f31289f;

        /* renamed from: g */
        public /* synthetic */ Object f31290g;

        /* renamed from: h */
        public int f31291h;

        public C10256d(C15601d<? super C10256d> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f31290g = obj;
            this.f31291h |= Integer.MIN_VALUE;
            return C10252w0.m10205b((C10125e1) null, this);
        }
    }

    /* renamed from: a */
    public static final void m10204a(C10125e1 e1Var) {
        C10125e1.C10126a aVar;
        C53953u0<? extends C49214e11> u0Var;
        C87412m.m108594g(e1Var, "<this>");
        C10125e1.C10127b bVar = e1Var.f30988g;
        C53953u0<? extends C49214e11> u0Var2 = null;
        if (!(bVar == null || (u0Var = bVar.f31021n) == null)) {
            C53973z1.C53974a.m60623a(u0Var, (CancellationException) null, 1, (Object) null);
        }
        C10125e1.C10127b bVar2 = e1Var.f30988g;
        if (bVar2 != null) {
            if (!(bVar2 == null || (aVar = bVar2.f31008a) == null)) {
                u0Var2 = aVar.mo10544d(C66217g.f190253d, C53934p0.DEFAULT, new C10253a(e1Var, (C15601d<? super C10253a>) null));
            }
            bVar2.f31021n = u0Var2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m10205b(kj1.C10125e1 r10, wx3.C15601d<? super te3.C49214e11> r11) {
        /*
            boolean r0 = r11 instanceof kj1.C10252w0.C10256d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kj1.w0$d r0 = (kj1.C10252w0.C10256d) r0
            int r1 = r0.f31291h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31291h = r1
            goto L_0x0018
        L_0x0013:
            kj1.w0$d r0 = new kj1.w0$d
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f31290g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f31291h
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r5) goto L_0x004f
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r10 = r0.f31288e
            bi1.e r10 = (bi1.C0287e) r10
            java.lang.Object r10 = r0.f31287d
            gy3.f0 r10 = (gy3.C8479f0) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00cd
        L_0x0037:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003f:
            java.lang.Object r10 = r0.f31289f
            bi1.e r10 = (bi1.C0287e) r10
            java.lang.Object r2 = r0.f31288e
            gy3.f0 r2 = (gy3.C8479f0) r2
            java.lang.Object r4 = r0.f31287d
            kj1.e1 r4 = (kj1.C10125e1) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a9
        L_0x004f:
            java.lang.Object r10 = r0.f31288e
            gy3.f0 r10 = (gy3.C8479f0) r10
            java.lang.Object r2 = r0.f31287d
            kj1.e1 r2 = (kj1.C10125e1) r2
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r2
            r2 = r10
            r10 = r9
            goto L_0x0085
        L_0x005e:
            kotlin.ResultKt.throwOnFailure(r11)
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r10.mo10534b(r2)
            cl1.u r2 = (cl1.C55001u) r2
            long r7 = r2.f154416j
            je1.b2 r2 = new je1.b2
            r2.<init>(r7)
            r0.f31287d = r10
            r0.f31288e = r11
            r0.f31291h = r5
            java.lang.Object r2 = bi1.C0283d.m245c(r2, r6, r0, r5, r6)
            if (r2 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r9 = r2
            r2 = r11
            r11 = r9
        L_0x0085:
            bi1.e r11 = (bi1.C0287e) r11
            boolean r5 = r11 instanceof bi1.C0288f
            if (r5 == 0) goto L_0x00ab
            wx3.f r5 = r11.f854a
            if (r5 != 0) goto L_0x0093
            wx3.f r5 = r0.getContext()
        L_0x0093:
            kj1.w0$c r7 = new kj1.w0$c
            r7.<init>(r11, r6, r2)
            r0.f31287d = r10
            r0.f31288e = r2
            r0.f31289f = r11
            r0.f31291h = r4
            java.lang.Object r4 = a14.C53895h.m60469g(r5, r7, r0)
            if (r4 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r4 = r10
            r10 = r11
        L_0x00a9:
            r11 = r10
            goto L_0x00ac
        L_0x00ab:
            r4 = r10
        L_0x00ac:
            r10 = r2
            boolean r2 = r11 instanceof bi1.C0281b
            if (r2 == 0) goto L_0x00cd
            wx3.f r2 = r11.f854a
            if (r2 != 0) goto L_0x00b9
            wx3.f r2 = r0.getContext()
        L_0x00b9:
            kj1.w0$b r5 = new kj1.w0$b
            r5.<init>(r11, r6, r4)
            r0.f31287d = r10
            r0.f31288e = r11
            r0.f31289f = r6
            r0.f31291h = r3
            java.lang.Object r11 = a14.C53895h.m60469g(r2, r5, r0)
            if (r11 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            T r10 = r10.f27484d
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10252w0.m10205b(kj1.e1, wx3.d):java.lang.Object");
    }
}
