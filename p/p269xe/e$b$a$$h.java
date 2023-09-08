package p269xe;

import android.content.Context;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.LinkedHashMap;
import java.util.Map;
import p1177ce.C113287a;
import p1177ce.C113314g;
import p1195ge.C116951c;
import p737wf.C118763b;
import p981ie.C117159b;
import p981ie.C117163d;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$h */
public final /* synthetic */ class e$b$a$$h implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355673a;

    /* renamed from: b */
    public final /* synthetic */ C113287a f355674b;

    /* renamed from: c */
    public final /* synthetic */ double f355675c;

    /* renamed from: d */
    public final /* synthetic */ Map f355676d;

    public /* synthetic */ e$b$a$$h(C114467i iVar, C113287a aVar, double d, Map map) {
        this.f355673a = iVar;
        this.f355674b = aVar;
        this.f355675c = d;
        this.f355676d = map;
    }

    public final void accept(Object obj) {
        Boolean bool;
        C114467i iVar = this.f355673a;
        C113287a aVar = this.f355674b;
        double d = this.f355675c;
        Map map = this.f355676d;
        C114490k0.C114491a.C114503c.C114505b bVar = (C114490k0.C114491a.C114503c.C114505b) obj;
        C113314g gVar = iVar.f343162k;
        if (gVar != null) {
            Boolean b = C118763b.m167464b(gVar.mo165879a());
            Context a = iVar.f343162k.mo165879a();
            int i = MultiProcessMMKV.getDefault().getInt("batt_amp_uncharge_pos", 0);
            int i2 = MultiProcessMMKV.getDefault().getInt("batt_amp_uncharge_neg", 0);
            if (i2 < 0 || i <= i2) {
                long e = C117159b.m165204e(a);
                Log.m105928w("MicroMsg.battery.PowerManagerCompat", "isPositiveInCharge low specs: " + e + ", " + i + " vs " + i2);
                bool = C117163d.m165225b(a);
            } else {
                bool = Boolean.TRUE;
            }
            if (b != null && bool != null) {
                int i3 = 1;
                int i4 = b.booleanValue() ? 1000 : 1;
                if (!bool.booleanValue()) {
                    i3 = -1;
                }
                int i5 = i4 * i3;
                double d2 = bVar.f343232d;
                double d3 = bVar.f343236h;
                if (d2 * d3 > 0.0d && bVar.f343233e * d3 > 0.0d && bVar.f343235g * d3 > 0.0d && bVar.f343234f * d3 > 0.0d) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    double d4 = (double) i5;
                    double d5 = (bVar.f343236h / d4) * ((double) ((((float) aVar.f338976n) * 1.0f) / 3600000.0f));
                    linkedHashMap.put("power", Double.valueOf(C116951c.m165015p(d5, 2)));
                    double d6 = (3600000.0d * d5) / ((double) aVar.f338976n);
                    linkedHashMap.put("powerAvg", Double.valueOf(C116951c.m165015p(d6, 2)));
                    linkedHashMap.put("currAvg", Double.valueOf(C116951c.m165015p(bVar.f343236h / d4, 2)));
                    linkedHashMap.put("currMin", Double.valueOf(C116951c.m165015p(bVar.f343235g / d4, 2)));
                    linkedHashMap.put("currMax", Double.valueOf(C116951c.m165015p(bVar.f343234f / d4, 2)));
                    linkedHashMap.put("currFst", Double.valueOf(C116951c.m165015p(bVar.f343232d / d4, 2)));
                    linkedHashMap.put("currLst", Double.valueOf(C116951c.m165015p(bVar.f343233e / d4, 2)));
                    linkedHashMap.put("currCnt", Integer.valueOf(bVar.f343230b));
                    linkedHashMap.put("ratio", Double.valueOf(C116951c.m165015p((d <= 0.0d || d6 <= 0.0d) ? 0.0d : d5 / d, 2)));
                    map.put("power-currency", linkedHashMap);
                }
            }
        }
    }
}
