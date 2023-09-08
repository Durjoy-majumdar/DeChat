package com.tencent.p014mm.plugin.finder.feed.model;

import a14.C0000n0;
import a14.C53895h;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import bo1.C0343f;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C7972g;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import i31.C117134d;
import it1.C60625c;
import je1.C46511c0;
import kotlin.ResultKt;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50294lp0;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$FeedShareRelDataFetcher$fetch$1$1", mo125469f = "FinderFeedShareRelativeListLoader.kt", mo125470l = {325, 326}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.feed.model.y */
public final class C2823y extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f14089d;

    /* renamed from: e */
    public /* synthetic */ Object f14090e;

    /* renamed from: f */
    public final /* synthetic */ FinderFeedShareRelativeListLoader.C2668b f14091f;

    /* renamed from: g */
    public final /* synthetic */ C14121l f14092g;

    /* renamed from: h */
    public final /* synthetic */ Object f14093h;

    /* renamed from: i */
    public final /* synthetic */ C13910j<C0740i2> f14094i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$FeedShareRelDataFetcher$fetch$1$1$1", mo125469f = "FinderFeedShareRelativeListLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.y$a */
    public static final class C2824a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedShareRelativeListLoader.C2668b f14095d;

        /* renamed from: e */
        public final /* synthetic */ C89132b.C89134c<C50294lp0> f14096e;

        /* renamed from: f */
        public final /* synthetic */ Object f14097f;

        /* renamed from: g */
        public final /* synthetic */ C13910j<C0740i2> f14098g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2824a(FinderFeedShareRelativeListLoader.C2668b bVar, C89132b.C89134c<C50294lp0> cVar, Object obj, C13910j<C0740i2> jVar, C15601d<? super C2824a> dVar) {
            super(2, dVar);
            this.f14095d = bVar;
            this.f14096e = cVar;
            this.f14097f = obj;
            this.f14098g = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C2824a(this.f14095d, this.f14096e, this.f14097f, this.f14098g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C2824a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderFeedShareRelativeListLoader.C2668b bVar = this.f14095d;
            C89132b.C89134c<C50294lp0> cVar = this.f14096e;
            IResponse<C0740i2> b = bVar.mo2700b(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C89132b) this.f14097f, cVar.f256796d);
            if (b != null) {
                this.f14098g.onFetchDone(b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.y$b */
    public static final class C2825b extends C87413o implements C32224a<C60625c<C50294lp0>> {

        /* renamed from: d */
        public final /* synthetic */ Object f14099d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedShareRelativeListLoader.C2668b f14100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2825b(Object obj, FinderFeedShareRelativeListLoader.C2668b bVar) {
            super(0);
            this.f14099d = obj;
            this.f14100e = bVar;
        }

        public Object invoke() {
            Object obj = this.f14099d;
            ((C46511c0) obj).f29698i = this.f14100e.f39057d;
            return (C60625c) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2823y(FinderFeedShareRelativeListLoader.C2668b bVar, C14121l lVar, Object obj, C13910j<C0740i2> jVar, C15601d<? super C2823y> dVar) {
        super(2, dVar);
        this.f14091f = bVar;
        this.f14092g = lVar;
        this.f14093h = obj;
        this.f14094i = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C2823y yVar = new C2823y(this.f14091f, this.f14092g, this.f14093h, this.f14094i, dVar);
        yVar.f14090e = obj;
        return yVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C2823y) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C65234n nVar = C65234n.OK;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f14089d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f14090e;
            Log.m105924i(this.f14091f.getTAG(), "start request");
            C2825b bVar = new C2825b(this.f14093h, this.f14091f);
            C66212f coroutineContext = n0Var.getCoroutineContext();
            int i2 = C53973z1.f151221b0;
            C0343f fVar = new C0343f(bVar, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null);
            this.f14089d = 1;
            obj = C117134d.m165173h(fVar, false, this, 1, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            try {
                ResultKt.throwOnFailure(obj);
                this.f14092g.mo11853b(nVar);
                return C13598b0.f38549a;
            } catch (Throwable th) {
                this.f14092g.mo11853b(nVar);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderFeedShareRelativeListLoader.C2668b bVar2 = this.f14091f;
        C66212f fVar2 = ((C7972g) bVar2.f39059f).f26652d;
        C2824a aVar2 = new C2824a(bVar2, (C89132b.C89134c) obj, this.f14093h, this.f14094i, (C15601d<? super C2824a>) null);
        this.f14089d = 2;
        if (C53895h.m60469g(fVar2, aVar2, this) == aVar) {
            return aVar;
        }
        this.f14092g.mo11853b(nVar);
        return C13598b0.f38549a;
    }
}
