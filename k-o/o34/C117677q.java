package o34;

import l34.C117453e;
import l34.C117456i;
import l34.C117458j;

/* renamed from: o34.q */
public final class C117677q<T> implements C117453e.C88376a<T> {

    /* renamed from: d */
    public final C117456i f351981d;

    /* renamed from: e */
    public final C117453e<T> f351982e;

    public C117677q(C117453e<T> eVar, C117456i iVar) {
        this.f351981d = iVar;
        this.f351982e = eVar;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117456i.C117457a createWorker = this.f351981d.createWorker();
        jVar.mo182166e(createWorker);
        createWorker.mo182162b(new C117673p(this, jVar, createWorker));
    }
}
