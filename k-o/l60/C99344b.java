package l60;

import com.tencent.p014mm.loader.cache.memory.C92699b;
import gy3.C87412m;
import k60.C60978b;
import k60.C99102f;
import n60.C100074e;
import n60.C100075f;
import r60.C101342d;
import s60.C101535a;
import s60.C101536b;
import t60.C101723d;
import t60.C13831b;
import t60.C64205a;
import t60.C64206c;
import t60.C64207e;
import w60.C65941g;
import x60.C102564a;

/* renamed from: l60.b */
public abstract class C99344b<T, R> implements C60978b<T, R> {

    /* renamed from: a */
    public C102564a<T> f291317a;

    /* renamed from: b */
    public C100074e<T, R> f291318b;

    /* renamed from: c */
    public C100075f f291319c;

    /* renamed from: d */
    public C64207e<T, R> f291320d;

    /* renamed from: e */
    public C101723d f291321e;

    /* renamed from: f */
    public C64206c<T> f291322f;

    /* renamed from: g */
    public C13831b f291323g;

    /* renamed from: h */
    public C64205a f291324h;

    /* renamed from: i */
    public C101535a<R> f291325i;

    /* renamed from: j */
    public C101342d<R> f291326j;

    public C99344b(C102564a<T> aVar, C100074e<T, R> eVar) {
        C87412m.m108594g(aVar, "reqValue");
        C87412m.m108594g(eVar, "mImageLoaderConfiguration");
        this.f291317a = aVar;
        this.f291318b = eVar;
    }

    /* renamed from: a */
    public void mo85951a() {
        C99102f fVar = new C99102f(this, this.f291318b);
        fVar.f290591t = fVar.f290572a.f291317a;
        fVar.mo138482b();
    }

    /* renamed from: b */
    public C60978b<T, R> mo85952b(C64207e<T, R> eVar) {
        C87412m.m108594g(eVar, "imageLoaderListener");
        this.f291320d = eVar;
        return this;
    }

    /* renamed from: c */
    public abstract void mo85953c();

    /* renamed from: e */
    public R mo138757e() {
        if (this.f291319c == null) {
            this.f291318b.mo139384j();
        }
        C92699b<T, R> n = this.f291318b.mo139388n();
        C102564a<T> aVar = this.f291317a;
        C101535a<R> aVar2 = this.f291325i;
        if (aVar2 == null) {
            aVar2 = this.f291318b.mo132665r();
        }
        C65941g<R> a = n.mo126884a(aVar, aVar2);
        if (a != null) {
            return a.f189590a;
        }
        return null;
    }

    /* renamed from: f */
    public C60978b<T, R> mo138758f(C100075f fVar) {
        C87412m.m108594g(fVar, "options");
        this.f291319c = fVar;
        return this;
    }

    /* renamed from: g */
    public final C60978b<T, R> mo138759g(C101536b<R> bVar) {
        C87412m.m108594g(bVar, "_transcoder");
        C101535a<R> aVar = this.f291325i;
        if (aVar == null) {
            this.f291325i = new C101535a<>(bVar);
        } else if (aVar != null) {
            aVar.mo141015c(bVar);
        }
        return this;
    }
}
