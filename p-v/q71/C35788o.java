package q71;

import com.tencent.p014mm.autogen.events.ExDeviceUploadXlogEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import hk2.C32939b;

/* renamed from: q71.o */
public class C35788o extends IStaticListener<ExDeviceUploadXlogEvent> {
    public boolean callback(IEvent iEvent) {
        ExDeviceUploadXlogEvent exDeviceUploadXlogEvent = (ExDeviceUploadXlogEvent) iEvent;
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105924i("RtosOnXlogUploadEvent", "account not ready");
            return false;
        }
        exDeviceUploadXlogEvent.f78782d.getClass();
        ((C32939b) C86312j.m106911c(C32939b.class)).mq0((String) null);
        return false;
    }
}
