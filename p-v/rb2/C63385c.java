package rb2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.ResultKt;
import rb2.C63380a;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C110818d0;
import u23.C65003a;
import ux3.C65486b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.thumb.ThumbCachedLoader$enqueue$1", mo125469f = "ThumbCachedLoader.kt", mo125470l = {87, 92}, mo125471m = "invokeSuspend")
/* renamed from: rb2.c */
public final class C63385c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f179798d;

    /* renamed from: e */
    public final /* synthetic */ C63380a.C63381a f179799e;

    /* renamed from: f */
    public final /* synthetic */ C65003a f179800f;

    /* renamed from: g */
    public final /* synthetic */ C63380a f179801g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.thumb.ThumbCachedLoader$enqueue$1$1", mo125469f = "ThumbCachedLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: rb2.c$a */
    public static final class C63386a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63380a.C63381a f179802d;

        /* renamed from: e */
        public final /* synthetic */ C63380a f179803e;

        /* renamed from: f */
        public final /* synthetic */ C65003a f179804f;

        /* renamed from: g */
        public final /* synthetic */ List<Long> f179805g;

        /* renamed from: rb2.c$a$a */
        public static final class C63387a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63380a f179806d;

            /* renamed from: e */
            public final /* synthetic */ C63380a.C63381a f179807e;

            /* renamed from: f */
            public final /* synthetic */ C65003a f179808f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63387a(C63380a aVar, C63380a.C63381a aVar2, C65003a aVar3) {
                super(2);
                this.f179806d = aVar;
                this.f179807e = aVar2;
                this.f179808f = aVar3;
            }

            public Object invoke(Object obj, Object obj2) {
                C63380a aVar = this.f179806d;
                C0000n0 n0Var = aVar.f179782c;
                C0000n0 n0Var2 = n0Var;
                C53895h.m60466d(n0Var2, (C66212f) null, (C53934p0) null, new C63384b(this.f179807e, ((Number) obj).longValue(), this.f179808f, (Bitmap) obj2, aVar, (C15601d<? super C63384b>) null), 3, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63386a(C63380a.C63381a aVar, C63380a aVar2, C65003a aVar3, List<Long> list, C15601d<? super C63386a> dVar) {
            super(2, dVar);
            this.f179802d = aVar;
            this.f179803e = aVar2;
            this.f179804f = aVar3;
            this.f179805g = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63386a(this.f179802d, this.f179803e, this.f179804f, this.f179805g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63386a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C36777d dVar = this.f179802d.f179784a;
            if (dVar == null) {
                dVar = this.f179803e.f179780a.mo86877a(this.f179804f, (Object) null);
                this.f179802d.f179784a = dVar;
            }
            if (!C53930o0.m60560g(this.f179803e.f179782c)) {
                dVar.destroy();
            }
            C65003a aVar = this.f179804f;
            dVar.mo58663C(aVar.f187121a, aVar.f187122b);
            dVar.mo58665b(this.f179805g, new C63387a(this.f179803e, this.f179802d, this.f179804f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rb2.c$b */
    public static final class C63388b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((Number) t).longValue()), Long.valueOf(((Number) t2).longValue()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63385c(C63380a.C63381a aVar, C65003a aVar2, C63380a aVar3, C15601d<? super C63385c> dVar) {
        super(2, dVar);
        this.f179799e = aVar;
        this.f179800f = aVar2;
        this.f179801g = aVar3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63385c(this.f179799e, this.f179800f, this.f179801g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63385c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f179798d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f179798d = 1;
            if (C53965x0.m60607b(50, this) == aVar) {
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
        List<T> o0 = C110818d0.m150943o0(C110818d0.m150953y0(this.f179799e.f179785b), new C63388b());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f179800f);
        sb.append(" request ");
        Object[] array = o0.toArray(new Long[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String arrays = Arrays.toString(array);
        C87412m.m108593f(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", size:[");
        sb.append(this.f179800f.f187121a);
        sb.append(',');
        sb.append(this.f179800f.f187122b);
        sb.append(']');
        Log.m105924i("MicroMsg.ThumbCachedLoader", sb.toString());
        this.f179799e.f179786c.addAll(o0);
        this.f179799e.f179785b.clear();
        C53896h0 h0Var = C53872d1.f151119c;
        C63386a aVar2 = new C63386a(this.f179799e, this.f179801g, this.f179800f, o0, (C15601d<? super C63386a>) null);
        this.f179798d = 2;
        if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
