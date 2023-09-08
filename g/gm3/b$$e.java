package gm3;

import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import p981ie.C117173p;
import p981ie.C87705i;

public final /* synthetic */ class b$$e implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f350540a;

    public /* synthetic */ b$$e(StringBuilder sb) {
        this.f350540a = sb;
    }

    public final void accept(Object obj) {
        StringBuilder sb = this.f350540a;
        C117173p pVar = ((CpuStatFeature) obj).f343048k;
        sb.append("[power.prof] ");
        sb.append(pVar != null && pVar.mo181094l());
        sb.append("\n");
        sb.append("[power.type] ");
        sb.append(C117173p.f351032f);
        sb.append("\n");
    }
}
