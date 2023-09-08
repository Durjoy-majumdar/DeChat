package ke1;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i31.C117134d;
import java.util.ArrayList;
import java.util.List;
import je1.C9342n1;
import je1.C9360p1;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.ResultKt;
import le1.C10488a;
import le1.C10489b;
import le1.C10491c;
import le1.C10495g;
import me1.C117551b;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.cgi.fetcher.FinderTimelineFeedFetcher$innerFetch$1", mo125469f = "FinderTimelineFeedFetcher.kt", mo125470l = {368}, mo125471m = "invokeSuspend")
/* renamed from: ke1.w */
public final class C9608w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f29894d;

    /* renamed from: e */
    public /* synthetic */ Object f29895e;

    /* renamed from: f */
    public final /* synthetic */ C9610x f29896f;

    /* renamed from: g */
    public final /* synthetic */ int f29897g;

    /* renamed from: h */
    public final /* synthetic */ C89349b f29898h;

    /* renamed from: i */
    public final /* synthetic */ List<BaseFinderFeed> f29899i;

    /* renamed from: j */
    public final /* synthetic */ boolean f29900j;

    /* renamed from: n */
    public final /* synthetic */ C9360p1.C9362b f29901n;

    /* renamed from: o */
    public final /* synthetic */ boolean f29902o;

    /* renamed from: p */
    public final /* synthetic */ C9360p1.C9361a f29903p;

    /* renamed from: ke1.w$a */
    public static final class C9609a extends C87413o implements C32224a<C9342n1> {

        /* renamed from: d */
        public final /* synthetic */ C9610x f29904d;

        /* renamed from: e */
        public final /* synthetic */ int f29905e;

        /* renamed from: f */
        public final /* synthetic */ C89349b f29906f;

        /* renamed from: g */
        public final /* synthetic */ List<BaseFinderFeed> f29907g;

        /* renamed from: h */
        public final /* synthetic */ boolean f29908h;

        /* renamed from: i */
        public final /* synthetic */ C9360p1.C9362b f29909i;

        /* renamed from: j */
        public final /* synthetic */ boolean f29910j;

        /* renamed from: n */
        public final /* synthetic */ C9360p1.C9361a f29911n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9609a(C9610x xVar, int i, C89349b bVar, List<? extends BaseFinderFeed> list, boolean z, C9360p1.C9362b bVar2, boolean z2, C9360p1.C9361a aVar) {
            super(0);
            this.f29904d = xVar;
            this.f29905e = i;
            this.f29906f = bVar;
            this.f29907g = list;
            this.f29908h = z;
            this.f29909i = bVar2;
            this.f29910j = z2;
            this.f29911n = aVar;
        }

        public Object invoke() {
            ArrayList arrayList;
            boolean z;
            C9610x xVar = this.f29904d;
            int i = xVar.f29912g;
            int i2 = this.f29905e;
            C89349b bVar = this.f29906f;
            C49712hj1 hj12 = xVar.f29913h;
            List<BaseFinderFeed> list = this.f29907g;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
                for (BaseFinderFeed o : list) {
                    arrayList2.add(o.mo3513o().getFeedObject());
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            C9610x xVar2 = this.f29904d;
            boolean z2 = xVar2.f29920r.f34377j;
            boolean z3 = this.f29908h;
            int i3 = xVar2.f29917o;
            if (this.f29905e == 0) {
                C9603s sVar = xVar2.f29914i;
                if (sVar != null && sVar.f29879l) {
                    z = true;
                    C9342n1 n1Var = new C9342n1(i, i2, bVar, hj12, arrayList, false, z2, z3, i3, z);
                    C9610x xVar3 = this.f29904d;
                    C9360p1.C9362b bVar2 = this.f29909i;
                    int i4 = this.f29905e;
                    boolean z4 = this.f29910j;
                    C9360p1.C9361a aVar = this.f29911n;
                    n1Var.mo10081d(new C10488a(), 0);
                    n1Var.mo10081d(new C10495g(), 1);
                    n1Var.mo10081d(new C10491c(), 2);
                    n1Var.mo10081d(new C10489b(), 3);
                    C46566c<C9486a> cVar = xVar3.f29915j;
                    C87412m.m108594g(cVar, "keeper");
                    n1Var.f29192s = cVar;
                    n1Var.f29190q = new C9605u(xVar3, bVar2, i4, n1Var);
                    n1Var.f29189p = new C9606v(i4, n1Var, xVar3, z4, aVar);
                    return n1Var;
                }
            }
            z = false;
            C9342n1 n1Var2 = new C9342n1(i, i2, bVar, hj12, arrayList, false, z2, z3, i3, z);
            C9610x xVar32 = this.f29904d;
            C9360p1.C9362b bVar22 = this.f29909i;
            int i44 = this.f29905e;
            boolean z44 = this.f29910j;
            C9360p1.C9361a aVar2 = this.f29911n;
            n1Var2.mo10081d(new C10488a(), 0);
            n1Var2.mo10081d(new C10495g(), 1);
            n1Var2.mo10081d(new C10491c(), 2);
            n1Var2.mo10081d(new C10489b(), 3);
            C46566c<C9486a> cVar2 = xVar32.f29915j;
            C87412m.m108594g(cVar2, "keeper");
            n1Var2.f29192s = cVar2;
            n1Var2.f29190q = new C9605u(xVar32, bVar22, i44, n1Var2);
            n1Var2.f29189p = new C9606v(i44, n1Var2, xVar32, z44, aVar2);
            return n1Var2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9608w(C9610x xVar, int i, C89349b bVar, List<? extends BaseFinderFeed> list, boolean z, C9360p1.C9362b bVar2, boolean z2, C9360p1.C9361a aVar, C15601d<? super C9608w> dVar) {
        super(2, dVar);
        this.f29896f = xVar;
        this.f29897g = i;
        this.f29898h = bVar;
        this.f29899i = list;
        this.f29900j = z;
        this.f29901n = bVar2;
        this.f29902o = z2;
        this.f29903p = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C9608w wVar = new C9608w(this.f29896f, this.f29897g, this.f29898h, this.f29899i, this.f29900j, this.f29901n, this.f29902o, this.f29903p, dVar);
        wVar.f29895e = obj;
        return wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9608w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f29894d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C9609a aVar2 = new C9609a(this.f29896f, this.f29897g, this.f29898h, this.f29899i, this.f29900j, this.f29901n, this.f29902o, this.f29903p);
            this.f29896f.f29922t = this.f29897g;
            this.f29896f.f29921s = true;
            C66212f coroutineContext = ((C0000n0) this.f29895e).getCoroutineContext();
            int i2 = C53973z1.f151221b0;
            C117551b bVar = new C117551b(aVar2, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null, 4, (C8480h) null);
            this.f29894d = 1;
            obj = C117134d.m165173h(bVar, false, this, 1, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C9342n1.C9346d dVar = (C9342n1.C9346d) obj;
        this.f29896f.f29921s = false;
        return C13598b0.f38549a;
    }
}
