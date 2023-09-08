package iu3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: iu3.a */
public class C117271a extends C117275e {

    /* renamed from: d */
    public ReentrantLock f351126d;

    /* renamed from: e */
    public final Condition f351127e;

    public C117271a(int i, int i2) {
        super(i, i2);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f351126d = reentrantLock;
        this.f351127e = reentrantLock.newCondition();
    }

    /* renamed from: b */
    public void mo181961b(C117277g gVar) {
        while (!mo181963a(gVar)) {
            try {
                this.f351126d.lock();
                this.f351127e.await();
                this.f351126d.unlock();
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                this.f351126d.unlock();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void mo181962c(C117277g gVar) {
        super.mo181962c(gVar);
        try {
            this.f351126d.lock();
            this.f351127e.signal();
        } finally {
            this.f351126d.unlock();
        }
    }
}
