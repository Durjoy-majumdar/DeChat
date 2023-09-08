package fj0;

import cj0.C80039a;
import dj0.C86327d;
import java.io.IOException;
import l34.C117453e;
import l34.C117458j;

/* renamed from: fj0.b */
public class C86873b implements C117453e.C88376a<Void> {

    /* renamed from: d */
    public final /* synthetic */ C86327d f252163d;

    public C86873b(C86875d dVar, C86327d dVar2) {
        this.f252163d = dVar2;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        try {
            if (C86905t.f252229d == null) {
                synchronized (C86875d.class) {
                    if (C86905t.f252229d == null) {
                        C86905t.f252229d = new C86905t(true);
                    }
                }
            }
            C86905t.f252229d.mo121354b(this.f252163d);
            jVar.mo122780a();
        } catch (IOException e) {
            jVar.onError(e.getCause());
            C80039a.m97318c("DlnaRepositoryImpl", e, "");
        }
    }
}
