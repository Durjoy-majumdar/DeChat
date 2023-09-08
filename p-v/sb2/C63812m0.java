package sb2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import d03.C58010a;
import di3.C86312j;
import fy3.C32227p;
import hb2.C59811e;
import java.util.List;
import kotlin.ResultKt;
import p707tz.C65000f;
import rx3.C13598b0;
import sb2.C63774j0;
import sx3.C26236u;
import u23.C65003a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerItemEditUIC$setupOnlineVideoThumb$1", mo125469f = "MusicMvMakerItemEditUIC.kt", mo125470l = {328}, mo125471m = "invokeSuspend")
/* renamed from: sb2.m0 */
public final class C63812m0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180891d;

    /* renamed from: e */
    public final /* synthetic */ C63774j0 f180892e;

    /* renamed from: f */
    public final /* synthetic */ C59811e.C59817e f180893f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerItemEditUIC$setupOnlineVideoThumb$1$tpMediaInfo$1", mo125469f = "MusicMvMakerItemEditUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sb2.m0$a */
    public static final class C63813a extends C91594j implements C32227p<C0000n0, C15601d<? super C58010a>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59811e.C59817e f180894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63813a(C59811e.C59817e eVar, C15601d<? super C63813a> dVar) {
            super(2, dVar);
            this.f180894d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63813a(this.f180894d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63813a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return this.f180894d.mo84773f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63812m0(C63774j0 j0Var, C59811e.C59817e eVar, C15601d<? super C63812m0> dVar) {
        super(2, dVar);
        this.f180892e = j0Var;
        this.f180893f = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63812m0(this.f180892e, this.f180893f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63812m0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C65000f.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f180891d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151119c;
            C63813a aVar2 = new C63813a(this.f180893f, (C15601d<? super C63813a>) null);
            this.f180891d = 1;
            obj = C53895h.m60469g(h0Var, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C58010a aVar3 = (C58010a) obj;
        if (aVar3 == null) {
            return C13598b0.f38549a;
        }
        C65003a uV = ((C65000f) C86312j.m106911c(cls)).mo89204uV(aVar3);
        uV.f187121a = 80;
        uV.f187122b = 120;
        C63774j0 j0Var = this.f180892e;
        uV.f187126f = (j0Var.f180827v * ((float) j0Var.f180825t)) / (((((float) j0Var.f180806C) * 1.0f) / ((float) 120)) * ((float) 80));
        uV.mo89218f();
        this.f180892e.mo88577d3().f180833e = ((C65000f) C86312j.m106911c(cls)).mo89197mk();
        C63774j0.C63776b d3 = this.f180892e.mo88577d3();
        List b = C26236u.m33719b(uV);
        d3.getClass();
        d3.f180832d.clear();
        d3.f180832d.addAll(b);
        d3.notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
