package l80;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import lc3.C10485b;
import p625nu.C61903f;

/* renamed from: l80.c */
public abstract class C99347c<T> {

    /* renamed from: a */
    public T f291329a;

    /* renamed from: d */
    public T mo138761d() {
        T g = mo137402g();
        C87412m.m108594g(g, "<set-?>");
        this.f291329a = g;
        mo137403h();
        return mo138762e();
    }

    /* renamed from: e */
    public final T mo138762e() {
        T t = this.f291329a;
        if (t != null) {
            return t;
        }
        C87412m.m108603p("elementConfig");
        throw null;
    }

    /* renamed from: f */
    public int mo138763f(String str, int i) {
        C87412m.m108594g(str, "key");
        return MMApplicationContext.isMMProcess() ? Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str), i) : Util.getInt(((C61903f) C86312j.m106911c(C61903f.class)).x00().getDynamicConfig(str), i);
    }

    /* renamed from: g */
    public abstract T mo137402g();

    /* renamed from: h */
    public abstract void mo137403h();
}
