package nu3;

import java.util.Objects;
import java.util.concurrent.Future;
import zt3.C119157j;

/* renamed from: nu3.d */
public enum C11276d implements C117639a {
    INSTANCE;

    /* renamed from: a */
    public Future<?> mo11331a(Runnable runnable) {
        return ((C119157j) C119157j.f356862d).mo183895z(runnable);
    }

    public Future<?> execute(Runnable runnable) {
        C119157j jVar = (C119157j) C119157j.f356862d;
        jVar.getClass();
        Objects.requireNonNull(runnable);
        return jVar.mo183878i(runnable, 0);
    }
}
