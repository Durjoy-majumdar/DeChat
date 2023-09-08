package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58097y0;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import p1081gi.C98124g;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.modelcdntran.e */
public final class C68104e {

    /* renamed from: a */
    public static final C68105a f195751a = new C68105a();

    /* renamed from: com.tencent.mm.modelcdntran.e$a */
    public static final class C68105a {

        @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSCJavaHelper$Companion$cancelDownloadTask$1$1", mo125469f = "CdnFSCJavaHelper.kt", mo125470l = {62}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.modelcdntran.e$a$a */
        public static final class C55378a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f157707d;

            /* renamed from: e */
            public final /* synthetic */ C58097y0<C92798v> f157708e;

            /* renamed from: f */
            public final /* synthetic */ WeakReference<C55384i> f157709f;

            /* renamed from: com.tencent.mm.modelcdntran.e$a$a$a */
            public static final class C55379a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ WeakReference<C55384i> f157710d;

                public C55379a(WeakReference<C55384i> weakReference) {
                    this.f157710d = weakReference;
                }

                public Object emit(Object obj, C15601d dVar) {
                    C92798v vVar = (C92798v) obj;
                    C55384i iVar = this.f157710d.get();
                    if (iVar != null) {
                        iVar.mo11363a(vVar);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55378a(C58097y0<C92798v> y0Var, WeakReference<C55384i> weakReference, C15601d<? super C55378a> dVar) {
                super(2, dVar);
                this.f157708e = y0Var;
                this.f157709f = weakReference;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C55378a(this.f157708e, this.f157709f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                ((C55378a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                return C15911a.COROUTINE_SUSPENDED;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f157707d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58097y0<C92798v> y0Var = this.f157708e;
                    C55379a aVar2 = new C55379a(this.f157709f);
                    this.f157707d = 1;
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

        @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSCJavaHelper$Companion$startCdnDownload$1$1", mo125469f = "CdnFSCJavaHelper.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.modelcdntran.e$a$b */
        public static final class C55380b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f157711d;

            /* renamed from: e */
            public final /* synthetic */ C58097y0<C92798v> f157712e;

            /* renamed from: f */
            public final /* synthetic */ WeakReference<C55384i> f157713f;

            /* renamed from: com.tencent.mm.modelcdntran.e$a$b$a */
            public static final class C55381a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ WeakReference<C55384i> f157714d;

                public C55381a(WeakReference<C55384i> weakReference) {
                    this.f157714d = weakReference;
                }

                public Object emit(Object obj, C15601d dVar) {
                    C92798v vVar = (C92798v) obj;
                    C55384i iVar = this.f157714d.get();
                    if (iVar != null) {
                        iVar.mo11363a(vVar);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55380b(C58097y0<C92798v> y0Var, WeakReference<C55384i> weakReference, C15601d<? super C55380b> dVar) {
                super(2, dVar);
                this.f157712e = y0Var;
                this.f157713f = weakReference;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C55380b(this.f157712e, this.f157713f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                ((C55380b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                return C15911a.COROUTINE_SUSPENDED;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f157711d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58097y0<C92798v> y0Var = this.f157712e;
                    C55381a aVar2 = new C55381a(this.f157713f);
                    this.f157711d = 1;
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

        /* renamed from: a */
        public final String mo93612a(String str, WeakReference<C55384i> weakReference) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(weakReference, "listenerRef");
            Log.m105924i("MicroMsg.Cdn.CdnFSCJavaHelper", "cancelDownloadTask taskInfo field_mediaId:" + str);
            C92738a Ax0 = C92779i0.Ax0();
            C58097y0<C92798v> i3 = Ax0 != null ? Ax0.mo126971i3(str) : null;
            if (i3 == null) {
                return null;
            }
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C55378a(i3, weakReference, (C15601d<? super C55378a>) null), 1, (Object) null);
            }
            return str;
        }

        /* renamed from: b */
        public final C98124g mo93613b(C98124g gVar, WeakReference<C55384i> weakReference) {
            C87412m.m108594g(gVar, "taskInfo");
            C87412m.m108594g(weakReference, "listenerRef");
            Log.m105924i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnDownload taskInfo field_mediaId:" + gVar.field_mediaId);
            C92738a Ax0 = C92779i0.Ax0();
            C58097y0<C92798v> n3 = Ax0 != null ? Ax0.mo126976n3(gVar) : null;
            if (n3 == null) {
                return null;
            }
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C55380b(n3, weakReference, (C15601d<? super C55380b>) null), 1, (Object) null);
            }
            return gVar;
        }
    }
}
