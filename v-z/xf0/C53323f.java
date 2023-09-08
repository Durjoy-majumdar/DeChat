package xf0;

import com.tencent.p014mm.autogen.events.CloseAAUrgeNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import zf0.C53773d;

/* renamed from: xf0.f */
public class C53323f extends IStaticListener<CloseAAUrgeNotifyEvent> {
    public boolean callback(IEvent iEvent) {
        CloseAAUrgeNotifyEvent closeAAUrgeNotifyEvent = (CloseAAUrgeNotifyEvent) iEvent;
        if (Util.isNullOrNil(closeAAUrgeNotifyEvent.f107414d.f107415a) || Util.isNullOrNil(closeAAUrgeNotifyEvent.f107414d.f107416b)) {
            return false;
        }
        CloseAAUrgeNotifyEvent.C40054a aVar = closeAAUrgeNotifyEvent.f107414d;
        new C53773d(aVar.f107415a, aVar.f107416b).mo9225i().mo123064p(new C53322e(this, closeAAUrgeNotifyEvent));
        return false;
    }
}
