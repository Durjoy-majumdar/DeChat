package dm2;

import android.content.Intent;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: dm2.e */
public class C45422e<T extends C47465a> implements C45425h<T> {

    /* renamed from: a */
    public final Class<T> f122944a;

    /* renamed from: b */
    public final int f122945b;

    /* renamed from: c */
    public final C13601g f122946c = C36568h.m40985a(new C45423a(this));

    /* renamed from: dm2.e$a */
    public static final class C45423a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C45422e<T> f122947d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45423a(C45422e<T> eVar) {
            super(0);
            this.f122947d = eVar;
        }

        public Object invoke() {
            return (C47465a) this.f122947d.f122944a.newInstance();
        }
    }

    public C45422e(Class<T> cls, int i) {
        C87412m.m108594g(cls, "clazz");
        this.f122944a = cls;
        this.f122945b = i;
    }

    /* renamed from: a */
    public boolean mo70912a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo70913b(Intent intent) {
        return false;
    }

    /* renamed from: c */
    public T mo70914c() {
        T t = (C47465a) ((C36570n) this.f122946c).getValue();
        C87412m.m108593f(t, "data");
        return t;
    }

    public int getType() {
        return this.f122945b;
    }
}
