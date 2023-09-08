package com.tencent.p014mm.pluginsdk.model;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19636w0;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C118459qf;
import te3.C118474vf;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$checkLiveRedDotNotify$1", mo125469f = "BizFinderLiveLogic.kt", mo125470l = {884}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.pluginsdk.model.f */
public final class C19443f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f54904d;

    /* renamed from: e */
    public final /* synthetic */ String f54905e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19443f(String str, C15601d<? super C19443f> dVar) {
        super(2, dVar);
        this.f54905e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C19443f(this.f54905e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C19443f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f54904d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C19428d dVar = C19428d.f54856a;
            if (C19428d.f54854A || !dVar.mo25165R(this.f54905e)) {
                Log.m105918d("MicroMsg.BizFinderLiveLogic", "checkLiveRedDotNotify return");
                return C13598b0.f38549a;
            }
            C19428d.f54854A = true;
            Log.m105918d("MicroMsg.BizFinderLiveLogic", "checkLiveRedDotNotify");
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.f54905e);
            C13598b0 b0Var = C13598b0.f38549a;
            this.f54904d = 1;
            obj = dVar.mo25171e(7, linkedList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C118474vf vfVar = (C118474vf) obj;
        C19428d dVar2 = C19428d.f54856a;
        C19428d.f54854A = false;
        LinkedList<C118459qf> linkedList2 = vfVar != null ? vfVar.f354494d : null;
        if (linkedList2 == null) {
            return C13598b0.f38549a;
        }
        for (C118459qf qfVar : linkedList2) {
            if (Util.isNullOrNil(qfVar.f354271e)) {
                Log.m105924i("MicroMsg.BizFinderLiveLogic", "checkLiveRedDotNotify live stop!");
                C19428d dVar3 = C19428d.f54856a;
                dVar3.mo25159L(qfVar);
                dVar3.mo25158K(qfVar.f354270d);
                dVar3.mo25157J();
                dVar3.mo25166T();
                C19636w0.m21161c();
            } else {
                C19428d.f54856a.mo25159L(qfVar);
                C19428d.f54879x = qfVar.f354275i;
            }
        }
        return C13598b0.f38549a;
    }
}
