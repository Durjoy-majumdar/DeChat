package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import java.util.Map;
import p981ie.C87705i;

/* renamed from: oe.q$$t */
public final /* synthetic */ class q$$t implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ Map f352258a;

    public /* synthetic */ q$$t(Map map) {
        this.f352258a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f352258a;
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        map.put("rxByteSys", ((C114513o0.C114515b) aVar.f343207c).f343250h.f343211a);
        map.put("txByteSys", ((C114513o0.C114515b) aVar.f343207c).f343251i.f343211a);
        map.put("rxPacketSys", ((C114513o0.C114515b) aVar.f343207c).f343252j.f343211a);
        map.put("txPacketSys", ((C114513o0.C114515b) aVar.f343207c).f343253k.f343211a);
    }
}
