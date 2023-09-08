package an1;

import bn1.C0330a;
import cm1.C0740i2;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import pe3.C89349b;
import sx3.C64186f0;
import te3.C48682a91;
import tf1.C13914m;

/* renamed from: an1.b */
public final class C0089b implements C0740i2, C0330a {

    /* renamed from: d */
    public final C48682a91 f525d;

    /* renamed from: e */
    public final ArrayList<C0740i2> f526e = new ArrayList<>();

    public C0089b(C48682a91 a912) {
        C87412m.m108594g(a912, "container");
        this.f525d = a912;
    }

    /* renamed from: a */
    public C89349b mo78a() {
        return this.f525d.f130384n;
    }

    /* renamed from: b */
    public void mo79b(int i) {
        this.f525d.f130382i = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 5;
    }

    /* renamed from: d */
    public void mo80d(C89349b bVar) {
        this.f525d.f130384n = bVar;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0089b) || ((C0089b) mVar).f525d.f130377d != this.f525d.f130377d) ? -1 : 0;
    }

    public long getItemId() {
        return (long) this.f525d.f130377d;
    }

    /* renamed from: j */
    public List<Long> mo81j() {
        return C64186f0.f181907d;
    }

    /* renamed from: k */
    public int mo82k() {
        return this.f525d.f130377d;
    }
}
