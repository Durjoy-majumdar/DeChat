package bi1;

import gy3.C8480h;
import java.util.concurrent.CancellationException;
import q40.C12040d;

/* renamed from: bi1.a */
public final class C0280a {

    /* renamed from: a */
    public final C12040d f841a;

    /* renamed from: b */
    public final CancellationException f842b;

    public C0280a() {
        this((C12040d) null, (CancellationException) null, 3, (C8480h) null);
    }

    public C0280a(C12040d dVar, CancellationException cancellationException, int i, C8480h hVar) {
        dVar = (i & 1) != 0 ? null : dVar;
        cancellationException = (i & 2) != 0 ? null : cancellationException;
        this.f841a = dVar;
        this.f842b = cancellationException;
    }

    public String toString() {
        String dVar;
        C12040d dVar2 = this.f841a;
        if (dVar2 != null && (dVar = dVar2.toString()) != null) {
            return dVar;
        }
        return "cancelException: " + this.f842b;
    }
}
