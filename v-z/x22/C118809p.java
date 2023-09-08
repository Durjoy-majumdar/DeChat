package x22;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI;
import x22.C118805o;

/* renamed from: x22.p */
public class C118809p implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C118805o f355457d;

    public C118809p(C118805o oVar) {
        this.f355457d = oVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C118805o.C118808c cVar = this.f355457d.f355454b;
        if (cVar != null) {
            RealTimeLocationUI realTimeLocationUI = (RealTimeLocationUI) cVar;
            realTimeLocationUI.f346463W.mo183521d(false);
            realTimeLocationUI.f346465X.mo183163f();
            realTimeLocationUI.f346465X.mo183158a(0);
            realTimeLocationUI.f346468Z.mo183508c();
            realTimeLocationUI.f271948d.finish();
        }
    }
}
