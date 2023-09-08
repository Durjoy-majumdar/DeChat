package p340fm;

import com.tencent.p014mm.autogen.events.TabRedDotChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import hh0.C20942f;

/* renamed from: fm.m */
public class C32105m extends IStaticListener<TabRedDotChangeEvent> {
    public boolean callback(IEvent iEvent) {
        TabRedDotChangeEvent tabRedDotChangeEvent = (TabRedDotChangeEvent) iEvent;
        C20942f yx02 = C20942f.yx0();
        yx02.getClass();
        try {
            TabRedDotChangeEvent.C28839a aVar = tabRedDotChangeEvent.f79024d;
            if (aVar.f79025a == 2) {
                yx02.Hx0(aVar);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AiFinderLogic", e, "", new Object[0]);
        }
        return false;
    }
}
