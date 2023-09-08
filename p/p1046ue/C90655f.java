package p1046ue;

import java.util.LinkedList;
import java.util.List;
import p1046ue.C90652e;

/* renamed from: ue.f */
public class C90655f implements C90652e.C90654b {

    /* renamed from: a */
    public final List<C90650d> f260465a = new LinkedList();

    /* renamed from: a */
    public void mo124799a(C90650d dVar) {
        synchronized (this.f260465a) {
            ((LinkedList) this.f260465a).remove(dVar);
        }
    }

    /* renamed from: b */
    public void mo124800b(C90650d dVar) {
        synchronized (this.f260465a) {
            ((LinkedList) this.f260465a).add(dVar);
        }
    }
}
