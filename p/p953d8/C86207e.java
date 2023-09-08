package p953d8;

import p300c8.C79944f;
import p300c8.C79946g;
import p953d8.C86205d;

/* renamed from: d8.e */
public final class C86207e implements C79946g.C79947a {

    /* renamed from: a */
    public final C86199a f250747a;

    /* renamed from: b */
    public final C79946g.C79947a f250748b;

    /* renamed from: c */
    public final C79946g.C79947a f250749c;

    /* renamed from: d */
    public final C79944f.C79945a f250750d;

    /* renamed from: e */
    public final int f250751e;

    /* renamed from: f */
    public final C86205d.C86206a f250752f;

    public C86207e(C86199a aVar, C79946g.C79947a aVar2, C79946g.C79947a aVar3, C79944f.C79945a aVar4, int i, C86205d.C86206a aVar5) {
        this.f250747a = aVar;
        this.f250748b = aVar2;
        this.f250749c = aVar3;
        this.f250750d = aVar4;
        this.f250751e = i;
        this.f250752f = aVar5;
    }

    /* renamed from: a */
    public C86205d createDataSource() {
        C86202b bVar;
        C86199a aVar = this.f250747a;
        C79946g createDataSource = this.f250748b.createDataSource();
        C79946g createDataSource2 = this.f250749c.createDataSource();
        C79944f.C79945a aVar2 = this.f250750d;
        if (aVar2 != null) {
            C86204c cVar = (C86204c) aVar2;
            bVar = new C86202b(cVar.f250726a, cVar.f250727b, 20480);
        } else {
            bVar = null;
        }
        return new C86205d(aVar, createDataSource, createDataSource2, bVar, this.f250751e, this.f250752f);
    }
}
