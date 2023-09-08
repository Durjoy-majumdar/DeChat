package qz0;

import dz0.C20483c;
import dz0.C45497b;

/* renamed from: qz0.g */
public class C47909g implements C45497b {

    /* renamed from: a */
    public C12936f f128540a;

    public C47909g(C12936f fVar) {
        this.f128540a = fVar;
    }

    public C20483c getItem(int i) {
        C12936f fVar = this.f128540a;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        throw null;
    }

    public void onCreate() {
        this.f128540a.notifyDataSetChanged();
    }

    public void onDestroy() {
        C12936f fVar = this.f128540a;
        if (fVar != null) {
            fVar.getClass();
            throw null;
        }
    }

    public void onNotify() {
        C12936f fVar = this.f128540a;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }
}
