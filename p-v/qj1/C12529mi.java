package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import nk1.C11207i;
import ok1.C62042e;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$initPlugin$1$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {124}, mo125471m = "invokeSuspend")
/* renamed from: qj1.mi */
public final class C12529mi extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f36012d;

    /* renamed from: e */
    public final /* synthetic */ C12453ii f36013e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveWishPanelPlugin$initPlugin$1$1$1", mo125469f = "FinderLiveWishPanelPlugin.kt", mo125470l = {125}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.mi$a */
    public static final class C12530a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f36014d;

        /* renamed from: e */
        public final /* synthetic */ C12453ii f36015e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12530a(C12453ii iiVar, C15601d<? super C12530a> dVar) {
            super(2, dVar);
            this.f36015e = iiVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12530a(this.f36015e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12530a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f36014d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C12453ii iiVar = this.f36015e;
                this.f36014d = 1;
                if (C12453ii.m12015Z0(iiVar, this) == aVar) {
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
    public C12529mi(C12453ii iiVar, C15601d<? super C12529mi> dVar) {
        super(2, dVar);
        this.f36013e = iiVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12529mi(this.f36013e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12529mi) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f36012d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (C62042e.f176370a.mo87027N0() && !this.f36013e.mo11126D() && !((C54991o) this.f36013e.mo87696x0(C54991o.class)).mo75999e4()) {
                Log.m105924i("FinderLiveWishPanelPlug", "anchor checkWishEnable");
                C53896h0 h0Var = C53872d1.f151119c;
                C12530a aVar2 = new C12530a(this.f36013e, (C15601d<? super C12530a>) null);
                this.f36012d = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("FinderLiveWishPanelPlug", "anchor checkWishEnable finish");
        if (this.f36013e.mo11126D()) {
            C12453ii iiVar = this.f36013e;
            iiVar.getClass();
            C11207i.m11072h(iiVar, C53872d1.f151119c, (C53934p0) null, new C12509li(iiVar, (C15601d<? super C12509li>) null), 2, (Object) null);
        } else {
            this.f36013e.mo11127K();
        }
        return C13598b0.f38549a;
    }
}
