package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import java.util.HashMap;

/* renamed from: oe.v$$a */
public final /* synthetic */ class v$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89205v f329296d;

    /* renamed from: e */
    public final /* synthetic */ String f329297e;

    public /* synthetic */ v$$a(C89205v vVar, String str) {
        this.f329296d = vVar;
        this.f329297e = str;
    }

    public final void run() {
        C89205v vVar = this.f329296d;
        String str = this.f329297e;
        C114467i iVar = (C114467i) ((HashMap) vVar.f257039b).remove(str);
        if (iVar != null) {
            iVar.mo173662f();
            iVar.mo173664h(new v$$d(iVar, str));
        }
    }
}
