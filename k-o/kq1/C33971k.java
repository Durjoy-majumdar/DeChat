package kq1;

import a14.C0000n0;
import a14.C53934p0;
import bl3.C0317e;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$checkBeforeSave$1", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {110}, mo125471m = "invokeSuspend")
/* renamed from: kq1.k */
public final class C33971k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f91724d;

    /* renamed from: e */
    public int f91725e;

    /* renamed from: f */
    public final /* synthetic */ C61137l f91726f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f91727g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$checkBeforeSave$1$1", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: kq1.k$a */
    public static final class C33972a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f91728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33972a(C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C33972a> dVar) {
            super(2, dVar);
            this.f91728d = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C33972a(this.f91728d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C33972a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f91728d.invoke(Boolean.TRUE);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33971k(C61137l lVar, C32226l<? super Boolean, C13598b0> lVar2, C15601d<? super C33971k> dVar) {
        super(2, dVar);
        this.f91726f = lVar;
        this.f91727g = lVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C33971k(this.f91726f, this.f91727g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C33971k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C61137l lVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f91725e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("Finder.PostSafePreCheckUIC", "checkBeforeSave, wait for watermark detect result");
            C61137l lVar2 = this.f91726f;
            this.f91724d = lVar2;
            this.f91725e = 1;
            Object j3 = C61137l.m71704j3(lVar2, this);
            if (j3 == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = j3;
        } else if (i == 1) {
            lVar = (C61137l) this.f91724d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lVar.f174051e = ((Number) obj).intValue();
        Log.m105924i("Finder.PostSafePreCheckUIC", "checkBeforeSave, receive watermark detect result, " + this.f91726f.f174051e);
        C0317e.launchUI$default(this.f91726f, (C66212f) null, (C53934p0) null, new C33972a(this.f91727g, (C15601d<? super C33972a>) null), 3, (Object) null);
        return C13598b0.f38549a;
    }
}
