package com.tencent.p014mm.sns_compose.page;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54208j0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sns_compose.page.C57573j;
import d14.C45252f;
import d14.C45254q0;
import d14.C58056k1;
import d14.C58087u0;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.ResultKt;
import lh3.C99474g;
import p247u3.C14111b2;
import p247u3.C14117j1;
import p247u3.C14119k1;
import p247u3.C37336s1;
import p247u3.C65073j;
import p247u3.C65078l1;
import p247u3.C65081m1;
import p247u3.C65097o0;
import p247u3.C65121p1;
import p247u3.C65145q1;
import rx3.C13598b0;
import rx3.C13603j;
import sx3.C64186f0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.sns_compose.page.s */
public final class C57589s extends C39622i0 {

    /* renamed from: d */
    public LifecycleScope f164904d;

    /* renamed from: e */
    public final C58087u0<List<C57573j>> f164905e;

    /* renamed from: f */
    public final C45252f<C65081m1<C99474g>> f164906f;

    /* renamed from: com.tencent.mm.sns_compose.page.s$a */
    public static final class C57590a extends C87413o implements C32224a<C65145q1<Long, C99474g>> {

        /* renamed from: d */
        public static final C57590a f164907d = new C57590a();

        public C57590a() {
            super(0);
        }

        public Object invoke() {
            return new C57586q();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.page.WithTaViewModel$lazyData$2", mo125469f = "WithTaViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.sns_compose.page.s$b */
    public static final class C57591b extends C91594j implements C32228q<C65081m1<C99474g>, List<? extends C57573j>, C15601d<? super C65081m1<C99474g>>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f164908d;

        /* renamed from: e */
        public /* synthetic */ Object f164909e;

        /* renamed from: f */
        public final /* synthetic */ C57589s f164910f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57591b(C57589s sVar, C15601d<? super C57591b> dVar) {
            super(3, dVar);
            this.f164910f = sVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C57591b bVar = new C57591b(this.f164910f, (C15601d) obj3);
            bVar.f164908d = (C65081m1) obj;
            bVar.f164909e = (List) obj2;
            return bVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C65081m1 m1Var = (C65081m1) this.f164908d;
            C57589s sVar = this.f164910f;
            for (C57573j jVar : (List) this.f164909e) {
                sVar.getClass();
                if (jVar instanceof C57573j.C57574a) {
                    C57588r rVar = new C57588r(jVar, (C15601d<? super C57588r>) null);
                    C87412m.m108594g(m1Var, "$this$filter");
                    m1Var = new C65081m1(new C65121p1(m1Var.f187314a, rVar), m1Var.f187315b);
                } else {
                    throw new C13603j();
                }
            }
            return m1Var;
        }
    }

    public C57589s() {
        C58087u0<List<C57573j>> a = C58056k1.m67214a(C64186f0.f181907d);
        this.f164905e = a;
        C65078l1 l1Var = new C65078l1(40, 0, false, 40, 0, 0, 54, (C8480h) null);
        C57590a aVar = C57590a.f164907d;
        C87412m.m108594g(aVar, "pagingSourceFactory");
        this.f164906f = new C45254q0(C65073j.m76697a(new C65097o0(aVar instanceof C14111b2 ? new C14117j1(aVar) : new C14119k1(aVar, (C15601d) null), null, l1Var, (C37336s1) null).f187369c, C54208j0.m60899a(this)), a, new C57591b(this, (C15601d<? super C57591b>) null));
    }
}
