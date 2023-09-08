package vi1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C48920bx0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomBottomPlugin$closeMicIntercom$1", mo125469f = "FinderLiveMicIntercomBottomPlugin.kt", mo125470l = {537, 562, 569}, mo125471m = "invokeSuspend")
/* renamed from: vi1.b */
public final class C52917b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f147750d;

    /* renamed from: e */
    public int f147751e;

    /* renamed from: f */
    public final /* synthetic */ C65750a f147752f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomBottomPlugin$closeMicIntercom$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveMicIntercomBottomPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vi1.b$a */
    public static final class C52918a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f147753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52918a(C0287e eVar, C15601d dVar) {
            super(2, dVar);
            this.f147753d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C52918a(this.f147753d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C52918a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveMicIntercomBo", "closeMicIntercom fail: " + ((C0280a) ((C0281b) this.f147753d).f843b));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomBottomPlugin$closeMicIntercom$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveMicIntercomBottomPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vi1.b$b */
    public static final class C52919b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f147754d;

        /* renamed from: e */
        public final /* synthetic */ C65750a f147755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52919b(C0287e eVar, C15601d dVar, C65750a aVar) {
            super(2, dVar);
            this.f147754d = eVar;
            this.f147755e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C52919b(this.f147754d, dVar, this.f147755e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C52919b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveMicIntercomBo", "closeMicIntercom success currentSessionId: " + this.f147755e.f189150v + " rsp: " + ((C48920bx0) ((C0288f) this.f147754d).f855b).f131367f);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52917b(C65750a aVar, C15601d<? super C52917b> dVar) {
        super(2, dVar);
        this.f147752f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52917b(this.f147752f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52917b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r9.f147751e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r6) goto L_0x002b
            if (r2 == r5) goto L_0x0023
            if (r2 != r4) goto L_0x001b
            java.lang.Object r0 = r9.f147750d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b9
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r0 = r9.f147750d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x009d
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x007c
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "closeMicIntercom "
            r10.append(r2)
            vi1.a r2 = r9.f147752f
            java.lang.String r2 = r2.f189150v
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "FinderLiveMicIntercomBo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            vi1.a r10 = r9.f147752f
            ui1.a r2 = r10.f189151w
            ui1.e$a r7 = new ui1.e$a
            androidx.lifecycle.i0 r10 = r10.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.mo76015n4()
            if (r10 != 0) goto L_0x0060
            java.lang.String r10 = ""
        L_0x0060:
            vi1.a r8 = r9.f147752f
            androidx.lifecycle.i0 r0 = r8.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154345o
            vi1.a r8 = r9.f147752f
            java.lang.String r8 = r8.f189150v
            r7.<init>(r6, r10, r0, r8)
            r9.f147751e = r6
            ui1.e r2 = (ui1.C52581e) r2
            java.lang.Object r10 = r2.mo73542a(r7, r9)
            if (r10 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r0 = r10
            bi1.e r0 = (bi1.C0287e) r0
            vi1.a r10 = r9.f147752f
            boolean r2 = r0 instanceof bi1.C0288f
            if (r2 == 0) goto L_0x009d
            wx3.f r2 = r0.f854a
            if (r2 != 0) goto L_0x008d
            wx3.f r2 = r9.getContext()
        L_0x008d:
            vi1.b$b r6 = new vi1.b$b
            r6.<init>(r0, r3, r10)
            r9.f147750d = r0
            r9.f147751e = r5
            java.lang.Object r10 = a14.C53895h.m60469g(r2, r6, r9)
            if (r10 != r1) goto L_0x009d
            return r1
        L_0x009d:
            boolean r10 = r0 instanceof bi1.C0281b
            if (r10 == 0) goto L_0x00b9
            wx3.f r10 = r0.f854a
            if (r10 != 0) goto L_0x00a9
            wx3.f r10 = r9.getContext()
        L_0x00a9:
            vi1.b$a r2 = new vi1.b$a
            r2.<init>(r0, r3)
            r9.f147750d = r0
            r9.f147751e = r4
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r9)
            if (r10 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vi1.C52917b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
