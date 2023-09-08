package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45253g;
import d14.C58017a1;
import d14.C58097y0;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import p1081gi.C98124g;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSCJavaHelper$Companion$startSyncCdnUpload$2", mo125469f = "CdnFSCJavaHelper.kt", mo125470l = {231}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.h */
public final class C92774h extends C91594j implements C32227p<C0000n0, C15601d<? super C92798v>, Object> {

    /* renamed from: d */
    public Object f267033d;

    /* renamed from: e */
    public Object f267034e;

    /* renamed from: f */
    public int f267035f;

    /* renamed from: g */
    public final /* synthetic */ C98124g f267036g;

    /* renamed from: h */
    public final /* synthetic */ WeakReference<C92750b0> f267037h;

    /* renamed from: com.tencent.mm.modelcdntran.h$a */
    public static final class C92775a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98124g f267038d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f267039e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92775a(C98124g gVar, C53973z1 z1Var) {
            super(1);
            this.f267038d = gVar;
            this.f267039e = z1Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C92738a Ax0 = C92779i0.Ax0();
            if (Ax0 != null) {
                String str = this.f267038d.field_mediaId;
                C87412m.m108593f(str, "taskInfo.field_mediaId");
                LifecycleScope.launchDefault$default(Ax0.mo126974l3(), (C53934p0) null, new C92748b(Ax0, C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null), str, (C15601d<? super C92748b>) null), 1, (Object) null);
            }
            C53973z1 z1Var = this.f267039e;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSCJavaHelper$Companion$startSyncCdnUpload$2$1$job$1", mo125469f = "CdnFSCJavaHelper.kt", mo125470l = {122}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelcdntran.h$b */
    public static final class C92776b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f267040d;

        /* renamed from: e */
        public /* synthetic */ Object f267041e;

        /* renamed from: f */
        public final /* synthetic */ C58097y0<C92798v> f267042f;

        /* renamed from: g */
        public final /* synthetic */ WeakReference<C92750b0> f267043g;

        /* renamed from: h */
        public final /* synthetic */ C53916l<C92798v> f267044h;

        /* renamed from: com.tencent.mm.modelcdntran.h$b$a */
        public static final class C92777a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ WeakReference<C92750b0> f267045d;

            /* renamed from: e */
            public final /* synthetic */ C0000n0 f267046e;

            /* renamed from: f */
            public final /* synthetic */ C53916l<C92798v> f267047f;

            public C92777a(WeakReference<C92750b0> weakReference, C0000n0 n0Var, C53916l<? super C92798v> lVar) {
                this.f267045d = weakReference;
                this.f267046e = n0Var;
                this.f267047f = lVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C92750b0 b0Var;
                C92750b0 b0Var2;
                C92798v vVar = (C92798v) obj;
                int ordinal = vVar.f267130a.ordinal();
                if (ordinal == 6) {
                    WeakReference<C92750b0> weakReference = this.f267045d;
                    if (!(weakReference == null || (b0Var = weakReference.get()) == null)) {
                        b0Var.mo86621c(vVar);
                    }
                } else if (ordinal != 16) {
                    C53930o0.m60558e(this.f267046e, (CancellationException) null, 1, (Object) null);
                    this.f267047f.resumeWith(Result.m168114constructorimpl(vVar));
                } else {
                    WeakReference<C92750b0> weakReference2 = this.f267045d;
                    if (!(weakReference2 == null || (b0Var2 = weakReference2.get()) == null)) {
                        b0Var2.mo86620b(vVar);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92776b(C58097y0<C92798v> y0Var, WeakReference<C92750b0> weakReference, C53916l<? super C92798v> lVar, C15601d<? super C92776b> dVar) {
            super(2, dVar);
            this.f267042f = y0Var;
            this.f267043g = weakReference;
            this.f267044h = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C92776b bVar = new C92776b(this.f267042f, this.f267043g, this.f267044h, dVar);
            bVar.f267041e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92776b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f267040d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f267041e;
                C58097y0<C92798v> y0Var = this.f267042f;
                if (y0Var == null) {
                    return C13598b0.f38549a;
                }
                C92777a aVar2 = new C92777a(this.f267043g, n0Var, this.f267044h);
                this.f267040d = 1;
                if (y0Var.mo31880a(aVar2, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92774h(C98124g gVar, WeakReference<C92750b0> weakReference, C15601d<? super C92774h> dVar) {
        super(2, dVar);
        this.f267036g = gVar;
        this.f267037h = weakReference;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92774h(this.f267036g, this.f267037h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92774h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f267035f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C98124g gVar = this.f267036g;
            WeakReference<C92750b0> weakReference = this.f267037h;
            this.f267033d = gVar;
            this.f267034e = weakReference;
            this.f267035f = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C92738a Ax0 = C92779i0.Ax0();
            C53973z1 z1Var = null;
            C58097y0<C92798v> o3 = Ax0 != null ? Ax0.mo126977o3(gVar) : null;
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                z1Var = LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C92776b(o3, weakReference, mVar, (C15601d<? super C92776b>) null), 1, (Object) null);
            }
            mVar.mo74599v(new C92775a(gVar, z1Var));
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            WeakReference weakReference2 = (WeakReference) this.f267034e;
            C98124g gVar2 = (C98124g) this.f267033d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
