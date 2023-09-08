package fj0;

import cj0.C80039a;
import dj0.C86328e;
import hj0.C87535e;
import java.io.IOException;
import l34.C117453e;
import l34.C117458j;

/* renamed from: fj0.c */
public class C86874c implements C117453e.C88376a<C87535e> {

    /* renamed from: d */
    public final /* synthetic */ C86328e f252164d;

    public C86874c(C86875d dVar, C86328e eVar) {
        this.f252164d = eVar;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        try {
            jVar.mo122781b(new C86905t(false).mo121353a(this.f252164d));
            jVar.mo122780a();
        } catch (IOException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new Throwable("Error msg: " + e.toString());
            }
            jVar.onError(cause);
            C80039a.m97318c("DlnaRepositoryImpl", e, "");
        }
    }
}
