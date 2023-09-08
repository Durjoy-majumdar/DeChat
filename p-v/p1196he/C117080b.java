package p1196he;

import com.tencent.matrix.batterycanary.stats.p1183ui.C114595c;
import java.util.ArrayList;

/* renamed from: he.b */
public class C117080b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114595c f350830d;

    public C117080b(C114595c cVar) {
        this.f350830d = cVar;
    }

    public void run() {
        int size = ((ArrayList) this.f350830d.f343428a.f343382d).size();
        ((ArrayList) this.f350830d.f343428a.f343382d).clear();
        this.f350830d.f343428a.notifyItemRangeRemoved(0, size);
    }
}
