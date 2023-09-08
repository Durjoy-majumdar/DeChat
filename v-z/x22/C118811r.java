package x22;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import x22.C118805o;

/* renamed from: x22.r */
public class C118811r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f355458d;

    /* renamed from: e */
    public final /* synthetic */ C118805o f355459e;

    public C118811r(C118805o oVar, int i) {
        this.f355459e = oVar;
        this.f355458d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C118805o.C118808c cVar = this.f355459e.f355454b;
        if (cVar != null) {
            int i2 = this.f355458d;
            RealTimeLocationUI realTimeLocationUI = (RealTimeLocationUI) cVar;
            realTimeLocationUI.getClass();
            if (i2 == 0) {
                C115669n.INSTANCE.mo160131h(10997, "8", "", 0, 0);
                realTimeLocationUI.mo175547I();
            } else if (i2 == 1) {
                C115669n.INSTANCE.mo160131h(10997, "8", "", 0, 0);
                realTimeLocationUI.mo175547I();
            } else if (i2 == 2) {
                realTimeLocationUI.mo175547I();
            }
        }
    }
}
