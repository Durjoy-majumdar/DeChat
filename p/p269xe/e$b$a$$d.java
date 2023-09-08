package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.List;
import java.util.Map;
import p1177ce.C113287a;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$d */
public final /* synthetic */ class e$b$a$$d implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ Map f355667a;

    /* renamed from: b */
    public final /* synthetic */ C113287a f355668b;

    public /* synthetic */ e$b$a$$d(Map map, C113287a aVar) {
        this.f355667a = map;
        this.f355668b = aVar;
    }

    public final void accept(Object obj) {
        float f;
        float f2;
        Map map = this.f355667a;
        C113287a aVar = this.f355668b;
        List list = (List) obj;
        if (!list.isEmpty()) {
            int i = 0;
            long j = 0;
            long j2 = 0;
            int i2 = 0;
            while (i2 < list.size()) {
                C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) list.get(i2);
                JiffiesMonitorFeature.JiffiesSnapshot jiffiesSnapshot = (JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c;
                String str = jiffiesSnapshot.f343061f;
                long longValue = ((Long) jiffiesSnapshot.f343062g.f343211a).longValue();
                j2 += longValue;
                String str2 = !((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.isEmpty() ? ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.get(i)).f343067c : "";
                StringBuilder sb = new StringBuilder();
                sb.append("pid-");
                i2++;
                sb.append(i2);
                sb.append("-cpuLoad");
                String sb4 = sb.toString();
                long j3 = aVar.f338976n;
                map.put(sb4, Integer.valueOf((int) ((j3 > j ? ((float) (longValue * 10)) / ((float) j3) : 0.0f) * 100.0f)));
                map.put("pid-" + i2 + "-name", C118872b.m167610g(str));
                map.put("pid-" + i2 + "-topThread", C118872b.m167612i(str2, -1));
                i = 0;
                j = 0;
            }
            long j4 = aVar.f338976n;
            if (j4 > 0) {
                f = ((float) (j2 * 10)) / ((float) j4);
                f2 = 100.0f;
            } else {
                f2 = 100.0f;
                f = 0.0f;
            }
            map.put("pid-all-cpuLoad", Integer.valueOf((int) (f * f2)));
        }
    }
}
