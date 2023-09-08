package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.Iterator;
import java.util.List;
import p1177ce.C113287a;
import p1177ce.C113291d;
import p961ee.C86507b;
import p981ie.C87705i;

/* renamed from: xe.d$$i$$g */
public final /* synthetic */ class d$$i$$g implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C113287a f355616a;

    /* renamed from: b */
    public final /* synthetic */ C113291d.C113292a.C113308d f355617b;

    public /* synthetic */ d$$i$$g(C113287a aVar, C113291d.C113292a.C113308d dVar) {
        this.f355616a = aVar;
        this.f355617b = dVar;
    }

    public final void accept(Object obj) {
        C113287a aVar = this.f355616a;
        C113291d.C113292a.C113308d dVar = this.f355617b;
        List<C114490k0.C114491a.C114492a> list = (List) obj;
        if (!list.isEmpty()) {
            long j = 0;
            for (C114490k0.C114491a.C114492a aVar2 : list) {
                j += ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343062g.f343211a).longValue();
            }
            float i = C86507b.m107278i(j, aVar.f338976n / 10);
            dVar.mo165863b("all_pids");
            dVar.f339024a.append("|   -> TOP Thread\tpidNum=");
            dVar.f339024a.append(Integer.valueOf(list.size()));
            dVar.f339024a.append("\tcpuLoad=");
            int i2 = 1;
            dVar.f339024a.append(C86507b.m107280k(i, 1));
            dVar.f339024a.append("%\tmin=");
            dVar.f339024a.append(Long.valueOf(aVar.mo165841e()));
            dVar.f339024a.append("\n");
            dVar.mo165862a("|   -> TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY\n");
            for (C114490k0.C114491a.C114492a aVar3 : list) {
                if (aVar3.mo173690b()) {
                    dVar.mo165862a("|\n");
                    dVar.mo165864c("Proc");
                    dVar.f339024a.append("|   -> :");
                    dVar.f339024a.append(((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343061f);
                    dVar.f339024a.append("\tpid=");
                    dVar.f339024a.append(Integer.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343059d));
                    dVar.f339024a.append("\tload=");
                    dVar.f339024a.append(C86507b.m107280k(C86507b.m107278i(((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343062g.f343211a).longValue(), aVar.f338976n / 10), i2));
                    dVar.f339024a.append("%\tmin=");
                    dVar.f339024a.append(Long.valueOf(aVar.mo165841e()));
                    dVar.mo165862a("\n");
                    dVar.mo165864c("Thread(" + ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.size() + ")");
                    Iterator<ITEM> it = ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = (JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) it.next();
                        long longValue = ((Long) threadJiffiesEntry.f343211a).longValue();
                        float i3 = C86507b.m107278i(longValue, aVar.f338976n / 10);
                        dVar.f339024a.append("|   -> ");
                        dVar.f339024a.append(C86507b.m107279j(String.valueOf(threadJiffiesEntry.f343066b), 5));
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(C86507b.m107279j(C86507b.m107280k(i3, i2), 4));
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(threadJiffiesEntry.f343068d ? "+" : "~");
                        dVar.f339024a.append("/");
                        dVar.f339024a.append(threadJiffiesEntry.f343069e);
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(C86507b.m107279j(threadJiffiesEntry.f343067c, 16));
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(Long.valueOf(longValue));
                        dVar.f339024a.append("\t");
                        dVar.mo165862a("\n");
                        if (i3 < 5.0f) {
                            i2 = 1;
                            break;
                        }
                        i2 = 1;
                    }
                }
            }
        }
    }
}
