package gq3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53965x0;
import c14.C54624g;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58017a1;
import d14.C58042h;
import d14.C58078q;
import d14.C58085t0;
import d14.C58095x0;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import ig3.C60281c;
import ig3.C60282d;
import ig3.C60283e;
import java.util.ArrayList;
import kotlin.ResultKt;
import o40.C61926c;
import p157gk.C59477b;
import p157gk.C59479c;
import p157gk.C59481e;
import p157gk.C59485f;
import p157gk.C59491j;
import p157gk.C59503r;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$applyNormalReq$1", mo125469f = "ImageQueryViewModel.kt", mo125470l = {218, 233}, mo125471m = "invokeSuspend")
/* renamed from: gq3.i */
public final class C59634i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f170435d;

    /* renamed from: e */
    public final /* synthetic */ C59629h f170436e;

    @C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$applyNormalReq$1$1", mo125469f = "ImageQueryViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gq3.i$a */
    public static final class C59635a extends C91594j implements C32228q<C45253g<? super ArrayList<QueryImageData>>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f170437d;

        /* renamed from: gq3.i$a$a */
        public static final class C59636a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59629h f170438d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59636a(C59629h hVar) {
                super(0);
                this.f170438d = hVar;
            }

            public Object invoke() {
                Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq on completion to ui thread update: " + Thread.currentThread().getName());
                C59629h hVar = this.f170438d;
                hVar.f170396A = C59477b.ALL_OLD;
                hVar.f170402f.setValue(C59648q.STOP);
                int size = this.f170438d.f170410q.size();
                C59649r value = this.f170438d.f170408o.getValue();
                int size2 = C87412m.m108589b(value != null ? value.name() : null, "PERSON") ? this.f170438d.f170411r.size() : 0;
                Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + C59491j.f169996a + ", " + size2);
                if (!C59491j.f169996a) {
                    C60282d dVar = C60282d.f171857a;
                    C60282d.f171864h = size;
                    dVar.mo85267d(size2);
                    dVar.mo85266c(size > 0 ? 56 : 57);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59635a(C59629h hVar, C15601d<? super C59635a> dVar) {
            super(3, dVar);
            this.f170437d = hVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            Throwable th = (Throwable) obj2;
            return new C59635a(this.f170437d, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq on completion: " + Thread.currentThread().getName());
            C61926c.m72668M(new C59636a(this.f170437d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gq3.i$b */
    public static final class C59637b implements C45253g<ArrayList<QueryImageData>> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f170439d;

        public C59637b(C59629h hVar) {
            this.f170439d = hVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + Thread.currentThread().getName());
            Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + arrayList.size());
            C53896h0 h0Var = C53872d1.f151117a;
            Object g = C53895h.m60469g(C58901s.f168555a, new C59638j(arrayList, this.f170439d, (C15601d<? super C59638j>) null), dVar);
            return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59634i(C59629h hVar, C15601d<? super C59634i> dVar) {
        super(2, dVar);
        this.f170436e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59634i(this.f170436e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59634i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C58085t0<ArrayList<QueryImageData>> t0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170435d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + Thread.currentThread().getName());
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            C59481e eVar = C59491j.f169998c;
            if ((eVar != null ? eVar.f169961a : null) == C59477b.IDLE) {
                Log.m105924i("MicroMsg.ImageQueryViewModel", "when apply normal req >> data is no ready");
                this.f170435d = 1;
            } else {
                Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq >> data is ready");
                C59481e eVar2 = C59491j.f169998c;
                if (eVar2 != null) {
                    eVar2.f169962b = C59649r.NORMAL;
                    StringBuilder sb = new StringBuilder();
                    sb.append("applyQueryNormalReq >> dataType: ");
                    sb.append(eVar2.f169961a);
                    sb.append(", currentIdentifyType: ");
                    C59503r.f170040a.getClass();
                    sb.append(C59503r.f170053n);
                    Log.m105924i("MicroMsg.ImageDataManager", sb.toString());
                    C59477b bVar = eVar2.f169961a;
                    C59477b bVar2 = C59477b.ALL_OLD;
                    if (bVar == bVar2 || C59503r.f170053n == C59479c.STOP) {
                        C60283e.f171888k = (long) (eVar2.f169961a == bVar2 ? 3 : 1);
                        C60281c cVar = C60281c.f171856a;
                        cVar.mo85259b(true);
                        cVar.mo85258a(true);
                        t0Var = C58042h.m67201j(new C58095x0(new C59485f((C15601d<? super C59485f>) null)), C53872d1.f151119c);
                    } else {
                        C60283e.f171888k = (long) 2;
                        C60281c cVar2 = C60281c.f171856a;
                        cVar2.mo85259b(false);
                        cVar2.mo85258a(false);
                        eVar2.f169963c = 0;
                        eVar2.f169964d = -2;
                        C58085t0<ArrayList<QueryImageData>> b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
                        eVar2.f169969i = b;
                        t0Var = b;
                    }
                    if (t0Var != null) {
                        C58078q qVar = new C58078q(t0Var, new C59635a(this.f170436e, (C15601d<? super C59635a>) null));
                        C59637b bVar3 = new C59637b(this.f170436e);
                        this.f170435d = 2;
                        if (qVar.mo31880a(bVar3, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        } while (C53965x0.m60607b(500, this) != aVar);
        return aVar;
    }
}
