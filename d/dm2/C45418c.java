package dm2;

import android.content.Intent;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: dm2.c */
public class C45418c<T extends C47465a> implements C45425h<T> {

    /* renamed from: a */
    public final Class<T> f122937a;

    /* renamed from: b */
    public final int f122938b;

    /* renamed from: c */
    public final C13601g f122939c = C36568h.m40985a(new C45419a(this));

    /* renamed from: dm2.c$a */
    public static final class C45419a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C45418c<T> f122940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45419a(C45418c<T> cVar) {
            super(0);
            this.f122940d = cVar;
        }

        public Object invoke() {
            return (C47465a) this.f122940d.f122937a.newInstance();
        }
    }

    public C45418c(Class<T> cls, int i, boolean z) {
        C87412m.m108594g(cls, "clazz");
        this.f122937a = cls;
        this.f122938b = i;
    }

    /* renamed from: a */
    public boolean mo70912a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo70913b(Intent intent) {
        return true;
    }

    /* renamed from: c */
    public T mo70914c() {
        T t = (C47465a) ((C36570n) this.f122939c).getValue();
        C87412m.m108593f(t, "data");
        return t;
    }

    public int getType() {
        return this.f122938b;
    }
}
