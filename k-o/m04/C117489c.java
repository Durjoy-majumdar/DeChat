package m04;

import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: m04.c */
public class C117489c implements C24977k {

    /* renamed from: b */
    public final Lock f351594b;

    public C117489c(Lock lock) {
        C87412m.m108594g(lock, "lock");
        this.f351594b = lock;
    }

    public void lock() {
        this.f351594b.lock();
    }

    public void unlock() {
        this.f351594b.unlock();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C117489c(Lock lock, int i, C8480h hVar) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
