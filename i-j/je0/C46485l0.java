package je0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import ob0.C47350c;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import rx3.C13598b0;
import te3.C49391f73;
import te3.C49526g73;
import te3.C49966ja;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.openim.model.OpenIMKefuLocationReqHelper$reportLocationCgi$1", mo125469f = "OpenIMKefuLocationReqHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: je0.l0 */
public final class C46485l0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f125236d;

    /* renamed from: e */
    public final /* synthetic */ String f125237e;

    /* renamed from: f */
    public final /* synthetic */ double f125238f;

    /* renamed from: g */
    public final /* synthetic */ double f125239g;

    /* renamed from: h */
    public final /* synthetic */ double f125240h;

    /* renamed from: i */
    public final /* synthetic */ int f125241i;

    /* renamed from: j */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f125242j;

    @C91590f(mo125468c = "com.tencent.mm.openim.model.OpenIMKefuLocationReqHelper$reportLocationCgi$1$1", mo125469f = "OpenIMKefuLocationReqHelper.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
    /* renamed from: je0.l0$a */
    public static final class C46486a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f125243d;

        /* renamed from: e */
        public final /* synthetic */ C45252f<C47445a<C49526g73>> f125244e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f125245f;

        /* renamed from: je0.l0$a$a */
        public static final class C46487a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f125246d;

            public C46487a(C32226l<? super Boolean, C13598b0> lVar) {
                this.f125246d = lVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C49966ja jaVar;
                C47445a aVar = (C47445a) obj;
                if (aVar.f128348a == C47798b.OnEnd) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("reportLocationCgi ");
                    sb.append(aVar.f128351d);
                    sb.append(' ');
                    sb.append(aVar.f128350c);
                    sb.append(' ');
                    C49526g73 g732 = (C49526g73) aVar.f128353f;
                    sb.append(g732 != null ? g732.getBaseResponse() : null);
                    Log.m105924i("MicroMsg.OpenIMKefuLocationReqHelper", sb.toString());
                    C32226l<Boolean, C13598b0> lVar = this.f125246d;
                    boolean z = false;
                    if (aVar.f128350c == 0) {
                        C49526g73 g733 = (C49526g73) aVar.f128353f;
                        if ((g733 == null || (jaVar = g733.BaseResponse) == null || jaVar.f135955d != 0) ? false : true) {
                            z = true;
                        }
                    }
                    lVar.invoke(Boolean.valueOf(z));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46486a(C45252f<C47445a<C49526g73>> fVar, C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C46486a> dVar) {
            super(2, dVar);
            this.f125244e = fVar;
            this.f125245f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46486a(this.f125244e, this.f125245f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46486a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f125243d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C47445a<C49526g73>> fVar = this.f125244e;
                C46487a aVar2 = new C46487a(this.f125245f);
                this.f125243d = 1;
                if (fVar.mo31880a(aVar2, this) == aVar) {
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
    public C46485l0(String str, String str2, double d, double d2, double d3, int i, C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C46485l0> dVar) {
        super(2, dVar);
        this.f125236d = str;
        this.f125237e = str2;
        this.f125238f = d;
        this.f125239g = d2;
        this.f125240h = d3;
        this.f125241i = i;
        this.f125242j = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46485l0(this.f125236d, this.f125237e, this.f125238f, this.f125239g, this.f125240h, this.f125241i, this.f125242j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46485l0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C49391f73 f732 = new C49391f73();
        String str = this.f125236d;
        String str2 = this.f125237e;
        double d = this.f125238f;
        double d2 = this.f125239g;
        double d3 = this.f125240h;
        int i = this.f125241i;
        f732.f133330d = str;
        if (str2 != null) {
            f732.f133331e = str2;
        }
        f732.f133332f = d;
        f732.f133333g = d2;
        f732.f133334h = d3;
        f732.f133335i = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/openimkefucontactreportlocation";
        bVar.f127069d = 8291;
        bVar.f127066a = f732;
        bVar.f127067b = new C49526g73();
        C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60465c(lifecycleScope, C58901s.f168555a, C53934p0.DEFAULT, new C46486a(a, this.f125242j, (C15601d<? super C46486a>) null));
        }
        return C13598b0.f38549a;
    }
}
