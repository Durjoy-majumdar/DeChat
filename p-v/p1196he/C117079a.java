package p1196he;

import com.tencent.matrix.batterycanary.stats.p1183ui.C114595c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: he.a */
public class C117079a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f350828d;

    /* renamed from: e */
    public final /* synthetic */ C114595c f350829e;

    public C117079a(C114595c cVar, List list) {
        this.f350829e = cVar;
        this.f350828d = list;
    }

    public void run() {
        int size = this.f350828d.size();
        ((ArrayList) this.f350829e.f343428a.f343382d).addAll(this.f350828d);
        this.f350829e.f343428a.notifyItemRangeChanged(Math.max(((ArrayList) this.f350829e.f343428a.f343382d).size() - 1, 0), size);
    }
}
