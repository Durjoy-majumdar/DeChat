package en3;

import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: en3.a */
public final class C97673a extends ArrayList<RecyclerView.C16631z> {

    /* renamed from: d */
    public final /* synthetic */ C97674b f286482d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f286483e;

    public C97673a(C97674b bVar, RecyclerView recyclerView) {
        this.f286482d = bVar;
        this.f286483e = recyclerView;
    }

    public void clear() {
        super.clear();
        C97674b bVar = this.f286482d;
        RecyclerView recyclerView = this.f286483e;
        bVar.getClass();
        RecyclerView.C16613e<RecyclerView.C16631z> adapter = recyclerView.getAdapter();
        if (adapter != null && !C87412m.m108589b(bVar.f286484a, adapter)) {
            bVar.mo26320a(adapter);
            bVar.f286484a = adapter;
        }
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof RecyclerView.C16631z)) {
            return false;
        }
        return super.contains((RecyclerView.C16631z) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof RecyclerView.C16631z)) {
            return -1;
        }
        return super.indexOf((RecyclerView.C16631z) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof RecyclerView.C16631z)) {
            return -1;
        }
        return super.lastIndexOf((RecyclerView.C16631z) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof RecyclerView.C16631z)) {
            return false;
        }
        return super.remove((RecyclerView.C16631z) obj);
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
