package androidx.lifecycle;

import a14.C0000n0;
import a14.C53873d2;
import gy3.C87412m;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import wx3.C66212f;

/* renamed from: androidx.lifecycle.c */
public final class C54203c implements Closeable, C0000n0 {

    /* renamed from: d */
    public final C66212f f152168d;

    public C54203c(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        this.f152168d = fVar;
    }

    public void close() {
        C53873d2.m60390b(this.f152168d, (CancellationException) null);
    }

    public C66212f getCoroutineContext() {
        return this.f152168d;
    }
}
