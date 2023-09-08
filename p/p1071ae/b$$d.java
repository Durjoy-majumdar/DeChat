package p1071ae;

import android.os.Bundle;
import com.tencent.matrix.battery.accumulate.AccPowerStats;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114486j0;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p212oe.C117754c0;
import p212oe.C117775r;
import p212oe.C117778u;
import p269xe.C118872b;
import p329d3.C58104c;
import p981ie.C117159b;
import p981ie.C87705i;

/* renamed from: ae.b$$d */
public final /* synthetic */ class b$$d implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ AccPowerStats f337720a;

    public /* synthetic */ b$$d(AccPowerStats accPowerStats) {
        this.f337720a = accPowerStats;
    }

    public final void accept(Object obj) {
        AccPowerStats accPowerStats = this.f337720a;
        accPowerStats.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            for (C58104c cVar : (List) entry.getValue()) {
                StringBuilder sb = new StringBuilder();
                Class<C114486j0> cls = (Class) cVar.f166179a;
                sb.append(cls == C117754c0.class ? "ThreadPool" : cls == C117778u.class ? "MMHanlder" : cls == C117775r.class ? "Ipc" : cls == C114486j0.class ? "Looper" : cls.getSimpleName());
                sb.append("-");
                sb.append(str);
                String sb4 = sb.toString();
                Long l = (Long) hashMap.get(sb4);
                hashMap.put(sb4, Long.valueOf((l == null ? 0 : l.longValue()) + ((Long) ((C114436a.C114440d) ((C114490k0.C114491a.C114492a) cVar.f166180b).f343207c).f343110g.f343211a).longValue()));
            }
        }
        Map v = C117159b.m165221v(hashMap, new b$$e());
        String g = C118872b.m167610g(MMApplicationContext.getProcessName());
        Bundle bundle = accPowerStats.f343045w.getBundle(g);
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = 0;
        for (Map.Entry entry2 : ((LinkedHashMap) v).entrySet()) {
            if (i >= 20) {
                break;
            }
            String str2 = (String) entry2.getKey();
            bundle.putLong(str2, bundle.getLong(str2, 0) + ((Long) entry2.getValue()).longValue());
            i++;
        }
        accPowerStats.f343045w.putBundle(g, bundle);
    }
}
