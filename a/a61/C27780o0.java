package a61;

import com.tencent.p014mm.autogen.events.GifErrorCodeEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: a61.o0 */
public class C27780o0 extends IStaticListener<GifErrorCodeEvent> {
    public boolean callback(IEvent iEvent) {
        switch (((GifErrorCodeEvent) iEvent).f78829d.f78830a) {
            case 101:
                C115669n.INSTANCE.idkeyStat(401, 3, 1, false);
                return false;
            case 102:
                C115669n.INSTANCE.idkeyStat(401, 4, 1, false);
                return false;
            case 104:
                C115669n.INSTANCE.idkeyStat(401, 6, 1, false);
                return false;
            case 105:
                C115669n.INSTANCE.idkeyStat(401, 7, 1, false);
                return false;
            case 106:
                C115669n.INSTANCE.idkeyStat(401, 8, 1, false);
                return false;
            case 107:
                C115669n.INSTANCE.idkeyStat(401, 9, 1, false);
                return false;
            case 108:
                C115669n.INSTANCE.idkeyStat(401, 10, 1, false);
                return false;
            case 109:
                C115669n.INSTANCE.idkeyStat(401, 11, 1, false);
                return false;
            case 110:
                C115669n.INSTANCE.idkeyStat(401, 12, 1, false);
                return false;
            case 111:
                C115669n.INSTANCE.idkeyStat(401, 13, 1, false);
                return false;
            case 112:
                C115669n.INSTANCE.idkeyStat(401, 14, 1, false);
                return false;
            case 113:
                C115669n.INSTANCE.idkeyStat(401, 15, 1, false);
                return false;
            default:
                return false;
        }
    }
}
