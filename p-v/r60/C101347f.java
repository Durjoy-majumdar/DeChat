package r60;

import java.util.Map;
import rx3.C13604l;
import x60.C102564a;

/* renamed from: r60.f */
public final class C101347f implements C101340b {

    /* renamed from: a */
    public final /* synthetic */ C101344e f296890a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry<Integer, C13604l<C102564a<?>, C101342d<Object>>> f296891b;

    /* renamed from: c */
    public final /* synthetic */ C102564a<?> f296892c;

    public C101347f(C101344e eVar, Map.Entry<Integer, ? extends C13604l<? extends C102564a<?>, ? extends C101342d<Object>>> entry, C102564a<?> aVar) {
        this.f296890a = eVar;
        this.f296891b = entry;
        this.f296892c = aVar;
    }

    /* renamed from: a */
    public void mo138483a(boolean z) {
        if (z) {
            this.f296890a.mo140835a((C101342d) this.f296891b.getValue().f38556e, this.f296892c, "onDataItemLoadEnd");
        }
    }
}
