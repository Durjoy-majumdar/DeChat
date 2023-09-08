package yq0;

import java.util.Locale;
import lp3.C88631d;
import yq0.C91548e;

/* renamed from: yq0.g */
public class C91557g implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ String f262390a;

    /* renamed from: b */
    public final /* synthetic */ String f262391b;

    /* renamed from: c */
    public final /* synthetic */ C91548e f262392c;

    public C91557g(C91548e eVar, String str, String str2) {
        this.f262392c = eVar;
        this.f262390a = str;
        this.f262391b = str2;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        C91548e.f262377e.mo122465f(this.f262390a, this.f262391b);
        C91548e.C91554e eVar = this.f262392c.f262378a;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        objArr[0] = obj == null ? "" : obj.toString();
        ((C91548e.C91549a) eVar).mo115868b(String.format(locale, "cgi failed %s", objArr));
    }
}
