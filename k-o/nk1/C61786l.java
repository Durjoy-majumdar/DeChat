package nk1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k14.C60942d;
import k14.C99088c;
import kotlin.ResultKt;
import nk1.C61788m;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.util.GiftQueueImpl$putOvertimeCache$1", mo125469f = "GiftQueueImpl.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
/* renamed from: nk1.l */
public final class C61786l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f175661d;

    /* renamed from: e */
    public final /* synthetic */ C61781k f175662e;

    /* renamed from: f */
    public final /* synthetic */ C61788m.C11210d f175663f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.util.GiftQueueImpl$putOvertimeCache$1$1", mo125469f = "GiftQueueImpl.kt", mo125470l = {338}, mo125471m = "invokeSuspend")
    /* renamed from: nk1.l$a */
    public static final class C61787a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f175664d;

        /* renamed from: e */
        public Object f175665e;

        /* renamed from: f */
        public Object f175666f;

        /* renamed from: g */
        public int f175667g;

        /* renamed from: h */
        public final /* synthetic */ C61781k f175668h;

        /* renamed from: i */
        public final /* synthetic */ C61788m.C11210d f175669i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61787a(C61781k kVar, C61788m.C11210d dVar, C15601d<? super C61787a> dVar2) {
            super(2, dVar2);
            this.f175668h = kVar;
            this.f175669i = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61787a(this.f175668h, this.f175669i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61787a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C99088c cVar;
            C61781k kVar;
            C61788m.C11210d dVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175667g;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kVar = this.f175668h;
                C99088c cVar2 = kVar.f175641h;
                C61788m.C11210d dVar2 = this.f175669i;
                this.f175664d = cVar2;
                this.f175665e = kVar;
                this.f175666f = dVar2;
                this.f175667g = 1;
                C60942d dVar3 = (C60942d) cVar2;
                if (dVar3.mo85908b((Object) null, this) == aVar) {
                    return aVar;
                }
                dVar = dVar2;
                cVar = dVar3;
            } else if (i == 1) {
                dVar = (C61788m.C11210d) this.f175666f;
                kVar = (C61781k) this.f175665e;
                cVar = (C99088c) this.f175664d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                if (kVar.f175640g.size() > 1000) {
                    Iterator it = ((LinkedHashMap) kVar.f175640g).entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (System.currentTimeMillis() - ((C61788m.C11210d) entry.getValue()).f33064b > 60000) {
                            it.remove();
                            String str = kVar.f175642i;
                            Log.m105924i(str, "#putOvertimeCache remove comboid=" + ((C61788m.C11210d) entry.getValue()).f33063a + " fromNickName=" + ((C61788m.C11210d) entry.getValue()).f33065c);
                        }
                    }
                }
                String str2 = kVar.f175642i;
                Log.m105924i(str2, "#putOvertimeCache comboid=" + dVar.f33063a + " fromNickName=" + dVar.f33065c);
                if (dVar.f33063a.length() > 0) {
                    if (dVar.f33065c.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        kVar.f175640g.put(dVar.f33063a, dVar);
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
                cVar.mo85909c((Object) null);
                return C13598b0.f38549a;
            } catch (Throwable th) {
                cVar.mo85909c((Object) null);
                throw th;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61786l(C61781k kVar, C61788m.C11210d dVar, C15601d<? super C61786l> dVar2) {
        super(2, dVar2);
        this.f175662e = kVar;
        this.f175663f = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61786l(this.f175662e, this.f175663f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61786l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f175661d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53896h0 h0Var = C53872d1.f151119c;
            C61787a aVar2 = new C61787a(this.f175662e, this.f175663f, (C15601d<? super C61787a>) null);
            this.f175661d = 1;
            if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
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
