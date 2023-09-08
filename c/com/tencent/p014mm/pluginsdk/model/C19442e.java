package com.tencent.p014mm.pluginsdk.model;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C118474vf;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$checkBizFinderLiveBar$1", mo125469f = "BizFinderLiveLogic.kt", mo125470l = {942}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.pluginsdk.model.e */
public final class C19442e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f54902d;

    /* renamed from: e */
    public int f54903e;

    public C19442e(C15601d<? super C19442e> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C19442e(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C19442e((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f54903e;
        int i2 = 10;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (C19428d.f54855B) {
                return C13598b0.f38549a;
            }
            C19428d.f54855B = true;
            C19428d dVar = C19428d.f54856a;
            dVar.mo25176k().encode("live_bar_list_last_refresh_time", System.currentTimeMillis());
            this.f54902d = 10;
            this.f54903e = 1;
            obj = dVar.mo25171e(10, (LinkedList<String>) null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            i2 = this.f54902d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C118474vf vfVar = (C118474vf) obj;
        if (vfVar != null) {
            C19428d dVar2 = C19428d.f54856a;
            dVar2.mo25163P(i2, vfVar.f354497g);
            dVar2.mo25162O(i2, vfVar.f354498h);
            dVar2.mo25164Q(vfVar);
        }
        Log.m105918d("MicroMsg.BizFinderLiveLogic", "checkBizFinderLiveBar");
        C19428d.f54855B = false;
        return C13598b0.f38549a;
    }
}
