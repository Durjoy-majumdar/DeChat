package o34;

import l34.C117456i;
import l34.C117458j;
import m34.C117527b;
import n34.C117603a;

/* renamed from: o34.i */
public class C117664i implements C117603a {

    /* renamed from: d */
    public long f351937d;

    /* renamed from: e */
    public final /* synthetic */ C117458j f351938e;

    /* renamed from: f */
    public final /* synthetic */ C117456i.C117457a f351939f;

    public C117664i(C117665j jVar, C117458j jVar2, C117456i.C117457a aVar) {
        this.f351938e = jVar2;
        this.f351939f = aVar;
    }

    public void call() {
        try {
            C117458j jVar = this.f351938e;
            long j = this.f351937d;
            this.f351937d = 1 + j;
            jVar.mo122781b(Long.valueOf(j));
        } catch (Throwable th) {
            C117527b.m165775c(th, this.f351938e);
            throw th;
        }
    }
}
