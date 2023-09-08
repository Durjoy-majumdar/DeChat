package com.tencent.p014mm.plugin.ting.jni.cleaner;

import com.tencent.p014mm.plugin.ting.jni.cleaner.CleanerImpl;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.Cleaner */
public final class Cleaner {
    public final CleanerImpl impl = new CleanerImpl();

    /* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.Cleaner$Cleanable */
    public interface Cleanable {
        void clean();
    }

    static {
        CleanerImpl.setCleanerImplAccess(new Cleaner$$a());
    }

    private Cleaner() {
    }

    public static Cleaner create() {
        Cleaner cleaner = new Cleaner();
        cleaner.impl.start(cleaner);
        return cleaner;
    }

    public Cleanable register(Object obj, Runnable runnable) {
        Objects.requireNonNull(obj, "obj");
        Objects.requireNonNull(runnable, "action");
        return new CleanerImpl.PhantomCleanableRef(obj, this, runnable);
    }

    public static Cleaner create(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory");
        Cleaner cleaner = new Cleaner();
        cleaner.impl.start(cleaner);
        return cleaner;
    }
}
