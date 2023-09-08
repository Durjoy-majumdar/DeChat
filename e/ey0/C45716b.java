package ey0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import dy0.C45491a;
import dy0.C45492c;
import dy0.C7535b;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50265li;
import te3.C50839pj2;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ey0.b */
public final class C45716b extends C53996a<C7948a> {

    /* renamed from: d */
    public int f123545d = ((int) (System.currentTimeMillis() / ((long) 1000)));

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.userinfo.ui.BizServiceManageDataSource$getData$1", mo125469f = "BizServiceManageDataSource.kt", mo125470l = {19, 36}, mo125471m = "invokeSuspend")
    /* renamed from: ey0.b$a */
    public static final class C45717a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f123546d;

        /* renamed from: e */
        public int f123547e;

        /* renamed from: f */
        public final /* synthetic */ C53998c<C7948a> f123548f;

        /* renamed from: g */
        public final /* synthetic */ C45716b f123549g;

        /* renamed from: h */
        public final /* synthetic */ C58085t0<C39534d<C7948a>> f123550h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45717a(C53998c<C7948a> cVar, C45716b bVar, C58085t0<C39534d<C7948a>> t0Var, C15601d<? super C45717a> dVar) {
            super(2, dVar);
            this.f123548f = cVar;
            this.f123549g = bVar;
            this.f123550h = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C45717a(this.f123548f, this.f123549g, this.f123550h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C45717a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C39534d dVar;
            C50265li liVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f123547e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                dVar = new C39534d(this.f123548f);
                int i2 = C45492c.f123143a;
                int i3 = this.f123549g.f123545d;
                this.f123546d = dVar;
                this.f123547e = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                new C45491a(i3).mo9225i().mo123420E(new C7535b(hVar));
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                dVar = (C39534d) this.f123546d;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C50839pj2 pj22 = (C50839pj2) obj;
            int i4 = 0;
            if (pj22 == null) {
                dVar.f106150a = false;
            } else {
                dVar.f106150a = pj22.f139791e == 1;
                ArrayList arrayList = new ArrayList();
                LinkedList<C50265li> linkedList = pj22.f139790d;
                if (linkedList != null) {
                    for (C50265li liVar2 : linkedList) {
                        C87412m.m108593f(liVar2, LocaleUtil.ITALIAN);
                        arrayList.add(new C7948a(liVar2, false, dVar.f106150a));
                    }
                }
                if ((!arrayList.isEmpty()) && !dVar.f106150a) {
                    arrayList.add(new C7948a(new C50265li(), true, dVar.f106150a));
                }
                dVar.f106151b.addAll(arrayList);
                C45716b bVar = this.f123549g;
                C7948a aVar2 = (C7948a) C110818d0.m150925W(dVar.f106151b);
                if (!(aVar2 == null || (liVar = aVar2.f26634d) == null)) {
                    i4 = liVar.f137426f;
                }
                bVar.f123545d = i4;
            }
            C58085t0<C39534d<C7948a>> t0Var = this.f123550h;
            this.f123546d = null;
            this.f123547e = 2;
            if (t0Var.emit(dVar, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public C45252f<C39534d<C7948a>> mo70650e(LifecycleScope lifecycleScope, C53998c<C7948a> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        C53895h.m60466d(lifecycleScope, (C66212f) null, (C53934p0) null, new C45717a(cVar, this, b, (C15601d<? super C45717a>) null), 3, (Object) null);
        return b;
    }
}
