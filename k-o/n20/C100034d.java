package n20;

import com.tencent.p014mm.modelimage.loader.impr.C81000b;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import jc0.C21210b;
import wb0.C102382b;
import wb0.C102383c;
import wx3.C15601d;

/* renamed from: n20.d */
public final class C100034d extends ProcessorPipelineComponent<C102382b, C102383c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100034d(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public Object processAction(PipelineState pipelineState, BaseStateAction baseStateAction, C15601d dVar) {
        C102382b bVar = (C102382b) baseStateAction;
        C61603e eVar = (C61603e) pipelineState.get("Common_HttpParams");
        if (eVar == null) {
            return new C102383c(bVar.f301540a, bVar.f301541b, (byte[]) null, 4, (C8480h) null);
        }
        C21210b a = new C81000b().mo32789a(eVar.f175190a);
        if (a == null) {
            return new C102383c(bVar.f301540a, bVar.f301541b, (byte[]) null, 4, (C8480h) null);
        }
        C21210b bVar2 = a.f59985a == 0 && a.f59987c != null ? a : null;
        if (bVar2 != null) {
            int S = C86013q1.m106437S(bVar.f301541b, bVar2.f59987c);
            Log.m105924i("MicroMsg.CommonHttpLoadDataFromRemotePPC", "loadFromNetWork writeResult:" + S);
        }
        return new C102383c(bVar.f301540a, bVar.f301541b, a.f59987c);
    }
}
