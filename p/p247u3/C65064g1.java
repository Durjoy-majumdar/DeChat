package p247u3;

import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import p247u3.C65009b;

/* renamed from: u3.g1 */
public abstract class C65064g1<T, VH extends RecyclerView.C16631z> extends RecyclerView.C16613e<VH> {

    /* renamed from: d */
    public final C65009b<T> f187266d;

    /* renamed from: u3.g1$a */
    public class C65065a implements C65009b.C65013c<T> {
        public C65065a() {
        }
    }

    public C65064g1(C54248l.C54252d<T> dVar) {
        C65065a aVar = new C65065a();
        C65009b<T> bVar = new C65009b<>(this, dVar);
        this.f187266d = bVar;
        bVar.f187146d = aVar;
    }

    public int getItemCount() {
        C65009b<T> bVar = this.f187266d;
        C65035c1<T> c1Var = bVar.f187148f;
        if (c1Var != null) {
            return c1Var.size();
        }
        C65035c1<T> c1Var2 = bVar.f187149g;
        if (c1Var2 == null) {
            return 0;
        }
        return c1Var2.size();
    }
}
