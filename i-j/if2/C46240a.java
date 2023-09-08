package if2;

import a14.C0000n0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C45253g;
import d14.C58017a1;
import d14.C58057l;
import d14.C58085t0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.ResultKt;
import ob0.C47350c;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50132ki;
import te3.C50412mj2;
import te3.C50554nj2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: if2.a */
public final class C46240a extends C53996a<C46243b> {

    /* renamed from: d */
    public final String f124645d;

    /* renamed from: e */
    public int f124646e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.auth.BizUseRecordDataSource$getData$1", mo125469f = "NewBizInfoRecordingUI.kt", mo125470l = {196}, mo125471m = "invokeSuspend")
    /* renamed from: if2.a$a */
    public static final class C46241a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f124647d;

        /* renamed from: e */
        public final /* synthetic */ C53998c<C46243b> f124648e;

        /* renamed from: f */
        public final /* synthetic */ C46240a f124649f;

        /* renamed from: g */
        public final /* synthetic */ C58085t0<C39534d<C46243b>> f124650g;

        /* renamed from: if2.a$a$a */
        public static final class C46242a implements C45253g<C47445a<C50554nj2>> {

            /* renamed from: d */
            public final /* synthetic */ C39534d<C46243b> f124651d;

            /* renamed from: e */
            public final /* synthetic */ C46240a f124652e;

            /* renamed from: f */
            public final /* synthetic */ C58085t0<C39534d<C46243b>> f124653f;

            public C46242a(C39534d<C46243b> dVar, C46240a aVar, C58085t0<C39534d<C46243b>> t0Var) {
                this.f124651d = dVar;
                this.f124652e = aVar;
                this.f124653f = t0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                C50132ki kiVar;
                C47445a aVar = (C47445a) obj;
                if (aVar.f128348a != C47798b.OnEnd) {
                    return C13598b0.f38549a;
                }
                C50554nj2 nj22 = (aVar.f128350c == 0 && aVar.f128349b == 0) ? (C50554nj2) aVar.f128353f : null;
                int i = 0;
                if (nj22 == null) {
                    this.f124651d.f106150a = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    LinkedList<C50132ki> linkedList = nj22.f138630d;
                    if (linkedList != null) {
                        for (C50132ki kiVar2 : linkedList) {
                            C87412m.m108593f(kiVar2, "record");
                            arrayList.add(new C46243b(kiVar2, 0, 2, (C8480h) null));
                        }
                    }
                    this.f124651d.f106151b.addAll(arrayList);
                    this.f124651d.f106150a = nj22.f138631e == 1;
                    C46240a aVar2 = this.f124652e;
                    C46243b bVar = (C46243b) C110818d0.m150925W(arrayList);
                    if (!(bVar == null || (kiVar = bVar.f124654d) == null)) {
                        i = kiVar.f136800e;
                    }
                    aVar2.f124646e = i;
                }
                C39534d<C46243b> dVar2 = this.f124651d;
                if (!dVar2.f106150a) {
                    dVar2.f106151b.add(new C46243b((C50132ki) null, 1, 1, (C8480h) null));
                }
                Object emit = this.f124653f.emit(this.f124651d, dVar);
                return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46241a(C53998c<C46243b> cVar, C46240a aVar, C58085t0<C39534d<C46243b>> t0Var, C15601d<? super C46241a> dVar) {
            super(2, dVar);
            this.f124648e = cVar;
            this.f124649f = aVar;
            this.f124650g = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46241a(this.f124648e, this.f124649f, this.f124650g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46241a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f124647d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C39534d dVar = new C39534d(this.f124648e);
                C46240a aVar2 = this.f124649f;
                aVar2.f124646e = this.f124648e.f151264a == 0 ? (int) (System.currentTimeMillis() / ((long) 1000)) : aVar2.f124646e;
                C46240a aVar3 = this.f124649f;
                String str = aVar3.f124645d;
                int i2 = aVar3.f124646e;
                C50412mj2 mj22 = new C50412mj2();
                mj22.f138070d = str;
                mj22.f138071e = i2;
                mj22.f138072f = 10;
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = mj22;
                bVar.f127067b = new C50554nj2();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-getbizuseuserinforecordlist";
                bVar.f127069d = 1850;
                C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
                C46242a aVar4 = new C46242a(dVar, this.f124649f, this.f124650g);
                this.f124647d = 1;
                if (((C58057l) a).mo31880a(aVar4, this) == aVar) {
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

    public C46240a(String str) {
        C87412m.m108594g(str, "username");
        this.f124645d = str;
    }

    /* renamed from: b */
    public C45252f<C39534d<C46243b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C46243b> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C46241a(cVar, this, b, (C15601d<? super C46241a>) null), 1, (Object) null);
        return b;
    }
}
