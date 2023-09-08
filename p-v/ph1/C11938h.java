package ph1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.fluent.FinderFluentSwitchManager$startEnterLiveCountDown$1", mo125469f = "FinderFluentSwitchManager.kt", mo125470l = {56, 58}, mo125471m = "invokeSuspend")
/* renamed from: ph1.h */
public final class C11938h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f34872d;

    /* renamed from: e */
    public final /* synthetic */ long f34873e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.fluent.FinderFluentSwitchManager$startEnterLiveCountDown$1$1", mo125469f = "FinderFluentSwitchManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ph1.h$a */
    public static final class C11939a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ long f34874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11939a(long j, C15601d<? super C11939a> dVar) {
            super(2, dVar);
            this.f34874d = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11939a(this.f34874d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11939a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C62293i.f177081a.mo87359d(this.f34874d);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11938h(long j, C15601d<? super C11938h> dVar) {
        super(2, dVar);
        this.f34873e = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11938h(this.f34873e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11938h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f34872d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f34872d = 1;
            if (C53965x0.m60607b(10000, this) == aVar) {
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
        Log.m105924i("FinderFluentSwitchManager", "startEnterLiveCountDown launch timeout feedId: " + this.f34873e);
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C11939a aVar2 = new C11939a(this.f34873e, (C15601d<? super C11939a>) null);
        this.f34872d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
