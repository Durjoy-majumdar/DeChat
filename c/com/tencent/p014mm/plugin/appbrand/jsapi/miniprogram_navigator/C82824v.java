package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import nj0.C34855o;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66218h;
import x20.C15618a;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$handleIntercept$1", mo125469f = "NavigatorInterceptor.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v */
public final class C82824v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f242218d;

    /* renamed from: e */
    public final /* synthetic */ C81879g f242219e;

    /* renamed from: f */
    public final /* synthetic */ LaunchParcel f242220f;

    /* renamed from: g */
    public final /* synthetic */ C82794c.C82796b f242221g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$handleIntercept$1$checkIsActiveMiniGame$1", mo125469f = "NavigatorInterceptor.kt", mo125470l = {35}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v$a */
    public static final class C82825a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f242222d;

        /* renamed from: e */
        public final /* synthetic */ C81879g f242223e;

        /* renamed from: f */
        public final /* synthetic */ LaunchParcel f242224f;

        /* renamed from: g */
        public final /* synthetic */ C82794c.C82796b f242225g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$handleIntercept$1$checkIsActiveMiniGame$1$1", mo125469f = "NavigatorInterceptor.kt", mo125470l = {37, 42}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v$a$a */
        public static final class C82826a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f242226d;

            /* renamed from: e */
            public final /* synthetic */ C81879g f242227e;

            /* renamed from: f */
            public final /* synthetic */ LaunchParcel f242228f;

            /* renamed from: g */
            public final /* synthetic */ C82794c.C82796b f242229g;

            @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.NavigatorInterceptor$handleIntercept$1$checkIsActiveMiniGame$1$1$1", mo125469f = "NavigatorInterceptor.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v$a$a$a */
            public static final class C82827a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C81879g f242230d;

                /* renamed from: e */
                public final /* synthetic */ LaunchParcel f242231e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C82827a(C81879g gVar, LaunchParcel launchParcel, C15601d<? super C82827a> dVar) {
                    super(2, dVar);
                    this.f242230d = gVar;
                    this.f242231e = launchParcel;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C82827a(this.f242230d, this.f242231e, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C82827a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C81956c.m100675c(this.f242230d.getContext(), new NavigatorInterceptor$MMLaunchEntryProxyRequest(this.f242231e), (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C82826a(C81879g gVar, LaunchParcel launchParcel, C82794c.C82796b bVar, C15601d<? super C82826a> dVar) {
                super(2, dVar);
                this.f242227e = gVar;
                this.f242228f = launchParcel;
                this.f242229g = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C82826a(this.f242227e, this.f242228f, this.f242229g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C82826a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f242226d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (AppBrandRuntimeWCAccessible.isGame(this.f242227e.getRuntime()) && !C34855o.m40516a()) {
                        String str = this.f242228f.f243731e;
                        C87412m.m108593f(str, "args.appId");
                        int i2 = this.f242228f.f243733g;
                        this.f242226d = 1;
                        C66218h hVar = new C66218h(C66447b.m78392b(this));
                        C15618a.m14626b(new NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs(str, i2), C82822t.f242216d, new C82823u(hVar));
                        obj = hVar.mo90314b();
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    ((C82815o) this.f242229g).mo115050a(C82794c.C82796b.C82797a.PROCEED);
                    return C13598b0.f38549a;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    ((C82815o) this.f242229g).mo115050a(C82794c.C82796b.C82797a.IGNORE);
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13604l lVar = (C13604l) obj;
                boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
                boolean booleanValue2 = ((Boolean) lVar.f38556e).booleanValue();
                if (booleanValue && booleanValue2) {
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C82827a aVar2 = new C82827a(this.f242227e, this.f242228f, (C15601d<? super C82827a>) null);
                    this.f242226d = 2;
                    if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                    ((C82815o) this.f242229g).mo115050a(C82794c.C82796b.C82797a.IGNORE);
                    return C13598b0.f38549a;
                }
                ((C82815o) this.f242229g).mo115050a(C82794c.C82796b.C82797a.PROCEED);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82825a(C81879g gVar, LaunchParcel launchParcel, C82794c.C82796b bVar, C15601d<? super C82825a> dVar) {
            super(1, dVar);
            this.f242223e = gVar;
            this.f242224f = launchParcel;
            this.f242225g = bVar;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C82825a(this.f242223e, this.f242224f, this.f242225g, dVar);
        }

        public Object invoke(Object obj) {
            return ((C82825a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f242222d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C82826a aVar2 = new C82826a(this.f242223e, this.f242224f, this.f242225g, (C15601d<? super C82826a>) null);
                this.f242222d = 1;
                if (C53930o0.m60559f(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82824v(C81879g gVar, LaunchParcel launchParcel, C82794c.C82796b bVar, C15601d<? super C82824v> dVar) {
        super(2, dVar);
        this.f242219e = gVar;
        this.f242220f = launchParcel;
        this.f242221g = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C82824v(this.f242219e, this.f242220f, this.f242221g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C82824v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f242218d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C82825a aVar2 = new C82825a(this.f242219e, this.f242220f, this.f242221g, (C15601d<? super C82825a>) null);
            this.f242218d = 1;
            if (aVar2.invoke(this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
