package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import com.tencent.p014mm.modelcdntran.C92738a;
import com.tencent.p014mm.modelcdntran.C92798v;
import d14.C58085t0;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC$cancelUploadTask$1", mo125469f = "CdnFSC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.b */
public final class C92748b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f266960d;

    /* renamed from: e */
    public final /* synthetic */ C92738a f266961e;

    /* renamed from: f */
    public final /* synthetic */ C58085t0<C92798v> f266962f;

    /* renamed from: g */
    public final /* synthetic */ String f266963g;

    /* renamed from: com.tencent.mm.modelcdntran.b$a */
    public /* synthetic */ class C92749a extends C24565l implements C32227p<String, C92738a.C92739a, Integer> {
        public C92749a(Object obj) {
            super(2, obj, C92738a.class, "doCancel", "doCancel(Ljava/lang/String;Lcom/tencent/mm/modelcdntran/CdnFSC$RunningObj;)I", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C92738a.C92739a aVar = (C92738a.C92739a) obj2;
            C87412m.m108594g(str, "p0");
            C87412m.m108594g(aVar, "p1");
            ((C92738a) this.receiver).mo126972j3(str, aVar);
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92748b(C92738a aVar, C58085t0<C92798v> t0Var, String str, C15601d<? super C92748b> dVar) {
        super(2, dVar);
        this.f266961e = aVar;
        this.f266962f = t0Var;
        this.f266963g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C92748b bVar = new C92748b(this.f266961e, this.f266962f, this.f266963g, dVar);
        bVar.f266960d = obj;
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92748b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C0000n0 n0Var = (C0000n0) this.f266960d;
        C92738a aVar = this.f266961e;
        ConcurrentHashMap<String, C92738a.C92739a> concurrentHashMap = aVar.f266934i;
        int i = -1;
        if (concurrentHashMap != null) {
            String str = this.f266963g;
            C92749a aVar2 = new C92749a(aVar);
            C92738a.C92739a remove = concurrentHashMap.remove(str);
            if (remove != null) {
                i = ((Number) aVar2.invoke(str, remove)).intValue();
            }
        }
        C92738a aVar3 = this.f266961e;
        C58085t0<C92798v> t0Var = this.f266962f;
        C92798v vVar = new C92798v(C92798v.C92799a.OnUploadCancel, this.f266963g);
        vVar.f267132c = i;
        C13598b0 b0Var = C13598b0.f38549a;
        aVar3.mo126973k3(t0Var, vVar);
        return C13598b0.f38549a;
    }
}
