package p756xt;

import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import p744wt.C66190c;

/* renamed from: xt.i */
public final class C66443i extends IStaticListener<LogoutEvent> {

    /* renamed from: d */
    public final String f191200d = "MicroMsg.LiveLogoutEventStaticListener";

    public boolean callback(IEvent iEvent) {
        Class cls = C66190c.class;
        C87412m.m108594g((LogoutEvent) iEvent, "event");
        if (!C86709a0.m107522a()) {
            return false;
        }
        String str = this.f191200d;
        Log.m105924i(str, "logoutEvent liveId:" + RoomLiveService.f157197h.f133050d + " liveName:" + RoomLiveService.f157197h.f133051e);
        if (!((C66190c) C86312j.m106911c(cls)).mo89933L5() && !((C66190c) C86312j.m106911c(cls)).mo89931F()) {
            return false;
        }
        ((C66190c) C86312j.m106911c(cls)).ud0(MMApplicationContext.getContext());
        return false;
    }
}
