package com.tencent.p014mm.plugin.ting.jni.cleaner;

import com.tencent.p014mm.plugin.ting.jni.cleaner.Cleaner;
import java.lang.ref.ReferenceQueue;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import nu3.C117640b;

/* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.CleanerImpl */
public final class CleanerImpl implements Runnable {
    private static Function<Cleaner, CleanerImpl> cleanerImplAccess;
    public final PhantomCleanable<?> phantomCleanableList = new PhantomCleanableRef();
    public final ReferenceQueue<Object> queue = new ReferenceQueue<>();

    /* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.CleanerImpl$CleanerCleanable */
    public static final class CleanerCleanable extends PhantomCleanable<Cleaner> {
        public CleanerCleanable(Cleaner cleaner) {
            super(cleaner, cleaner);
        }

        public void performCleanup() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.CleanerImpl$InnocuousThreadFactory */
    public static final class InnocuousThreadFactory implements ThreadFactory {
        public static final ThreadFactory factory = new InnocuousThreadFactory();
        public final AtomicInteger cleanerThreadNumber = new AtomicInteger();

        public static ThreadFactory factory() {
            return factory;
        }

        public Thread newThread(final Runnable runnable) {
            return (Thread) AccessController.doPrivileged(new PrivilegedAction<Thread>() {
                public Thread run() {
                    Thread thread = new Thread(runnable);
                    thread.setPriority(8);
                    thread.setName("Cleaner-" + InnocuousThreadFactory.this.cleanerThreadNumber.getAndIncrement());
                    return thread;
                }
            });
        }
    }

    public static CleanerImpl getCleanerImpl(Cleaner cleaner) {
        return cleanerImplAccess.apply(cleaner);
    }

    public static void setCleanerImplAccess(Function<Cleaner, CleanerImpl> function) {
        if (cleanerImplAccess == null) {
            cleanerImplAccess = function;
            return;
        }
        throw new InternalError("cleanerImplAccess");
    }

    public void run() {
        while (!this.phantomCleanableList.isListEmpty()) {
            try {
                Cleaner.Cleanable cleanable = (Cleaner.Cleanable) this.queue.remove(60000);
                if (cleanable != null) {
                    cleanable.clean();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void start(Cleaner cleaner) {
        if (getCleanerImpl(cleaner) == this) {
            C117640b.f351893a.execute(this);
            return;
        }
        throw new AssertionError("wrong cleaner");
    }

    /* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.CleanerImpl$PhantomCleanableRef */
    public static final class PhantomCleanableRef extends PhantomCleanable<Object> {
        private final Runnable action;

        public PhantomCleanableRef(Object obj, Cleaner cleaner, Runnable runnable) {
            super(obj, cleaner);
            this.action = runnable;
        }

        public void clear() {
            throw new UnsupportedOperationException("clear");
        }

        public Object get() {
            throw new UnsupportedOperationException("get");
        }

        public void performCleanup() {
            this.action.run();
        }

        public PhantomCleanableRef() {
            this.action = null;
        }
    }
}
