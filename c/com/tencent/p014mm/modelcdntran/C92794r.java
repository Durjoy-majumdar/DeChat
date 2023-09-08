package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.modelcdntran.C92782j;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p1081gi.C98124g;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnMediaFSC$startDownloadTask$1", mo125469f = "CdnMediaFSC.kt", mo125470l = {102, 104}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.modelcdntran.r */
public final class C92794r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f267108d;

    /* renamed from: e */
    public final /* synthetic */ C92782j f267109e;

    /* renamed from: f */
    public final /* synthetic */ C98124g f267110f;

    /* renamed from: g */
    public final /* synthetic */ C55385t f267111g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92794r(C92782j jVar, C98124g gVar, C55385t tVar, C15601d<? super C92794r> dVar) {
        super(2, dVar);
        this.f267109e = jVar;
        this.f267110f = gVar;
        this.f267111g = tVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92794r(this.f267109e, this.f267110f, this.f267111g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92794r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f267108d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C92782j jVar = this.f267109e;
            String str = this.f267110f.field_mediaId;
            C87412m.m108593f(str, "taskInfo.field_mediaId");
            C92782j.C92783a aVar2 = new C92782j.C92783a(str, this.f267111g, this.f267110f);
            this.f267108d = 1;
            obj = C92782j.m116946g3(jVar, aVar2, this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("MicroMsg.CdnMediaFSC", "add task " + this.f267110f.field_mediaId + ", res:" + booleanValue + ", size:" + this.f267110f.field_totalLen + ", md5:" + this.f267110f.field_filemd5 + ", now task count:" + this.f267109e.mo127015m3().size());
        C92782j jVar2 = this.f267109e;
        this.f267108d = 2;
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) jVar2.f267062j).getValue(), (C53934p0) null, new C92790n(jVar2, (C15601d<? super C92790n>) null), 1, (Object) null);
        if (C13598b0.f38549a == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
