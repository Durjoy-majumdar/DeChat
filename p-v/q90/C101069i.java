package q90;

import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C101611g;
import p823sg.C101614i;
import q90.C101061b;

/* renamed from: q90.i */
public abstract class C101069i<T, V extends C101061b<T>> implements C62585c<T, V> {

    /* renamed from: a */
    public C101614i<T, V> f295881a;

    /* renamed from: b */
    public C101611g<T, V> f295882b = null;

    /* renamed from: c */
    public C101060a f295883c;

    /* renamed from: d */
    public C101611g.C101612b<T, V> f295884d;

    /* renamed from: e */
    public C101611g.C101613c<T, V> f295885e;

    public C101069i(C101060a aVar, C101611g.C101612b<T, V> bVar, C101611g.C101613c<T, V> cVar) {
        this.f295883c = aVar;
        this.f295884d = bVar;
        this.f295885e = cVar;
        this.f295881a = new C101614i<>(aVar.f295869a, new C101065e(this), new C101066f(this));
        this.f295882b = new C101614i((int) (((double) this.f295883c.f295869a) * 0.3d), new C101067g(this), new C101068h(this));
    }

    /* renamed from: a */
    public void mo140531a(double d) {
        double d2 = d + 1.0d;
        Log.m105925i("MicroMsg.UsageLruMap", "growMaxSize %s and old %s  result %s", Double.valueOf(d), Integer.valueOf(this.f295883c.f295869a), Integer.valueOf((int) (((double) this.f295883c.f295869a) * d2)));
        this.f295881a.setMaxSize((int) (((double) this.f295883c.f295869a) * d2));
    }

    /* renamed from: b */
    public abstract T mo140123b(T t, T t2);
}
