package hc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C21071j;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kc0.C99120a;
import zt3.C103084e;
import zt3.C119143b;

/* renamed from: hc0.a */
public class C98334a {

    /* renamed from: hc0.a$a */
    public static class C98335a extends C119143b implements C21071j {

        /* renamed from: t */
        public boolean f288232t;

        /* renamed from: u */
        public ReentrantLock f288233u;

        /* renamed from: v */
        public Condition f288234v;

        /* renamed from: w */
        public BlockingQueue<Runnable> f288235w;

        public C98335a(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue, C103084e eVar) {
            super(str, i, i2, blockingQueue, eVar);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f288233u = reentrantLock;
            this.f288234v = reentrantLock.newCondition();
            this.f288235w = blockingQueue;
        }

        /* renamed from: b */
        public void mo72173b(Runnable runnable, Throwable th) {
        }

        /* renamed from: c */
        public void mo72174c(Thread thread, Runnable runnable) {
            this.f288233u.lock();
            while (this.f288232t) {
                try {
                    this.f288234v.await();
                } catch (Exception e) {
                    thread.interrupt();
                    Log.m105929w("MicroMsg.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", e.toString());
                } catch (Throwable th) {
                    this.f288233u.unlock();
                    throw th;
                }
            }
            this.f288233u.unlock();
        }

        /* renamed from: e */
        public boolean mo32790e() {
            return this.f288232t;
        }

        public void execute(Runnable runnable) {
            super.execute(runnable);
        }

        public boolean isShutdown() {
            return super.isShutdown();
        }

        public void pause() {
            this.f288233u.lock();
            try {
                this.f288232t = true;
            } finally {
                this.f288233u.unlock();
            }
        }

        public void remove(Object obj) {
            BlockingQueue<Runnable> blockingQueue = this.f288235w;
            if (blockingQueue != null) {
                blockingQueue.remove(obj);
            }
        }

        public void resume() {
            this.f288233u.lock();
            try {
                this.f288232t = false;
                this.f288234v.signalAll();
            } finally {
                this.f288233u.unlock();
            }
        }
    }

    /* renamed from: a */
    public static C21071j m127117a(int i, int i2) {
        return new C98335a("image_loader_default", i, i, new C99120a(), (C103084e) null);
    }
}
