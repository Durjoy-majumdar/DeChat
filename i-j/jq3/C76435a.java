package jq3;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: jq3.a */
public final class C76435a extends RecyclerView.C16623q {

    /* renamed from: c */
    public final int f223760c;

    /* renamed from: d */
    public final SparseArray<C76436b> f223761d = new SparseArray<>();

    /* renamed from: e */
    public final LinkedList<RecyclerView.C16631z> f223762e = new LinkedList<>();

    public C76435a(int i) {
        this.f223760c = i;
    }

    /* renamed from: a */
    public void mo17334a() {
        super.mo17334a();
        SparseArray<C76436b> sparseArray = this.f223761d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            sparseArray.valueAt(i).f223763a.clear();
        }
        this.f223762e.clear();
    }

    /* renamed from: b */
    public RecyclerView.C16631z mo10383b(int i) {
        C76436b bVar = this.f223761d.get(i);
        if (bVar == null || !(!bVar.f223763a.isEmpty())) {
            return null;
        }
        RecyclerView.C16631z removeLast = bVar.f223763a.removeLast();
        this.f223762e.remove(removeLast);
        return removeLast;
    }

    /* renamed from: d */
    public void mo10384d(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "scrap");
        int i = zVar.f44859i;
        C76436b bVar = this.f223761d.get(i);
        if (bVar == null) {
            bVar = new C76436b();
            this.f223761d.put(i, bVar);
        }
        bVar.f223763a.add(zVar);
        this.f223762e.add(zVar);
        if (this.f223762e.size() > this.f223760c) {
            RecyclerView.C16631z removeFirst = this.f223762e.removeFirst();
            this.f223761d.get(removeFirst.f44859i).f223763a.remove(removeFirst);
        }
    }
}
