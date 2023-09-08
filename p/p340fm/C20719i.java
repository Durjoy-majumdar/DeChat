package p340fm;

import com.tencent.p014mm.autogen.events.FinderSyncRedDotEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import hh0.C20942f;

/* renamed from: fm.i */
public class C20719i extends IStaticListener<FinderSyncRedDotEvent> {
    public boolean callback(IEvent iEvent) {
        FinderSyncRedDotEvent finderSyncRedDotEvent = (FinderSyncRedDotEvent) iEvent;
        C20942f yx02 = C20942f.yx0();
        yx02.getClass();
        try {
            yx02.wx0(finderSyncRedDotEvent);
            FinderSyncRedDotEvent.C17678a aVar = finderSyncRedDotEvent.f48092d;
            if (aVar.f48093a >= 10000) {
                if (aVar.f48094b == 113 && !Util.isNullOrNil(aVar.f48095c)) {
                    yx02.vx0(finderSyncRedDotEvent);
                    yx02.f59381p.removeMessages(2457);
                } else if (yx02.f59372d > 0) {
                    yx02.f59381p.removeMessages(2457);
                    MMHandler mMHandler = yx02.f59381p;
                    mMHandler.sendMessageDelayed(mMHandler.obtainMessage(2457, finderSyncRedDotEvent.f48092d.f48093a, 0), 100);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
