package vt2;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53895h;
import a14.C53921m;
import b14.C54393b;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.improve.repository.SnsInfoImproveOnlineRepository;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveOverScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import vt2.C102279c;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yn2.C102882s0;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1", mo125469f = "ImproveDataUIC.kt", mo125470l = {246}, mo125471m = "invokeSuspend")
/* renamed from: vt2.g */
public final class C102287g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f301262d;

    /* renamed from: e */
    public final /* synthetic */ C102279c f301263e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1", mo125469f = "ImproveDataUIC.kt", mo125470l = {247}, mo125471m = "invokeSuspend")
    /* renamed from: vt2.g$a */
    public static final class C102288a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f301264d;

        /* renamed from: e */
        public final /* synthetic */ C102279c f301265e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1", mo125469f = "ImproveDataUIC.kt", mo125470l = {248}, mo125471m = "invokeSuspend")
        /* renamed from: vt2.g$a$a */
        public static final class C102289a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f301266d;

            /* renamed from: e */
            public final /* synthetic */ C102279c f301267e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102289a(C102279c cVar, C15601d<? super C102289a> dVar) {
                super(2, dVar);
                this.f301267e = cVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                C102289a aVar = new C102289a(this.f301267e, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                Object invokeSuspend = ((C102289a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f301266d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C102279c cVar = this.f301267e;
                    C102279c.C102281b bVar = C102279c.f301242j;
                    SnsMethodCalculate.markStartTimeMs("access$getOnlineRepository$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
                    SnsInfoImproveOnlineRepository snsInfoImproveOnlineRepository = cVar.f301247f;
                    SnsMethodCalculate.markEndTimeMs("access$getOnlineRepository$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
                    this.f301266d = 1;
                    snsInfoImproveOnlineRepository.getClass();
                    SnsMethodCalculate.markStartTimeMs("doFirstPageRequest", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    Log.m105924i("MicroMsg.Improve.DataFlow", "doFirstPageRequest");
                    SnsMethodCalculate.markStartTimeMs("access$setRefreshContinuation$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
                    snsInfoImproveOnlineRepository.f279831f = mVar;
                    SnsMethodCalculate.markEndTimeMs("access$setRefreshContinuation$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
                    SnsMethodCalculate.markStartTimeMs("access$getServer$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
                    C5431p1.C5432a aVar2 = snsInfoImproveOnlineRepository.f279830e;
                    SnsMethodCalculate.markEndTimeMs("access$getServer$p", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
                    aVar2.mo6413d(1, "", false, false, 0);
                    obj = mVar.mo74608o();
                    SnsMethodCalculate.markEndTimeMs("doFirstPageRequest", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
                    if (obj == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                    throw illegalStateException;
                }
                int intValue = ((Number) obj).intValue();
                Log.m105924i("MicroMsg.Improve.DataUIC", "refresh net result count:" + intValue);
                this.f301267e.mo141841d3().mo129609m();
                C102882s0.f303681a.mo142591c();
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102288a(C102279c cVar, C15601d<? super C102288a> dVar) {
            super(2, dVar);
            this.f301265e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            C102288a aVar = new C102288a(this.f301265e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            Object invokeSuspend = ((C102288a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f301264d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C102289a aVar2 = new C102289a(this.f301265e, (C15601d<? super C102289a>) null);
                this.f301264d = 1;
                obj = C53860b3.m60375c(30000, aVar2, this);
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
                throw illegalStateException;
            }
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1$1");
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102287g(C102279c cVar, C15601d<? super C102287g> dVar) {
        super(2, dVar);
        this.f301263e = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        C102287g gVar = new C102287g(this.f301263e, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        Object invokeSuspend = ((C102287g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f301262d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105918d("MicroMsg.Improve.DataUIC", "refreshJob: ready");
            C102279c cVar = this.f301263e;
            C102279c.C102281b bVar = C102279c.f301242j;
            SnsMethodCalculate.markStartTimeMs("access$getDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            C54393b dispatcher = cVar.getDispatcher();
            SnsMethodCalculate.markEndTimeMs("access$getDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            C102288a aVar2 = new C102288a(this.f301263e, (C15601d<? super C102288a>) null);
            this.f301262d = 1;
            if (C53895h.m60469g(dispatcher, aVar2, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
            throw illegalStateException;
        }
        Log.m105924i("MicroMsg.Improve.DataUIC", "hideTopLoadingView");
        C102279c cVar2 = this.f301263e;
        C102279c.C102281b bVar2 = C102279c.f301242j;
        SnsMethodCalculate.markStartTimeMs("access$getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        ImproveOverScrollView overScrollView = cVar2.getOverScrollView();
        SnsMethodCalculate.markEndTimeMs("access$getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        overScrollView.mo133378b();
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        return b0Var;
    }
}
