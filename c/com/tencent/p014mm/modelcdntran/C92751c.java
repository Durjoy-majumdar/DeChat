package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import com.tencent.p014mm.modelcdntran.C92738a;
import com.tencent.p014mm.modelcdntran.C92798v;
import d14.C58085t0;
import fy3.C32227p;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC$onAccountInit$1$1", mo125469f = "CdnFSC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.c */
public final class C92751c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C92798v f266964d;

    /* renamed from: e */
    public final /* synthetic */ C92738a f266965e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92751c(C92798v vVar, C92738a aVar, C15601d<? super C92751c> dVar) {
        super(2, dVar);
        this.f266964d = vVar;
        this.f266965e = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92751c(this.f266964d, this.f266965e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92751c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C58085t0<C92798v> t0Var;
        C58085t0<C92798v> t0Var2;
        ResultKt.throwOnFailure(obj);
        int ordinal = this.f266964d.f267130a.ordinal();
        C92738a.C92739a aVar = null;
        if (ordinal == 0 || ordinal == 1 || ordinal == 3) {
            C92798v vVar = this.f266964d;
            C92798v.C92799a aVar2 = vVar.f267130a;
            if (aVar2 == C92798v.C92799a.OnDownloadCallbackProgress || aVar2 == C92798v.C92799a.OnDownloadCallbackFindLocal) {
                ConcurrentHashMap<String, C92738a.C92739a> concurrentHashMap = this.f266965e.f266933h;
                if (concurrentHashMap != null) {
                    aVar = concurrentHashMap.get(vVar.f267131b);
                }
            } else {
                ConcurrentHashMap<String, C92738a.C92739a> concurrentHashMap2 = this.f266965e.f266933h;
                if (concurrentHashMap2 != null) {
                    aVar = concurrentHashMap2.remove(vVar.f267131b);
                }
            }
            if (!(aVar == null || (t0Var = aVar.f266936b) == null)) {
                C92738a aVar3 = this.f266965e;
                C92798v vVar2 = this.f266964d;
                vVar2.f267133d = aVar.f266935a;
                C13598b0 b0Var = C13598b0.f38549a;
                aVar3.mo126973k3(t0Var, vVar2);
            }
        } else if (ordinal == 4 || ordinal == 5 || ordinal == 6) {
            C92798v vVar3 = this.f266964d;
            if (vVar3.f267130a == C92798v.C92799a.OnUploadCallbackProgress) {
                ConcurrentHashMap<String, C92738a.C92739a> concurrentHashMap3 = this.f266965e.f266934i;
                if (concurrentHashMap3 != null) {
                    aVar = concurrentHashMap3.get(vVar3.f267131b);
                }
            } else {
                ConcurrentHashMap<String, C92738a.C92739a> concurrentHashMap4 = this.f266965e.f266934i;
                if (concurrentHashMap4 != null) {
                    aVar = concurrentHashMap4.remove(vVar3.f267131b);
                }
            }
            if (!(aVar == null || (t0Var2 = aVar.f266936b) == null)) {
                C92738a aVar4 = this.f266965e;
                C92798v vVar4 = this.f266964d;
                vVar4.f267133d = aVar.f266935a;
                C13598b0 b0Var2 = C13598b0.f38549a;
                aVar4.mo126973k3(t0Var2, vVar4);
            }
        }
        return C13598b0.f38549a;
    }
}
