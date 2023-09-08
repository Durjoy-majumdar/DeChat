package p222qm;

import android.content.Context;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: qm.p0 */
public class C12877p0 extends IStaticListener<Launch3RdAppEvent> {
    public boolean callback(IEvent iEvent) {
        Launch3RdAppEvent launch3RdAppEvent = (Launch3RdAppEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        Context context = launch3RdAppEvent.f9317d.f9322d;
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Context context2 = context;
        Launch3RdAppEvent.C1090b bVar = launch3RdAppEvent.f9318e;
        Launch3RdAppEvent.C1089a aVar = launch3RdAppEvent.f9317d;
        bVar.f9325a = ((C79138l) C86312j.m106911c(C79138l.class)).mo74010gu(context2, aVar.f9320b, aVar.f9319a, aVar.f9321c, aVar.f9323e, aVar.f9324f);
        return false;
    }
}
