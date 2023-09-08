package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import java.util.Map;
import p981ie.C87705i;

/* renamed from: oe.q$$s */
public final /* synthetic */ class q$$s implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ Map f352257a;

    public /* synthetic */ q$$s(Map map) {
        this.f352257a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f352257a;
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        map.put("rxByteSys", ((C114513o0.C114515b) aVar.f343207c).f343246d.f343211a);
        map.put("txByteSys", ((C114513o0.C114515b) aVar.f343207c).f343247e.f343211a);
        map.put("rxPacketSys", ((C114513o0.C114515b) aVar.f343207c).f343248f.f343211a);
        map.put("txPacketSys", ((C114513o0.C114515b) aVar.f343207c).f343249g.f343211a);
    }
}
