package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$k */
public final /* synthetic */ class q$$k implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352240a;

    /* renamed from: b */
    public final /* synthetic */ String f352241b;

    /* renamed from: c */
    public final /* synthetic */ C116947b.C116948a f352242c;

    /* renamed from: d */
    public final /* synthetic */ C114467i f352243d;

    public /* synthetic */ q$$k(double d, String str, C116947b.C116948a aVar, C114467i iVar) {
        this.f352240a = d;
        this.f352241b = str;
        this.f352242c = aVar;
        this.f352243d = iVar;
    }

    public final void accept(Object obj) {
        double d = this.f352240a;
        String str = this.f352241b;
        C116947b.C116948a aVar = this.f352242c;
        C114467i iVar = this.f352243d;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("type", str);
        map.put("idleMs", aVar.f350447L.f343211a);
        map.put("rxMs", aVar.f350448M.f343211a);
        map.put("txMs", aVar.f350449N.f343211a);
        map.put("runMs", aVar.f350450O.f343211a);
        map.put("lockMs", aVar.f350451P.f343211a);
        map.put("scanMs", aVar.f350452Q.f343211a);
        map.put("castMs", aVar.f350453R.f343211a);
        map.put("rxByte", aVar.f350454S.f343211a);
        map.put("txByte", aVar.f350455T.f343211a);
        map.put("rxPacket", aVar.f350456U.f343211a);
        map.put("txPacket", aVar.f350457V.f343211a);
        if (iVar != null) {
            iVar.mo173668l(C114513o0.C114515b.class, new q$$s(map));
        }
    }
}
