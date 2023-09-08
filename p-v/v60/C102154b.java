package v60;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import u60.C65219a;
import zt3.C119143b;

/* renamed from: v60.b */
public class C102154b extends C119143b implements C65219a {

    /* renamed from: t */
    public ReentrantLock f300812t;

    public C102154b(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue) {
        super(str, i, i2, blockingQueue);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f300812t = reentrantLock;
        reentrantLock.newCondition();
    }

    /* renamed from: c */
    public void mo72174c(Thread thread, Runnable runnable) {
        this.f300812t.lock();
        this.f300812t.unlock();
    }

    public void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
