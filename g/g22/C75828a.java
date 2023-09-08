package g22;

import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g22.a */
public class C75828a extends C16665p.C16673d {

    /* renamed from: d */
    public C75829a f222442d;

    /* renamed from: e */
    public boolean f222443e = false;

    /* renamed from: g22.a$a */
    public interface C75829a {
        /* renamed from: e */
        void mo95125e();

        /* renamed from: f */
        void mo95126f(int i);

        void onItemSelected(int i);

        boolean onMove(int i, int i2);
    }

    public C75828a(C75829a aVar) {
        this.f222442d = aVar;
    }

    /* renamed from: a */
    public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
        if (zVar instanceof C75845k) {
            ((C75845k) zVar).mo105850e();
        }
        C75829a aVar = this.f222442d;
        if (aVar != null) {
            aVar.mo95125e();
        }
        super.mo17547a(recyclerView, zVar);
    }

    /* renamed from: c */
    public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int i = 0;
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        int N = ((LinearLayoutManager) layoutManager).mo16967N();
        int i2 = 12;
        if (N == 0) {
            i2 = 3;
            i = 12;
        } else if (N == 1) {
            i = 3;
        } else {
            i2 = 0;
        }
        return C16665p.C16673d.m16132g(i, i2);
    }

    /* renamed from: e */
    public boolean mo17551e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo17552f() {
        return this.f222443e;
    }

    /* renamed from: i */
    public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
        C75829a aVar = this.f222442d;
        if (aVar != null) {
            return aVar.onMove(zVar.mo17363j(), zVar2.mo17363j());
        }
        return false;
    }

    /* renamed from: j */
    public void mo17555j(RecyclerView.C16631z zVar, int i) {
        if (i != 0) {
            if (zVar instanceof C75845k) {
                ((C75845k) zVar).mo105849a3();
            }
            C75829a aVar = this.f222442d;
            if (aVar != null) {
                aVar.onItemSelected(zVar.mo17363j());
            }
        }
    }

    /* renamed from: k */
    public void mo17556k(RecyclerView.C16631z zVar, int i) {
        C75829a aVar = this.f222442d;
        if (aVar != null) {
            aVar.mo95126f(zVar.mo17363j());
        }
    }
}
