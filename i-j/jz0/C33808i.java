package jz0;

import com.tencent.p014mm.autogen.events.ResetCardRetryCounterEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import hz0.C33159k0;
import hz0.C46153l0;

/* renamed from: jz0.i */
public class C33808i extends IStaticListener<ResetCardRetryCounterEvent> {
    public boolean callback(IEvent iEvent) {
        ResetCardRetryCounterEvent resetCardRetryCounterEvent = (ResetCardRetryCounterEvent) iEvent;
        Log.m105924i("MicroMsg.SubCoreCard.ResetCardRetryCounter", "deal with reset card retry counter event");
        C33159k0 Ix0 = C46153l0.Ix0();
        Ix0.getClass();
        Log.m105918d("MicroMsg.PendingCardIdInfoStorage", "resetRetryCounter");
        Ix0.f90011d.execSQL("PendingCardId", "update PendingCardId set retryCount = 0 where retryCount >= 10");
        return false;
    }
}
