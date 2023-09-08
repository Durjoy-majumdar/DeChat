package ie2;

import com.tencent.matrix.batterycanary.monitor.feature.C114433x13061b85;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import java.util.ArrayList;
import java.util.List;
import p933be.C79691a;

/* renamed from: ie2.b */
public class C117195b implements C80916r<IPCInteger, C114433x13061b85> {
    public Object invoke(Object obj) {
        IPCInteger iPCInteger = (IPCInteger) obj;
        JiffiesMonitorFeature jiffiesMonitorFeature = (JiffiesMonitorFeature) C79691a.m96804a(JiffiesMonitorFeature.class);
        if (jiffiesMonitorFeature == null) {
            return null;
        }
        JiffiesMonitorFeature.JiffiesSnapshot b = JiffiesMonitorFeature.JiffiesSnapshot.m160986b(JiffiesMonitorFeature.ProcessInfo.m160992b(iPCInteger.f10313d), jiffiesMonitorFeature.f349668a.f339057d.f339045p);
        C114433x13061b85 jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies = new C114433x13061b85();
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343087d = b.f343059d;
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343088e = b.f343061f;
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343090g = ((Integer) b.f343064i.f343211a).intValue();
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343089f = ((Long) b.f343062g.f343211a).longValue();
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343091h = new ArrayList(b.f343063h.f343212a.size());
        for (ITEM item : b.f343063h.f343212a) {
            List<C114433x13061b85.IpcThreadJiffies> list = jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343091h;
            C114433x13061b85.IpcThreadJiffies ipcThreadJiffies = new C114433x13061b85.IpcThreadJiffies();
            ipcThreadJiffies.f343092d = item.f343066b;
            ipcThreadJiffies.f343093e = item.f343067c;
            ipcThreadJiffies.f343094f = item.f343069e;
            ipcThreadJiffies.f343095g = ((Long) item.f343211a).longValue();
            list.add(ipcThreadJiffies);
        }
        return jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies;
    }
}
