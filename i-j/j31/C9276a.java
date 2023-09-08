package j31;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: j31.a */
public final class C9276a {

    /* renamed from: b */
    public static final C9278b f29023b = new C9278b((C8480h) null);

    /* renamed from: c */
    public static final C13601g<C9276a> f29024c = C36568h.m40985a(C9277a.f29026d);

    /* renamed from: a */
    public final ConcurrentHashMap<Object, C117294b<?, ?>> f29025a = new ConcurrentHashMap<>();

    /* renamed from: j31.a$a */
    public static final class C9277a extends C87413o implements C32224a<C9276a> {

        /* renamed from: d */
        public static final C9277a f29026d = new C9277a();

        public C9277a() {
            super(0);
        }

        public Object invoke() {
            return new C9276a();
        }
    }

    /* renamed from: j31.a$b */
    public static final class C9278b {
        public C9278b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C9276a mo10053a() {
            return (C9276a) ((C36570n) C9276a.f29024c).getValue();
        }
    }

    /* renamed from: a */
    public final <_key, _value> C117294b<_key, _value> mo10052a(Object obj) {
        C87412m.m108594g(obj, "key");
        C117294b<?, ?> bVar = this.f29025a.get(obj);
        if (bVar instanceof C117294b) {
            return bVar;
        }
        return null;
    }
}
