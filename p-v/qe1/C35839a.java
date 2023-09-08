package qe1;

import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: qe1.a */
public class C35839a<T> implements C35841c {

    /* renamed from: a */
    public final T f95664a;

    /* renamed from: b */
    public final String f95665b;

    /* renamed from: c */
    public C32224a<C13598b0> f95666c;

    /* renamed from: d */
    public T f95667d;

    public C35839a(T t, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "name");
        this.f95664a = t;
        this.f95665b = str;
        this.f95666c = aVar;
    }

    /* renamed from: a */
    public void mo60440a() {
        C32224a<C13598b0> aVar = this.f95666c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public void mo60441b() {
    }

    /* renamed from: c */
    public T mo60442c() {
        T t = this.f95667d;
        return t == null ? this.f95664a : t;
    }

    public String toString() {
        return "name " + this.f95665b + " value " + this.f95667d + " dummyValue " + this.f95664a;
    }
}
