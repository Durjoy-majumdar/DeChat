package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.Comparator;
import p723vf.C118672d;

/* renamed from: xe.d$$j$$b */
public final /* synthetic */ class d$$j$$b implements Comparator {
    public final int compare(Object obj, Object obj2) {
        RECORD record;
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj2;
        RECORD record2 = aVar.f343207c;
        if (record2 == null || (record = aVar2.f343207c) == null) {
            C118672d.m167356f("Matrix.battery.listener", "delta should not be null: " + aVar + " vs " + aVar2, new Object[0]);
            return 0;
        }
        int i = ((((Long) ((C114436a.C114440d) record2).f343110g.f343211a).longValue() - ((Long) ((C114436a.C114440d) record).f343110g.f343211a).longValue()) > 0 ? 1 : ((((Long) ((C114436a.C114440d) record2).f343110g.f343211a).longValue() - ((Long) ((C114436a.C114440d) record).f343110g.f343211a).longValue()) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? -1 : 1;
    }
}
