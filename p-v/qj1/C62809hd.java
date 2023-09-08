package qj1;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import sk1.C63956k;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePromoteBubblePlugin$statusChange$1$1$1$1", mo125469f = "FinderLivePromoteBubblePlugin.kt", mo125470l = {286}, mo125471m = "invokeSuspend")
/* renamed from: qj1.hd */
public final class C62809hd extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f178281d;

    /* renamed from: e */
    public final /* synthetic */ C63956k f178282e;

    /* renamed from: f */
    public final /* synthetic */ C62712dd f178283f;

    /* renamed from: qj1.hd$a */
    public static final class C62810a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63956k f178284d;

        /* renamed from: e */
        public final /* synthetic */ C62712dd f178285e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62810a(C63956k kVar, C62712dd ddVar) {
            super(0);
            this.f178284d = kVar;
            this.f178285e = ddVar;
        }

        public Object invoke() {
            C63956k kVar = this.f178284d;
            C63956k kVar2 = kVar instanceof C63956k ? kVar : null;
            if (kVar2 != null) {
                kVar2.f181295h = 0;
            }
            C62712dd.m73744Z0(this.f178285e, kVar);
            C62712dd.m73745a1(this.f178285e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62809hd(C63956k kVar, C62712dd ddVar, C15601d<? super C62809hd> dVar) {
        super(2, dVar);
        this.f178282e = kVar;
        this.f178283f = ddVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62809hd(this.f178282e, this.f178283f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62809hd) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f178281d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C63956k kVar = this.f178282e;
            if (!(kVar instanceof C63956k)) {
                kVar = null;
            }
            int i2 = kVar != null ? kVar.f181295h : 0;
            String str = this.f178283f.f178063s;
            Log.m105924i(str, "[addPromoteData] delay:" + i2);
            this.f178281d = 1;
            if (C53965x0.m60607b(((long) i2) * 1000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C61926c.m72668M(new C62810a(this.f178282e, this.f178283f));
        return C13598b0.f38549a;
    }
}
