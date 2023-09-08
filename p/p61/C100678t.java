package p61;

import java.util.List;

/* renamed from: p61.t */
public final class C100678t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100679u f294976d;

    /* renamed from: e */
    public final /* synthetic */ List<C100659j0> f294977e;

    public C100678t(C100679u uVar, List<C100659j0> list) {
        this.f294976d = uVar;
        this.f294977e = list;
    }

    public final void run() {
        this.f294976d.f294984H.f294957e.clear();
        this.f294976d.f294984H.f294957e.addAll(this.f294977e);
        this.f294976d.f294984H.notifyDataSetChanged();
    }
}
