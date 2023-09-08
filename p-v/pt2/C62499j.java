package pt2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import da0.C58247e;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import pt2.C62497i;
import rx3.C13598b0;
import te3.pr4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1", mo125469f = "ThirdAppJumpHelper.kt", mo125470l = {56}, mo125471m = "invokeSuspend")
/* renamed from: pt2.j */
public final class C62499j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f177539d;

    /* renamed from: e */
    public final /* synthetic */ C62497i.C62498a f177540e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<pr4, C13598b0> f177541f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62499j(C62497i.C62498a aVar, C32226l<? super pr4, C13598b0> lVar, C15601d<? super C62499j> dVar) {
        super(2, dVar);
        this.f177540e = aVar;
        this.f177541f = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        C62499j jVar = new C62499j(this.f177540e, this.f177541f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        return jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        Object invokeSuspend = ((C62499j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f177539d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C62497i.C62498a aVar2 = this.f177540e;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            String str = aVar2.f177537a;
            SnsMethodCalculate.markEndTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            this.f177539d = 1;
            obj = ((C58247e) C86312j.m106911c(C58247e.class)).mo82984Yu(str, false, this);
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
            throw illegalStateException;
        }
        this.f177541f.invoke((pr4) obj);
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        return b0Var;
    }
}
