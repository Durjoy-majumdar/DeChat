package gq3;

import a14.C0000n0;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import ig3.C60282d;
import java.util.ArrayList;
import kotlin.ResultKt;
import p157gk.C59491j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$applyNormalReq$1$2$emit$2", mo125469f = "ImageQueryViewModel.kt", mo125470l = {244}, mo125471m = "invokeSuspend")
/* renamed from: gq3.j */
public final class C59638j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f170440d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<QueryImageData> f170441e;

    /* renamed from: f */
    public final /* synthetic */ C59629h f170442f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59638j(ArrayList<QueryImageData> arrayList, C59629h hVar, C15601d<? super C59638j> dVar) {
        super(2, dVar);
        this.f170441e = arrayList;
        this.f170442f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59638j(this.f170441e, this.f170442f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59638j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170440d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f170441e.isEmpty()) {
                this.f170442f.f170402f.setValue(C59648q.STOP);
                int size = this.f170442f.f170410q.size();
                C59649r value = this.f170442f.f170408o.getValue();
                int size2 = C87412m.m108589b(value != null ? value.name() : null, "PERSON") ? this.f170442f.f170411r.size() : 0;
                Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + C59491j.f169996a + ", " + size2);
                if (!C59491j.f169996a) {
                    C60282d dVar = C60282d.f171857a;
                    C60282d.f171864h = size;
                    dVar.mo85267d(size2);
                    dVar.mo85266c(size > 0 ? 56 : 57);
                }
            } else {
                C59629h hVar = this.f170442f;
                ArrayList<QueryImageData> arrayList = this.f170441e;
                this.f170440d = 1;
                if (C59629h.m69504c3(hVar, arrayList, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
