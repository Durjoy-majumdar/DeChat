package tc0;

import android.util.SparseArray;
import f40.C86709a0;
import g62.C45882k;
import g62.C75880o;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: tc0.c */
public class C48622c implements C45882k {

    /* renamed from: d */
    public SparseArray<LinkedList<C45882k.C45884b>> f130151d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<LinkedList<C45882k.C45883a>> f130152e = new SparseArray<>();

    public void E20(int i, C45882k.C45884b bVar) {
        if (this.f130151d.indexOfKey(i) >= 0) {
            this.f130151d.get(i).remove(bVar);
        }
    }

    /* renamed from: m3 */
    public void mo71314m3(int i, C45882k.C45884b bVar) {
        if (this.f130151d.indexOfKey(i) < 0) {
            this.f130151d.put(i, new LinkedList());
        }
        this.f130151d.get(i).add(bVar);
    }

    /* renamed from: mc */
    public void mo71315mc(C75880o oVar) {
        if (C86709a0.m107529k().f251779b != null && C86709a0.m107529k().f251779b.f256809d != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(oVar);
            if (!arrayList.isEmpty()) {
                C48623d dVar = new C48623d(arrayList);
                C86709a0.m107528h();
                dVar.doScene(C86709a0.m107529k().f251779b.f256809d, new C48621b(this, arrayList));
            }
        }
    }
}
