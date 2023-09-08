package yt2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1", mo125469f = "ImproveToolBarUIC.kt", mo125470l = {156}, mo125471m = "invokeSuspend")
/* renamed from: yt2.g */
public final class C39166g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f105400d;

    /* renamed from: e */
    public final /* synthetic */ C53578f f105401e;

    /* renamed from: yt2.g$a */
    public static final class C39167a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C39167a f105402d = new C39167a();

        public C39167a() {
            super(1);
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1$1");
            ((Boolean) obj).booleanValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1$1");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39166g(C53578f fVar, C15601d<? super C39166g> dVar) {
        super(2, dVar);
        this.f105401e = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        C39166g gVar = new C39166g(this.f105401e, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        Object invokeSuspend = ((C39166g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f105400d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C39160b bVar = (C39160b) C53578f.m60109d3(this.f105401e).get(new Integer(C53572c.ALBUM.mo74217a()));
            if (bVar != null) {
                C39167a aVar2 = C39167a.f105402d;
                this.f105400d = 1;
                if (bVar.mo61965b(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
            throw illegalStateException;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$postMediaContent$1");
        return b0Var;
    }
}
