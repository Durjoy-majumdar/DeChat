package x70;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import a80.C103327c;
import com.tencent.p014mm.media.camera.lifecycle.CameraLifecycleProxy;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: x70.g */
public abstract class C112050g extends C112065s {

    /* renamed from: t */
    public CameraLifecycleProxy f335451t = new CameraLifecycleProxy(this);

    /* renamed from: u */
    public C53973z1 f335452u;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitLifecycle$onDestroy$1", mo125469f = "CameraKitLifecycle.kt", mo125470l = {44}, mo125471m = "invokeSuspend")
    /* renamed from: x70.g$a */
    public static final class C112051a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335453d;

        /* renamed from: e */
        public /* synthetic */ Object f335454e;

        /* renamed from: f */
        public final /* synthetic */ C112050g f335455f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112051a(C112050g gVar, C15601d<? super C112051a> dVar) {
            super(2, dVar);
            this.f335455f = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112051a aVar = new C112051a(this.f335455f, dVar);
            aVar.f335454e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112051a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r6.f335453d
                r2 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                java.lang.Object r0 = r6.f335454e
                a14.n0 r0 = (a14.C0000n0) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0034
            L_0x0011:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.f335454e
                a14.n0 r7 = (a14.C0000n0) r7
                x70.g r1 = r6.f335455f
                a14.z1 r1 = r1.f335452u
                if (r1 == 0) goto L_0x0035
                r6.f335454e = r7
                r6.f335453d = r2
                a14.f2 r1 = (a14.C53884f2) r1
                java.lang.Object r1 = r1.mo74521O(r6)
                if (r1 != r0) goto L_0x0033
                return r0
            L_0x0033:
                r0 = r7
            L_0x0034:
                r7 = r0
            L_0x0035:
                java.lang.String r0 = "MicroMsg.Camera.CameraKit"
                java.lang.String r1 = "exec camerakit release"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                x70.g r0 = r6.f335455f
                a14.n0 r0 = r0.f335429n
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                java.lang.String r7 = " release."
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r1 = 2
                r3 = 0
                a14.C53930o0.m60557d(r0, r7, r3, r1, r3)
                x70.g r7 = r6.f335455f
                android.os.HandlerThread r7 = r7.f335428j
                r7.quitSafely()
                x70.g r7 = r6.f335455f
                v70.d r7 = r7.mo163767p()
                r7.mo158203e()
                x70.g r7 = r6.f335455f
                android.hardware.display.DisplayManager r0 = r7.f335424i
                r0.unregisterDisplayListener(r7)
                w70.a r7 = w70.C111737a.f334621a
                r7.getClass()
                r7 = 0
                w70.C111737a.f334625e = r7
                h80.a r0 = h80.C108171a.f323903a
                x70.g r1 = r6.f335455f
                int r1 = r1.f335419d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "markExit sessionId:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r4 = " contain:"
                r3.append(r4)
                com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r4 = r0.mo158577a(r1)
                if (r4 == 0) goto L_0x0094
                goto L_0x0095
            L_0x0094:
                r2 = 0
            L_0x0095:
                r3.append(r2)
                java.lang.String r7 = " size:"
                r3.append(r7)
                android.util.SparseArray<com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct> r7 = h80.C108171a.f323904b
                int r2 = r7.size()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "MicroMsg.CameraKitReport"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r0.mo158577a(r1)
                if (r0 == 0) goto L_0x00c7
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r0.f310096o
                long r2 = r2 - r4
                r0.f310104w = r2
                long r2 = java.lang.System.currentTimeMillis()
                r0.f310097p = r2
                r0.mo86054n()
            L_0x00c7:
                r7.remove(r1)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: x70.C112050g.C112051a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitLifecycle$onPause$1", mo125469f = "CameraKitLifecycle.kt", mo125470l = {35}, mo125471m = "invokeSuspend")
    /* renamed from: x70.g$b */
    public static final class C112052b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335456d;

        /* renamed from: e */
        public final /* synthetic */ C112050g f335457e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112052b(C112050g gVar, C15601d<? super C112052b> dVar) {
            super(2, dVar);
            this.f335457e = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112052b(this.f335457e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112052b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335456d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C103327c cVar = this.f335457e.f335420e;
                if (cVar != null) {
                    this.f335456d = 1;
                    if (cVar.mo143102d(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitLifecycle$onResume$1", mo125469f = "CameraKitLifecycle.kt", mo125470l = {29}, mo125471m = "invokeSuspend")
    /* renamed from: x70.g$c */
    public static final class C112053c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335458d;

        /* renamed from: e */
        public final /* synthetic */ C112050g f335459e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112053c(C112050g gVar, C15601d<? super C112053c> dVar) {
            super(2, dVar);
            this.f335459e = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112053c(this.f335459e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112053c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335458d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C103327c cVar = this.f335459e.f335420e;
                if (cVar != null) {
                    this.f335458d = 1;
                    if (cVar.mo143103e(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public void onDestroy() {
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C112051a(this, (C15601d<? super C112051a>) null), 3, (Object) null);
    }

    public void onPause() {
        this.f335452u = mo163062D("onPause", new C112052b(this, (C15601d<? super C112052b>) null));
    }

    public void onResume() {
        mo163062D("onResume", new C112053c(this, (C15601d<? super C112053c>) null));
    }
}
