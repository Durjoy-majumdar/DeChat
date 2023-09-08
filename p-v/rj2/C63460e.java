package rj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58042h;
import d14.C58050i1;
import d14.C58052j1;
import fy3.C32227p;
import j03.C60700d;
import kotlin.ResultKt;
import rj2.C63451c;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.feed.RingtonePlayerFlow$restartFlowJob$1", mo125469f = "RingtonePlayerFlow.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
/* renamed from: rj2.e */
public final class C63460e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180006d;

    /* renamed from: e */
    public final /* synthetic */ C63451c f180007e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.feed.RingtonePlayerFlow$restartFlowJob$1$1", mo125469f = "RingtonePlayerFlow.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
    /* renamed from: rj2.e$a */
    public static final class C63461a extends C91594j implements C32227p<C63451c.C63452a.C63454b, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f180008d;

        /* renamed from: e */
        public /* synthetic */ Object f180009e;

        /* renamed from: f */
        public final /* synthetic */ C63451c f180010f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63461a(C63451c cVar, C15601d<? super C63461a> dVar) {
            super(2, dVar);
            this.f180010f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63461a aVar = new C63461a(this.f180010f, dVar);
            aVar.f180009e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63461a) create((C63451c.C63452a.C63454b) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C63451c.C63452a.C63454b bVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f180008d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C63451c.C63452a.C63454b bVar2 = (C63451c.C63452a.C63454b) this.f180009e;
                Log.m105924i("MicroMsg.RingtonePlayerFlow", "actionFlow collect, state:" + bVar2.f179992c);
                if (bVar2.f179992c == 3) {
                    ((C58052j1) this.f180010f.f179976e).setValue(new C63451c.C63452a.C63453a(0, 1));
                    this.f180010f.mo88320g3();
                } else if (bVar2.f179991b == null) {
                    ((C58052j1) this.f180010f.f179976e).setValue(new C63451c.C63452a.C63453a(bVar2.f179990a, 1));
                    this.f180010f.mo88320g3();
                } else {
                    ((C58052j1) this.f180010f.f179976e).setValue(new C63451c.C63452a.C63453a(bVar2.f179990a, 1));
                    this.f180010f.mo88320g3();
                    C63451c cVar = this.f180010f;
                    C66132f fVar = bVar2.f179991b;
                    this.f180009e = bVar2;
                    this.f180008d = 1;
                    cVar.getClass();
                    Object g = C53895h.m60469g(C53872d1.f151119c, new C63459d(cVar, fVar, (C15601d<? super C63459d>) null), this);
                    if (g == aVar) {
                        return aVar;
                    }
                    bVar = bVar2;
                    obj = g;
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                bVar = (C63451c.C63452a.C63454b) this.f180009e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C66132f fVar2 = (C66132f) obj;
            if (fVar2 != null) {
                C63451c cVar2 = this.f180010f;
                long j = bVar.f179990a;
                C60700d dVar = cVar2.f179981j;
                if (dVar == null) {
                    cVar2.f179980i = j;
                    cVar2.mo88317d3(fVar2);
                } else if (j != cVar2.f179980i) {
                    cVar2.mo88320g3();
                    cVar2.f179980i = j;
                    cVar2.mo88317d3(fVar2);
                } else {
                    if (!dVar.isPlaying()) {
                        z = false;
                    }
                    if (z) {
                        cVar2.mo88320g3();
                    } else {
                        cVar2.mo88320g3();
                        cVar2.f179980i = j;
                        cVar2.mo88317d3(fVar2);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63460e(C63451c cVar, C15601d<? super C63460e> dVar) {
        super(2, dVar);
        this.f180007e = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63460e(this.f180007e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63460e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f180006d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C63451c cVar = this.f180007e;
            C58050i1<C63451c.C63452a.C63454b> i1Var = cVar.f179979h;
            C63461a aVar2 = new C63461a(cVar, (C15601d<? super C63461a>) null);
            this.f180006d = 1;
            if (C58042h.m67194c(i1Var, aVar2, this) == aVar) {
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
