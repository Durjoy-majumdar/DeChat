package j43;

import com.tencent.p014mm.autogen.events.CheckVoipCSIsStartedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import k43.C108886d;

/* renamed from: j43.a */
public class C87878a extends IStaticListener<CheckVoipCSIsStartedEvent> {
    public boolean callback(IEvent iEvent) {
        CheckVoipCSIsStartedEvent checkVoipCSIsStartedEvent = (CheckVoipCSIsStartedEvent) iEvent;
        if (checkVoipCSIsStartedEvent instanceof CheckVoipCSIsStartedEvent) {
            CheckVoipCSIsStartedEvent.C80708a aVar = checkVoipCSIsStartedEvent.f236161d;
            boolean z = true;
            if (!(C108886d.xx0().f326118n == 1 || C108886d.xx0().f326118n == 2)) {
                z = false;
            }
            aVar.f236162a = z;
        }
        return false;
    }
}
