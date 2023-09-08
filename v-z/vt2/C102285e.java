package vt2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import java.util.List;
import java.util.ListIterator;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1", mo125469f = "ImproveDataUIC.kt", mo125470l = {290}, mo125471m = "invokeSuspend")
/* renamed from: vt2.e */
public final class C102285e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f301258d;

    /* renamed from: e */
    public final /* synthetic */ C102279c f301259e;

    /* renamed from: f */
    public final /* synthetic */ int f301260f;

    /* renamed from: vt2.e$a */
    public static final class C27700a extends C87413o implements C32226l<List<? extends C98799a>, C13604l<? extends C98214b, ? extends Integer>> {

        /* renamed from: B */
        public static final C27700a f76720B = new C27700a();

        public C27700a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C98214b bVar;
            Object obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1$pair$1");
            List list = (List) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1$pair$1");
            C87412m.m108594g(list, "list");
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                bVar = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (!((C98799a) obj2).mo138170b().isAd()) {
                    break;
                }
            }
            C98799a aVar = (C98799a) obj2;
            if (aVar != null) {
                bVar = aVar.mo138170b();
            }
            C13604l lVar = new C13604l(bVar, Integer.valueOf(list.size()));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1$pair$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1$pair$1");
            return lVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102285e(C102279c cVar, int i, C15601d<? super C102285e> dVar) {
        super(2, dVar);
        this.f301259e = cVar;
        this.f301260f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        C102285e eVar = new C102285e(this.f301259e, this.f301260f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        Object invokeSuspend = ((C102285e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f301258d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C102279c cVar = this.f301259e;
            C27700a aVar2 = C27700a.f76720B;
            this.f301258d = 1;
            obj = cVar.mo141840a(aVar2, this);
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
            throw illegalStateException;
        }
        C13604l lVar = (C13604l) obj;
        int intValue = ((Number) lVar.f38556e).intValue();
        Log.m105924i("MicroMsg.Improve.DataFlow", "loadMoreFromDB data size:" + intValue + " targetSize:" + this.f301260f);
        if (intValue < this.f301260f) {
            C98214b bVar = (C98214b) lVar.f38555d;
            this.f301259e.mo141841d3().mo129603e(bVar != null ? bVar.getStringSeq() : null, this.f301260f - intValue);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMoreFromDB$1");
        return b0Var;
    }
}
