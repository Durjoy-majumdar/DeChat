package on1;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import i31.C117134d;
import kotlin.ResultKt;
import on1.C11537n;
import on1.C11545o;
import on1.C11548q;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$refresh$1", mo125469f = "Loader.kt", mo125470l = {104}, mo125471m = "invokeSuspend")
/* renamed from: on1.v */
public final class C11570v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33945d;

    /* renamed from: e */
    public final /* synthetic */ C11548q<C0740i2> f33946e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$refresh$1$1$cost$1", mo125469f = "Loader.kt", mo125470l = {105, 109}, mo125471m = "invokeSuspend")
    /* renamed from: on1.v$a */
    public static final class C11571a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33947d;

        /* renamed from: e */
        public final /* synthetic */ C11548q<C0740i2> f33948e;

        /* renamed from: f */
        public final /* synthetic */ C11545o<C0740i2> f33949f;

        /* renamed from: on1.v$a$a */
        public static final class C11572a extends C87413o implements C32224a<C11545o<C0740i2>> {

            /* renamed from: d */
            public final /* synthetic */ C11545o<C0740i2> f33950d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11572a(C11545o<C0740i2> oVar) {
                super(0);
                this.f33950d = oVar;
            }

            public Object invoke() {
                return this.f33950d;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11571a(C11548q<C0740i2> qVar, C11545o<C0740i2> oVar, C15601d<? super C11571a> dVar) {
            super(1, dVar);
            this.f33948e = qVar;
            this.f33949f = oVar;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C11571a(this.f33948e, this.f33949f, dVar);
        }

        public Object invoke(Object obj) {
            return ((C11571a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33947d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11572a aVar2 = new C11572a(this.f33949f);
                C11548q<C0740i2> qVar = this.f33948e;
                C11548q.C11553c cVar = C11548q.f33884r;
                qVar.getClass();
                C11518e0 e0Var = new C11518e0(aVar2, (C53973z1) null, (C0125s) null, 2, (C8480h) null);
                this.f33947d = 1;
                obj = C117134d.m165173h(e0Var, false, this, 1, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11575y yVar = (C11575y) obj;
            boolean z = yVar instanceof C11507a;
            if (z) {
                C11545o<C0740i2> oVar = this.f33949f;
                C11509b bVar = oVar instanceof C11509b ? (C11509b) oVar : null;
                if (bVar != null) {
                    C11507a aVar3 = z ? (C11507a) yVar : null;
                    bVar.f33817d = aVar3 != null ? aVar3.f33807e : null;
                }
            }
            C11548q<C0740i2> qVar2 = this.f33948e;
            C11537n.C11543f fVar = new C11537n.C11543f(yVar, (C11545o.C11546a) null, 2, (C8480h) null);
            this.f33947d = 2;
            if (qVar2.mo11509l3(fVar, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11570v(C11548q<C0740i2> qVar, C15601d<? super C11570v> dVar) {
        super(2, dVar);
        this.f33946e = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11570v(this.f33946e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11570v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33945d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C11548q<C0740i2> qVar = this.f33946e;
            C11545o<T> oVar = qVar.f33890h;
            if (oVar != null) {
                C11571a aVar2 = new C11571a(qVar, oVar, (C15601d<? super C11571a>) null);
                this.f33945d = 1;
                obj = C11548q.m11359c3(qVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        Log.m105924i("Finder.NewLoader", "refresh cost:" + longValue);
        return C13598b0.f38549a;
    }
}
