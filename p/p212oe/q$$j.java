package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import java.util.Map;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C86165a;

/* renamed from: oe.q$$j */
public final /* synthetic */ class q$$j implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ double f352236a;

    /* renamed from: b */
    public final /* synthetic */ String f352237b;

    /* renamed from: c */
    public final /* synthetic */ C116947b.C116948a f352238c;

    /* renamed from: d */
    public final /* synthetic */ C114467i f352239d;

    public /* synthetic */ q$$j(double d, String str, C116947b.C116948a aVar, C114467i iVar) {
        this.f352236a = d;
        this.f352237b = str;
        this.f352238c = aVar;
        this.f352239d = iVar;
    }

    public final void accept(Object obj) {
        double d = this.f352236a;
        String str = this.f352237b;
        C116947b.C116948a aVar = this.f352238c;
        C114467i iVar = this.f352239d;
        Map map = (Map) obj;
        map.put("power", Double.valueOf(C116951c.m165015p(d, 2)));
        map.put("type", str);
        map.put("radioActive", aVar.f350438C.f343211a);
        map.put("idleMs", aVar.f350439D.f343211a);
        map.put("rxMs", aVar.f350440E.f343211a);
        map.put("txMs", aVar.f350441F.f343211a);
        map.put("rxByte", aVar.f350442G.f343211a);
        map.put("txByte", aVar.f350443H.f343211a);
        map.put("rxPacket", aVar.f350444I.f343211a);
        map.put("txPacket", aVar.f350445J.f343211a);
        if (iVar != null) {
            iVar.mo173668l(C114513o0.C114515b.class, new q$$t(map));
        }
    }
}
