package hl1;

import a14.C0000n0;
import a14.C53872d1;
import android.os.Bundle;
import d50.C58113g;
import d50.C58115i;
import d60.C58124b;
import di3.C86312j;
import fy3.C32227p;
import i31.C117134d;
import kotlin.ResultKt;
import ok1.C62042e;
import p165hr.C60106t;
import p50.C62197e;
import rx3.C13598b0;
import vj1.C65757b;
import vk1.C65762c;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorLivingUIC$preloadLive$1", mo125469f = "FinderLiveVisitorLivingUIC.kt", mo125470l = {1380}, mo125471m = "invokeSuspend")
/* renamed from: hl1.t3 */
public final class C60033t3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f171337d;

    /* renamed from: e */
    public final /* synthetic */ C58113g f171338e;

    /* renamed from: f */
    public final /* synthetic */ C59988k f171339f;

    /* renamed from: g */
    public final /* synthetic */ boolean f171340g;

    /* renamed from: h */
    public final /* synthetic */ boolean f171341h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60033t3(C58113g gVar, C59988k kVar, boolean z, boolean z2, C15601d<? super C60033t3> dVar) {
        super(2, dVar);
        this.f171338e = gVar;
        this.f171339f = kVar;
        this.f171340g = z;
        this.f171341h = z2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60033t3(this.f171338e, this.f171339f, this.f171340g, this.f171341h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60033t3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C58115i iVar;
        C58115i iVar2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f171337d;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58113g gVar = this.f171338e;
            this.f171337d = 1;
            ((C60106t) C86312j.m106911c(C60106t.class)).getClass();
            Object h = C117134d.m165173h(new C65757b(gVar, C53872d1.f151117a), false, this, 1, (Object) null);
            if (h != aVar) {
                h = C13598b0.f38549a;
            }
            if (h == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C62042e.f176370a.mo87064a2(false, false);
        C59988k.m69862z(this.f171339f, false, this.f171340g, 1, (Object) null);
        C65762c cVar = this.f171339f.f166848f;
        if (cVar != null) {
            C58124b.C7172a.m7372a(cVar, C58124b.C58125b.FINDER_LIVE_PRELOAD_LIVE, (Bundle) null, 2, (Object) null);
        }
        if (this.f171341h) {
            C62197e C = this.f171339f.mo84868C();
            if (!(C == null || (iVar2 = C.f172989A) == null)) {
                iVar2.mo82889k();
            }
            Bundle bundle = new Bundle();
            C59988k kVar = this.f171339f;
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
            C62197e C2 = kVar.mo84868C();
            if (!(C2 == null || (iVar = C2.f172989A) == null)) {
                z = iVar.f166264k;
            }
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z);
            C65762c cVar2 = kVar.f166848f;
            if (cVar2 != null) {
                cVar2.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH, bundle);
            }
        }
        return C13598b0.f38549a;
    }
}
