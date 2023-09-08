package gm3;

import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import p981ie.C87705i;

public final /* synthetic */ class b$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f350538a;

    public /* synthetic */ b$$b(StringBuilder sb) {
        this.f350538a = sb;
    }

    public final void accept(Object obj) {
        StringBuilder sb = this.f350538a;
        C114536x.C114546i k = ((C114536x) obj).mo173711k(0);
        sb.append("[bat.charge] ");
        sb.append(k.f343318e.f343211a);
        sb.append("\n");
        sb.append("[bat.dim   ] ");
        sb.append(k.f343320g.f343211a);
        sb.append("\n");
    }
}
