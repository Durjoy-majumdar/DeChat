package p269xe;

import android.text.format.DateFormat;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.List;
import p1177ce.C113291d;
import p212oe.C117750b;
import p212oe.C117754c0;
import p212oe.C117775r;
import p212oe.C117778u;
import p212oe.b$$g;

/* renamed from: xe.d$$i */
public class d$$i extends C113291d.C113292a.C113295c {
    /* renamed from: b */
    public boolean mo165860b(C114490k0.C114491a.C114492a<?> aVar, C114467i iVar, C113291d.C113292a.C113308d dVar) {
        if (!super.mo165860b(aVar, iVar, dVar)) {
            RECORD record = aVar.f343207c;
            if (record instanceof C114436a.C114440d) {
                long max = Math.max(1, aVar.f343208d / 60000);
                long longValue = ((Long) ((C114436a.C114440d) aVar.f343207c).f343110g.f343211a).longValue() / max;
                if (longValue > 0) {
                    CharSequence format = DateFormat.format("HH:mm:ss", ((C114436a.C114440d) aVar.f343205a).f343109f);
                    dVar.f339024a.append("|   -> (");
                    dVar.f339024a.append(((C114436a.C114440d) aVar.f343207c).f343114k ? "-" : "~");
                    dVar.f339024a.append(",");
                    dVar.f339024a.append(Integer.valueOf(((C114436a.C114440d) aVar.f343207c).f343111h));
                    dVar.f339024a.append("-");
                    dVar.f339024a.append(Integer.valueOf(((C114436a.C114440d) aVar.f343207c).f343112i));
                    dVar.f339024a.append(",");
                    dVar.f339024a.append(format);
                    dVar.f339024a.append("-");
                    dVar.f339024a.append(Long.valueOf(max));
                    dVar.f339024a.append("min");
                    dVar.f339024a.append(")");
                    dVar.f339024a.append(((C114436a.C114440d) aVar.f343207c).f343108e);
                    dVar.f339024a.append("(");
                    dVar.f339024a.append(Integer.valueOf(((C114436a.C114440d) aVar.f343207c).f343107d));
                    dVar.f339024a.append(")\t");
                    dVar.f339024a.append(Long.valueOf(longValue));
                    dVar.f339024a.append("/");
                    dVar.f339024a.append(((C114436a.C114440d) aVar.f343207c).f343110g.f343211a);
                    dVar.f339024a.append("\tjiffies");
                    dVar.mo165862a("\n");
                }
                return true;
            } else if (record instanceof b$$g) {
                long max2 = Math.max(1, aVar.f343208d / 60000);
                dVar.mo165864c("during");
                dVar.mo165868g(aVar.f343208d + "(mls)\t" + max2 + "(min)");
                dVar.mo165869h("avgAlarmCount", String.valueOf(((long) ((Integer) ((b$$g) aVar.f343207c).f352151e.f343211a).intValue()) / max2));
                dVar.mo165869h("avgAddMsgCount", String.valueOf(((Long) ((b$$g) aVar.f343207c).f352150d.f343211a).longValue() / max2));
                return true;
            } else if (!(record instanceof C114513o0.C114515b)) {
                return false;
            } else {
                long max3 = Math.max(1, aVar.f343208d / 60000);
                long longValue2 = ((Long) ((C114513o0.C114515b) aVar.f343207c).f343247e.f343211a).longValue() / max3;
                long longValue3 = ((Long) ((C114513o0.C114515b) aVar.f343207c).f343250h.f343211a).longValue() / max3;
                long longValue4 = ((Long) ((C114513o0.C114515b) aVar.f343207c).f343251i.f343211a).longValue() / max3;
                dVar.mo165864c("traffic");
                dVar.mo165869h("avgWifiRx", String.valueOf(((Long) ((C114513o0.C114515b) aVar.f343207c).f343246d.f343211a).longValue() / max3));
                dVar.mo165869h("avgWifiTx", String.valueOf(longValue2));
                dVar.mo165869h("avgMobileRx", String.valueOf(longValue3));
                dVar.mo165869h("avgMobileTx", String.valueOf(longValue4));
                return true;
            }
        } else if (!(aVar.f343207c instanceof JiffiesMonitorFeature.JiffiesSnapshot)) {
            return false;
        } else {
            dVar.mo165864c("dead_threads");
            dVar.mo165869h("cont", String.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343065j.f343212a.size()));
            StringBuilder sb = new StringBuilder();
            if (C117750b.m166049g()) {
                for (ITEM item : ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343065j.f343212a) {
                    sb.append(sb.length() == 0 ? "" : ",");
                    sb.append(item.f343067c);
                    sb.append("(");
                    sb.append(item.f343066b);
                    sb.append(")");
                }
            } else {
                sb.append("skip");
            }
            dVar.mo165869h("list", sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    public void mo165861c(C114467i iVar, C113291d.C113292a.C113308d dVar) {
        Class<C114513o0.C114515b> cls = C114513o0.C114515b.class;
        Class<b$$g> cls2 = b$$g.class;
        super.mo165861c(iVar, dVar);
        iVar.mo173671o(C117754c0.class, new d$$i$$a(this, iVar, dVar));
        iVar.mo173671o(C117778u.class, new d$$i$$b(this, iVar, dVar));
        iVar.mo173671o(C117775r.class, new d$$i$$c(this, iVar, dVar));
        if (!(iVar.mo173667k(cls2) == null && iVar.mo173667k(cls) == null)) {
            dVar.mo165863b("extra_info");
            iVar.mo173668l(cls2, new d$$i$$d(this, iVar, dVar));
            iVar.mo173668l(cls, new d$$i$$e(this, iVar, dVar));
        }
        iVar.mo173664h(new d$$i$$f(iVar, dVar));
    }

    /* renamed from: d */
    public final void mo183581d(List<C114490k0.C114491a.C114492a<C114436a.C114440d>> list, C114467i iVar, C113291d.C113292a.C113308d dVar) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < Math.min(list.size(), 10); i++) {
            C114490k0.C114491a.C114492a aVar = list.get(i);
            mo165860b(aVar, iVar, dVar);
            if (!aVar.mo173690b()) {
                z2 = true;
            }
            if (!z && ((Long) ((C114436a.C114440d) aVar.f343207c).f343110g.f343211a).longValue() / Math.max(1, aVar.f343208d / 60000) > Math.max(C117750b.f352127f, 1000)) {
                z = true;
            }
        }
        dVar.mo165862a("|\t\t......\n");
        if (z || z2) {
            dVar.f339024a.append("|  ");
            String str = "";
            dVar.f339024a.append(z ? " #overHeat" : str);
            if (z2) {
                str = " #invalid";
            }
            dVar.f339024a.append(str);
            dVar.mo165862a("\n");
        }
    }
}
