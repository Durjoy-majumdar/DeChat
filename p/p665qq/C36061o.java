package p665qq;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import ma1.C117543a;
import ma1.C34492b;
import zt3.C119157j;

/* renamed from: qq.o */
public class C36061o extends IStaticListener<ManualAuthEvent> {
    public boolean callback(IEvent iEvent) {
        ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
        C117543a Cx0 = C117543a.Cx0();
        Cx0.getClass();
        ((C119157j) C119157j.f356862d).mo183879j(new C34492b(Cx0), 60000, "manual_get_expt");
        Cx0.Mx0(2);
        return false;
    }
}
