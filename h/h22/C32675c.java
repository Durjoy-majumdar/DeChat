package h22;

import com.tencent.p014mm.autogen.events.BypNotifyActionEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49437fl;
import te3.C49574gl;
import te3.C49712hj1;

/* renamed from: h22.c */
public final class C32675c extends IStaticListener<BypNotifyActionEvent> {
    public boolean callback(IEvent iEvent) {
        Object obj;
        BypNotifyActionEvent bypNotifyActionEvent = (BypNotifyActionEvent) iEvent;
        C87412m.m108594g(bypNotifyActionEvent, "event");
        try {
            Result.Companion companion = Result.Companion;
            if (bypNotifyActionEvent.f78730d.f78731a == 4) {
                Log.m105924i("MicroMsg.BypRedDotNotifyEventListener", "notify from bypFinder");
                C49574gl glVar = new C49574gl();
                glVar.parseFrom(bypNotifyActionEvent.f78730d.f78732b);
                if (glVar.f134115d == 1) {
                    C49437fl flVar = new C49437fl();
                    flVar.parseFrom(glVar.f134116e.mo123703f());
                    ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n.mo84538g((int) flVar.f133572d, 11, (C49712hj1) null);
                }
            }
            obj = Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r8 = Result.m168117exceptionOrNullimpl(obj);
        if (r8 != null) {
            Log.printErrStackTrace("MicroMsg.BypRedDotNotifyEventListener", r8, "", new Object[0]);
        }
        return true;
    }
}
