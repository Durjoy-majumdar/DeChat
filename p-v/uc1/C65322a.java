package uc1;

import a14.C53939q1;
import java.util.concurrent.LinkedBlockingQueue;
import zt3.C119143b;
import zt3.C119157j;

/* renamed from: uc1.a */
public final class C65322a {

    /* renamed from: a */
    public static final C119143b f188001a;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        new C53939q1(((C119157j) C119157j.f356862d).mo183882m("FinderCoroutineDispatcher", availableProcessors, availableProcessors, new LinkedBlockingQueue()));
        f188001a = ((C119157j) C119157j.f356862d).mo183882m("FinderAsyncExecutor", availableProcessors, availableProcessors * 2, new LinkedBlockingQueue());
    }
}
