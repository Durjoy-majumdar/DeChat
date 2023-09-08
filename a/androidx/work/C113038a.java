package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p1014o4.C117689i;
import p1014o4.C117690j;
import p1014o4.C117703s;
import p1014o4.C117707x;
import p1014o4.C117708y;
import p1014o4.C89115b;
import p1206p4.C117968a;

/* renamed from: androidx.work.a */
public final class C113038a {

    /* renamed from: a */
    public final Executor f338344a = mo165520a(false);

    /* renamed from: b */
    public final Executor f338345b = mo165520a(true);

    /* renamed from: c */
    public final C117708y f338346c;

    /* renamed from: d */
    public final C117690j f338347d;

    /* renamed from: e */
    public final C117703s f338348e;

    /* renamed from: f */
    public final int f338349f;

    /* renamed from: g */
    public final int f338350g;

    /* renamed from: h */
    public final int f338351h;

    /* renamed from: androidx.work.a$a */
    public static final class C113039a {
    }

    /* renamed from: androidx.work.a$b */
    public interface C113040b {
        /* renamed from: a */
        C113038a mo165521a();
    }

    public C113038a(C113039a aVar) {
        aVar.getClass();
        String str = C117708y.f352034a;
        this.f338346c = new C117707x();
        this.f338347d = new C117689i();
        this.f338348e = new C117968a();
        this.f338349f = 4;
        this.f338350g = Integer.MAX_VALUE;
        this.f338351h = 20;
    }

    /* renamed from: a */
    public final Executor mo165520a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C89115b(this, z));
    }
}
