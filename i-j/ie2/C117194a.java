package ie2;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import java.util.ArrayList;
import p933be.C79691a;

/* renamed from: ie2.a */
public class C117194a implements C80916r<IPCInteger, CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat> {
    public Object invoke(Object obj) {
        IPCInteger iPCInteger = (IPCInteger) obj;
        CpuStatFeature cpuStatFeature = (CpuStatFeature) C79691a.m96804a(CpuStatFeature.class);
        if (cpuStatFeature == null || !cpuStatFeature.mo173600x()) {
            return null;
        }
        CpuStatFeature.C114427b v = cpuStatFeature.mo173598v();
        CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat remoteStat = new CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat();
        remoteStat.f343051d = new ArrayList(v.f343054e.size());
        for (C114490k0.C114491a.C114494b.C114502c next : v.f343054e) {
            int size = next.f343212a.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = ((Long) ((C114490k0.C114491a.C114494b.C114497b) next.f343212a.get(i)).f343211a).longValue();
            }
            remoteStat.f343051d.add(jArr);
        }
        return remoteStat;
    }
}
