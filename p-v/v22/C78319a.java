package v22;

import com.tencent.p014mm.autogen.events.CleanStaticMapEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import t22.C77829q;
import t22.C77832s;

/* renamed from: v22.a */
public class C78319a extends IStaticListener<CleanStaticMapEvent> {
    public boolean callback(IEvent iEvent) {
        CleanStaticMapEvent cleanStaticMapEvent = (CleanStaticMapEvent) iEvent;
        C77829q yx02 = C77832s.yx0();
        yx02.getClass();
        Log.m105924i("MicroMsg.StaticMapMsgLogic", "clean task");
        yx02.f226761a.clear();
        yx02.f226765e.clear();
        yx02.f226766f.clear();
        yx02.f226763c.clear();
        yx02.f226764d.clear();
        yx02.f226767g.clear();
        yx02.f226762b.clear();
        C77832s.zx0().mo107946c(yx02);
        C77832s.zx0().mo107946c(yx02);
        return false;
    }
}
